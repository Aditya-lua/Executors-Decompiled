package cr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1148c;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.LocalImageComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121f7.C5452i;
import p121f7.InterfaceC5463n0;
import p226jq.C7265j;
import p226jq.C7281s;
import p226jq.C7284v;
import p227jr.C7301g;
import p229jt.C7345l;
import p313nq.C9551g;
import p313nq.C9552h;
import p402r5.InterfaceC10784a;
import p497vp.C12240c;
import p497vp.C12243f;

/* JADX INFO: renamed from: cr.p3 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", "K", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lr5/a;", "H", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lcr/y4;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lr5/a;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4297p3 {

    /* JADX INFO: renamed from: cr.p3$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18115a;

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
            f18115a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public static final InterfaceC10784a m21847H(@NotNull LocalImageComponent localImageComponent, @NotNull C4352y4 uiComponentHelper, int i10, int i11, @NotNull final String[] originalStrokeColors, @NotNull final String[] originalFillColors, @NotNull final LocalImage config) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getStyles() != null) {
            final C9551g c9551gM37689c = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
            c9551gM37689c.f34529b.setAnimation(i10);
            uiComponentHelper.m22002d(new Function0() { // from class: cr.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4297p3.m21848I(c9551gM37689c, config, originalStrokeColors, originalFillColors);
                }
            });
            Intrinsics.checkNotNull(c9551gM37689c);
            return c9551gM37689c;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(C12240c.f43198f);
        final C9552h c9552hM37693c = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
        c9552hM37693c.f34531b.setImageResource(i11);
        uiComponentHelper.m22002d(new Function0() { // from class: cr.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4297p3.m21849J(c9552hM37693c, dimension);
            }
        });
        Intrinsics.checkNotNull(c9552hM37693c);
        return c9552hM37693c;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m21848I(C9551g c9551g, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), strArr, strArr2, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m21849J(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0619  */
    /* JADX WARN: Code duplicated, block: B:81:0x061e A[RETURN] */
    @Nullable
    /* JADX INFO: renamed from: K */
    public static final View m21850K(@NotNull LocalImageComponent localImageComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final LocalImage config) {
        InterfaceC10784a interfaceC10784aM21847H;
        final C9552h c9552hM37693c;
        final C9551g c9551gM37689c;
        final C9552h c9552hM37693c2;
        final C9551g c9551gM37689c2;
        final C9552h c9552hM37693c3;
        final C9551g c9551gM37689c3;
        final C9551g c9551gM37689c4;
        final C9551g c9551gM37689c5;
        final C9551g c9551gM37689c6;
        final C9551g c9551gM37689c7;
        final C9552h c9552hM37693c4;
        final C9551g c9551gM37689c8;
        final C9552h c9552hM37693c5;
        final C9551g c9551gM37689c9;
        final C9551g c9551gM37689c10;
        C9551g c9551gM37689c11;
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        final int dimension = (int) context.getResources().getDimension(C12240c.f43194b);
        final int dimension2 = (int) context.getResources().getDimension(C12240c.f43197e);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : a.f18115a[imageKey.ordinal()]) {
            case -1:
                interfaceC10784aM21847H = null;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 0:
            default:
                throw new C7345l();
            case 1:
                if (config.getStyles() != null) {
                    c9551gM37689c = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c.f34529b.setAnimation(C7284v.f28112n);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21851L(c9551gM37689c, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c);
                } else {
                    c9552hM37693c = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c.f34531b.setImageResource(C7281s.f28056q);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.k2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21864Y(c9552hM37693c, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c);
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 2:
                if (config.getStyles() != null) {
                    c9551gM37689c2 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c2.f34529b.setAnimation(C7284v.f28101c);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.w2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21881h0(c9551gM37689c2, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c2);
                } else {
                    c9552hM37693c2 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c2.f34531b.setImageResource(C7281s.f28051l);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.y2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21897p0(c9552hM37693c2, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c2);
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 3:
                final C9551g c9551gM37689c12 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c12.f34529b.setAnimation(C7284v.f28113o);
                uiComponentHelper.m22002d(new Function0() { // from class: cr.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21852M(c9551gM37689c12);
                    }
                });
                c9551gM37689c12.f34529b.m8422j(new InterfaceC5463n0() { // from class: cr.a3
                    @Override // p121f7.InterfaceC5463n0
                    /* JADX INFO: renamed from: a */
                    public final void mo21732a(C5452i c5452i) {
                        C4297p3.m21853N(c9551gM37689c12, c5452i);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c12;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 4:
                if (config.getStyles() != null) {
                    c9551gM37689c3 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c3.f34529b.setAnimation(C7284v.f28111m);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.b3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21854O(c9551gM37689c3, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c3);
                } else {
                    c9552hM37693c3 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c3.f34531b.setImageResource(C7281s.f28055p);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.c3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21855P(c9552hM37693c3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c3);
                    interfaceC10784aM21847H = c9552hM37693c3;
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 5:
                if (config.getStyles() != null) {
                    c9551gM37689c4 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c4.f34529b.setAnimation(C7284v.f28110l);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.d3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21856Q(c9551gM37689c4, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c4);
                } else {
                    c9552hM37693c3 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c3.f34531b.setImageResource(C7281s.f28054o);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.f3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21857R(c9552hM37693c3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c3);
                    interfaceC10784aM21847H = c9552hM37693c3;
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 6:
                if (config.getStyles() != null) {
                    c9551gM37689c5 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c5.f34529b.setAnimation(C7284v.f28109k);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.t2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21858S(c9551gM37689c5, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c5);
                } else {
                    c9552hM37693c3 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c3.f34531b.setImageResource(C7281s.f28053n);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.e3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21859T(c9552hM37693c3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c3);
                    interfaceC10784aM21847H = c9552hM37693c3;
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 7:
                if (config.getStyles() != null) {
                    c9551gM37689c6 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c6.f34529b.setAnimation(C7284v.f28099a);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.i3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21860U(c9551gM37689c6, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c6);
                } else {
                    c9552hM37693c3 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c3.f34531b.setImageResource(C7281s.f28049j);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.j3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21861V(c9552hM37693c3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c3);
                    interfaceC10784aM21847H = c9552hM37693c3;
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 8:
                if (config.getStyles() != null) {
                    c9551gM37689c7 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c7.f34529b.setAnimation(C7284v.f28098B);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.k3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21862W(c9551gM37689c7, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c7);
                } else {
                    c9552hM37693c3 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c3.f34531b.setImageResource(C7281s.f28058s);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.l3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21863X(c9552hM37693c3, dimension2);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c3);
                    interfaceC10784aM21847H = c9552hM37693c3;
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 9:
                if (config.getStyles() != null) {
                    c9551gM37689c8 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c8.f34529b.setAnimation(C7284v.f28100b);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.m3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21865Z(c9551gM37689c8, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c8);
                } else {
                    c9552hM37693c4 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c4.f34531b.setImageResource(C7281s.f28050k);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.n3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21867a0(c9552hM37693c4, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c4);
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 10:
                if (config.getStyles() != null) {
                    c9551gM37689c9 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                    c9551gM37689c9.f34529b.setAnimation(C7284v.f28097A);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21869b0(c9551gM37689c9, config);
                        }
                    });
                    Intrinsics.checkNotNull(c9551gM37689c9);
                } else {
                    c9552hM37693c5 = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
                    c9552hM37693c5.f34531b.setImageResource(C7281s.f28057r);
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21871c0(c9552hM37693c5, dimension);
                        }
                    });
                    Intrinsics.checkNotNull(c9552hM37693c5);
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 11:
                final C9551g c9551gM37689c13 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c13.f34529b.setAnimation(C7284v.f28123y);
                ThemeableLottieAnimationView lottieView = c9551gM37689c13.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                C7301g.m30377j(lottieView, config.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, null, new String[]{"#FFFFFF"}, 8, null);
                uiComponentHelper.m22002d(new Function0() { // from class: cr.l2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21873d0(c9551gM37689c13);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c13;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 12:
                final C9551g c9551gM37689c14 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c14.f34529b.setAnimation(C7284v.f28124z);
                ThemeableLottieAnimationView lottieView2 = c9551gM37689c14.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView2, "lottieView");
                C7301g.m30377j(lottieView2, config.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, null, new String[0], 8, null);
                uiComponentHelper.m22002d(new Function0() { // from class: cr.m2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21875e0(c9551gM37689c14);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c14;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 13:
                final C9551g c9551gM37689c15 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c15.f34529b.setAnimation(C12243f.f43213k);
                ThemeableLottieAnimationView lottieView3 = c9551gM37689c15.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView3, "lottieView");
                C7301g.m30377j(lottieView3, config.getStyles(), new String[]{"#280087"}, new String[0], null, new String[0], 8, null);
                uiComponentHelper.m22002d(new Function0() { // from class: cr.n2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21877f0(c9551gM37689c15);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c15;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 14:
                final C9551g c9551gM37689c16 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c16.f34529b.setAnimation(C7284v.f28102d);
                ThemeableLottieAnimationView lottieView4 = c9551gM37689c16.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView4, "lottieView");
                C7301g.m30376i(lottieView4, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.o2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21879g0(c9551gM37689c16);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c16;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 15:
                final C9551g c9551gM37689c17 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c17.f34529b.setAnimation(C7284v.f28105g);
                ThemeableLottieAnimationView lottieView5 = c9551gM37689c17.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView5, "lottieView");
                C7301g.m30376i(lottieView5, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.p2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21883i0(c9551gM37689c17);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c17;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 16:
                final C9551g c9551gM37689c18 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c18.f34529b.setAnimation(C7284v.f28106h);
                ThemeableLottieAnimationView lottieView6 = c9551gM37689c18.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView6, "lottieView");
                C7301g.m30376i(lottieView6, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.q2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21885j0(c9551gM37689c18);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c18;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 17:
                final C9551g c9551gM37689c19 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c19.f34529b.setAnimation(C7284v.f28103e);
                ThemeableLottieAnimationView lottieView7 = c9551gM37689c19.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView7, "lottieView");
                C7301g.m30376i(lottieView7, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC", "#7379FD"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21887k0(c9551gM37689c19);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c19;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 18:
                final C9551g c9551gM37689c20 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c20.f34529b.setAnimation(C7284v.f28108j);
                ThemeableLottieAnimationView lottieView8 = c9551gM37689c20.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView8, "lottieView");
                C7301g.m30376i(lottieView8, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21889l0(c9551gM37689c20);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c20;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 19:
                final C9551g c9551gM37689c21 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c21.f34529b.setAnimation(C7284v.f28107i);
                ThemeableLottieAnimationView lottieView9 = c9551gM37689c21.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView9, "lottieView");
                C7301g.m30376i(lottieView9, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.u2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21891m0(c9551gM37689c21);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c21;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 20:
                final C9551g c9551gM37689c22 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c22.f34529b.setAnimation(C7284v.f28104f);
                ThemeableLottieAnimationView lottieView10 = c9551gM37689c22.f34529b;
                Intrinsics.checkNotNullExpressionValue(lottieView10, "lottieView");
                C7301g.m30376i(lottieView10, config.getStyles(), new String[]{"#02089B", "#02099C"}, new String[]{"#7379FC"}, new String[]{"#D2D4FF"}, new String[]{"#FFFFFF"});
                uiComponentHelper.m22002d(new Function0() { // from class: cr.v2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4297p3.m21893n0(c9551gM37689c22);
                    }
                });
                interfaceC10784aM21847H = c9551gM37689c22;
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 21:
                c9551gM37689c10 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c10.f34529b.setImageResource(C1148c.f4765a);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView11 = c9551gM37689c10.f34529b;
                    Intrinsics.checkNotNullExpressionValue(lottieView11, "lottieView");
                    C7301g.m30372e(lottieView11, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                } else {
                    uiComponentHelper.m22002d(new Function0() { // from class: cr.x2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4297p3.m21895o0(c9551gM37689c10);
                        }
                    });
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 22:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28114p, C7281s.f28040a, new String[0], new String[0], config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 23:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28115q, C7281s.f28041b, new String[]{"#000000"}, new String[0], config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 24:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28116r, C7281s.f28042c, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 25:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28117s, C7281s.f28043d, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 26:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28118t, C7281s.f28044e, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 27:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28119u, C7281s.f28045f, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 28:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28120v, C7281s.f28046g, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 29:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28121w, C7281s.f28047h, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 30:
                interfaceC10784aM21847H = m21847H(localImageComponent, uiComponentHelper, C7284v.f28122x, C7281s.f28048i, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
            case 31:
                c9551gM37689c11 = C9551g.m37689c(uiComponentHelper.getLayoutInflater());
                c9551gM37689c11.f34529b.setImageResource(C1148c.f4768d);
                interfaceC10784aM21847H = c9551gM37689c11;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView12 = c9551gM37689c11.f34529b;
                    Intrinsics.checkNotNullExpressionValue(lottieView12, "lottieView");
                    C7301g.m30372e(lottieView12, config.getStyles(), new String[0], new String[0], null, new String[0], 8, null);
                }
                if (interfaceC10784aM21847H != null) {
                    interfaceC10784aM21847H = c9552hM37693c;
                    interfaceC10784aM21847H = c9551gM37689c;
                    interfaceC10784aM21847H = c9552hM37693c2;
                    interfaceC10784aM21847H = c9551gM37689c2;
                    interfaceC10784aM21847H = c9551gM37689c3;
                    interfaceC10784aM21847H = c9551gM37689c4;
                    interfaceC10784aM21847H = c9551gM37689c5;
                    interfaceC10784aM21847H = c9551gM37689c6;
                    interfaceC10784aM21847H = c9551gM37689c7;
                    interfaceC10784aM21847H = c9552hM37693c4;
                    interfaceC10784aM21847H = c9551gM37689c8;
                    interfaceC10784aM21847H = c9552hM37693c5;
                    interfaceC10784aM21847H = c9551gM37689c9;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c10;
                    interfaceC10784aM21847H = c9551gM37689c11;
                    return interfaceC10784aM21847H.getRoot();
                }
                interfaceC10784aM21847H = c9552hM37693c;
                interfaceC10784aM21847H = c9551gM37689c;
                interfaceC10784aM21847H = c9552hM37693c2;
                interfaceC10784aM21847H = c9551gM37689c2;
                interfaceC10784aM21847H = c9551gM37689c3;
                interfaceC10784aM21847H = c9551gM37689c4;
                interfaceC10784aM21847H = c9551gM37689c5;
                interfaceC10784aM21847H = c9551gM37689c6;
                interfaceC10784aM21847H = c9551gM37689c7;
                interfaceC10784aM21847H = c9552hM37693c4;
                interfaceC10784aM21847H = c9551gM37689c8;
                interfaceC10784aM21847H = c9552hM37693c5;
                interfaceC10784aM21847H = c9551gM37689c9;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c10;
                interfaceC10784aM21847H = c9551gM37689c11;
                return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m21851L(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m21852M(C9551g c9551g) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.C0513b) {
            ((ConstraintLayout.C0513b) layoutParams).f1977V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N */
    public static final void m21853N(C9551g c9551g, C5452i c5452i) {
        c9551g.f34529b.m8434v();
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m21854O(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m21855P(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m21856Q(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m21857R(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m21858S(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m21859T(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m21860U(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#180052"}, new String[0], null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m21861V(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m21862W(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m21863X(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m21864Y(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m21865Z(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m21867a0(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m21869b0(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, null, new String[]{"#AA84FF"}, 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m21871c0(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m21873d0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m21875e0(C9551g c9551g) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.C0513b) {
            ((ConstraintLayout.C0513b) layoutParams).f1977V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m21877f0(C9551g c9551g) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.C0513b) {
            ((ConstraintLayout.C0513b) layoutParams).f1977V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m21879g0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m21881h0(C9551g c9551g, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        C7301g.m30372e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m21883i0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m21885j0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m21887k0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m21889l0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m21891m0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m21893n0(C9551g c9551g) {
        c9551g.f34529b.setRepeatMode(1);
        c9551g.f34529b.setRepeatCount(-1);
        c9551g.f34529b.m8434v();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m21895o0(C9551g c9551g) {
        ThemeableLottieAnimationView lottieView = c9551g.f34529b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) C7265j.m30285a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m21897p0(C9552h c9552h, int i10) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }
}
