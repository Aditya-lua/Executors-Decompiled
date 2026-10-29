package ar;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ar.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lar/g;", "", "Lar/h;", "viewBindings", "Landroid/view/View;", "contentView", "footerView", "<init>", "(Lar/h;Landroid/view/View;Landroid/view/View;)V", "a", "Lar/h;", "c", "()Lar/h;", "b", "Landroid/view/View;", "()Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1152g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1153h viewBindings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final View contentView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final View footerView;

    public C1152g(@NotNull C1153h viewBindings, @NotNull View contentView, @Nullable View view) {
        Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.viewBindings = viewBindings;
        this.contentView = contentView;
        this.footerView = view;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final View getContentView() {
        return this.contentView;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getFooterView() {
        return this.footerView;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1153h getViewBindings() {
        return this.viewBindings;
    }
}
