package qr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqr/v2;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", "K", "(Lqr/v2;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", BuildConfig.FLAVOR, "lottieRes", "drawableRes", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "originalStrokeColors", "originalFillColors", "Ls5/a;", "H", "(Lqr/v2;Lqr/z5;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Ls5/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30259a;

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
            f30259a = iArr;
        }
    }

    @NotNull
    public static final s5.a H(@NotNull LocalImageComponent localImageComponent, @NotNull z5 uiComponentHelper, int i10, int i11, @NotNull final String[] originalStrokeColors, @NotNull final String[] originalFillColors, @NotNull final LocalImage config) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getStyles() != null) {
            final br.g gVarC = br.g.c(uiComponentHelper.getLayoutInflater());
            gVarC.b.setAnimation(i10);
            uiComponentHelper.d(new Function0() { // from class: qr.u3
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d4.I(gVarC, config, originalStrokeColors, originalFillColors);
                }
            });
            Intrinsics.checkNotNull(gVarC);
            return gVarC;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(jq.c.f20853f);
        final br.h hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
        hVarC.b.setImageResource(i11);
        uiComponentHelper.d(new Function0() { // from class: qr.v3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d4.J(hVarC, dimension);
            }
        });
        Intrinsics.checkNotNull(hVarC);
        return hVarC;
    }

    public static final Unit I(br.g gVar, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), strArr, strArr2, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit J(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0619  */
    /* JADX WARN: Code duplicated, block: B:81:0x061e A[RETURN] */
    @Nullable
    public static final View K(@NotNull LocalImageComponent localImageComponent, @NotNull z5 uiComponentHelper, @NotNull final LocalImage config) {
        s5.a aVarH;
        final br.h hVarC;
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        final int dimension = (int) context.getResources().getDimension(jq.c.b);
        final int dimension2 = (int) context.getResources().getDimension(jq.c.f20852e);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : a.f30259a[imageKey.ordinal()]) {
            case -1:
                aVarH = null;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 0:
            default:
                throw new zt.l();
            case 1:
                if (config.getStyles() != null) {
                    final br.g gVarC = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC.b.setAnimation(xq.v.f37065n);
                    uiComponentHelper.d(new Function0() { // from class: qr.w2
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.L(gVarC, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC);
                    aVarH = gVarC;
                } else {
                    final br.h hVarC2 = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC2.b.setImageResource(xq.s.f37015q);
                    uiComponentHelper.d(new Function0() { // from class: qr.y2
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.Y(hVarC2, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC2);
                    aVarH = hVarC2;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 2:
                if (config.getStyles() != null) {
                    final br.g gVarC2 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC2.b.setAnimation(xq.v.f37054c);
                    uiComponentHelper.d(new Function0() { // from class: qr.k3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.h0(gVarC2, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC2);
                    aVarH = gVarC2;
                } else {
                    final br.h hVarC3 = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC3.b.setImageResource(xq.s.f37010l);
                    uiComponentHelper.d(new Function0() { // from class: qr.m3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.p0(hVarC3, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC3);
                    aVarH = hVarC3;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 3:
                final br.g gVarC3 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC3.b.setAnimation(xq.v.f37066o);
                uiComponentHelper.d(new Function0() { // from class: qr.n3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.M(gVarC3);
                    }
                });
                gVarC3.b.j(new g7.n0() { // from class: qr.o3
                    @Override // g7.n0
                    public final void a(g7.i iVar) {
                        d4.N(gVarC3, iVar);
                    }
                });
                aVarH = gVarC3;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 4:
                if (config.getStyles() != null) {
                    final br.g gVarC4 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC4.b.setAnimation(xq.v.f37064m);
                    uiComponentHelper.d(new Function0() { // from class: qr.p3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.O(gVarC4, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC4);
                    aVarH = gVarC4;
                } else {
                    hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(xq.s.f37014p);
                    uiComponentHelper.d(new Function0() { // from class: qr.q3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.P(hVarC, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                    aVarH = hVarC;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 5:
                if (config.getStyles() != null) {
                    final br.g gVarC5 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC5.b.setAnimation(xq.v.f37063l);
                    uiComponentHelper.d(new Function0() { // from class: qr.r3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.Q(gVarC5, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC5);
                    aVarH = gVarC5;
                } else {
                    hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(xq.s.f37013o);
                    uiComponentHelper.d(new Function0() { // from class: qr.t3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.R(hVarC, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                    aVarH = hVarC;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 6:
                if (config.getStyles() != null) {
                    final br.g gVarC6 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC6.b.setAnimation(xq.v.f37062k);
                    uiComponentHelper.d(new Function0() { // from class: qr.h3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.S(gVarC6, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC6);
                    aVarH = gVarC6;
                } else {
                    hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(xq.s.f37012n);
                    uiComponentHelper.d(new Function0() { // from class: qr.s3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.T(hVarC, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                    aVarH = hVarC;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 7:
                if (config.getStyles() != null) {
                    final br.g gVarC7 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC7.b.setAnimation(xq.v.f37053a);
                    uiComponentHelper.d(new Function0() { // from class: qr.w3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.U(gVarC7, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC7);
                    aVarH = gVarC7;
                } else {
                    hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(xq.s.f37008j);
                    uiComponentHelper.d(new Function0() { // from class: qr.x3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.V(hVarC, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                    aVarH = hVarC;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 8:
                if (config.getStyles() != null) {
                    final br.g gVarC8 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC8.b.setAnimation(xq.v.B);
                    uiComponentHelper.d(new Function0() { // from class: qr.y3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.W(gVarC8, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC8);
                    aVarH = gVarC8;
                } else {
                    hVarC = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC.b.setImageResource(xq.s.f37017s);
                    uiComponentHelper.d(new Function0() { // from class: qr.z3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.X(hVarC, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC);
                    aVarH = hVarC;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 9:
                if (config.getStyles() != null) {
                    final br.g gVarC9 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC9.b.setAnimation(xq.v.b);
                    uiComponentHelper.d(new Function0() { // from class: qr.a4
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.Z(gVarC9, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC9);
                    aVarH = gVarC9;
                } else {
                    final br.h hVarC4 = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC4.b.setImageResource(xq.s.f37009k);
                    uiComponentHelper.d(new Function0() { // from class: qr.b4
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.a0(hVarC4, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC4);
                    aVarH = hVarC4;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 10:
                if (config.getStyles() != null) {
                    final br.g gVarC10 = br.g.c(uiComponentHelper.getLayoutInflater());
                    gVarC10.b.setAnimation(xq.v.A);
                    uiComponentHelper.d(new Function0() { // from class: qr.c4
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.b0(gVarC10, config);
                        }
                    });
                    Intrinsics.checkNotNull(gVarC10);
                    aVarH = gVarC10;
                } else {
                    final br.h hVarC5 = br.h.c(uiComponentHelper.getLayoutInflater());
                    hVarC5.b.setImageResource(xq.s.f37016r);
                    uiComponentHelper.d(new Function0() { // from class: qr.x2
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.c0(hVarC5, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(hVarC5);
                    aVarH = hVarC5;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 11:
                final br.g gVarC11 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC11.b.setAnimation(xq.v.f37076y);
                ThemeableLottieAnimationView lottieView = gVarC11.b;
                Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                yr.g.j(lottieView, config.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, null, new String[]{"#FFFFFF"}, 8, null);
                uiComponentHelper.d(new Function0() { // from class: qr.z2
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.d0(gVarC11);
                    }
                });
                aVarH = gVarC11;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 12:
                final br.g gVarC12 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC12.b.setAnimation(xq.v.f37077z);
                ThemeableLottieAnimationView lottieView2 = gVarC12.b;
                Intrinsics.checkNotNullExpressionValue(lottieView2, "lottieView");
                yr.g.j(lottieView2, config.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: qr.a3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.e0(gVarC12);
                    }
                });
                aVarH = gVarC12;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 13:
                final br.g gVarC13 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC13.b.setAnimation(jq.f.f20866k);
                ThemeableLottieAnimationView lottieView3 = gVarC13.b;
                Intrinsics.checkNotNullExpressionValue(lottieView3, "lottieView");
                yr.g.j(lottieView3, config.getStyles(), new String[]{"#280087"}, new String[0], null, new String[0], 8, null);
                uiComponentHelper.d(new Function0() { // from class: qr.b3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.f0(gVarC13);
                    }
                });
                aVarH = gVarC13;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 14:
                final br.g gVarC14 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC14.b.setAnimation(xq.v.f37055d);
                ThemeableLottieAnimationView lottieView4 = gVarC14.b;
                Intrinsics.checkNotNullExpressionValue(lottieView4, "lottieView");
                yr.g.i(lottieView4, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.c3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.g0(gVarC14);
                    }
                });
                aVarH = gVarC14;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 15:
                final br.g gVarC15 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC15.b.setAnimation(xq.v.f37058g);
                ThemeableLottieAnimationView lottieView5 = gVarC15.b;
                Intrinsics.checkNotNullExpressionValue(lottieView5, "lottieView");
                yr.g.i(lottieView5, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.d3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.i0(gVarC15);
                    }
                });
                aVarH = gVarC15;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 16:
                final br.g gVarC16 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC16.b.setAnimation(xq.v.f37059h);
                ThemeableLottieAnimationView lottieView6 = gVarC16.b;
                Intrinsics.checkNotNullExpressionValue(lottieView6, "lottieView");
                yr.g.i(lottieView6, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.e3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.j0(gVarC16);
                    }
                });
                aVarH = gVarC16;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 17:
                final br.g gVarC17 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC17.b.setAnimation(xq.v.f37056e);
                ThemeableLottieAnimationView lottieView7 = gVarC17.b;
                Intrinsics.checkNotNullExpressionValue(lottieView7, "lottieView");
                yr.g.i(lottieView7, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC", "#7379FD"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.f3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.k0(gVarC17);
                    }
                });
                aVarH = gVarC17;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case MlKitException.UNSUPPORTED /* 18 */:
                final br.g gVarC18 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC18.b.setAnimation(xq.v.f37061j);
                ThemeableLottieAnimationView lottieView8 = gVarC18.b;
                Intrinsics.checkNotNullExpressionValue(lottieView8, "lottieView");
                yr.g.i(lottieView8, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.g3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.l0(gVarC18);
                    }
                });
                aVarH = gVarC18;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 19:
                final br.g gVarC19 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC19.b.setAnimation(xq.v.f37060i);
                ThemeableLottieAnimationView lottieView9 = gVarC19.b;
                Intrinsics.checkNotNullExpressionValue(lottieView9, "lottieView");
                yr.g.i(lottieView9, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.i3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.m0(gVarC19);
                    }
                });
                aVarH = gVarC19;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 20:
                final br.g gVarC20 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC20.b.setAnimation(xq.v.f37057f);
                ThemeableLottieAnimationView lottieView10 = gVarC20.b;
                Intrinsics.checkNotNullExpressionValue(lottieView10, "lottieView");
                yr.g.i(lottieView10, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.d(new Function0() { // from class: qr.j3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d4.n0(gVarC20);
                    }
                });
                aVarH = gVarC20;
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 21:
                final br.g gVarC21 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC21.b.setImageResource(or.e.f28409a);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView11 = gVarC21.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView11, "lottieView");
                    yr.g.e(lottieView11, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                    aVarH = gVarC21;
                } else {
                    uiComponentHelper.d(new Function0() { // from class: qr.l3
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.o0(gVarC21);
                        }
                    });
                    aVarH = gVarC21;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 22:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37067p, xq.s.f37000a, new String[0], new String[0], config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 23:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37068q, xq.s.b, new String[]{"#000000"}, new String[0], config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 24:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37069r, xq.s.f37001c, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 25:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37070s, xq.s.f37002d, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 26:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37071t, xq.s.f37003e, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 27:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37072u, xq.s.f37004f, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 28:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37073v, xq.s.f37005g, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 29:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37074w, xq.s.f37006h, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                aVarH = H(localImageComponent, uiComponentHelper, xq.v.f37075x, xq.s.f37007i, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
            case 31:
                br.g gVarC22 = br.g.c(uiComponentHelper.getLayoutInflater());
                gVarC22.b.setImageResource(or.e.f28411d);
                aVarH = gVarC22;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView12 = gVarC22.b;
                    Intrinsics.checkNotNullExpressionValue(lottieView12, "lottieView");
                    yr.g.e(lottieView12, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                    aVarH = gVarC22;
                }
                if (aVarH != null) {
                    return aVarH.getRoot();
                }
                return null;
        }
    }

    public static final Unit L(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f21506a;
    }

    public static final Unit M(br.g gVar) {
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
        return Unit.f21506a;
    }

    public static final void N(br.g gVar, g7.i iVar) {
        gVar.b.v();
    }

    public static final Unit O(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit P(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit Q(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit R(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit S(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit T(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit U(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#180052"}, new String[0], null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f21506a;
    }

    public static final Unit V(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit W(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit X(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit Y(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit Z(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final Unit a0(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit b0(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, null, new String[]{"#AA84FF"}, 8, null);
        return Unit.f21506a;
    }

    public static final Unit c0(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit d0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit e0(br.g gVar) {
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
        return Unit.f21506a;
    }

    public static final Unit f0(br.g gVar) {
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
        return Unit.f21506a;
    }

    public static final Unit g0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit h0(br.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        yr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f21506a;
    }

    public static final Unit i0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit j0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit k0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit l0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit m0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit n0(br.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f21506a;
    }

    public static final Unit o0(br.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) xq.j.a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit p0(br.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }
}
