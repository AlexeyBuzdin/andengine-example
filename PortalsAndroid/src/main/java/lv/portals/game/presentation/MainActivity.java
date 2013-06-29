package lv.portals.game.presentation;

import lv.portals.game.R;
import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.WakeLockOptions;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.ui.activity.BaseGameActivity;

public class MainActivity extends BaseGameActivity {

    private static final int WIDTH = 720;
    private static final int HEIGHT = 480;

    private Scene scene;

    @Override
    public Engine onLoadEngine() {
        Camera camera = new Camera(0, 0, WIDTH, HEIGHT);

        EngineOptions engineOptions = new EngineOptions(true, EngineOptions.ScreenOrientation.LANDSCAPE, new RatioResolutionPolicy(WIDTH, HEIGHT), camera);
        engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);

        return new Engine(engineOptions);
    }

    @Override
    public void onLoadResources() {

    }

    @Override
    public Scene onLoadScene() {
        scene = new Scene();
        scene.setBackground(new ColorBackground(0.05804f, 0.1274f, 0.3784f));

        return scene;
    }

    @Override
    public void onLoadComplete() {

    }

    public int get1(){
        return 1;
    }

    public String getAppName() {
        return getResources().getString(R.string.app_name);
    }
}
