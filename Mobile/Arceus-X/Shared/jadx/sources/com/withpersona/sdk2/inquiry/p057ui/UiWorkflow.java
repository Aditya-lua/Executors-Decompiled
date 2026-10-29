package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.C3828b;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.p057ui.C4151d;
import com.withpersona.sdk2.inquiry.p057ui.C4158k;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import cr.C4263k;
import cr.InterfaceC4248h2;
import er.C5199h;
import er.C5201j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0388q;
import p084dr.HelpBottomSheetViewModel;
import p152go.C6159e;
import p152go.C6174t;
import p226jq.C7259g;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p278lp.C8228j;
import p278lp.C8231m;
import p278lp.C8232n;
import p278lp.JpMyNumberNfcValidOperation;
import p315nt.InterfaceC9557b;
import p342or.C9859b4;
import p344ot.C10047c;
import p363pq.AbstractC10315i;
import p363pq.C10309c;
import p390qp.EnumC10688b;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p497vp.C12244g;
import p525wp.C12504c;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13215h;
import p581ym.Snapshot;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 p2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004TqVXBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020$*\u00180 R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)JK\u0010.\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/JC\u00100\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020$*\b\u0012\u0004\u0012\u000203022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020$04H\u0002¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020$2\u0006\u00108\u001a\u0002032\u0006\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b;\u0010<JC\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\u00020$2\u0006\u0010>\u001a\u00020A2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002092\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJK\u0010H\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00032\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020K2\u0006\u0010Q\u001a\u00020\u0003H\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Llp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lwp/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/a;", "componentWorkHelper", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Llp/n$a;Lwp/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Luq/a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/ui/a;Lpq/c;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "", "D0", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "renderProps", "C0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lym/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "n1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "E0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "C1", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "q0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "n0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "B0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "v1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "Lym/i;", "snapshot", "A0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "G0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)Ljava/lang/Object;", "state", "E1", "(Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "c", "Llp/n$a;", "d", "Lwp/c;", "e", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "f", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "g", "Luq/a;", "h", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "i", "Lcom/withpersona/sdk2/inquiry/ui/a;", "j", "Lpq/c;", "k", "Lgo/e;", "l", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "m", "Ljava/lang/String;", "lastLoggedPage", "n", "Input", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class UiWorkflow extends AbstractC13218k<Input, UiState, InterfaceC4141b, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3828b.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C8232n.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C4151d.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C4158k.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C4148a componentWorkHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String lastLoggedPage;

    @Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010+R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b1\u0010>R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bI\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bE\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bP\u00109R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\bV\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bQ\u0010+¨\u0006W"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "isRestoringState", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "y", "b", "p", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "d", "t", "e", "Z", "()Z", "f", "g", "h", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "i", "o", "j", "n", "k", "getGpsPermissionsModalPositiveButton", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "s", "r", "w", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "u", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "v", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new C4139a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentConfig> components;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public final boolean finalStep;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsRationale;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalPositiveButton;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentErrorInfo> serverComponentErrors;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        public final boolean isSubmitting;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        public final boolean isRestoringState;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$Input$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4139a implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(Input.class.getClassLoader()));
                    }
                }
                String string3 = parcel.readString();
                boolean z10 = true;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) parcel.readParcelable(r5.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Input.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i12);
                    int i13 = 0;
                    while (i13 != i12) {
                        arrayList3.add(UiComponentErrorInfo.CREATOR.createFromParcel(parcel));
                        i13++;
                        i12 = i12;
                    }
                    arrayList2 = arrayList3;
                }
                return new Input(string, string2, arrayList, string3, z11, z12, z10, inquirySessionConfig, string4, string5, string6, string7, string8, string9, string10, uiStepStyle, arrayList2, parcel.readInt() != 0, (InternalErrorInfo) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
        /* JADX WARN: Multi-variable type inference failed */
        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @Nullable List<? extends UiComponentConfig> list, @NotNull String stepName, boolean z10, boolean z11, boolean z12, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable List<UiComponentErrorInfo> list2, boolean z13, @Nullable InternalErrorInfo internalErrorInfo, boolean z14, @Nullable String str8) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.components = list;
            this.stepName = stepName;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.finalStep = z12;
            this.inquirySessionConfig = inquirySessionConfig;
            this.gpsPermissionsTitle = str;
            this.gpsPermissionsRationale = str2;
            this.gpsPermissionsModalPositiveButton = str3;
            this.gpsPermissionsModalNegativeButton = str4;
            this.gpsFeatureTitle = str5;
            this.gpsFeatureRationale = str6;
            this.gpsFeatureModalPositiveButton = str7;
            this.styles = uiStepStyle;
            this.serverComponentErrors = list2;
            this.isSubmitting = z13;
            this.transitionError = internalErrorInfo;
            this.isRestoringState = z14;
            this.navBarTitle = str8;
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
            return Intrinsics.m31980c(this.sessionToken, input.sessionToken) && Intrinsics.m31980c(this.inquiryId, input.inquiryId) && Intrinsics.m31980c(this.components, input.components) && Intrinsics.m31980c(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.m31980c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.m31980c(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.m31980c(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.m31980c(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.m31980c(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.m31980c(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.m31980c(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.m31980c(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.m31980c(this.styles, input.styles) && Intrinsics.m31980c(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.m31980c(this.transitionError, input.transitionError) && this.isRestoringState == input.isRestoringState && Intrinsics.m31980c(this.navBarTitle, input.navBarTitle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @Nullable
        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        @Nullable
        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = ((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int iHashCode2 = (((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str = this.gpsPermissionsTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gpsPermissionsRationale;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsPermissionsModalPositiveButton;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsPermissionsModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureTitle;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gpsFeatureRationale;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.gpsFeatureModalPositiveButton;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode10 = (iHashCode9 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            int iHashCode11 = (((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode12 = (((iHashCode11 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + Boolean.hashCode(this.isRestoringState)) * 31;
            String str8 = this.navBarTitle;
            return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getGpsFeatureModalPositiveButton() {
            return this.gpsFeatureModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getGpsPermissionsModalNegativeButton() {
            return this.gpsPermissionsModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getGpsPermissionsRationale() {
            return this.gpsPermissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getGpsPermissionsTitle() {
            return this.gpsPermissionsTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final List<UiComponentErrorInfo> m21168s() {
            return this.serverComponentErrors;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", components=" + this.components + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", gpsPermissionsTitle=" + this.gpsPermissionsTitle + ", gpsPermissionsRationale=" + this.gpsPermissionsRationale + ", gpsPermissionsModalPositiveButton=" + this.gpsPermissionsModalPositiveButton + ", gpsPermissionsModalNegativeButton=" + this.gpsPermissionsModalNegativeButton + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalPositiveButton=" + this.gpsFeatureModalPositiveButton + ", styles=" + this.styles + ", serverComponentErrors=" + this.serverComponentErrors + ", isSubmitting=" + this.isSubmitting + ", transitionError=" + this.transitionError + ", isRestoringState=" + this.isRestoringState + ", navBarTitle=" + this.navBarTitle + ")";
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
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
            dest.writeString(this.stepName);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.gpsPermissionsTitle);
            dest.writeString(this.gpsPermissionsRationale);
            dest.writeString(this.gpsPermissionsModalPositiveButton);
            dest.writeString(this.gpsPermissionsModalNegativeButton);
            dest.writeString(this.gpsFeatureTitle);
            dest.writeString(this.gpsFeatureRationale);
            dest.writeString(this.gpsFeatureModalPositiveButton);
            dest.writeParcelable(this.styles, flags);
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentErrorInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
            dest.writeString(this.navBarTitle);
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "b", "f", "e", "d", "c", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC4141b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements InterfaceC4141b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f17595a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1353460011;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b implements InterfaceC4141b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f17596a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -650975523;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c implements InterfaceC4141b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f17597a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -584917881;
            }

            @NotNull
            public String toString() {
                return "Completed";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$d */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "message", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d implements InterfaceC4141b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            public d(@Nullable String str, @NotNull InternalErrorInfo cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.message = str;
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getMessage() {
                return this.message;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$e, reason: from toString */
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "canReuseWorkflow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class FinishedWithTransition implements InterfaceC4141b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            public final boolean canReuseWorkflow;

            public FinishedWithTransition(boolean z10) {
                this.canReuseWorkflow = z10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getCanReuseWorkflow() {
                return this.canReuseWorkflow;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishedWithTransition) && this.canReuseWorkflow == ((FinishedWithTransition) other).canReuseWorkflow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.canReuseWorkflow);
            }

            @NotNull
            public String toString() {
                return "FinishedWithTransition(canReuseWorkflow=" + this.canReuseWorkflow + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$f, reason: from toString */
        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class FinishedWithoutTransition implements InterfaceC4141b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final UiComponent fromComponent;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, ComponentParam> componentParams;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final String fromStep;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.ui.network.ComponentParam> */
            /* JADX WARN: Multi-variable type inference failed */
            public FinishedWithoutTransition(@NotNull UiComponent fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
                Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
                Intrinsics.checkNotNullParameter(componentParams, "componentParams");
                Intrinsics.checkNotNullParameter(fromStep, "fromStep");
                this.fromComponent = fromComponent;
                this.componentParams = componentParams;
                this.fromStep = fromStep;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Map<String, ComponentParam> m21179a() {
                return this.componentParams;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final UiComponent getFromComponent() {
                return this.fromComponent;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getFromStep() {
                return this.fromStep;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishedWithoutTransition)) {
                    return false;
                }
                FinishedWithoutTransition finishedWithoutTransition = (FinishedWithoutTransition) other;
                return Intrinsics.m31980c(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.m31980c(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.m31980c(this.fromStep, finishedWithoutTransition.fromStep);
            }

            public int hashCode() {
                return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
            }

            @NotNull
            public String toString() {
                return "FinishedWithoutTransition(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$c */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "<init>", "()V", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC4142c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$c$a */
        @Metadata(m31664d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015B\u0099\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012$\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR;\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bQ\u0010JR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bS\u0010JR5\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\b:\u0010XR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b?\u0010H\u001a\u0004\bY\u0010JR)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bE\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bG\u0010CR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010JR)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\ba\u0010VR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bM\u0010eR\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bf\u0010]R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bc\u0010JR\u0013\u0010i\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\b<\u0010hR\u0013\u0010j\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bK\u0010hR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "navBarTitle", "Lkotlin/Function3;", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "onClick", "Lkotlin/Function0;", "onComplete", "onCancel", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "launchJpMyNumberNfcScan", "launchActionFromHelpSheet", "launchSecondaryActionFromHelpSheet", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "onVerifyPersonaClick", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "autoSubmit", "onBack", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "onSuggestionSelected", "isLoading", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "onCreateReusablePersonaClick", "Ldr/o;", "helpBottomSheetViewModel", "shouldLaunchHelpBottomSheet", "onHelpBottomSheetDismissed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lzt/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldr/o;ZLkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "d", "c", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "Lzt/n;", "r", "()Lzt/n;", "g", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "h", "q", "i", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "j", "k", "m", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "p", "w", "Z", "B", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "t", "u", "v", "Ldr/o;", "()Ldr/o;", "z", "", "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "y", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends AbstractC4142c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<UiComponent> components;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final List<UiComponentConfig> componentConfigs;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final List<UiComponentErrorInfo> componentErrors;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            public final InterfaceC14057n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onComplete;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> launchNfcScan;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            @NotNull
            public final Function1<JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchActionFromHelpSheet;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchSecondaryActionFromHelpSheet;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            @NotNull
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            @Nullable
            public final AutoSubmit autoSubmit;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            @NotNull
            public final Function2<InputAddressComponent, String, Unit> onSuggestionSelected;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            public final boolean isLoading;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.UiStepStyle styles;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata */
            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> onCreateReusablePersonaClick;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata */
            @Nullable
            public final HelpBottomSheetViewModel helpBottomSheetViewModel;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            public final boolean shouldLaunchHelpBottomSheet;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onHelpBottomSheetDismissed;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$c$a$a, reason: collision with other inner class name and from toString */
            @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "component", "", "countdownText", "", "isReadyToSubmit", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class AutoSubmit {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final AutoSubmitableComponent component;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String countdownText;

                /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
                public final boolean isReadyToSubmit;

                public AutoSubmit(@NotNull AutoSubmitableComponent component, @Nullable String str, boolean z10) {
                    Intrinsics.checkNotNullParameter(component, "component");
                    this.component = component;
                    this.countdownText = str;
                    this.isReadyToSubmit = z10;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final AutoSubmitableComponent getComponent() {
                    return this.component;
                }

                @Nullable
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getCountdownText() {
                    return this.countdownText;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final boolean getIsReadyToSubmit() {
                    return this.isReadyToSubmit;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AutoSubmit)) {
                        return false;
                    }
                    AutoSubmit autoSubmit = (AutoSubmit) other;
                    return Intrinsics.m31980c(this.component, autoSubmit.component) && Intrinsics.m31980c(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
                }

                public int hashCode() {
                    int iHashCode = this.component.hashCode() * 31;
                    String str = this.countdownText;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isReadyToSubmit);
                }

                @NotNull
                public String toString() {
                    return "AutoSubmit(component=" + this.component + ", countdownText=" + this.countdownText + ", isReadyToSubmit=" + this.isReadyToSubmit + ")";
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> */
            /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
            /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: zt.n<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, ? super java.lang.Boolean, ? super java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.ui.network.ComponentParam>, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r29v0, resolved type: kotlin.jvm.functions.Function2<? super com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent, ? super java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.ui.network.ComponentParam>, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r32v0, resolved type: kotlin.jvm.functions.Function2<? super com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent, ? super java.lang.String, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlin.jvm.functions.Function2<? super com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent, ? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@NotNull List<? extends UiComponent> components, @Nullable List<? extends UiComponentConfig> list, @NotNull List<UiComponentErrorInfo> componentErrors, @NotNull NavigationState navigationState, @Nullable String str, @NotNull InterfaceC14057n<? super UiComponent, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> onClick, @NotNull Function0<Unit> onComplete, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan, @NotNull Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Function2<? super VerifyPersonaButtonComponent, ? super Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick, @Nullable AutoSubmit autoSubmit, @NotNull Function0<Unit> onBack, @NotNull Function2<? super InputAddressComponent, ? super String, Unit> onSuggestionSelected, boolean z10, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @NotNull Function2<? super CreatePersonaSheetComponent, ? super UiComponent, Unit> onCreateReusablePersonaClick, @Nullable HelpBottomSheetViewModel helpBottomSheetViewModel, boolean z11, @NotNull Function0<Unit> onHelpBottomSheetDismissed) {
                super(null);
                Intrinsics.checkNotNullParameter(components, "components");
                Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(launchNfcScan, "launchNfcScan");
                Intrinsics.checkNotNullParameter(launchJpMyNumberNfcScan, "launchJpMyNumberNfcScan");
                Intrinsics.checkNotNullParameter(onVerifyPersonaClick, "onVerifyPersonaClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onSuggestionSelected, "onSuggestionSelected");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                Intrinsics.checkNotNullParameter(onCreateReusablePersonaClick, "onCreateReusablePersonaClick");
                Intrinsics.checkNotNullParameter(onHelpBottomSheetDismissed, "onHelpBottomSheetDismissed");
                this.components = components;
                this.componentConfigs = list;
                this.componentErrors = componentErrors;
                this.navigationState = navigationState;
                this.navBarTitle = str;
                this.onClick = onClick;
                this.onComplete = onComplete;
                this.onCancel = onCancel;
                this.launchNfcScan = launchNfcScan;
                this.launchJpMyNumberNfcScan = launchJpMyNumberNfcScan;
                this.launchActionFromHelpSheet = function0;
                this.launchSecondaryActionFromHelpSheet = function1;
                this.onVerifyPersonaClick = onVerifyPersonaClick;
                this.autoSubmit = autoSubmit;
                this.onBack = onBack;
                this.onSuggestionSelected = onSuggestionSelected;
                this.isLoading = z10;
                this.styles = uiStepStyle;
                this.error = str2;
                this.onErrorDismissed = onErrorDismissed;
                this.onCreateReusablePersonaClick = onCreateReusablePersonaClick;
                this.helpBottomSheetViewModel = helpBottomSheetViewModel;
                this.shouldLaunchHelpBottomSheet = z11;
                this.onHelpBottomSheetDismissed = onHelpBottomSheetDismissed;
            }

            @Nullable
            /* JADX INFO: renamed from: A, reason: from getter */
            public final StepStyles.UiStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final Drawable m21184a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return C8244d.m33622a(uiStepStyle, context);
                }
                return null;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final AutoSubmit getAutoSubmit() {
                return this.autoSubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final Integer m21186c() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getBackgroundColorValue();
                }
                return null;
            }

            @Nullable
            /* JADX INFO: renamed from: d */
            public final List<UiComponentConfig> m21187d() {
                return this.componentConfigs;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final List<UiComponentErrorInfo> m21188e() {
                return this.componentErrors;
            }

            @NotNull
            /* JADX INFO: renamed from: f */
            public final List<UiComponent> m21189f() {
                return this.components;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @Nullable
            /* JADX INFO: renamed from: h */
            public final Integer m21191h() {
                AttributeStyles.HeaderButtonColorStyle headerButtonColor;
                StyleElements.SimpleElementColor headerButton;
                StyleElements.SimpleElementColorValue base;
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                    return null;
                }
                return base.getValue();
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final HelpBottomSheetViewModel getHelpBottomSheetViewModel() {
                return this.helpBottomSheetViewModel;
            }

            @Nullable
            /* JADX INFO: renamed from: j */
            public final Function0<Unit> m21193j() {
                return this.launchActionFromHelpSheet;
            }

            @NotNull
            /* JADX INFO: renamed from: k */
            public final Function1<JpMyNumberNfcScanComponent, Unit> m21194k() {
                return this.launchJpMyNumberNfcScan;
            }

            @NotNull
            /* JADX INFO: renamed from: l */
            public final Function1<GovernmentIdNfcScanComponent, Unit> m21195l() {
                return this.launchNfcScan;
            }

            @Nullable
            /* JADX INFO: renamed from: m */
            public final Function0<Unit> m21196m() {
                return this.launchSecondaryActionFromHelpSheet;
            }

            @Nullable
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: o, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: p */
            public final Function0<Unit> m21199p() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: q */
            public final Function0<Unit> m21200q() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: r */
            public final InterfaceC14057n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> m21201r() {
                return this.onClick;
            }

            @NotNull
            /* JADX INFO: renamed from: s */
            public final Function0<Unit> m21202s() {
                return this.onComplete;
            }

            @NotNull
            /* JADX INFO: renamed from: t */
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> m21203t() {
                return this.onCreateReusablePersonaClick;
            }

            @NotNull
            /* JADX INFO: renamed from: u */
            public final Function0<Unit> m21204u() {
                return this.onErrorDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: v */
            public final Function0<Unit> m21205v() {
                return this.onHelpBottomSheetDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: w */
            public final Function2<InputAddressComponent, String, Unit> m21206w() {
                return this.onSuggestionSelected;
            }

            @NotNull
            /* JADX INFO: renamed from: x */
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> m21207x() {
                return this.onVerifyPersonaClick;
            }

            @Nullable
            /* JADX INFO: renamed from: y */
            public final StyleElements.PositionType m21208y() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getPageLevelVerticalAlignment();
                }
                return null;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final boolean getShouldLaunchHelpBottomSheet() {
                return this.shouldLaunchHelpBottomSheet;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.UiWorkflow.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC4142c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC4142c() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C4143d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17631a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f17632b;

        static {
            int[] iArr = new int[EnumC11028j1.values().length];
            try {
                iArr[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11028j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11028j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17631a = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f17632b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4144e implements Function1<HelpBottomSheetComponent, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C4144e f17633a = new C4144e();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", m39664f = "UiWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C4145f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f17634t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, UiState, InterfaceC4141b, Object>.a f17635u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiWorkflow f17636v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ UiState f17637w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ButtonComponent f17638x;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.ui.UiWorkflow$Input, com.withpersona.sdk2.inquiry.ui.UiState, ? extends com.withpersona.sdk2.inquiry.ui.UiWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4145f(AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState uiState, ButtonComponent buttonComponent, InterfaceC9557b<? super C4145f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17635u = aVar;
            this.f17636v = uiWorkflow;
            this.f17637w = uiState;
            this.f17638x = buttonComponent;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.ui.UiState.Displaying.v(com.withpersona.sdk2.inquiry.ui.UiState$Displaying, java.util.List, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle, java.lang.String, com.withpersona.sdk2.inquiry.ui.UiState$Displaying$NfcScan, com.withpersona.sdk2.inquiry.ui.UiState$Displaying$JpMyNumberNfcScan, com.withpersona.sdk2.inquiry.ui.UiState$Displaying$AutoSubmit, com.withpersona.sdk2.inquiry.ui.UiState$PendingAction, boolean, boolean, java.util.Map, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, java.lang.String, boolean, int, java.lang.String, int, int, java.lang.Object):com.withpersona.sdk2.inquiry.ui.UiState$Displaying */
        /* JADX INFO: renamed from: r */
        public static final Unit m21215r(UiState uiState, ButtonComponent buttonComponent, AbstractC13225r.c cVar) {
            String strM32303N;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = buttonComponent.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = buttonComponent.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strM32303N = C7797x.m32303N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strM32303N = null;
            }
            cVar.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, iIntValue, strM32303N), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C4145f(this.f17635u, this.f17636v, this.f17637w, this.f17638x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f17634t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, UiState, ? extends InterfaceC4141b>> interfaceC13215hMo48837d = this.f17635u.mo48837d();
            UiWorkflow uiWorkflow = this.f17636v;
            final UiState uiState = this.f17637w;
            final ButtonComponent buttonComponent = this.f17638x;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.h6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.C4145f.m21215r(uiState, buttonComponent, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C4145f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", m39664f = "UiWorkflow.kt", m39665l = {188}, m39666m = "invokeSuspend")
    public static final class C4146g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f17639t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, UiState, InterfaceC4141b, Object>.a f17640u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiWorkflow f17641v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f17642w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ UiState f17643x;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.ui.UiWorkflow$Input, com.withpersona.sdk2.inquiry.ui.UiState, ? extends com.withpersona.sdk2.inquiry.ui.UiWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4146g(AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, InterfaceC9557b<? super C4146g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17640u = aVar;
            this.f17641v = uiWorkflow;
            this.f17642w = autoSubmit;
            this.f17643x = uiState;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m21217r(UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, AbstractC13225r.c cVar) {
            int countdown = autoSubmit.getCountdown() - 1;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            AutoSubmitableComponent component = autoSubmit.getComponent();
            String autoSubmitCountdownText = autoSubmit.getComponent().getAutoSubmitCountdownText();
            cVar.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? C7797x.m32303N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C4146g(this.f17640u, this.f17641v, this.f17642w, this.f17643x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17639t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f17639t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            InterfaceC13215h<AbstractC13225r<? super Input, UiState, ? extends InterfaceC4141b>> interfaceC13215hMo48837d = this.f17640u.mo48837d();
            UiWorkflow uiWorkflow = this.f17641v;
            final UiState.Displaying.AutoSubmit autoSubmit = this.f17642w;
            final UiState uiState = this.f17643x;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.i6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.C4146g.m21217r(autoSubmit, uiState, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C4146g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", m39664f = "UiWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C4147h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ UiState.Displaying.NfcScan f17644A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ UiState.Displaying f17645B;

        /* JADX INFO: renamed from: t */
        public int f17646t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, UiState, InterfaceC4141b, Object>.a f17647u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiWorkflow f17648v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f17649w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f17650x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Date f17651y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Date f17652z;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.ui.UiWorkflow$Input, com.withpersona.sdk2.inquiry.ui.UiState, ? extends com.withpersona.sdk2.inquiry.ui.UiWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4147h(AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, InterfaceC9557b<? super C4147h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17647u = aVar;
            this.f17648v = uiWorkflow;
            this.f17649w = attributes;
            this.f17650x = str;
            this.f17651y = date;
            this.f17652z = date2;
            this.f17644A = nfcScan;
            this.f17645B = displaying;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m21219r(GovernmentIdNfcScan.Attributes attributes, UiWorkflow uiWorkflow, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, AbstractC13225r.c cVar) {
            String string;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = uiWorkflow.applicationContext.getString(C12244g.f43221F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.m32182p0(str)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (date == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (date2 == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            cVar.m48903e(UiState.Displaying.m20990v(displaying, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C4147h(this.f17647u, this.f17648v, this.f17649w, this.f17650x, this.f17651y, this.f17652z, this.f17644A, this.f17645B, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f17646t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, UiState, ? extends InterfaceC4141b>> interfaceC13215hMo48837d = this.f17647u.mo48837d();
            final UiWorkflow uiWorkflow = this.f17648v;
            final GovernmentIdNfcScan.Attributes attributes = this.f17649w;
            final String str = this.f17650x;
            final Date date = this.f17651y;
            final Date date2 = this.f17652z;
            final UiState.Displaying.NfcScan nfcScan = this.f17644A;
            final UiState.Displaying displaying = this.f17645B;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.j6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.C4147h.m21219r(attributes, uiWorkflow, str, date, date2, nfcScan, displaying, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C4147h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public UiWorkflow(@NotNull Context applicationContext, @NotNull C3828b.a nfcScanWorkerFactory, @NotNull C8232n.a scanJpMyNumberNfcWorkerFactory, @NotNull C12504c sandboxFlags, @NotNull C4151d.a createReusablePersonaWorkerFactory, @NotNull C4158k.a verifyReusablePersonaWorkerFactory, @NotNull C11930a navigationStateManager, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull C4148a componentWorkHelper, @NotNull C10309c externalEventLogger, @NotNull C6159e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(scanJpMyNumberNfcWorkerFactory, "scanJpMyNumberNfcWorkerFactory");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.scanJpMyNumberNfcWorkerFactory = scanJpMyNumberNfcWorkerFactory;
        this.sandboxFlags = sandboxFlags;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: A1 */
    public static final boolean m21029A1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    /* JADX INFO: renamed from: B1 */
    public static final Unit m21031B1(UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m21034D1(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InterfaceC4248h2) {
            ((InterfaceC4248h2) it).mo20533b(z10 ? Intrinsics.m31980c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m21037F0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m21040H0(UiWorkflow uiWorkflow, Input input, UiState uiState, AbstractC13218k.a aVar, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.componentWorkHelper.m21347n0(input, (UiState.Displaying) uiState, aVar, component);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m21042I0(UiWorkflow uiWorkflow, UiState uiState, AbstractC13218k.a aVar) {
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21044J0((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m21044J0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.m48902d(InterfaceC4141b.c.f17597a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m21046K0(UiWorkflow uiWorkflow, UiState uiState, AbstractC13218k.a aVar, final Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.v4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21048L0(input, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m21048L0(Input input, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.m48902d(input.getFinalStep() ? InterfaceC4141b.c.f17597a : InterfaceC4141b.b.f17596a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m21050M0(UiWorkflow uiWorkflow, UiState uiState, AbstractC13218k.a aVar, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.m21153q0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m21052N0(UiWorkflow uiWorkflow, UiState uiState, AbstractC13218k.a aVar, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.m21151n0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m21054O0(HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, UiState uiState, AbstractC13218k.a aVar) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            uiWorkflow.m21153q0((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState, aVar);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m21056P0(final HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, final UiState uiState, AbstractC13218k.a aVar) {
        GovernmentIdNfcScan.Attributes attributes;
        String unableToScanTransitionComponentName;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent) && (attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes()) != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.m32182p0(unableToScanTransitionComponentName))) {
            uiWorkflow.m21146C1(helpBottomSheetComponent, true, (UiState.Displaying) uiState);
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21058Q0(uiState, helpBottomSheetComponent, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m21058Q0(UiState uiState, HelpBottomSheetComponent helpBottomSheetComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        GovernmentIdNfcScan.Attributes attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes();
        action.m48903e(C4149b.m21349b(displaying, attributes != null ? attributes.getUnableToScanTransitionComponentName() : null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m21060R0(UiWorkflow uiWorkflow, final UiState uiState, AbstractC13218k.a aVar, final VerifyPersonaButtonComponent component, final Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        uiWorkflow.m21146C1(component, true, (UiState.Displaying) uiState);
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21062S0(uiState, component, componentParams, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m21062S0(UiState uiState, VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map map, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent, map), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final boolean m21064T0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m21066U0(AbstractC13218k.a aVar, UiWorkflow uiWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21068V0((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Unit m21068V0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(InterfaceC4141b.a.f17595a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m21070W0(AbstractC13218k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final InputAddressComponent component, final String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21072X0(uiState, component, addressId, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final Unit m21072X0(UiState uiState, InputAddressComponent inputAddressComponent, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.m20628V(str).m20625S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m21074Y0(AbstractC13218k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21076Z0(uiState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m21076Z0(UiState uiState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m21078a1(AbstractC13218k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final CreatePersonaSheetComponent createReusablePersonaComponent, final UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21080b1(uiState, createReusablePersonaComponent, buttonClicked, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m21080b1(UiState uiState, CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
        if (buttonComponent != null) {
            buttonComponent.mo20533b(true);
        }
        Unit unit = Unit.f29331a;
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(components, createPersonaSheetComponent, C4263k.m21790b(createPersonaSheetComponent, uiComponent, uiComponent)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m21082c1(AbstractC13218k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.d5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21084d1(uiState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m21084d1(UiState uiState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e1 */
    public static final AbstractC13225r m21086e1(final UiWorkflow uiWorkflow, final AbstractC13218k.a aVar, final boolean z10, final UiState uiState, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21088f1(it, aVar, uiWorkflow, z10, uiState, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m21088f1(PermissionRequestWorkflow.Output output, AbstractC13218k.a aVar, final UiWorkflow uiWorkflow, boolean z10, final UiState uiState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = C4143d.f17631a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.f5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21090g1(this.f35803a, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new C7345l();
            }
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.i5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21099j1(uiState, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else if (z10) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.g5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21093h1(this.f35825a, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21096i1(uiState, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m21090g1(UiWorkflow uiWorkflow, AbstractC13225r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objM48901c = a10.m48901c();
        UiState.Displaying displaying = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        uiWorkflow.m21147D0(a10, displaying);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m21093h1(UiWorkflow uiWorkflow, AbstractC13225r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objM48901c = a10.m48901c();
        UiState.Displaying displaying = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        uiWorkflow.m21147D0(a10, displaying);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m21096i1(UiState uiState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, String.valueOf(Integer.parseInt(displaying.getRequestPermissionKey()) + 1), false, 0, null, 0, 252927, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Unit m21099j1(UiState uiState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m21102k1(final UiWorkflow uiWorkflow, final UiState uiState, Input input, AbstractC13218k.a aVar, final UiComponent uiComponent, boolean z10, final Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeM38753a = C9859b4.m38753a(uiComponent);
        if (uiStepButtonTypeM38753a != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, uiStepButtonTypeM38753a, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        uiWorkflow.m21146C1(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.NONE || displaying.getHasRequestedGpsPermissions()) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.x4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21108m1(componentParams, uiComponent, uiWorkflow, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.mo48837d().mo17905a(C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21105l1(uiState, componentParams, uiComponent, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m21105l1(UiState uiState, Map map, UiComponent uiComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, true, map, uiComponent, null, false, 0, null, 0, 254847, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m21108m1(Map map, UiComponent uiComponent, UiWorkflow uiWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        UiState.Displaying displayingM20990v = UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, map, uiComponent, null, false, 0, null, 0, 255871, null);
        action.m48903e(displayingM20990v);
        uiWorkflow.m21147D0(action, displayingM20990v);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m21111o0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, AbstractC13225r.c action) {
        String enableNfcPrompt;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = jpMyNumberNfcScanComponent.getName();
        JpMyNumberNfcScan.Attributes attributes = jpMyNumberNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = "";
        }
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o1 */
    public static final AbstractC13225r m21112o1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, final GovernmentIdNfcScanComponent governmentIdNfcScanComponent, final PassportNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.m31980c(output, PassportNfcReaderOutput.Cancel.f15691a)) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.k5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21115p1(displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Error) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.l5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21117q1(nfcScan, governmentIdNfcScanComponent, displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Success) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.m5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21120r1(output, displaying, nfcScan, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.n5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21125t1(displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.ReenterDetails) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.o5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21128u1(displaying, output, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m21114p0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, C7699p.m31892k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(jpMyNumberNfcScanComponent), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m21115p1(UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m21117q1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, AbstractC13225r.c action) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = nfcScan.getComponent().getName();
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
            scanDocumentError = "";
        }
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m21119r0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, null, false, false, null, null, null, false, 0, null, 0, 245727, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m21120r1(PassportNfcReaderOutput passportNfcReaderOutput, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying2 = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying2 == null) {
            return Unit.f29331a;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: or.a6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.m21122s1(nfcScan, (GovernmentIdNfcScanComponent) obj));
            }
        });
        if (governmentIdNfcScanComponent == null) {
            return Unit.f29331a;
        }
        PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) passportNfcReaderOutput;
        governmentIdNfcScanComponent.getNfcDataController().m24136c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
        action.m48903e(C4149b.m21349b(displaying, success.getSubmitButtonComponentName()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s1 */
    public static final boolean m21122s1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), nfcScan.getComponent().getName());
    }

    /* JADX INFO: renamed from: t0 */
    public static final AbstractC13225r m21124t0(final UiState.PendingAction pendingAction, final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final C4151d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((UiState.PendingAction.CreateReusablePersona) pendingAction).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.w5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21127u0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.m31980c(it, C4151d.b.a.f17671a)) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.x5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21130v0(displaying, pendingAction, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C4151d.b.Error) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.y5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21132w0(it, displaying, uiWorkflow, pendingAction, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m21125t1(UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m21127u0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(InterfaceC4141b.c.f17597a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m21128u1(UiState.Displaying displaying, PassportNfcReaderOutput passportNfcReaderOutput, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(C4149b.m21349b(displaying, ((PassportNfcReaderOutput.ReenterDetails) passportNfcReaderOutput).getButtonComponentName()));
        return Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent.f(com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet$CardCtaPage, java.lang.String, boolean, boolean, boolean, boolean, com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, long, int, java.lang.Object):com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m21130v0(UiState.Displaying displaying, UiState.PendingAction pendingAction, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.m20557f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m21132w0(C4151d.b bVar, UiState.Displaying displaying, UiWorkflow uiWorkflow, UiState.PendingAction pendingAction, AbstractC13225r.c action) {
        UiState.Displaying displayingM20990v;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((C4151d.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            displayingM20990v = UiState.Displaying.m20990v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(C12244g.f43217B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null);
        } else {
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            displayingM20990v = UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.m20557f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null);
        }
        action.m48903e(displayingM20990v);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w1 */
    public static final AbstractC13225r m21133w1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, final JpMyNumberNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.p5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21136x1(output, displaying, jpMyNumberNfcScanComponent, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21142z1(output, displaying, jpMyNumberNfcScanComponent, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.m31980c(output, JpMyNumberNfcReaderOutput.Cancel.f15627a)) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.r5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21031B1(displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: x0 */
    public static final AbstractC13225r m21135x0(final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final C4158k.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C4158k.b.a.f17755a)) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.s5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21138y0(displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C4158k.b.Error) {
            return C13233z.m48946d(uiWorkflow, null, new Function1() { // from class: or.t5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21141z0(it, uiWorkflow, displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m21136x1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, AbstractC13225r.c action) {
        C5201j c5201jM20804j;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying2 = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying2 == null) {
            return Unit.f29331a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: or.b6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.m21139y1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (c5201jM20804j = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            c5201jM20804j.m24139c(((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getResult());
        }
        action.m48903e(C4149b.m21349b(displaying, ((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getTransitionComponentName()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m21138y0(UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        action.m48902d(new InterfaceC4141b.FinishedWithTransition(true));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y1 */
    public static final boolean m21139y1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m21141z0(C4158k.b bVar, UiWorkflow uiWorkflow, UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((C4158k.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.m20990v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(C12244g.f43217B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m21142z1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, AbstractC13225r.c action) {
        C5201j c5201jM20804j;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        UiState.Displaying displaying2 = objM48901c instanceof UiState.Displaying ? (UiState.Displaying) objM48901c : null;
        if (displaying2 == null) {
            return Unit.f29331a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: or.z5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.m21029A1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (c5201jM20804j = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            c5201jM20804j.m24139c(((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getResult());
        }
        String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getTransitionComponentName();
        action.m48903e((transitionComponentName == null || transitionComponentName.length() == 0) ? UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null) : C4149b.m21349b(displaying, transitionComponentName));
        return Unit.f29331a;
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public UiState mo16430d(@NotNull Input props, @Nullable Snapshot snapshot) {
        List<UiComponent> listM31892k;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            C12930h c12930hM48870b = snapshot.m48870b();
            Parcelable parcelable = null;
            if (c12930hM48870b.m48089I() <= 0) {
                c12930hM48870b = null;
            }
            if (c12930hM48870b != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrMo48094O = c12930hM48870b.mo48094O();
                parcelObtain.unmarshall(bArrMo48094O, 0, bArrMo48094O.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listM31892k = C4086b.m20892i(components)) == null) {
            listM31892k = C7699p.m31892k();
        }
        if (!this.featureFlagManager.m27145a(C6174t.f23549a)) {
            listM31892k = C4149b.m21351d(listM31892k);
        }
        List<UiComponent> list = listM31892k;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> listM21168s = props.m21168s();
        if (listM21168s == null) {
            listM21168s = C7699p.m31892k();
        }
        return new UiState.Displaying(list, stepName, listM21168s, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m21144B0(JpMyNumberNfcScanComponent component) {
        List<String> listM33577d;
        if (!this.sandboxFlags.m46822c()) {
            return !C8228j.f30508a.m33573c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zM31980c = attributes != null ? Intrinsics.m31980c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationM20805k = component.getValidOperation();
        return !zM31980c && C8231m.f30517a.m33579a((jpMyNumberNfcValidOperationM20805k == null || (listM33577d = jpMyNumberNfcValidOperationM20805k.m33577d()) == null) ? null : (String) CollectionsKt.firstOrNull(listM33577d));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m21145C0(Input renderProps, UiState renderState) {
        AbstractC10315i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new C7345l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new AbstractC10315i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new C7345l();
                }
                dVar = new AbstractC10315i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new AbstractC10315i.d(renderProps.getStepName()) : new AbstractC10315i.f(renderProps.getStepName());
        }
        String str = dVar.getStepName() + ":" + dVar;
        if (Intrinsics.m31980c(str, this.lastLoggedPage)) {
            return;
        }
        this.lastLoggedPage = str;
        this.externalEventLogger.m39607c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m21146C1(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        m21148E0(renderState.getComponents(), new Function1() { // from class: or.v5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21034D1(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final void m21147D0(AbstractC13225r<? super Input, UiState, ? extends InterfaceC4141b>.c cVar, UiState.Displaying displaying) {
        UiComponent triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> mapM21007z = displaying.m21007z();
        if (triggeringComponent == null || mapM21007z == null) {
            return;
        }
        cVar.m48902d(new InterfaceC4141b.FinishedWithoutTransition(triggeringComponent, mapM21007z, displaying.getStepName()));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m21148E0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                m21148E0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: or.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UiWorkflow.m21037F0(function1, (UiComponent) obj);
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull final Input renderProps, @NotNull final UiState renderState, @NotNull final AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context) {
        final UiWorkflow uiWorkflow;
        final UiState uiState;
        AbstractC4142c.a.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (renderProps.getIsRestoringState()) {
            return Unit.f29331a;
        }
        m21145C0(renderProps, renderState);
        if (!(renderState instanceof UiState.Displaying)) {
            throw new C7345l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        m21154s0(renderProps, displaying, context);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(HelpBottomSheetComponent.class), C4144e.f17633a);
        boolean z10 = helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled();
        this.navigationStateManager.m44529c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting(), z10);
        m21148E0(displaying.getComponents(), new Function1() { // from class: or.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21040H0(this.f35736a, renderProps, renderState, context, (UiComponent) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            m21152n1(renderProps, displaying, context, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            m21155v1(renderProps, displaying, context, displaying.getJpMyNumberNfcScan());
        }
        EnumC11024i0 enumC11024i0 = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.ROUGH ? EnumC11024i0.RoughLocation : EnumC11024i0.PreciseLocation;
        final boolean z11 = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.OPTIONAL;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(C12244g.f43217B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(ButtonComponent.class), new Function1() { // from class: or.e6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(UiWorkflow.m21064T0((ButtonComponent) obj));
                }
            });
            if (buttonComponent != null) {
                context.mo48835b("begin_countdown", new C4145f(context, this, renderState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 == null || autoSubmit2.getCountdown() < 1) {
            uiWorkflow = this;
            uiState = renderState;
        } else {
            String str2 = "countdown_" + autoSubmit2.getCountdown();
            C4146g c4146g = new C4146g(context, this, autoSubmit2, renderState, null);
            uiWorkflow = this;
            uiState = renderState;
            context.mo48835b(str2, c4146g);
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = renderProps.getComponents();
        List<UiComponentErrorInfo> listM21006x = displaying.m21006x();
        List<UiComponentErrorInfo> listM21168s = renderProps.m21168s();
        if (listM21168s == null) {
            listM21168s = C7699p.m31892k();
        }
        List listW0 = CollectionsKt.m31725w0(listM21006x, listM21168s);
        NavigationState navigationStateM44528b = uiWorkflow.navigationStateManager.m44528b();
        String navBarTitle = renderProps.getNavBarTitle();
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new AbstractC4142c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        AbstractC4142c.a aVar = new AbstractC4142c.a(components, components2, listW0, navigationStateM44528b, navBarTitle, new InterfaceC14057n() { // from class: or.f6
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UiWorkflow.m21102k1(this.f35804a, uiState, renderProps, context, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: or.g6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21042I0(this.f35826a, uiState, context);
            }
        }, new Function0() { // from class: or.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21046K0(this.f35755a, uiState, context, renderProps);
            }
        }, new Function1() { // from class: or.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21050M0(this.f35779a, uiState, context, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: or.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21052N0(this.f35800a, uiState, context, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: or.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21054O0(helpBottomSheetComponent, uiWorkflow, uiState, context);
            }
        }, new Function0() { // from class: or.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21056P0(helpBottomSheetComponent, uiWorkflow, uiState, context);
            }
        }, new Function2() { // from class: or.i4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.m21060R0(this.f35861a, uiState, context, (VerifyPersonaButtonComponent) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: or.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21066U0(context, uiWorkflow);
            }
        }, new Function2() { // from class: or.y4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.m21070W0(context, uiWorkflow, uiState, (InputAddressComponent) obj, (String) obj2);
            }
        }, displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new Function0() { // from class: or.j5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21074Y0(context, uiWorkflow, uiState);
            }
        }, new Function2() { // from class: or.u5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.m21078a1(context, uiWorkflow, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            }
        }, helpBottomSheetComponent != null ? HelpBottomSheetComponent.m20603x2(helpBottomSheetComponent, 0, 1, null) : null, z10 && displaying.getShowHelpBottomSheet(), new Function0() { // from class: or.c6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.m21082c1(context, uiWorkflow, uiState);
            }
        });
        boolean isRequestingGpsPermissions = displaying.getIsRequestingGpsPermissions();
        String gpsPermissionsTitle = renderProps.getGpsPermissionsTitle();
        if (gpsPermissionsTitle == null) {
            gpsPermissionsTitle = "";
        }
        String gpsPermissionsRationale = renderProps.getGpsPermissionsRationale();
        if (gpsPermissionsRationale == null) {
            gpsPermissionsRationale = "Gps permission are required to verify your identity";
        }
        Context context2 = uiWorkflow.applicationContext;
        String string = context2.getString(C12244g.f43247c0, C7259g.m30268b(context2));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = uiWorkflow.applicationContext.getString(C12244g.f43219D);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = uiWorkflow.applicationContext.getString(C12244g.f43219D);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        return C3858g.m19166d(aVar, context, isRequestingGpsPermissions, enumC11024i0, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getGpsPermissionsModalNegativeButton(), uiWorkflow.permissionRequestWorkflow, renderProps.getStyles(), displaying.getRequestPermissionKey(), new Function1() { // from class: or.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21086e1(this.f35760a, context, z11, uiState, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m21151n0(final JpMyNumberNfcScanComponent component, final UiState.Displaying renderState, AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context) {
        if (component.getValidOperation() == null) {
            return;
        }
        if (m21144B0(component)) {
            context.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: or.q4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21111o0(renderState, component, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            m21146C1(component, true, renderState);
            context.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: or.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21114p0(renderState, component, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0141 A[PHI: r13
      0x0141: PHI (r13v8 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String) binds: [B:95:0x014c, B:89:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n1 */
    public final void m21152n1(Input renderProps, final UiState.Displaying renderState, AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends EnumC10688b> listM31895n;
        String scanDocumentError;
        String str;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        EnumC10688b enumC10688b;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strMo1450b = component.getCardAccessNumberController().mo1450b();
        String strMo1450b2 = component.getDocumentNumberController().mo1450b();
        Date dateM24117b = component.getDateOfBirthController().m24117b();
        Date dateM24117b2 = component.getExpirationDateController().m24117b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.m32182p0(strMo1450b2) || dateM24117b == null || dateM24117b2 == null) {
            context.mo48835b("client_side_nfc_form_validation", new C4147h(context, this, attributes, strMo1450b2, dateM24117b, dateM24117b2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strMo1450b2, dateM24117b2, dateM24117b);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listM31895n = C7699p.m31895n(EnumC10688b.Dg1, EnumC10688b.Dg2, EnumC10688b.Sod);
        } else {
            listM31895n = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = C4143d.f17632b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    enumC10688b = EnumC10688b.Dg1;
                } else if (i10 == 2) {
                    enumC10688b = EnumC10688b.Dg2;
                } else if (i10 != 3) {
                    enumC10688b = i10 != 4 ? null : EnumC10688b.Sod;
                } else {
                    enumC10688b = EnumC10688b.Dg14;
                }
                if (enumC10688b != null) {
                    listM31895n.add(enumC10688b);
                }
            }
        }
        C3828b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        Context context2 = this.applicationContext;
        int i11 = C12244g.f43218C;
        String string = context2.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(C12244g.f43219D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                str = "";
            } else {
                str = scanDocumentError;
            }
        } else {
            str = scanDocumentError;
        }
        Context context3 = this.applicationContext;
        int i12 = C12244g.f43221F;
        String string4 = context3.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
        String string6 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        C13230w.m48937l(context, aVar.mo18997a(strMo1450b, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), listM31895n, renderProps.getStyles(), null, component.getConfig().getStyles()), C7731d0.m32011k(C3828b.class), "", new Function1() { // from class: or.z4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21112o1(this.f36157a, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m21153q0(final GovernmentIdNfcScanComponent component, final UiState.Displaying renderState, AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context) {
        m21146C1(component, true, renderState);
        context.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: or.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21119r0(component, renderState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m21154s0(Input renderProps, final UiState.Displaying renderState, AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            C4151d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C13230w.m48937l(context, aVar.mo21362a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), C7731d0.m32011k(C4151d.class), "", new Function1() { // from class: or.m4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m21124t0(pendingAction, this, renderState, (C4151d.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new C7345l();
            }
            return;
        }
        C4158k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C13230w.m48937l(context, aVar2.mo21521a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.m21024a()), C7731d0.m32011k(C4158k.class), "", new Function1() { // from class: or.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21135x0(this.f35961a, renderState, (C4158k.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public final void m21155v1(Input renderProps, final UiState.Displaying renderState, AbstractC13218k<? super Input, UiState, ? extends InterfaceC4141b, ? extends Object>.a context, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationM20805k = component.getValidOperation();
        if (jpMyNumberNfcValidOperationM20805k == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        C13230w.m48937l(context, this.scanJpMyNumberNfcWorkerFactory.mo33591a(jpMyNumberNfcValidOperationM20805k, JpMyNumberNfcStrings.INSTANCE.m18927a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), C7731d0.m32011k(C8232n.class), "", new Function1() { // from class: or.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.m21133w1(this.f35782a, renderState, component, (JpMyNumberNfcReaderOutput) obj);
            }
        });
    }
}
