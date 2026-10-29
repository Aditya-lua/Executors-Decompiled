package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ar.C1147b;
import ar.C1164s;
import ar.UiStepBottomSheet;
import bo.C1475a;
import com.withpersona.sdk2.inquiry.document.C3438a;
import com.withpersona.sdk2.inquiry.document.C3446i;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.C3451a;
import com.withpersona.sdk2.inquiry.document.network.C3453c;
import com.withpersona.sdk2.inquiry.document.network.C3455e;
import com.withpersona.sdk2.inquiry.document.network.C3457g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0388q;
import p226jq.C7259g;
import p229jt.C7345l;
import p229jt.C7348o;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p340op.C9837c;
import p340op.C9838d;
import p344ot.C10047c;
import p363pq.C10309c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p497vp.C12244g;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13215h;
import p581ym.Snapshot;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006F`aHbJBq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J7\u0010&\u001a\u00020%*\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'JU\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u00020(2\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b/\u00100JU\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u0002012\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b2\u00103JG\u00107\u001a\u00020%*\u0002042\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020%*\u0002092\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorker", "Lbo/a$a;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "", "K0", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "context", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "A0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lym/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "B0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "renderProps", "renderState", "H1", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "I1", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V", "props", "Lym/i;", "snapshot", "J0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "state", "a2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lym/i;", "V0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)Ljava/lang/Object;", "a", "Lk6/s;", "b", "Landroid/content/Context;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "d", "Lcom/withpersona/sdk2/inquiry/document/a;", "e", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "f", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "g", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "i", "Lbo/a$a;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "k", "Luq/a;", "l", "Lpq/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Input", "StartPage", "State", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DocumentWorkflow extends AbstractC13218k<Input, State, AbstractC3431b, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3438a documentCameraWorker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C3446i.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C3451a.a documentCreateWorker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C3455e.a documentLoadWorker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C3453c.a documentFileUploadWorker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C1475a.a documentFileDeleteWorker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C3457g.a documentSubmitWorker;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b5\u0010,J\u001a\u00108\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u00104R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u00104R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u00104R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bO\u00104R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010Z\u001a\u0004\bR\u0010,R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010[\u001a\u0004\bE\u0010\\R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010[\u001a\u0004\bG\u0010\\R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\b]\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\b`\u00104R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\ba\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010;\u001a\u0004\b^\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b<\u0010g\u001a\u0004\b:\u0010hR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bL\u0010i\u001a\u0004\bc\u0010jR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010;\u001a\u0004\bZ\u00104R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010;\u001a\u0004\bK\u00104R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\bb\u00104R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b_\u0010l\u001a\u0004\bM\u0010m¨\u0006n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "startPage", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "", "documentFileLimit", "", "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "largeFileErrorPrompt", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "promptPageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "y", "b", "r", "c", "q", "d", "p", "e", "J", "f", "G", "g", "k", "h", "N", "i", "z", "j", "v", "o", "l", "s", "m", "n", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "K", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "u", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "I", "Z", "()Z", "E", "t", "D", "C", "A", "w", "x", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "L", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "B", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new C3418a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @Nullable
        public final String promptPageNavBarTitle;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final String checkPageNavBarTitle;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String pendingPageNavBarTitle;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String promptTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final String promptDescription;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final String disclaimer;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final String submitButtonText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final String pendingTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String pendingDescription;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyDocument;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @NotNull
        public final String kind;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final String documentId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @NotNull
        public final StartPage startPage;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final DocumentPages pages;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        public final int documentFileLimit;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        @Nullable
        public final String permissionsTitle;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        @Nullable
        public final String permissionsRationale;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        @Nullable
        public final String largeFileErrorPrompt;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.DocumentStepStyle styles;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Document.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3418a implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StartPage) parcel.readParcelable(Input.class.getClassLoader()), DocumentPages.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.DocumentStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String fieldKeyDocument, @NotNull String kind, @Nullable String str7, @NotNull StartPage startPage, @NotNull DocumentPages pages, int i10, boolean z10, boolean z11, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull NextStep.Document.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(startPage, "startPage");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.promptTitle = str;
            this.promptDescription = str2;
            this.disclaimer = str3;
            this.submitButtonText = str4;
            this.pendingTitle = str5;
            this.pendingDescription = str6;
            this.fieldKeyDocument = fieldKeyDocument;
            this.kind = kind;
            this.documentId = str7;
            this.startPage = startPage;
            this.pages = pages;
            this.documentFileLimit = i10;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.permissionsTitle = str8;
            this.permissionsRationale = str9;
            this.permissionsModalPositiveButton = str10;
            this.permissionsModalNegativeButton = str11;
            this.largeFileErrorPrompt = str12;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.promptPageNavBarTitle = str13;
            this.checkPageNavBarTitle = str14;
            this.pendingPageNavBarTitle = str15;
            this.customPendingPage = customPendingPage;
        }

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final String getPromptDescription() {
            return this.promptDescription;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final String getPromptPageNavBarTitle() {
            return this.promptPageNavBarTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getPromptTitle() {
            return this.promptTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final StartPage getStartPage() {
            return this.startPage;
        }

        @Nullable
        /* JADX INFO: renamed from: L, reason: from getter */
        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
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
            return Intrinsics.m31980c(this.sessionToken, input.sessionToken) && Intrinsics.m31980c(this.inquiryId, input.inquiryId) && Intrinsics.m31980c(this.fromStep, input.fromStep) && Intrinsics.m31980c(this.fromComponent, input.fromComponent) && Intrinsics.m31980c(this.promptTitle, input.promptTitle) && Intrinsics.m31980c(this.promptDescription, input.promptDescription) && Intrinsics.m31980c(this.disclaimer, input.disclaimer) && Intrinsics.m31980c(this.submitButtonText, input.submitButtonText) && Intrinsics.m31980c(this.pendingTitle, input.pendingTitle) && Intrinsics.m31980c(this.pendingDescription, input.pendingDescription) && Intrinsics.m31980c(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.m31980c(this.kind, input.kind) && Intrinsics.m31980c(this.documentId, input.documentId) && Intrinsics.m31980c(this.startPage, input.startPage) && Intrinsics.m31980c(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.m31980c(this.permissionsTitle, input.permissionsTitle) && Intrinsics.m31980c(this.permissionsRationale, input.permissionsRationale) && Intrinsics.m31980c(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.m31980c(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.m31980c(this.largeFileErrorPrompt, input.largeFileErrorPrompt) && Intrinsics.m31980c(this.styles, input.styles) && Intrinsics.m31980c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.m31980c(this.promptPageNavBarTitle, input.promptPageNavBarTitle) && Intrinsics.m31980c(this.checkPageNavBarTitle, input.checkPageNavBarTitle) && Intrinsics.m31980c(this.pendingPageNavBarTitle, input.pendingPageNavBarTitle) && Intrinsics.m31980c(this.customPendingPage, input.customPendingPage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31;
            String str = this.promptTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.kind.hashCode()) * 31;
            String str7 = this.documentId;
            int iHashCode8 = (((((((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.startPage.hashCode()) * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.documentFileLimit)) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31;
            String str8 = this.permissionsTitle;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.largeFileErrorPrompt;
            int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int iHashCode14 = (((((iHashCode13 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31;
            String str13 = this.promptPageNavBarTitle;
            int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.checkPageNavBarTitle;
            int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.pendingPageNavBarTitle;
            int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            return iHashCode17 + (customPendingPage != null ? customPendingPage.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getCheckPageNavBarTitle() {
            return this.checkPageNavBarTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getDocumentFileLimit() {
            return this.documentFileLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getLargeFileErrorPrompt() {
            return this.largeFileErrorPrompt;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromStep=" + this.fromStep + ", fromComponent=" + this.fromComponent + ", promptTitle=" + this.promptTitle + ", promptDescription=" + this.promptDescription + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", pendingTitle=" + this.pendingTitle + ", pendingDescription=" + this.pendingDescription + ", fieldKeyDocument=" + this.fieldKeyDocument + ", kind=" + this.kind + ", documentId=" + this.documentId + ", startPage=" + this.startPage + ", pages=" + this.pages + ", documentFileLimit=" + this.documentFileLimit + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", permissionsTitle=" + this.permissionsTitle + ", permissionsRationale=" + this.permissionsRationale + ", permissionsModalPositiveButton=" + this.permissionsModalPositiveButton + ", permissionsModalNegativeButton=" + this.permissionsModalNegativeButton + ", largeFileErrorPrompt=" + this.largeFileErrorPrompt + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", promptPageNavBarTitle=" + this.promptPageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", customPendingPage=" + this.customPendingPage + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final DocumentPages getPages() {
            return this.pages;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getPendingDescription() {
            return this.pendingDescription;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getPendingPageNavBarTitle() {
            return this.pendingPageNavBarTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromStep);
            dest.writeString(this.fromComponent);
            dest.writeString(this.promptTitle);
            dest.writeString(this.promptDescription);
            dest.writeString(this.disclaimer);
            dest.writeString(this.submitButtonText);
            dest.writeString(this.pendingTitle);
            dest.writeString(this.pendingDescription);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.kind);
            dest.writeString(this.documentId);
            dest.writeParcelable(this.startPage, flags);
            this.pages.writeToParcel(dest, flags);
            dest.writeInt(this.documentFileLimit);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.permissionsTitle);
            dest.writeString(this.permissionsRationale);
            dest.writeString(this.permissionsModalPositiveButton);
            dest.writeString(this.permissionsModalNegativeButton);
            dest.writeString(this.largeFileErrorPrompt);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeString(this.promptPageNavBarTitle);
            dest.writeString(this.checkPageNavBarTitle);
            dest.writeString(this.pendingPageNavBarTitle);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getPendingTitle() {
            return this.pendingTitle;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Landroid/os/Parcelable;", "Prompt", "Review", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface StartPage extends Parcelable {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Prompt implements StartPage {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Prompt f13045a = new Prompt();

            @NotNull
            public static final Parcelable.Creator<Prompt> CREATOR = new C3419a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$StartPage$Prompt$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3419a implements Parcelable.Creator<Prompt> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Prompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Prompt.f13045a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Prompt[] newArray(int i10) {
                    return new Prompt[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Prompt);
            }

            public int hashCode() {
                return 813153962;
            }

            @NotNull
            public String toString() {
                return "Prompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Review implements StartPage {

            @NotNull
            public static final Parcelable.Creator<Review> CREATOR = new C3420a();

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$StartPage$Review$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3420a implements Parcelable.Creator<Review> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Review createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Review(parcel.readString());
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Review[] newArray(int i10) {
                    return new Review[i10];
                }
            }

            public Review(@NotNull String documentId) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Review) && Intrinsics.m31980c(this.documentId, ((Review) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            @NotNull
            public String toString() {
                return "Review(documentId=" + this.documentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.documentId);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014()*+,B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0004-./0¨\u00061"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "", "documentId", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V", "other", "", "t0", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z", "shouldShowUploadOptionsDialog", "f", "(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "documentFileToDelete", "g", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "c", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "d", "Ljava/util/List;", "m", "()Ljava/util/List;", "UploadState", "Start", "ReviewCapturesWithoutDocumentId", "ReviewCaptures", "UploadDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class State implements WorkflowState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final EnumC3429a captureState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final UploadState uploadState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String documentId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<DocumentFile> documents;

        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Landroid/os/Parcelable;", "CreateDocument", "UploadFiles", "DeleteFiles", "ReadyToSubmit", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public interface UploadState extends Parcelable {

            @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class CreateDocument implements UploadState {

                /* JADX INFO: renamed from: a */
                @NotNull
                public static final CreateDocument f13075a = new CreateDocument();

                @NotNull
                public static final Parcelable.Creator<CreateDocument> CREATOR = new C3425a();

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$CreateDocument$a */
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C3425a implements Parcelable.Creator<CreateDocument> {
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final CreateDocument createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return CreateDocument.f13075a;
                    }

                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final CreateDocument[] newArray(int i10) {
                        return new CreateDocument[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    return this == other || (other instanceof CreateDocument);
                }

                public int hashCode() {
                    return 1079141691;
                }

                @NotNull
                public String toString() {
                    return "CreateDocument";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class DeleteFiles implements UploadState {

                @NotNull
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new C3426a();

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$DeleteFiles$a */
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C3426a implements Parcelable.Creator<DeleteFiles> {
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DeleteFiles(parcel.readString());
                    }

                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles[] newArray(int i10) {
                        return new DeleteFiles[i10];
                    }
                }

                public DeleteFiles(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DeleteFiles) && Intrinsics.m31980c(this.documentId, ((DeleteFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "DeleteFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentId", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class ReadyToSubmit implements UploadState {

                @NotNull
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new C3427a();

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$ReadyToSubmit$a */
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C3427a implements Parcelable.Creator<ReadyToSubmit> {
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ReadyToSubmit(parcel.readString());
                    }

                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit[] newArray(int i10) {
                        return new ReadyToSubmit[i10];
                    }
                }

                public ReadyToSubmit(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReadyToSubmit) && Intrinsics.m31980c(this.documentId, ((ReadyToSubmit) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "ReadyToSubmit(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class UploadFiles implements UploadState {

                @NotNull
                public static final Parcelable.Creator<UploadFiles> CREATOR = new C3428a();

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$UploadFiles$a */
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C3428a implements Parcelable.Creator<UploadFiles> {
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UploadFiles(parcel.readString());
                    }

                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles[] newArray(int i10) {
                        return new UploadFiles[i10];
                    }
                }

                public UploadFiles(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UploadFiles) && Intrinsics.m31980c(this.documentId, ((UploadFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "UploadFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public enum EnumC3429a {
            None,
            CheckCameraPermissions,
            CameraRunning,
            SelectFileFromDocuments,
            SelectImageFromPhotoLibrary;


            /* JADX INFO: renamed from: g */
            public static final /* synthetic */ InterfaceC10707a f13085g = C10708b.m40805a(m16513a());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
          (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a)
          (r2v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState)
          (r3v0 java.lang.String)
          (r4v0 java.util.List)
         A[MD:(com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.<init>(com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String, java.util.List):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ State(EnumC3429a enumC3429a, UploadState uploadState, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC3429a, uploadState, str, list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ State m16470i(State state, UploadState uploadState, String str, List list, DocumentFile documentFile, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithUploadState");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                list = null;
            }
            if ((i10 & 8) != 0) {
                documentFile = null;
            }
            return state.m16473g(uploadState, str, list, documentFile);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final State m16471a(@NotNull EnumC3429a captureState) {
            Intrinsics.checkNotNullParameter(captureState, "captureState");
            if (this instanceof Start) {
                return Start.m16494p((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.m16479p((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.m16487p((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new C7345l();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final State m16472f(boolean shouldShowUploadOptionsDialog) {
            if (this instanceof Start) {
                return Start.m16494p((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.m16479p((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.m16487p((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new C7345l();
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final State m16473g(@NotNull UploadState uploadState, @Nullable String documentId, @Nullable List<? extends DocumentFile> documents, @Nullable DocumentFile documentFileToDelete) {
            Intrinsics.checkNotNullParameter(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = start.getDocumentId();
                }
                return Start.m16494p(start, null, uploadState, documentId, false, 9, null);
            }
            if (this instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) this;
                if (documents == null) {
                    documents = reviewCaptures.mo16476m();
                }
                return ReviewCaptures.m16479p(reviewCaptures, documents, null, null, uploadState, documentFileToDelete, false, false, null, 230, null);
            }
            if (!(this instanceof ReviewCapturesWithoutDocumentId)) {
                if (this instanceof UploadDocument) {
                    return UploadDocument.m16499p((UploadDocument) this, null, null, uploadState, null, 11, null);
                }
                throw new C7345l();
            }
            ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) this;
            if (documentId == null) {
                documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            }
            String str = documentId;
            if (documents == null) {
                documents = reviewCapturesWithoutDocumentId.mo16476m();
            }
            return ReviewCapturesWithoutDocumentId.m16487p(reviewCapturesWithoutDocumentId, documents, str, null, uploadState, documentFileToDelete, false, false, null, 228, null);
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public EnumC3429a getCaptureState() {
            return this.captureState;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public List<DocumentFile> mo16476m() {
            return this.documents;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public UploadState getUploadState() {
            return this.uploadState;
        }

        @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
        /* JADX INFO: renamed from: t0 */
        public boolean mo16478t0(@NotNull WorkflowState other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return getClass() == other.getClass() && getCaptureState() == ((State) other).getCaptureState();
        }

        @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0018¨\u0006,"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "h", "getError", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class UploadDocument extends State {

            @NotNull
            public static final Parcelable.Creator<UploadDocument> CREATOR = new C3424a();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadDocument$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3424a implements Parcelable.Creator<UploadDocument> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UploadDocument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), (UploadState) parcel.readParcelable(UploadDocument.class.getClassLoader()), parcel.readString());
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UploadDocument[] newArray(int i10) {
                    return new UploadDocument[i10];
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
              (r1v0 java.util.List)
              (r2v0 java.lang.String)
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.UploadState.CreateDocument.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$CreateDocument) : (r3v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
             A[MD:(java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.UploadDocument.<init>(java.util.List, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ UploadDocument(List list, String str, UploadState uploadState, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? UploadState.CreateDocument.f13075a : uploadState, (i10 & 8) != 0 ? null : str2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadDocument */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: p */
            public static /* synthetic */ UploadDocument m16499p(UploadDocument uploadDocument, List list, String str, UploadState uploadState, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i10 & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i10 & 4) != 0) {
                    uploadState = uploadDocument.uploadState;
                }
                if ((i10 & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.m16500o(list, str, uploadState, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) other;
                return Intrinsics.m31980c(this.documents, uploadDocument.documents) && Intrinsics.m31980c(this.documentId, uploadDocument.documentId) && Intrinsics.m31980c(this.uploadState, uploadDocument.uploadState) && Intrinsics.m31980c(this.error, uploadDocument.error);
            }

            public int hashCode() {
                int iHashCode = ((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                String str = this.error;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: m */
            public List<DocumentFile> mo16476m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            /* JADX INFO: renamed from: o */
            public final UploadDocument m16500o(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull UploadState uploadState, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new UploadDocument(documents, documentId, uploadState, error);
            }

            @NotNull
            public String toString() {
                return "UploadDocument(documents=" + this.documents + ", documentId=" + this.documentId + ", uploadState=" + this.uploadState + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.error);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UploadDocument(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull UploadState uploadState, @Nullable String str) {
                super(EnumC3429a.None, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.uploadState = uploadState;
                this.error = str;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
        /* JADX WARN: Multi-variable type inference failed */
        public State(EnumC3429a enumC3429a, UploadState uploadState, String str, List<? extends DocumentFile> list) {
            this.captureState = enumC3429a;
            this.uploadState = uploadState;
            this.documentId = str;
            this.documents = list;
        }

        @Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u001e¨\u0006="}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "shouldLoadDocuments", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "q", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "s", "()Z", "t", "l", "r", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ReviewCaptures extends State {

            @NotNull
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new C3421a();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @NotNull
            public final EnumC3429a captureState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @Nullable
            public final DocumentFile documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            public final boolean shouldLoadDocuments;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$ReviewCaptures$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3421a implements Parcelable.Creator<ReviewCaptures> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                    }
                    String string = parcel.readString();
                    EnumC3429a enumC3429aValueOf = EnumC3429a.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    boolean z10 = true;
                    if (parcel.readInt() == 0) {
                        z10 = false;
                    }
                    return new ReviewCaptures(arrayList, string, enumC3429aValueOf, uploadState, documentFile, z10, parcel.readInt() != 0, parcel.readString());
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures[] newArray(int i10) {
                    return new ReviewCaptures[i10];
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
              (r10v0 java.util.List)
              (r11v0 java.lang.String)
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:0x0008: TERNARY null = ((wrap int:0x0002: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:0x0006: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.a.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a) : (r12v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a))
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x000f: TERNARY null = ((wrap int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x000d: SGET  A[WRAPPED] (LINE:2) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.UploadState.CreateDocument.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$CreateDocument) : (r13v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState))
              (wrap com.withpersona.sdk2.inquiry.document.DocumentFile:?: TERNARY null = ((wrap int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.document.DocumentFile) : (r14v0 com.withpersona.sdk2.inquiry.document.DocumentFile))
              (wrap boolean:?: TERNARY null = ((wrap int:0x0018: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
              (wrap boolean:?: TERNARY null = ((wrap int:0x0020: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0028: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
             A[MD:(java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, com.withpersona.sdk2.inquiry.document.DocumentFile, boolean, boolean, java.lang.String):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.ReviewCaptures.<init>(java.util.List, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, com.withpersona.sdk2.inquiry.document.DocumentFile, boolean, boolean, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ ReviewCaptures(List list, String str, EnumC3429a enumC3429a, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? EnumC3429a.None : enumC3429a, (i10 & 8) != 0 ? UploadState.CreateDocument.f13075a : uploadState, (i10 & 16) != 0 ? null : documentFile, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$ReviewCaptures */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: p */
            public static /* synthetic */ ReviewCaptures m16479p(ReviewCaptures reviewCaptures, List list, String str, EnumC3429a enumC3429a, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCaptures.documentId;
                }
                if ((i10 & 4) != 0) {
                    enumC3429a = reviewCaptures.captureState;
                }
                if ((i10 & 8) != 0) {
                    uploadState = reviewCaptures.uploadState;
                }
                if ((i10 & 16) != 0) {
                    documentFile = reviewCaptures.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCaptures.shouldLoadDocuments;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                if ((i10 & 128) != 0) {
                    str2 = reviewCaptures.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z13 = z10;
                return reviewCaptures.m16480o(list, str, enumC3429a, uploadState, documentFile2, z13, z12, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.m31980c(this.documents, reviewCaptures.documents) && Intrinsics.m31980c(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && Intrinsics.m31980c(this.uploadState, reviewCaptures.uploadState) && Intrinsics.m31980c(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.shouldLoadDocuments == reviewCaptures.shouldLoadDocuments && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.m31980c(this.error, reviewCaptures.error);
            }

            public int hashCode() {
                int iHashCode = ((((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int iHashCode2 = (((((iHashCode + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.shouldLoadDocuments)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str = this.error;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public EnumC3429a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: m */
            public List<DocumentFile> mo16476m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            /* JADX INFO: renamed from: o */
            public final ReviewCaptures m16480o(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFileToDelete, boolean shouldLoadDocuments, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, shouldLoadDocuments, shouldShowUploadOptionsDialog, error);
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final DocumentFile getDocumentFileToDelete() {
                return this.documentFileToDelete;
            }

            @Nullable
            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final boolean getShouldLoadDocuments() {
                return this.shouldLoadDocuments;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", shouldLoadDocuments=" + this.shouldLoadDocuments + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.shouldLoadDocuments ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFile, boolean z10, boolean z11, @Nullable String str) {
                super(captureState, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.shouldLoadDocuments = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str;
            }
        }

        @Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u001e¨\u0006="}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "getDocumentFileToDelete", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "r", "()Z", "s", "l", "q", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ReviewCapturesWithoutDocumentId extends State {

            @NotNull
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new C3422a();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @NotNull
            public final EnumC3429a captureState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @Nullable
            public final DocumentFile documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            public final boolean reloadingFromPreviousSession;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$ReviewCapturesWithoutDocumentId$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3422a implements Parcelable.Creator<ReviewCapturesWithoutDocumentId> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader()));
                    }
                    String string = parcel.readString();
                    EnumC3429a enumC3429aValueOf = EnumC3429a.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    boolean z10 = true;
                    if (parcel.readInt() == 0) {
                        z10 = false;
                    }
                    return new ReviewCapturesWithoutDocumentId(arrayList, string, enumC3429aValueOf, uploadState, documentFile, z10, parcel.readInt() != 0, parcel.readString());
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId[] newArray(int i10) {
                    return new ReviewCapturesWithoutDocumentId[i10];
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
              (r10v0 java.util.List)
              (r11v0 java.lang.String)
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:0x0008: TERNARY null = ((wrap int:0x0002: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:0x0006: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.a.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a) : (r12v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a))
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x000f: TERNARY null = ((wrap int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x000d: SGET  A[WRAPPED] (LINE:2) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.UploadState.CreateDocument.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$CreateDocument) : (r13v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState))
              (wrap com.withpersona.sdk2.inquiry.document.DocumentFile:?: TERNARY null = ((wrap int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.document.DocumentFile) : (r14v0 com.withpersona.sdk2.inquiry.document.DocumentFile))
              (wrap boolean:?: TERNARY null = ((wrap int:0x0018: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
              (wrap boolean:?: TERNARY null = ((wrap int:0x0020: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0028: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
             A[MD:(java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, com.withpersona.sdk2.inquiry.document.DocumentFile, boolean, boolean, java.lang.String):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.ReviewCapturesWithoutDocumentId.<init>(java.util.List, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, com.withpersona.sdk2.inquiry.document.DocumentFile, boolean, boolean, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, EnumC3429a enumC3429a, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? EnumC3429a.None : enumC3429a, (i10 & 8) != 0 ? UploadState.CreateDocument.f13075a : uploadState, (i10 & 16) != 0 ? null : documentFile, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$ReviewCapturesWithoutDocumentId */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: p */
            public static /* synthetic */ ReviewCapturesWithoutDocumentId m16487p(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, EnumC3429a enumC3429a, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                if ((i10 & 4) != 0) {
                    enumC3429a = reviewCapturesWithoutDocumentId.captureState;
                }
                if ((i10 & 8) != 0) {
                    uploadState = reviewCapturesWithoutDocumentId.uploadState;
                }
                if ((i10 & 16) != 0) {
                    documentFile = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog;
                }
                if ((i10 & 128) != 0) {
                    str2 = reviewCapturesWithoutDocumentId.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z13 = z10;
                return reviewCapturesWithoutDocumentId.m16488o(list, str, enumC3429a, uploadState, documentFile2, z13, z12, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCapturesWithoutDocumentId)) {
                    return false;
                }
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) other;
                return Intrinsics.m31980c(this.documents, reviewCapturesWithoutDocumentId.documents) && Intrinsics.m31980c(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && Intrinsics.m31980c(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && Intrinsics.m31980c(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && Intrinsics.m31980c(this.error, reviewCapturesWithoutDocumentId.error);
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int iHashCode3 = (((((iHashCode2 + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public EnumC3429a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: m */
            public List<DocumentFile> mo16476m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            /* JADX INFO: renamed from: o */
            public final ReviewCapturesWithoutDocumentId m16488o(@NotNull List<? extends DocumentFile> documents, @Nullable String documentId, @NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCapturesWithoutDocumentId(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "ReviewCapturesWithoutDocumentId(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesWithoutDocumentId(@NotNull List<? extends DocumentFile> documents, @Nullable String str, @NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFile, boolean z10, boolean z11, @Nullable String str2) {
                super(captureState, uploadState, str, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str2;
            }
        }

        @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "", "documentId", "", "shouldShowUploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "f", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "g", "Ljava/lang/String;", "k", "h", "Z", "q", "()Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Start extends State {

            @NotNull
            public static final Parcelable.Creator<Start> CREATOR = new C3423a();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final EnumC3429a captureState;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$Start$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3423a implements Parcelable.Creator<Start> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Start createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Start(EnumC3429a.valueOf(parcel.readString()), (UploadState) parcel.readParcelable(Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Start[] newArray(int i10) {
                    return new Start[i10];
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.a.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a) : (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a))
              (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState:0x000a: SGET  A[WRAPPED] (LINE:2) com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.UploadState.CreateDocument.a com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState$CreateDocument) : (r2v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState))
              (r3v0 java.lang.String)
              (wrap boolean:?: TERNARY null = ((wrap int:0x000c: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
             A[MD:(com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String, boolean):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State.Start.<init>(com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$a, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State$UploadState, java.lang.String, boolean):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Start(EnumC3429a enumC3429a, UploadState uploadState, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? EnumC3429a.None : enumC3429a, (i10 & 2) != 0 ? UploadState.CreateDocument.f13075a : uploadState, str, (i10 & 8) != 0 ? false : z10);
            }

            /* JADX INFO: renamed from: p */
            public static /* synthetic */ Start m16494p(Start start, EnumC3429a enumC3429a, UploadState uploadState, String str, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    enumC3429a = start.captureState;
                }
                if ((i10 & 2) != 0) {
                    uploadState = start.uploadState;
                }
                if ((i10 & 4) != 0) {
                    str = start.documentId;
                }
                if ((i10 & 8) != 0) {
                    z10 = start.shouldShowUploadOptionsDialog;
                }
                return start.m16495o(enumC3429a, uploadState, str, z10);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.captureState == start.captureState && Intrinsics.m31980c(this.uploadState, start.uploadState) && Intrinsics.m31980c(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            public int hashCode() {
                int iHashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public EnumC3429a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            /* JADX INFO: renamed from: o */
            public final Start m16495o(@NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable String documentId, boolean shouldShowUploadOptionsDialog) {
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new Start(captureState, uploadState, documentId, shouldShowUploadOptionsDialog);
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "Start(captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentId=" + this.documentId + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.documentId);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(@NotNull EnumC3429a captureState, @NotNull UploadState uploadState, @Nullable String str, boolean z10) {
                super(captureState, uploadState, str, C7699p.m31892k(), null);
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z10;
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "<init>", "()V", "b", "a", "g", "h", "j", "e", "c", "f", "d", "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3430a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f13086a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1245705540;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f13087a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1143899241;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f13088a = new c();

            public c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1422406686;
            }

            @NotNull
            public String toString() {
                return "CloseUploadOptions";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$d */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class d extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f13089a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -967280389;
            }

            @NotNull
            public String toString() {
                return "DismissError";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$e */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class e extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final e f13090a = new e();

            public e() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1532240394;
            }

            @NotNull
            public String toString() {
                return "OpenUploadOptions";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$f, reason: from toString */
        @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RemoveDocument extends AbstractC3430a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final DocumentFile.Remote document;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveDocument(@NotNull String documentId, @NotNull DocumentFile.Remote document) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(document, "document");
                this.documentId = documentId;
                this.document = document;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final DocumentFile.Remote getDocument() {
                return this.document;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveDocument)) {
                    return false;
                }
                RemoveDocument removeDocument = (RemoveDocument) other;
                return Intrinsics.m31980c(this.documentId, removeDocument.documentId) && Intrinsics.m31980c(this.document, removeDocument.document);
            }

            public int hashCode() {
                return (this.documentId.hashCode() * 31) + this.document.hashCode();
            }

            @NotNull
            public String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$g */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class g extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final g f13093a = new g();

            public g() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1818587564;
            }

            @NotNull
            public String toString() {
                return "SelectDocument";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$h */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class h extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final h f13094a = new h();

            public h() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1457257560;
            }

            @NotNull
            public String toString() {
                return "SelectPhotoFromLibrary";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$i, reason: from toString */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Submit extends AbstractC3430a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(@NotNull String documentId) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submit) && Intrinsics.m31980c(this.documentId, ((Submit) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            @NotNull
            public String toString() {
                return "Submit(documentId=" + this.documentId + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$j */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class j extends AbstractC3430a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final j f13096a = new j();

            public j() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -623405138;
            }

            @NotNull
            public String toString() {
                return "TakePhoto";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3430a() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "", "<init>", "()V", "b", "a", "c", "d", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3431b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends AbstractC3431b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f13097a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 89823627;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b extends AbstractC3431b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f13098a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1234032835;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$c, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Errored extends AbstractC3431b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Errored(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Errored) && Intrinsics.m31980c(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$d */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class d extends AbstractC3431b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f13100a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1784519914;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3431b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3431b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3433d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13141a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13142b;

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
            f13141a = iArr;
            int[] iArr2 = new int[State.EnumC3429a.values().length];
            try {
                iArr2[State.EnumC3429a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[State.EnumC3429a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[State.EnumC3429a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[State.EnumC3429a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[State.EnumC3429a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f13142b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4", m39664f = "DocumentWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3434e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13143t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, State, AbstractC3431b, Object>.a f13144u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ DocumentWorkflow f13145v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f13146w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State, ? extends com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3434e(AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar, DocumentWorkflow documentWorkflow, String str, InterfaceC9557b<? super C3434e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13144u = aVar;
            this.f13145v = documentWorkflow;
            this.f13146w = str;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m16553r(String str, AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = objM48901c instanceof State.ReviewCapturesWithoutDocumentId ? (State.ReviewCapturesWithoutDocumentId) objM48901c : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(new State.ReviewCaptures(reviewCapturesWithoutDocumentId.mo16476m(), str, null, new State.UploadState.UploadFiles(str), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3434e(this.f13144u, this.f13145v, this.f13146w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13143t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, State, ? extends AbstractC3431b>> interfaceC13215hMo48837d = this.f13144u.mo48837d();
            DocumentWorkflow documentWorkflow = this.f13145v;
            final String str = this.f13146w;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.j2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DocumentWorkflow.C3434e.m16553r(str, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3434e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", m39664f = "DocumentWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3435f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13147t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, State, AbstractC3431b, Object>.a f13148u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ DocumentWorkflow f13149v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ State.UploadState f13150w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input, com.withpersona.sdk2.inquiry.document.DocumentWorkflow$State, ? extends com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3435f(AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar, DocumentWorkflow documentWorkflow, State.UploadState uploadState, InterfaceC9557b<? super C3435f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13148u = aVar;
            this.f13149v = documentWorkflow;
            this.f13150w = uploadState;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m16555r(State.UploadState uploadState, AbstractC13225r.c cVar) {
            cVar.m48903e(State.m16470i((State) cVar.m48901c(), new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId()), null, null, null, 14, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3435f(this.f13148u, this.f13149v, this.f13150w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13147t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, State, ? extends AbstractC3431b>> interfaceC13215hMo48837d = this.f13148u.mo48837d();
            DocumentWorkflow documentWorkflow = this.f13149v;
            final State.UploadState uploadState = this.f13150w;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.k2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DocumentWorkflow.C3435f.m16555r(uploadState, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3435f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public DocumentWorkflow(@NotNull InterfaceC7479s imageLoader, @NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull C3438a documentCameraWorker, @NotNull C3446i.b documentsSelectWorkerFactory, @NotNull C3451a.a documentCreateWorker, @NotNull C3455e.a documentLoadWorker, @NotNull C3453c.a documentFileUploadWorker, @NotNull C1475a.a documentFileDeleteWorker, @NotNull C3457g.a documentSubmitWorker, @NotNull C11930a navigationStateManager, @NotNull C10309c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(documentCameraWorker, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(documentCreateWorker, "documentCreateWorker");
        Intrinsics.checkNotNullParameter(documentLoadWorker, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(documentFileUploadWorker, "documentFileUploadWorker");
        Intrinsics.checkNotNullParameter(documentFileDeleteWorker, "documentFileDeleteWorker");
        Intrinsics.checkNotNullParameter(documentSubmitWorker, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorker = documentCreateWorker;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorker = documentFileUploadWorker;
        this.documentFileDeleteWorker = documentFileDeleteWorker;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: A1 */
    public static final AbstractC13225r m16281A1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16283B1(it, documentWorkflow, state, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: B1 */
    public static final Unit m16283B1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = C3433d.f13141a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.m48903e(c3438a.m16564e(string) ? state.m16471a(State.EnumC3429a.CameraRunning) : state.m16471a(State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            action.m48903e(state.m16471a(State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m16285C0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C1 */
    public static final AbstractC13225r m16286C1(DocumentWorkflow documentWorkflow, final C3455e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3455e.b.C14123b) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16289D1(it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3455e.b.a) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16292E1(it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m16288D0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m16289D1(C3455e.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        State.ReviewCaptures reviewCaptures = objM48901c instanceof State.ReviewCaptures ? (State.ReviewCaptures) objM48901c : null;
        if (reviewCaptures == null) {
            return Unit.f29331a;
        }
        State.UploadState.ReadyToSubmit readyToSubmit = new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
        List<DocumentFile> listM16745a = ((C3455e.b.C14123b) bVar).m16745a();
        List<DocumentFile> listMo16476m = reviewCaptures.mo16476m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo16476m) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        action.m48903e(State.ReviewCaptures.m16479p(reviewCaptures, CollectionsKt.m31725w0(listM16745a, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m16291E0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m16292E1(C3455e.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new AbstractC3431b.Errored(((C3455e.b.a) bVar).getCause()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m16294F0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F1 */
    public static final Unit m16295F1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m16297G0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Unit m16298G1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m16300H0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m16302I0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.m16427K0(aVar, AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J1 */
    public static final AbstractC13225r m16304J1(DocumentWorkflow documentWorkflow, final Input input, final C3438a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3438a.b.C14111b) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16306K1(it, input, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.m31980c(it, C3438a.b.a.f13163a)) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.a2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16309L1((AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: K1 */
    public static final Unit m16306K1(C3438a.b bVar, Input input, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.UploadState uploadState = ((State) action.m48901c()).getUploadState();
        State.EnumC3429a enumC3429a = null;
        DocumentFile documentFile = null;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        action.m48903e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31726x0(((State) action.m48901c()).mo16476m(), new DocumentFile.Local(((C3438a.b.C14111b) bVar).getAbsoluteFilePath(), CaptureMethod.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), ((State) action.m48901c()).getDocumentId(), enumC3429a, uploadState, documentFile, z10, z11, str, 244, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m16308L0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(AbstractC3431b.b.f13098a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L1 */
    public static final Unit m16309L1(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16471a(State.EnumC3429a.None));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m16311M0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(AbstractC3431b.a.f13097a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M1 */
    public static final AbstractC13225r m16312M1(final DocumentWorkflow documentWorkflow, final Input input, final State state, final C3446i.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3446i.c.Success) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.b2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16315N1(it, input, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3446i.c.Failure) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.c2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16318O1(it, input, documentWorkflow, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.m31980c(it, C3446i.c.a.f13249a)) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.d2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16321P1(state, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m16314N0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16471a(State.EnumC3429a.SelectFileFromDocuments).m16472f(false));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N1 */
    public static final Unit m16315N1(C3446i.c cVar, Input input, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.EnumC3429a enumC3429a = null;
        action.m48903e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31725w0(((State) action.m48901c()).mo16476m(), C3444g.m16624b(((C3446i.c.Success) cVar).m16640a())), input.getDocumentFileLimit()), ((State) action.m48901c()).getDocumentId(), enumC3429a, ((State) action.m48901c()).getUploadState(), null, false, false, null, 244, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m16317O0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16471a(State.EnumC3429a.SelectImageFromPhotoLibrary).m16472f(false));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O1 */
    public static final Unit m16318O1(C3446i.c cVar, Input input, DocumentWorkflow documentWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.EnumC3429a enumC3429a = null;
        action.m48903e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31725w0(((State) action.m48901c()).mo16476m(), C3444g.m16624b(((C3446i.c.Failure) cVar).m16639a())), input.getDocumentFileLimit()), ((State) action.m48901c()).getDocumentId(), enumC3429a, ((State) action.m48901c()).getUploadState(), null, false, false, documentWorkflow.applicationContext.getString(C12244g.f43257m), 116, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m16320P0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16471a(State.EnumC3429a.CheckCameraPermissions).m16472f(false));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P1 */
    public static final Unit m16321P1(State state, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(state.m16471a(State.EnumC3429a.None));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m16323Q0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16472f(true));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q1 */
    public static final AbstractC13225r m16324Q1(DocumentWorkflow documentWorkflow, final C3451a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3451a.b.C14119b) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16327R1(it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3451a.b.Error) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16330S1(it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m16326R0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(((State) action.m48901c()).m16472f(false));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R1 */
    public static final Unit m16327R1(C3451a.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        C3451a.b.C14119b c14119b = (C3451a.b.C14119b) bVar;
        action.m48903e(State.m16470i((State) action.m48901c(), new State.UploadState.ReadyToSubmit(c14119b.getDocumentId()), c14119b.getDocumentId(), null, null, 12, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m16329S0(AbstractC3430a abstractC3430a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.m48901c() instanceof State.ReviewCaptures) {
            AbstractC3430a.RemoveDocument removeDocument = (AbstractC3430a.RemoveDocument) abstractC3430a;
            action.m48903e(State.m16470i((State) action.m48901c(), new State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m16330S1(C3451a.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        C3451a.b.Error error = (C3451a.b.Error) bVar;
        if (!error.getCause().isRecoverable()) {
            action.m48902d(new AbstractC3431b.Errored(error.getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m16332T0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State state = (State) action.m48901c();
        if (state instanceof State.ReviewCaptures) {
            action.m48903e(State.ReviewCaptures.m16479p((State.ReviewCaptures) state, null, null, null, null, null, false, false, null, 127, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T1 */
    public static final AbstractC13225r m16333T1(final DocumentWorkflow documentWorkflow, final State.UploadState uploadState, final DocumentFile.Local local, final Input input, final C3453c.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof C3453c.b.d) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16336U1(uploadState, response, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof C3453c.b.c) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16338V1(local, response, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof C3453c.b.a) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16341W1(local, uploadState, response, documentWorkflow, input, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof C3453c.b.C14120b) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16344X1(response, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m16335U0(AbstractC3430a abstractC3430a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        AbstractC3430a.Submit submit = (AbstractC3430a.Submit) abstractC3430a;
        action.m48903e(new State.UploadDocument(((State) action.m48901c()).mo16476m(), submit.getDocumentId(), new State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m16336U1(State.UploadState uploadState, C3453c.b bVar, AbstractC13225r.c action) {
        State.UploadState readyToSubmit;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> listMo16476m = ((State) action.m48901c()).mo16476m();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16476m, 10));
        for (Parcelable parcelableM16726a : listMo16476m) {
            C3453c.b.d dVar = (C3453c.b.d) bVar;
            if (Intrinsics.m31980c(parcelableM16726a, dVar.getOldLocalDocument())) {
                parcelableM16726a = dVar.getNewRemoteDocument();
            }
            arrayList.add(parcelableM16726a);
        }
        if (arrayList.isEmpty()) {
            readyToSubmit = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
            break;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                readyToSubmit = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((DocumentFile) obj) instanceof DocumentFile.Local) {
                readyToSubmit = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                break;
            }
        }
        action.m48903e(State.m16470i((State) action.m48901c(), readyToSubmit, null, arrayList, null, 10, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V1 */
    public static final Unit m16338V1(DocumentFile.Local local, C3453c.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> listMo16476m = ((State) action.m48901c()).mo16476m();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16476m, 10));
        for (Parcelable parcelableM16255f : listMo16476m) {
            if ((parcelableM16255f instanceof DocumentFile.Local) && Intrinsics.m31980c(parcelableM16255f, local)) {
                parcelableM16255f = DocumentFile.Local.m16255f((DocumentFile.Local) parcelableM16255f, null, null, ((C3453c.b.c) bVar).getProgressPercentage(), 3, null);
            }
            arrayList.add(parcelableM16255f);
        }
        action.m48903e(State.m16470i((State) action.m48901c(), ((State) action.m48901c()).getUploadState(), null, arrayList, null, 10, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m16340W0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W1 */
    public static final Unit m16341W1(DocumentFile.Local local, State.UploadState uploadState, C3453c.b bVar, DocumentWorkflow documentWorkflow, Input input, AbstractC13225r.c action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List listV0 = CollectionsKt.m31724v0(((State) action.m48901c()).mo16476m(), local);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
            break;
        }
        State.UploadState uploadState2 = uploadFiles;
        C3453c.b.a aVar = (C3453c.b.a) bVar;
        DocumentFile documentFile = null;
        action.m48903e(new State.ReviewCaptures(listV0, ((State.UploadState.UploadFiles) uploadState).getDocumentId(), State.EnumC3429a.None, uploadState2, documentFile, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, C3444g.m16625c(aVar.getCause(), documentWorkflow.applicationContext, input), 80, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final Unit m16343X0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X1 */
    public static final Unit m16344X1(C3453c.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new AbstractC3431b.Errored(((C3453c.b.C14120b) bVar).getCause()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m16346Y0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final AbstractC13225r m16347Y1(DocumentWorkflow documentWorkflow, final DocumentFile.Remote remote, final State.UploadState uploadState, final C1475a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16350Z1(remote, uploadState, response, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m16349Z0(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Unit m16350Z1(DocumentFile.Remote remote, State.UploadState uploadState, C1475a.b bVar, AbstractC13225r.c action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        State.ReviewCaptures reviewCaptures = objM48901c instanceof State.ReviewCaptures ? (State.ReviewCaptures) objM48901c : null;
        if (reviewCaptures == null) {
            return Unit.f29331a;
        }
        List listV0 = CollectionsKt.m31724v0(reviewCaptures.mo16476m(), remote);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
            break;
        }
        State.UploadState uploadState2 = uploadFiles;
        if (bVar instanceof C1475a.b.C14096b) {
            action.m48903e(State.ReviewCaptures.m16479p(reviewCaptures, listV0, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(bVar instanceof C1475a.b.Error)) {
                throw new C7345l();
            }
            action.m48902d(new AbstractC3431b.Errored(((C1475a.b.Error) bVar).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m16352a1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        documentWorkflow.m16427K0(aVar, new AbstractC3430a.RemoveDocument(((State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m16354b1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar, State state) {
        documentWorkflow.m16427K0(aVar, new AbstractC3430a.Submit(((State.ReviewCaptures) state).getDocumentId()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m16356c1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m16358d1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m16360e1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.d.f13089a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f1 */
    public static final AbstractC13225r m16362f1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16364g1(it, documentWorkflow, state, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m16364g1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = C3433d.f13141a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.m48903e(c3438a.m16564e(string) ? state.m16471a(State.EnumC3429a.CameraRunning) : state.m16471a(State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            action.m48903e(state.m16471a(State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m16367h1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m16370i1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Unit m16373j1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m16376k1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m16379l1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m16382m1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m16385n1(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m16388o1() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m16391p1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m16394q1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m16397r1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.d.f13089a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s1 */
    public static final AbstractC13225r m16400s1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16403t1(it, documentWorkflow, state, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m16403t1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = C3433d.f13141a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.m48903e(c3438a.m16564e(string) ? state.m16471a(State.EnumC3429a.CameraRunning) : state.m16471a(State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            action.m48903e(state.m16471a(State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m16406u1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v1 */
    public static final AbstractC13225r m16409v1(DocumentWorkflow documentWorkflow, final C3457g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C3457g.b.C14124b.f13425a)) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16412w1((AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3457g.b.Error) {
            return C13233z.m48946d(documentWorkflow, null, new Function1() { // from class: zn.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16415x1(it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: w1 */
    public static final Unit m16412w1(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(AbstractC3431b.d.f13100a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m16415x1(C3457g.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new AbstractC3431b.Errored(((C3457g.b.Error) bVar).getCause()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y1 */
    public static final Unit m16418y1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m16421z1(DocumentWorkflow documentWorkflow, AbstractC13218k.a aVar) {
        documentWorkflow.m16427K0(aVar, AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A0 */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m16422A0(DocumentStartPage documentStartPage, final AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar) {
        return new NestedUiStep.C4025a().m20520a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: zn.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16285C0(this.f48625a, aVar, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: zn.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16288D0(this.f48649a, aVar, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: zn.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16291E0(this.f48658a, aVar, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: zn.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16294F0(this.f48665a, aVar, (UiComponent) obj);
            }
        }).m20521b();
    }

    /* JADX INFO: renamed from: B0 */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m16423B0(UploadOptionsDialog uploadOptionsDialog, final AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar) {
        return new NestedUiStep.C4025a().m20520a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: zn.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16297G0(this.f48675a, aVar, (UiComponent) obj);
            }
        }).m20520a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: zn.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16300H0(this.f48678a, aVar, (UiComponent) obj);
            }
        }).m20520a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: zn.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16302I0(this.f48682a, aVar, (UiComponent) obj);
            }
        }).m20521b();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m16424H1(State.EnumC3429a enumC3429a, final Input input, final State state, AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar) {
        int i10 = C3433d.f13142b[enumC3429a.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            C13230w.m48937l(aVar, this.documentCameraWorker, C7731d0.m32011k(C3438a.class), "", new Function1() { // from class: zn.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16304J1(this.f48687a, input, (C3438a.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new C7345l();
            }
            C13230w.m48937l(aVar, state.getCaptureState() == State.EnumC3429a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.m16637c() : this.documentsSelectWorkerFactory.m16638e(), C7731d0.m32011k(C3446i.class), "", new Function1() { // from class: zn.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16312M1(this.f48693a, input, state, (C3446i.c) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m16425I1(final State.UploadState uploadState, final Input input, State state, AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar) {
        if (Intrinsics.m31980c(uploadState, State.UploadState.CreateDocument.f13075a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            C13230w.m48937l(aVar, this.documentCreateWorker.m16704a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), C7731d0.m32011k(C3451a.class), "", new Function1() { // from class: zn.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16324Q1(this.f48715a, (C3451a.b) obj);
                }
            });
            return;
        }
        if (!(uploadState instanceof State.UploadState.UploadFiles)) {
            if (!(uploadState instanceof State.UploadState.DeleteFiles)) {
                if (!(uploadState instanceof State.UploadState.ReadyToSubmit)) {
                    throw new C7345l();
                }
                return;
            } else {
                if (state instanceof State.ReviewCaptures) {
                    State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) state;
                    DocumentFile documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    C13230w.m48937l(aVar, this.documentFileDeleteWorker.m7576a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), C7731d0.m32011k(C1475a.class), "", new Function1() { // from class: zn.b1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DocumentWorkflow.m16347Y1(this.f48560a, remote, uploadState, (C1475a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<DocumentFile> listMo16476m = state.mo16476m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo16476m) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.mo48835b("upload_complete", new C3435f(aVar, this, uploadState, null));
            return;
        }
        for (final DocumentFile.Local local : CollectionsKt.m31682H0(arrayList, 3)) {
            C3453c.a aVar2 = this.documentFileUploadWorker;
            String sessionToken = input.getSessionToken();
            String documentId = ((State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            C13230w.m48937l(aVar, aVar2.m16722a(sessionToken, documentId, local, z10), C7731d0.m32011k(C3453c.class), local.getAbsoluteFilePath(), new Function1() { // from class: zn.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DocumentWorkflow.m16333T1(this.f48550a, uploadState, local, input, (C3453c.b) obj2);
                }
            });
        }
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public State mo16430d(@NotNull Input props, @Nullable Snapshot snapshot) {
        State stateM16472f;
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
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable2);
                Intrinsics.checkNotNullExpressionValue(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            State state = (State) parcelable;
            if (state != null && (stateM16472f = state.m16472f(false)) != null) {
                return stateM16472f;
            }
        }
        StartPage startPage = props.getStartPage();
        if (Intrinsics.m31980c(startPage, StartPage.Prompt.f13045a)) {
            return new State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (startPage instanceof StartPage.Review) {
            return new State.ReviewCaptures(C7699p.m31892k(), ((StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m16427K0(AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a aVar, final AbstractC3430a abstractC3430a) {
        AbstractC13225r<? super Object, State, ? extends Object> abstractC13225rM48946d;
        if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.b.f13087a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16308L0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.a.f13086a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16311M0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.g.f13093a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16314N0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.h.f13094a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16317O0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.j.f13096a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.m1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16320P0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.e.f13090a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16323Q0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.c.f13088a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16326R0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (abstractC3430a instanceof AbstractC3430a.RemoveDocument) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16329S0(abstractC3430a, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.m31980c(abstractC3430a, AbstractC3430a.d.f13089a)) {
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16332T0((AbstractC13225r.c) obj);
                }
            }, 1, null);
        } else {
            if (!(abstractC3430a instanceof AbstractC3430a.Submit)) {
                throw new C7345l();
            }
            abstractC13225rM48946d = C13233z.m48946d(this, null, new Function1() { // from class: zn.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16335U0(abstractC3430a, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        aVar.mo48837d().mo17905a(abstractC13225rM48946d);
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull Input renderProps, @NotNull final State renderState, @NotNull final AbstractC13218k<? super Input, State, ? extends AbstractC3431b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof State.UploadDocument), false, 8, null);
        m16424H1(renderState.getCaptureState(), renderProps, renderState, context);
        m16425I1(renderState.getUploadState(), renderProps, renderState, context);
        C3444g.m16623a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof State.Start) {
            Object c3439b = new C3439b(C1147b.m6492a(renderProps.getPages().getDocumentStartPage()), m16422A0(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.m44528b(), new Function0() { // from class: zn.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16340W0(this.f48663a, context);
                }
            }, new Function0() { // from class: zn.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16343X0(this.f48673a, context);
                }
            }, null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles(), 32, null);
            State.Start start = (State.Start) renderState;
            if (start.getShouldShowUploadOptionsDialog()) {
                c3439b = C9838d.m38723a(C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16423B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: zn.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentWorkflow.m16370i1(this.f48578a, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), c3439b, "document_upload_options_dialog");
            }
            boolean z10 = start.getCaptureState() == State.EnumC3429a.CheckCameraPermissions;
            EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
            String permissionsTitle = renderProps.getPermissionsTitle();
            String str = permissionsTitle != null ? permissionsTitle : "";
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(C12244g.f43250f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(C12244g.f43249e, C7259g.m30268b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return C3858g.m19166d(c3439b, context, z10, enumC11024i0, (3592 & 8) != 0 ? false : false, str, permissionsRationale, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : null, new Function1() { // from class: zn.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16281A1(this.f48583a, renderState, (PermissionRequestWorkflow.Output) obj);
                }
            });
        }
        if (renderState instanceof State.ReviewCaptures) {
            State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                C13230w.m48937l(context, this.documentLoadWorker.m16743a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), C7731d0.m32011k(C3455e.class), "", new Function1() { // from class: zn.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentWorkflow.m16286C1(this.f48589a, (C3455e.b) obj);
                    }
                });
            }
            InterfaceC3432c.ReviewCaptures reviewCaptures2 = new InterfaceC3432c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.mo16476m(), this.navigationStateManager.m44528b(), new Function0() { // from class: zn.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16295F1(this.f48596a, context);
                }
            }, new Function0() { // from class: zn.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16298G1(this.f48601a, context);
                }
            }, new Function0() { // from class: zn.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16346Y0(this.f48608a, context);
                }
            }, new Function0() { // from class: zn.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16349Z0(this.f48612a, context);
                }
            }, new Function1() { // from class: zn.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16352a1(this.f48616a, context, renderState, (DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: zn.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16354b1(this.f48557a, context, renderState);
                }
            }, new Function0() { // from class: zn.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16356c1(this.f48621a, context);
                }
            }, new Function0() { // from class: zn.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16358d1(this.f48700a, context);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.mo16476m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.mo16476m().isEmpty() && Intrinsics.m31980c(reviewCaptures.getUploadState(), new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: zn.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16360e1(this.f48603a, context);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
            boolean z11 = reviewCaptures.getCaptureState() == State.EnumC3429a.CheckCameraPermissions;
            EnumC11024i0 enumC11024i1 = EnumC11024i0.Camera;
            String permissionsTitle2 = renderProps.getPermissionsTitle();
            if (permissionsTitle2 == null) {
                permissionsTitle2 = "";
            }
            String permissionsRationale2 = renderProps.getPermissionsRationale();
            if (permissionsRationale2 == null) {
                permissionsRationale2 = this.applicationContext.getString(C12244g.f43250f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
            }
            Context context3 = this.applicationContext;
            String string2 = context3.getString(C12244g.f43249e, C7259g.m30268b(context3));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            C9837c c9837cM19166d = C3858g.m19166d(reviewCaptures2, context, z11, enumC11024i1, (3592 & 8) != 0 ? false : false, permissionsTitle2, permissionsRationale2, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : null, new Function1() { // from class: zn.t1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16362f1(this.f48680a, renderState, (PermissionRequestWorkflow.Output) obj);
                }
            });
            return reviewCaptures.getShouldShowUploadOptionsDialog() ? C9838d.m38723a(C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16423B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: zn.e2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16367h1(this.f48581a, context);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), c9837cM19166d, "document_upload_screen") : new C9837c(c9837cM19166d, C7699p.m31892k(), "document_upload_screen");
        }
        if (!(renderState instanceof State.ReviewCapturesWithoutDocumentId)) {
            if (!(renderState instanceof State.UploadDocument)) {
                throw new C7345l();
            }
            C13230w.m48937l(context, this.documentSubmitWorker.m16759a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((State.UploadDocument) renderState).mo16476m()), C7731d0.m32011k(C3457g.class), "", new Function1() { // from class: zn.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.m16409v1(this.f48549a, (C3457g.b) obj);
                }
            });
            C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
            return new InterfaceC3432c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.m44528b(), new Function0() { // from class: zn.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16418y1(this.f48567a, context);
                }
            }, new Function0() { // from class: zn.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.m16421z1(this.f48573a, context);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, 512, null);
        }
        State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (State.ReviewCapturesWithoutDocumentId) renderState;
        String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
        if (documentId != null) {
            context.mo48835b(documentId, new C3434e(context, this, documentId, null));
        }
        InterfaceC3432c.ReviewCaptures reviewCaptures3 = new InterfaceC3432c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.mo16476m(), this.navigationStateManager.m44528b(), new Function0() { // from class: zn.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16373j1(this.f48593a, context);
            }
        }, new Function0() { // from class: zn.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16376k1(this.f48598a, context);
            }
        }, new Function0() { // from class: zn.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16379l1(this.f48605a, context);
            }
        }, new Function0() { // from class: zn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16382m1(this.f48667a, context);
            }
        }, new Function1() { // from class: zn.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16385n1((DocumentFile.Remote) obj);
            }
        }, new Function0() { // from class: zn.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16388o1();
            }
        }, new Function0() { // from class: zn.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16391p1(this.f48685a, context);
            }
        }, new Function0() { // from class: zn.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16394q1(this.f48691a, context);
            }
        }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.mo16476m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: zn.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16397r1(this.f48698a, context);
            }
        }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
        boolean z12 = reviewCapturesWithoutDocumentId.getCaptureState() == State.EnumC3429a.CheckCameraPermissions;
        EnumC11024i0 enumC11024i2 = EnumC11024i0.Camera;
        String permissionsTitle3 = renderProps.getPermissionsTitle();
        if (permissionsTitle3 == null) {
            permissionsTitle3 = "";
        }
        String permissionsRationale3 = renderProps.getPermissionsRationale();
        if (permissionsRationale3 == null) {
            permissionsRationale3 = this.applicationContext.getString(C12244g.f43250f);
            Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
        }
        String str2 = permissionsRationale3;
        Context context4 = this.applicationContext;
        String string3 = context4.getString(C12244g.f43249e, C7259g.m30268b(context4));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C9837c c9837cM19166d2 = C3858g.m19166d(reviewCaptures3, context, z12, enumC11024i2, (3592 & 8) != 0 ? false : false, permissionsTitle3, str2, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : null, new Function1() { // from class: zn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.m16400s1(this.f48707a, renderState, (PermissionRequestWorkflow.Output) obj);
            }
        });
        return reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? C9838d.m38723a(C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16423B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: zn.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.m16406u1(this.f48713a, context);
            }
        }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), c9837cM19166d2, "document_upload_screen") : new C9837c(c9837cM19166d2, C7699p.m31892k(), "document_upload_screen");
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "Lar/p;", "b", "()Lar/p;", "bottomSheet", "c", "a", "Lcom/withpersona/sdk2/inquiry/document/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3432c {
        @Nullable
        /* JADX INFO: renamed from: b */
        UiStepBottomSheet getBottomSheet();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c$b */
        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0012\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0016\u0010$¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "Lar/p;", "bottomSheet", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lar/p;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "g", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "Lar/p;", "()Lar/p;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC3432c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public b(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.uiScreen = uiScreen;
                this.navigationState = navigationState;
                this.styles = documentStepStyle;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
                this.bottomSheet = uiStepBottomSheet;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.InterfaceC3432c
            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function0<Unit> m16529d() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final Function0<Unit> m16530e() {
                return this.onCancel;
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: g, reason: from getter */
            public final UiComponentScreen getUiScreen() {
                return this.uiScreen;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
              (r2v0 com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen)
              (r3v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle)
              (r5v0 kotlin.jvm.functions.Function0)
              (r6v0 kotlin.jvm.functions.Function0)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
              (wrap ar.p:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null ar.p) : (r8v0 ar.p))
             A[MD:(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, ar.p):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c.b.<init>(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, ar.p):void type: THIS */
            public /* synthetic */ b(UiComponentScreen uiComponentScreen, NavigationState navigationState, StepStyles.DocumentStepStyle documentStepStyle, Function0 function0, Function0 function1, String str, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiComponentScreen, navigationState, documentStepStyle, function0, function1, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : uiStepBottomSheet);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b \u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b#\u00107¨\u00068"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", Title.type, "prompt", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "navBarTitle", "Lar/p;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Lar/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "g", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getNavBarTitle", "j", "Lar/p;", "()Lar/p;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class LoadingAnimation implements InterfaceC3432c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @Nullable
            public final NextStep.Document.AssetConfig.PendingPage assetConfig;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public LoadingAnimation(@Nullable String str, @Nullable String str2, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable NextStep.Document.AssetConfig.PendingPage pendingPage, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str3, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.navBarTitle = str3;
                this.bottomSheet = uiStepBottomSheet;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final NextStep.Document.AssetConfig.PendingPage getAssetConfig() {
                return this.assetConfig;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.InterfaceC3432c
            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function0<Unit> m16521d() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final Function0<Unit> m16522e() {
                return this.onCancel;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) other;
                return Intrinsics.m31980c(this.title, loadingAnimation.title) && Intrinsics.m31980c(this.prompt, loadingAnimation.prompt) && Intrinsics.m31980c(this.navigationState, loadingAnimation.navigationState) && Intrinsics.m31980c(this.onBack, loadingAnimation.onBack) && Intrinsics.m31980c(this.onCancel, loadingAnimation.onCancel) && Intrinsics.m31980c(this.styles, loadingAnimation.styles) && Intrinsics.m31980c(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition && Intrinsics.m31980c(this.navBarTitle, loadingAnimation.navBarTitle) && Intrinsics.m31980c(this.bottomSheet, loadingAnimation.bottomSheet);
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* JADX INFO: renamed from: h, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                int iHashCode4 = (((iHashCode3 + (pendingPage == null ? 0 : pendingPage.hashCode())) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31;
                String str3 = this.navBarTitle;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                UiStepBottomSheet uiStepBottomSheet = this.bottomSheet;
                return iHashCode5 + (uiStepBottomSheet != null ? uiStepBottomSheet.hashCode() : 0);
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public String toString() {
                return "LoadingAnimation(title=" + this.title + ", prompt=" + this.prompt + ", navigationState=" + this.navigationState + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", navBarTitle=" + this.navBarTitle + ", bottomSheet=" + this.bottomSheet + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
              (r2v0 java.lang.String)
              (r3v0 java.lang.String)
              (r4v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (r5v0 kotlin.jvm.functions.Function0)
              (r6v0 kotlin.jvm.functions.Function0)
              (r7v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle)
              (r8v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage)
              (r9v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
              (wrap ar.p:?: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null ar.p) : (r11v0 ar.p))
             A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.String, ar.p):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c.a.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig$PendingPage, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, java.lang.String, ar.p):void type: THIS */
            public /* synthetic */ LoadingAnimation(String str, String str2, NavigationState navigationState, Function0 function0, Function0 function1, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextPosition, String str3, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, navigationState, function0, function1, documentStepStyle, pendingPage, pendingPageTextPosition, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : uiStepBottomSheet);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c$c, reason: from toString */
        @Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b9\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bF\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bO\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bI\u0010ER\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010P\u001a\u0004\b7\u0010QR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\b0\u0010QR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bS\u0010QR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010(R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bK\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010VR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bB\u0010(R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b4\u0010Z¨\u0006["}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lk6/s;", "imageLoader", "", Title.type, "prompt", "disclaimer", "submitButtonText", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "onRemove", "onSubmit", "onCancel", "onBack", "", "disabled", "addButtonEnabled", "submitButtonEnabled", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "navBarTitle", "Lar/p;", "bottomSheet", "<init>", "(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lar/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lk6/s;", "g", "()Lk6/s;", "b", "Ljava/lang/String;", "t", "c", "p", "d", "e", "s", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "i", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "getOpenSelectFile", "()Lkotlin/jvm/functions/Function0;", "getSelectFromPhotoLibrary", "j", "getOpenCamera", "k", "o", "l", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "n", "Z", "()Z", "q", "r", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "v", "w", "Lar/p;", "()Lar/p;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ReviewCaptures implements InterfaceC3432c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InterfaceC7479s imageLoader;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @Nullable
            public final String submitButtonText;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openSelectFile;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> selectFromPhotoLibrary;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openCamera;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openUploadOptions;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function1<DocumentFile.Remote, Unit> onRemove;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onSubmit;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
            public final boolean disabled;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
            public final boolean addButtonEnabled;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
            public final boolean submitButtonEnabled;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
            /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.document.DocumentFile$Remote, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull InterfaceC7479s imageLoader, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<? extends DocumentFile> documents, @NotNull NavigationState navigationState, @NotNull Function0<Unit> openSelectFile, @NotNull Function0<Unit> selectFromPhotoLibrary, @NotNull Function0<Unit> openCamera, @NotNull Function0<Unit> openUploadOptions, @NotNull Function1<? super DocumentFile.Remote, Unit> onRemove, @NotNull Function0<Unit> onSubmit, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onBack, boolean z10, boolean z11, boolean z12, @Nullable String str5, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable String str6, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(openSelectFile, "openSelectFile");
                Intrinsics.checkNotNullParameter(selectFromPhotoLibrary, "selectFromPhotoLibrary");
                Intrinsics.checkNotNullParameter(openCamera, "openCamera");
                Intrinsics.checkNotNullParameter(openUploadOptions, "openUploadOptions");
                Intrinsics.checkNotNullParameter(onRemove, "onRemove");
                Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.imageLoader = imageLoader;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = documents;
                this.navigationState = navigationState;
                this.openSelectFile = openSelectFile;
                this.selectFromPhotoLibrary = selectFromPhotoLibrary;
                this.openCamera = openCamera;
                this.openUploadOptions = openUploadOptions;
                this.onRemove = onRemove;
                this.onSubmit = onSubmit;
                this.onCancel = onCancel;
                this.onBack = onBack;
                this.disabled = z10;
                this.addButtonEnabled = z11;
                this.submitButtonEnabled = z12;
                this.error = str5;
                this.onErrorDismissed = onErrorDismissed;
                this.styles = documentStepStyle;
                this.navBarTitle = str6;
                this.bottomSheet = uiStepBottomSheet;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAddButtonEnabled() {
                return this.addButtonEnabled;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.InterfaceC3432c
            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getDisabled() {
                return this.disabled;
            }

            @Nullable
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final List<DocumentFile> m16536e() {
                return this.documents;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.m31980c(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.m31980c(this.title, reviewCaptures.title) && Intrinsics.m31980c(this.prompt, reviewCaptures.prompt) && Intrinsics.m31980c(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.m31980c(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.m31980c(this.documents, reviewCaptures.documents) && Intrinsics.m31980c(this.navigationState, reviewCaptures.navigationState) && Intrinsics.m31980c(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.m31980c(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.m31980c(this.openCamera, reviewCaptures.openCamera) && Intrinsics.m31980c(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.m31980c(this.onRemove, reviewCaptures.onRemove) && Intrinsics.m31980c(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.m31980c(this.onCancel, reviewCaptures.onCancel) && Intrinsics.m31980c(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.m31980c(this.error, reviewCaptures.error) && Intrinsics.m31980c(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.m31980c(this.styles, reviewCaptures.styles) && Intrinsics.m31980c(this.navBarTitle, reviewCaptures.navBarTitle) && Intrinsics.m31980c(this.bottomSheet, reviewCaptures.bottomSheet);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @NotNull
            /* JADX INFO: renamed from: g, reason: from getter */
            public final InterfaceC7479s getImageLoader() {
                return this.imageLoader;
            }

            @Nullable
            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            public int hashCode() {
                int iHashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.openSelectFile.hashCode()) * 31) + this.selectFromPhotoLibrary.hashCode()) * 31) + this.openCamera.hashCode()) * 31) + this.openUploadOptions.hashCode()) * 31) + this.onRemove.hashCode()) * 31) + this.onSubmit.hashCode()) * 31) + this.onCancel.hashCode()) * 31) + this.onBack.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.addButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31;
                String str5 = this.error;
                int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int iHashCode7 = (iHashCode6 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                String str6 = this.navBarTitle;
                int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                UiStepBottomSheet uiStepBottomSheet = this.bottomSheet;
                return iHashCode8 + (uiStepBottomSheet != null ? uiStepBottomSheet.hashCode() : 0);
            }

            @NotNull
            /* JADX INFO: renamed from: i, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: j */
            public final Function0<Unit> m16541j() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: k */
            public final Function0<Unit> m16542k() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: l */
            public final Function0<Unit> m16543l() {
                return this.onErrorDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: m */
            public final Function1<DocumentFile.Remote, Unit> m16544m() {
                return this.onRemove;
            }

            @NotNull
            /* JADX INFO: renamed from: n */
            public final Function0<Unit> m16545n() {
                return this.onSubmit;
            }

            @NotNull
            /* JADX INFO: renamed from: o */
            public final Function0<Unit> m16546o() {
                return this.openUploadOptions;
            }

            @Nullable
            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            @Nullable
            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getSubmitButtonText() {
                return this.submitButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(imageLoader=" + this.imageLoader + ", title=" + this.title + ", prompt=" + this.prompt + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", documents=" + this.documents + ", navigationState=" + this.navigationState + ", openSelectFile=" + this.openSelectFile + ", selectFromPhotoLibrary=" + this.selectFromPhotoLibrary + ", openCamera=" + this.openCamera + ", openUploadOptions=" + this.openUploadOptions + ", onRemove=" + this.onRemove + ", onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onBack=" + this.onBack + ", disabled=" + this.disabled + ", addButtonEnabled=" + this.addButtonEnabled + ", submitButtonEnabled=" + this.submitButtonEnabled + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", navBarTitle=" + this.navBarTitle + ", bottomSheet=" + this.bottomSheet + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
              (r27v0 k6.s)
              (r28v0 java.lang.String)
              (r29v0 java.lang.String)
              (r30v0 java.lang.String)
              (r31v0 java.lang.String)
              (r32v0 java.util.List)
              (r33v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (r34v0 kotlin.jvm.functions.Function0)
              (r35v0 kotlin.jvm.functions.Function0)
              (r36v0 kotlin.jvm.functions.Function0)
              (r37v0 kotlin.jvm.functions.Function0)
              (r38v0 kotlin.jvm.functions.Function1)
              (r39v0 kotlin.jvm.functions.Function0)
              (r40v0 kotlin.jvm.functions.Function0)
              (r41v0 kotlin.jvm.functions.Function0)
              (r42v0 boolean)
              (r43v0 boolean)
              (r44v0 boolean)
              (r45v0 java.lang.String)
              (r46v0 kotlin.jvm.functions.Function0)
              (r47v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
              (wrap ar.p:?: TERNARY null = ((wrap int:0x000e: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null ar.p) : (r49v0 ar.p))
             A[MD:(k6.s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.document.DocumentFile$Remote, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, java.lang.String, ar.p):void (m)] (LINE:25) call: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c.c.<init>(k6.s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, java.lang.String, ar.p):void type: THIS */
            public /* synthetic */ ReviewCaptures(InterfaceC7479s interfaceC7479s, String str, String str2, String str3, String str4, List list, NavigationState navigationState, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function1 function4, Function0 function5, Function0 function6, Function0 function7, boolean z10, boolean z11, boolean z12, String str5, Function0 function8, StepStyles.DocumentStepStyle documentStepStyle, String str6, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC7479s, str, str2, str3, str4, list, navigationState, function0, function1, function2, function3, function4, function5, function6, function7, z10, z11, z12, str5, function8, documentStepStyle, (i10 & 2097152) != 0 ? null : str6, (i10 & 4194304) != 0 ? null : uiStepBottomSheet);
            }
        }
    }
}
