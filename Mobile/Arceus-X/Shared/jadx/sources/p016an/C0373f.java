package p016an;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: an.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lan/f;", "", "RenderingT", "Lan/a0;", "Lhu/c;", Payload.TYPE, "Lkotlin/Function4;", "Lan/y;", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "viewConstructor", "<init>", "(Lhu/c;Lzt/o;)V", "initialRendering", "initialViewEnvironment", "contextForNewView", "container", "a", "(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", "b", "Lzt/o;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0373f<RenderingT> implements InterfaceC0364a0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6567c<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14058o<RenderingT, ViewEnvironment, Context, ViewGroup, View> viewConstructor;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.o<? super RenderingT, ? super an.y, ? super android.content.Context, ? super android.view.ViewGroup, ? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0373f(@NotNull InterfaceC6567c<RenderingT> type, @NotNull InterfaceC14058o<? super RenderingT, ? super ViewEnvironment, ? super Context, ? super ViewGroup, ? extends View> viewConstructor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(viewConstructor, "viewConstructor");
        this.type = type;
        this.viewConstructor = viewConstructor;
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo1379a(@NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.viewConstructor.mo1397e(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<RenderingT> getType() {
        return this.type;
    }
}
