package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.steps.p056ui.mdoc.C4090a;
import com.withpersona.sdk2.inquiry.steps.p056ui.mdoc.MdocRequestMetadata;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001!Bw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0092\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b=\u0010$R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010$R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010$R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bB\u0010$R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010P\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bN\u0010O\u001a\u0004\bK\u0010L\"\u0004\b-\u0010MR(\u0010W\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b;\u0010R\u0012\u0004\bV\u0010O\u001a\u0004\bI\u0010S\"\u0004\bT\u0010UR(\u0010Z\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bA\u0010R\u0012\u0004\bY\u0010O\u001a\u0004\bD\u0010S\"\u0004\bX\u0010UR&\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010]\u0012\u0004\b_\u0010O\u001a\u0004\b@\u0010^¨\u0006a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "mdocRequestMetadata", "errorRetrievingMdocText", "noMdocAvailableText", "successfulMdocRetrievalTransitionComponentName", "mdocData", "errorText", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "q", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "p", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "getDisabled", "d", "getAutoSubmitCountdownText", "e", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "f", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "n", "()Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "g", "h", "getNoMdocAvailableText", "i", "o", "j", "getMdocData", "k", "l", "J", "R0", "()J", "m", "Z", "Y0", "()Z", "(Z)V", "getWasTapped$annotations", "()V", "wasTapped", "Lan/r;", "Lan/r;", "()Lan/r;", "setMdocDataController", "(Lan/r;)V", "getMdocDataController$annotations", "mdocDataController", "setErrorTextController", "getErrorTextController$annotations", "errorTextController", "", "Lmr/a;", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "associatedViews", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class MdocComponent implements UiComponent, ButtonComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String autoSubmitCountdownText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer autoSubmitIntervalSeconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final MdocRequestMetadata mdocRequestMetadata;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorRetrievingMdocText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final String noMdocAvailableText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final String successfulMdocRetrievalTransitionComponentName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    public final String mdocData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean wasTapped;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r mdocDataController;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r errorTextController;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<MdocComponent> CREATOR = new C4073b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final MdocComponent m20824a(@NotNull Mdoc config) {
            Mdoc.Provider provider;
            MdocRequestMetadata mdocRequestMetadataM20907a;
            String errorRetrievingMdocText;
            String noMdocAvailableText;
            Intrinsics.checkNotNullParameter(config, "config");
            String name = config.getName();
            Mdoc.Attributes attributes = config.getAttributes();
            JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
            Mdoc.Attributes attributes2 = config.getAttributes();
            JsonLogicBoolean disabled = attributes2 != null ? attributes2.getDisabled() : null;
            Mdoc.Attributes attributes3 = config.getAttributes();
            String autoSubmitCountdownText = attributes3 != null ? attributes3.getAutoSubmitCountdownText() : null;
            Mdoc.Attributes attributes4 = config.getAttributes();
            Integer autoSubmitIntervalSeconds = attributes4 != null ? attributes4.getAutoSubmitIntervalSeconds() : null;
            Mdoc.Attributes attributes5 = config.getAttributes();
            if (attributes5 == null || (provider = attributes5.getProvider()) == null || (mdocRequestMetadataM20907a = C4090a.m20907a(provider)) == null) {
                return null;
            }
            Mdoc.Attributes attributes6 = config.getAttributes();
            String str = "";
            if (attributes6 == null || (errorRetrievingMdocText = attributes6.getErrorRetrievingMdocText()) == null) {
                errorRetrievingMdocText = "";
            }
            Mdoc.Attributes attributes7 = config.getAttributes();
            if (attributes7 != null && (noMdocAvailableText = attributes7.getNoMdocAvailableText()) != null) {
                str = noMdocAvailableText;
            }
            Mdoc.Attributes attributes8 = config.getAttributes();
            return new MdocComponent(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, mdocRequestMetadataM20907a, errorRetrievingMdocText, str, attributes8 != null ? attributes8.getSuccessfulMdocRetrievalTransitionComponentName() : null, null, null, 0L, 3584, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4073b implements Parcelable.Creator<MdocComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MdocComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MdocComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MdocRequestMetadata) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MdocComponent[] newArray(int i10) {
            return new MdocComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MdocComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable Integer num, @NotNull MdocRequestMetadata mdocRequestMetadata, @NotNull String errorRetrievingMdocText, @NotNull String noMdocAvailableText, @Nullable String str2, @NotNull String mdocData, @NotNull String errorText, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mdocRequestMetadata, "mdocRequestMetadata");
        Intrinsics.checkNotNullParameter(errorRetrievingMdocText, "errorRetrievingMdocText");
        Intrinsics.checkNotNullParameter(noMdocAvailableText, "noMdocAvailableText");
        Intrinsics.checkNotNullParameter(mdocData, "mdocData");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.mdocRequestMetadata = mdocRequestMetadata;
        this.errorRetrievingMdocText = errorRetrievingMdocText;
        this.noMdocAvailableText = noMdocAvailableText;
        this.successfulMdocRetrievalTransitionComponentName = str2;
        this.mdocData = mdocData;
        this.errorText = errorText;
        this.lastValueUpdateTs = j10;
        this.mdocDataController = C0392u.m1458a(mdocData);
        this.errorTextController = C0392u.m1458a(errorText);
        this.associatedViews = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ MdocComponent m20814f(MdocComponent mdocComponent, String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, MdocRequestMetadata mdocRequestMetadata, String str3, String str4, String str5, String str6, String str7, long j10, int i10, Object obj) {
        return mdocComponent.m20815a((i10 & 1) != 0 ? mdocComponent.name : str, (i10 & 2) != 0 ? mdocComponent.hidden : jsonLogicBoolean, (i10 & 4) != 0 ? mdocComponent.disabled : jsonLogicBoolean2, (i10 & 8) != 0 ? mdocComponent.autoSubmitCountdownText : str2, (i10 & 16) != 0 ? mdocComponent.autoSubmitIntervalSeconds : num, (i10 & 32) != 0 ? mdocComponent.mdocRequestMetadata : mdocRequestMetadata, (i10 & 64) != 0 ? mdocComponent.errorRetrievingMdocText : str3, (i10 & 128) != 0 ? mdocComponent.noMdocAvailableText : str4, (i10 & 256) != 0 ? mdocComponent.successfulMdocRetrievalTransitionComponentName : str5, (i10 & 512) != 0 ? mdocComponent.mdocData : str6, (i10 & 1024) != 0 ? mdocComponent.errorText : str7, (i10 & 2048) != 0 ? mdocComponent.lastValueUpdateTs : j10);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MdocComponent m20815a(@NotNull String name, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable String autoSubmitCountdownText, @Nullable Integer autoSubmitIntervalSeconds, @NotNull MdocRequestMetadata mdocRequestMetadata, @NotNull String errorRetrievingMdocText, @NotNull String noMdocAvailableText, @Nullable String successfulMdocRetrievalTransitionComponentName, @NotNull String mdocData, @NotNull String errorText, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mdocRequestMetadata, "mdocRequestMetadata");
        Intrinsics.checkNotNullParameter(errorRetrievingMdocText, "errorRetrievingMdocText");
        Intrinsics.checkNotNullParameter(noMdocAvailableText, "noMdocAvailableText");
        Intrinsics.checkNotNullParameter(mdocData, "mdocData");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        return new MdocComponent(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, mdocRequestMetadata, errorRetrievingMdocText, noMdocAvailableText, successfulMdocRetrievalTransitionComponentName, mdocData, errorText, lastValueUpdateTs);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, cr.InterfaceC4248h2
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
        if (!(other instanceof MdocComponent)) {
            return false;
        }
        MdocComponent mdocComponent = (MdocComponent) other;
        return Intrinsics.m31980c(this.name, mdocComponent.name) && Intrinsics.m31980c(this.hidden, mdocComponent.hidden) && Intrinsics.m31980c(this.disabled, mdocComponent.disabled) && Intrinsics.m31980c(this.autoSubmitCountdownText, mdocComponent.autoSubmitCountdownText) && Intrinsics.m31980c(this.autoSubmitIntervalSeconds, mdocComponent.autoSubmitIntervalSeconds) && Intrinsics.m31980c(this.mdocRequestMetadata, mdocComponent.mdocRequestMetadata) && Intrinsics.m31980c(this.errorRetrievingMdocText, mdocComponent.errorRetrievingMdocText) && Intrinsics.m31980c(this.noMdocAvailableText, mdocComponent.noMdocAvailableText) && Intrinsics.m31980c(this.successfulMdocRetrievalTransitionComponentName, mdocComponent.successfulMdocRetrievalTransitionComponentName) && Intrinsics.m31980c(this.mdocData, mdocComponent.mdocData) && Intrinsics.m31980c(this.errorText, mdocComponent.errorText) && this.lastValueUpdateTs == mdocComponent.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getErrorRetrievingMdocText() {
        return this.errorRetrievingMdocText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent
    @Nullable
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    @Nullable
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
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
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.autoSubmitCountdownText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        int iHashCode5 = (((((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.mdocRequestMetadata.hashCode()) * 31) + this.errorRetrievingMdocText.hashCode()) * 31) + this.noMdocAvailableText.hashCode()) * 31;
        String str2 = this.successfulMdocRetrievalTransitionComponentName;
        return ((((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mdocData.hashCode()) * 31) + this.errorText.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC0389r getErrorTextController() {
        return this.errorTextController;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC0389r getMdocDataController() {
        return this.mdocDataController;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final MdocRequestMetadata getMdocRequestMetadata() {
        return this.mdocRequestMetadata;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSuccessfulMdocRetrievalTransitionComponentName() {
        return this.successfulMdocRetrievalTransitionComponentName;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MdocComponent m20822p(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        MdocComponent mdocComponentM20814f = m20814f(this, null, null, null, null, null, null, null, null, null, null, errorText, 0L, 3071, null);
        mdocComponentM20814f.mdocDataController = this.mdocDataController;
        mdocComponentM20814f.errorTextController = this.errorTextController;
        return mdocComponentM20814f;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MdocComponent m20823q(@NotNull String mdocData) {
        Intrinsics.checkNotNullParameter(mdocData, "mdocData");
        MdocComponent mdocComponentM20814f = m20814f(this, null, null, null, null, null, null, null, null, null, mdocData, null, 0L, 3583, null);
        mdocComponentM20814f.mdocDataController = this.mdocDataController;
        mdocComponentM20814f.errorTextController = this.errorTextController;
        return mdocComponentM20814f;
    }

    @NotNull
    public String toString() {
        return "MdocComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", mdocRequestMetadata=" + this.mdocRequestMetadata + ", errorRetrievingMdocText=" + this.errorRetrievingMdocText + ", noMdocAvailableText=" + this.noMdocAvailableText + ", successfulMdocRetrievalTransitionComponentName=" + this.successfulMdocRetrievalTransitionComponentName + ", mdocData=" + this.mdocData + ", errorText=" + this.errorText + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.mdocRequestMetadata, flags);
        dest.writeString(this.errorRetrievingMdocText);
        dest.writeString(this.noMdocAvailableText);
        dest.writeString(this.successfulMdocRetrievalTransitionComponentName);
        dest.writeString(this.mdocData);
        dest.writeString(this.errorText);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
      (r18v0 java.lang.String)
      (r19v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r20v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r21v0 java.lang.String)
      (r22v0 java.lang.Integer)
      (r23v0 com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata)
      (r24v0 java.lang.String)
      (r25v0 java.lang.String)
      (r26v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000c: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
      (wrap long:?: TERNARY null = ((wrap int:0x0014: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r29v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:17) call: com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ MdocComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, MdocRequestMetadata mdocRequestMetadata, String str3, String str4, String str5, String str6, String str7, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, jsonLogicBoolean2, str2, num, mdocRequestMetadata, str3, str4, str5, (i10 & 512) != 0 ? "" : str6, (i10 & 1024) != 0 ? "" : str7, (i10 & 2048) != 0 ? 0L : j10);
    }
}
