package com.engagepoint.labs.integration.jbehave.test.steps;

import com.engagepoint.labs.integration.jbehave.test.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * User: vitaliy.vasilenko
 * Date: 6/21/13
 * Time: 12:40 PM
 */
public class BrowserWebSteps {

    private final Pages pages;

    public BrowserWebSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("user is on Home page")
    public void userIsOnHomePage() {
        pages.index().open();
    }

    @Then("find title $title")
    public void findTitle(String title) {
        pages.index().found(title);
    }

    @Given("user is on Index page")
    public void userIsOnIndexPage() {
        pages.index().open();
    }

    @Then("Find text $title")
    public void findText(String title) {
        pages.index().found(title);
    }

    @When("user clicks tree root")
    public void userClickTreeRoot() {
        pages.index().treeClick();
    }

    @Then("node $node is found")
    public void treeNodeIsSelected(String node) {
        pages.index().found(node);
    }

    @Then("root is selected")
    public void treeRootSelected() {
        pages.index().treeClickCheck();
    }

    @Then("user create new folder")
    public void userCreateNewFolder() {
        pages.index().createNewFolder();
    }

    @Then("user create folder and clicks cancel")
    public void createFolderAndClickCancel() {
        pages.index().createFolderAndClickCancel();
    }

    @When("user clicks root expand")
    public void userClickRootChild() {
        pages.index().treeExpand();
    }

    @Then("root is expanded")
    public void treeRootChildSelected() {
        pages.index().treeExpandCheck();
    }

    @Then("user delete CreateJBehaveFolder folder")
    public void deleteFolder() {
        pages.index().deleteFolder();
    }

    @Then("user clicks delete button for folder")
    public void userClickDeleteButtonForFolder() {
        pages.index().deleteButtonClickForFolder();

    }

    @Then("user clicks cancel button on delete folder page")
    public void userClickCancelButtonOnDeleteFolderPage() {
        pages.index().cancelButtonClickOnDeleteFolderPage();
    }

    @When("user select tree node")
    public void userSelectTreeNode() {
        pages.index().selectTreeNode();
    }

}