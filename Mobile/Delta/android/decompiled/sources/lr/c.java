package lr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import cr.k4;
import cr.y4;
import k6.h;
import k6.n;
import k6.s;
import k6.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wq.z;
import x6.ImageRequest;
import z6.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "", "url", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/google/android/material/textfield/TextInputLayout;", "leadingImageUrl", "", "h", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", "c", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "", "centerVertical", "Landroid/view/View;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"lr/c$a", "Lb7/c;", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements b7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f23537a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f23538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f23539d;

        public a(TextInputLayout textInputLayout, String str, TextInputLayout textInputLayout2, String str2) {
            this.f23537a = textInputLayout;
            this.b = str;
            this.f23538c = textInputLayout2;
            this.f23539d = str2;
        }

        @Override // b7.c
        public void a(n error) {
            TextInputLayout textInputLayout = this.f23537a;
            int i10 = ar.d.f3690q0;
            if (Intrinsics.c(textInputLayout.getTag(i10), this.b)) {
                this.f23537a.setTag(i10, null);
            }
        }

        @Override // b7.c
        public void b(n placeholder) {
        }

        @Override // b7.c
        public void c(n result) {
            if (Intrinsics.c(this.f23538c.getTag(ar.d.f3690q0), this.f23539d)) {
                this.f23538c.setStartIconTintList(null);
                TextInputLayout textInputLayout = this.f23538c;
                Resources resources = textInputLayout.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                textInputLayout.setStartIconDrawable(v.a(result, resources));
                this.f23538c.setStartIconVisible(true);
            }
        }
    }

    public static final void c(final TextInputLayout textInputLayout) {
        int i10 = ar.d.f3688p0;
        if (textInputLayout.getTag(i10) != null) {
            return;
        }
        textInputLayout.setTag(i10, Boolean.TRUE);
        textInputLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: lr.b
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return c.d(textInputLayout);
            }
        });
    }

    public static final boolean d(TextInputLayout textInputLayout) {
        if (textInputLayout.getStartIconDrawable() == null || textInputLayout.T()) {
            return true;
        }
        textInputLayout.setStartIconVisible(true);
        return false;
    }

    @NotNull
    public static final View e(@NotNull RemoteImage remoteImage, @NotNull ConstraintLayout container, boolean z10) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final y4 y4Var = new y4(context);
        View viewN = k4.n(com.withpersona.sdk2.inquiry.steps.ui.components.b.k(remoteImage), y4Var, remoteImage);
        container.addView(viewN);
        ViewGroup.LayoutParams layoutParams = viewN.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f1529i = 0;
        bVar.f1551t = 0;
        bVar.f1555v = 0;
        if (z10) {
            bVar.f1535l = 0;
        }
        viewN.setLayoutParams(bVar);
        z.b(container, new Function0() { // from class: lr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(y4Var);
            }
        });
        return viewN;
    }

    public static /* synthetic */ View f(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(remoteImage, constraintLayout, z10);
    }

    public static final Unit g(y4 y4Var) {
        y4Var.c();
        return Unit.f22483a;
    }

    public static final void h(@NotNull TextInputLayout textInputLayout, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.p0(str)) {
            str = null;
        }
        int i10 = ar.d.f3690q0;
        if (Intrinsics.c(textInputLayout.getTag(i10), str)) {
            return;
        }
        textInputLayout.setTag(i10, str);
        int i11 = ar.d.f3686o0;
        Object tag = textInputLayout.getTag(i11);
        x6.d dVar = tag instanceof x6.d ? (x6.d) tag : null;
        if (dVar != null) {
            dVar.a();
        }
        textInputLayout.setTag(i11, null);
        textInputLayout.setStartIconVisible(false);
        textInputLayout.setStartIconDrawable((Drawable) null);
        if (str == null) {
            return;
        }
        c(textInputLayout);
        Context context = textInputLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s.a aVar = new s.a(context);
        h.a aVar2 = new h.a();
        aVar2.g(new g.b(false, false, false, 7, null));
        s sVarD = aVar.h(aVar2.p()).d();
        Context context2 = textInputLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputLayout.setTag(i11, sVarD.c(new ImageRequest.a(context2).c(str).v(new a(textInputLayout, str, textInputLayout, str)).b()));
    }

    @NotNull
    public static final RemoteImage i(@NotNull RemoteImage remoteImage, @NotNull String url) {
        RemoteImage.ContentType contentType;
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String name = remoteImage.getName();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        String width = attributes != null ? attributes.getWidth() : null;
        String height = attributes != null ? attributes.getHeight() : null;
        if (attributes == null || (contentType = attributes.getContentType()) == null) {
            contentType = RemoteImage.ContentType.Image;
        }
        return new RemoteImage(name, new RemoteImage.Attributes(localAssetName, localAssetContentType, url, width, height, contentType, attributes != null ? attributes.getHidden() : null), remoteImage.getStyles());
    }
}
