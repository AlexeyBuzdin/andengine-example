package lv.portals.game.presentation;

import lv.portals.game.R;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.bitmap.BitmapTexture;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TextureRegionFactory;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.adt.io.in.IInputStreamOpener;
import org.andengine.util.debug.Debug;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends SimpleBaseGameActivity {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 480;
    private TextureRegion mBackgroundTextureRegion;

    @Override
    public EngineOptions onCreateEngineOptions() {
        final Camera camera = new Camera(0, 0, WIDTH, HEIGHT);
        return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(WIDTH, HEIGHT), camera);
    }

    @Override
    protected void onCreateResources() {
        try {
            // 1 - Set up bitmap textures
            ITexture backgroundTexture = new BitmapTexture(this.getTextureManager(), new IInputStreamOpener() {
                @Override
                public InputStream open() throws IOException {
                    return getAssets().open("gfx/background.png");
                }
            });

            // 2 - Load bitmap textures into VRAM
            backgroundTexture.load();
            // 3 - Set up texture regions
            this.mBackgroundTextureRegion = TextureRegionFactory.extractFromTexture(backgroundTexture);
        } catch (IOException e) {
            Debug.e(e);
        }
    }

    @Override
    protected Scene onCreateScene() {
        // 1 - Create new scene
        final Scene scene = new Scene();
        Sprite backgroundSprite = new Sprite(0, 0, this.mBackgroundTextureRegion, getVertexBufferObjectManager());
        scene.attachChild(backgroundSprite);

        scene.setTouchAreaBindingOnActionDownEnabled(true);
        return scene;
    }


    public int get1(){
        return 1;
    }

    public String getAppName() {
        return getResources().getString(R.string.app_name);
    }
}
