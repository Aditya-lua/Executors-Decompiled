package p088e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.NotificationCompat;
import androidx.core.view.C0626p;
import androidx.core.view.InterfaceC0624o;
import androidx.core.view.InterfaceC0630r;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0973o0;
import androidx.p616lifecycle.C0983t0;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.C14302e1;
import androidx.p616lifecycle.FragmentC0965k0;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.C4444h;
import p068d5.C4449m;
import p068d5.InterfaceC4445i;
import p113f.C5220a;
import p113f.InterfaceC5221b;
import p139g.AbstractC5854c;
import p139g.AbstractC5857f;
import p139g.InterfaceC5852a;
import p139g.InterfaceC5853b;
import p139g.InterfaceC5858g;
import p154h.AbstractC6248a;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p235k2.ActivityC7415g;
import p235k2.C7410b;
import p235k2.C7411c;
import p235k2.C7416h;
import p235k2.C7427s;
import p235k2.InterfaceC7423o;
import p235k2.InterfaceC7424p;
import p237k4.C7445b;
import p237k4.CreationExtras;
import p261l2.InterfaceC7978e;
import p261l2.InterfaceC7979f;
import p301n5.C8884a;
import p321o4.C9633a;
import p321o4.C9635c;
import p321o4.C9650r;
import p321o4.InterfaceC9636d;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e2\u00020\u00022\u00020\u000f2\u00020\u0010:\b\u008f\u0001\u0093\u0001\u0097\u0001ä\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001cH\u0015¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b$\u0010#J\u0019\u0010'\u001a\u00020\u00132\b\b\u0001\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010'\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b'\u0010+J#\u0010'\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b'\u0010.J#\u0010/\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0013H\u0017¢\u0006\u0004\b0\u0010\u0012J\u0015\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J)\u00109\u001a\u0002082\u0006\u00105\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0002082\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u0002082\u0006\u00105\u001a\u00020%2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00132\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00132\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00132\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010\u0012J\u000f\u0010I\u001a\u00020\u0013H\u0017¢\u0006\u0004\bI\u0010\u0012J\u001f\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020%H\u0017¢\u0006\u0004\bM\u0010NJ)\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bM\u0010PJA\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020%2\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%H\u0017¢\u0006\u0004\bV\u0010WJK\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020%2\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bV\u0010XJ)\u0010[\u001a\u00020\u00132\u0006\u0010L\u001a\u00020%2\u0006\u0010Y\u001a\u00020%2\b\u0010Z\u001a\u0004\u0018\u00010JH\u0015¢\u0006\u0004\b[\u0010\\J-\u0010b\u001a\u00020\u00132\u0006\u0010L\u001a\u00020%2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010a\u001a\u00020`H\u0017¢\u0006\u0004\bb\u0010cJI\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\u0006\u0010i\u001a\u00020h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010nJA\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u00020%H\u0017¢\u0006\u0004\bz\u0010(J\u001b\u0010{\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020%0u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020%0u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00132\u0006\u0010K\u001a\u00020JH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020J0u¢\u0006\u0004\b\u007f\u0010wJ\u001b\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u001e\u0010\u0086\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001b\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u0087\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0082\u0001J#\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u0087\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008a\u0001\u0010wJ\u001e\u0010\u008b\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u0011\u0010\u008c\u0001\u001a\u00020\u0013H\u0015¢\u0006\u0005\b\u008c\u0001\u0010\u0012J\u0011\u0010\u008d\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0012R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u0099\u0001\u0010\u0012R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R \u0010¦\u0001\u001a\u00030¢\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bo\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010dR\u0017\u0010«\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010ª\u0001R\u001c\u0010°\u0001\u001a\u00020h8\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R$\u0010´\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010³\u0001R%\u0010º\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010³\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010³\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010³\u0001R\u0019\u0010Á\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Ã\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010À\u0001R!\u0010È\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010£\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030É\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010£\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R \u0010Ñ\u0001\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010£\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ø\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Û\u0001\u001a\u00030Ù\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0015\u0010ã\u0001\u001a\u00030à\u00018F¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001¨\u0006å\u0001"}, m31665d2 = {"Le/p;", "Lk2/g;", "", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/j;", "Ld5/i;", "Le/r0;", "Lo4/d;", "Lg/g;", "Lg/b;", "Ll2/e;", "Ll2/f;", "Lk2/o;", "Lk2/p;", "Landroidx/core/view/o;", "Le/i0;", "<init>", "()V", "", "R0", "Le/p0;", "dispatcher", "L0", "(Le/p0;)V", "Le/p$d;", "P0", "()Le/p$d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "e1", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "X0", "Lf/b;", "listener", "N0", "(Lf/b;)V", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/r;", "provider", "l0", "(Landroidx/core/view/r;)V", "R", "Y0", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/f;", "registry", "Lg/a;", "callback", "Lg/c;", "f1", "(Lh/a;Lg/f;Lg/a;)Lg/c;", "h", "(Lh/a;Lg/a;)Lg/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lx2/a;", "g0", "(Lx2/a;)V", "p0", "level", "onTrimMemory", "d0", "j", "onNewIntent", "(Landroid/content/Intent;)V", "O0", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lk2/h;", "e0", "y", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lk2/s;", "z", "h0", "onUserLeaveHint", "reportFullyDrawn", "Lf/a;", "c", "Lf/a;", "contextAwareHelper", "Landroidx/core/view/p;", "d", "Landroidx/core/view/p;", "menuHostHelper", "Ld5/h;", "e", "Ld5/h;", "getSavedStateRegistryController$annotations", "savedStateRegistryController", "Landroidx/lifecycle/b1;", "f", "Landroidx/lifecycle/b1;", "_viewModelStore", "g", "Le/p$d;", "reportFullyDrawnExecutor", "Le/h0;", "Ljt/h;", "U0", "()Le/h0;", "fullyDrawnReporter", "i", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "k", "Lg/f;", "q", "()Lg/f;", "activityResultRegistry", "Ljava/util/concurrent/CopyOnWriteArrayList;", "l", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "m", "onTrimMemoryListeners", "n", "onNewIntentListeners", "o", "onMultiWindowModeChangedListeners", "p", "onPictureInPictureModeChangedListeners", "Ljava/lang/Runnable;", "onUserLeaveHintListeners", "r", "Z", "dispatchingOnMultiWindowModeChanged", "s", "dispatchingOnPictureInPictureModeChanged", "Lo4/a;", "t", "W0", "()Lo4/a;", "onBackPressedInput", "Landroidx/lifecycle/a1$c;", "u", "X", "()Landroidx/lifecycle/a1$c;", "defaultViewModelProviderFactory", "v", "Q", "()Le/p0;", "onBackPressedDispatcher", "Landroidx/lifecycle/l;", "a", "()Landroidx/lifecycle/l;", "lifecycle", "w", "()Landroidx/lifecycle/b1;", "viewModelStore", "Lk4/a;", "()Lk4/a;", "defaultViewModelCreationExtras", "Lo4/c;", "V0", "()Lo4/c;", "navigationEventDispatcher", "Ld5/f;", "A", "()Ld5/f;", "savedStateRegistry", "b", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class ActivityC4722p extends ActivityC7415g implements InterfaceC0980s, InterfaceC0947c1, InterfaceC0962j, InterfaceC4445i, InterfaceC4727r0, InterfaceC9636d, InterfaceC5858g, InterfaceC5853b, InterfaceC7978e, InterfaceC7979f, InterfaceC7423o, InterfaceC7424p, InterfaceC0624o, InterfaceC4709i0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C5220a contextAwareHelper = new C5220a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C0626p menuHostHelper = new C0626p(new Runnable() { // from class: e.c
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC4722p.m23027Z0(this.f19181a);
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C4444h savedStateRegistryController;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C0944b1 _viewModelStore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final d reportFullyDrawnExecutor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h fullyDrawnReporter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int contentLayoutId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5857f activityResultRegistry;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC12631a<Configuration>> onConfigurationChangedListeners;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC12631a<Integer>> onTrimMemoryListeners;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC12631a<Intent>> onNewIntentListeners;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC12631a<C7416h>> onMultiWindowModeChangedListeners;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC12631a<C7427s>> onPictureInPictureModeChangedListeners;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean dispatchingOnMultiWindowModeChanged;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h onBackPressedInput;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h defaultViewModelProviderFactory;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h onBackPressedDispatcher;

    /* JADX INFO: renamed from: e.p$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"e/p$a", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0974p {
        public a() {
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(InterfaceC0980s source, AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            ActivityC4722p.this.m23044R0();
            ActivityC4722p.this.mo4656a().mo4938d(this);
        }
    }

    /* JADX INFO: renamed from: e.p$c */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Le/p$c;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", Payload.CUSTOM, "Landroidx/lifecycle/b1;", "Landroidx/lifecycle/b1;", "()Landroidx/lifecycle/b1;", "c", "(Landroidx/lifecycle/b1;)V", "viewModelStore", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object custom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C0944b1 viewModelStore;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0944b1 getViewModelStore() {
            return this.viewModelStore;
        }

        /* JADX INFO: renamed from: b */
        public final void m23062b(@Nullable Object obj) {
            this.custom = obj;
        }

        /* JADX INFO: renamed from: c */
        public final void m23063c(@Nullable C0944b1 c0944b1) {
            this.viewModelStore = c0944b1;
        }
    }

    /* JADX INFO: renamed from: e.p$d */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m31665d2 = {"Le/p$d;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)V", "a", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface d extends Executor {
        /* JADX INFO: renamed from: a */
        void mo23064a();

        /* JADX INFO: renamed from: h */
        void mo23065h(@NotNull View view);
    }

    /* JADX INFO: renamed from: e.p$e */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Le/p$e;", "Le/p$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Le/p;)V", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)V", "a", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) BacktraceMetrics.defaultTimeBetweenRetriesMs);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Runnable currentRunnable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean onDrawScheduled;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e() {
        }

        /* JADX INFO: renamed from: c */
        public static final void m23067c(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override // p088e.ActivityC4722p.d
        /* JADX INFO: renamed from: a */
        public void mo23064a() {
            ActivityC4722p.this.getWindow().getDecorView().removeCallbacks(this);
            ActivityC4722p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ActivityC4722p.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: e.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC4722p.e.m23067c(this.f19248a);
                    }
                });
            } else if (Intrinsics.m31980c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // p088e.ActivityC4722p.d
        /* JADX INFO: renamed from: h */
        public void mo23065h(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ActivityC4722p.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ActivityC4722p.this.m23045U0().m23002c()) {
                this.onDrawScheduled = false;
                ActivityC4722p.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityC4722p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: e.p$f */
    @Metadata(m31664d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"e/p$f", "Lg/f;", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Lk2/c;", "options", "", "k", "(ILh/a;Ljava/lang/Object;Lk2/c;)V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class f extends AbstractC5857f {
        public f() {
        }

        /* JADX INFO: renamed from: u */
        public static final void m23070u(f fVar, int i10, AbstractC6248a.a aVar) {
            fVar.m26249g(i10, aVar.m27450a());
        }

        /* JADX INFO: renamed from: v */
        public static final void m23071v(f fVar, int i10, IntentSender.SendIntentException sendIntentException) {
            fVar.m26248f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p139g.AbstractC5857f
        /* JADX INFO: renamed from: k */
        public <I, O> void mo23072k(final int requestCode, AbstractC6248a<I, O> contract, I input, C7411c options) {
            Bundle bundleMo30707c;
            final int i10;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ActivityC4722p activityC4722p = ActivityC4722p.this;
            final AbstractC6248a.a<O> synchronousResult = contract.getSynchronousResult(activityC4722p, input);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC4722p.f.m23070u(this.f19250a, requestCode, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(activityC4722p, input);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(activityC4722p.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleMo30707c = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleMo30707c = options != null ? options.mo30707c() : null;
            }
            Bundle bundle = bundleMo30707c;
            if (Intrinsics.m31980c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C7410b.m30697u(activityC4722p, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.m31980c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                C7410b.m30699w(activityC4722p, intentCreateIntent, requestCode, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i10 = requestCode;
                try {
                    C7410b.m30700x(activityC4722p, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                    Unit unit = Unit.f29331a;
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC4722p.f.m23071v(this.f19253a, i10, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i10 = requestCode;
            }
        }
    }

    public ActivityC4722p() {
        C4444h c4444hM22364b = C4444h.INSTANCE.m22364b(this);
        this.savedStateRegistryController = c4444hM22364b;
        this.reportFullyDrawnExecutor = m23042P0();
        this.fullyDrawnReporter = C7342i.m30456b(new Function0() { // from class: e.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityC4722p.m23025S0(this.f19187a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = C7342i.m30456b(new Function0() { // from class: e.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityC4722p.m23031d1(this.f19189a);
            }
        });
        if (mo4656a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        mo4656a().mo4935a(new InterfaceC0974p() { // from class: e.i
            @Override // androidx.p616lifecycle.InterfaceC0974p
            /* JADX INFO: renamed from: g */
            public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
                ActivityC4722p.m23018G0(this.f19198a, interfaceC0980s, aVar);
            }
        });
        mo4656a().mo4935a(new InterfaceC0974p() { // from class: e.j
            @Override // androidx.p616lifecycle.InterfaceC0974p
            /* JADX INFO: renamed from: g */
            public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
                ActivityC4722p.m23019H0(this.f19199a, interfaceC0980s, aVar);
            }
        });
        mo4656a().mo4935a(new a());
        c4444hM22364b.m22359c();
        C0973o0.m4966c(this);
        mo4583A().m22354c("android:support:activity-result", new C4442f.b() { // from class: e.k
            @Override // p068d5.C4442f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo4974a() {
                return ActivityC4722p.m23020I0(this.f19200a);
            }
        });
        m23040N0(new InterfaceC5221b() { // from class: e.l
            @Override // p113f.InterfaceC5221b
            /* JADX INFO: renamed from: a */
            public final void mo23005a(Context context) {
                ActivityC4722p.m23021J0(this.f19201a, context);
            }
        });
        this.defaultViewModelProviderFactory = C7342i.m30456b(new Function0() { // from class: e.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityC4722p.m23024Q0(this.f19202a);
            }
        });
        this.onBackPressedDispatcher = C7342i.m30456b(new Function0() { // from class: e.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityC4722p.m23028a1(this.f19204a);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m23018G0(ActivityC4722p activityC4722p, InterfaceC0980s interfaceC0980s, AbstractC0966l.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(interfaceC0980s, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC0966l.a.ON_STOP || (window = activityC4722p.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m23019H0(ActivityC4722p activityC4722p, InterfaceC0980s interfaceC0980s, AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(interfaceC0980s, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC0966l.a.ON_DESTROY) {
            activityC4722p.contextAwareHelper.m24188b();
            if (!activityC4722p.isChangingConfigurations()) {
                activityC4722p.mo4712w().m4887a();
            }
            activityC4722p.reportFullyDrawnExecutor.mo23064a();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static final Bundle m23020I0(ActivityC4722p activityC4722p) {
        Bundle bundle = new Bundle();
        activityC4722p.activityResultRegistry.m26253m(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m23021J0(ActivityC4722p activityC4722p, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleM22352a = activityC4722p.mo4583A().m22352a("android:support:activity-result");
        if (bundleM22352a != null) {
            activityC4722p.activityResultRegistry.m26252l(bundleM22352a);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m23023M0(C4723p0 c4723p0, ActivityC4722p activityC4722p, InterfaceC0980s interfaceC0980s, AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(interfaceC0980s, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC0966l.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = activityC4722p.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c4723p0.m23082j(onBackInvokedDispatcher);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static final C0983t0 m23024Q0(ActivityC4722p activityC4722p) {
        return new C0983t0(activityC4722p.getApplication(), activityC4722p, activityC4722p.getIntent() != null ? activityC4722p.getIntent().getExtras() : null);
    }

    /* JADX INFO: renamed from: S0 */
    public static final C4707h0 m23025S0(final ActivityC4722p activityC4722p) {
        return new C4707h0(activityC4722p.reportFullyDrawnExecutor, new Function0() { // from class: e.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityC4722p.m23026T0(this.f19184a);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m23026T0(ActivityC4722p activityC4722p) {
        activityC4722p.reportFullyDrawn();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m23027Z0(ActivityC4722p activityC4722p) {
        activityC4722p.m23049Y0();
    }

    /* JADX INFO: renamed from: a1 */
    public static final C4723p0 m23028a1(final ActivityC4722p activityC4722p) {
        final C4723p0 c4723p0 = new C4723p0(new Runnable() { // from class: e.o
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC4722p.m23029b1(this.f19207a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.m31980c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC4722p.m23030c1(this.f19182a, c4723p0);
                    }
                });
                return c4723p0;
            }
            activityC4722p.m23039L0(c4723p0);
        }
        return c4723p0;
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m23029b1(ActivityC4722p activityC4722p) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!Intrinsics.m31980c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!Intrinsics.m31980c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public static final void m23030c1(ActivityC4722p activityC4722p, C4723p0 c4723p0) {
        activityC4722p.m23039L0(c4723p0);
    }

    /* JADX INFO: renamed from: d1 */
    public static final C9633a m23031d1(ActivityC4722p activityC4722p) {
        C9633a c9633a = new C9633a();
        activityC4722p.m23046V0().m38023c(c9633a);
        return c9633a;
    }

    @Override // p068d5.InterfaceC4445i
    @NotNull
    /* JADX INFO: renamed from: A */
    public final C4442f mo4583A() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    /* JADX INFO: renamed from: L0 */
    public final void m23039L0(final C4723p0 dispatcher) {
        mo4656a().mo4935a(new InterfaceC0974p() { // from class: e.f
            @Override // androidx.p616lifecycle.InterfaceC0974p
            /* JADX INFO: renamed from: g */
            public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
                ActivityC4722p.m23023M0(dispatcher, this, interfaceC0980s, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m23040N0(@NotNull InterfaceC5221b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.m24187a(listener);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m23041O0(@NotNull InterfaceC12631a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    /* JADX INFO: renamed from: P0 */
    public final d m23042P0() {
        return new e();
    }

    @Override // p088e.InterfaceC4727r0
    @NotNull
    /* JADX INFO: renamed from: Q */
    public final C4723p0 mo23043Q() {
        return (C4723p0) this.onBackPressedDispatcher.getValue();
    }

    @Override // androidx.core.view.InterfaceC0624o
    /* JADX INFO: renamed from: R */
    public void mo1908R(@NotNull InterfaceC0630r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.m3141f(provider);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m23044R0() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C0944b1();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public C4707h0 m23045U0() {
        return (C4707h0) this.fullyDrawnReporter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public C9635c m23046V0() {
        return mo23043Q().getEventDispatcher();
    }

    /* JADX INFO: renamed from: W0 */
    public final C9633a m23047W0() {
        return (C9633a) this.onBackPressedInput.getValue();
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NotNull
    /* JADX INFO: renamed from: X */
    public C0941a1.c mo4647X() {
        return (C0941a1.c) this.defaultViewModelProviderFactory.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    public void m23048X0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        androidx.p616lifecycle.View.m4902b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        C14302e1.m4903a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        C4449m.m22373b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        C4737w0.m23109b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        C4735v0.m23097a(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        C9650r.m38083a(decorView6, this);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m23049Y0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NotNull
    /* JADX INFO: renamed from: Z */
    public CreationExtras mo4653Z() {
        C7445b c7445b = new C7445b(null, 1, null);
        if (getApplication() != null) {
            c7445b.m30960c(C0941a1.a.f3611h, getApplication());
        }
        c7445b.m30960c(C0973o0.f3714a, this);
        c7445b.m30960c(C0973o0.f3715b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c7445b.m30960c(C0973o0.f3716c, extras);
        }
        return c7445b;
    }

    @Override // p235k2.ActivityC7415g, androidx.p616lifecycle.InterfaceC0980s
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return super.mo4656a();
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        m23048X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.mo23065h(decorView);
        super.addContentView(view, params);
    }

    @Override // p261l2.InterfaceC7979f
    /* JADX INFO: renamed from: d0 */
    public final void mo23050d0(@NotNull InterfaceC12631a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // p235k2.InterfaceC7423o
    /* JADX INFO: renamed from: e0 */
    public final void mo23051e0(@NotNull InterfaceC12631a<C7416h> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Nullable
    /* JADX INFO: renamed from: e1 */
    public Object m23052e1() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f1 */
    public final <I, O> AbstractC5854c<I> m23053f1(@NotNull AbstractC6248a<I, O> contract, @NotNull AbstractC5857f registry, @NotNull InterfaceC5852a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.m26254n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // p261l2.InterfaceC7978e
    /* JADX INFO: renamed from: g0 */
    public final void mo23054g0(@NotNull InterfaceC12631a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // p139g.InterfaceC5853b
    @NotNull
    /* JADX INFO: renamed from: h */
    public final <I, O> AbstractC5854c<I> mo4671h(@NotNull AbstractC6248a<I, O> contract, @NotNull InterfaceC5852a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return m23053f1(contract, this.activityResultRegistry, callback);
    }

    @Override // p235k2.InterfaceC7424p
    /* JADX INFO: renamed from: h0 */
    public final void mo23055h0(@NotNull InterfaceC12631a<C7427s> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // p261l2.InterfaceC7979f
    /* JADX INFO: renamed from: j */
    public final void mo23056j(@NotNull InterfaceC12631a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.view.InterfaceC0624o
    /* JADX INFO: renamed from: l0 */
    public void mo1923l0(@NotNull InterfaceC0630r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.m3136a(provider);
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (this.activityResultRegistry.m26248f(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m23047W0().m38015m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC12631a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.savedStateRegistryController.m22360d(savedInstanceState);
        this.contextAwareHelper.m24189c(this);
        super.onCreate(savedInstanceState);
        FragmentC0965k0.INSTANCE.m4933c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.m3137b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.m3139d(item);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC12631a<C7416h>> it = this.onMultiWindowModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new C7416h(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC12631a<Intent>> it = this.onNewIntentListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.m3138c(menu);
        super.onPanelClosed(featureId, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC12631a<C7427s>> it = this.onPictureInPictureModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new C7427s(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.m3140e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.m26248f(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objM23052e1 = m23052e1();
        C0944b1 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objM23052e1 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.m23062b(objM23052e1);
        cVar2.m23063c(viewModelStore);
        return cVar2;
    }

    @Override // p235k2.ActivityC7415g, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (mo4656a() instanceof C0984u) {
            AbstractC0966l abstractC0966lMo4656a = mo4656a();
            Intrinsics.m31981d(abstractC0966lMo4656a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0984u) abstractC0966lMo4656a).m4991o(AbstractC0966l.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.m22361e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC12631a<Integer>> it = this.onTrimMemoryListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // p261l2.InterfaceC7978e
    /* JADX INFO: renamed from: p0 */
    public final void mo23057p0(@NotNull InterfaceC12631a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // p139g.InterfaceC5858g
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final AbstractC5857f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C8884a.m35751h()) {
                C8884a.m35746c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m23045U0().m23001b();
        } finally {
            C8884a.m35749f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        m23048X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.mo23065h(decorView);
        super.setContentView(layoutResID);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // androidx.p616lifecycle.InterfaceC0947c1
    @NotNull
    /* JADX INFO: renamed from: w */
    public C0944b1 mo4712w() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m23044R0();
        C0944b1 c0944b1 = this._viewModelStore;
        Intrinsics.checkNotNull(c0944b1);
        return c0944b1;
    }

    @Override // p235k2.InterfaceC7423o
    /* JADX INFO: renamed from: y */
    public final void mo23059y(@NotNull InterfaceC12631a<C7416h> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // p235k2.InterfaceC7424p
    /* JADX INFO: renamed from: z */
    public final void mo23060z(@NotNull InterfaceC12631a<C7427s> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC12631a<C7416h>> it = this.onMultiWindowModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new C7416h(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC12631a<C7427s>> it = this.onPictureInPictureModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new C7427s(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        m23048X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.mo23065h(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        m23048X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.mo23065h(decorView);
        super.setContentView(view, params);
    }
}
