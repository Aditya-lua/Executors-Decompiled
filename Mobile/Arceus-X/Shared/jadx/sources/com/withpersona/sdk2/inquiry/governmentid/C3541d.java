package com.withpersona.sdk2.inquiry.governmentid;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import io.EnumC6879j2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AamvaExtraction;
import p132fn.AbstractC5679e;
import p229jt.C7345l;
import p361po.EnumC10302b;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00101\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u000204*\u000207¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020;*\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=¨\u0006>"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "", "countryCode", "", "defaultManualCaptureDelayMs", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lpo/b;", Payload.TYPE, "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lpo/b;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "b", "(J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;)Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "Lio/j2;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lio/j2;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "currentSide", "c", "(Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "l", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lfn/e;", "m", "(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3541d {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14044a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14045b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f14046c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f14047d;

        static {
            int[] iArr = new int[CapturePageConfig.RuleType.values().length];
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14044a = iArr;
            int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f14045b = iArr2;
            int[] iArr3 = new int[Id.IdLocalIcon.values().length];
            try {
                iArr3[Id.IdLocalIcon.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Id.IdLocalIcon.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Id.IdLocalIcon.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Id.IdLocalIcon.HOUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f14046c = iArr3;
            int[] iArr4 = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr4[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.EnumC3514b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.EnumC3514b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f14047d = iArr4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final IdConfig.AutoCaptureConfig m17512a(IdConfig.EnumC3514b enumC3514b) {
        int i10 = a.f14047d[enumC3514b.ordinal()];
        if (i10 == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(C7697o.m31878d(new AutoCaptureRule.FrontRule(false, 1, null))));
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(C7697o.m31878d(new AutoCaptureRule.FrontOrBackRule(false, 1, null))));
            }
            if (i10 == 5) {
                return new IdConfig.AutoCaptureConfig(null, 1, null);
            }
            throw new C7345l();
        }
        return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(C7697o.m31878d(new AutoCaptureRule.BarcodePdf417Rule(false, 1, null))));
    }

    /* JADX INFO: renamed from: b */
    public static final IdConfig.ManualCaptureConfig m17513b(long j10) {
        return new IdConfig.ManualCaptureConfig(true, j10);
    }

    /* JADX INFO: renamed from: c */
    public static final Screen.Overlay m17514c(EnumC10302b enumC10302b, IdConfig.EnumC3514b enumC3514b, String str) {
        if (enumC3514b == IdConfig.EnumC3514b.BarcodePdf417) {
            return Screen.Overlay.Barcode.f13846a;
        }
        if (enumC3514b == IdConfig.EnumC3514b.PassportSignature) {
            return Screen.Overlay.Rectangle.f13852a;
        }
        EnumC10302b enumC10302b2 = EnumC10302b.DriverLicense;
        if (enumC10302b == enumC10302b2 && enumC3514b == IdConfig.EnumC3514b.Back && Intrinsics.m31980c(str, "US")) {
            return Screen.Overlay.Barcode.f13846a;
        }
        if (enumC10302b != EnumC10302b.Passport && enumC10302b != EnumC10302b.Visa) {
            if (enumC10302b != enumC10302b2 && enumC10302b != EnumC10302b.StateID && enumC10302b != EnumC10302b.ResidencyPermit) {
                return Screen.Overlay.Rectangle.f13852a;
            }
            return Screen.Overlay.GenericFront.f13850a;
        }
        return Screen.Overlay.Passport.f13851a;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m17515d(CapturePageConfig.RuleSet ruleSet) {
        boolean z10;
        boolean z11;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            z10 = true;
            z11 = false;
            for (CapturePageConfig.Rule rule : rules) {
                if (Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                    z10 = false;
                } else if (rule.getType() != null) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
        }
        return z10 && z11;
    }

    /* JADX INFO: renamed from: e */
    public static final AutoCaptureRule m17516e(CapturePageConfig.Rule rule) {
        CapturePageConfig.RuleType type = rule.getType();
        int i10 = type == null ? -1 : a.f14044a[type.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return new AutoCaptureRule.FrontRule(Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 2) {
            return new AutoCaptureRule.FrontOrBackRule(Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 3) {
            return new AutoCaptureRule.BarcodePdf417Rule(Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 4) {
            return new AutoCaptureRule.MrzRule(Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 5) {
            return new AutoCaptureRule.TextExtractionRule(Intrinsics.m31980c(rule.isRequired(), Boolean.TRUE));
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: f */
    public static final AutoCaptureRuleSet m17517f(CapturePageConfig.RuleSet ruleSet) {
        List listM31892k;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            listM31892k = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                AutoCaptureRule autoCaptureRuleM17516e = m17516e((CapturePageConfig.Rule) it.next());
                if (autoCaptureRuleM17516e != null) {
                    listM31892k.add(autoCaptureRuleM17516e);
                }
            }
        } else {
            listM31892k = C7699p.m31892k();
        }
        return new AutoCaptureRuleSet(listM31892k);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final IdConfig.AutoCaptureConfig m17518g(@NotNull CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
        Object next;
        Intrinsics.checkNotNullParameter(autoCaptureConfig, "<this>");
        List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig.getRuleSets();
        if (ruleSets == null) {
            return null;
        }
        if (ruleSets.isEmpty()) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        Iterator<T> it = ruleSets.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m17515d((CapturePageConfig.RuleSet) next));
        CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
        return ruleSet == null ? new IdConfig.AutoCaptureConfig(null, 1, null) : new IdConfig.AutoCaptureConfig(m17517f(ruleSet));
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final IdConfig.IdSideConfig m17519h(@Nullable CapturePageConfig capturePageConfig, @NotNull IdConfig.EnumC3514b side, @NotNull EnumC10302b type, @NotNull String countryCode, long j10) {
        IdConfig.AutoCaptureConfig autoCaptureConfigM17512a;
        IdConfig.ManualCaptureConfig manualCaptureConfigM17513b;
        Screen.Overlay overlayM17514c;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null || (autoCaptureConfigM17512a = m17518g(autoCaptureConfig)) == null) {
            autoCaptureConfigM17512a = m17512a(side);
        }
        if (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null || (manualCaptureConfigM17513b = m17520i(manualCaptureConfig, j10)) == null) {
            manualCaptureConfigM17513b = m17513b(j10);
        }
        IdConfig.ManualCaptureConfig manualCaptureConfig2 = manualCaptureConfigM17513b;
        if (autoCaptureConfigM17512a.getRuleSet().m16167a().isEmpty() && !manualCaptureConfig2.getIsEnabled()) {
            return null;
        }
        String key = side.getKey();
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null || (overlayM17514c = m17521j(overlay)) == null) {
            overlayM17514c = m17514c(type, side, countryCode);
        }
        return new IdConfig.IdSideConfig(key, side, overlayM17514c, autoCaptureConfigM17512a, manualCaptureConfig2);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final IdConfig.ManualCaptureConfig m17520i(@NotNull CapturePageConfig.ManualCaptureConfig manualCaptureConfig, long j10) {
        Intrinsics.checkNotNullParameter(manualCaptureConfig, "<this>");
        Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        Long delayMs = manualCaptureConfig.getDelayMs();
        if (delayMs != null) {
            j10 = delayMs.longValue();
        }
        return new IdConfig.ManualCaptureConfig(zBooleanValue, j10);
    }

    /* JADX INFO: renamed from: j */
    public static final Screen.Overlay m17521j(CapturePageConfig.OverlayConfig overlayConfig) {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new Screen.Overlay.Custom(overlay);
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : a.f14045b[overlayFallback.ordinal()]) {
            case -1:
                return Screen.Overlay.Rectangle.f13852a;
            case 0:
            default:
                throw new C7345l();
            case 1:
                return Screen.Overlay.Barcode.f13846a;
            case 2:
                return Screen.Overlay.Passport.f13851a;
            case 3:
                return Screen.Overlay.GenericFront.f13850a;
            case 4:
                return Screen.Overlay.Barcode.f13846a;
            case 5:
                return Screen.Overlay.CornersOnly.f13847a;
            case 6:
                return Screen.Overlay.Rectangle.f13852a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final AutoClassificationConfig m17522k(@Nullable NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j10) {
        CapturePageConfig capturePageConfig;
        AutoClassificationConfig.Companion companion = AutoClassificationConfig.INSTANCE;
        IdConfig.IdSideConfig idSideConfigM17519h = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigM17519h = m17519h(capturePageConfig, IdConfig.EnumC3514b.Front, EnumC10302b.Unknown, "", j10);
        }
        return companion.m17502b(boolIsEnabled, extractTextFromImage, idSideConfigM17519h);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final GovernmentIdDetails m17523l(@NotNull ExtractedTexts extractedTexts) {
        Intrinsics.checkNotNullParameter(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final GovernmentIdDetails m17524m(@NotNull AbstractC5679e abstractC5679e) {
        Intrinsics.checkNotNullParameter(abstractC5679e, "<this>");
        if (abstractC5679e instanceof AbstractC5679e.MrzBarcodeInfo) {
            AbstractC5679e.MrzBarcodeInfo mrzBarcodeInfo = (AbstractC5679e.MrzBarcodeInfo) abstractC5679e;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(abstractC5679e instanceof AbstractC5679e.Pdf417BarcodeInfo)) {
            throw new C7345l();
        }
        AbstractC5679e.Pdf417BarcodeInfo pdf417BarcodeInfo = (AbstractC5679e.Pdf417BarcodeInfo) abstractC5679e;
        AamvaExtraction aamvaExtractionM25789b = pdf417BarcodeInfo.m25789b();
        Date birthdate = aamvaExtractionM25789b != null ? aamvaExtractionM25789b.getBirthdate() : null;
        AamvaExtraction aamvaExtractionM25789b2 = pdf417BarcodeInfo.m25789b();
        return new GovernmentIdDetails(birthdate, aamvaExtractionM25789b2 != null ? aamvaExtractionM25789b2.getExpirationDate() : null);
    }

    /* JADX INFO: renamed from: n */
    public static final EnumC6879j2 m17525n(Id.IdLocalIcon idLocalIcon) {
        int i10 = idLocalIcon == null ? -1 : a.f14046c[idLocalIcon.ordinal()];
        if (i10 == -1) {
            return EnumC6879j2.Card;
        }
        if (i10 == 1) {
            return EnumC6879j2.World;
        }
        if (i10 == 2) {
            return EnumC6879j2.Card;
        }
        if (i10 == 3) {
            return EnumC6879j2.Flag;
        }
        if (i10 == 4) {
            return EnumC6879j2.House;
        }
        throw new C7345l();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final IdConfig m17526o(@NotNull Id id2, @NotNull String countryCode, long j10) {
        EnumC6879j2 enumC6879j2M39579c;
        String str;
        long j11;
        IdConfig.IdSideConfig idSideConfigM17519h;
        Intrinsics.checkNotNullParameter(id2, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        EnumC10302b enumC10302bM39580a = EnumC10302b.INSTANCE.m39580a(id2.getClass());
        if (enumC10302bM39580a == EnumC10302b.Unknown && !id2.isDynamicGovId()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CapturePageConfig> capturePageConfigs = id2.getCapturePageConfigs();
        if (capturePageConfigs != null) {
            for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                String side = capturePageConfig.getSide();
                if (side != null) {
                    linkedHashMap.put(side, capturePageConfig);
                }
            }
        }
        List<String> requiresSides = id2.getRequiresSides();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.EnumC3514b enumC3514bM17297a = IdConfig.EnumC3514b.INSTANCE.m17297a(str2);
            if (enumC3514bM17297a == null || (idSideConfigM17519h = m17519h((CapturePageConfig) linkedHashMap.get(str2), enumC3514bM17297a, enumC10302bM39580a, (str = countryCode), (j11 = j10))) == null) {
                return null;
            }
            arrayList.add(idSideConfigM17519h);
            countryCode = str;
            j10 = j11;
        }
        String str3 = id2.getClass();
        if (id2.isDynamicGovId()) {
            Id.IdIcon icon = id2.getIcon();
            enumC6879j2M39579c = m17525n(icon != null ? icon.getIconFallback() : null);
        } else {
            enumC6879j2M39579c = enumC10302bM39580a.m39579c();
        }
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(new IdPart.SideIdPart(((IdConfig.IdSideConfig) obj).getSide()));
        }
        return new IdConfig(str3, enumC6879j2M39579c, arrayList, arrayList2, enumC10302bM39580a);
    }
}
