package com.nopalsoft.slamthebird.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nopalsoft.slamthebird.MainSlamBird;
import com.nopalsoft.slamthebird.handlers.GoogleGameServicesHandler;
import com.nopalsoft.slamthebird.handlers.RequestHandler;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Slam the bird";
        config.width = 480;
        config.height = 800;
        new LwjglApplication(new MainSlamBird(handler, gameHandler), config);
    }

    static RequestHandler handler = new RequestHandler() {

        @Override
        public void showRater() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showMoreGames() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showInterstitial() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showFacebook() {
            Gdx.net.openURI("https://www.facebook.com");
        }

        @Override
        public void showAdBanner() {
            // TODO Auto-generated method stub

        }

        @Override
        public void shareOnTwitter(String mensaje) {
            // TODO Auto-generated method stub

        }

        @Override
        public void shareOnFacebook(String mensaje) {
            // TODO Auto-generated method stub

        }

        @Override
        public void hideAdBanner() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy5milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy15milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy30milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy50milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void removeAds() {
            // TODO Auto-generated method stub

        }
    };

    static GoogleGameServicesHandler gameHandler = new GoogleGameServicesHandler() {

        @Override
        public void unlockAchievement(String achievementId) {
            // TODO Auto-generated method stub

        }

        @Override
        public void submitScore(long score) {
            // TODO Auto-generated method stub

        }

        @Override
        public void signOut() {
            // TODO Auto-generated method stub

        }

        @Override
        public void signIn() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isSignedIn() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void getLeaderboard() {
            // TODO Auto-generated method stub

        }

        @Override
        public void getAchievements() {
            // TODO Auto-generated method stub

        }
    };
}
