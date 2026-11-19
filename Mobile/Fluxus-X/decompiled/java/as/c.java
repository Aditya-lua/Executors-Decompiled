package as;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.g;
import kr.a0;
import l6.h;
import l6.n;
import l6.s;
import l6.v;
import or.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import qr.d5;
import qr.z5;
import y6.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", BuildConfig.FLAVOR, "url", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/google/android/material/textfield/TextInputLayout;", "leadingImageUrl", BuildConfig.FLAVOR, "h", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", "c", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", BuildConfig.FLAVOR, "centerVertical", "Landroid/view/View;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"as/c$a", "Lc7/c;", "Ll6/n;", "placeholder", BuildConfig.FLAVOR, "b", "(Ll6/n;)V", "error", "c", "result", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f3331a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f3332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3333d;

        public a(TextInputLayout textInputLayout, String str, TextInputLayout textInputLayout2, String str2) {
            this.f3331a = textInputLayout;
            this.b = str;
            this.f3332c = textInputLayout2;
            this.f3333d = str2;
        }

        @Override // c7.c
        public void a(n result) {
            if (Intrinsics.c(this.f3332c.getTag(f.f28444q0), this.f3333d)) {
                this.f3332c.setStartIconTintList(null);
                TextInputLayout textInputLayout = this.f3332c;
                Resources resources = textInputLayout.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                textInputLayout.setStartIconDrawable(v.a(result, resources));
                this.f3332c.setStartIconVisible(true);
            }
        }

        @Override // c7.c
        public void b(n placeholder) {
        }

        @Override // c7.c
        public void c(n error) {
            if (Intrinsics.c(this.f3331a.getTag(f.f28444q0), this.b)) {
                this.f3331a.setTag(f.f28444q0, null);
            }
        }
    }

    public static final void c(final TextInputLayout textInputLayout) {
        if (textInputLayout.getTag(f.f28442p0) != null) {
            return;
        }
        textInputLayout.setTag(f.f28442p0, Boolean.TRUE);
        textInputLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: as.b
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
        final z5 z5Var = new z5(context);
        View viewN = d5.n(g.k(remoteImage), z5Var, remoteImage);
        container.addView(viewN);
        ViewGroup.LayoutParams layoutParams = viewN.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f1336i = 0;
        bVar.f1358t = 0;
        bVar.f1362v = 0;
        if (z10) {
            bVar.f1342l = 0;
        }
        viewN.setLayoutParams(bVar);
        a0.b(container, new Function0() { // from class: as.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(z5Var);
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

    public static final Unit g(z5 z5Var) {
        z5Var.c();
        return Unit.f21506a;
    }

    public static final void h(@NotNull TextInputLayout textInputLayout, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.p0(str)) {
            str = null;
        }
        if (Intrinsics.c(textInputLayout.getTag(f.f28444q0), str)) {
            return;
        }
        textInputLayout.setTag(f.f28444q0, str);
        Object tag = textInputLayout.getTag(f.f28440o0);
        y6.d dVar = tag instanceof y6.d ? (y6.d) tag : null;
        if (dVar != null) {
            dVar.a();
        }
        textInputLayout.setTag(f.f28440o0, null);
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
        aVar2.g(new a7.g.b(false, false, false, 7, null));
        s sVarD = aVar.h(aVar2.p()).d();
        Context context2 = textInputLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputLayout.setTag(f.f28440o0, sVarD.d(new ImageRequest.a(context2).c(str).v(new a(textInputLayout, str, textInputLayout, str)).b()));
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
