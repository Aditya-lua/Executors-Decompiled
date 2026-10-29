package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.utils.GovernmentIdNfcData;
import cr.InterfaceC4248h2;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5198g;
import er.C5199h;
import er.C5200i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0392u;
import p016an.InterfaceC0389r;
import p084dr.HelpBottomSheetViewModel;
import p084dr.HelpPagerItem;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Be\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020!¢\u0006\u0004\b,\u0010-J~\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020!HÖ\u0001¢\u0006\u0004\b2\u0010'J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b9\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u00101R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010P\u001a\u0004\bQ\u0010RR&\u0010Z\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bL\u0010WR(\u0010a\u001a\u0002058\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\b`\u0010Y\u001a\u0004\b]\u0010^\"\u0004\b:\u0010_R(\u0010i\u001a\u00020b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bh\u0010Y\u001a\u0004\bF\u0010e\"\u0004\bf\u0010gR(\u0010m\u001a\u00020b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bj\u0010d\u0012\u0004\bl\u0010Y\u001a\u0004\bc\u0010e\"\u0004\bk\u0010gR(\u0010u\u001a\u00020n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bt\u0010Y\u001a\u0004\bU\u0010q\"\u0004\br\u0010sR(\u0010y\u001a\u00020n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010p\u0012\u0004\bx\u0010Y\u001a\u0004\bj\u0010q\"\u0004\bw\u0010sR)\u0010\u0080\u0001\u001a\u00020z8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010{\u0012\u0004\b\u007f\u0010Y\u001a\u0004\bo\u0010|\"\u0004\b}\u0010~R\u0014\u0010\u0083\u0001\u001a\u00030\u0081\u00018F¢\u0006\u0007\u001a\u0005\bv\u0010\u0082\u0001R\u0016\u0010\u0084\u0001\u001a\u0002058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010^¨\u0006\u0085\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o;", "Lcr/x;", "Lcr/h2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "documentNumber", "dateOfBirth", "expirationDate", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "governmentIdNfcData", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;J)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;)V", "newValue", "q", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "s", "newDate", "r", "t", "u", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "", "timesShown", "Ldr/o;", "p1", "(I)Ldr/o;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "c", "getDocumentNumber", "d", "getDateOfBirth", "e", "getExpirationDate", "f", "getCardAccessNumber", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "h", "getDisabled", "i", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "getGovernmentIdNfcData", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "J", "R0", "()J", "", "Lmr/a;", "k", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "l", "Z", "Y0", "()Z", "(Z)V", "getWasTapped$annotations", "wasTapped", "Lan/r;", "m", "Lan/r;", "()Lan/r;", "setCardAccessNumberController", "(Lan/r;)V", "getCardAccessNumberController$annotations", "cardAccessNumberController", "n", "setDocumentNumberController", "getDocumentNumberController$annotations", "documentNumberController", "Ler/g;", "o", "Ler/g;", "()Ler/g;", "setDateOfBirthController", "(Ler/g;)V", "getDateOfBirthController$annotations", "dateOfBirthController", "p", "setExpirationDateController", "getExpirationDateController$annotations", "expirationDateController", "Ler/i;", "Ler/i;", "()Ler/i;", "setNfcDataController", "(Ler/i;)V", "getNfcDataController$annotations", "nfcDataController", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "tipsButtonLocation", "isEnabled", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class GovernmentIdNfcScanComponent implements UiComponent, InterfaceC4287o, InterfaceC4341x, InterfaceC4248h2, HelpBottomSheetComponent {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new C4038a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final GovernmentIdNfcScan config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String documentNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String dateOfBirth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String expirationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String cardAccessNumber;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final GovernmentIdNfcData governmentIdNfcData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean wasTapped;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r cardAccessNumberController;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r documentNumberController;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public C5198g dateOfBirthController;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public C5198g expirationDateController;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public C5200i nfcDataController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4038a implements Parcelable.Creator<GovernmentIdNfcScanComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcScanComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcScanComponent(parcel.readString(), (GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdNfcData.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcScanComponent[] newArray(int i10) {
            return new GovernmentIdNfcScanComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GovernmentIdNfcScanComponent(@NotNull String name, @NotNull GovernmentIdNfcScan config, @NotNull String documentNumber, @Nullable String str, @Nullable String str2, @NotNull String cardAccessNumber, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable GovernmentIdNfcData governmentIdNfcData, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        this.name = name;
        this.config = config;
        this.documentNumber = documentNumber;
        this.dateOfBirth = str;
        this.expirationDate = str2;
        this.cardAccessNumber = cardAccessNumber;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.governmentIdNfcData = governmentIdNfcData;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.cardAccessNumberController = C0392u.m1458a(cardAccessNumber);
        this.documentNumberController = C0392u.m1458a(documentNumber);
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        this.dateOfBirthController = new C5198g(str, null, companion.generateTextMonths());
        this.expirationDateController = new C5198g(str2, null, companion.generateTextMonths());
        this.nfcDataController = new C5200i(governmentIdNfcData);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ GovernmentIdNfcScanComponent m20585f(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = governmentIdNfcScanComponent.name;
        }
        if ((i10 & 2) != 0) {
            governmentIdNfcScan = governmentIdNfcScanComponent.config;
        }
        if ((i10 & 4) != 0) {
            str2 = governmentIdNfcScanComponent.documentNumber;
        }
        if ((i10 & 8) != 0) {
            str3 = governmentIdNfcScanComponent.dateOfBirth;
        }
        if ((i10 & 16) != 0) {
            str4 = governmentIdNfcScanComponent.expirationDate;
        }
        if ((i10 & 32) != 0) {
            str5 = governmentIdNfcScanComponent.cardAccessNumber;
        }
        if ((i10 & 64) != 0) {
            jsonLogicBoolean = governmentIdNfcScanComponent.hidden;
        }
        if ((i10 & 128) != 0) {
            jsonLogicBoolean2 = governmentIdNfcScanComponent.disabled;
        }
        if ((i10 & 256) != 0) {
            governmentIdNfcData = governmentIdNfcScanComponent.governmentIdNfcData;
        }
        if ((i10 & 512) != 0) {
            j10 = governmentIdNfcScanComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        GovernmentIdNfcData governmentIdNfcData2 = governmentIdNfcData;
        String str6 = str5;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
        String str7 = str4;
        String str8 = str2;
        return governmentIdNfcScanComponent.m20587a(str, governmentIdNfcScan, str8, str3, str7, str6, jsonLogicBoolean4, jsonLogicBoolean3, governmentIdNfcData2, j11);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getCardAccessNumberController$annotations() {
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getDateOfBirthController$annotations() {
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getDocumentNumberController$annotations() {
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getExpirationDateController$annotations() {
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getNfcDataController$annotations() {
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final GovernmentIdNfcScanComponent m20587a(@NotNull String name, @NotNull GovernmentIdNfcScan config, @NotNull String documentNumber, @Nullable String dateOfBirth, @Nullable String expirationDate, @NotNull String cardAccessNumber, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable GovernmentIdNfcData governmentIdNfcData, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        return new GovernmentIdNfcScanComponent(name, config, documentNumber, dateOfBirth, expirationDate, cardAccessNumber, hidden, disabled, governmentIdNfcData, lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4248h2
    /* JADX INFO: renamed from: b */
    public void mo20533b(boolean z10) {
        this.wasTapped = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) other;
        return Intrinsics.m31980c(this.name, governmentIdNfcScanComponent.name) && Intrinsics.m31980c(this.config, governmentIdNfcScanComponent.config) && Intrinsics.m31980c(this.documentNumber, governmentIdNfcScanComponent.documentNumber) && Intrinsics.m31980c(this.dateOfBirth, governmentIdNfcScanComponent.dateOfBirth) && Intrinsics.m31980c(this.expirationDate, governmentIdNfcScanComponent.expirationDate) && Intrinsics.m31980c(this.cardAccessNumber, governmentIdNfcScanComponent.cardAccessNumber) && Intrinsics.m31980c(this.hidden, governmentIdNfcScanComponent.hidden) && Intrinsics.m31980c(this.disabled, governmentIdNfcScanComponent.disabled) && Intrinsics.m31980c(this.governmentIdNfcData, governmentIdNfcScanComponent.governmentIdNfcData) && this.lastValueUpdateTs == governmentIdNfcScanComponent.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC0389r getCardAccessNumberController() {
        return this.cardAccessNumberController;
    }

    @Override // cr.InterfaceC4287o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // cr.InterfaceC4341x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.config.hashCode()) * 31) + this.documentNumber.hashCode()) * 31;
        String str = this.dateOfBirth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cardAccessNumber.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        return ((iHashCode5 + (governmentIdNfcData != null ? governmentIdNfcData.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent
    public boolean isEnabled() {
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        GovernmentIdNfcScan.Attributes attributes = this.config.getAttributes();
        return attributes != null && (scanHints = attributes.getScanHints()) != null && (scanHints.isEmpty() ^ true) && m20594p() == GovernmentIdNfcScan.TipsButtonLocation.NavigationBar;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final GovernmentIdNfcScan getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final C5198g getDateOfBirthController() {
        return this.dateOfBirthController;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC0389r getDocumentNumberController() {
        return this.documentNumberController;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C5198g getExpirationDateController() {
        return this.expirationDateController;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final C5200i getNfcDataController() {
        return this.nfcDataController;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final GovernmentIdNfcScan.TipsButtonLocation m20594p() {
        GovernmentIdNfcScan.TipsButtonLocation tipsButtonLocation;
        GovernmentIdNfcScan.Attributes attributes = this.config.getAttributes();
        return (attributes == null || (tipsButtonLocation = attributes.getTipsButtonLocation()) == null) ? GovernmentIdNfcScan.TipsButtonLocation.NavigationBar : tipsButtonLocation;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent
    @Nullable
    /* JADX INFO: renamed from: p1 */
    public HelpBottomSheetViewModel mo20595p1(int timesShown) {
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        List<HelpPagerItem> listM24133i;
        GovernmentIdNfcScan.Attributes attributes = this.config.getAttributes();
        if (attributes == null || (scanHints = attributes.getScanHints()) == null || (listM24133i = C5199h.m24133i(scanHints)) == null) {
            return null;
        }
        boolean z10 = timesShown >= attributes.getUnableToScanButtonMinAttempts();
        return new HelpBottomSheetViewModel(null, attributes.getCloseHintSheetButtonText(), z10 ? attributes.getUserUnableToScanHintSheetButtonText() : null, z10 ? attributes.getUnableToScanTransitionComponentName() : null, listM24133i, this.config.getStyles());
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final GovernmentIdNfcScanComponent m20596q(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM20585f = m20585f(this, null, null, null, null, null, newValue, null, null, null, System.currentTimeMillis(), 479, null);
        governmentIdNfcScanComponentM20585f.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentM20585f.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentM20585f.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentM20585f.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentM20585f.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentM20585f;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final GovernmentIdNfcScanComponent m20597r(@Nullable String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM20585f = m20585f(this, null, null, null, newDate, null, null, null, null, null, System.currentTimeMillis(), 503, null);
        governmentIdNfcScanComponentM20585f.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentM20585f.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentM20585f.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentM20585f.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentM20585f.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentM20585f;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final GovernmentIdNfcScanComponent m20598s(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM20585f = m20585f(this, null, null, newValue, null, null, null, null, null, null, System.currentTimeMillis(), 507, null);
        governmentIdNfcScanComponentM20585f.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentM20585f.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentM20585f.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentM20585f.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentM20585f.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentM20585f;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final GovernmentIdNfcScanComponent m20599t(@Nullable String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM20585f = m20585f(this, null, null, null, null, newDate, null, null, null, null, System.currentTimeMillis(), 495, null);
        governmentIdNfcScanComponentM20585f.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentM20585f.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentM20585f.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentM20585f.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentM20585f.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentM20585f;
    }

    @NotNull
    public String toString() {
        return "GovernmentIdNfcScanComponent(name=" + this.name + ", config=" + this.config + ", documentNumber=" + this.documentNumber + ", dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ", cardAccessNumber=" + this.cardAccessNumber + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", governmentIdNfcData=" + this.governmentIdNfcData + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final GovernmentIdNfcScanComponent m20600u(@Nullable GovernmentIdNfcData newValue) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM20585f = m20585f(this, null, null, null, null, null, null, null, null, newValue, System.currentTimeMillis(), 255, null);
        governmentIdNfcScanComponentM20585f.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentM20585f.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentM20585f.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentM20585f.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentM20585f.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentM20585f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeString(this.documentNumber);
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.expirationDate);
        dest.writeString(this.cardAccessNumber);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        if (governmentIdNfcData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            governmentIdNfcData.writeToParcel(dest, flags);
        }
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
      (r15v0 java.lang.String)
      (r16v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan)
      (r17v0 java.lang.String)
      (r18v0 java.lang.String)
      (r19v0 java.lang.String)
      (r20v0 java.lang.String)
      (r21v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r22v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData:?: TERNARY null = ((wrap int:0x0002: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData) : (r23v0 com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData))
      (wrap long:?: TERNARY null = ((wrap int:0x000b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData, long):void (m)] (LINE:22) call: com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData, long):void type: THIS */
    public /* synthetic */ GovernmentIdNfcScanComponent(String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, governmentIdNfcScan, str2, str3, str4, str5, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 256) != 0 ? null : governmentIdNfcData, (i10 & 512) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GovernmentIdNfcScanComponent(@NotNull GovernmentIdNfcScan config) {
        String prefillDocumentNumber;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        GovernmentIdNfcScan.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefillDocumentNumber = attributes.getPrefillDocumentNumber()) == null) ? "" : prefillDocumentNumber;
        GovernmentIdNfcScan.Attributes attributes2 = config.getAttributes();
        String prefillDateOfBirth = attributes2 != null ? attributes2.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Attributes attributes3 = config.getAttributes();
        String prefillExpirationDate = attributes3 != null ? attributes3.getPrefillExpirationDate() : null;
        GovernmentIdNfcScan.Attributes attributes4 = config.getAttributes();
        String prefillCardAccessNumber = (attributes4 == null || (prefillCardAccessNumber = attributes4.getPrefillCardAccessNumber()) == null) ? "" : prefillCardAccessNumber;
        GovernmentIdNfcScan.Attributes attributes5 = config.getAttributes();
        JsonLogicBoolean hidden = attributes5 != null ? attributes5.getHidden() : null;
        GovernmentIdNfcScan.Attributes attributes6 = config.getAttributes();
        this(name, config, str, prefillDateOfBirth, prefillExpirationDate, prefillCardAccessNumber, hidden, attributes6 != null ? attributes6.getDisabled() : null, null, 0L, 768, null);
    }
}
