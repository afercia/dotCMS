package com.dotmarketing.portlets.linkchecker.business;

import java.util.List;

import com.dotmarketing.exception.DotDataException;
import com.dotmarketing.exception.DotSecurityException;
import com.dotmarketing.portlets.contentlet.model.Contentlet;
import com.dotmarketing.portlets.linkchecker.bean.InvalidLink;
import com.dotmarketing.portlets.structure.model.Field;
import com.liferay.portal.model.User;

public interface LinkCheckerAPI {
    List<InvalidLink> findInvalidLinks(Contentlet con) throws DotDataException, DotSecurityException;
    void saveInvalidLinks(Contentlet contentlet, List<InvalidLink> links) throws DotDataException, DotSecurityException;
    void deleteInvalidLinks(Contentlet contentlet) throws DotDataException, DotSecurityException;
    List<InvalidLink> findByInode(String inode) throws DotDataException;
    List<InvalidLink> findAll(int offset, int pageSize) throws DotDataException;
    int findAllCount() throws DotDataException;
}
