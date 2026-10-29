package com.withpersona.sdk2.inquiry.governmentid;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import fn.AamvaExtraction;
import io.j2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00101\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u000204*\u000207¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020;*\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "", "countryCode", "", "defaultManualCaptureDelayMs", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lpo/b;", Payload.TYPE, "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lpo/b;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "b", "(J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;)Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "Lio/j2;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lio/j2;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "currentSide", "c", "(Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "l", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lfn/e;", "m", "(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10875a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f10876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f10877d;

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
            f10875a = iArr;
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
            b = iArr2;
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
            f10876c = iArr3;
            int[] iArr4 = new int[IdConfig.b.values().length];
            try {
                iArr4[IdConfig.b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.b.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.b.FrontOrBack.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f10877d = iArr4;
        }
    }

    public static final IdConfig.AutoCaptureConfig a(IdConfig.b bVar) {
        int i10 = a.f10877d[bVar.ordinal()];
        if (i10 == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(kotlin.collections.o.d(new AutoCaptureRule.FrontRule(false, 1, null))));
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(kotlin.collections.o.d(new AutoCaptureRule.FrontOrBackRule(false, 1, null))));
            }
            if (i10 == 5) {
                return new IdConfig.AutoCaptureConfig(null, 1, null);
            }
            throw new jt.l();
        }
        return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(kotlin.collections.o.d(new AutoCaptureRule.BarcodePdf417Rule(false, 1, null))));
    }

    public static final IdConfig.ManualCaptureConfig b(long j10) {
        return new IdConfig.ManualCaptureConfig(true, j10);
    }

    public static final Screen.Overlay c(po.b bVar, IdConfig.b bVar2, String str) {
        if (bVar2 == IdConfig.b.BarcodePdf417) {
            return Screen.Overlay.Barcode.f10709a;
        }
        if (bVar2 == IdConfig.b.PassportSignature) {
            return Screen.Overlay.Rectangle.f10714a;
        }
        po.b bVar3 = po.b.DriverLicense;
        if (bVar == bVar3 && bVar2 == IdConfig.b.Back && Intrinsics.c(str, "US")) {
            return Screen.Overlay.Barcode.f10709a;
        }
        if (bVar != po.b.Passport && bVar != po.b.Visa) {
            if (bVar != bVar3 && bVar != po.b.StateID && bVar != po.b.ResidencyPermit) {
                return Screen.Overlay.Rectangle.f10714a;
            }
            return Screen.Overlay.GenericFront.f10712a;
        }
        return Screen.Overlay.Passport.f10713a;
    }

    public static final boolean d(CapturePageConfig.RuleSet ruleSet) {
        boolean z10;
        boolean z11;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            z10 = true;
            z11 = false;
            for (CapturePageConfig.Rule rule : rules) {
                if (Intrinsics.c(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
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

    public static final AutoCaptureRule e(CapturePageConfig.Rule rule) {
        CapturePageConfig.RuleType type = rule.getType();
        int i10 = type == null ? -1 : a.f10875a[type.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return new AutoCaptureRule.FrontRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 2) {
            return new AutoCaptureRule.FrontOrBackRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 3) {
            return new AutoCaptureRule.BarcodePdf417Rule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 4) {
            return new AutoCaptureRule.MrzRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 5) {
            return new AutoCaptureRule.TextExtractionRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        throw new jt.l();
    }

    public static final AutoCaptureRuleSet f(CapturePageConfig.RuleSet ruleSet) {
        List listK;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            listK = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                AutoCaptureRule autoCaptureRuleE = e((CapturePageConfig.Rule) it.next());
                if (autoCaptureRuleE != null) {
                    listK.add(autoCaptureRuleE);
                }
            }
        } else {
            listK = kotlin.collections.p.k();
        }
        return new AutoCaptureRuleSet(listK);
    }

    @Nullable
    public static final IdConfig.AutoCaptureConfig g(@NotNull CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
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
        } while (!d((CapturePageConfig.RuleSet) next));
        CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
        return ruleSet == null ? new IdConfig.AutoCaptureConfig(null, 1, null) : new IdConfig.AutoCaptureConfig(f(ruleSet));
    }

    @Nullable
    public static final IdConfig.IdSideConfig h(@Nullable CapturePageConfig capturePageConfig, @NotNull IdConfig.b side, @NotNull po.b type, @NotNull String countryCode, long j10) {
        IdConfig.AutoCaptureConfig autoCaptureConfigA;
        IdConfig.ManualCaptureConfig manualCaptureConfigB;
        Screen.Overlay overlayC;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null || (autoCaptureConfigA = g(autoCaptureConfig)) == null) {
            autoCaptureConfigA = a(side);
        }
        if (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null || (manualCaptureConfigB = i(manualCaptureConfig, j10)) == null) {
            manualCaptureConfigB = b(j10);
        }
        IdConfig.ManualCaptureConfig manualCaptureConfig2 = manualCaptureConfigB;
        if (autoCaptureConfigA.getRuleSet().a().isEmpty() && !manualCaptureConfig2.getIsEnabled()) {
            return null;
        }
        String key = side.getKey();
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null || (overlayC = j(overlay)) == null) {
            overlayC = c(type, side, countryCode);
        }
        return new IdConfig.IdSideConfig(key, side, overlayC, autoCaptureConfigA, manualCaptureConfig2);
    }

    @NotNull
    public static final IdConfig.ManualCaptureConfig i(@NotNull CapturePageConfig.ManualCaptureConfig manualCaptureConfig, long j10) {
        Intrinsics.checkNotNullParameter(manualCaptureConfig, "<this>");
        Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        Long delayMs = manualCaptureConfig.getDelayMs();
        if (delayMs != null) {
            j10 = delayMs.longValue();
        }
        return new IdConfig.ManualCaptureConfig(zBooleanValue, j10);
    }

    public static final Screen.Overlay j(CapturePageConfig.OverlayConfig overlayConfig) {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new Screen.Overlay.Custom(overlay);
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : a.b[overlayFallback.ordinal()]) {
            case -1:
                return Screen.Overlay.Rectangle.f10714a;
            case 0:
            default:
                throw new jt.l();
            case 1:
                return Screen.Overlay.Barcode.f10709a;
            case 2:
                return Screen.Overlay.Passport.f10713a;
            case 3:
                return Screen.Overlay.GenericFront.f10712a;
            case 4:
                return Screen.Overlay.Barcode.f10709a;
            case 5:
                return Screen.Overlay.CornersOnly.f10710a;
            case 6:
                return Screen.Overlay.Rectangle.f10714a;
        }
    }

    @NotNull
    public static final AutoClassificationConfig k(@Nullable NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j10) {
        CapturePageConfig capturePageConfig;
        AutoClassificationConfig.Companion companion = AutoClassificationConfig.INSTANCE;
        IdConfig.IdSideConfig idSideConfigH = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigH = h(capturePageConfig, IdConfig.b.Front, po.b.Unknown, "", j10);
        }
        return companion.b(boolIsEnabled, extractTextFromImage, idSideConfigH);
    }

    @NotNull
    public static final GovernmentIdDetails l(@NotNull ExtractedTexts extractedTexts) {
        Intrinsics.checkNotNullParameter(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    @NotNull
    public static final GovernmentIdDetails m(@NotNull fn.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof fn.e.MrzBarcodeInfo) {
            fn.e.MrzBarcodeInfo mrzBarcodeInfo = (fn.e.MrzBarcodeInfo) eVar;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(eVar instanceof fn.e.Pdf417BarcodeInfo)) {
            throw new jt.l();
        }
        fn.e.Pdf417BarcodeInfo pdf417BarcodeInfo = (fn.e.Pdf417BarcodeInfo) eVar;
        AamvaExtraction aamvaExtractionB = pdf417BarcodeInfo.b();
        Date birthdate = aamvaExtractionB != null ? aamvaExtractionB.getBirthdate() : null;
        AamvaExtraction aamvaExtractionB2 = pdf417BarcodeInfo.b();
        return new GovernmentIdDetails(birthdate, aamvaExtractionB2 != null ? aamvaExtractionB2.getExpirationDate() : null);
    }

    public static final j2 n(Id.IdLocalIcon idLocalIcon) {
        int i10 = idLocalIcon == null ? -1 : a.f10876c[idLocalIcon.ordinal()];
        if (i10 == -1) {
            return j2.Card;
        }
        if (i10 == 1) {
            return j2.World;
        }
        if (i10 == 2) {
            return j2.Card;
        }
        if (i10 == 3) {
            return j2.Flag;
        }
        if (i10 == 4) {
            return j2.House;
        }
        throw new jt.l();
    }

    @Nullable
    public static final IdConfig o(@NotNull Id id2, @NotNull String countryCode, long j10) {
        j2 j2VarC;
        String str;
        long j11;
        IdConfig.IdSideConfig idSideConfigH;
        Intrinsics.checkNotNullParameter(id2, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        po.b bVarA = po.b.INSTANCE.a(id2.getClass());
        if (bVarA == po.b.Unknown && !id2.isDynamicGovId()) {
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
        ArrayList arrayList = new ArrayList(q.u(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.b bVarA2 = IdConfig.b.INSTANCE.a(str2);
            if (bVarA2 == null || (idSideConfigH = h((CapturePageConfig) linkedHashMap.get(str2), bVarA2, bVarA, (str = countryCode), (j11 = j10))) == null) {
                return null;
            }
            arrayList.add(idSideConfigH);
            countryCode = str;
            j10 = j11;
        }
        String str3 = id2.getClass();
        if (id2.isDynamicGovId()) {
            Id.IdIcon icon = id2.getIcon();
            j2VarC = n(icon != null ? icon.getIconFallback() : null);
        } else {
            j2VarC = bVarA.c();
        }
        ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(new IdPart.SideIdPart(((IdConfig.IdSideConfig) obj).getSide()));
        }
        return new IdConfig(str3, j2VarC, arrayList, arrayList2, bVarA);
    }
}
