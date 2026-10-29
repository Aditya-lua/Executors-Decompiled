package sg;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p616lifecycle.C0959h0;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p151gk.C6130w;
import th.C11659h;

/* JADX INFO: renamed from: sg.s */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lsg/s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "", "a", "(Landroid/content/Context;)V", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11352s {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11352s f40039a = new C11352s();

    /* JADX INFO: renamed from: sg.s$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"sg/s$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0954f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f40040a;

        public a(Context context) {
            this.f40040a = context;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onDestroy(InterfaceC0980s interfaceC0980s) {
            super.onDestroy(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onResume(InterfaceC0980s interfaceC0980s) {
            super.onResume(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            C11352s.m42522a(this.f40040a);
            C0959h0.INSTANCE.m4917a().mo4656a().mo4938d(this);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m42522a(@NotNull Context context) {
        SharedPreferences sharedPreferencesM42422U;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C11659h.m43403a().mo43657j4() || (string = (sharedPreferencesM42422U = C11295a1.m42422U(context)).getString("channel", "")) == null || string.length() == 0) {
            return;
        }
        Intrinsics.checkNotNull(sharedPreferencesM42422U);
        SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
        editorEdit.remove("channel");
        editorEdit.apply();
        C6124q.m27063h("ChannelUtils", "Burned channel preference: " + string);
    }

    /* JADX INFO: renamed from: b */
    public static final void m42523b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C11659h.m43403a().mo43657j4()) {
            C0959h0.INSTANCE.m4917a().mo4656a().mo4935a(new a(context));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m42524c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C11659h.m43403a().mo43657j4() || Intrinsics.m31980c(C6130w.m27099a(context), "foreground")) {
            return true;
        }
        C6124q.m27063h("ChannelUtils", "Background launch detected, skipping channel burn");
        return false;
    }
}
