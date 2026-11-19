package es;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import eq.MrzKey;
import eq.PassportNfcStrings;
import hr.InquirySessionConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ln.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import rr.HelpBottomSheetViewModel;
import sr.GovernmentIdNfcData;
import zp.JpMyNumberNfcStrings;
import zp.JpMyNumberNfcValidOperation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 p2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004TVXZBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020$*\u00180 R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)JK\u0010.\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/JC\u00100\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020$*\b\u0012\u0004\u0012\u000203022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020$04H\u0002¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020$2\u0006\u00108\u001a\u0002032\u0006\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b;\u0010<JC\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\u00020$2\u0006\u0010>\u001a\u00020A2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002092\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJK\u0010H\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00032\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020K2\u0006\u0010Q\u001a\u00020\u0003H\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006q"}, d2 = {"Les/s6;", "Lln/k;", "Les/s6$b;", "Les/i4;", "Les/s6$c;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Leq/p$a;", "nfcScanWorkerFactory", "Lzp/u$a;", "scanJpMyNumberNfcWorkerFactory", "Lkq/c;", "sandboxFlags", "Les/o1$a;", "createReusablePersonaWorkerFactory", "Les/x6$a;", "verifyReusablePersonaWorkerFactory", "Lir/b;", "navigationStateManager", "Lfq/n1;", "permissionRequestWorkflow", "Les/k1;", "componentWorkHelper", "Ldr/c;", "externalEventLogger", "Lto/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Leq/p$a;Lzp/u$a;Lkq/c;Les/o1$a;Les/x6$a;Lir/b;Lfq/n1;Les/k1;Ldr/c;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lln/r$c;", "Lln/r;", "Les/i4$a;", "renderState", BuildConfig.FLAVOR, "D0", "(Lln/r$c;Les/i4$a;)V", "renderProps", "C0", "(Les/s6$b;Les/i4;)V", "Lln/k$a;", "context", "Les/i4$a$d;", "nfcScan", "n1", "(Les/s6$b;Les/i4$a;Lln/k$a;Les/i4$a$d;)V", "s0", "(Les/s6$b;Les/i4$a;Lln/k$a;)V", BuildConfig.FLAVOR, "Lqr/x5;", "Lkotlin/Function1;", "action", "E0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", BuildConfig.FLAVOR, "isTappedComponentVisible", "C1", "(Lqr/x5;ZLes/i4$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "q0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Les/i4$a;Lln/k$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "n0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Les/i4$a;Lln/k$a;)V", "B0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Les/i4$a$c;", "jpMyNumberNfcScan", "v1", "(Les/s6$b;Les/i4$a;Lln/k$a;Les/i4$a$c;)V", "props", "Lln/i;", "snapshot", "A0", "(Les/s6$b;Lln/i;)Les/i4;", "G0", "(Les/s6$b;Les/i4;Lln/k$a;)Ljava/lang/Object;", "state", "E1", "(Les/i4;)Lln/i;", "a", "Landroid/content/Context;", "b", "Leq/p$a;", "c", "Lzp/u$a;", "d", "Lkq/c;", "e", "Les/o1$a;", "f", "Les/x6$a;", "g", "Lir/b;", "h", "Lfq/n1;", "i", "Les/k1;", "j", "Ldr/c;", "k", "Lto/e;", "l", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", BuildConfig.FLAVOR, "m", "Ljava/lang/String;", "lastLoggedPage", "n", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s6 extends ln.k<Input, i4, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final eq.p.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zp.u.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o1.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x6.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fq.n1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k1 componentWorkHelper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String lastLoggedPage;

    /* JADX INFO: renamed from: es.s6$b, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010+R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b1\u0010>R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bK\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bI\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bE\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bP\u00109R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\bV\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bQ\u0010+¨\u0006W"}, d2 = {"Les/s6$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionToken", "inquiryId", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", BuildConfig.FLAVOR, "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lhr/g;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Les/g2;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "isRestoringState", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLhr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ZLjava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "A", "b", "p", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "d", "t", "e", "Z", "()Z", "f", "g", "h", "Lhr/g;", "q", "()Lhr/g;", "i", "o", "j", "n", "k", "getGpsPermissionsModalPositiveButton", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "s", "r", "w", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "u", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "v", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public final List<g2> serverComponentErrors;

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

        /* JADX INFO: renamed from: es.s6$b$a */
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
                        arrayList3.add(g2.CREATOR.createFromParcel(parcel));
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
        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @Nullable List<? extends UiComponentConfig> list, @NotNull String stepName, boolean z10, boolean z11, boolean z12, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable List<g2> list2, boolean z13, @Nullable InternalErrorInfo internalErrorInfo, boolean z14, @Nullable String str8) {
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

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
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
            List<g2> list2 = this.serverComponentErrors;
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
        /* JADX INFO: renamed from: l, reason: from getter */
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
        public final List<g2> s() {
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
            List<g2> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<g2> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
            dest.writeString(this.navBarTitle);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Les/s6$c;", BuildConfig.FLAVOR, "b", "f", "e", "d", "c", "a", "Les/s6$c$a;", "Les/s6$c$b;", "Les/s6$c$c;", "Les/s6$c$d;", "Les/s6$c$e;", "Les/s6$c$f;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/s6$c$a;", "Les/s6$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f14482a = new a();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/s6$c$b;", "Les/s6$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f14483a = new b();

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

        /* JADX INFO: renamed from: es.s6$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/s6$c$c;", "Les/s6$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0279c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0279c f14484a = new C0279c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0279c);
            }

            public int hashCode() {
                return -584917881;
            }

            @NotNull
            public String toString() {
                return "Completed";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Les/s6$c$d;", "Les/s6$c;", BuildConfig.FLAVOR, "message", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements c {

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

        /* JADX INFO: renamed from: es.s6$c$e, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Les/s6$c$e;", "Les/s6$c;", BuildConfig.FLAVOR, "canReuseWorkflow", "<init>", "(Z)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FinishedWithTransition implements c {

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

        /* JADX INFO: renamed from: es.s6$c$f, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Les/s6$c$f;", "Les/s6$c;", "Lqr/x5;", "fromComponent", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lqr/x5;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lqr/x5;", "b", "()Lqr/x5;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FinishedWithoutTransition implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final qr.x5 fromComponent;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, ComponentParam> componentParams;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String fromStep;

            /* JADX WARN: Multi-variable type inference failed */
            public FinishedWithoutTransition(@NotNull qr.x5 fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
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
            public final qr.x5 getFromComponent() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Les/s6$d;", BuildConfig.FLAVOR, "<init>", "()V", "a", "Les/s6$d$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015B\u0099\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012$\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR;\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bQ\u0010JR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bS\u0010JR5\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\b:\u0010XR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b?\u0010H\u001a\u0004\bY\u0010JR)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bE\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bG\u0010CR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010JR)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\ba\u0010VR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bM\u0010eR\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bf\u0010]R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bc\u0010JR\u0013\u0010i\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\b<\u0010hR\u0013\u0010j\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bK\u0010hR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Les/s6$d$a;", "Les/s6$d;", BuildConfig.FLAVOR, "Lqr/x5;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Les/g2;", "componentErrors", "Lir/a;", "navigationState", BuildConfig.FLAVOR, "navBarTitle", "Lkotlin/Function3;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "onClick", "Lkotlin/Function0;", "onComplete", "onCancel", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "launchJpMyNumberNfcScan", "launchActionFromHelpSheet", "launchSecondaryActionFromHelpSheet", "Lkotlin/Function2;", "Lqr/d6;", "onVerifyPersonaClick", "Les/s6$d$a$a;", "autoSubmit", "onBack", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "onSuggestionSelected", "isLoading", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "onCreateReusablePersonaClick", "Lrr/o;", "helpBottomSheetViewModel", "shouldLaunchHelpBottomSheet", "onHelpBottomSheetDismissed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lir/a;Ljava/lang/String;Lpu/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Les/s6$d$a$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lrr/o;ZLkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "d", "c", "e", "Lir/a;", "o", "()Lir/a;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "Lpu/n;", "r", "()Lpu/n;", "g", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "h", "q", "i", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "j", "k", "m", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "Les/s6$d$a$a;", "()Les/s6$d$a$a;", "p", "w", "Z", "B", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "t", "u", "v", "Lrr/o;", "()Lrr/o;", "z", BuildConfig.FLAVOR, "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "y", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<qr.x5> components;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final List<UiComponentConfig> componentConfigs;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<g2> componentErrors;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final pu.n<qr.x5, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;

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
            public final Function2<qr.d6, Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick;

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
            public final Function2<CreatePersonaSheetComponent, qr.x5, Unit> onCreateReusablePersonaClick;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final HelpBottomSheetViewModel helpBottomSheetViewModel;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            public final boolean shouldLaunchHelpBottomSheet;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onHelpBottomSheetDismissed;

            /* JADX INFO: renamed from: es.s6$d$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Les/s6$d$a$a;", BuildConfig.FLAVOR, "Lqr/d;", "component", BuildConfig.FLAVOR, "countdownText", BuildConfig.FLAVOR, "isReadyToSubmit", "<init>", "(Lqr/d;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqr/d;", "()Lqr/d;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AutoSubmit {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final qr.d component;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String countdownText;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                public final boolean isReadyToSubmit;

                public AutoSubmit(@NotNull qr.d component, @Nullable String str, boolean z10) {
                    Intrinsics.checkNotNullParameter(component, "component");
                    this.component = component;
                    this.countdownText = str;
                    this.isReadyToSubmit = z10;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final qr.d getComponent() {
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
            public a(@NotNull List<? extends qr.x5> components, @Nullable List<? extends UiComponentConfig> list, @NotNull List<g2> componentErrors, @NotNull ir.a navigationState, @Nullable String str, @NotNull pu.n<? super qr.x5, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> onClick, @NotNull Function0<Unit> onComplete, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan, @NotNull Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Function2<? super qr.d6, ? super Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick, @Nullable AutoSubmit autoSubmit, @NotNull Function0<Unit> onBack, @NotNull Function2<? super InputAddressComponent, ? super String, Unit> onSuggestionSelected, boolean z10, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @NotNull Function2<? super CreatePersonaSheetComponent, ? super qr.x5, Unit> onCreateReusablePersonaClick, @Nullable HelpBottomSheetViewModel helpBottomSheetViewModel, boolean z11, @NotNull Function0<Unit> onHelpBottomSheetDismissed) {
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
                    return as.d.a(uiStepStyle, context);
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
            public final List<g2> e() {
                return this.componentErrors;
            }

            @NotNull
            public final List<qr.x5> f() {
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
            public final ir.a getNavigationState() {
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
            public final pu.n<qr.x5, Boolean, Map<String, ? extends ComponentParam>, Unit> r() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> s() {
                return this.onComplete;
            }

            @NotNull
            public final Function2<CreatePersonaSheetComponent, qr.x5, Unit> t() {
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
            public final Function2<qr.d6, Map<String, ? extends ComponentParam>, Unit> x() {
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

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14514a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[fq.s1.values().length];
            try {
                iArr[fq.s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fq.s1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fq.s1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14514a = iArr;
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
    public static final class f implements Function1<qr.g0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f14515a = new f();

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(qr.g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14516t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, i4, c, Object>.a f14517u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s6 f14518v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i4 f14519w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ qr.i f14520x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ln.k<? super Input, i4, ? extends c, ? extends Object>.a aVar, s6 s6Var, i4 i4Var, qr.i iVar, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f14517u = aVar;
            this.f14518v = s6Var;
            this.f14519w = i4Var;
            this.f14520x = iVar;
        }

        public static final Unit p(i4 i4Var, qr.i iVar, ln.r.c cVar) {
            String strN;
            i4.Displaying displaying = (i4.Displaying) i4Var;
            Integer autoSubmitIntervalSeconds = iVar.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = iVar.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = iVar.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strN = p001kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strN = null;
            }
            cVar.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, new i4.Displaying.AutoSubmit(iVar, iIntValue, strN), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f14517u, this.f14518v, this.f14519w, this.f14520x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f14516t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Input, i4, ? extends c>> hVarD = this.f14517u.d();
            s6 s6Var = this.f14518v;
            final i4 i4Var = this.f14519w;
            final qr.i iVar = this.f14520x;
            hVarD.a(ln.z.d(s6Var, null, new Function1() { // from class: es.t6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s6.g.p(i4Var, iVar, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", f = "UiWorkflow.kt", l = {188}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14521t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, i4, c, Object>.a f14522u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s6 f14523v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i4.Displaying.AutoSubmit f14524w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ i4 f14525x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(ln.k<? super Input, i4, ? extends c, ? extends Object>.a aVar, s6 s6Var, i4.Displaying.AutoSubmit autoSubmit, i4 i4Var, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f14522u = aVar;
            this.f14523v = s6Var;
            this.f14524w = autoSubmit;
            this.f14525x = i4Var;
        }

        public static final Unit p(i4.Displaying.AutoSubmit autoSubmit, i4 i4Var, ln.r.c cVar) {
            int countdown = autoSubmit.getCountdown() - 1;
            i4.Displaying displaying = (i4.Displaying) i4Var;
            qr.d component = autoSubmit.getComponent();
            String autoSubmitCountdownText = autoSubmit.getComponent().getAutoSubmitCountdownText();
            cVar.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, new i4.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? p001kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new h(this.f14522u, this.f14523v, this.f14524w, this.f14525x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f14521t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f14521t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ln.h<ln.r<? super Input, i4, ? extends c>> hVarD = this.f14522u.d();
            s6 s6Var = this.f14523v;
            final i4.Displaying.AutoSubmit autoSubmit = this.f14524w;
            final i4 i4Var = this.f14525x;
            hVarD.a(ln.z.d(s6Var, null, new Function1() { // from class: es.u6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s6.h.p(autoSubmit, i4Var, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ i4.Displaying.NfcScan A;
        public final /* synthetic */ i4.Displaying B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14526t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, i4, c, Object>.a f14527u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s6 f14528v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f14529w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f14530x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f14531y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Date f14532z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(ln.k<? super Input, i4, ? extends c, ? extends Object>.a aVar, s6 s6Var, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, i4.Displaying.NfcScan nfcScan, i4.Displaying displaying, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f14527u = aVar;
            this.f14528v = s6Var;
            this.f14529w = attributes;
            this.f14530x = str;
            this.f14531y = date;
            this.f14532z = date2;
            this.A = nfcScan;
            this.B = displaying;
        }

        public static final Unit p(GovernmentIdNfcScan.Attributes attributes, s6 s6Var, String str, Date date, Date date2, i4.Displaying.NfcScan nfcScan, i4.Displaying displaying, ln.r.c cVar) {
            String string;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = s6Var.applicationContext.getString(jq.g.F);
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
            cVar.e(i4.Displaying.v(displaying, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new i(this.f14527u, this.f14528v, this.f14529w, this.f14530x, this.f14531y, this.f14532z, this.A, this.B, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f14526t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Input, i4, ? extends c>> hVarD = this.f14527u.d();
            final s6 s6Var = this.f14528v;
            final GovernmentIdNfcScan.Attributes attributes = this.f14529w;
            final String str = this.f14530x;
            final Date date = this.f14531y;
            final Date date2 = this.f14532z;
            final i4.Displaying.NfcScan nfcScan = this.A;
            final i4.Displaying displaying = this.B;
            hVarD.a(ln.z.d(s6Var, null, new Function1() { // from class: es.v6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s6.i.p(attributes, s6Var, str, date, date2, nfcScan, displaying, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    public s6(@NotNull Context applicationContext, @NotNull eq.p.a nfcScanWorkerFactory, @NotNull zp.u.a scanJpMyNumberNfcWorkerFactory, @NotNull kq.c sandboxFlags, @NotNull o1.a createReusablePersonaWorkerFactory, @NotNull x6.a verifyReusablePersonaWorkerFactory, @NotNull ir.b navigationStateManager, @NotNull fq.n1 permissionRequestWorkflow, @NotNull k1 componentWorkHelper, @NotNull dr.c externalEventLogger, @NotNull to.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit B1(i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        return Unit.f21506a;
    }

    public static final Unit D1(boolean z10, qr.x5 x5Var, qr.x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof qr.u2) {
            ((qr.u2) it).b(z10 ? Intrinsics.c(it.getName(), x5Var.getName()) : true);
        }
        return Unit.f21506a;
    }

    public static final Unit F0(Function1 function1, qr.x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f21506a;
    }

    public static final Unit H0(s6 s6Var, Input input, i4 i4Var, ln.k.a aVar, qr.x5 component) {
        Intrinsics.checkNotNullParameter(component, "component");
        s6Var.componentWorkHelper.n0(input, (i4.Displaying) i4Var, aVar, component);
        return Unit.f21506a;
    }

    public static final Unit I0(s6 s6Var, i4 i4Var, ln.k.a aVar) {
        TrackingEventsLogger.logUiStepButtonEvent$default(s6Var.trackingEventsLogger, UiStepButtonType.Complete, null, ((i4.Displaying) i4Var).getStepName(), false, 10, null);
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.u4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.J0((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit J0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(c.C0279c.f14484a);
        return Unit.f21506a;
    }

    public static final Unit K0(s6 s6Var, i4 i4Var, ln.k.a aVar, final Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(s6Var.trackingEventsLogger, UiStepButtonType.Cancel, null, ((i4.Displaying) i4Var).getStepName(), false, 10, null);
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.g5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.L0(input, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit L0(Input input, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(input.getFinalStep() ? c.C0279c.f14484a : c.b.f14483a);
        return Unit.f21506a;
    }

    public static final Unit M0(s6 s6Var, i4 i4Var, ln.k.a aVar, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        s6Var.q0(component, (i4.Displaying) i4Var, aVar);
        return Unit.f21506a;
    }

    public static final Unit N0(s6 s6Var, i4 i4Var, ln.k.a aVar, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        s6Var.n0(component, (i4.Displaying) i4Var, aVar);
        return Unit.f21506a;
    }

    public static final Unit O0(qr.g0 g0Var, s6 s6Var, i4 i4Var, ln.k.a aVar) {
        if (g0Var != null && (g0Var instanceof GovernmentIdNfcScanComponent)) {
            s6Var.q0((GovernmentIdNfcScanComponent) g0Var, (i4.Displaying) i4Var, aVar);
        }
        return Unit.f21506a;
    }

    public static final Unit P0(final qr.g0 g0Var, s6 s6Var, final i4 i4Var, ln.k.a aVar) {
        GovernmentIdNfcScan.Attributes attributes;
        String unableToScanTransitionComponentName;
        if (g0Var != null && (g0Var instanceof GovernmentIdNfcScanComponent) && (attributes = ((GovernmentIdNfcScanComponent) g0Var).getConfig().getAttributes()) != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
            s6Var.C1(g0Var, true, (i4.Displaying) i4Var);
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.m5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.Q0(i4Var, g0Var, (ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit Q0(i4 i4Var, qr.g0 g0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        GovernmentIdNfcScan.Attributes attributes = ((GovernmentIdNfcScanComponent) g0Var).getConfig().getAttributes();
        action.e(m1.b(displaying, attributes != null ? attributes.getUnableToScanTransitionComponentName() : null));
        return Unit.f21506a;
    }

    public static final Unit R0(s6 s6Var, final i4 i4Var, ln.k.a aVar, final qr.d6 component, final Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        s6Var.C1(component, true, (i4.Displaying) i4Var);
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.d5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.S0(i4Var, component, componentParams, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit S0(i4 i4Var, qr.d6 d6Var, Map map, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, new i4.b.VerifyReusablePersona(d6Var, map), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f21506a;
    }

    public static final boolean T0(qr.i component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit U0(ln.k.a aVar, s6 s6Var) {
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.f5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.V0((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit V0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.a.f14482a);
        return Unit.f21506a;
    }

    public static final Unit W0(ln.k.a aVar, s6 s6Var, final i4 i4Var, final InputAddressComponent component, final String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.a5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.X0(i4Var, component, addressId, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit X0(i4 i4Var, InputAddressComponent inputAddressComponent, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.V(str).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit Y0(ln.k.a aVar, s6 s6Var, final i4 i4Var) {
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.n5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.Z0(i4Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit Z0(i4 i4Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f21506a;
    }

    public static final Unit a1(ln.k.a aVar, s6 s6Var, final i4 i4Var, final CreatePersonaSheetComponent createReusablePersonaComponent, final qr.x5 buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.l5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.b1(i4Var, createReusablePersonaComponent, buttonClicked, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit b1(i4 i4Var, CreatePersonaSheetComponent createPersonaSheetComponent, qr.x5 x5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        List<qr.x5> components = displaying.getComponents();
        qr.i iVar = x5Var instanceof qr.i ? (qr.i) x5Var : null;
        if (iVar != null) {
            iVar.b(true);
        }
        Unit unit = Unit.f21506a;
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(components, createPersonaSheetComponent, qr.r.b(createPersonaSheetComponent, x5Var, x5Var)), null, null, null, null, null, null, null, new i4.b.CreateReusablePersona(createPersonaSheetComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f21506a;
    }

    public static final Unit c1(ln.k.a aVar, s6 s6Var, final i4 i4Var) {
        aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.o5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.d1(i4Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit d1(i4 i4Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f21506a;
    }

    public static final ln.r e1(final s6 s6Var, final ln.k.a aVar, final boolean z10, final i4 i4Var, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(s6Var, null, new Function1() { // from class: es.w4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.f1(it, aVar, s6Var, z10, i4Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit f1(fq.n1.Output output, ln.k.a aVar, final s6 s6Var, boolean z10, final i4 i4Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = e.f14514a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.q5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.g1(this.f14424a, (ln.r.c) obj);
                }
            }, 1, null));
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new zt.l();
            }
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.t5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.j1(i4Var, (ln.r.c) obj);
                }
            }, 1, null));
        } else if (z10) {
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.r5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.h1(this.f14436a, (ln.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.s5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.i1(i4Var, (ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit g1(s6 s6Var, ln.r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objC = a10.c();
        i4.Displaying displaying = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        s6Var.D0(a10, displaying);
        return Unit.f21506a;
    }

    public static final Unit h1(s6 s6Var, ln.r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object objC = a10.c();
        i4.Displaying displaying = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        s6Var.D0(a10, displaying);
        return Unit.f21506a;
    }

    public static final Unit i1(i4 i4Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, String.valueOf(Integer.parseInt(displaying.getRequestPermissionKey()) + 1), false, 0, null, 0, 252927, null));
        return Unit.f21506a;
    }

    public static final Unit j1(i4 i4Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        return Unit.f21506a;
    }

    public static final Unit k1(final s6 s6Var, final i4 i4Var, Input input, ln.k.a aVar, final qr.x5 uiComponent, boolean z10, final Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeA = m4.a(uiComponent);
        if (uiStepButtonTypeA != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(s6Var.trackingEventsLogger, uiStepButtonTypeA, uiComponent.getName(), ((i4.Displaying) i4Var).getStepName(), false, 8, null);
        }
        i4.Displaying displaying = (i4.Displaying) i4Var;
        s6Var.C1(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == hr.a.NONE || displaying.getHasRequestedGpsPermissions()) {
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.i5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.m1(componentParams, uiComponent, s6Var, (ln.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(ln.z.d(s6Var, null, new Function1() { // from class: es.h5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.l1(i4Var, componentParams, uiComponent, (ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit l1(i4 i4Var, Map map, qr.x5 x5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, true, map, x5Var, null, false, 0, null, 0, 254847, null));
        return Unit.f21506a;
    }

    public static final Unit m1(Map map, qr.x5 x5Var, s6 s6Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        i4.Displaying displayingV = i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, map, x5Var, null, false, 0, null, 0, 255871, null);
        action.e(displayingV);
        s6Var.D0(action, displayingV);
        return Unit.f21506a;
    }

    public static final Unit o0(i4.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, ln.r.c action) {
        String enableNfcPrompt;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = jpMyNumberNfcScanComponent.getName();
        JpMyNumberNfcScan.Attributes attributes = jpMyNumberNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = BuildConfig.FLAVOR;
        }
        action.e(i4.Displaying.v(displaying, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiInputComponentError(name, BuildConfig.FLAVOR, enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
        return Unit.f21506a;
    }

    public static final ln.r o1(s6 s6Var, final i4.Displaying displaying, final i4.Displaying.NfcScan nfcScan, final GovernmentIdNfcScanComponent governmentIdNfcScanComponent, final eq.l output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, eq.l.a.f14069a)) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.v5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.p1(displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof eq.l.b) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.w5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.q1(nfcScan, governmentIdNfcScanComponent, displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof eq.l.f) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.x5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.r1(output, displaying, nfcScan, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof eq.l.e) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.y5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.t1(displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof eq.l.ReenterDetails) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.z5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.u1(displaying, output, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit p0(i4.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, p001kotlin.collections.p.k(), null, null, null, new i4.Displaying.JpMyNumberNfcScan(jpMyNumberNfcScanComponent), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
        return Unit.f21506a;
    }

    public static final Unit p1(i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        return Unit.f21506a;
    }

    public static final Unit q1(i4.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, i4.Displaying displaying, ln.r.c action) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = nfcScan.getComponent().getName();
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
            scanDocumentError = BuildConfig.FLAVOR;
        }
        action.e(i4.Displaying.v(displaying, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiInputComponentError(name, BuildConfig.FLAVOR, scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        return Unit.f21506a;
    }

    public static final Unit r0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, new i4.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, null, false, false, null, null, null, false, 0, null, 0, 245727, null));
        return Unit.f21506a;
    }

    public static final Unit r1(eq.l lVar, i4.Displaying displaying, final i4.Displaying.NfcScan nfcScan, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying2 = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f21506a;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: es.l6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s6.s1(nfcScan, (GovernmentIdNfcScanComponent) obj));
            }
        });
        if (governmentIdNfcScanComponent == null) {
            return Unit.f21506a;
        }
        eq.l.f fVar = (eq.l.f) lVar;
        governmentIdNfcScanComponent.getNfcDataController().c(new GovernmentIdNfcData(fVar.getDg1Uri(), fVar.getDg2Uri(), fVar.getSodUri(), fVar.getChipAuthenticationStatus()));
        action.e(m1.b(displaying, fVar.getSubmitButtonComponentName()));
        return Unit.f21506a;
    }

    public static final boolean s1(i4.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final ln.r t0(final i4.b bVar, final s6 s6Var, final i4.Displaying displaying, final o1.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((i4.b.CreateReusablePersona) bVar).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.h6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.u0((ln.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, o1.b.a.f14383a)) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.i6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.v0(displaying, bVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof o1.b.Error) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.j6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.w0(it, displaying, s6Var, bVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit t1(i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        return Unit.f21506a;
    }

    public static final Unit u0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.C0279c.f14484a);
        return Unit.f21506a;
    }

    public static final Unit u1(i4.Displaying displaying, eq.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(m1.b(displaying, ((eq.l.ReenterDetails) lVar).getButtonComponentName()));
        return Unit.f21506a;
    }

    public static final Unit v0(i4.Displaying displaying, i4.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i4.b.CreateReusablePersona createReusablePersona = (i4.b.CreateReusablePersona) bVar;
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f21506a;
    }

    public static final Unit w0(o1.b bVar, i4.Displaying displaying, s6 s6Var, i4.b bVar2, ln.r.c action) {
        i4.Displaying displayingV;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((o1.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            displayingV = i4.Displaying.v(displaying, null, null, null, null, s6Var.applicationContext.getString(jq.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null);
        } else {
            i4.b.CreateReusablePersona createReusablePersona = (i4.b.CreateReusablePersona) bVar2;
            displayingV = i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null);
        }
        action.e(displayingV);
        return Unit.f21506a;
    }

    public static final ln.r w1(s6 s6Var, final i4.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, final zp.i output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof zp.i.c) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.a6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.x1(output, displaying, jpMyNumberNfcScanComponent, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (output instanceof zp.i.b) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.b6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.z1(output, displaying, jpMyNumberNfcScanComponent, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(output, zp.i.a.f39376a)) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.c6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.B1(displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final ln.r x0(final s6 s6Var, final i4.Displaying displaying, final x6.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, x6.b.a.f14641a)) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.d6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.y0(displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof x6.b.Error) {
            return ln.z.d(s6Var, null, new Function1() { // from class: es.e6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.z0(it, s6Var, displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit x1(zp.i iVar, i4.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, ln.r.c action) {
        sr.k kVarJ;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying2 = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f21506a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: es.m6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s6.y1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (kVarJ = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            kVarJ.c(((zp.i.c) iVar).getResult());
        }
        action.e(m1.b(displaying, ((zp.i.c) iVar).getTransitionComponentName()));
        return Unit.f21506a;
    }

    public static final Unit y0(i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        action.d(new c.FinishedWithTransition(true));
        return Unit.f21506a;
    }

    public static final boolean y1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit z0(x6.b bVar, s6 s6Var, i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((x6.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? i4.Displaying.v(displaying, null, null, null, null, s6Var.applicationContext.getString(jq.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f21506a;
    }

    public static final Unit z1(zp.i iVar, i4.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, ln.r.c action) {
        sr.k kVarJ;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        i4.Displaying displaying2 = objC instanceof i4.Displaying ? (i4.Displaying) objC : null;
        if (displaying2 == null) {
            return Unit.f21506a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: es.k6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s6.A1(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (kVarJ = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            kVarJ.c(((zp.i.b) iVar).getResult());
        }
        String transitionComponentName = ((zp.i.b) iVar).getTransitionComponentName();
        action.e((transitionComponentName == null || transitionComponentName.length() == 0) ? i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null) : m1.b(displaying, transitionComponentName));
        return Unit.f21506a;
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public i4 d(@NotNull Input props, @Nullable Snapshot snapshot) {
        List<qr.x5> listK;
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
            i4 i4Var = (i4) parcelable;
            if (i4Var != null) {
                return i4Var;
            }
        }
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listK = com.withpersona.sdk2.inquiry.steps.ui.components.g.i(components)) == null) {
            listK = p001kotlin.collections.p.k();
        }
        if (!this.featureFlagManager.a(to.t.f32630a)) {
            listK = m1.d(listK);
        }
        List<qr.x5> list = listK;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<g2> listS = props.s();
        if (listS == null) {
            listS = p001kotlin.collections.p.k();
        }
        return new i4.Displaying(list, stepName, listS, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final boolean B0(JpMyNumberNfcScanComponent component) {
        List<String> listD;
        if (!this.sandboxFlags.c()) {
            return !zp.q.f39405a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zC = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        return !zC && zp.t.f39412a.a((jpMyNumberNfcValidOperationK == null || (listD = jpMyNumberNfcValidOperationK.d()) == null) ? null : (String) CollectionsKt.firstOrNull(listD));
    }

    public final void C0(Input renderProps, i4 renderState) {
        dr.i dVar;
        if (!(renderState instanceof i4.Displaying)) {
            throw new zt.l();
        }
        i4.Displaying displaying = (i4.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            i4.b pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof i4.b.CreateReusablePersona) {
                dVar = new dr.i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof i4.b.VerifyReusablePersona)) {
                    throw new zt.l();
                }
                dVar = new dr.i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new dr.i.d(renderProps.getStepName()) : new dr.i.f(renderProps.getStepName());
        }
        String str = dVar.getStepName() + ":" + dVar;
        if (Intrinsics.c(str, this.lastLoggedPage)) {
            return;
        }
        this.lastLoggedPage = str;
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void C1(final qr.x5 tappedUiComponent, final boolean isTappedComponentVisible, i4.Displaying renderState) {
        E0(renderState.getComponents(), new Function1() { // from class: es.g6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.D1(isTappedComponentVisible, tappedUiComponent, (qr.x5) obj);
            }
        });
    }

    public final void D0(ln.r<? super Input, i4, ? extends c>.c cVar, i4.Displaying displaying) {
        qr.x5 triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> mapY = displaying.y();
        if (triggeringComponent == null || mapY == null) {
            return;
        }
        cVar.d(new c.FinishedWithoutTransition(triggeringComponent, mapY, displaying.getStepName()));
    }

    public final void E0(List<? extends qr.x5> list, final Function1<? super qr.x5, Unit> function1) {
        for (qr.x5 x5Var : list) {
            if (x5Var instanceof qr.y5) {
                E0(((qr.y5) x5Var).getChildren(), new Function1() { // from class: es.e5
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s6.F0(function1, (qr.x5) obj);
                    }
                });
            } else {
                function1.invoke(x5Var);
            }
        }
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull i4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Input renderProps, @NotNull final i4 renderState, @NotNull final ln.k<? super Input, i4, ? extends c, ? extends Object>.a context) {
        final s6 s6Var;
        final i4 i4Var;
        d.a.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (renderProps.getIsRestoringState()) {
            return Unit.f21506a;
        }
        C0(renderProps, renderState);
        if (!(renderState instanceof i4.Displaying)) {
            throw new zt.l();
        }
        i4.Displaying displaying = (i4.Displaying) renderState;
        s0(renderProps, displaying, context);
        final qr.g0 g0Var = (qr.g0) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(qr.g0.class), f.f14515a);
        boolean z10 = g0Var != null && g0Var.isEnabled();
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting(), z10);
        E0(displaying.getComponents(), new Function1() { // from class: es.n4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.H0(this.f14367a, renderProps, renderState, context, (qr.x5) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            n1(renderProps, displaying, context, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            v1(renderProps, displaying, context, displaying.getJpMyNumberNfcScan());
        }
        fq.n0 n0Var = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == hr.e.ROUGH ? fq.n0.RoughLocation : fq.n0.PreciseLocation;
        final boolean z11 = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == hr.a.OPTIONAL;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(jq.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            qr.i iVar = (qr.i) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(qr.i.class), new Function1() { // from class: es.p6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(s6.T0((qr.i) obj));
                }
            });
            if (iVar != null) {
                context.b("begin_countdown", new g(context, this, renderState, iVar, null));
            }
        }
        i4.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 == null || autoSubmit2.getCountdown() < 1) {
            s6Var = this;
            i4Var = renderState;
        } else {
            String str2 = "countdown_" + autoSubmit2.getCountdown();
            h hVar = new h(context, this, autoSubmit2, renderState, null);
            s6Var = this;
            i4Var = renderState;
            context.b(str2, hVar);
        }
        List<qr.x5> components = displaying.getComponents();
        List<UiComponentConfig> components2 = renderProps.getComponents();
        List<g2> listX = displaying.x();
        List<g2> listS = renderProps.s();
        if (listS == null) {
            listS = p001kotlin.collections.p.k();
        }
        List listW0 = CollectionsKt.w0(listX, listS);
        ir.a aVarB = s6Var.navigationStateManager.b();
        String navBarTitle = renderProps.getNavBarTitle();
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new d.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        d.a aVar = new d.a(components, components2, listW0, aVarB, navBarTitle, new pu.n() { // from class: es.q6
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return s6.k1(this.f14425a, i4Var, renderProps, context, (qr.x5) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: es.r6
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.I0(this.f14437a, i4Var, context);
            }
        }, new Function0() { // from class: es.o4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.K0(this.f14397a, i4Var, context, renderProps);
            }
        }, new Function1() { // from class: es.p4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.M0(this.f14411a, i4Var, context, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: es.q4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.N0(this.f14422a, i4Var, context, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: es.r4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.O0(g0Var, s6Var, i4Var, context);
            }
        }, new Function0() { // from class: es.s4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.P0(g0Var, s6Var, i4Var, context);
            }
        }, new Function2() { // from class: es.t4
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s6.R0(this.f14541a, i4Var, context, (qr.d6) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: es.y4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.U0(context, s6Var);
            }
        }, new Function2() { // from class: es.j5
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s6.W0(context, s6Var, i4Var, (InputAddressComponent) obj, (String) obj2);
            }
        }, displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new Function0() { // from class: es.u5
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.Y0(context, s6Var, i4Var);
            }
        }, new Function2() { // from class: es.f6
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s6.a1(context, s6Var, i4Var, (CreatePersonaSheetComponent) obj, (qr.x5) obj2);
            }
        }, g0Var != null ? qr.g0.D2(g0Var, 0, 1, null) : null, z10 && displaying.getShowHelpBottomSheet(), new Function0() { // from class: es.n6
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s6.c1(context, s6Var, i4Var);
            }
        });
        boolean isRequestingGpsPermissions = displaying.getIsRequestingGpsPermissions();
        String gpsPermissionsTitle = renderProps.getGpsPermissionsTitle();
        if (gpsPermissionsTitle == null) {
            gpsPermissionsTitle = BuildConfig.FLAVOR;
        }
        String gpsPermissionsRationale = renderProps.getGpsPermissionsRationale();
        if (gpsPermissionsRationale == null) {
            gpsPermissionsRationale = "Gps permission are required to verify your identity";
        }
        Context context2 = s6Var.applicationContext;
        String string = context2.getString(jq.g.f20873c0, xq.g.b(context2));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = s6Var.applicationContext.getString(jq.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = s6Var.applicationContext.getString(jq.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        return fq.y1.d(aVar, context, isRequestingGpsPermissions, n0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getGpsPermissionsModalNegativeButton(), s6Var.permissionRequestWorkflow, renderProps.getStyles(), displaying.getRequestPermissionKey(), new Function1() { // from class: es.o6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.e1(this.f14401a, context, z11, i4Var, (fq.n1.Output) obj);
            }
        });
    }

    public final void n0(final JpMyNumberNfcScanComponent component, final i4.Displaying renderState, ln.k<? super Input, i4, ? extends c, ? extends Object>.a context) {
        if (component.getValidOperation() == null) {
            return;
        }
        if (B0(component)) {
            context.d().a(ln.z.d(this, null, new Function1() { // from class: es.b5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.o0(renderState, component, (ln.r.c) obj);
                }
            }, 1, null));
        } else {
            C1(component, true, renderState);
            context.d().a(ln.z.d(this, null, new Function1() { // from class: es.c5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.p0(renderState, component, (ln.r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0143 A[PHI: r13
      0x0143: PHI (r13v11 java.lang.String) = (r13v3 java.lang.String), (r13v12 java.lang.String) binds: [B:95:0x014e, B:89:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n1(Input renderProps, final i4.Displaying renderState, ln.k<? super Input, i4, ? extends c, ? extends Object>.a context, final i4.Displaying.NfcScan nfcScan) {
        List<? extends eq.c> listN;
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
        eq.c cVar;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strB = component.getCardAccessNumberController().b();
        String strB2 = component.getDocumentNumberController().b();
        Date dateB = component.getDateOfBirthController().b();
        Date dateB2 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(strB2) || dateB == null || dateB2 == null) {
            context.b("client_side_nfc_form_validation", new i(context, this, attributes, strB2, dateB, dateB2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strB2, dateB2, dateB);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listN = p001kotlin.collections.p.n(eq.c.Dg1, eq.c.Dg2, eq.c.Sod);
        } else {
            listN = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = e.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    cVar = eq.c.Dg1;
                } else if (i10 == 2) {
                    cVar = eq.c.Dg2;
                } else if (i10 != 3) {
                    cVar = i10 != 4 ? null : eq.c.Sod;
                } else {
                    cVar = eq.c.Dg14;
                }
                if (cVar != null) {
                    listN.add(cVar);
                }
            }
        }
        eq.p.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? BuildConfig.FLAVOR : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? BuildConfig.FLAVOR : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? BuildConfig.FLAVOR : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? BuildConfig.FLAVOR : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? BuildConfig.FLAVOR : authenticatingTitle;
        String string = this.applicationContext.getString(jq.g.C);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? BuildConfig.FLAVOR : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? BuildConfig.FLAVOR : enableNfcPrompt;
        String string2 = this.applicationContext.getString(jq.g.D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(jq.g.C);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = scanDocumentError;
            }
        } else {
            str = scanDocumentError;
        }
        String string4 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? BuildConfig.FLAVOR : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? BuildConfig.FLAVOR : scanDocumentError2;
        String string6 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        ln.w.l(context, aVar.a(strB, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? BuildConfig.FLAVOR : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? BuildConfig.FLAVOR : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? BuildConfig.FLAVOR : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? BuildConfig.FLAVOR : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? BuildConfig.FLAVOR : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? BuildConfig.FLAVOR : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? BuildConfig.FLAVOR : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? BuildConfig.FLAVOR : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? BuildConfig.FLAVOR : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? BuildConfig.FLAVOR : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? BuildConfig.FLAVOR : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? BuildConfig.FLAVOR : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? BuildConfig.FLAVOR : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? BuildConfig.FLAVOR : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? BuildConfig.FLAVOR : incorrectIdDetailsTransitionComponentName), listN, renderProps.getStyles(), null, component.getConfig().getStyles()), p001kotlin.jvm.internal.d0.k(eq.p.class), BuildConfig.FLAVOR, new Function1() { // from class: es.k5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.o1(this.f14330a, renderState, nfcScan, component, (eq.l) obj);
            }
        });
    }

    public final void q0(final GovernmentIdNfcScanComponent component, final i4.Displaying renderState, ln.k<? super Input, i4, ? extends c, ? extends Object>.a context) {
        C1(component, true, renderState);
        context.d().a(ln.z.d(this, null, new Function1() { // from class: es.v4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.r0(component, renderState, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public final void s0(Input renderProps, final i4.Displaying renderState, ln.k<? super Input, i4, ? extends c, ? extends Object>.a context) {
        final i4.b pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof i4.b.CreateReusablePersona) {
            o1.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            i4.b.CreateReusablePersona createReusablePersona = (i4.b.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ln.w.l(context, aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), p001kotlin.jvm.internal.d0.k(o1.class), BuildConfig.FLAVOR, new Function1() { // from class: es.x4
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s6.t0(pendingAction, this, renderState, (o1.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof i4.b.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new zt.l();
            }
            return;
        }
        x6.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        i4.b.VerifyReusablePersona verifyReusablePersona = (i4.b.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ln.w.l(context, aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), p001kotlin.jvm.internal.d0.k(x6.class), BuildConfig.FLAVOR, new Function1() { // from class: es.z4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.x0(this.f14675a, renderState, (x6.b) obj);
            }
        });
    }

    public final void v1(Input renderProps, final i4.Displaying renderState, ln.k<? super Input, i4, ? extends c, ? extends Object>.a context, i4.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        if (jpMyNumberNfcValidOperationK == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        ln.w.l(context, this.scanJpMyNumberNfcWorkerFactory.a(jpMyNumberNfcValidOperationK, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), p001kotlin.jvm.internal.d0.k(zp.u.class), BuildConfig.FLAVOR, new Function1() { // from class: es.p5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.w1(this.f14413a, renderState, component, (zp.i) obj);
            }
        });
    }
}
