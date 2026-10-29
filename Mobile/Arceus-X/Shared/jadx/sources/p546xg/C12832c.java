package p546xg;

import android.R;
import android.app.Activity;
import android.content.Intent;
import com.roblox.client.RobloxWebActivity;
import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6113f;
import sg.C11317g0;
import vg.C12173c0;

/* JADX INFO: renamed from: xg.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lxg/c;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "url", "", "a", "(Landroid/app/Activity;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12832c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12832c f45630a = new C12832c();

    /* JADX INFO: renamed from: a */
    public static final void m47766a(@NotNull Activity activity, @NotNull String url) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        C12173c0.m45032u(url);
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", C6113f.m27028c(url));
        intent.putExtra("TITLE_EXTRA", "");
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", true);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", false);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false);
        activity.startActivityForResult(intent, 20110);
        if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overridePendingTransition(C11317g0.f39699b, R.anim.fade_out);
        }
    }
}
