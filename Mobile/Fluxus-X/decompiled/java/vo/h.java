package vo;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import sn.AamvaExtraction;
import sn.AutoCaptureRuleSet;
import sn.ExtractedTexts;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00101\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u000204*\u000207¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020;*\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", BuildConfig.FLAVOR, "countryCode", BuildConfig.FLAVOR, "defaultManualCaptureDelayMs", "Lvo/d3;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lvo/d3;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lvo/d3$e;", "side", "Ldp/e;", Payload.TYPE, "Lvo/d3$c;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;Lvo/d3$e;Ldp/e;Ljava/lang/String;J)Lvo/d3$c;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lvo/d3$a;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;)Lvo/d3$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "Lvo/d3$d;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;J)Lvo/d3$d;", "b", "(J)Lvo/d3$d;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Lsn/f;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Lsn/f;", BuildConfig.FLAVOR, "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lsn/e;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;)Lsn/e;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Lvo/y3$f;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lvo/y3$f;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "Lvo/h3;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lvo/h3;", "a", "(Lvo/d3$e;)Lvo/d3$a;", "currentSide", "c", "(Ldp/e;Lvo/d3$e;Ljava/lang/String;)Lvo/y3$f;", "Lsn/e0;", "Lvo/r;", "m", "(Lsn/e0;)Lvo/r;", "Lsn/g;", "l", "(Lsn/g;)Lvo/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lwo/a;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;J)Lwo/a;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34653a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f34654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f34655d;

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
            f34653a = iArr;
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
            f34654c = iArr3;
            int[] iArr4 = new int[IdConfig.e.values().length];
            try {
                iArr4[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.e.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.e.FrontOrBack.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f34655d = iArr4;
        }
    }

    public static final IdConfig.AutoCaptureConfig a(IdConfig.e eVar) {
        int i10 = a.f34655d[eVar.ordinal()];
        if (i10 == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p001kotlin.collections.o.d(new sn.e.FrontRule(false, 1, null))));
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p001kotlin.collections.o.d(new sn.e.FrontOrBackRule(false, 1, null))));
            }
            if (i10 == 5) {
                return new IdConfig.AutoCaptureConfig(null, 1, null);
            }
            throw new zt.l();
        }
        return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(p001kotlin.collections.o.d(new sn.e.BarcodePdf417Rule(false, 1, null))));
    }

    public static final IdConfig.ManualCaptureConfig b(long j10) {
        return new IdConfig.ManualCaptureConfig(true, j10);
    }

    public static final y3.f c(dp.e eVar, IdConfig.e eVar2, String str) {
        if (eVar2 == IdConfig.e.BarcodePdf417) {
            return y3.f.a.f35118a;
        }
        if (eVar2 == IdConfig.e.PassportSignature) {
            return y3.f.C0721f.f35123a;
        }
        dp.e eVar3 = dp.e.DriverLicense;
        if (eVar == eVar3 && eVar2 == IdConfig.e.Back && Intrinsics.c(str, "US")) {
            return y3.f.a.f35118a;
        }
        if (eVar != dp.e.Passport && eVar != dp.e.Visa) {
            if (eVar != eVar3 && eVar != dp.e.StateID && eVar != dp.e.ResidencyPermit) {
                return y3.f.C0721f.f35123a;
            }
            return y3.f.d.f35121a;
        }
        return y3.f.e.f35122a;
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

    public static final sn.e e(CapturePageConfig.Rule rule) {
        CapturePageConfig.RuleType type = rule.getType();
        int i10 = type == null ? -1 : a.f34653a[type.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return new sn.e.FrontRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 2) {
            return new sn.e.FrontOrBackRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 3) {
            return new sn.e.BarcodePdf417Rule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 4) {
            return new sn.e.MrzRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        if (i10 == 5) {
            return new sn.e.TextExtractionRule(Intrinsics.c(rule.isRequired(), Boolean.TRUE));
        }
        throw new zt.l();
    }

    public static final AutoCaptureRuleSet f(CapturePageConfig.RuleSet ruleSet) {
        List listK;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            listK = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                sn.e eVarE = e((CapturePageConfig.Rule) it.next());
                if (eVarE != null) {
                    listK.add(eVarE);
                }
            }
        } else {
            listK = p001kotlin.collections.p.k();
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
    public static final IdConfig.IdSideConfig h(@Nullable CapturePageConfig capturePageConfig, @NotNull IdConfig.e side, @NotNull dp.e type, @NotNull String countryCode, long j10) {
        IdConfig.AutoCaptureConfig autoCaptureConfigA;
        IdConfig.ManualCaptureConfig manualCaptureConfigB;
        y3.f fVarC;
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
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null || (fVarC = j(overlay)) == null) {
            fVarC = c(type, side, countryCode);
        }
        return new IdConfig.IdSideConfig(key, side, fVarC, autoCaptureConfigA, manualCaptureConfig2);
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

    public static final y3.f j(CapturePageConfig.OverlayConfig overlayConfig) {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new y3.f.c(overlay);
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : a.b[overlayFallback.ordinal()]) {
            case -1:
                return y3.f.C0721f.f35123a;
            case 0:
            default:
                throw new zt.l();
            case 1:
                return y3.f.a.f35118a;
            case 2:
                return y3.f.e.f35122a;
            case 3:
                return y3.f.d.f35121a;
            case 4:
                return y3.f.a.f35118a;
            case 5:
                return y3.f.b.f35119a;
            case 6:
                return y3.f.C0721f.f35123a;
        }
    }

    @NotNull
    public static final wo.a k(@Nullable NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j10) {
        CapturePageConfig capturePageConfig;
        wo.a.Companion companion = wo.a.INSTANCE;
        IdConfig.IdSideConfig idSideConfigH = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigH = h(capturePageConfig, IdConfig.e.Front, dp.e.Unknown, BuildConfig.FLAVOR, j10);
        }
        return companion.b(boolIsEnabled, extractTextFromImage, idSideConfigH);
    }

    @NotNull
    public static final GovernmentIdDetails l(@NotNull sn.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof sn.g.MrzBarcodeInfo) {
            sn.g.MrzBarcodeInfo mrzBarcodeInfo = (sn.g.MrzBarcodeInfo) gVar;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(gVar instanceof sn.g.Pdf417BarcodeInfo)) {
            throw new zt.l();
        }
        sn.g.Pdf417BarcodeInfo pdf417BarcodeInfo = (sn.g.Pdf417BarcodeInfo) gVar;
        AamvaExtraction aamvaExtractionB = pdf417BarcodeInfo.b();
        Date birthdate = aamvaExtractionB != null ? aamvaExtractionB.getBirthdate() : null;
        AamvaExtraction aamvaExtractionB2 = pdf417BarcodeInfo.b();
        return new GovernmentIdDetails(birthdate, aamvaExtractionB2 != null ? aamvaExtractionB2.getExpirationDate() : null);
    }

    @NotNull
    public static final GovernmentIdDetails m(@NotNull ExtractedTexts extractedTexts) {
        Intrinsics.checkNotNullParameter(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    public static final h3 n(Id.IdLocalIcon idLocalIcon) {
        int i10 = idLocalIcon == null ? -1 : a.f34654c[idLocalIcon.ordinal()];
        if (i10 == -1) {
            return h3.Card;
        }
        if (i10 == 1) {
            return h3.World;
        }
        if (i10 == 2) {
            return h3.Card;
        }
        if (i10 == 3) {
            return h3.Flag;
        }
        if (i10 == 4) {
            return h3.House;
        }
        throw new zt.l();
    }

    @Nullable
    public static final IdConfig o(@NotNull Id id2, @NotNull String countryCode, long j10) {
        h3 h3VarC;
        String str;
        long j11;
        IdConfig.IdSideConfig idSideConfigH;
        Intrinsics.checkNotNullParameter(id2, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        dp.e eVarA = dp.e.INSTANCE.a(id2.getClass());
        if (eVarA == dp.e.Unknown && !id2.isDynamicGovId()) {
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
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.e eVarA2 = IdConfig.e.INSTANCE.a(str2);
            if (eVarA2 == null || (idSideConfigH = h((CapturePageConfig) linkedHashMap.get(str2), eVarA2, eVarA, (str = countryCode), (j11 = j10))) == null) {
                return null;
            }
            arrayList.add(idSideConfigH);
            countryCode = str;
            j10 = j11;
        }
        String str3 = id2.getClass();
        if (id2.isDynamicGovId()) {
            Id.IdIcon icon = id2.getIcon();
            h3VarC = n(icon != null ? icon.getIconFallback() : null);
        } else {
            h3VarC = eVarA.c();
        }
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(new i3.SideIdPart(((IdConfig.IdSideConfig) obj).getSide()));
        }
        return new IdConfig(str3, h3VarC, arrayList, arrayList2, eVarA);
    }
}
