package com.engagepoint.labs.core.dao;

/**
 * User: r.reznichenko
 * Date: 6/17/13
 * Time: 2:53 PM
 */

import com.engagepoint.labs.core.models.FSFile;
import com.engagepoint.labs.core.models.FSFolder;
import com.engagepoint.labs.core.models.FSObject;
import com.engagepoint.labs.core.models.exceptions.BaseException;
import com.engagepoint.labs.core.models.exceptions.BrowserRuntimeException;
import com.engagepoint.labs.core.models.exceptions.FolderAlreadyExistException;
import com.engagepoint.labs.core.models.exceptions.FolderNotFoundException;
import org.apache.chemistry.opencmis.client.api.Session;

import java.util.List;
import java.util.Map;

public interface FSFolderDao {

    /**
     * Connect to repository
     *
     * @param session - session
     */
    public void setSession(Session session);

    /**
     * Create new folder in parent folder
     *
     * @param parent     - folder in which you want create new folder
     * @param folderName - name of folder which you want create
     * @return created folder, FSFolder type
     */
    public FSFolder create(FSFolder parent, String folderName) throws BaseException;

    /**
     * Get all children from parent folder
     *
     * @param parent - folder in which you want get children
     * @return - list of FSObject files
     */
    public List<FSObject> getChildren(FSFolder parent) throws BaseException;

    /**
     * Method that will delete folder from repository
     *
     * @param folder - folder which you want to delete
     * @return <b>true</b> if deleted
     */
    public boolean delete(FSFolder folder);

    public boolean deleteAllTree(FSFolder folder) throws FolderNotFoundException;

    /**
     * Method that will rename folder
     *
     * @param folder  - folder which you want rename
     * @param newName - new name of folder
     * @return renamed folder
     */
    public FSFolder rename(FSFolder folder, String newName) throws BaseException;

    /**
     * @return root folder
     */
    public FSFolder getRoot();

    /**
     * @return reference to FSFileDao
     */
    public FSFileDao getFsFileDao();

    public Map<String, Object> getPageForLazy(FSFolder parent, int first, int pageSize) throws BaseException;

    public boolean hasChildFolder(FSFolder folder) throws BaseException;

    public boolean hasChildren(FSFolder folder) throws BaseException;

    public void move(FSFolder source, FSFolder target) throws BrowserRuntimeException;

    public void move(FSFile source) throws BrowserRuntimeException;

    public void copyFolder(FSFolder folder, String name, String targetId) throws FolderAlreadyExistException;

    public Map<String, Object> find(int first, int pageSize, String query, FSObject parent);

    public Map<String, Object> find(int first, int pageSize, Map<Integer, Object> query, FSObject parent);

}