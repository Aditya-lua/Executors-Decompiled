package bh;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lbh/s;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "c", "(Landroid/content/Context;)Z", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f4303a = new s();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"bh/s$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onStart", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f4304a;

        public a(Context context) {
            this.f4304a = context;
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onDestroy(androidx.p000lifecycle.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onPause(androidx.p000lifecycle.s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onResume(androidx.p000lifecycle.s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            s.a(this.f4304a);
            androidx.p000lifecycle.h0.INSTANCE.a().a().d(this);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    public static final void a(@NotNull Context context) {
        SharedPreferences sharedPreferencesU;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!bi.h.a().s4() || (string = (sharedPreferencesU = a1.U(context)).getString("channel", BuildConfig.FLAVOR)) == null || string.length() == 0) {
            return;
        }
        Intrinsics.checkNotNull(sharedPreferencesU);
        SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
        editorEdit.remove("channel");
        editorEdit.apply();
        ok.q.h("ChannelUtils", "Burned channel preference: " + string);
    }

    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (bi.h.a().s4()) {
            androidx.p000lifecycle.h0.INSTANCE.a().a().a(new a(context));
        }
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!bi.h.a().s4() || Intrinsics.c(ok.w.a(context), "foreground")) {
            return true;
        }
        ok.q.h("ChannelUtils", "Background launch detected, skipping channel burn");
        return false;
    }
}
