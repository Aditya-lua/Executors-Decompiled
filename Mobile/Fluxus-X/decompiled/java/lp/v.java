package lp;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import fq.y1;
import hr.InquirySessionConfig;
import java.util.List;
import ln.Snapshot;
import ln.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005064.2B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020 *\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020#2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%JU\u0010,\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*0(0'*\u00020&2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Llp/v;", "Lln/k;", "Llp/v$b;", "Llp/v$e;", "Llp/v$c;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lir/b;", "navigationStateManager", "Llp/c$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lir/b;Llp/c$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "props", "Lln/i;", "snapshot", "u", "(Llp/v$b;Lln/i;)Llp/v$e;", "state", "C", "(Llp/v$e;)Lln/i;", "renderProps", "renderState", "Lln/k$a;", "context", "z", "(Llp/v$b;Llp/v$e;Lln/k$a;)Ljava/lang/Object;", "Llp/v$a;", "event", BuildConfig.FLAVOR, "v", "(Lln/k$a;Llp/v$a;)V", "Llp/v$e$a;", "r", "(Llp/v$b;Llp/v$e$a;Lln/k$a;)V", "Llp/g;", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", "p", "(Llp/g;Lln/k$a;)Ljava/util/List;", "a", "Landroid/content/Context;", "b", "Lir/b;", "c", "Llp/c$a;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "e", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends ln.k<Input, e, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.c.a integrationBrowserWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Llp/v$a;", BuildConfig.FLAVOR, "a", "b", "c", "Llp/v$a$a;", "Llp/v$a$b;", "Llp/v$a$c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: lp.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$a$a;", "Llp/v$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0442a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0442a f22431a = new C0442a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0442a);
            }

            public int hashCode() {
                return 224778200;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$a$b;", "Llp/v$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f22432a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1292437803;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$a$c;", "Llp/v$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f22433a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1979122029;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    /* JADX INFO: renamed from: lp.v$b, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b4\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b?\u0010IR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bC\u0010;¨\u0006K"}, d2 = {"Llp/v$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "inquiryId", "sessionToken", "stepName", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", BuildConfig.FLAVOR, "backStepEnabled", "cancelButtonEnabled", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Llp/g;", "startPage", "isSubmitting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;ZZLhr/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Llp/g;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInquiryId", "b", "getSessionToken", "c", "getStepName", "d", "getType", "e", "g", "f", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "h", "Z", "()Z", "Lhr/g;", "getInquirySessionConfig", "()Lhr/g;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "l", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "m", "Llp/g;", "()Llp/g;", "n", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final g startPage;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSubmitting;

        /* JADX INFO: renamed from: lp.v$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserTypeValueOf = NextStep.Integration.IntegrationStepBrowserType.valueOf(parcel.readString());
                boolean z10 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new Input(string, string2, string3, string4, string5, string6, integrationStepBrowserTypeValueOf, z10, z11, (InquirySessionConfig) parcel.readParcelable(Input.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, boolean z10, boolean z11, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle, @Nullable InternalErrorInfo internalErrorInfo, @Nullable g gVar, boolean z12) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.stepName = stepName;
            this.type = type;
            this.flowUrl = flowUrl;
            this.redirectPath = redirectPath;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.inquirySessionConfig = inquirySessionConfig;
            this.styles = integrationStepStyle;
            this.transitionError = internalErrorInfo;
            this.startPage = gVar;
            this.isSubmitting = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.stepName, input.stepName) && Intrinsics.c(this.type, input.type) && Intrinsics.c(this.flowUrl, input.flowUrl) && Intrinsics.c(this.redirectPath, input.redirectPath) && this.integrationStepBrowserType == input.integrationStepBrowserType && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.transitionError, input.transitionError) && Intrinsics.c(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + this.redirectPath.hashCode()) * 31) + this.integrationStepBrowserType.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode3 = (iHashCode2 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31;
            g gVar = this.startPage;
            return ((iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSubmitting);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final NextStep.Integration.IntegrationStepBrowserType getIntegrationStepBrowserType() {
            return this.integrationStepBrowserType;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getRedirectPath() {
            return this.redirectPath;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final g getStartPage() {
            return this.startPage;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @NotNull
        public String toString() {
            return "Input(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", stepName=" + this.stepName + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", redirectPath=" + this.redirectPath + ", integrationStepBrowserType=" + this.integrationStepBrowserType + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", inquirySessionConfig=" + this.inquirySessionConfig + ", styles=" + this.styles + ", transitionError=" + this.transitionError + ", startPage=" + this.startPage + ", isSubmitting=" + this.isSubmitting + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.stepName);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeString(this.redirectPath);
            dest.writeString(this.integrationStepBrowserType.name());
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.transitionError, flags);
            g gVar = this.startPage;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                gVar.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Llp/v$c;", BuildConfig.FLAVOR, "c", "d", "a", "b", "Llp/v$c$a;", "Llp/v$c$b;", "Llp/v$c$c;", "Llp/v$c$d;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$c$a;", "Llp/v$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f22447a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1494152841;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$c$b;", "Llp/v$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f22448a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1332850934;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: lp.v$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$c$c;", "Llp/v$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0443c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0443c f22449a = new C0443c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0443c);
            }

            public int hashCode() {
                return 929193848;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/v$c$d;", "Llp/v$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f22450a = new d();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1519977214;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llp/v$d;", "Landroid/os/Parcelable;", "a", "Llp/v$d$a;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llp/v$d$a;", "Llp/v$d;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f22451a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0444a();

            /* JADX INFO: renamed from: lp.v$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0444a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f22451a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 2035883520;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Llp/v$e;", "Lls/c;", "<init>", "()V", "a", "Llp/v$e$a;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e extends ls.c {

        /* JADX INFO: renamed from: lp.v$e$a, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Llp/v$e$a;", "Llp/v$e;", "Llp/v$d;", "pendingAction", "<init>", "(Llp/v$d;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "u", "(Llp/v$d;)Llp/v$e$a;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Llp/v$d;", "v", "()Llp/v$d;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Starting extends e {

            @NotNull
            public static final Parcelable.Creator<Starting> CREATOR = new C0445a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final d pendingAction;

            /* JADX INFO: renamed from: lp.v$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0445a implements Parcelable.Creator<Starting> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Starting createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Starting((d) parcel.readParcelable(Starting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Starting[] newArray(int i10) {
                    return new Starting[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Starting() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Starting) && Intrinsics.c(this.pendingAction, ((Starting) other).pendingAction);
            }

            public int hashCode() {
                d dVar = this.pendingAction;
                if (dVar == null) {
                    return 0;
                }
                return dVar.hashCode();
            }

            @NotNull
            public String toString() {
                return "Starting(pendingAction=" + this.pendingAction + ")";
            }

            @NotNull
            public final Starting u(@Nullable d pendingAction) {
                return new Starting(pendingAction);
            }

            @Nullable
            /* JADX INFO: renamed from: v, reason: from getter */
            public final d getPendingAction() {
                return this.pendingAction;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.pendingAction, flags);
            }

            public Starting(@Nullable d dVar) {
                super(null);
                this.pendingAction = dVar;
            }

            public /* synthetic */ Starting(d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : dVar);
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public e() {
        }
    }

    public v(@NotNull Context applicationContext, @NotNull ir.b navigationStateManager, @NotNull lp.c.a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit A(v vVar, ln.k.a aVar) {
        vVar.v(aVar, a.C0442a.f22431a);
        return Unit.f21506a;
    }

    public static final Unit B(v vVar, ln.k.a aVar) {
        vVar.v(aVar, a.b.f22432a);
        return Unit.f21506a;
    }

    public static final Unit q(v vVar, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vVar.v(aVar, a.c.f22433a);
        return Unit.f21506a;
    }

    public static final ln.r s(v vVar, Input input, BrowserSelection browserSelection, final e.Starting starting, lp.c.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof lp.c.b.a)) {
            throw new zt.l();
        }
        TrackingEventsLogger.logIntegrationEvent$default(vVar.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        return z.d(vVar, null, new Function1() { // from class: lp.u
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.t(starting, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit t(e.Starting starting, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(starting.u(null));
        action.d(c.d.f22450a);
        return Unit.f21506a;
    }

    public static final Unit w(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.a.f22447a);
        return Unit.f21506a;
    }

    public static final Unit x(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.b.f22448a);
        return Unit.f21506a;
    }

    public static final Unit y(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        Intrinsics.d(objC, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting");
        action.e(((e.Starting) objC).u(d.a.f22451a));
        return Unit.f21506a;
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    public final List<Pair<String, Function1<x5, Unit>>> p(g gVar, final ln.k<? super Input, e, ? extends c, ? extends Object>.a aVar) {
        return new or.c.a().a(gVar.getOpenBrowserButton(), new Function1() { // from class: lp.t
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.q(this.f22426a, aVar, (x5) obj);
            }
        }).b();
    }

    public final void r(final Input renderProps, final e.Starting renderState, ln.k<? super Input, e, ? extends c, ? extends Object>.a context) {
        d pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof d.a)) {
            if (pendingAction != null) {
                throw new zt.l();
            }
            return;
        }
        final BrowserSelection browserSelectionC = h.f22404a.c(this.applicationContext);
        TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(browserSelectionC.getSupportsAuthTab()), null, 8, null), false, 2, null);
        ln.w.l(context, this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), browserSelectionC, renderProps.getIntegrationStepBrowserType()), d0.k(lp.c.class), BuildConfig.FLAVOR, new Function1() { // from class: lp.p
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.s(this.f22423a, renderProps, browserSelectionC, renderState, (c.b) obj);
            }
        });
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public e d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ew.h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            e eVar = (e) parcelable;
            if (eVar != null) {
                return eVar;
            }
        }
        return new e.Starting(d.a.f22451a);
    }

    public final void v(ln.k<? super Input, e, ? extends c, ? extends Object>.a aVar, a aVar2) {
        if (aVar2 instanceof a.C0442a) {
            aVar.d().a(z.d(this, null, new Function1() { // from class: lp.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v.w((ln.r.c) obj);
                }
            }, 1, null));
        } else if (aVar2 instanceof a.b) {
            aVar.d().a(z.d(this, null, new Function1() { // from class: lp.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v.x((ln.r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new zt.l();
            }
            aVar.d().a(z.d(this, null, new Function1() { // from class: lp.s
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v.y((ln.r.c) obj);
                }
            }, 1, null));
        }
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull e renderState, @NotNull final ln.k<? super Input, e, ? extends c, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(renderState instanceof e.Starting)) {
            throw new zt.l();
        }
        e.Starting starting = (e.Starting) renderState;
        r(renderProps, starting, context);
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        g startPage = renderProps.getStartPage();
        Intrinsics.checkNotNull(startPage);
        m mVar = new m(or.d.a(startPage), this.navigationStateManager.b(), new Function0() { // from class: lp.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.A(this.f22421a, context);
            }
        }, new Function0() { // from class: lp.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.B(this.f22422a, context);
            }
        }, p(renderProps.getStartPage(), context), starting.getPendingAction() != null || renderProps.getIsSubmitting());
        y1.c(mVar);
        return mVar;
    }
}
