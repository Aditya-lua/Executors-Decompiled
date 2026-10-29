package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.core.JsonReaderUtilsKt;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Companion", "Unknown", "Ui", "WebViewPendingPage", "PendingUiPage", "GovernmentId", "Selfie", "Document", "Integration", "CancelDialog", "Complete", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class NextStep {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String name;

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Landroid/os/Parcelable;", Title.type, "", "prompt", "btnSubmit", "btnResume", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getBtnSubmit", "getBtnResume", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class CancelDialog implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CancelDialog> CREATOR = new Creator();

        @Nullable
        private final String btnResume;

        @Nullable
        private final String btnSubmit;

        @Nullable
        private final String prompt;

        @Nullable
        private final String title;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<CancelDialog> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog[] newArray(int i10) {
                return new CancelDialog[i10];
            }
        }

        public CancelDialog(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.title = str;
            this.prompt = str2;
            this.btnSubmit = str3;
            this.btnResume = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getBtnResume() {
            return this.btnResume;
        }

        @Nullable
        public final String getBtnSubmit() {
            return this.btnSubmit;
        }

        @Nullable
        public final String getPrompt() {
            return this.prompt;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.prompt);
            dest.writeString(this.btnSubmit);
            dest.writeString(this.btnResume);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            C12232b c12232bM45368e = C12232b.m45364b(NextStep.class, Payload.TYPE).m45366c(Unknown.INSTANCE).m45368e(C3793Ui.class, "ui").m45368e(GovernmentId.class, "government_id").m45368e(Selfie.class, "selfie").m45368e(Document.class, "document").m45368e(Complete.class, "complete").m45368e(Integration.class, "integration");
            Intrinsics.checkNotNullExpressionValue(c12232bM45368e, "withSubtype(...)");
            return c12232bM45368e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Complete extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();

        @NotNull
        private final String name;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Complete(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete[] newArray(int i10) {
                return new Complete[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(@NotNull String name) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0018\u0019\u001a\u001bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "IntegrationStepBrowserType", "Localizations", "PendingPage", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Integration extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Integration> CREATOR = new Creator();

        @NotNull
        private final Config config;

        @NotNull
        private final String name;

        @Nullable
        private final StepStyles.IntegrationStepStyle styles;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Integration> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Integration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Integration(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.IntegrationStepStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Integration[] newArray(int i10) {
                return new Integration[i10];
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "", "<init>", "(Ljava/lang/String;I)V", "External", "AuthSession", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public enum IntegrationStepBrowserType {
            External,
            AuthSession;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            @NotNull
            public static InterfaceC10707a<IntegrationStepBrowserType> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "Landroid/os/Parcelable;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;)V", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();

            @Nullable
            private final CancelDialog cancelDialog;

            @Nullable
            private final PendingPage pendingPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Localizations(parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(@Nullable CancelDialog cancelDialog, @Nullable PendingPage pendingPage) {
                this.cancelDialog = cancelDialog;
                this.pendingPage = pendingPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @Nullable
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "Landroid/os/Parcelable;", Title.type, "", "descriptionMobile", "btnLaunchMobile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescriptionMobile", "getBtnLaunchMobile", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @NotNull
            private final String btnLaunchMobile;

            @NotNull
            private final String descriptionMobile;

            @NotNull
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            public PendingPage(@NotNull String title, @NotNull String descriptionMobile, @NotNull String btnLaunchMobile) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(descriptionMobile, "descriptionMobile");
                Intrinsics.checkNotNullParameter(btnLaunchMobile, "btnLaunchMobile");
                this.title = title;
                this.descriptionMobile = descriptionMobile;
                this.btnLaunchMobile = btnLaunchMobile;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getBtnLaunchMobile() {
                return this.btnLaunchMobile;
            }

            @NotNull
            public final String getDescriptionMobile() {
                return this.descriptionMobile;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.descriptionMobile);
                dest.writeString(this.btnLaunchMobile);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config)
          (wrap com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Config, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Integration(String str, Config config, StepStyles.IntegrationStepStyle integrationStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i10 & 4) != 0 ? null : integrationStepStyle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Nullable
        public final StepStyles.IntegrationStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            this.config.writeToParcel(dest, flags);
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            if (integrationStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                integrationStepStyle.writeToParcel(dest, flags);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Integration(@NotNull String name, @NotNull Config config, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(config, "config");
            this.name = name;
            this.config = config;
            this.styles = integrationStepStyle;
        }

        @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "Landroid/os/Parcelable;", "backStepEnabled", "", "cancelButtonEnabled", Payload.TYPE, "", "flowUrl", "redirectPath", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;)V", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getType", "()Ljava/lang/String;", "getFlowUrl", "getRedirectPath", "getIntegrationStepBrowserType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @Nullable
            private final Boolean backStepEnabled;

            @Nullable
            private final Boolean cancelButtonEnabled;

            @NotNull
            private final String flowUrl;

            @Nullable
            private final IntegrationStepBrowserType integrationStepBrowserType;

            @Nullable
            private final Localizations localizations;

            @NotNull
            private final String redirectPath;

            @NotNull
            private final String type;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    IntegrationStepBrowserType integrationStepBrowserType;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        integrationStepBrowserType = null;
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        integrationStepBrowserType = null;
                    }
                    return new Config(boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? integrationStepBrowserType : IntegrationStepBrowserType.valueOf(parcel.readString()), (Localizations) (parcel.readInt() == 0 ? integrationStepBrowserType : Localizations.CREATOR.createFromParcel(parcel)));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i10) {
                    return new Config[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Config(@Nullable Boolean bool, @Nullable Boolean bool2, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @InterfaceC11872g(name = "integrationStepMobileSdkBrowserType") @Nullable IntegrationStepBrowserType integrationStepBrowserType, @Nullable Localizations localizations) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
                Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.type = type;
                this.flowUrl = flowUrl;
                this.redirectPath = redirectPath;
                this.integrationStepBrowserType = integrationStepBrowserType;
                this.localizations = localizations;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            @Nullable
            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            @NotNull
            public final String getFlowUrl() {
                return this.flowUrl;
            }

            @Nullable
            public final IntegrationStepBrowserType getIntegrationStepBrowserType() {
                return this.integrationStepBrowserType;
            }

            @Nullable
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            @NotNull
            public final String getRedirectPath() {
                return this.redirectPath;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                dest.writeString(this.type);
                dest.writeString(this.flowUrl);
                dest.writeString(this.redirectPath);
                IntegrationStepBrowserType integrationStepBrowserType = this.integrationStepBrowserType;
                if (integrationStepBrowserType == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(integrationStepBrowserType.name());
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    localizations.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
              (r4v0 java.lang.String)
              (r5v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType:?: TERNARY null = ((wrap int:0x0011: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType:0x0015: SGET  A[WRAPPED] (LINE:10) com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.IntegrationStepBrowserType.AuthSession com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations:?: TERNARY null = ((wrap int:0x0017: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations) : (r8v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations))
             A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.Config.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations):void type: THIS */
            public /* synthetic */ Config(Boolean bool, Boolean bool2, String str, String str2, String str3, IntegrationStepBrowserType integrationStepBrowserType, Localizations localizations, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, str, str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? IntegrationStepBrowserType.AuthSession : integrationStepBrowserType, (i10 & 64) != 0 ? null : localizations);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class PendingUiPage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PendingUiPage> CREATOR = new Creator();

        @Nullable
        private final C3793Ui uiStep;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<PendingUiPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PendingUiPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingUiPage(parcel.readInt() == 0 ? null : C3793Ui.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PendingUiPage[] newArray(int i10) {
                return new PendingUiPage[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public PendingUiPage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final C3793Ui getUiStep() {
            return this.uiStep;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            C3793Ui c3793Ui = this.uiStep;
            if (c3793Ui == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                c3793Ui.writeToParcel(dest, flags);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public PendingUiPage(@Nullable C3793Ui c3793Ui) {
            this.uiStep = c3793Ui;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui))
         A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.PendingUiPage.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui):void type: THIS */
        public /* synthetic */ PendingUiPage(C3793Ui c3793Ui, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : c3793Ui);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0018\u0019\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "Localizations", "PromptPage", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class C3793Ui extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C3793Ui> CREATOR = new Creator();

        @NotNull
        private final Config config;

        @NotNull
        private final String name;

        @Nullable
        private final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Creator */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<C3793Ui> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C3793Ui createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C3793Ui(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.UiStepStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C3793Ui[] newArray(int i10) {
                return new C3793Ui[i10];
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations */
        @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "webviewPendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getWebviewPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();

            @Nullable
            private final CancelDialog cancelDialog;

            @Nullable
            private final PromptPage promptPage;

            @Nullable
            private final WebViewPendingPage webviewPendingPage;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations$Creator */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Localizations(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WebViewPendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(@Nullable PromptPage promptPage, @Nullable CancelDialog cancelDialog, @InterfaceC11872g(name = "webviewPage") @Nullable WebViewPendingPage webViewPendingPage) {
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
                this.webviewPendingPage = webViewPendingPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @Nullable
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            public final WebViewPendingPage getWebviewPendingPage() {
                return this.webviewPendingPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                WebViewPendingPage webViewPendingPage = this.webviewPendingPage;
                if (webViewPendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    webViewPendingPage.writeToParcel(dest, flags);
                }
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config)
          (wrap com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Ui.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C3793Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i10 & 4) != 0 ? null : uiStepStyle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Nullable
        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            this.config.writeToParcel(dest, flags);
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            if (uiStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepStyle.writeToParcel(dest, flags);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3793Ui(@NotNull String name, @NotNull Config config, @Nullable StepStyles.UiStepStyle uiStepStyle) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(config, "config");
            this.name = name;
            this.config = config;
            this.styles = uiStepStyle;
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config */
        @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Landroid/os/Parcelable;", "components", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "backStepEnabled", "", "cancelButtonEnabled", "terminal", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "webviewUrl", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/util/List;Ljava/lang/String;)V", "getComponents", "()Ljava/util/List;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getTerminal", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getServerComponentErrors", "getWebviewUrl", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @Nullable
            private final Boolean backStepEnabled;

            @Nullable
            private final Boolean cancelButtonEnabled;

            @Nullable
            private final List<UiComponentConfig> components;

            @Nullable
            private final Localizations localizations;

            @Nullable
            private final List<UiComponentError> serverComponentErrors;

            @Nullable
            private final Boolean terminal;

            @Nullable
            private final String webviewUrl;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config$Creator */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ArrayList arrayList2 = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i10 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i10);
                        for (int i11 = 0; i11 != i10; i11++) {
                            arrayList3.add(parcel.readParcelable(Config.class.getClassLoader()));
                        }
                        arrayList = arrayList3;
                    }
                    Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Localizations localizationsCreateFromParcel = parcel.readInt() == 0 ? null : Localizations.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int i12 = parcel.readInt();
                        arrayList2 = new ArrayList(i12);
                        for (int i13 = 0; i13 != i12; i13++) {
                            arrayList2.add(parcel.readParcelable(Config.class.getClassLoader()));
                        }
                    }
                    return new Config(arrayList, boolValueOf, boolValueOf2, boolValueOf3, localizationsCreateFromParcel, arrayList2, parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i10) {
                    return new Config[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError> */
            /* JADX WARN: Multi-variable type inference failed */
            public Config(@Nullable List<? extends UiComponentConfig> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Localizations localizations, @Nullable List<? extends UiComponentError> list2, @Nullable String str) {
                this.components = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.terminal = bool3;
                this.localizations = localizations;
                this.serverComponentErrors = list2;
                this.webviewUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            @Nullable
            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            @Nullable
            public final List<UiComponentConfig> getComponents() {
                return this.components;
            }

            @Nullable
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            @Nullable
            public final List<UiComponentError> getServerComponentErrors() {
                return this.serverComponentErrors;
            }

            @Nullable
            public final Boolean getTerminal() {
                return this.terminal;
            }

            @Nullable
            public final String getWebviewUrl() {
                return this.webviewUrl;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<UiComponentConfig> list = this.components;
                if (list == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(list.size());
                    Iterator<UiComponentConfig> it = list.iterator();
                    while (it.hasNext()) {
                        dest.writeParcelable(it.next(), flags);
                    }
                }
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                Boolean bool3 = this.terminal;
                if (bool3 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    localizations.writeToParcel(dest, flags);
                }
                List<UiComponentError> list2 = this.serverComponentErrors;
                if (list2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(list2.size());
                    Iterator<UiComponentError> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        dest.writeParcelable(it2.next(), flags);
                    }
                }
                dest.writeString(this.webviewUrl);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
              (r2v0 java.util.List)
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations:?: TERNARY null = ((wrap int:0x0010: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations))
              (wrap java.util.List:?: TERNARY null = ((wrap int:0x0015: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
             A[MD:(java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig>, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations, java.util.List<? extends com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError>, java.lang.String):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Ui.Config.<init>(java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations, java.util.List, java.lang.String):void type: THIS */
            public /* synthetic */ Config(List list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List list2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : localizations, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : str);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$PromptPage */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Landroid/os/Parcelable;", "navBarTitle", "", "gpsPermissionsBtnCancel", "gpsPermissionsAllowButtonText", "gpsFeatureTurnOnText", "gpsPermissionsPrompt", "gpsPermissionsTitle", "gpsFeaturePrompt", "gpsFeatureTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNavBarTitle", "()Ljava/lang/String;", "getGpsPermissionsBtnCancel", "getGpsPermissionsAllowButtonText", "getGpsFeatureTurnOnText", "getGpsPermissionsPrompt", "getGpsPermissionsTitle", "getGpsFeaturePrompt", "getGpsFeatureTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

            @Nullable
            private final String gpsFeaturePrompt;

            @Nullable
            private final String gpsFeatureTitle;

            @Nullable
            private final String gpsFeatureTurnOnText;

            @Nullable
            private final String gpsPermissionsAllowButtonText;

            @Nullable
            private final String gpsPermissionsBtnCancel;

            @Nullable
            private final String gpsPermissionsPrompt;

            @Nullable
            private final String gpsPermissionsTitle;

            @Nullable
            private final String navBarTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$PromptPage$Creator */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PromptPage(@Nullable String str, @Nullable String str2, @InterfaceC11872g(name = "gpsPermissionsBtnContinueMobile") @Nullable String str3, @InterfaceC11872g(name = "gpsDeviceFeatureBtnContinueMobile") @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
                this.navBarTitle = str;
                this.gpsPermissionsBtnCancel = str2;
                this.gpsPermissionsAllowButtonText = str3;
                this.gpsFeatureTurnOnText = str4;
                this.gpsPermissionsPrompt = str5;
                this.gpsPermissionsTitle = str6;
                this.gpsFeaturePrompt = str7;
                this.gpsFeatureTitle = str8;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getGpsFeaturePrompt() {
                return this.gpsFeaturePrompt;
            }

            @Nullable
            public final String getGpsFeatureTitle() {
                return this.gpsFeatureTitle;
            }

            @Nullable
            public final String getGpsFeatureTurnOnText() {
                return this.gpsFeatureTurnOnText;
            }

            @Nullable
            public final String getGpsPermissionsAllowButtonText() {
                return this.gpsPermissionsAllowButtonText;
            }

            @Nullable
            public final String getGpsPermissionsBtnCancel() {
                return this.gpsPermissionsBtnCancel;
            }

            @Nullable
            public final String getGpsPermissionsPrompt() {
                return this.gpsPermissionsPrompt;
            }

            @Nullable
            public final String getGpsPermissionsTitle() {
                return this.gpsPermissionsTitle;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.navBarTitle);
                dest.writeString(this.gpsPermissionsBtnCancel);
                dest.writeString(this.gpsPermissionsAllowButtonText);
                dest.writeString(this.gpsFeatureTurnOnText);
                dest.writeString(this.gpsPermissionsPrompt);
                dest.writeString(this.gpsPermissionsTitle);
                dest.writeString(this.gpsFeaturePrompt);
                dest.writeString(this.gpsFeatureTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
              (r2v0 java.lang.String)
              (r3v0 java.lang.String)
              (r4v0 java.lang.String)
              (r5v0 java.lang.String)
              (r6v0 java.lang.String)
              (r7v0 java.lang.String)
              (r8v0 java.lang.String)
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Ui.PromptPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Unknown extends NextStep {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(EnvironmentCompat.MEDIA_UNKNOWN, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1141780238;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "Landroid/os/Parcelable;", Title.type, "", "description", "launchButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLaunchButtonTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class WebViewPendingPage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<WebViewPendingPage> CREATOR = new Creator();

        @Nullable
        private final String description;

        @Nullable
        private final String launchButtonTitle;

        @Nullable
        private final String title;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<WebViewPendingPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebViewPendingPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WebViewPendingPage(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebViewPendingPage[] newArray(int i10) {
                return new WebViewPendingPage[i10];
            }
        }

        public WebViewPendingPage(@Nullable String str, @InterfaceC11872g(name = "descriptionMobile") @Nullable String str2, @InterfaceC11872g(name = "btnLaunchMobile") @Nullable String str3) {
            this.title = str;
            this.description = str2;
            this.launchButtonTitle = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getLaunchButtonTitle() {
            return this.launchButtonTitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.launchButtonTitle);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ NextStep(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\t\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;)V", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "StartPage", "Localizations", "CapturePage", "CheckPage", "PromptPage", "PendingPage", "Pages", "AssetConfig", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Document extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new Creator();

        @NotNull
        private final Config config;

        @NotNull
        private final String name;

        @Nullable
        private final StepStyles.DocumentStepStyle styles;

        @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PendingPage", "PromptPage", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();

            @Nullable
            private final PendingPage pendingPage;

            @Nullable
            private final PromptPage promptPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLoadingPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class PendingPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage headerPictograph;

                @Nullable
                private final RemoteImage loadingPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i10) {
                        return new PendingPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                @NotNull
                public final PendingPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.m31980c(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public PendingPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.AssetConfig.PendingPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "documentPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getDocumentPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage documentPictograph;

                @Nullable
                private final RemoteImage headerPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public PromptPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.documentPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage2);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                @NotNull
                public final PromptPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage documentPictograph) {
                    return new PromptPage(headerPictograph, documentPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.m31980c(this.documentPictograph, promptPage.documentPictograph);
                }

                @Nullable
                public final RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.documentPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", documentPictograph=" + this.documentPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.documentPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public PromptPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.documentPictograph = remoteImage2;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.AssetConfig.PromptPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, PendingPage pendingPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i10 & 2) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(promptPage, pendingPage);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final AssetConfig copy(@Nullable PromptPage promptPage, @Nullable PendingPage pendingPage) {
                return new AssetConfig(promptPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.m31980c(this.promptPage, assetConfig.promptPage) && Intrinsics.m31980c(this.pendingPage, assetConfig.pendingPage);
            }

            @Nullable
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @Nullable
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public AssetConfig(@Nullable PromptPage promptPage, @Nullable PendingPage pendingPage) {
                this.promptPage = promptPage;
                this.pendingPage = pendingPage;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PromptPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PromptPage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PromptPage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.AssetConfig.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage):void type: THIS */
            public /* synthetic */ AssetConfig(PromptPage promptPage, PendingPage pendingPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : promptPage, (i10 & 2) != 0 ? null : pendingPage);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CapturePage;", "Landroid/os/Parcelable;", "navBarTitle", "", "<init>", "(Ljava/lang/String;)V", "getNavBarTitle", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CapturePage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();

            @Nullable
            private final String navBarTitle;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CapturePage(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i10) {
                    return new CapturePage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public CapturePage() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public CapturePage(@Nullable String str) {
                this.navBarTitle = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
             A[MD:(java.lang.String):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.CapturePage.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ CapturePage(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CheckPage;", "Landroid/os/Parcelable;", "navBarTitle", "", "<init>", "(Ljava/lang/String;)V", "getNavBarTitle", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CheckPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();

            @Nullable
            private final String navBarTitle;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CheckPage(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i10) {
                    return new CheckPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public CheckPage() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public CheckPage(@Nullable String str) {
                this.navBarTitle = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
             A[MD:(java.lang.String):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.CheckPage.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ CheckPage(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }
        }

        @Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010+\u001a\u00020\u0006J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00061"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "Landroid/os/Parcelable;", "backStepEnabled", "", "cancelButtonEnabled", "documentFileLimit", "", "documentId", "", "startPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "fieldKeyDocument", "kind", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getDocumentFileLimit", "()I", "getDocumentId", "()Ljava/lang/String;", "getStartPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "getFieldKeyDocument", "getKind", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @Nullable
            private final AssetConfig assets;

            @Nullable
            private final Boolean backStepEnabled;

            @Nullable
            private final Boolean cancelButtonEnabled;
            private final int documentFileLimit;

            @Nullable
            private final String documentId;

            @NotNull
            private final String fieldKeyDocument;

            @NotNull
            private final String kind;

            @NotNull
            private final Localizations localizations;

            @Nullable
            private final Pages pages;

            @Nullable
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            @NotNull
            private final StartPage startPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition */
                /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition */
                /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition */
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Parcelable parcelable;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        parcelable = null;
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        parcelable = null;
                    }
                    return new Config(boolValueOf, boolValueOf2, parcel.readInt(), parcel.readString(), StartPage.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Localizations.CREATOR.createFromParcel(parcel), (Pages) (parcel.readInt() == 0 ? parcelable : Pages.CREATOR.createFromParcel(parcel)), (AssetConfig) (parcel.readInt() == 0 ? parcelable : AssetConfig.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? parcelable : PendingPageTextPosition.valueOf(parcel.readString()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i10) {
                    return new Config[i10];
                }
            }

            public Config(@Nullable Boolean bool, @Nullable Boolean bool2, int i10, @Nullable String str, @NotNull StartPage startPage, @NotNull String fieldKeyDocument, @NotNull String kind, @NotNull Localizations localizations, @Nullable Pages pages, @Nullable AssetConfig assetConfig, @Nullable PendingPageTextPosition pendingPageTextPosition) {
                Intrinsics.checkNotNullParameter(startPage, "startPage");
                Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
                Intrinsics.checkNotNullParameter(kind, "kind");
                Intrinsics.checkNotNullParameter(localizations, "localizations");
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.documentFileLimit = i10;
                this.documentId = str;
                this.startPage = startPage;
                this.fieldKeyDocument = fieldKeyDocument;
                this.kind = kind;
                this.localizations = localizations;
                this.pages = pages;
                this.assets = assetConfig;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final AssetConfig getAssets() {
                return this.assets;
            }

            @Nullable
            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            @Nullable
            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final int getDocumentFileLimit() {
                return this.documentFileLimit;
            }

            @Nullable
            public final String getDocumentId() {
                return this.documentId;
            }

            @NotNull
            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            @NotNull
            public final String getKind() {
                return this.kind;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            @Nullable
            public final Pages getPages() {
                return this.pages;
            }

            @Nullable
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @NotNull
            public final StartPage getStartPage() {
                return this.startPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                dest.writeInt(this.documentFileLimit);
                dest.writeString(this.documentId);
                dest.writeString(this.startPage.name());
                dest.writeString(this.fieldKeyDocument);
                dest.writeString(this.kind);
                this.localizations.writeToParcel(dest, flags);
                Pages pages = this.pages;
                if (pages == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pages.writeToParcel(dest, flags);
                }
                AssetConfig assetConfig = this.assets;
                if (assetConfig == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    assetConfig.writeToParcel(dest, flags);
                }
                PendingPageTextPosition pendingPageTextPosition = this.pendingPageTextVerticalPosition;
                if (pendingPageTextPosition == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(pendingPageTextPosition.name());
                }
            }
        }

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), parcel.readInt() == 0 ? null : StepStyles.DocumentStepStyle.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i10) {
                return new Document[i10];
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "", "<init>", "(Ljava/lang/String;I)V", "PROMPT", "REVIEW", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum StartPage {
            PROMPT,
            REVIEW;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            @NotNull
            public static InterfaceC10707a<StartPage> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Document(@NotNull String name, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull Config config) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(config, "config");
            this.name = name;
            this.styles = documentStepStyle;
            this.config = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Nullable
        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            if (documentStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepStyle.writeToParcel(dest, flags);
            }
            this.config.writeToParcel(dest, flags);
        }

        @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Landroid/os/Parcelable;", "document", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;)V", "getDocument", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DocumentPages", "DocumentStartPage", "UploadOptionsDialog", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final /* data */ class Pages implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Pages> CREATOR = new Creator();

            @Nullable
            private final DocumentPages document;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Pages> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pages(parcel.readInt() == 0 ? null : DocumentPages.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages[] newArray(int i10) {
                    return new Pages[i10];
                }
            }

            @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "componentNameMapping", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ComponentNameMapping", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class DocumentStartPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<DocumentStartPage> CREATOR = new Creator();

                @Nullable
                private final ComponentNameMapping componentNameMapping;

                @NotNull
                private final C3793Ui uiStep;

                @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "Landroid/os/Parcelable;", "buttonFilePicker", "", "buttonPhotoLibrary", "buttonCamera", "buttonUploadOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonFilePicker", "()Ljava/lang/String;", "getButtonPhotoLibrary", "getButtonCamera", "getButtonUploadOptions", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                @InterfaceC11874i(generateAdapter = true)
                public static final /* data */ class ComponentNameMapping implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();

                    @Nullable
                    private final String buttonCamera;

                    @Nullable
                    private final String buttonFilePicker;

                    @Nullable
                    private final String buttonPhotoLibrary;

                    @Nullable
                    private final String buttonUploadOptions;

                    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i10) {
                            return new ComponentNameMapping[i10];
                        }
                    }

                    public ComponentNameMapping(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonUploadOptions = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i10 & 8) != 0) {
                            str4 = componentNameMapping.buttonUploadOptions;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    @NotNull
                    public final ComponentNameMapping copy(@Nullable String buttonFilePicker, @Nullable String buttonPhotoLibrary, @Nullable String buttonCamera, @Nullable String buttonUploadOptions) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonUploadOptions);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                        return Intrinsics.m31980c(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.m31980c(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.m31980c(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.m31980c(this.buttonUploadOptions, componentNameMapping.buttonUploadOptions);
                    }

                    @Nullable
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    @Nullable
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    @Nullable
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    @Nullable
                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonUploadOptions;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "ComponentNameMapping(buttonFilePicker=" + this.buttonFilePicker + ", buttonPhotoLibrary=" + this.buttonPhotoLibrary + ", buttonCamera=" + this.buttonCamera + ", buttonUploadOptions=" + this.buttonUploadOptions + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.buttonFilePicker);
                        dest.writeString(this.buttonPhotoLibrary);
                        dest.writeString(this.buttonCamera);
                        dest.writeString(this.buttonUploadOptions);
                    }
                }

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<DocumentStartPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DocumentStartPage(C3793Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage[] newArray(int i10) {
                        return new DocumentStartPage[i10];
                    }
                }

                public DocumentStartPage(@NotNull C3793Ui uiStep, @Nullable ComponentNameMapping componentNameMapping) {
                    Intrinsics.checkNotNullParameter(uiStep, "uiStep");
                    this.uiStep = uiStep;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ DocumentStartPage copy$default(DocumentStartPage documentStartPage, C3793Ui c3793Ui, ComponentNameMapping componentNameMapping, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        c3793Ui = documentStartPage.uiStep;
                    }
                    if ((i10 & 2) != 0) {
                        componentNameMapping = documentStartPage.componentNameMapping;
                    }
                    return documentStartPage.copy(c3793Ui, componentNameMapping);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C3793Ui getUiStep() {
                    return this.uiStep;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final DocumentStartPage copy(@NotNull C3793Ui uiStep, @Nullable ComponentNameMapping componentNameMapping) {
                    Intrinsics.checkNotNullParameter(uiStep, "uiStep");
                    return new DocumentStartPage(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentStartPage)) {
                        return false;
                    }
                    DocumentStartPage documentStartPage = (DocumentStartPage) other;
                    return Intrinsics.m31980c(this.uiStep, documentStartPage.uiStep) && Intrinsics.m31980c(this.componentNameMapping, documentStartPage.componentNameMapping);
                }

                @Nullable
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final C3793Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                @NotNull
                public String toString() {
                    return "DocumentStartPage(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.uiStep.writeToParcel(dest, flags);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        componentNameMapping.writeToParcel(dest, flags);
                    }
                }
            }

            @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "componentNameMapping", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ComponentNameMapping", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class UploadOptionsDialog implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<UploadOptionsDialog> CREATOR = new Creator();

                @Nullable
                private final ComponentNameMapping componentNameMapping;

                @NotNull
                private final C3793Ui uiStep;

                @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "Landroid/os/Parcelable;", "buttonFilePicker", "", "buttonPhotoLibrary", "buttonCamera", "buttonCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonFilePicker", "()Ljava/lang/String;", "getButtonPhotoLibrary", "getButtonCamera", "getButtonCancel", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                @InterfaceC11874i(generateAdapter = true)
                public static final /* data */ class ComponentNameMapping implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();

                    @Nullable
                    private final String buttonCamera;

                    @Nullable
                    private final String buttonCancel;

                    @Nullable
                    private final String buttonFilePicker;

                    @Nullable
                    private final String buttonPhotoLibrary;

                    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i10) {
                            return new ComponentNameMapping[i10];
                        }
                    }

                    public ComponentNameMapping(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonCancel = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i10 & 8) != 0) {
                            str4 = componentNameMapping.buttonCancel;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    @Nullable
                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    @NotNull
                    public final ComponentNameMapping copy(@Nullable String buttonFilePicker, @Nullable String buttonPhotoLibrary, @Nullable String buttonCamera, @Nullable String buttonCancel) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonCancel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                        return Intrinsics.m31980c(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.m31980c(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.m31980c(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.m31980c(this.buttonCancel, componentNameMapping.buttonCancel);
                    }

                    @Nullable
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    @Nullable
                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    @Nullable
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    @Nullable
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonCancel;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "ComponentNameMapping(buttonFilePicker=" + this.buttonFilePicker + ", buttonPhotoLibrary=" + this.buttonPhotoLibrary + ", buttonCamera=" + this.buttonCamera + ", buttonCancel=" + this.buttonCancel + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.buttonFilePicker);
                        dest.writeString(this.buttonPhotoLibrary);
                        dest.writeString(this.buttonCamera);
                        dest.writeString(this.buttonCancel);
                    }
                }

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<UploadOptionsDialog> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UploadOptionsDialog(C3793Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog[] newArray(int i10) {
                        return new UploadOptionsDialog[i10];
                    }
                }

                public UploadOptionsDialog(@NotNull C3793Ui uiStep, @Nullable ComponentNameMapping componentNameMapping) {
                    Intrinsics.checkNotNullParameter(uiStep, "uiStep");
                    this.uiStep = uiStep;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ UploadOptionsDialog copy$default(UploadOptionsDialog uploadOptionsDialog, C3793Ui c3793Ui, ComponentNameMapping componentNameMapping, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        c3793Ui = uploadOptionsDialog.uiStep;
                    }
                    if ((i10 & 2) != 0) {
                        componentNameMapping = uploadOptionsDialog.componentNameMapping;
                    }
                    return uploadOptionsDialog.copy(c3793Ui, componentNameMapping);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C3793Ui getUiStep() {
                    return this.uiStep;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final UploadOptionsDialog copy(@NotNull C3793Ui uiStep, @Nullable ComponentNameMapping componentNameMapping) {
                    Intrinsics.checkNotNullParameter(uiStep, "uiStep");
                    return new UploadOptionsDialog(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UploadOptionsDialog)) {
                        return false;
                    }
                    UploadOptionsDialog uploadOptionsDialog = (UploadOptionsDialog) other;
                    return Intrinsics.m31980c(this.uiStep, uploadOptionsDialog.uiStep) && Intrinsics.m31980c(this.componentNameMapping, uploadOptionsDialog.componentNameMapping);
                }

                @Nullable
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final C3793Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                @NotNull
                public String toString() {
                    return "UploadOptionsDialog(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.uiStep.writeToParcel(dest, flags);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        componentNameMapping.writeToParcel(dest, flags);
                    }
                }
            }

            public Pages(@Nullable DocumentPages documentPages) {
                this.document = documentPages;
            }

            public static /* synthetic */ Pages copy$default(Pages pages, DocumentPages documentPages, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    documentPages = pages.document;
                }
                return pages.copy(documentPages);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentPages getDocument() {
                return this.document;
            }

            @NotNull
            public final Pages copy(@Nullable DocumentPages document) {
                return new Pages(document);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pages) && Intrinsics.m31980c(this.document, ((Pages) other).document);
            }

            @Nullable
            public final DocumentPages getDocument() {
                return this.document;
            }

            public int hashCode() {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    return 0;
                }
                return documentPages.hashCode();
            }

            @NotNull
            public String toString() {
                return "Pages(document=" + this.document + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    documentPages.writeToParcel(dest, flags);
                }
            }

            @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "Landroid/os/Parcelable;", "prompt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "uploadOptionsDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "pending", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;)V", "getPrompt", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "getUploadOptionsDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "getPending", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class DocumentPages implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<DocumentPages> CREATOR = new Creator();

                @Nullable
                private final PendingUiPage pending;

                @Nullable
                private final DocumentStartPage prompt;

                @Nullable
                private final UploadOptionsDialog uploadOptionsDialog;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<DocumentPages> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DocumentPages(parcel.readInt() == 0 ? null : DocumentStartPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UploadOptionsDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingUiPage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages[] newArray(int i10) {
                        return new DocumentPages[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public DocumentPages(@Nullable DocumentStartPage documentStartPage, @Nullable UploadOptionsDialog uploadOptionsDialog, @Nullable PendingUiPage pendingUiPage) {
                    this.prompt = documentStartPage;
                    this.uploadOptionsDialog = uploadOptionsDialog;
                    this.pending = pendingUiPage;
                }

                public static /* synthetic */ DocumentPages copy$default(DocumentPages documentPages, DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog, PendingUiPage pendingUiPage, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        documentStartPage = documentPages.prompt;
                    }
                    if ((i10 & 2) != 0) {
                        uploadOptionsDialog = documentPages.uploadOptionsDialog;
                    }
                    if ((i10 & 4) != 0) {
                        pendingUiPage = documentPages.pending;
                    }
                    return documentPages.copy(documentStartPage, uploadOptionsDialog, pendingUiPage);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final PendingUiPage getPending() {
                    return this.pending;
                }

                @NotNull
                public final DocumentPages copy(@Nullable DocumentStartPage prompt, @Nullable UploadOptionsDialog uploadOptionsDialog, @Nullable PendingUiPage pending) {
                    return new DocumentPages(prompt, uploadOptionsDialog, pending);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentPages)) {
                        return false;
                    }
                    DocumentPages documentPages = (DocumentPages) other;
                    return Intrinsics.m31980c(this.prompt, documentPages.prompt) && Intrinsics.m31980c(this.uploadOptionsDialog, documentPages.uploadOptionsDialog) && Intrinsics.m31980c(this.pending, documentPages.pending);
                }

                @Nullable
                public final PendingUiPage getPending() {
                    return this.pending;
                }

                @Nullable
                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                @Nullable
                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public int hashCode() {
                    DocumentStartPage documentStartPage = this.prompt;
                    int iHashCode = (documentStartPage == null ? 0 : documentStartPage.hashCode()) * 31;
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    int iHashCode2 = (iHashCode + (uploadOptionsDialog == null ? 0 : uploadOptionsDialog.hashCode())) * 31;
                    PendingUiPage pendingUiPage = this.pending;
                    return iHashCode2 + (pendingUiPage != null ? pendingUiPage.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "DocumentPages(prompt=" + this.prompt + ", uploadOptionsDialog=" + this.uploadOptionsDialog + ", pending=" + this.pending + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DocumentStartPage documentStartPage = this.prompt;
                    if (documentStartPage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        documentStartPage.writeToParcel(dest, flags);
                    }
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    if (uploadOptionsDialog == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        uploadOptionsDialog.writeToParcel(dest, flags);
                    }
                    PendingUiPage pendingUiPage = this.pending;
                    if (pendingUiPage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        pendingUiPage.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
                  (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$DocumentStartPage)
                  (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$UploadOptionsDialog)
                  (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$DocumentStartPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$UploadOptionsDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.Pages.DocumentPages.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$DocumentStartPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$Pages$UploadOptionsDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void type: THIS */
                public /* synthetic */ DocumentPages(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog, PendingUiPage pendingUiPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(documentStartPage, uploadOptionsDialog, (i10 & 4) != 0 ? null : pendingUiPage);
                }
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "Landroid/os/Parcelable;", Title.type, "", "description", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @Nullable
            private final String description;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PendingPage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                this.title = str;
                this.description = str2;
                this.navBarTitle = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (r1v0 java.lang.String)
              (r2v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.PendingPage.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PendingPage(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "Landroid/os/Parcelable;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CapturePage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CheckPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CheckPage;)V", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CapturePage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$CheckPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();

            @Nullable
            private final CancelDialog cancelDialog;

            @Nullable
            private final CapturePage capturePage;

            @Nullable
            private final CheckPage checkPage;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Localizations(PendingPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CapturePage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CheckPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Localizations(@NotNull PendingPage pendingPage, @NotNull PromptPage promptPage, @Nullable CancelDialog cancelDialog, @Nullable CapturePage capturePage, @Nullable CheckPage checkPage) {
                Intrinsics.checkNotNullParameter(pendingPage, "pendingPage");
                Intrinsics.checkNotNullParameter(promptPage, "promptPage");
                this.pendingPage = pendingPage;
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @Nullable
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @Nullable
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.pendingPage.writeToParcel(dest, flags);
                this.promptPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                CapturePage capturePage = this.capturePage;
                if (capturePage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    capturePage.writeToParcel(dest, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    checkPage.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
              (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PendingPage)
              (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PromptPage)
              (r4v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CapturePage:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CapturePage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CapturePage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CheckPage:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CheckPage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CheckPage))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PendingPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CapturePage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CheckPage):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.Localizations.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PendingPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CapturePage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$CheckPage):void type: THIS */
            public /* synthetic */ Localizations(PendingPage pendingPage, PromptPage promptPage, CancelDialog cancelDialog, CapturePage capturePage, CheckPage checkPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(pendingPage, promptPage, cancelDialog, (i10 & 8) != 0 ? null : capturePage, (i10 & 16) != 0 ? null : checkPage);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006'"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "Landroid/os/Parcelable;", Title.type, "", "prompt", "disclaimer", "captureOptionsDialogTitle", "btnCapture", "btnUpload", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "largeFileErrorPrompt", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getDisclaimer", "getCaptureOptionsDialogTitle", "getBtnCapture", "getBtnUpload", "getBtnSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getLargeFileErrorPrompt", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

            @Nullable
            private final String btnCapture;

            @Nullable
            private final String btnSubmit;

            @Nullable
            private final String btnUpload;

            @Nullable
            private final String cameraPermissionsAllowButtonText;

            @Nullable
            private final String cameraPermissionsCancelButtonText;

            @Nullable
            private final String cameraPermissionsPrompt;

            @Nullable
            private final String cameraPermissionsTitle;

            @Nullable
            private final String captureOptionsDialogTitle;

            @Nullable
            private final String disclaimer;

            @Nullable
            private final String largeFileErrorPrompt;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String prompt;

            @Nullable
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PromptPage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @InterfaceC11872g(name = "cameraPermissionsBtnContinueMobile") @Nullable String str10, @InterfaceC11872g(name = "cameraPermissionsBtnCancel") @Nullable String str11, @Nullable String str12, @Nullable String str13) {
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.captureOptionsDialogTitle = str4;
                this.btnCapture = str5;
                this.btnUpload = str6;
                this.btnSubmit = str7;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
                this.largeFileErrorPrompt = str12;
                this.navBarTitle = str13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getBtnCapture() {
                return this.btnCapture;
            }

            @Nullable
            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            @Nullable
            public final String getBtnUpload() {
                return this.btnUpload;
            }

            @Nullable
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            @Nullable
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            @Nullable
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            @Nullable
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @Nullable
            public final String getCaptureOptionsDialogTitle() {
                return this.captureOptionsDialogTitle;
            }

            @Nullable
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @Nullable
            public final String getLargeFileErrorPrompt() {
                return this.largeFileErrorPrompt;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.disclaimer);
                dest.writeString(this.captureOptionsDialogTitle);
                dest.writeString(this.btnCapture);
                dest.writeString(this.btnUpload);
                dest.writeString(this.btnSubmit);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.largeFileErrorPrompt);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (r22v0 java.lang.String)
              (r23v0 java.lang.String)
              (r24v0 java.lang.String)
              (r25v0 java.lang.String)
              (r26v0 java.lang.String)
              (r27v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.PromptPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i10 & 4096) != 0 ? null : str13);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private NextStep(String str) {
        this.name = str;
    }

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u0013\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Config", "Pages", "DigitalIdConfig", "DigitalIdRequest", "LocalizationOverride", "Localizations", "SelectPage", "PromptPage", "CapturePage", "CheckPage", "PendingPage", "RequestPage", "ReviewUploadPage", "AutoClassificationPage", "PassportNfcOption", "CaptureFileType", "VideoCaptureMethod", "AssetConfig", "AutoClassificationConfig", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class GovernmentId extends NextStep {

        @NotNull
        private final Config config;

        @NotNull
        private final String name;

        @Nullable
        private final StepStyles.GovernmentIdStepStyle styles;

        @Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005,-./0BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Landroid/os/Parcelable;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;)V", "getSelectPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CapturePage", "CheckPage", "PendingPage", "PromptPage", "SelectPage", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();

            @Nullable
            private final CapturePage capturePage;

            @Nullable
            private final CheckPage checkPage;

            @Nullable
            private final PendingPage pendingPage;

            @Nullable
            private final PromptPage promptPage;

            @Nullable
            private final SelectPage selectPage;

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u00060"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Landroid/os/Parcelable;", "idFrontPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph", "staticCaptureTipsIconPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getIdFrontPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "getIdFrontHelpModalPictograph", "getIdBackHelpModalPictograph", "getBarcodeHelpModalPictograph", "getStaticCaptureTipsIconPictograph", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class CapturePage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage barcodeHelpModalPictograph;

                @Nullable
                private final RemoteImage barcodePdf417Pictograph;

                @Nullable
                private final RemoteImage idBackHelpModalPictograph;

                @Nullable
                private final RemoteImage idBackPictograph;

                @Nullable
                private final RemoteImage idFrontHelpModalPictograph;

                @Nullable
                private final RemoteImage idFrontPictograph;

                @Nullable
                private final RemoteImage passportFrontPictograph;

                @Nullable
                private final RemoteImage passportSignaturePictograph;

                @Nullable
                private final RemoteImage staticCaptureTipsIconPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<CapturePage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CapturePage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage[] newArray(int i10) {
                        return new CapturePage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public CapturePage() {
                    this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                }

                public static /* synthetic */ CapturePage copy$default(CapturePage capturePage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, RemoteImage remoteImage9, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = capturePage.idFrontPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = capturePage.idBackPictograph;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = capturePage.barcodePdf417Pictograph;
                    }
                    if ((i10 & 8) != 0) {
                        remoteImage4 = capturePage.passportFrontPictograph;
                    }
                    if ((i10 & 16) != 0) {
                        remoteImage5 = capturePage.passportSignaturePictograph;
                    }
                    if ((i10 & 32) != 0) {
                        remoteImage6 = capturePage.idFrontHelpModalPictograph;
                    }
                    if ((i10 & 64) != 0) {
                        remoteImage7 = capturePage.idBackHelpModalPictograph;
                    }
                    if ((i10 & 128) != 0) {
                        remoteImage8 = capturePage.barcodeHelpModalPictograph;
                    }
                    if ((i10 & 256) != 0) {
                        remoteImage9 = capturePage.staticCaptureTipsIconPictograph;
                    }
                    RemoteImage remoteImage10 = remoteImage8;
                    RemoteImage remoteImage11 = remoteImage9;
                    RemoteImage remoteImage12 = remoteImage6;
                    RemoteImage remoteImage13 = remoteImage7;
                    RemoteImage remoteImage14 = remoteImage5;
                    RemoteImage remoteImage15 = remoteImage3;
                    return capturePage.copy(remoteImage, remoteImage2, remoteImage15, remoteImage4, remoteImage14, remoteImage12, remoteImage13, remoteImage10, remoteImage11);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component5, reason: from getter */
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component6, reason: from getter */
                public final RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component7, reason: from getter */
                public final RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component8, reason: from getter */
                public final RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component9, reason: from getter */
                public final RemoteImage getStaticCaptureTipsIconPictograph() {
                    return this.staticCaptureTipsIconPictograph;
                }

                @NotNull
                public final CapturePage copy(@Nullable RemoteImage idFrontPictograph, @Nullable RemoteImage idBackPictograph, @Nullable RemoteImage barcodePdf417Pictograph, @Nullable RemoteImage passportFrontPictograph, @Nullable RemoteImage passportSignaturePictograph, @Nullable RemoteImage idFrontHelpModalPictograph, @Nullable RemoteImage idBackHelpModalPictograph, @Nullable RemoteImage barcodeHelpModalPictograph, @Nullable RemoteImage staticCaptureTipsIconPictograph) {
                    return new CapturePage(idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph, idFrontHelpModalPictograph, idBackHelpModalPictograph, barcodeHelpModalPictograph, staticCaptureTipsIconPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CapturePage)) {
                        return false;
                    }
                    CapturePage capturePage = (CapturePage) other;
                    return Intrinsics.m31980c(this.idFrontPictograph, capturePage.idFrontPictograph) && Intrinsics.m31980c(this.idBackPictograph, capturePage.idBackPictograph) && Intrinsics.m31980c(this.barcodePdf417Pictograph, capturePage.barcodePdf417Pictograph) && Intrinsics.m31980c(this.passportFrontPictograph, capturePage.passportFrontPictograph) && Intrinsics.m31980c(this.passportSignaturePictograph, capturePage.passportSignaturePictograph) && Intrinsics.m31980c(this.idFrontHelpModalPictograph, capturePage.idFrontHelpModalPictograph) && Intrinsics.m31980c(this.idBackHelpModalPictograph, capturePage.idBackHelpModalPictograph) && Intrinsics.m31980c(this.barcodeHelpModalPictograph, capturePage.barcodeHelpModalPictograph) && Intrinsics.m31980c(this.staticCaptureTipsIconPictograph, capturePage.staticCaptureTipsIconPictograph);
                }

                @Nullable
                public final RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                @Nullable
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                @Nullable
                public final RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                @Nullable
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                @Nullable
                public final RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                @Nullable
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                @Nullable
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                @Nullable
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                @Nullable
                public final RemoteImage getStaticCaptureTipsIconPictograph() {
                    return this.staticCaptureTipsIconPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.idFrontPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    int iHashCode6 = (iHashCode5 + (remoteImage6 == null ? 0 : remoteImage6.hashCode())) * 31;
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    int iHashCode7 = (iHashCode6 + (remoteImage7 == null ? 0 : remoteImage7.hashCode())) * 31;
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    int iHashCode8 = (iHashCode7 + (remoteImage8 == null ? 0 : remoteImage8.hashCode())) * 31;
                    RemoteImage remoteImage9 = this.staticCaptureTipsIconPictograph;
                    return iHashCode8 + (remoteImage9 != null ? remoteImage9.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "CapturePage(idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ", idFrontHelpModalPictograph=" + this.idFrontHelpModalPictograph + ", idBackHelpModalPictograph=" + this.idBackHelpModalPictograph + ", barcodeHelpModalPictograph=" + this.barcodeHelpModalPictograph + ", staticCaptureTipsIconPictograph=" + this.staticCaptureTipsIconPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.idFrontPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    if (remoteImage6 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage6.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    if (remoteImage7 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage7.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    if (remoteImage8 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage8.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage9 = this.staticCaptureTipsIconPictograph;
                    if (remoteImage9 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage9.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public CapturePage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2, @Nullable RemoteImage remoteImage3, @Nullable RemoteImage remoteImage4, @Nullable RemoteImage remoteImage5, @Nullable RemoteImage remoteImage6, @Nullable RemoteImage remoteImage7, @Nullable RemoteImage remoteImage8, @Nullable RemoteImage remoteImage9) {
                    this.idFrontPictograph = remoteImage;
                    this.idBackPictograph = remoteImage2;
                    this.barcodePdf417Pictograph = remoteImage3;
                    this.passportFrontPictograph = remoteImage4;
                    this.passportSignaturePictograph = remoteImage5;
                    this.idFrontHelpModalPictograph = remoteImage6;
                    this.idBackHelpModalPictograph = remoteImage7;
                    this.barcodeHelpModalPictograph = remoteImage8;
                    this.staticCaptureTipsIconPictograph = remoteImage9;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x000b: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0010: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0015: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x001a: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x001f: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r8v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0024: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r9v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0029: ARITH (r11v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r10v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.CapturePage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ CapturePage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, RemoteImage remoteImage9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5, (i10 & 32) != 0 ? null : remoteImage6, (i10 & 64) != 0 ? null : remoteImage7, (i10 & 128) != 0 ? null : remoteImage8, (i10 & 256) != 0 ? null : remoteImage9);
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "Landroid/os/Parcelable;", "iconFile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getIconFile", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class CheckPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage iconFile;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<CheckPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CheckPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage[] newArray(int i10) {
                        return new CheckPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public CheckPage() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ CheckPage copy$default(CheckPage checkPage, RemoteImage remoteImage, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = checkPage.iconFile;
                    }
                    return checkPage.copy(remoteImage);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getIconFile() {
                    return this.iconFile;
                }

                @NotNull
                public final CheckPage copy(@Nullable RemoteImage iconFile) {
                    return new CheckPage(iconFile);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CheckPage) && Intrinsics.m31980c(this.iconFile, ((CheckPage) other).iconFile);
                }

                @Nullable
                public final RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        return 0;
                    }
                    return remoteImage.hashCode();
                }

                @NotNull
                public String toString() {
                    return "CheckPage(iconFile=" + this.iconFile + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public CheckPage(@Nullable RemoteImage remoteImage) {
                    this.iconFile = remoteImage;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.CheckPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ CheckPage(RemoteImage remoteImage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage);
                }
            }

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AssetConfig(parcel.readInt() == 0 ? null : SelectPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CapturePage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLoadingPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class PendingPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage headerPictograph;

                @Nullable
                private final RemoteImage loadingPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i10) {
                        return new PendingPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                @NotNull
                public final PendingPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.m31980c(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public PendingPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.PendingPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIdFrontPictograph", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage barcodePdf417Pictograph;

                @Nullable
                private final RemoteImage headerPictograph;

                @Nullable
                private final RemoteImage idBackPictograph;

                @Nullable
                private final RemoteImage idFrontPictograph;

                @Nullable
                private final RemoteImage passportFrontPictograph;

                @Nullable
                private final RemoteImage passportSignaturePictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public PromptPage() {
                    this(null, null, null, null, null, null, 63, null);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.idFrontPictograph;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = promptPage.idBackPictograph;
                    }
                    if ((i10 & 8) != 0) {
                        remoteImage4 = promptPage.barcodePdf417Pictograph;
                    }
                    if ((i10 & 16) != 0) {
                        remoteImage5 = promptPage.passportFrontPictograph;
                    }
                    if ((i10 & 32) != 0) {
                        remoteImage6 = promptPage.passportSignaturePictograph;
                    }
                    RemoteImage remoteImage7 = remoteImage5;
                    RemoteImage remoteImage8 = remoteImage6;
                    return promptPage.copy(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage7, remoteImage8);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component5, reason: from getter */
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component6, reason: from getter */
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                @NotNull
                public final PromptPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage idFrontPictograph, @Nullable RemoteImage idBackPictograph, @Nullable RemoteImage barcodePdf417Pictograph, @Nullable RemoteImage passportFrontPictograph, @Nullable RemoteImage passportSignaturePictograph) {
                    return new PromptPage(headerPictograph, idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.m31980c(this.idFrontPictograph, promptPage.idFrontPictograph) && Intrinsics.m31980c(this.idBackPictograph, promptPage.idBackPictograph) && Intrinsics.m31980c(this.barcodePdf417Pictograph, promptPage.barcodePdf417Pictograph) && Intrinsics.m31980c(this.passportFrontPictograph, promptPage.passportFrontPictograph) && Intrinsics.m31980c(this.passportSignaturePictograph, promptPage.passportSignaturePictograph);
                }

                @Nullable
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                @Nullable
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                @Nullable
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                @Nullable
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    return iHashCode5 + (remoteImage6 != null ? remoteImage6.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    if (remoteImage6 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage6.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public PromptPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2, @Nullable RemoteImage remoteImage3, @Nullable RemoteImage remoteImage4, @Nullable RemoteImage remoteImage5, @Nullable RemoteImage remoteImage6) {
                    this.headerPictograph = remoteImage;
                    this.idFrontPictograph = remoteImage2;
                    this.idBackPictograph = remoteImage3;
                    this.barcodePdf417Pictograph = remoteImage4;
                    this.passportFrontPictograph = remoteImage5;
                    this.passportSignaturePictograph = remoteImage6;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x000b: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0010: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0015: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x001a: ARITH (r8v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.PromptPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5, (i10 & 32) != 0 ? null : remoteImage6);
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconDriversLicense", "iconPassport", "iconNationalId", "iconGovernmentId", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIconDriversLicense", "getIconPassport", "getIconNationalId", "getIconGovernmentId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class SelectPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage headerPictograph;

                @Nullable
                private final RemoteImage iconDriversLicense;

                @Nullable
                private final RemoteImage iconGovernmentId;

                @Nullable
                private final RemoteImage iconNationalId;

                @Nullable
                private final RemoteImage iconPassport;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<SelectPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SelectPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage[] newArray(int i10) {
                        return new SelectPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public SelectPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static /* synthetic */ SelectPage copy$default(SelectPage selectPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = selectPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = selectPage.iconDriversLicense;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = selectPage.iconPassport;
                    }
                    if ((i10 & 8) != 0) {
                        remoteImage4 = selectPage.iconNationalId;
                    }
                    if ((i10 & 16) != 0) {
                        remoteImage5 = selectPage.iconGovernmentId;
                    }
                    RemoteImage remoteImage6 = remoteImage5;
                    RemoteImage remoteImage7 = remoteImage3;
                    return selectPage.copy(remoteImage, remoteImage2, remoteImage7, remoteImage4, remoteImage6);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                @Nullable
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                @Nullable
                /* JADX INFO: renamed from: component5, reason: from getter */
                public final RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                @NotNull
                public final SelectPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage iconDriversLicense, @Nullable RemoteImage iconPassport, @Nullable RemoteImage iconNationalId, @Nullable RemoteImage iconGovernmentId) {
                    return new SelectPage(headerPictograph, iconDriversLicense, iconPassport, iconNationalId, iconGovernmentId);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SelectPage)) {
                        return false;
                    }
                    SelectPage selectPage = (SelectPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, selectPage.headerPictograph) && Intrinsics.m31980c(this.iconDriversLicense, selectPage.iconDriversLicense) && Intrinsics.m31980c(this.iconPassport, selectPage.iconPassport) && Intrinsics.m31980c(this.iconNationalId, selectPage.iconNationalId) && Intrinsics.m31980c(this.iconGovernmentId, selectPage.iconGovernmentId);
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                public final RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                @Nullable
                public final RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                @Nullable
                public final RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                @Nullable
                public final RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.iconPassport;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.iconNationalId;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "SelectPage(headerPictograph=" + this.headerPictograph + ", iconDriversLicense=" + this.iconDriversLicense + ", iconPassport=" + this.iconPassport + ", iconNationalId=" + this.iconNationalId + ", iconGovernmentId=" + this.iconGovernmentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.iconPassport;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.iconNationalId;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public SelectPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2, @Nullable RemoteImage remoteImage3, @Nullable RemoteImage remoteImage4, @Nullable RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.iconDriversLicense = remoteImage2;
                    this.iconPassport = remoteImage3;
                    this.iconNationalId = remoteImage4;
                    this.iconGovernmentId = remoteImage5;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0010: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0015: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.SelectPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ SelectPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public AssetConfig() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    selectPage = assetConfig.selectPage;
                }
                if ((i10 & 2) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i10 & 4) != 0) {
                    capturePage = assetConfig.capturePage;
                }
                if ((i10 & 8) != 0) {
                    checkPage = assetConfig.checkPage;
                }
                if ((i10 & 16) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                PendingPage pendingPage2 = pendingPage;
                CapturePage capturePage2 = capturePage;
                return assetConfig.copy(selectPage, promptPage, capturePage2, checkPage, pendingPage2);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final AssetConfig copy(@Nullable SelectPage selectPage, @Nullable PromptPage promptPage, @Nullable CapturePage capturePage, @Nullable CheckPage checkPage, @Nullable PendingPage pendingPage) {
                return new AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.m31980c(this.selectPage, assetConfig.selectPage) && Intrinsics.m31980c(this.promptPage, assetConfig.promptPage) && Intrinsics.m31980c(this.capturePage, assetConfig.capturePage) && Intrinsics.m31980c(this.checkPage, assetConfig.checkPage) && Intrinsics.m31980c(this.pendingPage, assetConfig.pendingPage);
            }

            @Nullable
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @Nullable
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @Nullable
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @Nullable
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            public int hashCode() {
                SelectPage selectPage = this.selectPage;
                int iHashCode = (selectPage == null ? 0 : selectPage.hashCode()) * 31;
                PromptPage promptPage = this.promptPage;
                int iHashCode2 = (iHashCode + (promptPage == null ? 0 : promptPage.hashCode())) * 31;
                CapturePage capturePage = this.capturePage;
                int iHashCode3 = (iHashCode2 + (capturePage == null ? 0 : capturePage.hashCode())) * 31;
                CheckPage checkPage = this.checkPage;
                int iHashCode4 = (iHashCode3 + (checkPage == null ? 0 : checkPage.hashCode())) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode4 + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(selectPage=" + this.selectPage + ", promptPage=" + this.promptPage + ", capturePage=" + this.capturePage + ", checkPage=" + this.checkPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                SelectPage selectPage = this.selectPage;
                if (selectPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    selectPage.writeToParcel(dest, flags);
                }
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                CapturePage capturePage = this.capturePage;
                if (capturePage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    capturePage.writeToParcel(dest, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    checkPage.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public AssetConfig(@Nullable SelectPage selectPage, @Nullable PromptPage promptPage, @Nullable CapturePage capturePage, @Nullable CheckPage checkPage, @Nullable PendingPage pendingPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PromptPage:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PromptPage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PromptPage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CheckPage:?: TERNARY null = ((wrap int:0x0010: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CheckPage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CheckPage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage:?: TERNARY null = ((wrap int:0x0015: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CheckPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$SelectPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CheckPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$PendingPage):void type: THIS */
            public /* synthetic */ AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : selectPage, (i10 & 2) != 0 ? null : promptPage, (i10 & 4) != 0 ? null : capturePage, (i10 & 8) != 0 ? null : checkPage, (i10 & 16) != 0 ? null : pendingPage);
            }
        }

        @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "extractTextFromImage", "capturePageConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExtractTextFromImage", "getCapturePageConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final /* data */ class AutoClassificationConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new Creator();

            @Nullable
            private final CapturePageConfig capturePageConfig;

            @Nullable
            private final Boolean extractTextFromImage;

            @Nullable
            private final Boolean isEnabled;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<AutoClassificationConfig> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AutoClassificationConfig(boolValueOf, boolValueOf2, parcel.readInt() != 0 ? CapturePageConfig.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig[] newArray(int i10) {
                    return new AutoClassificationConfig[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public AutoClassificationConfig() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ AutoClassificationConfig copy$default(AutoClassificationConfig autoClassificationConfig, Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = autoClassificationConfig.isEnabled;
                }
                if ((i10 & 2) != 0) {
                    bool2 = autoClassificationConfig.extractTextFromImage;
                }
                if ((i10 & 4) != 0) {
                    capturePageConfig = autoClassificationConfig.capturePageConfig;
                }
                return autoClassificationConfig.copy(bool, bool2, capturePageConfig);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Boolean getIsEnabled() {
                return this.isEnabled;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            @NotNull
            public final AutoClassificationConfig copy(@Nullable Boolean isEnabled, @Nullable Boolean extractTextFromImage, @Nullable CapturePageConfig capturePageConfig) {
                return new AutoClassificationConfig(isEnabled, extractTextFromImage, capturePageConfig);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoClassificationConfig)) {
                    return false;
                }
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) other;
                return Intrinsics.m31980c(this.isEnabled, autoClassificationConfig.isEnabled) && Intrinsics.m31980c(this.extractTextFromImage, autoClassificationConfig.extractTextFromImage) && Intrinsics.m31980c(this.capturePageConfig, autoClassificationConfig.capturePageConfig);
            }

            @Nullable
            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            @Nullable
            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            public int hashCode() {
                Boolean bool = this.isEnabled;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.extractTextFromImage;
                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                return iHashCode2 + (capturePageConfig != null ? capturePageConfig.hashCode() : 0);
            }

            @Nullable
            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return "AutoClassificationConfig(isEnabled=" + this.isEnabled + ", extractTextFromImage=" + this.extractTextFromImage + ", capturePageConfig=" + this.capturePageConfig + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Boolean bool = this.isEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.extractTextFromImage;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                if (capturePageConfig == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    capturePageConfig.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public AutoClassificationConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CapturePageConfig capturePageConfig) {
                this.isEnabled = bool;
                this.extractTextFromImage = bool2;
                this.capturePageConfig = capturePageConfig;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
              (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
              (wrap com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig))
             A[MD:(java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AutoClassificationConfig.<init>(java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig):void type: THIS */
            public /* synthetic */ AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : capturePageConfig);
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum CaptureFileType {
            Image,
            Video,
            Unknown;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<CaptureFileType> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.CaptureFileType.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable CaptureFileType value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public CaptureFileType fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Object objM44315B = reader.m44315B();
                    if (Intrinsics.m31980c(objM44315B, "video")) {
                        return CaptureFileType.Video;
                    }
                    return Intrinsics.m31980c(objM44315B, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            @NotNull
            public static InterfaceC10707a<CaptureFileType> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "", "merchantId", "", "nonce", "fieldKeyMobileDriversLicense", "mobileRequests", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMerchantId", "()Ljava/lang/String;", "getNonce", "getFieldKeyMobileDriversLicense", "getMobileRequests", "()Ljava/util/List;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class DigitalIdConfig {

            @Nullable
            private final String fieldKeyMobileDriversLicense;

            @Nullable
            private final String merchantId;

            @Nullable
            private final List<DigitalIdRequest> mobileRequests;

            @Nullable
            private final String nonce;

            public DigitalIdConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<DigitalIdRequest> list) {
                this.merchantId = str;
                this.nonce = str2;
                this.fieldKeyMobileDriversLicense = str3;
                this.mobileRequests = list;
            }

            @Nullable
            public final String getFieldKeyMobileDriversLicense() {
                return this.fieldKeyMobileDriversLicense;
            }

            @Nullable
            public final String getMerchantId() {
                return this.merchantId;
            }

            @Nullable
            public final List<DigitalIdRequest> getMobileRequests() {
                return this.mobileRequests;
            }

            @Nullable
            public final String getNonce() {
                return this.nonce;
            }
        }

        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdRequest;", "", "idType", "", "minAge", "elementToStoreLength", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getIdType", "()Ljava/lang/String;", "getMinAge", "getElementToStoreLength", "()Ljava/util/Map;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class DigitalIdRequest {

            @Nullable
            private final Map<String, Integer> elementToStoreLength;

            @Nullable
            private final String idType;

            @Nullable
            private final String minAge;

            public DigitalIdRequest(@Nullable String str, @Nullable String str2, @Nullable Map<String, Integer> map) {
                this.idType = str;
                this.minAge = str2;
                this.elementToStoreLength = map;
            }

            @Nullable
            public final Map<String, Integer> getElementToStoreLength() {
                return this.elementToStoreLength;
            }

            @Nullable
            public final String getIdType() {
                return this.idType;
            }

            @Nullable
            public final String getMinAge() {
                return this.minAge;
            }
        }

        @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B=\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR!\u0010%\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0011¨\u0006&"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "Landroid/os/Parcelable;", "", "", "countryCode", "idClass", "side", "page", "key", Text.type, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "compareTo", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;)I", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getIdClass", "getSide", "getPage", "getKey", "getText", "precedenceScore$delegate", "Ljt/h;", "getPrecedenceScore", "getPrecedenceScore$annotations", "()V", "precedenceScore", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class LocalizationOverride implements Parcelable, Comparable<LocalizationOverride> {

            @NotNull
            public static final Parcelable.Creator<LocalizationOverride> CREATOR = new Creator();

            @Nullable
            private final String countryCode;

            @Nullable
            private final String idClass;

            @NotNull
            private final String key;

            @NotNull
            private final String page;

            /* JADX INFO: renamed from: precedenceScore$delegate, reason: from kotlin metadata */
            @NotNull
            private final InterfaceC7341h precedenceScore;

            @Nullable
            private final String side;

            @NotNull
            private final String text;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<LocalizationOverride> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LocalizationOverride(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride[] newArray(int i10) {
                    return new LocalizationOverride[i10];
                }
            }

            public LocalizationOverride(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String page, @NotNull String key, @NotNull String text) {
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(text, "text");
                this.countryCode = str;
                this.idClass = str2;
                this.side = str3;
                this.page = page;
                this.key = key;
                this.text = text;
                this.precedenceScore = C7342i.m30456b(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(NextStep.GovernmentId.LocalizationOverride.precedenceScore_delegate$lambda$3(this.f15678a));
                    }
                });
            }

            public static /* synthetic */ void getPrecedenceScore$annotations() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int precedenceScore_delegate$lambda$3(LocalizationOverride localizationOverride) {
                int i10 = (localizationOverride.countryCode != null ? 1 : 0) * 2;
                if (localizationOverride.idClass != null) {
                    i10++;
                }
                int i11 = i10 * 2;
                return localizationOverride.side != null ? i11 + 1 : i11;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getCountryCode() {
                return this.countryCode;
            }

            @Nullable
            public final String getIdClass() {
                return this.idClass;
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final String getPage() {
                return this.page;
            }

            public final int getPrecedenceScore() {
                return ((Number) this.precedenceScore.getValue()).intValue();
            }

            @Nullable
            public final String getSide() {
                return this.side;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.countryCode);
                dest.writeString(this.idClass);
                dest.writeString(this.side);
                dest.writeString(this.page);
                dest.writeString(this.key);
                dest.writeString(this.text);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
            @Override // java.lang.Comparable
            public int compareTo(@NotNull LocalizationOverride other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return Intrinsics.m31983f(getPrecedenceScore(), other.getPrecedenceScore());
            }
        }

        @Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006/"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Landroid/os/Parcelable;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "requestPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "reviewUploadPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "autoClassificationPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;)V", "getSelectPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "getRequestPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "getReviewUploadPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getAutoClassificationPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();

            @Nullable
            private final AutoClassificationPage autoClassificationPage;

            @Nullable
            private final CancelDialog cancelDialog;

            @NotNull
            private final CapturePage capturePage;

            @NotNull
            private final CheckPage checkPage;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            @NotNull
            private final RequestPage requestPage;

            @NotNull
            private final ReviewUploadPage reviewUploadPage;

            @NotNull
            private final SelectPage selectPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Localizations(SelectPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), CheckPage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), RequestPage.CREATOR.createFromParcel(parcel), ReviewUploadPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AutoClassificationPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(@NotNull SelectPage selectPage, @NotNull PromptPage promptPage, @NotNull CapturePage capturePage, @NotNull CheckPage checkPage, @NotNull PendingPage pendingPage, @NotNull RequestPage requestPage, @NotNull ReviewUploadPage reviewUploadPage, @Nullable CancelDialog cancelDialog, @Nullable AutoClassificationPage autoClassificationPage) {
                Intrinsics.checkNotNullParameter(selectPage, "selectPage");
                Intrinsics.checkNotNullParameter(promptPage, "promptPage");
                Intrinsics.checkNotNullParameter(capturePage, "capturePage");
                Intrinsics.checkNotNullParameter(checkPage, "checkPage");
                Intrinsics.checkNotNullParameter(pendingPage, "pendingPage");
                Intrinsics.checkNotNullParameter(requestPage, "requestPage");
                Intrinsics.checkNotNullParameter(reviewUploadPage, "reviewUploadPage");
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
                this.requestPage = requestPage;
                this.reviewUploadPage = reviewUploadPage;
                this.cancelDialog = cancelDialog;
                this.autoClassificationPage = autoClassificationPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final AutoClassificationPage getAutoClassificationPage() {
                return this.autoClassificationPage;
            }

            @Nullable
            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @NotNull
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @NotNull
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @NotNull
            public final RequestPage getRequestPage() {
                return this.requestPage;
            }

            @NotNull
            public final ReviewUploadPage getReviewUploadPage() {
                return this.reviewUploadPage;
            }

            @NotNull
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.selectPage.writeToParcel(dest, flags);
                this.promptPage.writeToParcel(dest, flags);
                this.capturePage.writeToParcel(dest, flags);
                this.checkPage.writeToParcel(dest, flags);
                this.pendingPage.writeToParcel(dest, flags);
                this.requestPage.writeToParcel(dest, flags);
                this.reviewUploadPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                AutoClassificationPage autoClassificationPage = this.autoClassificationPage;
                if (autoClassificationPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    autoClassificationPage.writeToParcel(dest, flags);
                }
            }
        }

        @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;", "", "governmentId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;)V", "getGovernmentId", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;", "GovernmentIdPages", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Pages {

            @Nullable
            private final GovernmentIdPages governmentId;

            @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;", "", "pending", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;)V", "getPending", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final class GovernmentIdPages {

                @Nullable
                private final PendingUiPage pending;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public GovernmentIdPages() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Nullable
                public final PendingUiPage getPending() {
                    return this.pending;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public GovernmentIdPages(@Nullable PendingUiPage pendingUiPage) {
                    this.pending = pendingUiPage;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.Pages.GovernmentIdPages.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void type: THIS */
                public /* synthetic */ GovernmentIdPages(PendingUiPage pendingUiPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : pendingUiPage);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public Pages() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Nullable
            public final GovernmentIdPages getGovernmentId() {
                return this.governmentId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Pages(@Nullable GovernmentIdPages governmentIdPages) {
                this.governmentId = governmentIdPages;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages$GovernmentIdPages:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages$GovernmentIdPages) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages$GovernmentIdPages))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages$GovernmentIdPages):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.Pages.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages$GovernmentIdPages):void type: THIS */
            public /* synthetic */ Pages(GovernmentIdPages governmentIdPages, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : governmentIdPages);
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "REQUIRED_IF_SUPPORTED", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum PassportNfcOption {
            REQUIRED,
            OPTIONAL,
            REQUIRED_IF_SUPPORTED;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<PassportNfcOption> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.PassportNfcOption.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable PassportNfcOption value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public PassportNfcOption fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Object objM44315B = reader.m44315B();
                    if (Intrinsics.m31980c(objM44315B, "required")) {
                        return PassportNfcOption.REQUIRED;
                    }
                    if (Intrinsics.m31980c(objM44315B, "optional")) {
                        return PassportNfcOption.OPTIONAL;
                    }
                    return Intrinsics.m31980c(objM44315B, "required_if_supported") ? PassportNfcOption.REQUIRED_IF_SUPPORTED : PassportNfcOption.OPTIONAL;
                }
            }

            @NotNull
            public static InterfaceC10707a<PassportNfcOption> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum VideoCaptureMethod {
            Stream,
            Upload,
            None;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<VideoCaptureMethod> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.VideoCaptureMethod.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable VideoCaptureMethod value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public VideoCaptureMethod fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Object objM44315B = reader.m44315B();
                    if (Intrinsics.m31980c(objM44315B, "stream")) {
                        return VideoCaptureMethod.Stream;
                    }
                    return Intrinsics.m31980c(objM44315B, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            @NotNull
            public static InterfaceC10707a<VideoCaptureMethod> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentId(@NotNull String name, @NotNull Config config, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(config, "config");
            this.name = name;
            this.config = config;
            this.styles = governmentIdStepStyle;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Nullable
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "Landroid/os/Parcelable;", Title.type, "", "description", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @NotNull
            private final String description;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PendingPage(@NotNull String title, @NotNull String description, @Nullable String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.title = title;
                this.description = description;
                this.navBarTitle = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (r1v0 java.lang.String)
              (r2v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.PendingPage.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PendingPage(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "Landroid/os/Parcelable;", "buttonSubmit", "", "buttonRetake", "titleConfirmCapture", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonSubmit", "()Ljava/lang/String;", "getButtonRetake", "getTitleConfirmCapture", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CheckPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();

            @NotNull
            private final String buttonRetake;

            @NotNull
            private final String buttonSubmit;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String titleConfirmCapture;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i10) {
                    return new CheckPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public CheckPage(@InterfaceC11872g(name = "btnSubmit") @NotNull String buttonSubmit, @InterfaceC11872g(name = "btnRetake") @NotNull String buttonRetake, @Nullable String str, @Nullable String str2) {
                Intrinsics.checkNotNullParameter(buttonSubmit, "buttonSubmit");
                Intrinsics.checkNotNullParameter(buttonRetake, "buttonRetake");
                this.buttonSubmit = buttonSubmit;
                this.buttonRetake = buttonRetake;
                this.titleConfirmCapture = str;
                this.navBarTitle = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @NotNull
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getTitleConfirmCapture() {
                return this.titleConfirmCapture;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.buttonRetake);
                dest.writeString(this.titleConfirmCapture);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (r1v0 java.lang.String)
              (r2v0 java.lang.String)
              (r3v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.CheckPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ CheckPage(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
            }
        }

        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "Landroid/os/Parcelable;", Title.type, "", "prompt", "choose", "disclaimer", "idClassToName", "", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getChoose", "getDisclaimer", "getIdClassToName", "()Ljava/util/Map;", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public static final class SelectPage implements Parcelable {

            @NotNull
            private final String choose;

            @Nullable
            private final String disclaimer;

            @NotNull
            private final Map<String, String> idClassToName;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String prompt;

            @NotNull
            private final String title;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "<init>", "()V", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<SelectPage> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.SelectPage.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable SelectPage value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public SelectPage fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    reader.mo44325b();
                    String strMo44338r = "";
                    String strMo44338r2 = strMo44338r;
                    String strMo44338r3 = strMo44338r2;
                    String strNextStringOrNull = null;
                    String strNextStringOrNull2 = null;
                    while (reader.mo44329f()) {
                        String strMo44335n = reader.mo44335n();
                        if (strMo44335n != null) {
                            switch (strMo44335n.hashCode()) {
                                case -979805852:
                                    if (strMo44335n.equals("prompt")) {
                                        strMo44338r2 = reader.mo44338r();
                                        Intrinsics.checkNotNullExpressionValue(strMo44338r2, "nextString(...)");
                                    }
                                    break;
                                case 110371416:
                                    if (strMo44335n.equals(Title.type)) {
                                        strMo44338r = reader.mo44338r();
                                        Intrinsics.checkNotNullExpressionValue(strMo44338r, "nextString(...)");
                                    }
                                    break;
                                case 432371099:
                                    if (strMo44335n.equals("disclaimer")) {
                                        strNextStringOrNull = JsonReaderUtilsKt.nextStringOrNull(reader);
                                    }
                                    break;
                                case 1282023341:
                                    if (strMo44335n.equals("optionNotice")) {
                                        strMo44338r3 = reader.mo44338r();
                                        Intrinsics.checkNotNullExpressionValue(strMo44338r3, "nextString(...)");
                                    }
                                    break;
                                case 2085061704:
                                    if (strMo44335n.equals("navBarTitle")) {
                                        strNextStringOrNull2 = JsonReaderUtilsKt.nextStringOrNull(reader);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (reader.mo44329f() && reader.mo44339u() == AbstractC11878m.c.STRING) {
                            linkedHashMap.put(strMo44335n, reader.mo44338r());
                        } else {
                            reader.mo44321P();
                        }
                    }
                    reader.mo44327d();
                    return new SelectPage(strMo44338r, strMo44338r2, strMo44338r3, strNextStringOrNull, linkedHashMap, strNextStringOrNull2);
                }
            }

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<SelectPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i10 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                    int i11 = 0;
                    while (true) {
                        String string5 = parcel.readString();
                        if (i11 == i10) {
                            return new SelectPage(string, string2, string3, string4, linkedHashMap, string5);
                        }
                        linkedHashMap.put(string5, parcel.readString());
                        i11++;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage[] newArray(int i10) {
                    return new SelectPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public SelectPage(@NotNull String title, @NotNull String prompt, @NotNull String choose, @Nullable String str, @NotNull Map<String, String> idClassToName, @Nullable String str2) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(choose, "choose");
                Intrinsics.checkNotNullParameter(idClassToName, "idClassToName");
                this.title = title;
                this.prompt = prompt;
                this.choose = choose;
                this.disclaimer = str;
                this.idClassToName = idClassToName;
                this.navBarTitle = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChoose() {
                return this.choose;
            }

            @Nullable
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            public final Map<String, String> getIdClassToName() {
                return this.idClassToName;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.choose);
                dest.writeString(this.disclaimer);
                Map<String, String> map = this.idClassToName;
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
              (r8v0 java.lang.String)
              (r9v0 java.lang.String)
              (r10v0 java.lang.String)
              (r11v0 java.lang.String)
              (r12v0 java.util.Map)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.SelectPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void type: THIS */
            public /* synthetic */ SelectPage(String str, String str2, String str3, String str4, Map map, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, map, (i10 & 32) != 0 ? null : str5);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "Landroid/os/Parcelable;", "cameraPermissionsTitle", "", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraPermissionsTitle", "()Ljava/lang/String;", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

            @Nullable
            private final String cameraPermissionsAllowButtonText;

            @Nullable
            private final String cameraPermissionsCancelButtonText;

            @Nullable
            private final String cameraPermissionsPrompt;

            @Nullable
            private final String cameraPermissionsTitle;

            @Nullable
            private final String microphonePermissionsBtnCancel;

            @Nullable
            private final String microphonePermissionsBtnContinueMobile;

            @Nullable
            private final String microphonePermissionsPrompt;

            @Nullable
            private final String microphonePermissionsTitle;

            @Nullable
            private final String navBarTitle;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PromptPage(@Nullable String str, @Nullable String str2, @InterfaceC11872g(name = "cameraPermissionsBtnContinueMobile") @Nullable String str3, @InterfaceC11872g(name = "cameraPermissionsBtnCancel") @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsBtnCancel = str5;
                this.microphonePermissionsBtnContinueMobile = str6;
                this.microphonePermissionsPrompt = str7;
                this.microphonePermissionsTitle = str8;
                this.navBarTitle = str9;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            @Nullable
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            @Nullable
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            @Nullable
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @Nullable
            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            @Nullable
            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            @Nullable
            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            @Nullable
            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsBtnCancel);
                dest.writeString(this.microphonePermissionsBtnContinueMobile);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsTitle);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
              (r12v0 java.lang.String)
              (r13v0 java.lang.String)
              (r14v0 java.lang.String)
              (r15v0 java.lang.String)
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.PromptPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, (i10 & 256) != 0 ? null : str9);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "Landroid/os/Parcelable;", "unableToClassifyDocumentTitle", "", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUnableToClassifyDocumentTitle", "()Ljava/lang/String;", "getUnableToClassifyDocumentContinueButtonText", "getIdClassRejectedTitle", "getIdClassRejectedContinueButtonText", "getCountryInputTitle", "getIdClassInputTitle", "getManualClassificationTitle", "getManualClassificationContinueButtonText", "getAutoClassificationCaptureTipText", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class AutoClassificationPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoClassificationPage> CREATOR = new Creator();

            @Nullable
            private final String autoClassificationCaptureTipText;

            @Nullable
            private final String countryInputTitle;

            @Nullable
            private final String idClassInputTitle;

            @Nullable
            private final String idClassRejectedContinueButtonText;

            @Nullable
            private final String idClassRejectedTitle;

            @Nullable
            private final String manualClassificationContinueButtonText;

            @Nullable
            private final String manualClassificationTitle;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String unableToClassifyDocumentContinueButtonText;

            @Nullable
            private final String unableToClassifyDocumentTitle;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<AutoClassificationPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoClassificationPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage[] newArray(int i10) {
                    return new AutoClassificationPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public AutoClassificationPage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
                this.unableToClassifyDocumentTitle = str;
                this.unableToClassifyDocumentContinueButtonText = str2;
                this.idClassRejectedTitle = str3;
                this.idClassRejectedContinueButtonText = str4;
                this.countryInputTitle = str5;
                this.idClassInputTitle = str6;
                this.manualClassificationTitle = str7;
                this.manualClassificationContinueButtonText = str8;
                this.autoClassificationCaptureTipText = str9;
                this.navBarTitle = str10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            @Nullable
            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            @Nullable
            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            @Nullable
            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            @Nullable
            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            @Nullable
            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            @Nullable
            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            @Nullable
            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.unableToClassifyDocumentTitle);
                dest.writeString(this.unableToClassifyDocumentContinueButtonText);
                dest.writeString(this.idClassRejectedTitle);
                dest.writeString(this.idClassRejectedContinueButtonText);
                dest.writeString(this.countryInputTitle);
                dest.writeString(this.idClassInputTitle);
                dest.writeString(this.manualClassificationTitle);
                dest.writeString(this.manualClassificationContinueButtonText);
                dest.writeString(this.autoClassificationCaptureTipText);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
              (r13v0 java.lang.String)
              (r14v0 java.lang.String)
              (r15v0 java.lang.String)
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AutoClassificationPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ AutoClassificationPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i10 & 512) != 0 ? null : str10);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Landroid/os/Parcelable;", "titleFront", "", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "choosePhotoButtonText", "liveUploadButtonText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getChoosePhotoButtonText", "getLiveUploadButtonText", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class RequestPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<RequestPage> CREATOR = new Creator();

            @NotNull
            private final String choosePhotoButtonText;

            @NotNull
            private final String descriptionBack;

            @NotNull
            private final String descriptionFront;

            @NotNull
            private final String descriptionPassportSignature;

            @NotNull
            private final String descriptionPdf417;

            @NotNull
            private final String liveUploadButtonText;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String titleBack;

            @NotNull
            private final String titleFront;

            @NotNull
            private final String titlePassportSignature;

            @NotNull
            private final String titlePdf417;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<RequestPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RequestPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage[] newArray(int i10) {
                    return new RequestPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public RequestPage(@NotNull String titleFront, @NotNull String titleBack, @NotNull String titlePdf417, @NotNull String titlePassportSignature, @NotNull String descriptionFront, @NotNull String descriptionBack, @NotNull String descriptionPdf417, @NotNull String descriptionPassportSignature, @NotNull String choosePhotoButtonText, @NotNull String liveUploadButtonText, @Nullable String str) {
                Intrinsics.checkNotNullParameter(titleFront, "titleFront");
                Intrinsics.checkNotNullParameter(titleBack, "titleBack");
                Intrinsics.checkNotNullParameter(titlePdf417, "titlePdf417");
                Intrinsics.checkNotNullParameter(titlePassportSignature, "titlePassportSignature");
                Intrinsics.checkNotNullParameter(descriptionFront, "descriptionFront");
                Intrinsics.checkNotNullParameter(descriptionBack, "descriptionBack");
                Intrinsics.checkNotNullParameter(descriptionPdf417, "descriptionPdf417");
                Intrinsics.checkNotNullParameter(descriptionPassportSignature, "descriptionPassportSignature");
                Intrinsics.checkNotNullParameter(choosePhotoButtonText, "choosePhotoButtonText");
                Intrinsics.checkNotNullParameter(liveUploadButtonText, "liveUploadButtonText");
                this.titleFront = titleFront;
                this.titleBack = titleBack;
                this.titlePdf417 = titlePdf417;
                this.titlePassportSignature = titlePassportSignature;
                this.descriptionFront = descriptionFront;
                this.descriptionBack = descriptionBack;
                this.descriptionPdf417 = descriptionPdf417;
                this.descriptionPassportSignature = descriptionPassportSignature;
                this.choosePhotoButtonText = choosePhotoButtonText;
                this.liveUploadButtonText = liveUploadButtonText;
                this.navBarTitle = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChoosePhotoButtonText() {
                return this.choosePhotoButtonText;
            }

            @NotNull
            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            @NotNull
            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            @NotNull
            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            @NotNull
            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            @NotNull
            public final String getLiveUploadButtonText() {
                return this.liveUploadButtonText;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getTitleBack() {
                return this.titleBack;
            }

            @NotNull
            public final String getTitleFront() {
                return this.titleFront;
            }

            @NotNull
            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            @NotNull
            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.titleFront);
                dest.writeString(this.titleBack);
                dest.writeString(this.titlePdf417);
                dest.writeString(this.titlePassportSignature);
                dest.writeString(this.descriptionFront);
                dest.writeString(this.descriptionBack);
                dest.writeString(this.descriptionPdf417);
                dest.writeString(this.descriptionPassportSignature);
                dest.writeString(this.choosePhotoButtonText);
                dest.writeString(this.liveUploadButtonText);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
              (r14v0 java.lang.String)
              (r15v0 java.lang.String)
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (r22v0 java.lang.String)
              (r23v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.RequestPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ RequestPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i10 & 1024) != 0 ? null : str11);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Landroid/os/Parcelable;", "titleFront", "", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getConfirmButtonText", "getChooseAnotherButtonText", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class ReviewUploadPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ReviewUploadPage> CREATOR = new Creator();

            @NotNull
            private final String chooseAnotherButtonText;

            @NotNull
            private final String confirmButtonText;

            @NotNull
            private final String descriptionBack;

            @NotNull
            private final String descriptionFront;

            @NotNull
            private final String descriptionPassportSignature;

            @NotNull
            private final String descriptionPdf417;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String titleBack;

            @NotNull
            private final String titleFront;

            @NotNull
            private final String titlePassportSignature;

            @NotNull
            private final String titlePdf417;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<ReviewUploadPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReviewUploadPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage[] newArray(int i10) {
                    return new ReviewUploadPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ReviewUploadPage(@NotNull String titleFront, @NotNull String titleBack, @NotNull String titlePdf417, @NotNull String titlePassportSignature, @NotNull String descriptionFront, @NotNull String descriptionBack, @NotNull String descriptionPdf417, @NotNull String descriptionPassportSignature, @NotNull String confirmButtonText, @NotNull String chooseAnotherButtonText, @Nullable String str) {
                Intrinsics.checkNotNullParameter(titleFront, "titleFront");
                Intrinsics.checkNotNullParameter(titleBack, "titleBack");
                Intrinsics.checkNotNullParameter(titlePdf417, "titlePdf417");
                Intrinsics.checkNotNullParameter(titlePassportSignature, "titlePassportSignature");
                Intrinsics.checkNotNullParameter(descriptionFront, "descriptionFront");
                Intrinsics.checkNotNullParameter(descriptionBack, "descriptionBack");
                Intrinsics.checkNotNullParameter(descriptionPdf417, "descriptionPdf417");
                Intrinsics.checkNotNullParameter(descriptionPassportSignature, "descriptionPassportSignature");
                Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
                Intrinsics.checkNotNullParameter(chooseAnotherButtonText, "chooseAnotherButtonText");
                this.titleFront = titleFront;
                this.titleBack = titleBack;
                this.titlePdf417 = titlePdf417;
                this.titlePassportSignature = titlePassportSignature;
                this.descriptionFront = descriptionFront;
                this.descriptionBack = descriptionBack;
                this.descriptionPdf417 = descriptionPdf417;
                this.descriptionPassportSignature = descriptionPassportSignature;
                this.confirmButtonText = confirmButtonText;
                this.chooseAnotherButtonText = chooseAnotherButtonText;
                this.navBarTitle = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChooseAnotherButtonText() {
                return this.chooseAnotherButtonText;
            }

            @NotNull
            public final String getConfirmButtonText() {
                return this.confirmButtonText;
            }

            @NotNull
            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            @NotNull
            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            @NotNull
            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            @NotNull
            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getTitleBack() {
                return this.titleBack;
            }

            @NotNull
            public final String getTitleFront() {
                return this.titleFront;
            }

            @NotNull
            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            @NotNull
            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.titleFront);
                dest.writeString(this.titleBack);
                dest.writeString(this.titlePdf417);
                dest.writeString(this.titlePassportSignature);
                dest.writeString(this.descriptionFront);
                dest.writeString(this.descriptionBack);
                dest.writeString(this.descriptionPdf417);
                dest.writeString(this.descriptionPassportSignature);
                dest.writeString(this.confirmButtonText);
                dest.writeString(this.chooseAnotherButtonText);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
              (r14v0 java.lang.String)
              (r15v0 java.lang.String)
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (r22v0 java.lang.String)
              (r23v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.ReviewUploadPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ ReviewUploadPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i10 & 1024) != 0 ? null : str11);
            }
        }

        @Metadata(m31664d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001B·\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bC\u00103R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0015\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bO\u00103R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0015\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bR\u00103R\u0015\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010;\u001a\u0004\bS\u0010:R\u0013\u0010(\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bT\u0010@R\u0013\u0010)\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0013\u0010*\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0015\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010;\u001a\u0004\bW\u0010:R\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bX\u0010Y¨\u0006Z"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "", "idclasses", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "imageCaptureCount", "", "nativeMobileCameraManualCaptureDelayMs", "", "fieldKeyDocument", "", "fieldKeyIdclass", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoSessionJwt", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "mobileDriversLicense", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "govidDesignVersion", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;)V", "getIdclasses", "()Ljava/util/List;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "getEnabledCaptureOptionsNativeMobile", "getImageCaptureCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNativeMobileCameraManualCaptureDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFieldKeyDocument", "()Ljava/lang/String;", "getFieldKeyIdclass", "getLocalizationOverrides", "getShouldSkipReviewScreen", "getEnabledCaptureFileTypes", "getVideoCaptureMethods", "getVideoSessionJwt", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "getAutoClassificationConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "getMobileDriversLicense", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "getStaticCaptureTipsEnabled", "getHolographicTorchEnabledDurationMs", "getGovidDesignVersion", "getFlowWatermarkText", "getSilentNetworkAuthenticationCheckUrl", "getSilentNetworkAuthenticationBackgroundTimeoutSeconds", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Config {

            @Nullable
            private final AssetConfig assets;

            @Nullable
            private final Boolean audioEnabled;

            @Nullable
            private final AutoClassificationConfig autoClassificationConfig;

            @Nullable
            private final Boolean backStepEnabled;

            @Nullable
            private final Boolean cancelButtonEnabled;

            @Nullable
            private final List<CaptureFileType> enabledCaptureFileTypes;

            @Nullable
            private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

            @NotNull
            private final String fieldKeyDocument;

            @NotNull
            private final String fieldKeyIdclass;

            @Nullable
            private final String flowWatermarkText;

            @Nullable
            private final String govidDesignVersion;

            @Nullable
            private final Integer holographicTorchEnabledDurationMs;

            @Nullable
            private final List<Id> idclasses;

            @Nullable
            private final Integer imageCaptureCount;

            @Nullable
            private final List<LocalizationOverride> localizationOverrides;

            @NotNull
            private final Localizations localizations;

            @Nullable
            private final DigitalIdConfig mobileDriversLicense;

            @Nullable
            private final Long nativeMobileCameraManualCaptureDelayMs;

            @Nullable
            private final Pages pages;

            @Nullable
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            @Nullable
            private final StyleElements.Axis reviewCaptureButtonsAxis;

            @Nullable
            private final Boolean shouldSkipReviewScreen;

            @Nullable
            private final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

            @Nullable
            private final String silentNetworkAuthenticationCheckUrl;

            @Nullable
            private final Boolean staticCaptureTipsEnabled;

            @Nullable
            private final List<VideoCaptureMethod> videoCaptureMethods;

            @Nullable
            private final String videoSessionJwt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$CaptureFileType> */
            /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$VideoCaptureMethod> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile> */
            /* JADX WARN: Multi-variable type inference failed */
            public Config(@Nullable List<Id> list, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Localizations localizations, @Nullable List<? extends CaptureOptionNativeMobile> list2, @Nullable Integer num, @Nullable Long l10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdclass, @Nullable List<LocalizationOverride> list3, @Nullable Boolean bool3, @Nullable List<? extends CaptureFileType> list4, @Nullable List<? extends VideoCaptureMethod> list5, @InterfaceC11872g(name = "videoSessionJWT") @Nullable String str, @Nullable AssetConfig assetConfig, @Nullable AutoClassificationConfig autoClassificationConfig, @Nullable StyleElements.Axis axis, @Nullable PendingPageTextPosition pendingPageTextPosition, @Nullable Boolean bool4, @Nullable DigitalIdConfig digitalIdConfig, @Nullable Boolean bool5, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable Pages pages) {
                Intrinsics.checkNotNullParameter(localizations, "localizations");
                Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
                Intrinsics.checkNotNullParameter(fieldKeyIdclass, "fieldKeyIdclass");
                this.idclasses = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.enabledCaptureOptionsNativeMobile = list2;
                this.imageCaptureCount = num;
                this.nativeMobileCameraManualCaptureDelayMs = l10;
                this.fieldKeyDocument = fieldKeyDocument;
                this.fieldKeyIdclass = fieldKeyIdclass;
                this.localizationOverrides = list3;
                this.shouldSkipReviewScreen = bool3;
                this.enabledCaptureFileTypes = list4;
                this.videoCaptureMethods = list5;
                this.videoSessionJwt = str;
                this.assets = assetConfig;
                this.autoClassificationConfig = autoClassificationConfig;
                this.reviewCaptureButtonsAxis = axis;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.mobileDriversLicense = digitalIdConfig;
                this.staticCaptureTipsEnabled = bool5;
                this.holographicTorchEnabledDurationMs = num2;
                this.govidDesignVersion = str2;
                this.flowWatermarkText = str3;
                this.silentNetworkAuthenticationCheckUrl = str4;
                this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num3;
                this.pages = pages;
            }

            @Nullable
            public final AssetConfig getAssets() {
                return this.assets;
            }

            @Nullable
            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            @Nullable
            public final AutoClassificationConfig getAutoClassificationConfig() {
                return this.autoClassificationConfig;
            }

            @Nullable
            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            @Nullable
            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            @Nullable
            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            @Nullable
            public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
                return this.enabledCaptureOptionsNativeMobile;
            }

            @NotNull
            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            @NotNull
            public final String getFieldKeyIdclass() {
                return this.fieldKeyIdclass;
            }

            @Nullable
            public final String getFlowWatermarkText() {
                return this.flowWatermarkText;
            }

            @Nullable
            public final String getGovidDesignVersion() {
                return this.govidDesignVersion;
            }

            @Nullable
            public final Integer getHolographicTorchEnabledDurationMs() {
                return this.holographicTorchEnabledDurationMs;
            }

            @Nullable
            public final List<Id> getIdclasses() {
                return this.idclasses;
            }

            @Nullable
            public final Integer getImageCaptureCount() {
                return this.imageCaptureCount;
            }

            @Nullable
            public final List<LocalizationOverride> getLocalizationOverrides() {
                return this.localizationOverrides;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            @Nullable
            public final DigitalIdConfig getMobileDriversLicense() {
                return this.mobileDriversLicense;
            }

            @Nullable
            public final Long getNativeMobileCameraManualCaptureDelayMs() {
                return this.nativeMobileCameraManualCaptureDelayMs;
            }

            @Nullable
            public final Pages getPages() {
                return this.pages;
            }

            @Nullable
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            public final StyleElements.Axis getReviewCaptureButtonsAxis() {
                return this.reviewCaptureButtonsAxis;
            }

            @Nullable
            public final Boolean getShouldSkipReviewScreen() {
                return this.shouldSkipReviewScreen;
            }

            @Nullable
            public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
                return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            }

            @Nullable
            public final String getSilentNetworkAuthenticationCheckUrl() {
                return this.silentNetworkAuthenticationCheckUrl;
            }

            @Nullable
            public final Boolean getStaticCaptureTipsEnabled() {
                return this.staticCaptureTipsEnabled;
            }

            @Nullable
            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            @Nullable
            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005e: CONSTRUCTOR 
              (r31v0 java.util.List)
              (r32v0 java.lang.Boolean)
              (r33v0 java.lang.Boolean)
              (r34v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations)
              (r35v0 java.util.List)
              (r36v0 java.lang.Integer)
              (r37v0 java.lang.Long)
              (r38v0 java.lang.String)
              (r39v0 java.lang.String)
              (r40v0 java.util.List)
              (r41v0 java.lang.Boolean)
              (r42v0 java.util.List)
              (r43v0 java.util.List)
              (r44v0 java.lang.String)
              (r45v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig)
              (r46v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AutoClassificationConfig)
              (r47v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis)
              (r48v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
              (r49v0 java.lang.Boolean)
              (r50v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$DigitalIdConfig)
              (r51v0 java.lang.Boolean)
              (r52v0 java.lang.Integer)
              (r53v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000e: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
              (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0019: ARITH (r58v0 int) & (33554432 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r56v0 java.lang.Integer))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages:?: TERNARY null = ((wrap int:0x0024: ARITH (r58v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages) : (r57v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages))
             A[MD:(java.util.List<com.withpersona.sdk2.inquiry.network.dto.government_id.Id>, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile>, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$LocalizationOverride>, java.lang.Boolean, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$CaptureFileType>, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$VideoCaptureMethod>, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AutoClassificationConfig, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$DigitalIdConfig, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages):void (m)] (LINE:29) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.Config.<init>(java.util.List, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations, java.util.List, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.util.List, java.util.List, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AutoClassificationConfig, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$DigitalIdConfig, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Pages):void type: THIS */
            public /* synthetic */ Config(List list, Boolean bool, Boolean bool2, Localizations localizations, List list2, Integer num, Long l10, String str, String str2, List list3, Boolean bool3, List list4, List list5, String str3, AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, DigitalIdConfig digitalIdConfig, Boolean bool5, Integer num2, String str4, String str5, String str6, Integer num3, Pages pages, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, bool, bool2, localizations, list2, num, l10, str, str2, list3, bool3, list4, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4, digitalIdConfig, bool5, num2, str4, (i10 & 8388608) != 0 ? null : str5, (i10 & 16777216) != 0 ? null : str6, (i10 & 33554432) != 0 ? null : num3, (i10 & 67108864) != 0 ? null : pages);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B¡\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b \u0010!J\u0006\u0010@\u001a\u00020AJ\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020AR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006G"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Landroid/os/Parcelable;", Title.type, "", "description", "navBarTitle", "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "passportPortraitCaptureFrameLabel", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", "btnHelp", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getNavBarTitle", "getScanFront", "getScanBack", "getScanPdf417", "getScanFrontOrBack", "getScanSignature", "getPassportPortraitCaptureFrameLabel", "getCapturing", "getConfirmCapture", "getDisclaimer", "getHintHoldStill", "getHintLowLight", "getBtnHelp", "getBarcodeHelpModalTitle", "getBarcodeHelpModalPrompt", "getBarcodeHelpModalHints", "getBarcodeHelpModalContinueBtn", "getIdFrontHelpModalTitle", "getIdFrontHelpModalPrompt", "getIdFrontHelpModalHintsMobile", "getIdFrontHelpModalContinueBtn", "getIdBackHelpModalTitle", "getIdBackHelpModalPrompt", "getIdBackHelpModalHintsMobile", "getIdBackHelpModalContinueBtn", "getStaticCaptureTipsTitle", "getStaticCaptureTipsSubtext", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CapturePage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();

            @Nullable
            private final String barcodeHelpModalContinueBtn;

            @Nullable
            private final String barcodeHelpModalHints;

            @Nullable
            private final String barcodeHelpModalPrompt;

            @Nullable
            private final String barcodeHelpModalTitle;

            @Nullable
            private final String btnHelp;

            @NotNull
            private final String capturing;

            @NotNull
            private final String confirmCapture;

            @Nullable
            private final String description;

            @Nullable
            private final String disclaimer;

            @Nullable
            private final String hintHoldStill;

            @Nullable
            private final String hintLowLight;

            @Nullable
            private final String idBackHelpModalContinueBtn;

            @Nullable
            private final String idBackHelpModalHintsMobile;

            @Nullable
            private final String idBackHelpModalPrompt;

            @Nullable
            private final String idBackHelpModalTitle;

            @Nullable
            private final String idFrontHelpModalContinueBtn;

            @Nullable
            private final String idFrontHelpModalHintsMobile;

            @Nullable
            private final String idFrontHelpModalPrompt;

            @Nullable
            private final String idFrontHelpModalTitle;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String passportPortraitCaptureFrameLabel;

            @NotNull
            private final String scanBack;

            @NotNull
            private final String scanFront;

            @NotNull
            private final String scanFrontOrBack;

            @NotNull
            private final String scanPdf417;

            @NotNull
            private final String scanSignature;

            @Nullable
            private final String staticCaptureTipsSubtext;

            @Nullable
            private final String staticCaptureTipsTitle;

            @Nullable
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i10) {
                    return new CapturePage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public CapturePage(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String scanFront, @NotNull String scanBack, @NotNull String scanPdf417, @NotNull String scanFrontOrBack, @NotNull String scanSignature, @Nullable String str4, @NotNull String capturing, @NotNull String confirmCapture, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22) {
                Intrinsics.checkNotNullParameter(scanFront, "scanFront");
                Intrinsics.checkNotNullParameter(scanBack, "scanBack");
                Intrinsics.checkNotNullParameter(scanPdf417, "scanPdf417");
                Intrinsics.checkNotNullParameter(scanFrontOrBack, "scanFrontOrBack");
                Intrinsics.checkNotNullParameter(scanSignature, "scanSignature");
                Intrinsics.checkNotNullParameter(capturing, "capturing");
                Intrinsics.checkNotNullParameter(confirmCapture, "confirmCapture");
                this.title = str;
                this.description = str2;
                this.navBarTitle = str3;
                this.scanFront = scanFront;
                this.scanBack = scanBack;
                this.scanPdf417 = scanPdf417;
                this.scanFrontOrBack = scanFrontOrBack;
                this.scanSignature = scanSignature;
                this.passportPortraitCaptureFrameLabel = str4;
                this.capturing = capturing;
                this.confirmCapture = confirmCapture;
                this.disclaimer = str5;
                this.hintHoldStill = str6;
                this.hintLowLight = str7;
                this.btnHelp = str8;
                this.barcodeHelpModalTitle = str9;
                this.barcodeHelpModalPrompt = str10;
                this.barcodeHelpModalHints = str11;
                this.barcodeHelpModalContinueBtn = str12;
                this.idFrontHelpModalTitle = str13;
                this.idFrontHelpModalPrompt = str14;
                this.idFrontHelpModalHintsMobile = str15;
                this.idFrontHelpModalContinueBtn = str16;
                this.idBackHelpModalTitle = str17;
                this.idBackHelpModalPrompt = str18;
                this.idBackHelpModalHintsMobile = str19;
                this.idBackHelpModalContinueBtn = str20;
                this.staticCaptureTipsTitle = str21;
                this.staticCaptureTipsSubtext = str22;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getBarcodeHelpModalContinueBtn() {
                return this.barcodeHelpModalContinueBtn;
            }

            @Nullable
            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            @Nullable
            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            @Nullable
            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            @Nullable
            public final String getBtnHelp() {
                return this.btnHelp;
            }

            @NotNull
            public final String getCapturing() {
                return this.capturing;
            }

            @NotNull
            public final String getConfirmCapture() {
                return this.confirmCapture;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @Nullable
            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            @Nullable
            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            @Nullable
            public final String getIdBackHelpModalContinueBtn() {
                return this.idBackHelpModalContinueBtn;
            }

            @Nullable
            public final String getIdBackHelpModalHintsMobile() {
                return this.idBackHelpModalHintsMobile;
            }

            @Nullable
            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            @Nullable
            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            @Nullable
            public final String getIdFrontHelpModalContinueBtn() {
                return this.idFrontHelpModalContinueBtn;
            }

            @Nullable
            public final String getIdFrontHelpModalHintsMobile() {
                return this.idFrontHelpModalHintsMobile;
            }

            @Nullable
            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            @Nullable
            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getPassportPortraitCaptureFrameLabel() {
                return this.passportPortraitCaptureFrameLabel;
            }

            @NotNull
            public final String getScanBack() {
                return this.scanBack;
            }

            @NotNull
            public final String getScanFront() {
                return this.scanFront;
            }

            @NotNull
            public final String getScanFrontOrBack() {
                return this.scanFrontOrBack;
            }

            @NotNull
            public final String getScanPdf417() {
                return this.scanPdf417;
            }

            @NotNull
            public final String getScanSignature() {
                return this.scanSignature;
            }

            @Nullable
            public final String getStaticCaptureTipsSubtext() {
                return this.staticCaptureTipsSubtext;
            }

            @Nullable
            public final String getStaticCaptureTipsTitle() {
                return this.staticCaptureTipsTitle;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.navBarTitle);
                dest.writeString(this.scanFront);
                dest.writeString(this.scanBack);
                dest.writeString(this.scanPdf417);
                dest.writeString(this.scanFrontOrBack);
                dest.writeString(this.scanSignature);
                dest.writeString(this.passportPortraitCaptureFrameLabel);
                dest.writeString(this.capturing);
                dest.writeString(this.confirmCapture);
                dest.writeString(this.disclaimer);
                dest.writeString(this.hintHoldStill);
                dest.writeString(this.hintLowLight);
                dest.writeString(this.btnHelp);
                dest.writeString(this.barcodeHelpModalTitle);
                dest.writeString(this.barcodeHelpModalPrompt);
                dest.writeString(this.barcodeHelpModalHints);
                dest.writeString(this.barcodeHelpModalContinueBtn);
                dest.writeString(this.idFrontHelpModalTitle);
                dest.writeString(this.idFrontHelpModalPrompt);
                dest.writeString(this.idFrontHelpModalHintsMobile);
                dest.writeString(this.idFrontHelpModalContinueBtn);
                dest.writeString(this.idBackHelpModalTitle);
                dest.writeString(this.idBackHelpModalPrompt);
                dest.writeString(this.idBackHelpModalHintsMobile);
                dest.writeString(this.idBackHelpModalContinueBtn);
                dest.writeString(this.staticCaptureTipsTitle);
                dest.writeString(this.staticCaptureTipsSubtext);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
              (r34v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r63v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r63v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
              (r37v0 java.lang.String)
              (r38v0 java.lang.String)
              (r39v0 java.lang.String)
              (r40v0 java.lang.String)
              (r41v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0013: ARITH (r63v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
              (r43v0 java.lang.String)
              (r44v0 java.lang.String)
              (r45v0 java.lang.String)
              (r46v0 java.lang.String)
              (r47v0 java.lang.String)
              (r48v0 java.lang.String)
              (r49v0 java.lang.String)
              (r50v0 java.lang.String)
              (r51v0 java.lang.String)
              (r52v0 java.lang.String)
              (r53v0 java.lang.String)
              (r54v0 java.lang.String)
              (r55v0 java.lang.String)
              (r56v0 java.lang.String)
              (r57v0 java.lang.String)
              (r58v0 java.lang.String)
              (r59v0 java.lang.String)
              (r60v0 java.lang.String)
              (r61v0 java.lang.String)
              (r62v0 java.lang.String)
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.CapturePage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, str4, str5, str6, str7, str8, (i10 & 256) != 0 ? null : str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Config", "Pages", "SelfiePoseInfo", "CaptureMethod", "CaptureFileType", "VideoCaptureMethod", "Localizations", "CapturePage", "PendingPage", "CheckPage", "PromptPage", "AssetConfig", "SelfiePose", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Selfie extends NextStep {

        @NotNull
        private final Config config;

        @NotNull
        private final String name;

        @Nullable
        private final StepStyles.SelfieStepStyle styles;

        @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "recordPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "getRecordPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PromptPage", "RecordPage", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();

            @Nullable
            private final PromptPage promptPage;

            @Nullable
            private final RecordPage recordPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RecordPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfiePictograph", "selfieCenterPictograph", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getSelfiePictograph", "getSelfieCenterPictograph", "getSelfieLeftPictograph", "getSelfieRightPictograph", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage headerPictograph;

                @Nullable
                private final RemoteImage selfieCenterPictograph;

                @Nullable
                private final RemoteImage selfieLeftPictograph;

                @Nullable
                private final RemoteImage selfiePictograph;

                @Nullable
                private final RemoteImage selfieRightPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public PromptPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.selfiePictograph;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = promptPage.selfieCenterPictograph;
                    }
                    if ((i10 & 8) != 0) {
                        remoteImage4 = promptPage.selfieLeftPictograph;
                    }
                    if ((i10 & 16) != 0) {
                        remoteImage5 = promptPage.selfieRightPictograph;
                    }
                    RemoteImage remoteImage6 = remoteImage5;
                    RemoteImage remoteImage7 = remoteImage3;
                    return promptPage.copy(remoteImage, remoteImage2, remoteImage7, remoteImage4, remoteImage6);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component5, reason: from getter */
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                @NotNull
                public final PromptPage copy(@Nullable RemoteImage headerPictograph, @Nullable RemoteImage selfiePictograph, @Nullable RemoteImage selfieCenterPictograph, @Nullable RemoteImage selfieLeftPictograph, @Nullable RemoteImage selfieRightPictograph) {
                    return new PromptPage(headerPictograph, selfiePictograph, selfieCenterPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.m31980c(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.m31980c(this.selfiePictograph, promptPage.selfiePictograph) && Intrinsics.m31980c(this.selfieCenterPictograph, promptPage.selfieCenterPictograph) && Intrinsics.m31980c(this.selfieLeftPictograph, promptPage.selfieLeftPictograph) && Intrinsics.m31980c(this.selfieRightPictograph, promptPage.selfieRightPictograph);
                }

                @Nullable
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                @Nullable
                public final RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                @Nullable
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                @Nullable
                public final RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                @Nullable
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", selfiePictograph=" + this.selfiePictograph + ", selfieCenterPictograph=" + this.selfieCenterPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public PromptPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2, @Nullable RemoteImage remoteImage3, @Nullable RemoteImage remoteImage4, @Nullable RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.selfiePictograph = remoteImage2;
                    this.selfieCenterPictograph = remoteImage3;
                    this.selfieLeftPictograph = remoteImage4;
                    this.selfieRightPictograph = remoteImage5;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0010: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r5v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0015: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.AssetConfig.PromptPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5);
                }
            }

            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "Landroid/os/Parcelable;", "loadingPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getLoadingPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getSelfieLeftPictograph", "getSelfieRightPictograph", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final /* data */ class RecordPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<RecordPage> CREATOR = new Creator();

                @Nullable
                private final RemoteImage loadingPictograph;

                @Nullable
                private final RemoteImage selfieLeftPictograph;

                @Nullable
                private final RemoteImage selfieRightPictograph;

                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class Creator implements Parcelable.Creator<RecordPage> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new RecordPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage[] newArray(int i10) {
                        return new RecordPage[i10];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public RecordPage() {
                    this(null, null, null, 7, null);
                }

                public static /* synthetic */ RecordPage copy$default(RecordPage recordPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = recordPage.loadingPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = recordPage.selfieLeftPictograph;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = recordPage.selfieRightPictograph;
                    }
                    return recordPage.copy(remoteImage, remoteImage2, remoteImage3);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                @NotNull
                public final RecordPage copy(@Nullable RemoteImage loadingPictograph, @Nullable RemoteImage selfieLeftPictograph, @Nullable RemoteImage selfieRightPictograph) {
                    return new RecordPage(loadingPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RecordPage)) {
                        return false;
                    }
                    RecordPage recordPage = (RecordPage) other;
                    return Intrinsics.m31980c(this.loadingPictograph, recordPage.loadingPictograph) && Intrinsics.m31980c(this.selfieLeftPictograph, recordPage.selfieLeftPictograph) && Intrinsics.m31980c(this.selfieRightPictograph, recordPage.selfieRightPictograph);
                }

                @Nullable
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                @Nullable
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                @Nullable
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.loadingPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    return iHashCode2 + (remoteImage3 != null ? remoteImage3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "RecordPage(loadingPictograph=" + this.loadingPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    RemoteImage remoteImage = this.loadingPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public RecordPage(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2, @Nullable RemoteImage remoteImage3) {
                    this.loadingPictograph = remoteImage;
                    this.selfieLeftPictograph = remoteImage2;
                    this.selfieRightPictograph = remoteImage3;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                  (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage) : (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.AssetConfig.RecordPage.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage):void type: THIS */
                public /* synthetic */ RecordPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, RecordPage recordPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i10 & 2) != 0) {
                    recordPage = assetConfig.recordPage;
                }
                return assetConfig.copy(promptPage, recordPage);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            @NotNull
            public final AssetConfig copy(@Nullable PromptPage promptPage, @Nullable RecordPage recordPage) {
                return new AssetConfig(promptPage, recordPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.m31980c(this.promptPage, assetConfig.promptPage) && Intrinsics.m31980c(this.recordPage, assetConfig.recordPage);
            }

            @Nullable
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Nullable
            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                RecordPage recordPage = this.recordPage;
                return iHashCode + (recordPage != null ? recordPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", recordPage=" + this.recordPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                RecordPage recordPage = this.recordPage;
                if (recordPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    recordPage.writeToParcel(dest, flags);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public AssetConfig(@Nullable PromptPage promptPage, @Nullable RecordPage recordPage) {
                this.promptPage = promptPage;
                this.recordPage = recordPage;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.AssetConfig.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage):void type: THIS */
            public /* synthetic */ AssetConfig(PromptPage promptPage, RecordPage recordPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : promptPage, (i10 & 2) != 0 ? null : recordPage);
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum CaptureFileType {
            Image,
            Video,
            Unknown;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<CaptureFileType> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.CaptureFileType.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable CaptureFileType value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public CaptureFileType fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Object objM44315B = reader.m44315B();
                    if (Intrinsics.m31980c(objM44315B, "video")) {
                        return CaptureFileType.Video;
                    }
                    return Intrinsics.m31980c(objM44315B, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            @NotNull
            public static InterfaceC10707a<CaptureFileType> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY_CENTER", "PROFILE_AND_CENTER", "CONFIGURABLE_POSES", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum CaptureMethod {
            ONLY_CENTER,
            PROFILE_AND_CENTER,
            CONFIGURABLE_POSES;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            @NotNull
            public static InterfaceC10707a<CaptureMethod> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();

            @Nullable
            private final CancelDialog cancelDialog;

            @NotNull
            private final CapturePage capturePage;

            @Nullable
            private final CheckPage checkPage;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Localizations(PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CheckPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(@NotNull PromptPage promptPage, @NotNull CapturePage capturePage, @NotNull PendingPage pendingPage, @Nullable CancelDialog cancelDialog, @Nullable CheckPage checkPage) {
                Intrinsics.checkNotNullParameter(promptPage, "promptPage");
                Intrinsics.checkNotNullParameter(capturePage, "capturePage");
                Intrinsics.checkNotNullParameter(pendingPage, "pendingPage");
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.pendingPage = pendingPage;
                this.cancelDialog = cancelDialog;
                this.checkPage = checkPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @NotNull
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @Nullable
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.promptPage.writeToParcel(dest, flags);
                this.capturePage.writeToParcel(dest, flags);
                this.pendingPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    checkPage.writeToParcel(dest, flags);
                }
            }
        }

        @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages;", "", "selfie", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages$SelfiePages;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages$SelfiePages;)V", "getSelfie", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages$SelfiePages;", "SelfiePages", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Pages {

            @Nullable
            private final SelfiePages selfie;

            @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages$SelfiePages;", "", "pending", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;)V", "getPending", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$PendingUiPage;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC11874i(generateAdapter = true)
            public static final class SelfiePages {

                @Nullable
                private final PendingUiPage pending;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
                /* JADX WARN: Multi-variable type inference failed */
                public SelfiePages() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Nullable
                public final PendingUiPage getPending() {
                    return this.pending;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public SelfiePages(@Nullable PendingUiPage pendingUiPage) {
                    this.pending = pendingUiPage;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
                  (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage))
                 A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.Pages.SelfiePages.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$PendingUiPage):void type: THIS */
                public /* synthetic */ SelfiePages(PendingUiPage pendingUiPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : pendingUiPage);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public Pages() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Nullable
            public final SelfiePages getSelfie() {
                return this.selfie;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Pages(@Nullable SelfiePages selfiePages) {
                this.selfie = selfiePages;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages$SelfiePages:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages$SelfiePages) : (r1v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages$SelfiePages))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages$SelfiePages):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.Pages.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages$SelfiePages):void type: THIS */
            public /* synthetic */ Pages(SelfiePages selfiePages, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : selfiePages);
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "RIGHT", "UP", "DOWN", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum SelfiePose {
            CENTER,
            LEFT,
            RIGHT,
            UP,
            DOWN;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            @NotNull
            public static InterfaceC10707a<SelfiePose> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;", "", "index", "", "pose", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "token", "", "<init>", "(Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;Ljava/lang/String;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPose", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "getToken", "()Ljava/lang/String;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class SelfiePoseInfo {

            @Nullable
            private final Integer index;

            @Nullable
            private final SelfiePose pose;

            @Nullable
            private final String token;

            public SelfiePoseInfo(@Nullable Integer num, @Nullable SelfiePose selfiePose, @Nullable String str) {
                this.index = num;
                this.pose = selfiePose;
                this.token = str;
            }

            @Nullable
            public final Integer getIndex() {
                return this.index;
            }

            @Nullable
            public final SelfiePose getPose() {
                return this.pose;
            }

            @Nullable
            public final String getToken() {
                return this.token;
            }
        }

        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = false)
        public enum VideoCaptureMethod {
            Stream,
            Upload,
            None;

            private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Companion extends AbstractC11873h<VideoCaptureMethod> {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.VideoCaptureMethod.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                @InterfaceC11891z
                public void toJson(@NotNull AbstractC11885t writer, @Nullable VideoCaptureMethod value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Companion() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                @NotNull
                @InterfaceC11871f
                public VideoCaptureMethod fromJson(@NotNull AbstractC11878m reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Object objM44315B = reader.m44315B();
                    if (Intrinsics.m31980c(objM44315B, "stream")) {
                        return VideoCaptureMethod.Stream;
                    }
                    return Intrinsics.m31980c(objM44315B, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            @NotNull
            public static InterfaceC10707a<VideoCaptureMethod> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(@NotNull String name, @NotNull Config config, @Nullable StepStyles.SelfieStepStyle selfieStepStyle) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(config, "config");
            this.name = name;
            this.config = config;
            this.styles = selfieStepStyle;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        @NotNull
        public String getName() {
            return this.name;
        }

        @Nullable
        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "Landroid/os/Parcelable;", Title.type, "", "description", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @NotNull
            private final String description;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PendingPage(@NotNull String title, @NotNull String description, @Nullable String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.title = title;
                this.description = description;
                this.navBarTitle = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (r1v0 java.lang.String)
              (r2v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.PendingPage.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PendingPage(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "Landroid/os/Parcelable;", Title.type, "", "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "selfieLabelUp", "selfieLabelDown", "btnSubmit", "btnRetake", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSelfieLabelFront", "getSelfieLabelLeft", "getSelfieLabelRight", "getSelfieLabelUp", "getSelfieLabelDown", "getBtnSubmit", "getBtnRetake", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CheckPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();

            @Nullable
            private final String btnRetake;

            @Nullable
            private final String btnSubmit;

            @Nullable
            private final String description;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String selfieLabelDown;

            @Nullable
            private final String selfieLabelFront;

            @Nullable
            private final String selfieLabelLeft;

            @Nullable
            private final String selfieLabelRight;

            @Nullable
            private final String selfieLabelUp;

            @Nullable
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i10) {
                    return new CheckPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public CheckPage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
                this.title = str;
                this.description = str2;
                this.selfieLabelFront = str3;
                this.selfieLabelLeft = str4;
                this.selfieLabelRight = str5;
                this.selfieLabelUp = str6;
                this.selfieLabelDown = str7;
                this.btnSubmit = str8;
                this.btnRetake = str9;
                this.navBarTitle = str10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getBtnRetake() {
                return this.btnRetake;
            }

            @Nullable
            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getSelfieLabelDown() {
                return this.selfieLabelDown;
            }

            @Nullable
            public final String getSelfieLabelFront() {
                return this.selfieLabelFront;
            }

            @Nullable
            public final String getSelfieLabelLeft() {
                return this.selfieLabelLeft;
            }

            @Nullable
            public final String getSelfieLabelRight() {
                return this.selfieLabelRight;
            }

            @Nullable
            public final String getSelfieLabelUp() {
                return this.selfieLabelUp;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.selfieLabelFront);
                dest.writeString(this.selfieLabelLeft);
                dest.writeString(this.selfieLabelRight);
                dest.writeString(this.selfieLabelUp);
                dest.writeString(this.selfieLabelDown);
                dest.writeString(this.btnSubmit);
                dest.writeString(this.btnRetake);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
              (r13v0 java.lang.String)
              (r14v0 java.lang.String)
              (r15v0 java.lang.String)
              (r16v0 java.lang.String)
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.CheckPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ CheckPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i10 & 512) != 0 ? null : str10);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Landroid/os/Parcelable;", Title.type, "", "prompt", "promptCenter", "disclosure", "buttonSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getPromptCenter", "getDisclosure", "getButtonSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "getNavBarTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

            @NotNull
            private final String buttonSubmit;

            @Nullable
            private final String cameraPermissionsAllowButtonText;

            @Nullable
            private final String cameraPermissionsCancelButtonText;

            @Nullable
            private final String cameraPermissionsPrompt;

            @Nullable
            private final String cameraPermissionsTitle;

            @NotNull
            private final String disclosure;

            @Nullable
            private final String microphonePermissionsBtnCancel;

            @Nullable
            private final String microphonePermissionsBtnContinueMobile;

            @Nullable
            private final String microphonePermissionsPrompt;

            @Nullable
            private final String microphonePermissionsTitle;

            @Nullable
            private final String navBarTitle;

            @NotNull
            private final String prompt;

            @NotNull
            private final String promptCenter;

            @NotNull
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PromptPage(@InterfaceC11872g(name = "selfieTitle") @NotNull String title, @InterfaceC11872g(name = "selfiePrompt") @NotNull String prompt, @InterfaceC11872g(name = "selfiePromptCenter") @NotNull String promptCenter, @InterfaceC11872g(name = "agreeToPolicy") @NotNull String disclosure, @InterfaceC11872g(name = "btnSubmit") @NotNull String buttonSubmit, @Nullable String str, @Nullable String str2, @InterfaceC11872g(name = "cameraPermissionsBtnContinueMobile") @Nullable String str3, @InterfaceC11872g(name = "cameraPermissionsBtnCancel") @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(promptCenter, "promptCenter");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(buttonSubmit, "buttonSubmit");
                this.title = title;
                this.prompt = prompt;
                this.promptCenter = promptCenter;
                this.disclosure = disclosure;
                this.buttonSubmit = buttonSubmit;
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsBtnCancel = str5;
                this.microphonePermissionsBtnContinueMobile = str6;
                this.microphonePermissionsPrompt = str7;
                this.microphonePermissionsTitle = str8;
                this.navBarTitle = str9;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            @Nullable
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            @Nullable
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            @Nullable
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            @Nullable
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @NotNull
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            @Nullable
            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            @Nullable
            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            @Nullable
            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final String getPromptCenter() {
                return this.promptCenter;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.promptCenter);
                dest.writeString(this.disclosure);
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsBtnCancel);
                dest.writeString(this.microphonePermissionsBtnContinueMobile);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsTitle);
                dest.writeString(this.navBarTitle);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
              (r17v0 java.lang.String)
              (r18v0 java.lang.String)
              (r19v0 java.lang.String)
              (r20v0 java.lang.String)
              (r21v0 java.lang.String)
              (r22v0 java.lang.String)
              (r23v0 java.lang.String)
              (r24v0 java.lang.String)
              (r25v0 java.lang.String)
              (r26v0 java.lang.String)
              (r27v0 java.lang.String)
              (r28v0 java.lang.String)
              (r29v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.PromptPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (i10 & 8192) != 0 ? null : str14);
            }
        }

        @Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b@\u0010-R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u00108R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0015\u0010$\u001a\u0004\u0018\u00010%¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N¨\u0006O"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "", "selfieType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "fieldKeySelfie", "", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "videoSessionJwt", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "orderedPosesBuffer", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;", "poseTimeoutMs", "", "designVersion", "imageUploadUrl", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages;)V", "getSelfieType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "getFieldKeySelfie", "()Ljava/lang/String;", "getRequireStrictSelfieCapture", "()Z", "getSkipPromptPage", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getVideoCaptureMethods", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getVideoSessionJwt", "getOrderedPoses", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "getPoseConfigs", "getOrderedPosesBuffer", "getPoseTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDesignVersion", "getImageUploadUrl", "getFlowWatermarkText", "getSilentNetworkAuthenticationCheckUrl", "getSilentNetworkAuthenticationBackgroundTimeoutSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Pages;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class Config {

            @NotNull
            private final AssetConfig assets;

            @Nullable
            private final Boolean audioEnabled;

            @Nullable
            private final Boolean backStepEnabled;

            @Nullable
            private final Boolean cancelButtonEnabled;

            @Nullable
            private final String designVersion;

            @Nullable
            private final List<CaptureFileType> enabledCaptureFileTypes;

            @NotNull
            private final String fieldKeySelfie;

            @Nullable
            private final String flowWatermarkText;

            @Nullable
            private final String imageUploadUrl;

            @NotNull
            private final Localizations localizations;

            @Nullable
            private final List<SelfiePose> orderedPoses;

            @Nullable
            private final List<SelfiePoseInfo> orderedPosesBuffer;

            @Nullable
            private final Pages pages;

            @Nullable
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            @Nullable
            private final List<PoseConfig> poseConfigs;

            @Nullable
            private final Long poseTimeoutMs;
            private final boolean requireStrictSelfieCapture;

            @NotNull
            private final CaptureMethod selfieType;

            @Nullable
            private final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

            @Nullable
            private final String silentNetworkAuthenticationCheckUrl;

            @Nullable
            private final Boolean skipPromptPage;

            @Nullable
            private final List<VideoCaptureMethod> videoCaptureMethods;

            @Nullable
            private final String videoSessionJwt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$VideoCaptureMethod> */
            /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$SelfiePose> */
            /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureFileType> */
            /* JADX WARN: Multi-variable type inference failed */
            public Config(@NotNull CaptureMethod selfieType, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Localizations localizations, @NotNull String fieldKeySelfie, boolean z10, @Nullable Boolean bool3, @Nullable List<? extends CaptureFileType> list, @Nullable List<? extends VideoCaptureMethod> list2, @NotNull AssetConfig assets, @InterfaceC11872g(name = "videoSessionJWT") @Nullable String str, @Nullable List<? extends SelfiePose> list3, @Nullable PendingPageTextPosition pendingPageTextPosition, @Nullable Boolean bool4, @Nullable List<PoseConfig> list4, @Nullable List<SelfiePoseInfo> list5, @Nullable Long l10, @Nullable String str2, @InterfaceC11872g(name = "imageUploadUrl") @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Pages pages) {
                Intrinsics.checkNotNullParameter(selfieType, "selfieType");
                Intrinsics.checkNotNullParameter(localizations, "localizations");
                Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
                Intrinsics.checkNotNullParameter(assets, "assets");
                this.selfieType = selfieType;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.fieldKeySelfie = fieldKeySelfie;
                this.requireStrictSelfieCapture = z10;
                this.skipPromptPage = bool3;
                this.enabledCaptureFileTypes = list;
                this.videoCaptureMethods = list2;
                this.assets = assets;
                this.videoSessionJwt = str;
                this.orderedPoses = list3;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.poseConfigs = list4;
                this.orderedPosesBuffer = list5;
                this.poseTimeoutMs = l10;
                this.designVersion = str2;
                this.imageUploadUrl = str3;
                this.flowWatermarkText = str4;
                this.silentNetworkAuthenticationCheckUrl = str5;
                this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num;
                this.pages = pages;
            }

            @NotNull
            public final AssetConfig getAssets() {
                return this.assets;
            }

            @Nullable
            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            @Nullable
            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            @Nullable
            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            @Nullable
            public final String getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            @NotNull
            public final String getFieldKeySelfie() {
                return this.fieldKeySelfie;
            }

            @Nullable
            public final String getFlowWatermarkText() {
                return this.flowWatermarkText;
            }

            @Nullable
            public final String getImageUploadUrl() {
                return this.imageUploadUrl;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            @Nullable
            public final List<SelfiePose> getOrderedPoses() {
                return this.orderedPoses;
            }

            @Nullable
            public final List<SelfiePoseInfo> getOrderedPosesBuffer() {
                return this.orderedPosesBuffer;
            }

            @Nullable
            public final Pages getPages() {
                return this.pages;
            }

            @Nullable
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            public final List<PoseConfig> getPoseConfigs() {
                return this.poseConfigs;
            }

            @Nullable
            public final Long getPoseTimeoutMs() {
                return this.poseTimeoutMs;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @NotNull
            public final CaptureMethod getSelfieType() {
                return this.selfieType;
            }

            @Nullable
            public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
                return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            }

            @Nullable
            public final String getSilentNetworkAuthenticationCheckUrl() {
                return this.silentNetworkAuthenticationCheckUrl;
            }

            @Nullable
            public final Boolean getSkipPromptPage() {
                return this.skipPromptPage;
            }

            @Nullable
            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            @Nullable
            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
              (r27v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod)
              (r28v0 java.lang.Boolean)
              (r29v0 java.lang.Boolean)
              (r30v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations)
              (r31v0 java.lang.String)
              (r32v0 boolean)
              (r33v0 java.lang.Boolean)
              (r34v0 java.util.List)
              (r35v0 java.util.List)
              (r36v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig)
              (r37v0 java.lang.String)
              (r38v0 java.util.List)
              (r39v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
              (r40v0 java.lang.Boolean)
              (r41v0 java.util.List)
              (r42v0 java.util.List)
              (r43v0 java.lang.Long)
              (r44v0 java.lang.String)
              (r45v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000e: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
              (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0019: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
              (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages:?: TERNARY null = ((wrap int:0x0024: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages) : (r49v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages))
             A[MD:(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations, java.lang.String, boolean, java.lang.Boolean, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureFileType>, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$VideoCaptureMethod>, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$SelfiePose>, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.Boolean, java.util.List<com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig>, java.util.List<com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$SelfiePoseInfo>, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages):void (m)] (LINE:25) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.Config.<init>(com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod, java.lang.Boolean, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations, java.lang.String, boolean, java.lang.Boolean, java.util.List, java.util.List, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.Boolean, java.util.List, java.util.List, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Pages):void type: THIS */
            public /* synthetic */ Config(CaptureMethod captureMethod, Boolean bool, Boolean bool2, Localizations localizations, String str, boolean z10, Boolean bool3, List list, List list2, AssetConfig assetConfig, String str2, List list3, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, List list4, List list5, Long l10, String str3, String str4, String str5, String str6, Integer num, Pages pages, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(captureMethod, bool, bool2, localizations, str, z10, bool3, list, list2, assetConfig, str2, list3, pendingPageTextPosition, bool4, list4, list5, l10, str3, str4, (i10 & 524288) != 0 ? null : str5, (i10 & 1048576) != 0 ? null : str6, (i10 & 2097152) != 0 ? null : num, (i10 & 4194304) != 0 ? null : pages);
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020;R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006A"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Landroid/os/Parcelable;", Title.type, "", "navBarTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintLookUp", "selfieHintLookDown", "selfieHintHoldStill", "selfieHintPoseTimeout", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "selfieHintLookUpDescription", "selfieHintLookDownDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getNavBarTitle", "getSelfieHintTakePhoto", "getSelfieHintCenterFace", "getSelfieHintFaceTooClose", "getSelfieHintFaceTooFar", "getSelfieHintMultipleFaces", "getSelfieHintFaceIncomplete", "getSelfieHintPoseNotCenter", "getSelfieHintLookLeft", "getSelfieHintLookRight", "getSelfieHintLookUp", "getSelfieHintLookDown", "getSelfieHintHoldStill", "getSelfieHintPoseTimeout", "getAutoCaptureOn", "getCaptureSuccess", "getSelfieHintCenterFaceDescription", "getSelfieHintLookLeftDescription", "getSelfieHintLookRightDescription", "getSelfieHintLookUpDescription", "getSelfieHintLookDownDescription", "getCameraLoadingTitle", "getSelfieHintVerifying", "getSelfieHintAutoCaptureTimeout", "getDisclaimer", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class CapturePage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();

            @Nullable
            private final String autoCaptureOn;

            @Nullable
            private final String cameraLoadingTitle;

            @Nullable
            private final String captureSuccess;

            @Nullable
            private final String disclaimer;

            @Nullable
            private final String navBarTitle;

            @Nullable
            private final String selfieHintAutoCaptureTimeout;

            @NotNull
            private final String selfieHintCenterFace;

            @Nullable
            private final String selfieHintCenterFaceDescription;

            @NotNull
            private final String selfieHintFaceIncomplete;

            @NotNull
            private final String selfieHintFaceTooClose;

            @NotNull
            private final String selfieHintFaceTooFar;

            @NotNull
            private final String selfieHintHoldStill;

            @Nullable
            private final String selfieHintLookDown;

            @Nullable
            private final String selfieHintLookDownDescription;

            @NotNull
            private final String selfieHintLookLeft;

            @Nullable
            private final String selfieHintLookLeftDescription;

            @NotNull
            private final String selfieHintLookRight;

            @Nullable
            private final String selfieHintLookRightDescription;

            @Nullable
            private final String selfieHintLookUp;

            @Nullable
            private final String selfieHintLookUpDescription;

            @NotNull
            private final String selfieHintMultipleFaces;

            @NotNull
            private final String selfieHintPoseNotCenter;

            @Nullable
            private final String selfieHintPoseTimeout;

            @NotNull
            private final String selfieHintTakePhoto;

            @Nullable
            private final String selfieHintVerifying;

            @Nullable
            private final String title;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i10) {
                    return new CapturePage[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public CapturePage(@Nullable String str, @Nullable String str2, @NotNull String selfieHintTakePhoto, @NotNull String selfieHintCenterFace, @NotNull String selfieHintFaceTooClose, @NotNull String selfieHintFaceTooFar, @NotNull String selfieHintMultipleFaces, @NotNull String selfieHintFaceIncomplete, @NotNull String selfieHintPoseNotCenter, @NotNull String selfieHintLookLeft, @NotNull String selfieHintLookRight, @Nullable String str3, @Nullable String str4, @NotNull String selfieHintHoldStill, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
                Intrinsics.checkNotNullParameter(selfieHintTakePhoto, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(selfieHintCenterFace, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(selfieHintPoseNotCenter, "selfieHintPoseNotCenter");
                Intrinsics.checkNotNullParameter(selfieHintLookLeft, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(selfieHintLookRight, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(selfieHintHoldStill, "selfieHintHoldStill");
                this.title = str;
                this.navBarTitle = str2;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCenter = selfieHintPoseNotCenter;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintLookUp = str3;
                this.selfieHintLookDown = str4;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.selfieHintPoseTimeout = str5;
                this.autoCaptureOn = str6;
                this.captureSuccess = str7;
                this.selfieHintCenterFaceDescription = str8;
                this.selfieHintLookLeftDescription = str9;
                this.selfieHintLookRightDescription = str10;
                this.selfieHintLookUpDescription = str11;
                this.selfieHintLookDownDescription = str12;
                this.cameraLoadingTitle = str13;
                this.selfieHintVerifying = str14;
                this.selfieHintAutoCaptureTimeout = str15;
                this.disclaimer = str16;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            @Nullable
            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            @Nullable
            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            @Nullable
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @Nullable
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Nullable
            public final String getSelfieHintAutoCaptureTimeout() {
                return this.selfieHintAutoCaptureTimeout;
            }

            @NotNull
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @Nullable
            public final String getSelfieHintCenterFaceDescription() {
                return this.selfieHintCenterFaceDescription;
            }

            @NotNull
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @Nullable
            public final String getSelfieHintLookDown() {
                return this.selfieHintLookDown;
            }

            @Nullable
            public final String getSelfieHintLookDownDescription() {
                return this.selfieHintLookDownDescription;
            }

            @NotNull
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @Nullable
            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            @NotNull
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @Nullable
            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            @Nullable
            public final String getSelfieHintLookUp() {
                return this.selfieHintLookUp;
            }

            @Nullable
            public final String getSelfieHintLookUpDescription() {
                return this.selfieHintLookUpDescription;
            }

            @NotNull
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @NotNull
            public final String getSelfieHintPoseNotCenter() {
                return this.selfieHintPoseNotCenter;
            }

            @Nullable
            public final String getSelfieHintPoseTimeout() {
                return this.selfieHintPoseTimeout;
            }

            @NotNull
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            @Nullable
            public final String getSelfieHintVerifying() {
                return this.selfieHintVerifying;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.navBarTitle);
                dest.writeString(this.selfieHintTakePhoto);
                dest.writeString(this.selfieHintCenterFace);
                dest.writeString(this.selfieHintFaceTooClose);
                dest.writeString(this.selfieHintFaceTooFar);
                dest.writeString(this.selfieHintMultipleFaces);
                dest.writeString(this.selfieHintFaceIncomplete);
                dest.writeString(this.selfieHintPoseNotCenter);
                dest.writeString(this.selfieHintLookLeft);
                dest.writeString(this.selfieHintLookRight);
                dest.writeString(this.selfieHintLookUp);
                dest.writeString(this.selfieHintLookDown);
                dest.writeString(this.selfieHintHoldStill);
                dest.writeString(this.selfieHintPoseTimeout);
                dest.writeString(this.autoCaptureOn);
                dest.writeString(this.captureSuccess);
                dest.writeString(this.selfieHintCenterFaceDescription);
                dest.writeString(this.selfieHintLookLeftDescription);
                dest.writeString(this.selfieHintLookRightDescription);
                dest.writeString(this.selfieHintLookUpDescription);
                dest.writeString(this.selfieHintLookDownDescription);
                dest.writeString(this.cameraLoadingTitle);
                dest.writeString(this.selfieHintVerifying);
                dest.writeString(this.selfieHintAutoCaptureTimeout);
                dest.writeString(this.disclaimer);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
              (r29v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r55v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
              (r31v0 java.lang.String)
              (r32v0 java.lang.String)
              (r33v0 java.lang.String)
              (r34v0 java.lang.String)
              (r35v0 java.lang.String)
              (r36v0 java.lang.String)
              (r37v0 java.lang.String)
              (r38v0 java.lang.String)
              (r39v0 java.lang.String)
              (r40v0 java.lang.String)
              (r41v0 java.lang.String)
              (r42v0 java.lang.String)
              (r43v0 java.lang.String)
              (r44v0 java.lang.String)
              (r45v0 java.lang.String)
              (r46v0 java.lang.String)
              (r47v0 java.lang.String)
              (r48v0 java.lang.String)
              (r49v0 java.lang.String)
              (r50v0 java.lang.String)
              (r51v0 java.lang.String)
              (r52v0 java.lang.String)
              (r53v0 java.lang.String)
              (r54v0 java.lang.String)
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.withpersona.sdk2.inquiry.network.dto.NextStep.Selfie.CapturePage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
            }
        }
    }
}
