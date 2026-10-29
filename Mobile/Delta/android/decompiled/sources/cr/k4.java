package cr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import x6.ImageRequest;
import x6.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001c\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "Landroid/view/View;", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Landroid/view/View;", "q", "o", "v", "Landroid/widget/ImageView;", "imageView", "", "uri", "", "k", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "l", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "originalSvg", "j", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)Ljava/lang/String;", "originalHex", "newHex", "fallbackColor", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14146a;

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
            f14146a = iArr;
        }
    }

    public static final String j(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        String strN;
        Integer originalStrokeColorValue;
        String strG;
        Integer originalBackgroundColorValue;
        String strG2;
        Integer originalHighlightColorValue;
        String strG3;
        Integer originalFillColorValue;
        String strG4;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle == null || (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) == null) {
            strN = str;
        } else {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            strN = (newFillColorValue == null || jq.j.g(newFillColorValue.intValue()) == null) ? str : kotlin.text.x.N(str, jq.j.g(iIntValue), "{{ fill_color }}", false, 4, null);
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && jq.j.g(newHighlightColorValue.intValue()) != null) {
                strN = kotlin.text.x.N(strN, jq.j.g(iIntValue2), "{{ highlight_color }}", false, 4, null);
            }
        }
        String strN2 = strN;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && jq.j.g(newBackgroundColorValue.intValue()) != null) {
                strN2 = kotlin.text.x.N(strN2, jq.j.g(iIntValue3), "{{ background_color }}", false, 4, null);
            }
        }
        String strZ = strN2;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && jq.j.g(newStrokeColorValue.intValue()) != null) {
                strZ = kotlin.text.x.N(strZ, jq.j.g(iIntValue4), "{{ stroke_color }}", false, 4, null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (strG4 = jq.j.g(newFillColorValue2.intValue())) != null) {
                strZ = z(strZ, "{{ fill_color }}", strG4, jq.j.g(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (strG3 = jq.j.g(newHighlightColorValue2.intValue())) != null) {
                strZ = z(strZ, "{{ highlight_color }}", strG3, jq.j.g(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (strG2 = jq.j.g(newBackgroundColorValue2.intValue())) != null) {
                strZ = z(strZ, "{{ background_color }}", strG2, jq.j.g(iIntValue7));
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue8 = originalStrokeColorValue.intValue();
            Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue2 != null && (strG = jq.j.g(newStrokeColorValue2.intValue())) != null) {
                return z(strZ, "{{ stroke_color }}", strG, jq.j.g(iIntValue8));
            }
        }
        return strZ;
    }

    public static final void k(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k6.s.a aVar = new k6.s.a(context);
        k6.h.a aVar2 = new k6.h.a();
        aVar2.g(new z6.g.b(false, false, false, 7, null));
        x6.j.c(x6.i.b(aVar.h(aVar2.p()), true), 500).d().c(x6.j.q(new ImageRequest.a(imageView.getContext()).c(str), imageView).b());
    }

    public static final void l(ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k6.s sVarD = x6.j.c(x6.i.b(new k6.s.a(context), true), 500).d();
        ImageRequest.a aVarQ = x6.j.q(new ImageRequest.a(imageView.getContext()).c(str), imageView);
        aVarQ.d(new m6.i.a() { // from class: cr.i4
            @Override // m6.i.a
            public final m6.i a(SourceFetchResult sourceFetchResult, Options options, k6.s sVar) {
                return k4.m(remoteImageComponentStyle, sourceFetchResult, options, sVar);
            }
        });
        sVarD.c(aVarQ.b());
    }

    public static final m6.i m(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, SourceFetchResult result, Options options, k6.s sVar) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        byte[] bArrX1 = result.getSource().source().X1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = j(new String(bArrX1, charset), remoteImageComponentStyle).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new z6.g(m6.t.c(new xu.e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    @NotNull
    public static final View n(@NotNull RemoteImageComponent remoteImageComponent, @NotNull y4 uiComponentHelper, @NotNull RemoteImage config) {
        Intrinsics.checkNotNullParameter(remoteImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        View viewQ = q(remoteImageComponent, uiComponentHelper, config);
        return (viewQ == null && (viewQ = o(remoteImageComponent, uiComponentHelper, config)) == null) ? v(remoteImageComponent, uiComponentHelper, config) : viewQ;
    }

    public static final View o(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        String localAssetName;
        RemoteImage.ContentType localAssetContentType;
        String str;
        final nq.g gVarC;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        if (attributes == null || (localAssetName = attributes.getLocalAssetName()) == null || (localAssetContentType = attributes.getLocalAssetContentType()) == null) {
            return null;
        }
        Context context = y4Var.getContext();
        int[] iArr = a.f14146a;
        int i10 = iArr[localAssetContentType.ordinal()];
        if (i10 == 1) {
            str = "json";
        } else if (i10 == 2) {
            str = "png";
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            str = "svg";
        }
        String str2 = localAssetName + "." + str;
        try {
            context.getAssets().open(str2).close();
            if (iArr[localAssetContentType.ordinal()] == 1) {
                gVarC = nq.g.c(y4Var.getLayoutInflater());
                y4Var.d(new Function0() { // from class: cr.e4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k4.p(gVarC, remoteImage);
                    }
                });
                gVarC.b.setAnimation(str2);
            } else {
                gVarC = null;
            }
            if (gVarC != null) {
                return gVarC.getRoot();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final Unit p(nq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final View q(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        Integer numG;
        r5.a aVar;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        Context context = y4Var.getContext();
        if (localAssetName != null && localAssetContentType != null) {
            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            int[] iArr = a.f14146a;
            int i10 = iArr[localAssetContentType.ordinal()];
            if (i10 == 1) {
                numG = jq.z.g(context, localAssetName, jq.a0.Raw);
            } else if (i10 == 2) {
                numG = jq.z.g(context, localAssetName, jq.a0.Drawable);
            } else {
                if (i10 != 3) {
                    throw new jt.l();
                }
                numG = jq.z.g(context, localAssetName, jq.a0.Raw);
                if (numG != null) {
                    yVar.f22568a = true;
                } else {
                    numG = jq.z.g(context, localAssetName, jq.a0.Drawable);
                }
            }
            if (numG != null) {
                final int iIntValue = numG.intValue();
                int i11 = iArr[localAssetContentType.ordinal()];
                if (i11 == 1) {
                    final nq.g gVarC = nq.g.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: cr.f4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k4.r(gVarC, remoteImage);
                        }
                    });
                    gVarC.b.setAnimation(iIntValue);
                    aVar = gVarC;
                } else if (i11 == 2) {
                    final nq.h hVarC = nq.h.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: cr.g4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k4.s(hVarC, remoteImage, iIntValue);
                        }
                    });
                    aVar = hVarC;
                } else {
                    if (i11 != 3) {
                        throw new jt.l();
                    }
                    final nq.h hVarC2 = nq.h.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: cr.h4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k4.t(hVarC2, remoteImage, yVar, iIntValue);
                        }
                    });
                    aVar = hVarC2;
                }
                return aVar.getRoot();
            }
        }
        return null;
    }

    public static final Unit r(nq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit s(nq.h hVar, RemoteImage remoteImage, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        jr.g.k(imageView, remoteImage);
        hVar.b.setImageResource(i10);
        hVar.b.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.b.setAdjustViewBounds(true);
        return Unit.f22483a;
    }

    public static final Unit t(nq.h hVar, final RemoteImage remoteImage, kotlin.jvm.internal.y yVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        jr.g.k(imageView, remoteImage);
        if (yVar.f22568a) {
            Context context = hVar.b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            k6.s sVarD = new k6.s.a(context).d();
            ImageView imageView2 = hVar.b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            ImageRequest.a aVarQ = x6.j.q(new ImageRequest.a(imageView2.getContext()).c(Integer.valueOf(i10)), imageView2);
            aVarQ.d(new m6.i.a() { // from class: cr.j4
                @Override // m6.i.a
                public final m6.i a(SourceFetchResult sourceFetchResult, Options options, k6.s sVar) {
                    return k4.u(remoteImage, sourceFetchResult, options, sVar);
                }
            });
            sVarD.c(aVarQ.b());
        } else {
            hVar.b.setImageResource(i10);
        }
        hVar.b.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.b.setAdjustViewBounds(true);
        return Unit.f22483a;
    }

    public static final m6.i u(RemoteImage remoteImage, SourceFetchResult result, Options options, k6.s sVar) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        byte[] bArrX1 = result.getSource().source().X1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = j(new String(bArrX1, charset), remoteImage.getStyles()).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new z6.g(m6.t.c(new xu.e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    public static final View v(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        r5.a aVar;
        final RemoteImage.Attributes attributes = remoteImage.getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i10 = contentType == null ? -1 : a.f14146a[contentType.ordinal()];
        if (i10 == 1) {
            final nq.g gVarC = nq.g.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: cr.c4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k4.x(gVarC, remoteImage);
                }
            });
            gVarC.b.G(attributes.getUrl());
            aVar = gVarC;
        } else if (i10 != 3) {
            final nq.h hVarC = nq.h.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: cr.d4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k4.y(hVarC, remoteImage, attributes);
                }
            });
            aVar = hVarC;
        } else {
            final nq.h hVarC2 = nq.h.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: cr.b4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k4.w(hVarC2, remoteImage, attributes);
                }
            });
            aVar = hVarC2;
        }
        View root = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit w(nq.h hVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        jr.g.k(imageView, remoteImage);
        ImageView imageView2 = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        l(imageView2, attributes.getUrl(), remoteImage.getStyles());
        return Unit.f22483a;
    }

    public static final Unit x(nq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit y(nq.h hVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        jr.g.k(imageView, remoteImage);
        String url = attributes != null ? attributes.getUrl() : null;
        ImageView imageView2 = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        k(imageView2, url);
        return Unit.f22483a;
    }

    public static final String z(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        try {
            Color.parseColor(str3);
            str5 = str;
            str6 = str2;
            try {
                return kotlin.text.x.N(str5, str6, str3, false, 4, null);
            } catch (IllegalArgumentException unused) {
                return kotlin.text.x.N(str5, str6, str4, false, 4, null);
            }
        } catch (IllegalArgumentException unused2) {
            str5 = str;
            str6 = str2;
        }
    }
}
