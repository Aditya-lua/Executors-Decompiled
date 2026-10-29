package cr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.RemoteImageComponent;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;
import p226jq.C7288z;
import p226jq.EnumC7248a0;
import p227jr.C7301g;
import p229jt.C7345l;
import p239k6.C7465h;
import p239k6.InterfaceC7479s;
import p287m6.C8446t;
import p287m6.InterfaceC8435i;
import p313nq.C9551g;
import p313nq.C9552h;
import p323o6.SourceFetchResult;
import p402r5.InterfaceC10784a;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.ImageRequest;
import p537x6.Options;
import p560xu.C12924e;
import p596z6.C13729g;

/* JADX INFO: renamed from: cr.k4 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001c\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "Landroid/view/View;", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Landroid/view/View;", "q", "o", "v", "Landroid/widget/ImageView;", "imageView", "", "uri", "", "k", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "l", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "originalSvg", "j", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)Ljava/lang/String;", "originalHex", "newHex", "fallbackColor", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4268k4 {

    /* JADX INFO: renamed from: cr.k4$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18076a;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18076a = iArr;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m21803j(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        String strM32303N;
        Integer originalStrokeColorValue;
        String strM30291g;
        Integer originalBackgroundColorValue;
        String strM30291g2;
        Integer originalHighlightColorValue;
        String strM30291g3;
        Integer originalFillColorValue;
        String strM30291g4;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle == null || (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) == null) {
            strM32303N = str;
        } else {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            strM32303N = (newFillColorValue == null || C7265j.m30291g(newFillColorValue.intValue()) == null) ? str : C7797x.m32303N(str, C7265j.m30291g(iIntValue), "{{ fill_color }}", false, 4, null);
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && C7265j.m30291g(newHighlightColorValue.intValue()) != null) {
                strM32303N = C7797x.m32303N(strM32303N, C7265j.m30291g(iIntValue2), "{{ highlight_color }}", false, 4, null);
            }
        }
        String strM32303N2 = strM32303N;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && C7265j.m30291g(newBackgroundColorValue.intValue()) != null) {
                strM32303N2 = C7797x.m32303N(strM32303N2, C7265j.m30291g(iIntValue3), "{{ background_color }}", false, 4, null);
            }
        }
        String strM21819z = strM32303N2;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && C7265j.m30291g(newStrokeColorValue.intValue()) != null) {
                strM21819z = C7797x.m32303N(strM21819z, C7265j.m30291g(iIntValue4), "{{ stroke_color }}", false, 4, null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (strM30291g4 = C7265j.m30291g(newFillColorValue2.intValue())) != null) {
                strM21819z = m21819z(strM21819z, "{{ fill_color }}", strM30291g4, C7265j.m30291g(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (strM30291g3 = C7265j.m30291g(newHighlightColorValue2.intValue())) != null) {
                strM21819z = m21819z(strM21819z, "{{ highlight_color }}", strM30291g3, C7265j.m30291g(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (strM30291g2 = C7265j.m30291g(newBackgroundColorValue2.intValue())) != null) {
                strM21819z = m21819z(strM21819z, "{{ background_color }}", strM30291g2, C7265j.m30291g(iIntValue7));
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue8 = originalStrokeColorValue.intValue();
            Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue2 != null && (strM30291g = C7265j.m30291g(newStrokeColorValue2.intValue())) != null) {
                return m21819z(strM21819z, "{{ stroke_color }}", strM30291g, C7265j.m30291g(iIntValue8));
            }
        }
        return strM21819z;
    }

    /* JADX INFO: renamed from: k */
    public static final void m21804k(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC7479s.a aVar = new InterfaceC7479s.a(context);
        C7465h.a aVar2 = new C7465h.a();
        aVar2.m31006g(new C13729g.b(false, false, false, 7, null));
        C12749j.m47586c(C12748i.m47574b(aVar.m31077h(aVar2.m31013p()), true), 500).m31076d().mo31067c(C12749j.m47600q(new ImageRequest.a(imageView.getContext()).m47525c(str), imageView).m47524b());
    }

    /* JADX INFO: renamed from: l */
    public static final void m21805l(ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC7479s interfaceC7479sM31076d = C12749j.m47586c(C12748i.m47574b(new InterfaceC7479s.a(context), true), 500).m31076d();
        ImageRequest.a aVarM47600q = C12749j.m47600q(new ImageRequest.a(imageView.getContext()).m47525c(str), imageView);
        aVarM47600q.m47526d(new InterfaceC8435i.a() { // from class: cr.i4
            @Override // p287m6.InterfaceC8435i.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC8435i mo21787a(SourceFetchResult sourceFetchResult, Options options, InterfaceC7479s interfaceC7479s) {
                return C4268k4.m21806m(remoteImageComponentStyle, sourceFetchResult, options, interfaceC7479s);
            }
        });
        interfaceC7479sM31076d.mo31067c(aVarM47600q.m47524b());
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC8435i m21806m(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, SourceFetchResult result, Options options, InterfaceC7479s interfaceC7479s) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(interfaceC7479s, "<unused var>");
        byte[] bArrMo48013X1 = result.getSource().source().mo48013X1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = m21803j(new String(bArrMo48013X1, charset), remoteImageComponentStyle).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new C13729g(C8446t.m34219c(new C12924e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final View m21807n(@NotNull RemoteImageComponent remoteImageComponent, @NotNull C4352y4 uiComponentHelper, @NotNull RemoteImage config) {
        Intrinsics.checkNotNullParameter(remoteImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        View viewM21810q = m21810q(remoteImageComponent, uiComponentHelper, config);
        return (viewM21810q == null && (viewM21810q = m21808o(remoteImageComponent, uiComponentHelper, config)) == null) ? m21815v(remoteImageComponent, uiComponentHelper, config) : viewM21810q;
    }

    /* JADX INFO: renamed from: o */
    public static final View m21808o(RemoteImageComponent remoteImageComponent, C4352y4 c4352y4, final RemoteImage remoteImage) {
        String localAssetName;
        RemoteImage.ContentType localAssetContentType;
        String str;
        final C9551g c9551gM37689c;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        if (attributes == null || (localAssetName = attributes.getLocalAssetName()) == null || (localAssetContentType = attributes.getLocalAssetContentType()) == null) {
            return null;
        }
        Context context = c4352y4.getContext();
        int[] iArr = a.f18076a;
        int i10 = iArr[localAssetContentType.ordinal()];
        if (i10 == 1) {
            str = "json";
        } else if (i10 == 2) {
            str = "png";
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            str = "svg";
        }
        String str2 = localAssetName + "." + str;
        try {
            context.getAssets().open(str2).close();
            if (iArr[localAssetContentType.ordinal()] == 1) {
                c9551gM37689c = C9551g.m37689c(c4352y4.getLayoutInflater());
                c4352y4.m22002d(new Function0() { // from class: cr.e4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4268k4.m21809p(c9551gM37689c, remoteImage);
                    }
                });
                c9551gM37689c.f34529b.setAnimation(str2);
            } else {
                c9551gM37689c = null;
            }
            if (c9551gM37689c != null) {
                return c9551gM37689c.getRoot();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m21809p(C9551g c9551g, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30378k(lottieView, remoteImage);
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final View m21810q(RemoteImageComponent remoteImageComponent, C4352y4 c4352y4, final RemoteImage remoteImage) {
        Integer numM30331g;
        InterfaceC10784a interfaceC10784a;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        Context context = c4352y4.getContext();
        if (localAssetName != null && localAssetContentType != null) {
            final C7758y c7758y = new C7758y();
            int[] iArr = a.f18076a;
            int i10 = iArr[localAssetContentType.ordinal()];
            if (i10 == 1) {
                numM30331g = C7288z.m30331g(context, localAssetName, EnumC7248a0.Raw);
            } else if (i10 == 2) {
                numM30331g = C7288z.m30331g(context, localAssetName, EnumC7248a0.Drawable);
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                numM30331g = C7288z.m30331g(context, localAssetName, EnumC7248a0.Raw);
                if (numM30331g != null) {
                    c7758y.f29445a = true;
                } else {
                    numM30331g = C7288z.m30331g(context, localAssetName, EnumC7248a0.Drawable);
                }
            }
            if (numM30331g != null) {
                final int iIntValue = numM30331g.intValue();
                int i11 = iArr[localAssetContentType.ordinal()];
                if (i11 == 1) {
                    final C9551g c9551gM37689c = C9551g.m37689c(c4352y4.getLayoutInflater());
                    c4352y4.m22002d(new Function0() { // from class: cr.f4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4268k4.m21811r(c9551gM37689c, remoteImage);
                        }
                    });
                    c9551gM37689c.f34529b.setAnimation(iIntValue);
                    interfaceC10784a = c9551gM37689c;
                } else if (i11 == 2) {
                    final C9552h c9552hM37693c = C9552h.m37693c(c4352y4.getLayoutInflater());
                    c4352y4.m22002d(new Function0() { // from class: cr.g4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4268k4.m21812s(c9552hM37693c, remoteImage, iIntValue);
                        }
                    });
                    interfaceC10784a = c9552hM37693c;
                } else {
                    if (i11 != 3) {
                        throw new C7345l();
                    }
                    final C9552h c9552hM37693c2 = C9552h.m37693c(c4352y4.getLayoutInflater());
                    c4352y4.m22002d(new Function0() { // from class: cr.h4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4268k4.m21813t(c9552hM37693c2, remoteImage, c7758y, iIntValue);
                        }
                    });
                    interfaceC10784a = c9552hM37693c2;
                }
                return interfaceC10784a.getRoot();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m21811r(C9551g c9551g, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30378k(lottieView, remoteImage);
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m21812s(C9552h c9552h, RemoteImage remoteImage, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C7301g.m30378k(imageView, remoteImage);
        c9552h.f34531b.setImageResource(i10);
        c9552h.f34531b.setScaleType(ImageView.ScaleType.FIT_XY);
        c9552h.f34531b.setAdjustViewBounds(true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m21813t(C9552h c9552h, final RemoteImage remoteImage, C7758y c7758y, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C7301g.m30378k(imageView, remoteImage);
        if (c7758y.f29445a) {
            Context context = c9552h.f34531b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InterfaceC7479s interfaceC7479sM31076d = new InterfaceC7479s.a(context).m31076d();
            ImageView imageView2 = c9552h.f34531b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            ImageRequest.a aVarM47600q = C12749j.m47600q(new ImageRequest.a(imageView2.getContext()).m47525c(Integer.valueOf(i10)), imageView2);
            aVarM47600q.m47526d(new InterfaceC8435i.a() { // from class: cr.j4
                @Override // p287m6.InterfaceC8435i.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC8435i mo21787a(SourceFetchResult sourceFetchResult, Options options, InterfaceC7479s interfaceC7479s) {
                    return C4268k4.m21814u(remoteImage, sourceFetchResult, options, interfaceC7479s);
                }
            });
            interfaceC7479sM31076d.mo31067c(aVarM47600q.m47524b());
        } else {
            c9552h.f34531b.setImageResource(i10);
        }
        c9552h.f34531b.setScaleType(ImageView.ScaleType.FIT_XY);
        c9552h.f34531b.setAdjustViewBounds(true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC8435i m21814u(RemoteImage remoteImage, SourceFetchResult result, Options options, InterfaceC7479s interfaceC7479s) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(interfaceC7479s, "<unused var>");
        byte[] bArrMo48013X1 = result.getSource().source().mo48013X1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = m21803j(new String(bArrMo48013X1, charset), remoteImage.getStyles()).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new C13729g(C8446t.m34219c(new C12924e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    /* JADX INFO: renamed from: v */
    public static final View m21815v(RemoteImageComponent remoteImageComponent, C4352y4 c4352y4, final RemoteImage remoteImage) {
        InterfaceC10784a interfaceC10784a;
        final RemoteImage.Attributes attributes = remoteImage.getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i10 = contentType == null ? -1 : a.f18076a[contentType.ordinal()];
        if (i10 == 1) {
            final C9551g c9551gM37689c = C9551g.m37689c(c4352y4.getLayoutInflater());
            c4352y4.m22002d(new Function0() { // from class: cr.c4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4268k4.m21817x(c9551gM37689c, remoteImage);
                }
            });
            c9551gM37689c.f34529b.m20475G(attributes.getUrl());
            interfaceC10784a = c9551gM37689c;
        } else if (i10 != 3) {
            final C9552h c9552hM37693c = C9552h.m37693c(c4352y4.getLayoutInflater());
            c4352y4.m22002d(new Function0() { // from class: cr.d4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4268k4.m21818y(c9552hM37693c, remoteImage, attributes);
                }
            });
            interfaceC10784a = c9552hM37693c;
        } else {
            final C9552h c9552hM37693c2 = C9552h.m37693c(c4352y4.getLayoutInflater());
            c4352y4.m22002d(new Function0() { // from class: cr.b4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4268k4.m21816w(c9552hM37693c2, remoteImage, attributes);
                }
            });
            interfaceC10784a = c9552hM37693c2;
        }
        View root = interfaceC10784a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m21816w(C9552h c9552h, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C7301g.m30378k(imageView, remoteImage);
        ImageView imageView2 = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        m21805l(imageView2, attributes.getUrl(), remoteImage.getStyles());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m21817x(C9551g c9551g, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30378k(lottieView, remoteImage);
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m21818y(C9552h c9552h, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C7301g.m30378k(imageView, remoteImage);
        String url = attributes != null ? attributes.getUrl() : null;
        ImageView imageView2 = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        m21804k(imageView2, url);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final String m21819z(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        try {
            Color.parseColor(str3);
            str5 = str;
            str6 = str2;
            try {
                return C7797x.m32303N(str5, str6, str3, false, 4, null);
            } catch (IllegalArgumentException unused) {
                return C7797x.m32303N(str5, str6, str4, false, 4, null);
            }
        } catch (IllegalArgumentException unused2) {
            str5 = str;
            str6 = str2;
        }
    }
}
