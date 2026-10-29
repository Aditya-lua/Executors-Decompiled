package com.withpersona.sdk2.inquiry.ui;

import an.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import cr.h2;
import dr.HelpBottomSheetViewModel;
import go.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ku.p0;
import ku.z0;
import lp.JpMyNumberNfcValidOperation;
import lp.n;
import or.b4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import rp.i0;
import rp.j1;
import ym.Snapshot;
import ym.r;
import ym.w;
import ym.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 p2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004TqVXBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020$*\u00180 R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)JK\u0010.\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/JC\u00100\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020$*\b\u0012\u0004\u0012\u000203022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020$04H\u0002¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020$2\u0006\u00108\u001a\u0002032\u0006\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b;\u0010<JC\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\u00020$2\u0006\u0010>\u001a\u00020A2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002092\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJK\u0010H\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00032\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020K2\u0006\u0010Q\u001a\u00020\u0003H\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Llp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lwp/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/a;", "componentWorkHelper", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Llp/n$a;Lwp/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Luq/a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/ui/a;Lpq/c;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "", "D0", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "renderProps", "C0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lym/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "n1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "E0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "C1", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "q0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "n0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;)V", "B0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "v1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "Lym/i;", "snapshot", "A0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "G0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)Ljava/lang/Object;", "state", "E1", "(Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "c", "Llp/n$a;", "d", "Lwp/c;", "e", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "f", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "g", "Luq/a;", "h", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "i", "Lcom/withpersona/sdk2/inquiry/ui/a;", "j", "Lpq/c;", "k", "Lgo/e;", "l", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "m", "Ljava/lang/String;", "lastLoggedPage", "n", "Input", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UiWorkflow extends ym.k<Input, UiState, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.nfc.b.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wp.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.d.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a componentWorkHelper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String lastLoggedPage;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010+R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b1\u0010>R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bI\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bE\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bP\u00109R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\bV\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bQ\u0010+¨\u0006W"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "isRestoringState", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "y", "b", "p", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "d", "t", "e", "Z", "()Z", "f", "g", "h", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "i", "o", "j", "n", "k", "getGpsPermissionsModalPositiveButton", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "s", "r", "w", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "u", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "v", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentConfig> components;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean finalStep;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsRationale;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalPositiveButton;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentErrorInfo> serverComponentErrors;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSubmitting;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isRestoringState;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String navBarTitle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
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

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

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
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.components, input.components) && Intrinsics.c(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.c(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.c(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.c(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.c(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.c(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.c(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.c(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.c(this.transitionError, input.transitionError) && this.isRestoringState == input.isRestoringState && Intrinsics.c(this.navBarTitle, input.navBarTitle);
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
        public final List<UiComponentErrorInfo> s() {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "b", "f", "e", "d", "c", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f13770a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0250b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0250b f13771a = new C0250b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0250b);
            }

            public int hashCode() {
                return -650975523;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f13772a = new c();

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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "message", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "canReuseWorkflow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FinishedWithTransition implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FinishedWithoutTransition implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UiComponent fromComponent;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, ComponentParam> componentParams;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String fromStep;

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
            public final Map<String, ComponentParam> a() {
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
                return Intrinsics.c(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.c(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.c(this.fromStep, finishedWithoutTransition.fromStep);
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "<init>", "()V", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015B\u0099\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012$\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR;\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bQ\u0010JR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bS\u0010JR5\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\b:\u0010XR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b?\u0010H\u001a\u0004\bY\u0010JR)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bE\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bG\u0010CR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010JR)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\ba\u0010VR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bM\u0010eR\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bf\u0010]R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bc\u0010JR\u0013\u0010i\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\b<\u0010hR\u0013\u0010j\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bK\u0010hR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "navBarTitle", "Lkotlin/Function3;", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "onClick", "Lkotlin/Function0;", "onComplete", "onCancel", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "launchJpMyNumberNfcScan", "launchActionFromHelpSheet", "launchSecondaryActionFromHelpSheet", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "onVerifyPersonaClick", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "autoSubmit", "onBack", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "onSuggestionSelected", "isLoading", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "onCreateReusablePersonaClick", "Ldr/o;", "helpBottomSheetViewModel", "shouldLaunchHelpBottomSheet", "onHelpBottomSheetDismissed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lzt/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldr/o;ZLkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "d", "c", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "Lzt/n;", "r", "()Lzt/n;", "g", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "h", "q", "i", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "j", "k", "m", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "p", "w", "Z", "B", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "t", "u", "v", "Ldr/o;", "()Ldr/o;", "z", "", "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "y", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponent> components;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final List<UiComponentConfig> componentConfigs;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponentErrorInfo> componentErrors;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final zt.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onComplete;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> launchNfcScan;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchActionFromHelpSheet;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchSecondaryActionFromHelpSheet;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final AutoSubmit autoSubmit;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<InputAddressComponent, String, Unit> onSuggestionSelected;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final boolean isLoading;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.UiStepStyle styles;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> onCreateReusablePersonaClick;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final HelpBottomSheetViewModel helpBottomSheetViewModel;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            public final boolean shouldLaunchHelpBottomSheet;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onHelpBottomSheetDismissed;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$c$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "component", "", "countdownText", "", "isReadyToSubmit", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AutoSubmit {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final AutoSubmitableComponent component;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String countdownText;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
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
                    return Intrinsics.c(this.component, autoSubmit.component) && Intrinsics.c(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@NotNull List<? extends UiComponent> components, @Nullable List<? extends UiComponentConfig> list, @NotNull List<UiComponentErrorInfo> componentErrors, @NotNull NavigationState navigationState, @Nullable String str, @NotNull zt.n<? super UiComponent, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> onClick, @NotNull Function0<Unit> onComplete, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan, @NotNull Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Function2<? super VerifyPersonaButtonComponent, ? super Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick, @Nullable AutoSubmit autoSubmit, @NotNull Function0<Unit> onBack, @NotNull Function2<? super InputAddressComponent, ? super String, Unit> onSuggestionSelected, boolean z10, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @NotNull Function2<? super CreatePersonaSheetComponent, ? super UiComponent, Unit> onCreateReusablePersonaClick, @Nullable HelpBottomSheetViewModel helpBottomSheetViewModel, boolean z11, @NotNull Function0<Unit> onHelpBottomSheetDismissed) {
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
            public final Drawable a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return lr.d.a(uiStepStyle, context);
                }
                return null;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final AutoSubmit getAutoSubmit() {
                return this.autoSubmit;
            }

            @Nullable
            public final Integer c() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getBackgroundColorValue();
                }
                return null;
            }

            @Nullable
            public final List<UiComponentConfig> d() {
                return this.componentConfigs;
            }

            @NotNull
            public final List<UiComponentErrorInfo> e() {
                return this.componentErrors;
            }

            @NotNull
            public final List<UiComponent> f() {
                return this.components;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @Nullable
            public final Integer h() {
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
            public final Function0<Unit> j() {
                return this.launchActionFromHelpSheet;
            }

            @NotNull
            public final Function1<JpMyNumberNfcScanComponent, Unit> k() {
                return this.launchJpMyNumberNfcScan;
            }

            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> l() {
                return this.launchNfcScan;
            }

            @Nullable
            public final Function0<Unit> m() {
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
            public final Function0<Unit> p() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> q() {
                return this.onCancel;
            }

            @NotNull
            public final zt.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> r() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> s() {
                return this.onComplete;
            }

            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> t() {
                return this.onCreateReusablePersonaClick;
            }

            @NotNull
            public final Function0<Unit> u() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function0<Unit> v() {
                return this.onHelpBottomSheetDismissed;
            }

            @NotNull
            public final Function2<InputAddressComponent, String, Unit> w() {
                return this.onSuggestionSelected;
            }

            @NotNull
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> x() {
                return this.onVerifyPersonaClick;
            }

            @Nullable
            public final StyleElements.PositionType y() {
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

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13802a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13802a = iArr;
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
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function1<HelpBottomSheetComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f13803a = new e();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13804t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, UiState, b, Object>.a f13805u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13806v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState f13807w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ButtonComponent f13808x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ym.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState uiState, ButtonComponent buttonComponent, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f13805u = aVar;
            this.f13806v = uiWorkflow;
            this.f13807w = uiState;
            this.f13808x = buttonComponent;
        }

        public static final Unit r(UiState uiState, ButtonComponent buttonComponent, r.c cVar) {
            String strN;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = buttonComponent.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = buttonComponent.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strN = x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strN = null;
            }
            cVar.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, iIntValue, strN), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.f13805u, this.f13806v, this.f13807w, this.f13808x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f13804t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            ym.h<r<? super Input, UiState, ? extends b>> hVarD = this.f13805u.d();
            UiWorkflow uiWorkflow = this.f13806v;
            final UiState uiState = this.f13807w;
            final ButtonComponent buttonComponent = this.f13808x;
            hVarD.a(z.d(uiWorkflow, null, new Function1() { // from class: or.h6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.f.r(uiState, buttonComponent, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", f = "UiWorkflow.kt", l = {188}, m = "invokeSuspend")
    public static final class g extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13809t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, UiState, b, Object>.a f13810u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13811v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f13812w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ UiState f13813x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ym.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f13810u = aVar;
            this.f13811v = uiWorkflow;
            this.f13812w = autoSubmit;
            this.f13813x = uiState;
        }

        public static final Unit r(UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, r.c cVar) {
            int countdown = autoSubmit.getCountdown() - 1;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            AutoSubmitableComponent component = autoSubmit.getComponent();
            String autoSubmitCountdownText = autoSubmit.getComponent().getAutoSubmitCountdownText();
            cVar.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new g(this.f13810u, this.f13811v, this.f13812w, this.f13813x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f13809t;
            if (i10 == 0) {
                o.b(obj);
                this.f13809t = 1;
                if (z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            ym.h<r<? super Input, UiState, ? extends b>> hVarD = this.f13810u.d();
            UiWorkflow uiWorkflow = this.f13811v;
            final UiState.Displaying.AutoSubmit autoSubmit = this.f13812w;
            final UiState uiState = this.f13813x;
            hVarD.a(z.d(uiWorkflow, null, new Function1() { // from class: or.i6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.g.r(autoSubmit, uiState, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ UiState.Displaying.NfcScan A;
        public final /* synthetic */ UiState.Displaying B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13814t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, UiState, b, Object>.a f13815u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13816v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f13817w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13818x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f13819y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Date f13820z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(ym.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f13815u = aVar;
            this.f13816v = uiWorkflow;
            this.f13817w = attributes;
            this.f13818x = str;
            this.f13819y = date;
            this.f13820z = date2;
            this.A = nfcScan;
            this.B = displaying;
        }

        public static final Unit r(GovernmentIdNfcScan.Attributes attributes, UiWorkflow uiWorkflow, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, r.c cVar) {
            String string;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = uiWorkflow.applicationContext.getString(vp.g.F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.p0(str)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (date == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (date2 == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            cVar.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new h(this.f13815u, this.f13816v, this.f13817w, this.f13818x, this.f13819y, this.f13820z, this.A, this.B, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f13814t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            ym.h<r<? super Input, UiState, ? extends b>> hVarD = this.f13815u.d();
            final UiWorkflow uiWorkflow = this.f13816v;
            final GovernmentIdNfcScan.Attributes attributes = this.f13817w;
            final String str = this.f13818x;
            final Date date = this.f13819y;
            final Date date2 = this.f13820z;
            final UiState.Displaying.NfcScan nfcScan = this.A;
            final UiState.Displaying displaying = this.B;
            hVarD.a(z.d(uiWorkflow, null, new Function1() { // from class: or.j6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.h.r(attributes, uiWorkflow, str, date, date2, nfcScan, displaying, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public UiWorkflow(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.nfc.b.a nfcScanWorkerFactory, @NotNull n.a scanJpMyNumberNfcWorkerFactory, @NotNull wp.c sandboxFlags, @NotNull com.withpersona.sdk2.inquiry.ui.d.a createReusablePersonaWorkerFactory, @NotNull k.a verifyReusablePersonaWorkerFactory, @NotNull uq.a navigationStateManager, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull a componentWorkHelper, @NotNull pq.c externalEventLogger, @NotNull go.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final boolean A1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit B1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        return Unit.f22483a;
    }

    public static final Unit D1(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof h2) {
            ((h2) it).b(z10 ? Intrinsics.c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f22483a;
    }

    public static final Unit F0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f22483a;
    }

    public static final Unit H0(UiWorkflow uiWorkflow, Input input, UiState uiState, ym.k.a aVar, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.componentWorkHelper.n0(input, (UiState.Displaying) uiState, aVar, component);
        return Unit.f22483a;
    }

    public static final Unit I0(UiWorkflow uiWorkflow, UiState uiState, ym.k.a aVar) {
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.J0((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit J0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(b.c.f13772a);
        return Unit.f22483a;
    }

    public static final Unit K0(UiWorkflow uiWorkflow, UiState uiState, ym.k.a aVar, final Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.v4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.L0(input, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit L0(Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(input.getFinalStep() ? b.c.f13772a : b.C0250b.f13771a);
        return Unit.f22483a;
    }

    public static final Unit M0(UiWorkflow uiWorkflow, UiState uiState, ym.k.a aVar, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.q0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f22483a;
    }

    public static final Unit N0(UiWorkflow uiWorkflow, UiState uiState, ym.k.a aVar, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.n0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f22483a;
    }

    public static final Unit O0(HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, UiState uiState, ym.k.a aVar) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            uiWorkflow.q0((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState, aVar);
        }
        return Unit.f22483a;
    }

    public static final Unit P0(final HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, final UiState uiState, ym.k.a aVar) {
        GovernmentIdNfcScan.Attributes attributes;
        String unableToScanTransitionComponentName;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent) && (attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes()) != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
            uiWorkflow.C1(helpBottomSheetComponent, true, (UiState.Displaying) uiState);
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.Q0(uiState, helpBottomSheetComponent, (ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit Q0(UiState uiState, HelpBottomSheetComponent helpBottomSheetComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        GovernmentIdNfcScan.Attributes attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes();
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, attributes != null ? attributes.getUnableToScanTransitionComponentName() : null));
        return Unit.f22483a;
    }

    public static final Unit R0(UiWorkflow uiWorkflow, final UiState uiState, ym.k.a aVar, final VerifyPersonaButtonComponent component, final Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        uiWorkflow.C1(component, true, (UiState.Displaying) uiState);
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.S0(uiState, component, componentParams, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit S0(UiState uiState, VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map map, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent, map), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22483a;
    }

    public static final boolean T0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit U0(ym.k.a aVar, UiWorkflow uiWorkflow) {
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.V0((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit V0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.a.f13770a);
        return Unit.f22483a;
    }

    public static final Unit W0(ym.k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final InputAddressComponent component, final String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.X0(uiState, component, addressId, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit X0(UiState uiState, InputAddressComponent inputAddressComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.V(str).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit Y0(ym.k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.Z0(uiState, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit Z0(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f22483a;
    }

    public static final Unit a1(ym.k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final CreatePersonaSheetComponent createReusablePersonaComponent, final UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.b1(uiState, createReusablePersonaComponent, buttonClicked, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit b1(UiState uiState, CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
        if (buttonComponent != null) {
            buttonComponent.b(true);
        }
        Unit unit = Unit.f22483a;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(components, createPersonaSheetComponent, cr.k.b(createPersonaSheetComponent, uiComponent, uiComponent)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22483a;
    }

    public static final Unit c1(ym.k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.d5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.d1(uiState, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit d1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f22483a;
    }

    public static final r e1(final UiWorkflow uiWorkflow, final ym.k.a aVar, final boolean z10, final UiState uiState, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return z.d(uiWorkflow, null, new Function1() { // from class: or.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.f1(it, aVar, uiWorkflow, z10, uiState, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit f1(PermissionRequestWorkflow.Output output, ym.k.a aVar, final UiWorkflow uiWorkflow, boolean z10, final UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f13802a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.f5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.g1(this.f27668a, (ym.r.c) obj);
                }
            }, 1, null));
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new jt.l();
            }
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.i5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.j1(uiState, (ym.r.c) obj);
                }
            }, 1, null));
        } else if (z10) {
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.g5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.h1(this.f27684a, (ym.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.i1(uiState, (ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit g1(UiWorkflow uiWorkflow, r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objC = a10.c();
        UiState.Displaying displaying = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        uiWorkflow.D0(a10, displaying);
        return Unit.f22483a;
    }

    public static final Unit h1(UiWorkflow uiWorkflow, r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objC = a10.c();
        UiState.Displaying displaying = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        uiWorkflow.D0(a10, displaying);
        return Unit.f22483a;
    }

    public static final Unit i1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, String.valueOf(Integer.parseInt(displaying.getRequestPermissionKey()) + 1), false, 0, null, 0, 252927, null));
        return Unit.f22483a;
    }

    public static final Unit j1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        return Unit.f22483a;
    }

    public static final Unit k1(final UiWorkflow uiWorkflow, final UiState uiState, Input input, ym.k.a aVar, final UiComponent uiComponent, boolean z10, final Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeA = b4.a(uiComponent);
        if (uiStepButtonTypeA != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, uiStepButtonTypeA, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        uiWorkflow.C1(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.NONE || displaying.getHasRequestedGpsPermissions()) {
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.x4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.m1(componentParams, uiComponent, uiWorkflow, (ym.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(z.d(uiWorkflow, null, new Function1() { // from class: or.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.l1(uiState, componentParams, uiComponent, (ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit l1(UiState uiState, Map map, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, true, map, uiComponent, null, false, 0, null, 0, 254847, null));
        return Unit.f22483a;
    }

    public static final Unit m1(Map map, UiComponent uiComponent, UiWorkflow uiWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        UiState.Displaying displayingV = UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, map, uiComponent, null, false, 0, null, 0, 255871, null);
        action.e(displayingV);
        uiWorkflow.D0(action, displayingV);
        return Unit.f22483a;
    }

    public static final Unit o0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        String enableNfcPrompt;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = jpMyNumberNfcScanComponent.getName();
        JpMyNumberNfcScan.Attributes attributes = jpMyNumberNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = "";
        }
        action.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
        return Unit.f22483a;
    }

    public static final r o1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, final GovernmentIdNfcScanComponent governmentIdNfcScanComponent, final PassportNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, PassportNfcReaderOutput.Cancel.f12191a)) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.k5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.p1(displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Error) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.l5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.q1(nfcScan, governmentIdNfcScanComponent, displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Success) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.m5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.r1(output, displaying, nfcScan, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.n5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.t1(displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.ReenterDetails) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.o5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.u1(displaying, output, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit p0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, p.k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(jpMyNumberNfcScanComponent), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
        return Unit.f22483a;
    }

    public static final Unit p1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        return Unit.f22483a;
    }

    public static final Unit q1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, r.c action) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = nfcScan.getComponent().getName();
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
            scanDocumentError = "";
        }
        action.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        return Unit.f22483a;
    }

    public static final Unit r0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, null, false, false, null, null, null, false, 0, null, 0, 245727, null));
        return Unit.f22483a;
    }

    public static final Unit r1(PassportNfcReaderOutput passportNfcReaderOutput, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying2 = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f22483a;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) er.h.a(displaying2.getComponents(), d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: or.a6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.s1(nfcScan, (GovernmentIdNfcScanComponent) obj));
            }
        });
        if (governmentIdNfcScanComponent == null) {
            return Unit.f22483a;
        }
        PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) passportNfcReaderOutput;
        governmentIdNfcScanComponent.getNfcDataController().c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, success.getSubmitButtonComponentName()));
        return Unit.f22483a;
    }

    public static final boolean s1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final r t0(final UiState.PendingAction pendingAction, final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final com.withpersona.sdk2.inquiry.ui.d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((UiState.PendingAction.CreateReusablePersona) pendingAction).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.w5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.u0((ym.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.ui.d.b.a.f13836a)) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.x5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.v0(displaying, pendingAction, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.ui.d.b.Error) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.y5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.w0(it, displaying, uiWorkflow, pendingAction, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit t1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        return Unit.f22483a;
    }

    public static final Unit u0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.c.f13772a);
        return Unit.f22483a;
    }

    public static final Unit u1(UiState.Displaying displaying, PassportNfcReaderOutput passportNfcReaderOutput, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((PassportNfcReaderOutput.ReenterDetails) passportNfcReaderOutput).getButtonComponentName()));
        return Unit.f22483a;
    }

    public static final Unit v0(UiState.Displaying displaying, UiState.PendingAction pendingAction, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22483a;
    }

    public static final Unit w0(com.withpersona.sdk2.inquiry.ui.d.b bVar, UiState.Displaying displaying, UiWorkflow uiWorkflow, UiState.PendingAction pendingAction, r.c action) {
        UiState.Displaying displayingV;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((com.withpersona.sdk2.inquiry.ui.d.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            displayingV = UiState.Displaying.v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(vp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null);
        } else {
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            displayingV = UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null);
        }
        action.e(displayingV);
        return Unit.f22483a;
    }

    public static final r w1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, final JpMyNumberNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.p5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.x1(output, displaying, jpMyNumberNfcScanComponent, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.z1(output, displaying, jpMyNumberNfcScanComponent, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(output, JpMyNumberNfcReaderOutput.Cancel.f12147a)) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.r5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.B1(displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final r x0(final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final k.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, k.b.a.f13913a)) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.s5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.y0(displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof k.b.Error) {
            return z.d(uiWorkflow, null, new Function1() { // from class: or.t5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.z0(it, uiWorkflow, displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit x1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        er.j jVarJ;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying2 = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f22483a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) er.h.a(displaying2.getComponents(), d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: or.b6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.y1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (jVarJ = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            jVarJ.c(((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getResult());
        }
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getTransitionComponentName()));
        return Unit.f22483a;
    }

    public static final Unit y0(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        action.d(new b.FinishedWithTransition(true));
        return Unit.f22483a;
    }

    public static final boolean y1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit z0(k.b bVar, UiWorkflow uiWorkflow, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((k.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(vp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22483a;
    }

    public static final Unit z1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        er.j jVarJ;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        UiState.Displaying displaying2 = objC instanceof UiState.Displaying ? (UiState.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f22483a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) er.h.a(displaying2.getComponents(), d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: or.z5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiWorkflow.A1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (jVarJ = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            jVarJ.c(((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getResult());
        }
        String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getTransitionComponentName();
        action.e((transitionComponentName == null || transitionComponentName.length() == 0) ? UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null) : com.withpersona.sdk2.inquiry.ui.b.b(displaying, transitionComponentName));
        return Unit.f22483a;
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public UiState d(@NotNull Input props, @Nullable Snapshot snapshot) {
        List<UiComponent> listK;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            xu.h hVarB = snapshot.b();
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
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listK = com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components)) == null) {
            listK = p.k();
        }
        if (!this.featureFlagManager.a(t.f18312a)) {
            listK = com.withpersona.sdk2.inquiry.ui.b.d(listK);
        }
        List<UiComponent> list = listK;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> listS = props.s();
        if (listS == null) {
            listS = p.k();
        }
        return new UiState.Displaying(list, stepName, listS, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final boolean B0(JpMyNumberNfcScanComponent component) {
        List<String> listD;
        if (!this.sandboxFlags.c()) {
            return !lp.j.f23505a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zC = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        return !zC && lp.m.f23512a.a((jpMyNumberNfcValidOperationK == null || (listD = jpMyNumberNfcValidOperationK.d()) == null) ? null : (String) CollectionsKt.firstOrNull(listD));
    }

    public final void C0(Input renderProps, UiState renderState) {
        pq.i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new jt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new pq.i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new jt.l();
                }
                dVar = new pq.i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new pq.i.d(renderProps.getStepName()) : new pq.i.f(renderProps.getStepName());
        }
        String str = dVar.getStepName() + ":" + dVar;
        if (Intrinsics.c(str, this.lastLoggedPage)) {
            return;
        }
        this.lastLoggedPage = str;
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void C1(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        E0(renderState.getComponents(), new Function1() { // from class: or.v5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.D1(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
            }
        });
    }

    public final void D0(r<? super Input, UiState, ? extends b>.c cVar, UiState.Displaying displaying) {
        UiComponent triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> mapZ = displaying.z();
        if (triggeringComponent == null || mapZ == null) {
            return;
        }
        cVar.d(new b.FinishedWithoutTransition(triggeringComponent, mapZ, displaying.getStepName()));
    }

    public final void E0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                E0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: or.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UiWorkflow.F0(function1, (UiComponent) obj);
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Input renderProps, @NotNull final UiState renderState, @NotNull final ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        final UiWorkflow uiWorkflow;
        final UiState uiState;
        c.a.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (renderProps.getIsRestoringState()) {
            return Unit.f22483a;
        }
        C0(renderProps, renderState);
        if (!(renderState instanceof UiState.Displaying)) {
            throw new jt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        s0(renderProps, displaying, context);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) er.h.a(displaying.getComponents(), d0.b(HelpBottomSheetComponent.class), e.f13803a);
        boolean z10 = helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled();
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting(), z10);
        E0(displaying.getComponents(), new Function1() { // from class: or.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.H0(this.f27621a, renderProps, renderState, context, (UiComponent) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            n1(renderProps, displaying, context, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            v1(renderProps, displaying, context, displaying.getJpMyNumberNfcScan());
        }
        i0 i0Var = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.ROUGH ? i0.RoughLocation : i0.PreciseLocation;
        final boolean z11 = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.OPTIONAL;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(vp.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) er.h.a(displaying.getComponents(), d0.b(ButtonComponent.class), new Function1() { // from class: or.e6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(UiWorkflow.T0((ButtonComponent) obj));
                }
            });
            if (buttonComponent != null) {
                context.b("begin_countdown", new f(context, this, renderState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 == null || autoSubmit2.getCountdown() < 1) {
            uiWorkflow = this;
            uiState = renderState;
        } else {
            String str2 = "countdown_" + autoSubmit2.getCountdown();
            g gVar = new g(context, this, autoSubmit2, renderState, null);
            uiWorkflow = this;
            uiState = renderState;
            context.b(str2, gVar);
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = renderProps.getComponents();
        List<UiComponentErrorInfo> listX = displaying.x();
        List<UiComponentErrorInfo> listS = renderProps.s();
        if (listS == null) {
            listS = p.k();
        }
        List listW0 = CollectionsKt.w0(listX, listS);
        NavigationState navigationStateB = uiWorkflow.navigationStateManager.b();
        String navBarTitle = renderProps.getNavBarTitle();
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        c.a aVar = new c.a(components, components2, listW0, navigationStateB, navBarTitle, new zt.n() { // from class: or.f6
            @Override // zt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UiWorkflow.k1(this.f27669a, uiState, renderProps, context, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: or.g6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.I0(this.f27685a, uiState, context);
            }
        }, new Function0() { // from class: or.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.K0(this.f27634a, uiState, context, renderProps);
            }
        }, new Function1() { // from class: or.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.M0(this.f27652a, uiState, context, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: or.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.N0(this.f27666a, uiState, context, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: or.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.O0(helpBottomSheetComponent, uiWorkflow, uiState, context);
            }
        }, new Function0() { // from class: or.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.P0(helpBottomSheetComponent, uiWorkflow, uiState, context);
            }
        }, new Function2() { // from class: or.i4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.R0(this.f27707a, uiState, context, (VerifyPersonaButtonComponent) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: or.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.U0(context, uiWorkflow);
            }
        }, new Function2() { // from class: or.y4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.W0(context, uiWorkflow, uiState, (InputAddressComponent) obj, (String) obj2);
            }
        }, displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new Function0() { // from class: or.j5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.Y0(context, uiWorkflow, uiState);
            }
        }, new Function2() { // from class: or.u5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.a1(context, uiWorkflow, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            }
        }, helpBottomSheetComponent != null ? HelpBottomSheetComponent.x2(helpBottomSheetComponent, 0, 1, null) : null, z10 && displaying.getShowHelpBottomSheet(), new Function0() { // from class: or.c6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.c1(context, uiWorkflow, uiState);
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
        String string = context2.getString(vp.g.f33388c0, jq.g.b(context2));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = uiWorkflow.applicationContext.getString(vp.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = uiWorkflow.applicationContext.getString(vp.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        return com.withpersona.sdk2.inquiry.permissions.g.d(aVar, context, isRequestingGpsPermissions, i0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getGpsPermissionsModalNegativeButton(), uiWorkflow.permissionRequestWorkflow, renderProps.getStyles(), displaying.getRequestPermissionKey(), new Function1() { // from class: or.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.e1(this.f27638a, context, z11, uiState, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    public final void n0(final JpMyNumberNfcScanComponent component, final UiState.Displaying renderState, ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        if (component.getValidOperation() == null) {
            return;
        }
        if (B0(component)) {
            context.d().a(z.d(this, null, new Function1() { // from class: or.q4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.o0(renderState, component, (ym.r.c) obj);
                }
            }, 1, null));
        } else {
            C1(component, true, renderState);
            context.d().a(z.d(this, null, new Function1() { // from class: or.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.p0(renderState, component, (ym.r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0141 A[PHI: r13
      0x0141: PHI (r13v8 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String) binds: [B:95:0x014c, B:89:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n1(Input renderProps, final UiState.Displaying renderState, ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends qp.b> listN;
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
        qp.b bVar;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strB = component.getCardAccessNumberController().b();
        String strB2 = component.getDocumentNumberController().b();
        Date dateB = component.getDateOfBirthController().b();
        Date dateB2 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(strB2) || dateB == null || dateB2 == null) {
            context.b("client_side_nfc_form_validation", new h(context, this, attributes, strB2, dateB, dateB2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strB2, dateB2, dateB);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listN = p.n(qp.b.Dg1, qp.b.Dg2, qp.b.Sod);
        } else {
            listN = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = d.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    bVar = qp.b.Dg1;
                } else if (i10 == 2) {
                    bVar = qp.b.Dg2;
                } else if (i10 != 3) {
                    bVar = i10 != 4 ? null : qp.b.Sod;
                } else {
                    bVar = qp.b.Dg14;
                }
                if (bVar != null) {
                    listN.add(bVar);
                }
            }
        }
        com.withpersona.sdk2.inquiry.nfc.b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        Context context2 = this.applicationContext;
        int i11 = vp.g.C;
        String string = context2.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(vp.g.D);
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
        int i12 = vp.g.F;
        String string4 = context3.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
        String string6 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        w.l(context, aVar.a(strB, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), listN, renderProps.getStyles(), null, component.getConfig().getStyles()), d0.k(com.withpersona.sdk2.inquiry.nfc.b.class), "", new Function1() { // from class: or.z4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.o1(this.f27914a, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
            }
        });
    }

    public final void q0(final GovernmentIdNfcScanComponent component, final UiState.Displaying renderState, ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        C1(component, true, renderState);
        context.d().a(z.d(this, null, new Function1() { // from class: or.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.r0(component, renderState, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public final void s0(Input renderProps, final UiState.Displaying renderState, ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            com.withpersona.sdk2.inquiry.ui.d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w.l(context, aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), d0.k(com.withpersona.sdk2.inquiry.ui.d.class), "", new Function1() { // from class: or.m4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.t0(pendingAction, this, renderState, (com.withpersona.sdk2.inquiry.ui.d.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new jt.l();
            }
            return;
        }
        k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        w.l(context, aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), d0.k(k.class), "", new Function1() { // from class: or.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.x0(this.f27776a, renderState, (com.withpersona.sdk2.inquiry.ui.k.b) obj);
            }
        });
    }

    public final void v1(Input renderProps, final UiState.Displaying renderState, ym.k<? super Input, UiState, ? extends b, ? extends Object>.a context, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        if (jpMyNumberNfcValidOperationK == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        w.l(context, this.scanJpMyNumberNfcWorkerFactory.a(jpMyNumberNfcValidOperationK, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), d0.k(n.class), "", new Function1() { // from class: or.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.w1(this.f27654a, renderState, component, (JpMyNumberNfcReaderOutput) obj);
            }
        });
    }
}
