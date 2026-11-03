package ar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", "K", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lr5/a;", "H", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lar/y4;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lr5/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3588a;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.FAILURE_DEFAULT_ICON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_OPENED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_OPENED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHEVRON_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LocalImage.Image.REUSABLE_PERSONA_LOGO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            f3588a = iArr;
        }
    }

    @NotNull
    public static final r5.a H(@NotNull LocalImageComponent localImageComponent, @NotNull y4 uiComponentHelper, int i10, int i11, @NotNull final String[] originalStrokeColors, @NotNull final String[] originalFillColors, @NotNull final LocalImage config) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getStyles() != null) {
            final lq.g gVarC = lq.g.c(uiComponentHelper.getLayoutInflater());
            gVarC.b.setAnimation(i10);
            uiComponentHelper.d(new Function0() { // from class: ar.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p3.I(gVarC, config, originalStrokeColors, originalFillColors);
                }
            });
            Intrinsics.checkNotNull(gVarC);
            return gVarC;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(tp.c.f32504f);
        final lq.h hVarC = lq.h.c(uiComponentHelper.getLayoutInflater());
        hVarC.b.setImageResource(i11);
        uiComponentHelper.d(new Function0() { // from class: ar.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p3.J(hVarC, dimension);
            }
        });
        Intrinsics.checkNotNull(hVarC);
        return hVarC;
    }

    public static final Unit I(lq.g gVar, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), strArr, strArr2, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit J(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0619  */
    /* JADX WARN: Code duplicated, block: B:81:0x061e A[RETURN] */
    @Nullable
    public static final View K(@NotNull LocalImageComponent localImageComponent, @NotNull y4 uiComponentHelper, @NotNull final LocalImage config) {
        r5.a aVarH;
        final lq.h hVarC;
        final lq.g gVarC;
        final lq.h hVarC2;
        final lq.g gVarC2;
        final lq.h hVarC3;
        final lq.g gVarC3;
        final lq.g gVarC4;
        final lq.g gVarC5;
        final lq.g gVarC6;
        final lq.g gVarC7;
        final lq.h hVarC4;
        final lq.g gVarC8;
        final lq.h hVarC5;
        final lq.g gVarC9;
        final lq.g gVarC10;
        lq.g gVarC11;
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        final int dimension = (int) context.getResources().getDimension(tp.c.b);
        final int dimension2 = (int) context.getResources().getDimension(tp.c.f32503e);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : a.f3588a[imageKey.ordinal()]) {
            case -1:
                aVarH = null;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 0:
            default:
                throw new gt.l();
            case 1:
                if (config.getStyles() != null) {
                    gVarC = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC.b.setAnimation(hq.v.f19706n);
                    uiComponentHelper.d(new Function0() { // from class: ar.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.L(gVarC, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC);
                } else {
                    hVarC = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(hq.s.f19656q);
                    uiComponentHelper.d(new Function0() { // from class: ar.k2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.Y(hVarC, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 2:
                if (config.getStyles() != null) {
                    gVarC2 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC2.b.setAnimation(hq.v.f19695c);
                    uiComponentHelper.d(new Function0() { // from class: ar.w2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.h0(gVarC2, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC2);
                } else {
                    hVarC2 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC2.b.setImageResource(hq.s.f19651l);
                    uiComponentHelper.d(new Function0() { // from class: ar.y2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.p0(hVarC2, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC2);
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 3:
                final lq.g gVarC12 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC12.b.setAnimation(hq.v.f19707o);
                uiComponentHelper.d(new Function0() { // from class: ar.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.M(gVarC12);
                    }
                });
                gVarC12.b.j(new f7.n0() { // from class: ar.a3
                    @Override // f7.n0
                    public final void a(f7.i iVar) {
                        p3.N(gVarC12, iVar);
                    }
                });
                aVarH = gVarC12;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 4:
                if (config.getStyles() != null) {
                    gVarC3 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC3.b.setAnimation(hq.v.f19705m);
                    uiComponentHelper.d(new Function0() { // from class: ar.b3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.O(gVarC3, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC3);
                } else {
                    hVarC3 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(hq.s.f19655p);
                    uiComponentHelper.d(new Function0() { // from class: ar.c3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.P(hVarC3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 5:
                if (config.getStyles() != null) {
                    gVarC4 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC4.b.setAnimation(hq.v.f19704l);
                    uiComponentHelper.d(new Function0() { // from class: ar.d3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.Q(gVarC4, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC4);
                } else {
                    hVarC3 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(hq.s.f19654o);
                    uiComponentHelper.d(new Function0() { // from class: ar.f3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.R(hVarC3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 6:
                if (config.getStyles() != null) {
                    gVarC5 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC5.b.setAnimation(hq.v.f19703k);
                    uiComponentHelper.d(new Function0() { // from class: ar.t2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.S(gVarC5, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC5);
                } else {
                    hVarC3 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(hq.s.f19653n);
                    uiComponentHelper.d(new Function0() { // from class: ar.e3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.T(hVarC3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 7:
                if (config.getStyles() != null) {
                    gVarC6 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC6.b.setAnimation(hq.v.f19694a);
                    uiComponentHelper.d(new Function0() { // from class: ar.i3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.U(gVarC6, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC6);
                } else {
                    hVarC3 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(hq.s.f19649j);
                    uiComponentHelper.d(new Function0() { // from class: ar.j3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.V(hVarC3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 8:
                if (config.getStyles() != null) {
                    gVarC7 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC7.b.setAnimation(hq.v.B);
                    uiComponentHelper.d(new Function0() { // from class: ar.k3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.W(gVarC7, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC7);
                } else {
                    hVarC3 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(hq.s.f19658s);
                    uiComponentHelper.d(new Function0() { // from class: ar.l3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.X(hVarC3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 9:
                if (config.getStyles() != null) {
                    gVarC8 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC8.b.setAnimation(hq.v.b);
                    uiComponentHelper.d(new Function0() { // from class: ar.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.Z(gVarC8, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC8);
                } else {
                    hVarC4 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC4.b.setImageResource(hq.s.f19650k);
                    uiComponentHelper.d(new Function0() { // from class: ar.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.a0(hVarC4, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC4);
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 10:
                if (config.getStyles() != null) {
                    gVarC9 = lq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC9.b.setAnimation(hq.v.A);
                    uiComponentHelper.d(new Function0() { // from class: ar.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.b0(gVarC9, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC9);
                } else {
                    hVarC5 = lq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC5.b.setImageResource(hq.s.f19657r);
                    uiComponentHelper.d(new Function0() { // from class: ar.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.c0(hVarC5, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC5);
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 11:
                final lq.g gVarC13 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC13.b.setAnimation(hq.v.f19717y);
                ThemeableLottieAnimationView lottieView = gVarC13.b;
                Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                hr.g.j(lottieView, config.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, null, new String[]{"#FFFFFF"}, 8, null);
                uiComponentHelper.d(new Function0() { // from class: ar.l2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.d0(gVarC13);
                    }
                });
                aVarH = gVarC13;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 12:
                final lq.g gVarC14 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC14.b.setAnimation(hq.v.f19718z);
                ThemeableLottieAnimationView lottieView2 = gVarC14.b;
                Intrinsics.checkNotNullExpressionValue(lottieView2, "lottieView");
                hr.g.j(lottieView2, config.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: ar.m2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.e0(gVarC14);
                    }
                });
                aVarH = gVarC14;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 13:
                final lq.g gVarC15 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC15.b.setAnimation(tp.f.f32517k);
                ThemeableLottieAnimationView lottieView3 = gVarC15.b;
                Intrinsics.checkNotNullExpressionValue(lottieView3, "lottieView");
                hr.g.j(lottieView3, config.getStyles(), new String[]{"#280087"}, new String[0], null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: ar.n2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.f0(gVarC15);
                    }
                });
                aVarH = gVarC15;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 14:
                final lq.g gVarC16 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC16.b.setAnimation(hq.v.f19696d);
                ThemeableLottieAnimationView lottieView4 = gVarC16.b;
                Intrinsics.checkNotNullExpressionValue(lottieView4, "lottieView");
                hr.g.i(lottieView4, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.o2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.g0(gVarC16);
                    }
                });
                aVarH = gVarC16;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 15:
                final lq.g gVarC17 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC17.b.setAnimation(hq.v.f19699g);
                ThemeableLottieAnimationView lottieView5 = gVarC17.b;
                Intrinsics.checkNotNullExpressionValue(lottieView5, "lottieView");
                hr.g.i(lottieView5, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.p2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.i0(gVarC17);
                    }
                });
                aVarH = gVarC17;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 16:
                final lq.g gVarC18 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC18.b.setAnimation(hq.v.f19700h);
                ThemeableLottieAnimationView lottieView6 = gVarC18.b;
                Intrinsics.checkNotNullExpressionValue(lottieView6, "lottieView");
                hr.g.i(lottieView6, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.q2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.j0(gVarC18);
                    }
                });
                aVarH = gVarC18;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 17:
                final lq.g gVarC19 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC19.b.setAnimation(hq.v.f19697e);
                ThemeableLottieAnimationView lottieView7 = gVarC19.b;
                Intrinsics.checkNotNullExpressionValue(lottieView7, "lottieView");
                hr.g.i(lottieView7, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC", "#7379FD"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.k0(gVarC19);
                    }
                });
                aVarH = gVarC19;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 18:
                final lq.g gVarC20 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC20.b.setAnimation(hq.v.f19702j);
                ThemeableLottieAnimationView lottieView8 = gVarC20.b;
                Intrinsics.checkNotNullExpressionValue(lottieView8, "lottieView");
                hr.g.i(lottieView8, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.l0(gVarC20);
                    }
                });
                aVarH = gVarC20;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 19:
                final lq.g gVarC21 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC21.b.setAnimation(hq.v.f19701i);
                ThemeableLottieAnimationView lottieView9 = gVarC21.b;
                Intrinsics.checkNotNullExpressionValue(lottieView9, "lottieView");
                hr.g.i(lottieView9, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.u2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.m0(gVarC21);
                    }
                });
                aVarH = gVarC21;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 20:
                final lq.g gVarC22 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC22.b.setAnimation(hq.v.f19698f);
                ThemeableLottieAnimationView lottieView10 = gVarC22.b;
                Intrinsics.checkNotNullExpressionValue(lottieView10, "lottieView");
                hr.g.i(lottieView10, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: ar.v2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.n0(gVarC22);
                    }
                });
                aVarH = gVarC22;
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 21:
                gVarC10 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC10.b.setImageResource(yq.c.f37014a);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView11 = gVarC10.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView11, "lottieView");
                    hr.g.e(lottieView11, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                } else {
                    uiComponentHelper.d(new Function0() { // from class: ar.x2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.o0(gVarC10);
                        }
                    });
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 22:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19708p, hq.s.f19641a, new String[0], new String[0], config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 23:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19709q, hq.s.b, new String[]{"#000000"}, new String[0], config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 24:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19710r, hq.s.f19642c, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 25:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19711s, hq.s.f19643d, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 26:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19712t, hq.s.f19644e, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 27:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19713u, hq.s.f19645f, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 28:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19714v, hq.s.f19646g, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 29:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19715w, hq.s.f19647h, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 30:
                aVarH = H(localImageComponent, uiComponentHelper, hq.v.f19716x, hq.s.f19648i, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
            case 31:
                gVarC11 = lq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC11.b.setImageResource(yq.c.f37016d);
                aVarH = gVarC11;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView12 = gVarC11.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView12, "lottieView");
                    hr.g.e(lottieView12, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                }
                if (aVarH != null) {
                    aVarH = hVarC;
                    aVarH = gVarC;
                    aVarH = hVarC2;
                    aVarH = gVarC2;
                    aVarH = gVarC3;
                    aVarH = gVarC4;
                    aVarH = gVarC5;
                    aVarH = gVarC6;
                    aVarH = gVarC7;
                    aVarH = hVarC4;
                    aVarH = gVarC8;
                    aVarH = hVarC5;
                    aVarH = gVarC9;
                    aVarH = gVarC10;
                    aVarH = gVarC10;
                    aVarH = gVarC11;
                    return aVarH.getRoot();
                }
                aVarH = hVarC;
                aVarH = gVarC;
                aVarH = hVarC2;
                aVarH = gVarC2;
                aVarH = gVarC3;
                aVarH = gVarC4;
                aVarH = gVarC5;
                aVarH = gVarC6;
                aVarH = gVarC7;
                aVarH = hVarC4;
                aVarH = gVarC8;
                aVarH = hVarC5;
                aVarH = gVarC9;
                aVarH = gVarC10;
                aVarH = gVarC10;
                aVarH = gVarC11;
                return null;
        }
    }

    public static final Unit L(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22938a;
    }

    public static final Unit M(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final void N(lq.g gVar, f7.i iVar) {
        gVar.b.v();
    }

    public static final Unit O(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit P(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit Q(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit R(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit S(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit T(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit U(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#180052"}, new String[0], null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22938a;
    }

    public static final Unit V(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit W(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit X(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit Y(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit Z(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, null, new String[0], 8, null);
        return Unit.f22938a;
    }

    public static final Unit a0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit b0(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, null, new String[]{"#AA84FF"}, 8, null);
        return Unit.f22938a;
    }

    public static final Unit c0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit d0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit e0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit f0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit g0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit h0(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22938a;
    }

    public static final Unit i0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit j0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit k0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit l0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit m0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit n0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22938a;
    }

    public static final Unit o0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) hq.j.a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }

    public static final Unit p0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22938a;
    }
}
