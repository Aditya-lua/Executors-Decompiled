package lr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import cr.C4268k4;
import cr.C4352y4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.InterfaceC1251c;
import p239k6.C7465h;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p526wq.C12543z;
import p537x6.ImageRequest;
import p537x6.InterfaceC12743d;
import p596z6.C13729g;

/* JADX INFO: renamed from: lr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "", "url", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/google/android/material/textfield/TextInputLayout;", "leadingImageUrl", "", "h", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", "c", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "", "centerVertical", "Landroid/view/View;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8243c {

    /* JADX INFO: renamed from: lr.c$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m31665d2 = {"lr/c$a", "Lb7/c;", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC1251c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextInputLayout f30545a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f30546b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextInputLayout f30547c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f30548d;

        public a(TextInputLayout textInputLayout, String str, TextInputLayout textInputLayout2, String str2) {
            this.f30545a = textInputLayout;
            this.f30546b = str;
            this.f30547c = textInputLayout2;
            this.f30548d = str2;
        }

        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: a */
        public void mo6967a(InterfaceC7474n error) {
            TextInputLayout textInputLayout = this.f30545a;
            int i10 = C1149d.f4843q0;
            if (Intrinsics.m31980c(textInputLayout.getTag(i10), this.f30546b)) {
                this.f30545a.setTag(i10, null);
            }
        }

        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: b */
        public void mo6968b(InterfaceC7474n placeholder) {
        }

        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: c */
        public void mo6969c(InterfaceC7474n result) {
            if (Intrinsics.m31980c(this.f30547c.getTag(C1149d.f4843q0), this.f30548d)) {
                this.f30547c.setStartIconTintList(null);
                TextInputLayout textInputLayout = this.f30547c;
                Resources resources = textInputLayout.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                textInputLayout.setStartIconDrawable(C7482v.m31086a(result, resources));
                this.f30547c.setStartIconVisible(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m33615c(final TextInputLayout textInputLayout) {
        int i10 = C1149d.f4841p0;
        if (textInputLayout.getTag(i10) != null) {
            return;
        }
        textInputLayout.setTag(i10, Boolean.TRUE);
        textInputLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: lr.b
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C8243c.m33616d(textInputLayout);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m33616d(TextInputLayout textInputLayout) {
        if (textInputLayout.getStartIconDrawable() == null || textInputLayout.m13126T()) {
            return true;
        }
        textInputLayout.setStartIconVisible(true);
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final View m33617e(@NotNull RemoteImage remoteImage, @NotNull ConstraintLayout container, boolean z10) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final C4352y4 c4352y4 = new C4352y4(context);
        View viewM21807n = C4268k4.m21807n(C4086b.m20894k(remoteImage), c4352y4, remoteImage);
        container.addView(viewM21807n);
        ViewGroup.LayoutParams layoutParams = viewM21807n.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
        c0513b.f1998i = 0;
        c0513b.f2020t = 0;
        c0513b.f2024v = 0;
        if (z10) {
            c0513b.f2004l = 0;
        }
        viewM21807n.setLayoutParams(c0513b);
        C12543z.m46890b(container, new Function0() { // from class: lr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8243c.m33619g(c4352y4);
            }
        });
        return viewM21807n;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ View m33618f(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33617e(remoteImage, constraintLayout, z10);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m33619g(C4352y4 c4352y4) {
        c4352y4.m22001c();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m33620h(@NotNull TextInputLayout textInputLayout, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.m32182p0(str)) {
            str = null;
        }
        int i10 = C1149d.f4843q0;
        if (Intrinsics.m31980c(textInputLayout.getTag(i10), str)) {
            return;
        }
        textInputLayout.setTag(i10, str);
        int i11 = C1149d.f4839o0;
        Object tag = textInputLayout.getTag(i11);
        InterfaceC12743d interfaceC12743d = tag instanceof InterfaceC12743d ? (InterfaceC12743d) tag : null;
        if (interfaceC12743d != null) {
            interfaceC12743d.mo47489a();
        }
        textInputLayout.setTag(i11, null);
        textInputLayout.setStartIconVisible(false);
        textInputLayout.setStartIconDrawable((Drawable) null);
        if (str == null) {
            return;
        }
        m33615c(textInputLayout);
        Context context = textInputLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC7479s.a aVar = new InterfaceC7479s.a(context);
        C7465h.a aVar2 = new C7465h.a();
        aVar2.m31006g(new C13729g.b(false, false, false, 7, null));
        InterfaceC7479s interfaceC7479sM31076d = aVar.m31077h(aVar2.m31013p()).m31076d();
        Context context2 = textInputLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputLayout.setTag(i11, interfaceC7479sM31076d.mo31067c(new ImageRequest.a(context2).m47525c(str).m47543v(new a(textInputLayout, str, textInputLayout, str)).m47524b()));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final RemoteImage m33621i(@NotNull RemoteImage remoteImage, @NotNull String url) {
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
