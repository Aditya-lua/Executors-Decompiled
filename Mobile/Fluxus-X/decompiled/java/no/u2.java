package no;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ln.Snapshot;
import or.UiComponentScreen;
import or.UiStepBottomSheet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006FHNJPLBq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J7\u0010&\u001a\u00020%*\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'JU\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u00020(2\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b/\u00100JU\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u0002012\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b2\u00103JG\u00107\u001a\u00020%*\u0002042\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020%*\u0002092\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lno/u2;", "Lln/k;", "Lno/u2$b;", "Lno/u2$f;", "Lno/u2$c;", BuildConfig.FLAVOR, "Ll6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lfq/n1;", "permissionRequestWorkflow", "Lno/c;", "documentCameraWorker", "Lno/y2$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorker", "Lpo/a$a;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Lir/b;", "navigationStateManager", "Ldr/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Ll6/s;Landroid/content/Context;Lfq/n1;Lno/c;Lno/y2$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lpo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Lir/b;Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lln/k$a;", "Lno/u2$a;", "event", BuildConfig.FLAVOR, "K0", "(Lln/k$a;Lno/u2$a;)V", "Lno/w;", "context", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", "A0", "(Lno/w;Lln/k$a;)Ljava/util/List;", "Lno/f3;", "B0", "(Lno/f3;Lln/k$a;)Ljava/util/List;", "Lno/u2$f$a;", "renderProps", "renderState", "H1", "(Lno/u2$f$a;Lno/u2$b;Lno/u2$f;Lln/k$a;)V", "Lno/u2$f$f;", "I1", "(Lno/u2$f$f;Lno/u2$b;Lno/u2$f;Lln/k$a;)V", "props", "Lln/i;", "snapshot", "J0", "(Lno/u2$b;Lln/i;)Lno/u2$f;", "state", "a2", "(Lno/u2$f;)Lln/i;", "V0", "(Lno/u2$b;Lno/u2$f;Lln/k$a;)Ljava/lang/Object;", "a", "Ll6/s;", "b", "Landroid/content/Context;", "c", "Lfq/n1;", "d", "Lno/c;", "e", "Lno/y2$b;", "f", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "g", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "i", "Lpo/a$a;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "k", "Lir/b;", "l", "Ldr/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u2 extends ln.k<Input, f, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l6.s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fq.n1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.c documentCameraWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y2.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.a.C0164a documentCreateWorker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.a.C0563a documentFileDeleteWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.g.a documentSubmitWorker;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lno/u2$a;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "g", "h", "j", "e", "c", "f", "d", "i", "Lno/u2$a$a;", "Lno/u2$a$b;", "Lno/u2$a$c;", "Lno/u2$a$d;", "Lno/u2$a$e;", "Lno/u2$a$f;", "Lno/u2$a$g;", "Lno/u2$a$h;", "Lno/u2$a$i;", "Lno/u2$a$j;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: no.u2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$a;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0515a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0515a f26085a = new C0515a();

            public C0515a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0515a);
            }

            public int hashCode() {
                return 1245705540;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$b;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f26086a = new b();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$c;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f26087a = new c();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$d;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f26088a = new d();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$e;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f26089a = new e();

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

        /* JADX INFO: renamed from: no.u2$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lno/u2$a$f;", "Lno/u2$a;", BuildConfig.FLAVOR, "documentId", "Lno/e$b;", "document", "<init>", "(Ljava/lang/String;Lno/e$b;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lno/e$b;", "()Lno/e$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RemoveDocument extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final no.e.Remote document;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveDocument(@NotNull String documentId, @NotNull no.e.Remote document) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(document, "document");
                this.documentId = documentId;
                this.document = document;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final no.e.Remote getDocument() {
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
                return Intrinsics.c(this.documentId, removeDocument.documentId) && Intrinsics.c(this.document, removeDocument.document);
            }

            public int hashCode() {
                return (this.documentId.hashCode() * 31) + this.document.hashCode();
            }

            @NotNull
            public String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$g;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f26091a = new g();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$h;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f26092a = new h();

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

        /* JADX INFO: renamed from: no.u2$a$i, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lno/u2$a$i;", "Lno/u2$a;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Submit extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Submit) && Intrinsics.c(this.documentId, ((Submit) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            @NotNull
            public String toString() {
                return "Submit(documentId=" + this.documentId + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$a$j;", "Lno/u2$a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final j f26094a = new j();

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

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: no.u2$b, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b5\u0010,J\u001a\u00108\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u00104R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u00104R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u00104R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bO\u00104R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010Z\u001a\u0004\bP\u0010,R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010[\u001a\u0004\bE\u0010\\R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010[\u001a\u0004\bG\u0010\\R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\b]\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\b`\u00104R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\ba\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010;\u001a\u0004\b^\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bL\u0010g\u001a\u0004\b:\u0010hR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\ba\u0010i\u001a\u0004\bc\u0010jR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\bk\u00104R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\bK\u00104R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010;\u001a\u0004\bb\u00104R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b]\u0010l\u001a\u0004\bM\u0010m¨\u0006n"}, d2 = {"Lno/u2$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lno/u2$e;", "startPage", "Lno/n;", "pages", BuildConfig.FLAVOR, "documentFileLimit", BuildConfig.FLAVOR, "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "largeFileErrorPrompt", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "promptPageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "Lor/b;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/u2$e;Lno/n;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lor/b;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "A", "b", "r", "c", "q", "d", "p", "e", "H", "f", "F", "g", "k", "h", "M", "i", "y", "j", "v", "o", "l", "s", "m", "n", "Lno/u2$e;", "J", "()Lno/u2$e;", "Lno/n;", "u", "()Lno/n;", "I", "Z", "()Z", "D", "t", "C", "B", "z", "w", "x", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "L", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "G", "Lor/b;", "()Lor/b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

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
        public final or.b customPendingPage;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String promptTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String promptDescription;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String disclaimer;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String submitButtonText;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String pendingTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String pendingDescription;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyDocument;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String kind;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String documentId;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final e startPage;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n pages;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final int documentFileLimit;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsTitle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsRationale;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String largeFileErrorPrompt;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.DocumentStepStyle styles;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Document.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: no.u2$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (e) parcel.readParcelable(Input.class.getClassLoader()), n.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.DocumentStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (or.b) parcel.readParcelable(Input.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String fieldKeyDocument, @NotNull String kind, @Nullable String str7, @NotNull e startPage, @NotNull n pages, int i10, boolean z10, boolean z11, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull NextStep.Document.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable or.b bVar) {
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
            this.customPendingPage = bVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final String getPromptDescription() {
            return this.promptDescription;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final String getPromptPageNavBarTitle() {
            return this.promptPageNavBarTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final String getPromptTitle() {
            return this.promptTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final e getStartPage() {
            return this.startPage;
        }

        @Nullable
        /* JADX INFO: renamed from: L, reason: from getter */
        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
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
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.fromStep, input.fromStep) && Intrinsics.c(this.fromComponent, input.fromComponent) && Intrinsics.c(this.promptTitle, input.promptTitle) && Intrinsics.c(this.promptDescription, input.promptDescription) && Intrinsics.c(this.disclaimer, input.disclaimer) && Intrinsics.c(this.submitButtonText, input.submitButtonText) && Intrinsics.c(this.pendingTitle, input.pendingTitle) && Intrinsics.c(this.pendingDescription, input.pendingDescription) && Intrinsics.c(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.c(this.kind, input.kind) && Intrinsics.c(this.documentId, input.documentId) && Intrinsics.c(this.startPage, input.startPage) && Intrinsics.c(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.permissionsTitle, input.permissionsTitle) && Intrinsics.c(this.permissionsRationale, input.permissionsRationale) && Intrinsics.c(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.c(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.c(this.largeFileErrorPrompt, input.largeFileErrorPrompt) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.c(this.promptPageNavBarTitle, input.promptPageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, input.checkPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, input.pendingPageNavBarTitle) && Intrinsics.c(this.customPendingPage, input.customPendingPage);
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
            or.b bVar = this.customPendingPage;
            return iHashCode17 + (bVar != null ? bVar.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getCheckPageNavBarTitle() {
            return this.checkPageNavBarTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final or.b getCustomPendingPage() {
            return this.customPendingPage;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
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
        public final n getPages() {
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

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getPendingTitle() {
            return this.pendingTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lno/u2$c;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "c", "d", "Lno/u2$c$a;", "Lno/u2$c$b;", "Lno/u2$c$c;", "Lno/u2$c$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$c$a;", "Lno/u2$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f26120a = new a();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$c$b;", "Lno/u2$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f26121a = new b();

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

        /* JADX INFO: renamed from: no.u2$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lno/u2$c$c;", "Lno/u2$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Errored extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Errored) && Intrinsics.c(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lno/u2$c$d;", "Lno/u2$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f26123a = new d();

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

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lno/u2$e;", "Landroid/os/Parcelable;", "a", "b", "Lno/u2$e$a;", "Lno/u2$e$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lno/u2$e$a;", "Lno/u2$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f26161a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0517a();

            /* JADX INFO: renamed from: no.u2$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0517a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f26161a;
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

        /* JADX INFO: renamed from: no.u2$e$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lno/u2$e$b;", "Lno/u2$e;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Review implements e {

            @NotNull
            public static final Parcelable.Creator<Review> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: no.u2$e$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Review> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Review createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Review(parcel.readString());
                }

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
                return (other instanceof Review) && Intrinsics.c(this.documentId, ((Review) other).documentId);
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

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014\u0012$ \u001c(B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0004)*+,¨\u0006-"}, d2 = {"Lno/u2$f;", "Lls/h;", "Lno/u2$f$a;", "captureState", "Lno/u2$f$f;", "uploadState", BuildConfig.FLAVOR, "documentId", BuildConfig.FLAVOR, "Lno/e;", "documents", "<init>", "(Lno/u2$f$a;Lno/u2$f$f;Ljava/lang/String;Ljava/util/List;)V", "other", BuildConfig.FLAVOR, "N2", "(Lls/h;)Z", "shouldShowUploadOptionsDialog", "f", "(Z)Lno/u2$f;", "a", "(Lno/u2$f$a;)Lno/u2$f;", "documentFileToDelete", "g", "(Lno/u2$f$f;Ljava/lang/String;Ljava/util/List;Lno/e;)Lno/u2$f;", "Lno/u2$f$a;", "j", "()Lno/u2$f$a;", "b", "Lno/u2$f$f;", "n", "()Lno/u2$f$f;", "c", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "d", "Ljava/util/List;", "l", "()Ljava/util/List;", "e", "Lno/u2$f$b;", "Lno/u2$f$c;", "Lno/u2$f$d;", "Lno/u2$f$e;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class f implements ls.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final a captureState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC0518f uploadState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String documentId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<no.e> documents;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lno/u2$f$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum a {
            None,
            CheckCameraPermissions,
            CameraRunning,
            SelectFileFromDocuments,
            SelectImageFromPhotoLibrary;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ hu.a f26171g = hu.b.a(a());
        }

        /* JADX INFO: renamed from: no.u2$f$f, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lno/u2$f$f;", "Landroid/os/Parcelable;", "a", "d", "b", "c", "Lno/u2$f$f$a;", "Lno/u2$f$f$b;", "Lno/u2$f$f$c;", "Lno/u2$f$f$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC0518f extends Parcelable {

            /* JADX INFO: renamed from: no.u2$f$f$a */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lno/u2$f$f$a;", "Lno/u2$f$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a implements InterfaceC0518f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f26196a = new a();

                @NotNull
                public static final Parcelable.Creator<a> CREATOR = new C0519a();

                /* JADX INFO: renamed from: no.u2$f$f$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0519a implements Parcelable.Creator<a> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return a.f26196a;
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

            /* JADX INFO: renamed from: no.u2$f$f$b, reason: from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lno/u2$f$f$b;", "Lno/u2$f$f;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DeleteFiles implements InterfaceC0518f {

                @NotNull
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: no.u2$f$f$b$a */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DeleteFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DeleteFiles(parcel.readString());
                    }

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
                    return (other instanceof DeleteFiles) && Intrinsics.c(this.documentId, ((DeleteFiles) other).documentId);
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

            /* JADX INFO: renamed from: no.u2$f$f$c, reason: from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lno/u2$f$f$c;", "Lno/u2$f$f;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentId", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ReadyToSubmit implements InterfaceC0518f {

                @NotNull
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: no.u2$f$f$c$a */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReadyToSubmit> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ReadyToSubmit(parcel.readString());
                    }

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
                    return (other instanceof ReadyToSubmit) && Intrinsics.c(this.documentId, ((ReadyToSubmit) other).documentId);
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

            /* JADX INFO: renamed from: no.u2$f$f$d, reason: from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lno/u2$f$f$d;", "Lno/u2$f$f;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UploadFiles implements InterfaceC0518f {

                @NotNull
                public static final Parcelable.Creator<UploadFiles> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                /* JADX INFO: renamed from: no.u2$f$f$d$a */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<UploadFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UploadFiles(parcel.readString());
                    }

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
                    return (other instanceof UploadFiles) && Intrinsics.c(this.documentId, ((UploadFiles) other).documentId);
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

        public /* synthetic */ f(a aVar, InterfaceC0518f interfaceC0518f, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, interfaceC0518f, str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f i(f fVar, InterfaceC0518f interfaceC0518f, String str, List list, no.e eVar, int i10, Object obj) {
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
                eVar = null;
            }
            return fVar.g(interfaceC0518f, str, list, eVar);
        }

        @Override // ls.h
        public boolean N2(@NotNull ls.h other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return getClass() == other.getClass() && getCaptureState() == ((f) other).getCaptureState();
        }

        @NotNull
        public final f a(@NotNull a captureState) {
            Intrinsics.checkNotNullParameter(captureState, "captureState");
            if (this instanceof Start) {
                return Start.p((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.p((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.p((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new zt.l();
        }

        @NotNull
        public final f f(boolean shouldShowUploadOptionsDialog) {
            if (this instanceof Start) {
                return Start.p((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.p((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.p((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new zt.l();
        }

        @NotNull
        public final f g(@NotNull InterfaceC0518f uploadState, @Nullable String documentId, @Nullable List<? extends no.e> documents, @Nullable no.e documentFileToDelete) {
            Intrinsics.checkNotNullParameter(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = start.getDocumentId();
                }
                return Start.p(start, null, uploadState, documentId, false, 9, null);
            }
            if (this instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) this;
                if (documents == null) {
                    documents = reviewCaptures.l();
                }
                return ReviewCaptures.p(reviewCaptures, documents, null, null, uploadState, documentFileToDelete, false, false, null, 230, null);
            }
            if (!(this instanceof ReviewCapturesWithoutDocumentId)) {
                if (this instanceof UploadDocument) {
                    return UploadDocument.p((UploadDocument) this, null, null, uploadState, null, 11, null);
                }
                throw new zt.l();
            }
            ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) this;
            if (documentId == null) {
                documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            }
            String str = documentId;
            if (documents == null) {
                documents = reviewCapturesWithoutDocumentId.l();
            }
            return ReviewCapturesWithoutDocumentId.p(reviewCapturesWithoutDocumentId, documents, str, null, uploadState, documentFileToDelete, false, false, null, 228, null);
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public a getCaptureState() {
            return this.captureState;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public List<no.e> l() {
            return this.documents;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public InterfaceC0518f getUploadState() {
            return this.uploadState;
        }

        /* JADX INFO: renamed from: no.u2$f$e, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lno/u2$f$e;", "Lno/u2$f;", BuildConfig.FLAVOR, "Lno/e;", "documents", BuildConfig.FLAVOR, "documentId", "Lno/u2$f$f;", "uploadState", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$f;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$f;Ljava/lang/String;)Lno/u2$f$e;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lno/u2$f$f;", "n", "()Lno/u2$f$f;", "h", "getError", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UploadDocument extends f {

            @NotNull
            public static final Parcelable.Creator<UploadDocument> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<no.e> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InterfaceC0518f uploadState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: no.u2$f$e$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UploadDocument> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UploadDocument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), (InterfaceC0518f) parcel.readParcelable(UploadDocument.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UploadDocument[] newArray(int i10) {
                    return new UploadDocument[i10];
                }
            }

            public /* synthetic */ UploadDocument(List list, String str, InterfaceC0518f interfaceC0518f, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? InterfaceC0518f.a.f26196a : interfaceC0518f, (i10 & 8) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UploadDocument p(UploadDocument uploadDocument, List list, String str, InterfaceC0518f interfaceC0518f, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i10 & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i10 & 4) != 0) {
                    interfaceC0518f = uploadDocument.uploadState;
                }
                if ((i10 & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.o(list, str, interfaceC0518f, str2);
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
                return Intrinsics.c(this.documents, uploadDocument.documents) && Intrinsics.c(this.documentId, uploadDocument.documentId) && Intrinsics.c(this.uploadState, uploadDocument.uploadState) && Intrinsics.c(this.error, uploadDocument.error);
            }

            public int hashCode() {
                int iHashCode = ((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                String str = this.error;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // no.u2.f
            @NotNull
            public List<no.e> l() {
                return this.documents;
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public InterfaceC0518f getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final UploadDocument o(@NotNull List<? extends no.e> documents, @NotNull String documentId, @NotNull InterfaceC0518f uploadState, @Nullable String error) {
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
                List<no.e> list = this.documents;
                dest.writeInt(list.size());
                Iterator<no.e> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UploadDocument(@NotNull List<? extends no.e> documents, @NotNull String documentId, @NotNull InterfaceC0518f uploadState, @Nullable String str) {
                super(a.None, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.uploadState = uploadState;
                this.error = str;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(a aVar, InterfaceC0518f interfaceC0518f, String str, List<? extends no.e> list) {
            this.captureState = aVar;
            this.uploadState = interfaceC0518f;
            this.documentId = str;
            this.documents = list;
        }

        /* JADX INFO: renamed from: no.u2$f$b, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b;\u0010\u001e¨\u0006<"}, d2 = {"Lno/u2$f$b;", "Lno/u2$f;", BuildConfig.FLAVOR, "Lno/e;", "documents", BuildConfig.FLAVOR, "documentId", "Lno/u2$f$a;", "captureState", "Lno/u2$f$f;", "uploadState", "documentFileToDelete", BuildConfig.FLAVOR, "shouldLoadDocuments", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;)Lno/u2$f$b;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lno/u2$f$a;", "j", "()Lno/u2$f$a;", "h", "Lno/u2$f$f;", "n", "()Lno/u2$f$f;", "i", "Lno/e;", "q", "()Lno/e;", "Z", "s", "()Z", "t", "r", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReviewCaptures extends f {

            @NotNull
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<no.e> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InterfaceC0518f uploadState;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final no.e documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldLoadDocuments;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: no.u2$f$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCaptures> {
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
                    a aVarValueOf = a.valueOf(parcel.readString());
                    InterfaceC0518f interfaceC0518f = (InterfaceC0518f) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    no.e eVar = (no.e) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    boolean z10 = true;
                    if (parcel.readInt() == 0) {
                        z10 = false;
                    }
                    return new ReviewCaptures(arrayList, string, aVarValueOf, interfaceC0518f, eVar, z10, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures[] newArray(int i10) {
                    return new ReviewCaptures[i10];
                }
            }

            public /* synthetic */ ReviewCaptures(List list, String str, a aVar, InterfaceC0518f interfaceC0518f, no.e eVar, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? a.None : aVar, (i10 & 8) != 0 ? InterfaceC0518f.a.f26196a : interfaceC0518f, (i10 & 16) != 0 ? null : eVar, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & Barcode.FORMAT_ITF) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReviewCaptures p(ReviewCaptures reviewCaptures, List list, String str, a aVar, InterfaceC0518f interfaceC0518f, no.e eVar, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCaptures.documentId;
                }
                if ((i10 & 4) != 0) {
                    aVar = reviewCaptures.captureState;
                }
                if ((i10 & 8) != 0) {
                    interfaceC0518f = reviewCaptures.uploadState;
                }
                if ((i10 & 16) != 0) {
                    eVar = reviewCaptures.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCaptures.shouldLoadDocuments;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                if ((i10 & Barcode.FORMAT_ITF) != 0) {
                    str2 = reviewCaptures.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                no.e eVar2 = eVar;
                boolean z13 = z10;
                return reviewCaptures.o(list, str, aVar, interfaceC0518f, eVar2, z13, z12, str3);
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
                return Intrinsics.c(this.documents, reviewCaptures.documents) && Intrinsics.c(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && Intrinsics.c(this.uploadState, reviewCaptures.uploadState) && Intrinsics.c(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.shouldLoadDocuments == reviewCaptures.shouldLoadDocuments && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.c(this.error, reviewCaptures.error);
            }

            public int hashCode() {
                int iHashCode = ((((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                no.e eVar = this.documentFileToDelete;
                int iHashCode2 = (((((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.shouldLoadDocuments)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str = this.error;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // no.u2.f
            @NotNull
            public List<no.e> l() {
                return this.documents;
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public InterfaceC0518f getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final ReviewCaptures o(@NotNull List<? extends no.e> documents, @NotNull String documentId, @NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable no.e documentFileToDelete, boolean shouldLoadDocuments, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, shouldLoadDocuments, shouldShowUploadOptionsDialog, error);
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final no.e getDocumentFileToDelete() {
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
                List<no.e> list = this.documents;
                dest.writeInt(list.size());
                Iterator<no.e> it = list.iterator();
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull List<? extends no.e> documents, @NotNull String documentId, @NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable no.e eVar, boolean z10, boolean z11, @Nullable String str) {
                super(captureState, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = eVar;
                this.shouldLoadDocuments = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str;
            }
        }

        /* JADX INFO: renamed from: no.u2$f$c, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b;\u0010\u001e¨\u0006<"}, d2 = {"Lno/u2$f$c;", "Lno/u2$f;", BuildConfig.FLAVOR, "Lno/e;", "documents", BuildConfig.FLAVOR, "documentId", "Lno/u2$f$a;", "captureState", "Lno/u2$f$f;", "uploadState", "documentFileToDelete", BuildConfig.FLAVOR, "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;)Lno/u2$f$c;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lno/u2$f$a;", "j", "()Lno/u2$f$a;", "h", "Lno/u2$f$f;", "n", "()Lno/u2$f$f;", "i", "Lno/e;", "getDocumentFileToDelete", "()Lno/e;", "Z", "r", "()Z", "s", "q", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReviewCapturesWithoutDocumentId extends f {

            @NotNull
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<no.e> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InterfaceC0518f uploadState;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final no.e documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean reloadingFromPreviousSession;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: no.u2$f$c$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCapturesWithoutDocumentId> {
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
                    a aVarValueOf = a.valueOf(parcel.readString());
                    InterfaceC0518f interfaceC0518f = (InterfaceC0518f) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    no.e eVar = (no.e) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    boolean z10 = true;
                    if (parcel.readInt() == 0) {
                        z10 = false;
                    }
                    return new ReviewCapturesWithoutDocumentId(arrayList, string, aVarValueOf, interfaceC0518f, eVar, z10, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId[] newArray(int i10) {
                    return new ReviewCapturesWithoutDocumentId[i10];
                }
            }

            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, a aVar, InterfaceC0518f interfaceC0518f, no.e eVar, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? a.None : aVar, (i10 & 8) != 0 ? InterfaceC0518f.a.f26196a : interfaceC0518f, (i10 & 16) != 0 ? null : eVar, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & Barcode.FORMAT_ITF) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReviewCapturesWithoutDocumentId p(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, a aVar, InterfaceC0518f interfaceC0518f, no.e eVar, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                if ((i10 & 4) != 0) {
                    aVar = reviewCapturesWithoutDocumentId.captureState;
                }
                if ((i10 & 8) != 0) {
                    interfaceC0518f = reviewCapturesWithoutDocumentId.uploadState;
                }
                if ((i10 & 16) != 0) {
                    eVar = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog;
                }
                if ((i10 & Barcode.FORMAT_ITF) != 0) {
                    str2 = reviewCapturesWithoutDocumentId.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                no.e eVar2 = eVar;
                boolean z13 = z10;
                return reviewCapturesWithoutDocumentId.o(list, str, aVar, interfaceC0518f, eVar2, z13, z12, str3);
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
                return Intrinsics.c(this.documents, reviewCapturesWithoutDocumentId.documents) && Intrinsics.c(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && Intrinsics.c(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && Intrinsics.c(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && Intrinsics.c(this.error, reviewCapturesWithoutDocumentId.error);
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                no.e eVar = this.documentFileToDelete;
                int iHashCode3 = (((((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // no.u2.f
            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // no.u2.f
            @NotNull
            public List<no.e> l() {
                return this.documents;
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public InterfaceC0518f getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final ReviewCapturesWithoutDocumentId o(@NotNull List<? extends no.e> documents, @Nullable String documentId, @NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable no.e documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
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
                List<no.e> list = this.documents;
                dest.writeInt(list.size());
                Iterator<no.e> it = list.iterator();
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesWithoutDocumentId(@NotNull List<? extends no.e> documents, @Nullable String str, @NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable no.e eVar, boolean z10, boolean z11, @Nullable String str2) {
                super(captureState, uploadState, str, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = eVar;
                this.reloadingFromPreviousSession = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str2;
            }
        }

        /* JADX INFO: renamed from: no.u2$f$d, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lno/u2$f$d;", "Lno/u2$f;", "Lno/u2$f$a;", "captureState", "Lno/u2$f$f;", "uploadState", BuildConfig.FLAVOR, "documentId", BuildConfig.FLAVOR, "shouldShowUploadOptionsDialog", "<init>", "(Lno/u2$f$a;Lno/u2$f$f;Ljava/lang/String;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Lno/u2$f$a;Lno/u2$f$f;Ljava/lang/String;Z)Lno/u2$f$d;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "e", "Lno/u2$f$a;", "j", "()Lno/u2$f$a;", "f", "Lno/u2$f$f;", "n", "()Lno/u2$f$f;", "g", "Ljava/lang/String;", "k", "h", "Z", "q", "()Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Start extends f {

            @NotNull
            public static final Parcelable.Creator<Start> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InterfaceC0518f uploadState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: no.u2$f$d$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Start> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Start createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Start(a.valueOf(parcel.readString()), (InterfaceC0518f) parcel.readParcelable(Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Start[] newArray(int i10) {
                    return new Start[i10];
                }
            }

            public /* synthetic */ Start(a aVar, InterfaceC0518f interfaceC0518f, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? a.None : aVar, (i10 & 2) != 0 ? InterfaceC0518f.a.f26196a : interfaceC0518f, str, (i10 & 8) != 0 ? false : z10);
            }

            public static /* synthetic */ Start p(Start start, a aVar, InterfaceC0518f interfaceC0518f, String str, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    aVar = start.captureState;
                }
                if ((i10 & 2) != 0) {
                    interfaceC0518f = start.uploadState;
                }
                if ((i10 & 4) != 0) {
                    str = start.documentId;
                }
                if ((i10 & 8) != 0) {
                    z10 = start.shouldShowUploadOptionsDialog;
                }
                return start.o(aVar, interfaceC0518f, str, z10);
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
                return this.captureState == start.captureState && Intrinsics.c(this.uploadState, start.uploadState) && Intrinsics.c(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            public int hashCode() {
                int iHashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // no.u2.f
            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // no.u2.f
            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public InterfaceC0518f getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final Start o(@NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable String documentId, boolean shouldShowUploadOptionsDialog) {
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
            public Start(@NotNull a captureState, @NotNull InterfaceC0518f uploadState, @Nullable String str, boolean z10) {
                super(captureState, uploadState, str, p001kotlin.collections.p.k(), null);
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z10;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26200a;
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
            f26200a = iArr;
            int[] iArr2 = new int[f.a.values().length];
            try {
                iArr2[f.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4", f = "DocumentWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26201t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, f, c, Object>.a f26202u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u2 f26203v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f26204w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar, u2 u2Var, String str, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f26202u = aVar;
            this.f26203v = u2Var;
            this.f26204w = str;
        }

        public static final Unit p(String str, ln.r.c cVar) {
            Object objC = cVar.c();
            f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = objC instanceof f.ReviewCapturesWithoutDocumentId ? (f.ReviewCapturesWithoutDocumentId) objC : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f21506a;
            }
            cVar.e(new f.ReviewCaptures(reviewCapturesWithoutDocumentId.l(), str, null, new f.InterfaceC0518f.UploadFiles(str), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new h(this.f26202u, this.f26203v, this.f26204w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f26201t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Input, f, ? extends c>> hVarD = this.f26202u.d();
            u2 u2Var = this.f26203v;
            final String str = this.f26204w;
            hVarD.a(ln.z.d(u2Var, null, new Function1() { // from class: no.v2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return u2.h.p(str, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", f = "DocumentWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26205t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, f, c, Object>.a f26206u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u2 f26207v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ f.InterfaceC0518f f26208w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar, u2 u2Var, f.InterfaceC0518f interfaceC0518f, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f26206u = aVar;
            this.f26207v = u2Var;
            this.f26208w = interfaceC0518f;
        }

        public static final Unit p(f.InterfaceC0518f interfaceC0518f, ln.r.c cVar) {
            cVar.e(f.i((f) cVar.c(), new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId()), null, null, null, 14, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new i(this.f26206u, this.f26207v, this.f26208w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f26205t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Input, f, ? extends c>> hVarD = this.f26206u.d();
            u2 u2Var = this.f26207v;
            final f.InterfaceC0518f interfaceC0518f = this.f26208w;
            hVarD.a(ln.z.d(u2Var, null, new Function1() { // from class: no.w2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return u2.i.p(interfaceC0518f, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    public u2(@NotNull l6.s imageLoader, @NotNull Context applicationContext, @NotNull fq.n1 permissionRequestWorkflow, @NotNull no.c documentCameraWorker, @NotNull y2.b documentsSelectWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.a.C0164a documentCreateWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorker, @NotNull po.a.C0563a documentFileDeleteWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.g.a documentSubmitWorker, @NotNull ir.b navigationStateManager, @NotNull dr.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final ln.r A1(final u2 u2Var, final f fVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(u2Var, null, new Function1() { // from class: no.c1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.B1(it, u2Var, fVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit B1(fq.n1.Output output, u2 u2Var, f fVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = g.f26200a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = u2Var.documentCameraWorker;
            String string = u2Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(cVar.e(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            action.e(fVar.a(f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit C0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.g.f26091a);
        return Unit.f21506a;
    }

    public static final ln.r C1(u2 u2Var, final com.withpersona.sdk2.inquiry.document.network.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.C0173b) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.p1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.D1(it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.a) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.q1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.E1(it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit D0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit D1(com.withpersona.sdk2.inquiry.document.network.e.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        f.ReviewCaptures reviewCaptures = objC instanceof f.ReviewCaptures ? (f.ReviewCaptures) objC : null;
        if (reviewCaptures == null) {
            return Unit.f21506a;
        }
        f.InterfaceC0518f.ReadyToSubmit readyToSubmit = new f.InterfaceC0518f.ReadyToSubmit(reviewCaptures.getDocumentId());
        List<no.e> listA = ((com.withpersona.sdk2.inquiry.document.network.e.b.C0173b) bVar).a();
        List<no.e> listL = reviewCaptures.l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (obj instanceof no.e.Local) {
                arrayList.add(obj);
            }
        }
        action.e(f.ReviewCaptures.p(reviewCaptures, CollectionsKt.w0(listA, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        return Unit.f21506a;
    }

    public static final Unit E0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.j.f26094a);
        return Unit.f21506a;
    }

    public static final Unit E1(com.withpersona.sdk2.inquiry.document.network.e.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.e.b.a) bVar).getCause()));
        return Unit.f21506a;
    }

    public static final Unit F0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit F1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit G0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit G1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit H0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit I0(u2 u2Var, ln.k.a aVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2Var.K0(aVar, a.j.f26094a);
        return Unit.f21506a;
    }

    public static final ln.r J1(u2 u2Var, final Input input, final no.c.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof no.c.b.C0510b) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.k2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.K1(it, input, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, no.c.b.a.f25926a)) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.l2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.L1((ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit K1(no.c.b bVar, Input input, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        f.InterfaceC0518f uploadState = ((f) action.c()).getUploadState();
        f.a aVar = null;
        no.e eVar = null;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(((f) action.c()).l(), new no.e.Local(((no.c.b.C0510b) bVar).getAbsoluteFilePath(), no.a.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, uploadState, eVar, z10, z11, str, 244, null));
        return Unit.f21506a;
    }

    public static final Unit L0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.b.f26121a);
        return Unit.f21506a;
    }

    public static final Unit L1(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).a(f.a.None));
        return Unit.f21506a;
    }

    public static final Unit M0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.a.f26120a);
        return Unit.f21506a;
    }

    public static final ln.r M1(final u2 u2Var, final Input input, final f fVar, final y2.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof y2.c.Success) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.m2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.N1(it, input, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof y2.c.Failure) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.n2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.O1(it, input, u2Var, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, y2.c.a.f26250a)) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.o2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.P1(fVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit N0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).a(f.a.SelectFileFromDocuments).f(false));
        return Unit.f21506a;
    }

    public static final Unit N1(y2.c cVar, Input input, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        f.a aVar = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(((f) action.c()).l(), a0.b(((y2.c.Success) cVar).a())), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, ((f) action.c()).getUploadState(), null, false, false, null, 244, null));
        return Unit.f21506a;
    }

    public static final Unit O0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).a(f.a.SelectImageFromPhotoLibrary).f(false));
        return Unit.f21506a;
    }

    public static final Unit O1(y2.c cVar, Input input, u2 u2Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        f.a aVar = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(((f) action.c()).l(), a0.b(((y2.c.Failure) cVar).a())), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, ((f) action.c()).getUploadState(), null, false, false, u2Var.applicationContext.getString(jq.g.f20883m), 116, null));
        return Unit.f21506a;
    }

    public static final Unit P0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).a(f.a.CheckCameraPermissions).f(false));
        return Unit.f21506a;
    }

    public static final Unit P1(f fVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(fVar.a(f.a.None));
        return Unit.f21506a;
    }

    public static final Unit Q0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).f(true));
        return Unit.f21506a;
    }

    public static final ln.r Q1(u2 u2Var, final com.withpersona.sdk2.inquiry.document.network.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.C0166b) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.d2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.R1(it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.Error) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.f2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.S1(it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit R0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((f) action.c()).f(false));
        return Unit.f21506a;
    }

    public static final Unit R1(com.withpersona.sdk2.inquiry.document.network.a.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        com.withpersona.sdk2.inquiry.document.network.a.b.C0166b c0166b = (com.withpersona.sdk2.inquiry.document.network.a.b.C0166b) bVar;
        action.e(f.i((f) action.c(), new f.InterfaceC0518f.ReadyToSubmit(c0166b.getDocumentId()), c0166b.getDocumentId(), null, null, 12, null));
        return Unit.f21506a;
    }

    public static final Unit S0(a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c() instanceof f.ReviewCaptures) {
            a.RemoveDocument removeDocument = (a.RemoveDocument) aVar;
            action.e(f.i((f) action.c(), new f.InterfaceC0518f.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
        }
        return Unit.f21506a;
    }

    public static final Unit S1(com.withpersona.sdk2.inquiry.document.network.a.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        com.withpersona.sdk2.inquiry.document.network.a.b.Error error = (com.withpersona.sdk2.inquiry.document.network.a.b.Error) bVar;
        if (!error.getCause().isRecoverable()) {
            action.d(new c.Errored(error.getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit T0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        f fVar = (f) action.c();
        if (fVar instanceof f.ReviewCaptures) {
            action.e(f.ReviewCaptures.p((f.ReviewCaptures) fVar, null, null, null, null, null, false, false, null, 127, null));
        }
        return Unit.f21506a;
    }

    public static final ln.r T1(final u2 u2Var, final f.InterfaceC0518f interfaceC0518f, final no.e.Local local, final Input input, final com.withpersona.sdk2.inquiry.document.network.c.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.c.b.d) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.g2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.U1(interfaceC0518f, response, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0168c) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.h2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.V1(local, response, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.c.b.a) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.i2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.W1(local, interfaceC0518f, response, u2Var, input, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0167b) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.j2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.X1(response, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit U0(a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        a.Submit submit = (a.Submit) aVar;
        action.e(new f.UploadDocument(((f) action.c()).l(), submit.getDocumentId(), new f.InterfaceC0518f.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        return Unit.f21506a;
    }

    public static final Unit U1(f.InterfaceC0518f interfaceC0518f, com.withpersona.sdk2.inquiry.document.network.c.b bVar, ln.r.c action) {
        f.InterfaceC0518f readyToSubmit;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<no.e> listL = ((f) action.c()).l();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listL, 10));
        for (Parcelable parcelableA : listL) {
            com.withpersona.sdk2.inquiry.document.network.c.b.d dVar = (com.withpersona.sdk2.inquiry.document.network.c.b.d) bVar;
            if (Intrinsics.c(parcelableA, dVar.getOldLocalDocument())) {
                parcelableA = dVar.getNewRemoteDocument();
            }
            arrayList.add(parcelableA);
        }
        if (arrayList.isEmpty()) {
            readyToSubmit = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
            break;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                readyToSubmit = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((no.e) obj) instanceof no.e.Local) {
                readyToSubmit = new f.InterfaceC0518f.UploadFiles(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                break;
            }
        }
        action.e(f.i((f) action.c(), readyToSubmit, null, arrayList, null, 10, null));
        return Unit.f21506a;
    }

    public static final Unit V1(no.e.Local local, com.withpersona.sdk2.inquiry.document.network.c.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<no.e> listL = ((f) action.c()).l();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listL, 10));
        for (Parcelable parcelableF : listL) {
            if ((parcelableF instanceof no.e.Local) && Intrinsics.c(parcelableF, local)) {
                parcelableF = no.e.Local.f((no.e.Local) parcelableF, null, null, ((com.withpersona.sdk2.inquiry.document.network.c.b.C0168c) bVar).getProgressPercentage(), 3, null);
            }
            arrayList.add(parcelableF);
        }
        action.e(f.i((f) action.c(), ((f) action.c()).getUploadState(), null, arrayList, null, 10, null));
        return Unit.f21506a;
    }

    public static final Unit W0(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit W1(no.e.Local local, f.InterfaceC0518f interfaceC0518f, com.withpersona.sdk2.inquiry.document.network.c.b bVar, u2 u2Var, Input input, ln.r.c action) {
        f.InterfaceC0518f uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List listV0 = CollectionsKt.v0(((f) action.c()).l(), local);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                    break;
                }
                if (((no.e) it.next()) instanceof no.e.Local) {
                    uploadFiles = new f.InterfaceC0518f.UploadFiles(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
            break;
        }
        f.InterfaceC0518f interfaceC0518f2 = uploadFiles;
        com.withpersona.sdk2.inquiry.document.network.c.b.a aVar = (com.withpersona.sdk2.inquiry.document.network.c.b.a) bVar;
        no.e eVar = null;
        action.e(new f.ReviewCaptures(listV0, ((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId(), f.a.None, interfaceC0518f2, eVar, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, a0.c(aVar.getCause(), u2Var.applicationContext, input), 80, null));
        return Unit.f21506a;
    }

    public static final Unit X0(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit X1(com.withpersona.sdk2.inquiry.document.network.c.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.c.b.C0167b) bVar).getCause()));
        return Unit.f21506a;
    }

    public static final Unit Y0(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.j.f26094a);
        return Unit.f21506a;
    }

    public static final ln.r Y1(u2 u2Var, final no.e.Remote remote, final f.InterfaceC0518f interfaceC0518f, final po.a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return ln.z.d(u2Var, null, new Function1() { // from class: no.q2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.Z1(remote, interfaceC0518f, response, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Z0(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit Z1(no.e.Remote remote, f.InterfaceC0518f interfaceC0518f, po.a.b bVar, ln.r.c action) {
        f.InterfaceC0518f uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        f.ReviewCaptures reviewCaptures = objC instanceof f.ReviewCaptures ? (f.ReviewCaptures) objC : null;
        if (reviewCaptures == null) {
            return Unit.f21506a;
        }
        List listV0 = CollectionsKt.v0(reviewCaptures.l(), remote);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
                    break;
                }
                if (((no.e) it.next()) instanceof no.e.Local) {
                    uploadFiles = new f.InterfaceC0518f.UploadFiles(((f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new f.InterfaceC0518f.ReadyToSubmit(((f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
            break;
        }
        f.InterfaceC0518f interfaceC0518f2 = uploadFiles;
        if (bVar instanceof po.a.b.C0565b) {
            action.e(f.ReviewCaptures.p(reviewCaptures, listV0, null, null, interfaceC0518f2, null, false, false, null, 230, null));
        } else {
            if (!(bVar instanceof po.a.b.Error)) {
                throw new zt.l();
            }
            action.d(new c.Errored(((po.a.b.Error) bVar).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit a1(u2 u2Var, ln.k.a aVar, f fVar, no.e.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        u2Var.K0(aVar, new a.RemoveDocument(((f.ReviewCaptures) fVar).getDocumentId(), document));
        return Unit.f21506a;
    }

    public static final Unit b1(u2 u2Var, ln.k.a aVar, f fVar) {
        u2Var.K0(aVar, new a.Submit(((f.ReviewCaptures) fVar).getDocumentId()));
        return Unit.f21506a;
    }

    public static final Unit c1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit d1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit e1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.d.f26088a);
        return Unit.f21506a;
    }

    public static final ln.r f1(final u2 u2Var, final f fVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(u2Var, null, new Function1() { // from class: no.j1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.g1(it, u2Var, fVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit g1(fq.n1.Output output, u2 u2Var, f fVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = g.f26200a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = u2Var.documentCameraWorker;
            String string = u2Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(cVar.e(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            action.e(fVar.a(f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit h1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.c.f26087a);
        return Unit.f21506a;
    }

    public static final Unit i1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.c.f26087a);
        return Unit.f21506a;
    }

    public static final Unit j1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit k1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit l1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.j.f26094a);
        return Unit.f21506a;
    }

    public static final Unit m1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit n1(no.e.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit o1() {
        return Unit.f21506a;
    }

    public static final Unit p1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit q1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit r1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.d.f26088a);
        return Unit.f21506a;
    }

    public static final ln.r s1(final u2 u2Var, final f fVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(u2Var, null, new Function1() { // from class: no.r1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.t1(it, u2Var, fVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit t1(fq.n1.Output output, u2 u2Var, f fVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = g.f26200a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = u2Var.documentCameraWorker;
            String string = u2Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(cVar.e(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            action.e(fVar.a(f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit u1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.c.f26087a);
        return Unit.f21506a;
    }

    public static final ln.r v1(u2 u2Var, final com.withpersona.sdk2.inquiry.document.network.g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.document.network.g.b.C0174b.f9993a)) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.n1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.w1((ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.g.b.Error) {
            return ln.z.d(u2Var, null, new Function1() { // from class: no.o1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.x1(it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit w1(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(c.d.f26123a);
        return Unit.f21506a;
    }

    public static final Unit x1(com.withpersona.sdk2.inquiry.document.network.g.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.g.b.Error) bVar).getCause()));
        return Unit.f21506a;
    }

    public static final Unit y1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit z1(u2 u2Var, ln.k.a aVar) {
        u2Var.K0(aVar, a.b.f26086a);
        return Unit.f21506a;
    }

    public final List<Pair<String, Function1<x5, Unit>>> A0(w wVar, final ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        return new or.c.a().a(wVar.getSelectDocumentButton(), new Function1() { // from class: no.y0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.C0(this.f26240a, aVar, (x5) obj);
            }
        }).a(wVar.getSelectPhotoButton(), new Function1() { // from class: no.z0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.D0(this.f26273a, aVar, (x5) obj);
            }
        }).a(wVar.getTakePhotoButton(), new Function1() { // from class: no.a1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.E0(this.f25915a, aVar, (x5) obj);
            }
        }).a(wVar.getLaunchUploadOptionsButton(), new Function1() { // from class: no.b1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.F0(this.f25919a, aVar, (x5) obj);
            }
        }).b();
    }

    public final List<Pair<String, Function1<x5, Unit>>> B0(f3 f3Var, final ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        return new or.c.a().a(f3Var.getSelectDocumentButton(), new Function1() { // from class: no.d1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.G0(this.f25964a, aVar, (x5) obj);
            }
        }).a(f3Var.getSelectPhotoButton(), new Function1() { // from class: no.e1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.H0(this.f25975a, aVar, (x5) obj);
            }
        }).a(f3Var.getTakePhotoButton(), new Function1() { // from class: no.f1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.I0(this.f25979a, aVar, (x5) obj);
            }
        }).b();
    }

    public final void H1(f.a aVar, final Input input, final f fVar, ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar2) {
        int i10 = g.b[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            ln.w.l(aVar2, this.documentCameraWorker, p001kotlin.jvm.internal.d0.k(no.c.class), BuildConfig.FLAVOR, new Function1() { // from class: no.g1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.J1(this.f25990a, input, (c.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new zt.l();
            }
            ln.w.l(aVar2, fVar.getCaptureState() == f.a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), p001kotlin.jvm.internal.d0.k(y2.class), BuildConfig.FLAVOR, new Function1() { // from class: no.h1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.M1(this.f25994a, input, fVar, (y2.c) obj);
                }
            });
        }
    }

    public final void I1(final f.InterfaceC0518f interfaceC0518f, final Input input, f fVar, ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        if (Intrinsics.c(interfaceC0518f, f.InterfaceC0518f.a.f26196a)) {
            if (fVar.getDocumentId() != null) {
                return;
            }
            ln.w.l(aVar, this.documentCreateWorker.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), p001kotlin.jvm.internal.d0.k(com.withpersona.sdk2.inquiry.document.network.a.class), BuildConfig.FLAVOR, new Function1() { // from class: no.k1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.Q1(this.f26025a, (com.withpersona.sdk2.inquiry.document.network.a.b) obj);
                }
            });
            return;
        }
        if (!(interfaceC0518f instanceof f.InterfaceC0518f.UploadFiles)) {
            if (!(interfaceC0518f instanceof f.InterfaceC0518f.DeleteFiles)) {
                if (!(interfaceC0518f instanceof f.InterfaceC0518f.ReadyToSubmit)) {
                    throw new zt.l();
                }
                return;
            } else {
                if (fVar instanceof f.ReviewCaptures) {
                    f.ReviewCaptures reviewCaptures = (f.ReviewCaptures) fVar;
                    no.e documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final no.e.Remote remote = documentFileToDelete instanceof no.e.Remote ? (no.e.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    ln.w.l(aVar, this.documentFileDeleteWorker.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), p001kotlin.jvm.internal.d0.k(po.a.class), BuildConfig.FLAVOR, new Function1() { // from class: no.m1
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return u2.Y1(this.f26034a, remote, interfaceC0518f, (po.a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<no.e> listL = fVar.l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (obj instanceof no.e.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.b("upload_complete", new i(aVar, this, interfaceC0518f, null));
            return;
        }
        for (final no.e.Local local : CollectionsKt.H0(arrayList, 3)) {
            com.withpersona.sdk2.inquiry.document.network.c.a aVar2 = this.documentFileUploadWorker;
            String sessionToken = input.getSessionToken();
            String documentId = ((f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            ln.w.l(aVar, aVar2.a(sessionToken, documentId, local, z10), p001kotlin.jvm.internal.d0.k(com.withpersona.sdk2.inquiry.document.network.c.class), local.getAbsoluteFilePath(), new Function1() { // from class: no.l1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return u2.T1(this.f26028a, interfaceC0518f, local, input, (com.withpersona.sdk2.inquiry.document.network.c.b) obj2);
                }
            });
        }
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public f d(@NotNull Input props, @Nullable Snapshot snapshot) {
        f fVarF;
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
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable2);
                Intrinsics.checkNotNullExpressionValue(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            f fVar = (f) parcelable;
            if (fVar != null && (fVarF = fVar.f(false)) != null) {
                return fVarF;
            }
        }
        e startPage = props.getStartPage();
        if (Intrinsics.c(startPage, e.a.f26161a)) {
            return new f.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (startPage instanceof e.Review) {
            return new f.ReviewCaptures(p001kotlin.collections.p.k(), ((e.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
        }
        throw new zt.l();
    }

    public final void K0(ln.k<? super Input, f, ? extends c, ? extends Object>.a aVar, final a aVar2) {
        ln.r<? super Object, f, ? extends Object> rVarD;
        if (Intrinsics.c(aVar2, a.b.f26086a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.s1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.L0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.C0515a.f26085a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.u1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.M0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.g.f26091a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.v1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.N0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.h.f26092a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.w1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.O0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.j.f26094a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.x1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.P0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.e.f26089a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.y1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.Q0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.c.f26087a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.z1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.R0((ln.r.c) obj);
                }
            }, 1, null);
        } else if (aVar2 instanceof a.RemoveDocument) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.a2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.S0(aVar2, (ln.r.c) obj);
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.d.f26088a)) {
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.b2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.T0((ln.r.c) obj);
                }
            }, 1, null);
        } else {
            if (!(aVar2 instanceof a.Submit)) {
                throw new zt.l();
            }
            rVarD = ln.z.d(this, null, new Function1() { // from class: no.c2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.U0(aVar2, (ln.r.c) obj);
                }
            }, 1, null);
        }
        aVar.d().a(rVarD);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull final f renderState, @NotNull final ln.k<? super Input, f, ? extends c, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof f.UploadDocument), false, 8, null);
        H1(renderState.getCaptureState(), renderProps, renderState, context);
        I1(renderState.getUploadState(), renderProps, renderState, context);
        a0.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        boolean z10 = renderState instanceof f.Start;
        String str = BuildConfig.FLAVOR;
        if (z10) {
            Object jVar = new j(or.d.a(renderProps.getPages().getDocumentStartPage()), A0(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.b(), new Function0() { // from class: no.b0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.W0(this.f25918a, context);
                }
            }, new Function0() { // from class: no.d0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.X0(this.f25963a, context);
                }
            }, null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles(), 32, null);
            f.Start start = (f.Start) renderState;
            if (start.getShouldShowUploadOptionsDialog()) {
                jVar = cq.d.a(or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: no.p0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u2.i1(this.f26046a, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), jVar, "document_upload_options_dialog");
            }
            boolean z11 = start.getCaptureState() == f.a.CheckCameraPermissions;
            fq.n0 n0Var = fq.n0.Camera;
            String permissionsTitle = renderProps.getPermissionsTitle();
            if (permissionsTitle != null) {
                str = permissionsTitle;
            }
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(jq.g.f20876f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(jq.g.f20875e, xq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return fq.y1.d(jVar, context, z11, n0Var, (3592 & 8) != 0 ? false : false, str, permissionsRationale, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : null, new Function1() { // from class: no.q0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.A1(this.f26055a, renderState, (fq.n1.Output) obj);
                }
            });
        }
        if (renderState instanceof f.ReviewCaptures) {
            f.ReviewCaptures reviewCaptures = (f.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                ln.w.l(context, this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), p001kotlin.jvm.internal.d0.k(com.withpersona.sdk2.inquiry.document.network.e.class), BuildConfig.FLAVOR, new Function1() { // from class: no.r0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u2.C1(this.f26060a, (com.withpersona.sdk2.inquiry.document.network.e.b) obj);
                    }
                });
            }
            d.ReviewCaptures reviewCaptures2 = new d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.l(), this.navigationStateManager.b(), new Function0() { // from class: no.s0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.F1(this.f26065a, context);
                }
            }, new Function0() { // from class: no.t0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.G1(this.f26068a, context);
                }
            }, new Function0() { // from class: no.u0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.Y0(this.f26072a, context);
                }
            }, new Function0() { // from class: no.v0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.Z0(this.f26213a, context);
                }
            }, new Function1() { // from class: no.w0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.a1(this.f26222a, context, renderState, (e.Remote) obj);
                }
            }, new Function0() { // from class: no.m0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.b1(this.f26032a, context, renderState);
                }
            }, new Function0() { // from class: no.x0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.c1(this.f26226a, context);
                }
            }, new Function0() { // from class: no.i1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.d1(this.f25998a, context);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.l().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.l().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new f.InterfaceC0518f.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: no.t1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.e1(this.f26069a, context);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
            boolean z12 = reviewCaptures.getCaptureState() == f.a.CheckCameraPermissions;
            fq.n0 n0Var2 = fq.n0.Camera;
            String permissionsTitle2 = renderProps.getPermissionsTitle();
            if (permissionsTitle2 == null) {
                permissionsTitle2 = BuildConfig.FLAVOR;
            }
            String permissionsRationale2 = renderProps.getPermissionsRationale();
            if (permissionsRationale2 == null) {
                permissionsRationale2 = this.applicationContext.getString(jq.g.f20876f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
            }
            Context context3 = this.applicationContext;
            String string2 = context3.getString(jq.g.f20875e, xq.g.b(context3));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            cq.c cVarD = fq.y1.d(reviewCaptures2, context, z12, n0Var2, (3592 & 8) != 0 ? false : false, permissionsTitle2, permissionsRationale2, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : null, new Function1() { // from class: no.e2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.f1(this.f25976a, renderState, (fq.n1.Output) obj);
                }
            });
            return reviewCaptures.getShouldShowUploadOptionsDialog() ? cq.d.a(or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: no.p2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.h1(this.f26048a, context);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), cVarD, "document_upload_screen") : new cq.c(cVarD, p001kotlin.collections.p.k(), "document_upload_screen");
        }
        if (!(renderState instanceof f.ReviewCapturesWithoutDocumentId)) {
            if (!(renderState instanceof f.UploadDocument)) {
                throw new zt.l();
            }
            ln.w.l(context, this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((f.UploadDocument) renderState).l()), p001kotlin.jvm.internal.d0.k(com.withpersona.sdk2.inquiry.document.network.g.class), BuildConfig.FLAVOR, new Function1() { // from class: no.l0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u2.v1(this.f26027a, (com.withpersona.sdk2.inquiry.document.network.g.b) obj);
                }
            });
            ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
            return new d.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: no.n0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.y1(this.f26038a, context);
                }
            }, new Function0() { // from class: no.o0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u2.z1(this.f26042a, context);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, Barcode.FORMAT_UPC_A, null);
        }
        f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (f.ReviewCapturesWithoutDocumentId) renderState;
        String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
        if (documentId != null) {
            context.b(documentId, new h(context, this, documentId, null));
        }
        d.ReviewCaptures reviewCaptures3 = new d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.l(), this.navigationStateManager.b(), new Function0() { // from class: no.r2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.j1(this.f26063a, context);
            }
        }, new Function0() { // from class: no.s2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.k1(this.f26066a, context);
            }
        }, new Function0() { // from class: no.t2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.l1(this.f26070a, context);
            }
        }, new Function0() { // from class: no.c0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.m1(this.f25937a, context);
            }
        }, new Function1() { // from class: no.e0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.n1((e.Remote) obj);
            }
        }, new Function0() { // from class: no.f0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.o1();
            }
        }, new Function0() { // from class: no.g0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.p1(this.f25989a, context);
            }
        }, new Function0() { // from class: no.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.q1(this.f25993a, context);
            }
        }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.l().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: no.i0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.r1(this.f25997a, context);
            }
        }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
        boolean z13 = reviewCapturesWithoutDocumentId.getCaptureState() == f.a.CheckCameraPermissions;
        fq.n0 n0Var3 = fq.n0.Camera;
        String permissionsTitle3 = renderProps.getPermissionsTitle();
        if (permissionsTitle3 == null) {
            permissionsTitle3 = BuildConfig.FLAVOR;
        }
        String permissionsRationale3 = renderProps.getPermissionsRationale();
        if (permissionsRationale3 == null) {
            permissionsRationale3 = this.applicationContext.getString(jq.g.f20876f);
            Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
        }
        String str2 = permissionsRationale3;
        Context context4 = this.applicationContext;
        String string3 = context4.getString(jq.g.f20875e, xq.g.b(context4));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        cq.c cVarD2 = fq.y1.d(reviewCaptures3, context, z13, n0Var3, (3592 & 8) != 0 ? false : false, permissionsTitle3, str2, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : null, new Function1() { // from class: no.j0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.s1(this.f26018a, renderState, (fq.n1.Output) obj);
            }
        });
        return reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? cq.d.a(or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: no.k0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.u1(this.f26024a, context);
            }
        }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), cVarD2, "document_upload_screen") : new cq.c(cVarD2, p001kotlin.collections.p.k(), "document_upload_screen");
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull f state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lno/u2$d;", BuildConfig.FLAVOR, "Lor/s;", "b", "()Lor/s;", "bottomSheet", "c", "a", "Lno/j;", "Lno/u2$d$a;", "Lno/u2$d$b;", "Lno/u2$d$c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @Nullable
        /* JADX INFO: renamed from: b */
        UiStepBottomSheet getBottomSheet();

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0012\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0016\u0010$¨\u0006%"}, d2 = {"Lno/u2$d$b;", "Lno/u2$d;", "Lor/i;", "uiScreen", "Lir/a;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", BuildConfig.FLAVOR, "navBarTitle", "Lor/s;", "bottomSheet", "<init>", "(Lor/i;Lir/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lor/s;)V", "a", "Lor/i;", "g", "()Lor/i;", "b", "Lir/a;", "c", "()Lir/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "Lor/s;", "()Lor/s;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            public b(@NotNull UiComponentScreen uiScreen, @NotNull ir.a navigationState, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @Nullable UiStepBottomSheet uiStepBottomSheet) {
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

            @Override // no.u2.d
            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
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

            public /* synthetic */ b(UiComponentScreen uiComponentScreen, ir.a aVar, StepStyles.DocumentStepStyle documentStepStyle, Function0 function0, Function0 function1, String str, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiComponentScreen, aVar, documentStepStyle, function0, function1, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : uiStepBottomSheet);
            }
        }

        /* JADX INFO: renamed from: no.u2$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b \u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b#\u00107¨\u00068"}, d2 = {"Lno/u2$d$a;", "Lno/u2$d;", BuildConfig.FLAVOR, Title.type, "prompt", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "navBarTitle", "Lor/s;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Lor/s;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "g", "c", "Lir/a;", "()Lir/a;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getNavBarTitle", "j", "Lor/s;", "()Lor/s;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoadingAnimation implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final NextStep.Document.AssetConfig.PendingPage assetConfig;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            public LoadingAnimation(@Nullable String str, @Nullable String str2, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable NextStep.Document.AssetConfig.PendingPage pendingPage, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str3, @Nullable UiStepBottomSheet uiStepBottomSheet) {
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

            @Override // no.u2.d
            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
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
                return Intrinsics.c(this.title, loadingAnimation.title) && Intrinsics.c(this.prompt, loadingAnimation.prompt) && Intrinsics.c(this.navigationState, loadingAnimation.navigationState) && Intrinsics.c(this.onBack, loadingAnimation.onBack) && Intrinsics.c(this.onCancel, loadingAnimation.onCancel) && Intrinsics.c(this.styles, loadingAnimation.styles) && Intrinsics.c(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition && Intrinsics.c(this.navBarTitle, loadingAnimation.navBarTitle) && Intrinsics.c(this.bottomSheet, loadingAnimation.bottomSheet);
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

            public /* synthetic */ LoadingAnimation(String str, String str2, ir.a aVar, Function0 function0, Function0 function1, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextPosition, String str3, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, aVar, function0, function1, documentStepStyle, pendingPage, pendingPageTextPosition, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str3, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : uiStepBottomSheet);
            }
        }

        /* JADX INFO: renamed from: no.u2$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b9\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bF\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bO\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bI\u0010ER\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010P\u001a\u0004\b7\u0010QR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\b0\u0010QR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bS\u0010QR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010(R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bK\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010VR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bB\u0010(R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b4\u0010Z¨\u0006["}, d2 = {"Lno/u2$d$c;", "Lno/u2$d;", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, Title.type, "prompt", "disclaimer", "submitButtonText", BuildConfig.FLAVOR, "Lno/e;", "documents", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lno/e$b;", "onRemove", "onSubmit", "onCancel", "onBack", BuildConfig.FLAVOR, "disabled", "addButtonEnabled", "submitButtonEnabled", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "navBarTitle", "Lor/s;", "bottomSheet", "<init>", "(Ll6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lor/s;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ll6/s;", "g", "()Ll6/s;", "b", "Ljava/lang/String;", "t", "c", "p", "d", "e", "s", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lir/a;", "i", "()Lir/a;", "h", "Lkotlin/jvm/functions/Function0;", "getOpenSelectFile", "()Lkotlin/jvm/functions/Function0;", "getSelectFromPhotoLibrary", "j", "getOpenCamera", "k", "o", "l", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "n", "Z", "()Z", "q", "r", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "v", "w", "Lor/s;", "()Lor/s;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReviewCaptures implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final l6.s imageLoader;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String submitButtonText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<no.e> documents;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openSelectFile;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> selectFromPhotoLibrary;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openCamera;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openUploadOptions;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function1<no.e.Remote, Unit> onRemove;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onSubmit;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean disabled;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean addButtonEnabled;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean submitButtonEnabled;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull l6.s imageLoader, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<? extends no.e> documents, @NotNull ir.a navigationState, @NotNull Function0<Unit> openSelectFile, @NotNull Function0<Unit> selectFromPhotoLibrary, @NotNull Function0<Unit> openCamera, @NotNull Function0<Unit> openUploadOptions, @NotNull Function1<? super no.e.Remote, Unit> onRemove, @NotNull Function0<Unit> onSubmit, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onBack, boolean z10, boolean z11, boolean z12, @Nullable String str5, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable String str6, @Nullable UiStepBottomSheet uiStepBottomSheet) {
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

            @Override // no.u2.d
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
            public final List<no.e> e() {
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
                return Intrinsics.c(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.c(this.title, reviewCaptures.title) && Intrinsics.c(this.prompt, reviewCaptures.prompt) && Intrinsics.c(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.c(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.c(this.documents, reviewCaptures.documents) && Intrinsics.c(this.navigationState, reviewCaptures.navigationState) && Intrinsics.c(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.c(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.c(this.openCamera, reviewCaptures.openCamera) && Intrinsics.c(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.c(this.onRemove, reviewCaptures.onRemove) && Intrinsics.c(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.c(this.onCancel, reviewCaptures.onCancel) && Intrinsics.c(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.c(this.error, reviewCaptures.error) && Intrinsics.c(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.c(this.styles, reviewCaptures.styles) && Intrinsics.c(this.navBarTitle, reviewCaptures.navBarTitle) && Intrinsics.c(this.bottomSheet, reviewCaptures.bottomSheet);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @NotNull
            /* JADX INFO: renamed from: g, reason: from getter */
            public final l6.s getImageLoader() {
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
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> k() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> l() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function1<no.e.Remote, Unit> m() {
                return this.onRemove;
            }

            @NotNull
            public final Function0<Unit> n() {
                return this.onSubmit;
            }

            @NotNull
            public final Function0<Unit> o() {
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

            public /* synthetic */ ReviewCaptures(l6.s sVar, String str, String str2, String str3, String str4, List list, ir.a aVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function1 function4, Function0 function5, Function0 function6, Function0 function7, boolean z10, boolean z11, boolean z12, String str5, Function0 function8, StepStyles.DocumentStepStyle documentStepStyle, String str6, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(sVar, str, str2, str3, str4, list, aVar, function0, function1, function2, function3, function4, function5, function6, function7, z10, z11, z12, str5, function8, documentStepStyle, (i10 & 2097152) != 0 ? null : str6, (i10 & 4194304) != 0 ? null : uiStepBottomSheet);
            }
        }
    }
}
