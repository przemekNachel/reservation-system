package controller;

import view.getHtml;

public class Login extends Service {

    @Override
    void handleGetFromValidatedUser() {
        redirectTo("/");
    }

    @Override
    void handleGetFromUnvalidatedUser() {
        setResponse(getHtml.form);
    }

    @Override
    void handlePostFromValidatedUser() {
        redirectTo("/");
    }

    @Override
    void handlePostFromUnvalidatedUser() {
        setResponse(getHtml.badCredentials);
    }
}