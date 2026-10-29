package cr;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", "K", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lr5/a;", "H", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lcr/y4;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lr5/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14174a;

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
            f14174a = iArr;
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
            final nq.g gVarC = nq.g.c(uiComponentHelper.getLayoutInflater());
            gVarC.b.setAnimation(i10);
            uiComponentHelper.d(new Function0() { // from class: cr.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p3.I(gVarC, config, originalStrokeColors, originalFillColors);
                }
            });
            Intrinsics.checkNotNull(gVarC);
            return gVarC;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(vp.c.f33368f);
        final nq.h hVarC = nq.h.c(uiComponentHelper.getLayoutInflater());
        hVarC.b.setImageResource(i11);
        uiComponentHelper.d(new Function0() { // from class: cr.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p3.J(hVarC, dimension);
            }
        });
        Intrinsics.checkNotNull(hVarC);
        return hVarC;
    }

    public static final Unit I(nq.g gVar, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), strArr, strArr2, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit J(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0619  */
    /* JADX WARN: Code duplicated, block: B:81:0x061e A[RETURN] */
    @Nullable
    public static final View K(@NotNull LocalImageComponent localImageComponent, @NotNull y4 uiComponentHelper, @NotNull final LocalImage config) {
        r5.a aVarH;
        final nq.h hVarC;
        final nq.g gVarC;
        final nq.h hVarC2;
        final nq.g gVarC2;
        final nq.h hVarC3;
        final nq.g gVarC3;
        final nq.g gVarC4;
        final nq.g gVarC5;
        final nq.g gVarC6;
        final nq.g gVarC7;
        final nq.h hVarC4;
        final nq.g gVarC8;
        final nq.h hVarC5;
        final nq.g gVarC9;
        final nq.g gVarC10;
        nq.g gVarC11;
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        final int dimension = (int) context.getResources().getDimension(vp.c.b);
        final int dimension2 = (int) context.getResources().getDimension(vp.c.f33367e);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : a.f14174a[imageKey.ordinal()]) {
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
                throw new jt.l();
            case 1:
                if (config.getStyles() != null) {
                    gVarC = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC.b.setAnimation(jq.v.f21698n);
                    uiComponentHelper.d(new Function0() { // from class: cr.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.L(gVarC, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC);
                } else {
                    hVarC = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(jq.s.f21648q);
                    uiComponentHelper.d(new Function0() { // from class: cr.k2
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
                    gVarC2 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC2.b.setAnimation(jq.v.f21687c);
                    uiComponentHelper.d(new Function0() { // from class: cr.w2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.h0(gVarC2, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC2);
                } else {
                    hVarC2 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC2.b.setImageResource(jq.s.f21643l);
                    uiComponentHelper.d(new Function0() { // from class: cr.y2
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
                final nq.g gVarC12 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC12.b.setAnimation(jq.v.f21699o);
                uiComponentHelper.d(new Function0() { // from class: cr.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p3.M(gVarC12);
                    }
                });
                gVarC12.b.j(new f7.n0() { // from class: cr.a3
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
                    gVarC3 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC3.b.setAnimation(jq.v.f21697m);
                    uiComponentHelper.d(new Function0() { // from class: cr.b3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.O(gVarC3, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC3);
                } else {
                    hVarC3 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(jq.s.f21647p);
                    uiComponentHelper.d(new Function0() { // from class: cr.c3
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
                    gVarC4 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC4.b.setAnimation(jq.v.f21696l);
                    uiComponentHelper.d(new Function0() { // from class: cr.d3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.Q(gVarC4, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC4);
                } else {
                    hVarC3 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(jq.s.f21646o);
                    uiComponentHelper.d(new Function0() { // from class: cr.f3
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
                    gVarC5 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC5.b.setAnimation(jq.v.f21695k);
                    uiComponentHelper.d(new Function0() { // from class: cr.t2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.S(gVarC5, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC5);
                } else {
                    hVarC3 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(jq.s.f21645n);
                    uiComponentHelper.d(new Function0() { // from class: cr.e3
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
                    gVarC6 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC6.b.setAnimation(jq.v.f21686a);
                    uiComponentHelper.d(new Function0() { // from class: cr.i3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.U(gVarC6, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC6);
                } else {
                    hVarC3 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(jq.s.f21641j);
                    uiComponentHelper.d(new Function0() { // from class: cr.j3
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
                    gVarC7 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC7.b.setAnimation(jq.v.B);
                    uiComponentHelper.d(new Function0() { // from class: cr.k3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.W(gVarC7, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC7);
                } else {
                    hVarC3 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(jq.s.f21650s);
                    uiComponentHelper.d(new Function0() { // from class: cr.l3
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
                    gVarC8 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC8.b.setAnimation(jq.v.b);
                    uiComponentHelper.d(new Function0() { // from class: cr.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.Z(gVarC8, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC8);
                } else {
                    hVarC4 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC4.b.setImageResource(jq.s.f21642k);
                    uiComponentHelper.d(new Function0() { // from class: cr.n3
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
                    gVarC9 = nq.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC9.b.setAnimation(jq.v.A);
                    uiComponentHelper.d(new Function0() { // from class: cr.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p3.b0(gVarC9, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC9);
                } else {
                    hVarC5 = nq.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC5.b.setImageResource(jq.s.f21649r);
                    uiComponentHelper.d(new Function0() { // from class: cr.j2
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
                final nq.g gVarC13 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC13.b.setAnimation(jq.v.f21709y);
                ThemeableLottieAnimationView lottieView = gVarC13.b;
                Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                jr.g.j(lottieView, config.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, null, new String[]{"#FFFFFF"}, 8, null);
                uiComponentHelper.d(new Function0() { // from class: cr.l2
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
                final nq.g gVarC14 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC14.b.setAnimation(jq.v.f21710z);
                ThemeableLottieAnimationView lottieView2 = gVarC14.b;
                Intrinsics.checkNotNullExpressionValue(lottieView2, "lottieView");
                jr.g.j(lottieView2, config.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: cr.m2
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
                final nq.g gVarC15 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC15.b.setAnimation(vp.f.f33381k);
                ThemeableLottieAnimationView lottieView3 = gVarC15.b;
                Intrinsics.checkNotNullExpressionValue(lottieView3, "lottieView");
                jr.g.j(lottieView3, config.getStyles(), new String[]{"#280087"}, new String[0], null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: cr.n2
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
                final nq.g gVarC16 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC16.b.setAnimation(jq.v.f21688d);
                ThemeableLottieAnimationView lottieView4 = gVarC16.b;
                Intrinsics.checkNotNullExpressionValue(lottieView4, "lottieView");
                jr.g.i(lottieView4, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.o2
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
                final nq.g gVarC17 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC17.b.setAnimation(jq.v.f21691g);
                ThemeableLottieAnimationView lottieView5 = gVarC17.b;
                Intrinsics.checkNotNullExpressionValue(lottieView5, "lottieView");
                jr.g.i(lottieView5, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.p2
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
                final nq.g gVarC18 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC18.b.setAnimation(jq.v.f21692h);
                ThemeableLottieAnimationView lottieView6 = gVarC18.b;
                Intrinsics.checkNotNullExpressionValue(lottieView6, "lottieView");
                jr.g.i(lottieView6, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.q2
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
                final nq.g gVarC19 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC19.b.setAnimation(jq.v.f21689e);
                ThemeableLottieAnimationView lottieView7 = gVarC19.b;
                Intrinsics.checkNotNullExpressionValue(lottieView7, "lottieView");
                jr.g.i(lottieView7, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC", "#7379FD"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.r2
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
                final nq.g gVarC20 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC20.b.setAnimation(jq.v.f21694j);
                ThemeableLottieAnimationView lottieView8 = gVarC20.b;
                Intrinsics.checkNotNullExpressionValue(lottieView8, "lottieView");
                jr.g.i(lottieView8, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.s2
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
                final nq.g gVarC21 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC21.b.setAnimation(jq.v.f21693i);
                ThemeableLottieAnimationView lottieView9 = gVarC21.b;
                Intrinsics.checkNotNullExpressionValue(lottieView9, "lottieView");
                jr.g.i(lottieView9, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.u2
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
                final nq.g gVarC22 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC22.b.setAnimation(jq.v.f21690f);
                ThemeableLottieAnimationView lottieView10 = gVarC22.b;
                Intrinsics.checkNotNullExpressionValue(lottieView10, "lottieView");
                jr.g.i(lottieView10, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: cr.v2
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
                gVarC10 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC10.b.setImageResource(ar.c.f3655a);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView11 = gVarC10.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView11, "lottieView");
                    jr.g.e(lottieView11, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                } else {
                    uiComponentHelper.d(new Function0() { // from class: cr.x2
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21700p, jq.s.f21633a, new String[0], new String[0], config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21701q, jq.s.b, new String[]{"#000000"}, new String[0], config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21702r, jq.s.f21634c, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21703s, jq.s.f21635d, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21704t, jq.s.f21636e, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21705u, jq.s.f21637f, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21706v, jq.s.f21638g, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21707w, jq.s.f21639h, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                aVarH = H(localImageComponent, uiComponentHelper, jq.v.f21708x, jq.s.f21640i, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
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
                gVarC11 = nq.g.c(uiComponentHelper.getLayoutInflater());
                gVarC11.b.setImageResource(ar.c.f3657d);
                aVarH = gVarC11;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView12 = gVarC11.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView12, "lottieView");
                    jr.g.e(lottieView12, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
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

    public static final Unit L(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22483a;
    }

    public static final Unit M(nq.g gVar) {
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
        return Unit.f22483a;
    }

    public static final void N(nq.g gVar, f7.i iVar) {
        gVar.b.v();
    }

    public static final Unit O(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit P(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit Q(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit R(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit S(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit T(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit U(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#180052"}, new String[0], null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22483a;
    }

    public static final Unit V(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit W(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit X(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit Y(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit Z(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, null, new String[0], 8, null);
        return Unit.f22483a;
    }

    public static final Unit a0(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit b0(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, null, new String[]{"#AA84FF"}, 8, null);
        return Unit.f22483a;
    }

    public static final Unit c0(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit d0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit e0(nq.g gVar) {
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
        return Unit.f22483a;
    }

    public static final Unit f0(nq.g gVar) {
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
        return Unit.f22483a;
    }

    public static final Unit g0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit h0(nq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        jr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22483a;
    }

    public static final Unit i0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit j0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit k0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit l0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit m0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit n0(nq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22483a;
    }

    public static final Unit o0(nq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) jq.j.a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit p0(nq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }
}
