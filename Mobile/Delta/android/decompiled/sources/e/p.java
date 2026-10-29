package e;

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
import androidx.p000lifecycle.C0693e1;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e2\u00020\u00022\u00020\u000f2\u00020\u0010:\b\u008f\u0001\u0093\u0001\u0097\u0001ä\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001cH\u0015¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b$\u0010#J\u0019\u0010'\u001a\u00020\u00132\b\b\u0001\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010'\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b'\u0010+J#\u0010'\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b'\u0010.J#\u0010/\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0013H\u0017¢\u0006\u0004\b0\u0010\u0012J\u0015\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J)\u00109\u001a\u0002082\u0006\u00105\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0002082\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u0002082\u0006\u00105\u001a\u00020%2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00132\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00132\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00132\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010\u0012J\u000f\u0010I\u001a\u00020\u0013H\u0017¢\u0006\u0004\bI\u0010\u0012J\u001f\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020%H\u0017¢\u0006\u0004\bM\u0010NJ)\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bM\u0010PJA\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020%2\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%H\u0017¢\u0006\u0004\bV\u0010WJK\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020%2\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bV\u0010XJ)\u0010[\u001a\u00020\u00132\u0006\u0010L\u001a\u00020%2\u0006\u0010Y\u001a\u00020%2\b\u0010Z\u001a\u0004\u0018\u00010JH\u0015¢\u0006\u0004\b[\u0010\\J-\u0010b\u001a\u00020\u00132\u0006\u0010L\u001a\u00020%2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010a\u001a\u00020`H\u0017¢\u0006\u0004\bb\u0010cJI\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\u0006\u0010i\u001a\u00020h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010nJA\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u00020%H\u0017¢\u0006\u0004\bz\u0010(J\u001b\u0010{\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020%0u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020%0u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00132\u0006\u0010K\u001a\u00020JH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020J0u¢\u0006\u0004\b\u007f\u0010wJ\u001b\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u001e\u0010\u0086\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001b\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u0087\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0082\u0001J#\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u0087\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008a\u0001\u0010wJ\u001e\u0010\u008b\u0001\u001a\u00020\u00132\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u0011\u0010\u008c\u0001\u001a\u00020\u0013H\u0015¢\u0006\u0005\b\u008c\u0001\u0010\u0012J\u0011\u0010\u008d\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0012R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u0099\u0001\u0010\u0012R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R \u0010¦\u0001\u001a\u00030¢\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bo\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010dR\u0017\u0010«\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010ª\u0001R\u001c\u0010°\u0001\u001a\u00020h8\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R$\u0010´\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010³\u0001R%\u0010º\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010³\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010³\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010³\u0001R\u0019\u0010Á\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Ã\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010À\u0001R!\u0010È\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010£\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030É\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010£\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R \u0010Ñ\u0001\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010£\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ø\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Û\u0001\u001a\u00030Ù\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0015\u0010ã\u0001\u001a\u00030à\u00018F¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001¨\u0006å\u0001"}, d2 = {"Le/p;", "Lk2/g;", "", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/j;", "Ld5/i;", "Le/r0;", "Lo4/d;", "Lg/g;", "Lg/b;", "Ll2/e;", "Ll2/f;", "Lk2/o;", "Lk2/p;", "Landroidx/core/view/o;", "Le/i0;", "<init>", "()V", "", "R0", "Le/p0;", "dispatcher", "L0", "(Le/p0;)V", "Le/p$d;", "P0", "()Le/p$d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "e1", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "X0", "Lf/b;", "listener", "N0", "(Lf/b;)V", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/r;", "provider", "l0", "(Landroidx/core/view/r;)V", "R", "Y0", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/f;", "registry", "Lg/a;", "callback", "Lg/c;", "f1", "(Lh/a;Lg/f;Lg/a;)Lg/c;", "h", "(Lh/a;Lg/a;)Lg/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lx2/a;", "g0", "(Lx2/a;)V", "p0", "level", "onTrimMemory", "d0", "j", "onNewIntent", "(Landroid/content/Intent;)V", "O0", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lk2/h;", "e0", "y", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lk2/s;", "z", "h0", "onUserLeaveHint", "reportFullyDrawn", "Lf/a;", "c", "Lf/a;", "contextAwareHelper", "Landroidx/core/view/p;", "d", "Landroidx/core/view/p;", "menuHostHelper", "Ld5/h;", "e", "Ld5/h;", "getSavedStateRegistryController$annotations", "savedStateRegistryController", "Landroidx/lifecycle/b1;", "f", "Landroidx/lifecycle/b1;", "_viewModelStore", "g", "Le/p$d;", "reportFullyDrawnExecutor", "Le/h0;", "Ljt/h;", "U0", "()Le/h0;", "fullyDrawnReporter", "i", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "k", "Lg/f;", "q", "()Lg/f;", "activityResultRegistry", "Ljava/util/concurrent/CopyOnWriteArrayList;", "l", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "m", "onTrimMemoryListeners", "n", "onNewIntentListeners", "o", "onMultiWindowModeChangedListeners", "p", "onPictureInPictureModeChangedListeners", "Ljava/lang/Runnable;", "onUserLeaveHintListeners", "r", "Z", "dispatchingOnMultiWindowModeChanged", "s", "dispatchingOnPictureInPictureModeChanged", "Lo4/a;", "t", "W0", "()Lo4/a;", "onBackPressedInput", "Landroidx/lifecycle/a1$c;", "u", "X", "()Landroidx/lifecycle/a1$c;", "defaultViewModelProviderFactory", "v", "Q", "()Le/p0;", "onBackPressedDispatcher", "Landroidx/lifecycle/l;", "a", "()Landroidx/lifecycle/l;", "lifecycle", "w", "()Landroidx/lifecycle/b1;", "viewModelStore", "Lk4/a;", "()Lk4/a;", "defaultViewModelCreationExtras", "Lo4/c;", "V0", "()Lo4/c;", "navigationEventDispatcher", "Ld5/f;", "A", "()Ld5/f;", "savedStateRegistry", "b", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class p extends k2.g implements androidx.p000lifecycle.s, c1, androidx.p000lifecycle.j, d5.i, r0, o4.d, g.g, g.b, l2.e, l2.f, k2.o, k2.p, androidx.core.view.o, i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f.a contextAwareHelper = new f.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.core.view.p menuHostHelper = new androidx.core.view.p(new Runnable() { // from class: e.c
        @Override // java.lang.Runnable
        public final void run() {
            p.Z0(this.f14888a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d5.h savedStateRegistryController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b1 _viewModelStore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d reportFullyDrawnExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h fullyDrawnReporter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int contentLayoutId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.f activityResultRegistry;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<x2.a<Configuration>> onConfigurationChangedListeners;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<x2.a<Integer>> onTrimMemoryListeners;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<x2.a<Intent>> onNewIntentListeners;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<x2.a<k2.h>> onMultiWindowModeChangedListeners;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<x2.a<k2.s>> onPictureInPictureModeChangedListeners;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean dispatchingOnMultiWindowModeChanged;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h onBackPressedInput;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h defaultViewModelProviderFactory;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h onBackPressedDispatcher;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"e/p$a", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements androidx.p000lifecycle.p {
        public a() {
        }

        @Override // androidx.p000lifecycle.p
        public void g(androidx.p000lifecycle.s source, androidx.lifecycle.l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            p.this.R0();
            p.this.a().d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Le/p$c;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", Payload.CUSTOM, "Landroidx/lifecycle/b1;", "Landroidx/lifecycle/b1;", "()Landroidx/lifecycle/b1;", "c", "(Landroidx/lifecycle/b1;)V", "viewModelStore", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object custom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public b1 viewModelStore;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b1 getViewModelStore() {
            return this.viewModelStore;
        }

        public final void b(@Nullable Object obj) {
            this.custom = obj;
        }

        public final void c(@Nullable b1 b1Var) {
            this.viewModelStore = b1Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Le/p$d;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)V", "a", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d extends Executor {
        void a();

        void h(@NotNull View view);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Le/p$e;", "Le/p$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Le/p;)V", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)V", "a", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) BacktraceMetrics.defaultTimeBetweenRetriesMs);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Runnable currentRunnable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean onDrawScheduled;

        public e() {
        }

        public static final void c(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override // e.p.d
        public void a() {
            p.this.getWindow().getDecorView().removeCallbacks(this);
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = p.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: e.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.e.c(this.f14947a);
                    }
                });
            } else if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // e.p.d
        public void h(@NotNull View view) {
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
                    p.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (p.this.U0().c()) {
                this.onDrawScheduled = false;
                p.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"e/p$f", "Lg/f;", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Lk2/c;", "options", "", "k", "(ILh/a;Ljava/lang/Object;Lk2/c;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends g.f {
        public f() {
        }

        public static final void u(f fVar, int i10, h.a.C0332a c0332a) {
            fVar.g(i10, c0332a.a());
        }

        public static final void v(f fVar, int i10, IntentSender.SendIntentException sendIntentException) {
            fVar.f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // g.f
        public <I, O> void k(final int requestCode, h.a<I, O> contract, I input, k2.c options) {
            Bundle bundleC;
            final int i10;
            Intrinsics.checkNotNullParameter(contract, "contract");
            p pVar = p.this;
            final h.a.C0332a<O> synchronousResult = contract.getSynchronousResult(pVar, input);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.f.u(this.f14948a, requestCode, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(pVar, input);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(pVar.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleC = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleC = options != null ? options.c() : null;
            }
            Bundle bundle = bundleC;
            if (Intrinsics.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                k2.b.u(pVar, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                k2.b.w(pVar, intentCreateIntent, requestCode, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i10 = requestCode;
                try {
                    k2.b.x(pVar, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                    Unit unit = Unit.f22483a;
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            p.f.v(this.f14950a, i10, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i10 = requestCode;
            }
        }
    }

    public p() {
        d5.h hVarB = d5.h.INSTANCE.b(this);
        this.savedStateRegistryController = hVarB;
        this.reportFullyDrawnExecutor = P0();
        this.fullyDrawnReporter = jt.i.b(new Function0() { // from class: e.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.S0(this.f14892a);
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
        this.onBackPressedInput = jt.i.b(new Function0() { // from class: e.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.d1(this.f14894a);
            }
        });
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        a().a(new androidx.p000lifecycle.p() { // from class: e.i
            @Override // androidx.p000lifecycle.p
            public final void g(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                p.G0(this.f14902a, sVar, aVar);
            }
        });
        a().a(new androidx.p000lifecycle.p() { // from class: e.j
            @Override // androidx.p000lifecycle.p
            public final void g(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                p.H0(this.f14903a, sVar, aVar);
            }
        });
        a().a(new a());
        hVarB.c();
        androidx.p000lifecycle.o0.c(this);
        A().c("android:support:activity-result", new d5.f.b() { // from class: e.k
            @Override // d5.f.b
            public final Bundle a() {
                return p.I0(this.f14904a);
            }
        });
        N0(new f.b() { // from class: e.l
            @Override // f.b
            public final void a(Context context) {
                p.J0(this.f14905a, context);
            }
        });
        this.defaultViewModelProviderFactory = jt.i.b(new Function0() { // from class: e.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.Q0(this.f14906a);
            }
        });
        this.onBackPressedDispatcher = jt.i.b(new Function0() { // from class: e.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.a1(this.f14908a);
            }
        });
    }

    public static final void G0(p pVar, androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.l.a.ON_STOP || (window = pVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void H0(p pVar, androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a event) {
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.l.a.ON_DESTROY) {
            pVar.contextAwareHelper.b();
            if (!pVar.isChangingConfigurations()) {
                pVar.w().a();
            }
            pVar.reportFullyDrawnExecutor.a();
        }
    }

    public static final Bundle I0(p pVar) {
        Bundle bundle = new Bundle();
        pVar.activityResultRegistry.m(bundle);
        return bundle;
    }

    public static final void J0(p pVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = pVar.A().a("android:support:activity-result");
        if (bundleA != null) {
            pVar.activityResultRegistry.l(bundleA);
        }
    }

    public static final void M0(p0 p0Var, p pVar, androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a event) {
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.l.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = pVar.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            p0Var.j(onBackInvokedDispatcher);
        }
    }

    public static final androidx.p000lifecycle.t0 Q0(p pVar) {
        return new androidx.p000lifecycle.t0(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
    }

    public static final h0 S0(final p pVar) {
        return new h0(pVar.reportFullyDrawnExecutor, new Function0() { // from class: e.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.T0(this.f14890a);
            }
        });
    }

    public static final Unit T0(p pVar) {
        pVar.reportFullyDrawn();
        return Unit.f22483a;
    }

    public static final void Z0(p pVar) {
        pVar.Y0();
    }

    public static final p0 a1(final p pVar) {
        final p0 p0Var = new p0(new Runnable() { // from class: e.o
            @Override // java.lang.Runnable
            public final void run() {
                p.b1(this.f14910a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.c1(this.f14889a, p0Var);
                    }
                });
                return p0Var;
            }
            pVar.L0(p0Var);
        }
        return p0Var;
    }

    public static final void b1(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!Intrinsics.c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!Intrinsics.c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static final void c1(p pVar, p0 p0Var) {
        pVar.L0(p0Var);
    }

    public static final o4.a d1(p pVar) {
        o4.a aVar = new o4.a();
        pVar.V0().c(aVar);
        return aVar;
    }

    @Override // d5.i
    @NotNull
    public final d5.f A() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void L0(final p0 dispatcher) {
        a().a(new androidx.p000lifecycle.p() { // from class: e.f
            @Override // androidx.p000lifecycle.p
            public final void g(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                p.M0(dispatcher, this, sVar, aVar);
            }
        });
    }

    public final void N0(@NotNull f.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    public final void O0(@NotNull x2.a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final d P0() {
        return new e();
    }

    @Override // e.r0
    @NotNull
    public final p0 Q() {
        return (p0) this.onBackPressedDispatcher.getValue();
    }

    @Override // androidx.core.view.o
    public void R(@NotNull androidx.core.view.r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.f(provider);
    }

    public final void R0() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b1();
            }
        }
    }

    @NotNull
    public h0 U0() {
        return (h0) this.fullyDrawnReporter.getValue();
    }

    @NotNull
    public o4.c V0() {
        return Q().getEventDispatcher();
    }

    public final o4.a W0() {
        return (o4.a) this.onBackPressedInput.getValue();
    }

    @Override // androidx.p000lifecycle.j
    @NotNull
    public a1.c X() {
        return (a1.c) this.defaultViewModelProviderFactory.getValue();
    }

    public void X0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        androidx.p000lifecycle.View.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        C0693e1.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        d5.m.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        w0.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        v0.a(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        o4.r.a(decorView6, this);
    }

    public void Y0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.p000lifecycle.j
    @NotNull
    public CreationExtras Z() {
        k4.b bVar = new k4.b(null, 1, null);
        if (getApplication() != null) {
            bVar.c(a1.a.f2752h, getApplication());
        }
        bVar.c(androidx.p000lifecycle.o0.f2834a, this);
        bVar.c(androidx.p000lifecycle.o0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(androidx.p000lifecycle.o0.f2835c, extras);
        }
        return bVar;
    }

    @Override // k2.g, androidx.p000lifecycle.s
    @NotNull
    public androidx.p000lifecycle.l a() {
        return super.a();
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.h(decorView);
        super.addContentView(view, params);
    }

    @Override // l2.f
    public final void d0(@NotNull x2.a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // k2.o
    public final void e0(@NotNull x2.a<k2.h> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Nullable
    public Object e1() {
        return null;
    }

    @NotNull
    public final <I, O> g.c<I> f1(@NotNull h.a<I, O> contract, @NotNull g.f registry, @NotNull g.a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // l2.e
    public final void g0(@NotNull x2.a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // g.b
    @NotNull
    public final <I, O> g.c<I> h(@NotNull h.a<I, O> contract, @NotNull g.a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return f1(contract, this.activityResultRegistry, callback);
    }

    @Override // k2.p
    public final void h0(@NotNull x2.a<k2.s> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // l2.f
    public final void j(@NotNull x2.a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.view.o
    public void l0(@NotNull androidx.core.view.r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (this.activityResultRegistry.f(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        W0().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<x2.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        androidx.p000lifecycle.k0.INSTANCE.c(this);
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
        this.menuHostHelper.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<x2.a<k2.h>> it = this.onMultiWindowModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new k2.h(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<x2.a<Intent>> it = this.onNewIntentListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.c(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<x2.a<k2.s>> it = this.onPictureInPictureModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new k2.s(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.f(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objE1 = e1();
        b1 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objE1 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.b(objE1);
        cVar2.c(viewModelStore);
        return cVar2;
    }

    @Override // k2.g, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (a() instanceof androidx.p000lifecycle.u) {
            androidx.p000lifecycle.l lVarA = a();
            Intrinsics.d(lVarA, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.p000lifecycle.u) lVarA).o(androidx.lifecycle.l.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<x2.a<Integer>> it = this.onTrimMemoryListeners.iterator();
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

    @Override // l2.e
    public final void p0(@NotNull x2.a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // g.g
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final g.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (n5.a.h()) {
                n5.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            U0().b();
        } finally {
            n5.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.h(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // androidx.p000lifecycle.c1
    @NotNull
    public b1 w() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        R0();
        b1 b1Var = this._viewModelStore;
        Intrinsics.checkNotNull(b1Var);
        return b1Var;
    }

    @Override // k2.o
    public final void y(@NotNull x2.a<k2.h> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // k2.p
    public final void z(@NotNull x2.a<k2.s> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

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
            Iterator<x2.a<k2.h>> it = this.onMultiWindowModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new k2.h(isInMultiWindowMode, newConfig));
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
            Iterator<x2.a<k2.s>> it = this.onPictureInPictureModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new k2.s(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.h(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        X0();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.h(decorView);
        super.setContentView(view, params);
    }
}
