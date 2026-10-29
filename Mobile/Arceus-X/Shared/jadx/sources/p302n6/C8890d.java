package p302n6;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4852d;
import p096e7.C4856f;
import p096e7.C4861h0;
import p096e7.C4866l;
import p229jt.C7328a;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p560xu.AbstractC12938l;
import p560xu.AbstractC12942n;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12947p0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: n6.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0004*\u0001`\b\u0000\u0018\u0000 b2\u00060\u0001j\u0002`\u0002:\u0004;8:6B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001e2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u001e\u00101\u001a\b\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060$R\u00020\u00000B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010N\u001a\u00060Jj\u0002`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0018\u0010U\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010)R\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010)R\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010)R\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010)R\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010)R\u0014\u0010\u0004\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010a¨\u0006c"}, m31665d2 = {"Ln6/d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lxu/l;", "fileSystem", "Lxu/h0;", "directory", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lxu/l;Lxu/h0;Lkotlin/coroutines/CoroutineContext;JII)V", "", "P", "()V", "Lxu/f;", "I", "()Lxu/f;", "", "line", "U", "(Ljava/lang/String;)V", "M", "b0", "Ln6/d$b;", "editor", "", "success", "u", "(Ln6/d$b;Z)V", "F", "()Z", "Ln6/d$c;", "entry", "X", "(Ln6/d$c;)Z", "s", "Z", "Y", "v", "H", "key", "a0", "B", "Ln6/d$d;", "y", "(Ljava/lang/String;)Ln6/d$d;", "w", "(Ljava/lang/String;)Ln6/d$b;", "close", "a", "Lxu/h0;", "b", "J", "c", "d", "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "", "h", "Ljava/util/Map;", "lruEntries", "Lku/p0;", "i", "Lku/p0;", "cleanupScope", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "j", "Ljava/lang/Object;", "lock", "k", "size", "l", "operationsSinceRewrite", "m", "Lxu/f;", "journalWriter", "n", "hasJournalErrors", "o", "initialized", "p", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "n6/d$e", "Ln6/d$e;", "t", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8890d implements AutoCloseable {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Regex f32362u = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 directory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long maxSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int appVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int valueCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 journalFile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 journalFileTmp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 journalFileBackup;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Map<String, c> lruEntries;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 cleanupScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int operationsSinceRewrite;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public InterfaceC12926f journalWriter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean hasJournalErrors;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean initialized;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean mostRecentTrimFailed;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean mostRecentRebuildFailed;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final e fileSystem;

    /* JADX INFO: renamed from: n6.d$b */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m31665d2 = {"Ln6/d$b;", "", "Ln6/d$c;", "Ln6/d;", "entry", "<init>", "(Ln6/d;Ln6/d$c;)V", "", "index", "Lxu/h0;", "f", "(I)Lxu/h0;", "", "e", "()V", "b", "Ln6/d$d;", "c", "()Ln6/d$d;", "a", "", "success", "d", "(Z)V", "Ln6/d$c;", "g", "()Ln6/d$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final c entry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final boolean[] written;

        public b(c cVar) {
            this.entry = cVar;
            this.written = new boolean[C8890d.this.valueCount];
        }

        /* JADX INFO: renamed from: a */
        public final void m35803a() {
            m35806d(false);
        }

        /* JADX INFO: renamed from: b */
        public final void m35804b() {
            m35806d(true);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final d m35805c() {
            d dVarM35802y;
            Object obj = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj) {
                m35804b();
                dVarM35802y = c8890d.m35802y(this.entry.getKey());
            }
            return dVarM35802y;
        }

        /* JADX INFO: renamed from: d */
        public final void m35806d(boolean success) {
            Object obj = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.m31980c(this.entry.getCurrentEditor(), this)) {
                        c8890d.m35799u(this, success);
                    }
                    this.closed = true;
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m35807e() {
            if (Intrinsics.m31980c(this.entry.getCurrentEditor(), this)) {
                this.entry.m35823m(true);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C12931h0 m35808f(int index) {
            C12931h0 c12931h0;
            Object obj = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                C12931h0 c12931h1 = this.entry.m35813c().get(index);
                C4866l.m23470b(c8890d.fileSystem, c12931h1, false, 2, null);
                c12931h0 = c12931h1;
            }
            return c12931h0;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    /* JADX INFO: renamed from: n6.d$c */
    @Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00105\u001a\b\u0018\u000100R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b\u0018\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b,\u00108\"\u0004\b9\u0010:¨\u0006<"}, m31665d2 = {"Ln6/d$c;", "", "", "key", "<init>", "(Ln6/d;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)V", "Lxu/f;", "writer", "o", "(Lxu/f;)V", "Ln6/d$d;", "Ln6/d;", "n", "()Ln6/d$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lxu/h0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "Ln6/d$b;", "Ln6/d$b;", "()Ln6/d$b;", "i", "(Ln6/d$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<C12931h0> cleanFiles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<C12931h0> dirtyFiles;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean readable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean zombie;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public b currentEditor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public int lockingSnapshotCount;

        public c(String str) {
            this.key = str;
            this.lengths = new long[C8890d.this.valueCount];
            this.cleanFiles = new ArrayList<>(C8890d.this.valueCount);
            this.dirtyFiles = new ArrayList<>(C8890d.this.valueCount);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = C8890d.this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.cleanFiles.add(C8890d.this.directory.m48129n(sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(C8890d.this.directory.m48129n(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C12931h0> m35811a() {
            return this.cleanFiles;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final ArrayList<C12931h0> m35813c() {
            return this.dirtyFiles;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        /* JADX INFO: renamed from: i */
        public final void m35819i(@Nullable b bVar) {
            this.currentEditor = bVar;
        }

        /* JADX INFO: renamed from: j */
        public final void m35820j(@NotNull List<String> strings) throws IOException {
            if (strings.size() != C8890d.this.valueCount) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m35821k(int i10) {
            this.lockingSnapshotCount = i10;
        }

        /* JADX INFO: renamed from: l */
        public final void m35822l(boolean z10) {
            this.readable = z10;
        }

        /* JADX INFO: renamed from: m */
        public final void m35823m(boolean z10) {
            this.zombie = z10;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final d m35824n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<C12931h0> arrayList = this.cleanFiles;
            C8890d c8890d = C8890d.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!c8890d.fileSystem.exists(arrayList.get(i10))) {
                    try {
                        c8890d.m35793X(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return C8890d.this.new d(this);
        }

        /* JADX INFO: renamed from: o */
        public final void m35825o(@NotNull InterfaceC12926f writer) {
            for (long j10 : this.lengths) {
                writer.writeByte(32).mo48058z1(j10);
            }
        }
    }

    /* JADX INFO: renamed from: n6.d$d */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Ln6/d$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ln6/d$c;", "Ln6/d;", "entry", "<init>", "(Ln6/d;Ln6/d$c;)V", "", "index", "Lxu/h0;", "b", "(I)Lxu/h0;", "", "close", "()V", "Ln6/d$b;", "a", "()Ln6/d$b;", "Ln6/d$c;", "getEntry", "()Ln6/d$c;", "", "Z", "closed", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class d implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final c entry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        public d(c cVar) {
            this.entry = cVar;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final b m35826a() {
            b bVarM35801w;
            Object obj = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj) {
                close();
                bVarM35801w = c8890d.m35801w(this.entry.getKey());
            }
            return bVarM35801w;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C12931h0 m35827b(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.m35811a().get(index);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Object obj = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj) {
                try {
                    c cVar = this.entry;
                    cVar.m35821k(cVar.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        c8890d.m35793X(this.entry);
                    }
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n6.d$e */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"n6/d$e", "Lxu/n;", "Lxu/h0;", "file", "", "mustCreate", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC12942n {
        public e(AbstractC12938l abstractC12938l) {
            super(abstractC12938l);
        }

        @Override // p560xu.AbstractC12942n, p560xu.AbstractC12938l
        public InterfaceC12947p0 sink(C12931h0 file, boolean mustCreate) {
            C12931h0 c12931h0M48127j = file.m48127j();
            if (c12931h0M48127j != null) {
                createDirectories(c12931h0M48127j);
            }
            return super.sink(file, mustCreate);
        }
    }

    /* JADX INFO: renamed from: n6.d$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.disk.DiskLruCache$launchCleanup$1", m39664f = "DiskLruCache.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f32398t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8890d.this.new f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f32398t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Object obj2 = C8890d.this.lock;
            C8890d c8890d = C8890d.this;
            synchronized (obj2) {
                if (!c8890d.initialized || c8890d.closed) {
                    return Unit.f29331a;
                }
                try {
                    c8890d.m35795Z();
                } catch (IOException unused) {
                    c8890d.mostRecentTrimFailed = true;
                }
                try {
                    if (c8890d.m35787F()) {
                        c8890d.m35797b0();
                    }
                } catch (IOException unused2) {
                    c8890d.mostRecentRebuildFailed = true;
                    c8890d.journalWriter = C12919b0.m47960b(C12919b0.m47959a());
                }
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C8890d(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0, @NotNull CoroutineContext coroutineContext, long j10, int i10, int i11) {
        this.directory = c12931h0;
        this.maxSize = j10;
        this.appVersion = i10;
        this.valueCount = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = c12931h0.m48129n("journal");
        this.journalFileTmp = c12931h0.m48129n("journal.tmp");
        this.journalFileBackup = c12931h0.m48129n("journal.bkp");
        this.lruEntries = C4852d.m23422b(0, 0.0f, 3, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(C7948z2.m32943b(null, 1, null));
        AbstractC7888l0 abstractC7888l0M23443j = C4861h0.m23443j(coroutineContext);
        this.cleanupScope = C7910q0.m32885a(coroutineContextPlus.plus(AbstractC7888l0.m32791U(abstractC7888l0M23443j == null ? C4856f.m23433a() : abstractC7888l0M23443j, 1, null, 2, null)));
        this.lock = new Object();
        this.fileSystem = new e(abstractC12938l);
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m35770L(C8890d c8890d, IOException iOException) {
        c8890d.hasJournalErrors = true;
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public final void m35786B() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.delete(this.journalFileTmp);
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.delete(this.journalFileBackup);
                    } else {
                        this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        m35791P();
                        m35790M();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            m35800v();
                            this.closed = false;
                            m35797b0();
                            this.initialized = true;
                            Unit unit = Unit.f29331a;
                        } catch (Throwable th2) {
                            this.closed = false;
                            throw th2;
                        }
                    }
                }
                m35797b0();
                this.initialized = true;
                Unit unit2 = Unit.f29331a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m35787F() {
        return this.operationsSinceRewrite >= 2000;
    }

    /* JADX INFO: renamed from: H */
    public final void m35788H() {
        C7882k.m32780d(this.cleanupScope, null, null, new f(null), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC12926f m35789I() {
        return C12919b0.m47960b(new C8891e(this.fileSystem.appendingSink(this.journalFile), new Function1() { // from class: n6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8890d.m35770L(this.f32360a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final void m35790M() {
        Iterator<c> it = this.lruEntries.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    j10 += next.getLengths()[i10];
                    i10++;
                }
            } else {
                next.m35819i(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(next.m35811a().get(i10));
                    this.fileSystem.delete(next.m35813c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.size = j10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX INFO: renamed from: P */
    public final void m35791P() throws Throwable {
        InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(this.fileSystem.source(this.journalFile));
        try {
            String strMo48021b1 = interfaceC12928gM47961c.mo48021b1();
            String strMo48021b2 = interfaceC12928gM47961c.mo48021b1();
            String strMo48021b3 = interfaceC12928gM47961c.mo48021b1();
            String strMo48021b4 = interfaceC12928gM47961c.mo48021b1();
            String strMo48021b5 = interfaceC12928gM47961c.mo48021b1();
            if (!Intrinsics.m31980c("libcore.io.DiskLruCache", strMo48021b1) || !Intrinsics.m31980c("1", strMo48021b2) || !Intrinsics.m31980c(String.valueOf(this.appVersion), strMo48021b3) || !Intrinsics.m31980c(String.valueOf(this.valueCount), strMo48021b4) || strMo48021b5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo48021b1 + ", " + strMo48021b2 + ", " + strMo48021b3 + ", " + strMo48021b4 + ", " + strMo48021b5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    m35792U(interfaceC12928gM47961c.mo48021b1());
                    i10++;
                } catch (EOFException unused) {
                    this.operationsSinceRewrite = i10 - this.lruEntries.size();
                    if (interfaceC12928gM47961c.mo48016Z1()) {
                        this.journalWriter = m35789I();
                    } else {
                        m35797b0();
                    }
                    Unit unit = Unit.f29331a;
                    if (interfaceC12928gM47961c != null) {
                        try {
                            interfaceC12928gM47961c.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC12928gM47961c != null) {
                try {
                    interfaceC12928gM47961c.close();
                } catch (Throwable th4) {
                    C7328a.m30429a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m35792U(String line) throws IOException {
        String strSubstring;
        int iM0 = StringsKt.m32176m0(line, ' ', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iM0 + 1;
        int iM1 = StringsKt.m32176m0(line, ' ', i10, false, 4, null);
        if (iM1 == -1) {
            strSubstring = line.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iM0 == 6 && C7797x.m32309T(line, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iM1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Map<String, c> map = this.lruEntries;
        c cVar = map.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            map.put(strSubstring, cVar);
        }
        c cVar2 = cVar;
        if (iM1 != -1 && iM0 == 5 && C7797x.m32309T(line, "CLEAN", false, 2, null)) {
            String strSubstring2 = line.substring(iM1 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List<String> listP0 = StringsKt.m32135P0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            cVar2.m35822l(true);
            cVar2.m35819i(null);
            cVar2.m35820j(listP0);
            return;
        }
        if (iM1 == -1 && iM0 == 5 && C7797x.m32309T(line, "DIRTY", false, 2, null)) {
            cVar2.m35819i(new b(cVar2));
            return;
        }
        if (iM1 == -1 && iM0 == 4 && C7797x.m32309T(line, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m35793X(c entry) {
        InterfaceC12926f interfaceC12926f;
        if (entry.getLockingSnapshotCount() > 0 && (interfaceC12926f = this.journalWriter) != null) {
            interfaceC12926f.mo47992C0("DIRTY");
            interfaceC12926f.writeByte(32);
            interfaceC12926f.mo47992C0(entry.getKey());
            interfaceC12926f.writeByte(10);
            interfaceC12926f.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m35823m(true);
            return true;
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.m35811a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.operationsSinceRewrite++;
        InterfaceC12926f interfaceC12926f2 = this.journalWriter;
        if (interfaceC12926f2 != null) {
            interfaceC12926f2.mo47992C0("REMOVE");
            interfaceC12926f2.writeByte(32);
            interfaceC12926f2.mo47992C0(entry.getKey());
            interfaceC12926f2.writeByte(10);
            interfaceC12926f2.flush();
        }
        this.lruEntries.remove(entry.getKey());
        if (m35787F()) {
            m35788H();
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m35794Y() {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie()) {
                m35793X(cVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final void m35795Z() {
        while (this.size > this.maxSize) {
            if (!m35794Y()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m35796a0(String key) {
        if (f32362u.m32113f(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m35797b0() {
        Throwable th2;
        synchronized (this.lock) {
            try {
                InterfaceC12926f interfaceC12926f = this.journalWriter;
                if (interfaceC12926f != null) {
                    interfaceC12926f.close();
                }
                InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(this.fileSystem.sink(this.journalFileTmp, false));
                try {
                    interfaceC12926fM47960b.mo47992C0("libcore.io.DiskLruCache").writeByte(10);
                    interfaceC12926fM47960b.mo47992C0("1").writeByte(10);
                    interfaceC12926fM47960b.mo48058z1(this.appVersion).writeByte(10);
                    interfaceC12926fM47960b.mo48058z1(this.valueCount).writeByte(10);
                    interfaceC12926fM47960b.writeByte(10);
                    for (c cVar : this.lruEntries.values()) {
                        if (cVar.getCurrentEditor() != null) {
                            interfaceC12926fM47960b.mo47992C0("DIRTY");
                            interfaceC12926fM47960b.writeByte(32);
                            interfaceC12926fM47960b.mo47992C0(cVar.getKey());
                            interfaceC12926fM47960b.writeByte(10);
                        } else {
                            interfaceC12926fM47960b.mo47992C0("CLEAN");
                            interfaceC12926fM47960b.writeByte(32);
                            interfaceC12926fM47960b.mo47992C0(cVar.getKey());
                            cVar.m35825o(interfaceC12926fM47960b);
                            interfaceC12926fM47960b.writeByte(10);
                        }
                    }
                    Unit unit = Unit.f29331a;
                    if (interfaceC12926fM47960b != null) {
                        try {
                            interfaceC12926fM47960b.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (Throwable th4) {
                    if (interfaceC12926fM47960b != null) {
                        try {
                            interfaceC12926fM47960b.close();
                        } catch (Throwable th5) {
                            C7328a.m30429a(th4, th5);
                        }
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = m35789I();
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
                Unit unit2 = Unit.f29331a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (c cVar : (c[]) this.lruEntries.values().toArray(new c[0])) {
                        b currentEditor = cVar.getCurrentEditor();
                        if (currentEditor != null) {
                            currentEditor.m35807e();
                        }
                    }
                    m35795Z();
                    C7910q0.m32890f(this.cleanupScope, null, 1, null);
                    InterfaceC12926f interfaceC12926f = this.journalWriter;
                    Intrinsics.checkNotNull(interfaceC12926f);
                    interfaceC12926f.close();
                    this.journalWriter = null;
                    this.closed = true;
                    Unit unit = Unit.f29331a;
                    return;
                }
                this.closed = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m35798s() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m35799u(b editor, boolean success) {
        synchronized (this.lock) {
            c entry = editor.getEntry();
            if (!Intrinsics.m31980c(entry.getCurrentEditor(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!success || entry.getZombie()) {
                int i10 = this.valueCount;
                for (int i11 = 0; i11 < i10; i11++) {
                    this.fileSystem.delete(entry.m35813c().get(i11));
                }
            } else {
                int i12 = this.valueCount;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (editor.getWritten()[i13] && !this.fileSystem.exists(entry.m35813c().get(i13))) {
                        editor.m35803a();
                        return;
                    }
                }
                int i14 = this.valueCount;
                for (int i15 = 0; i15 < i14; i15++) {
                    C12931h0 c12931h0 = entry.m35813c().get(i15);
                    C12931h0 c12931h1 = entry.m35811a().get(i15);
                    if (this.fileSystem.exists(c12931h0)) {
                        this.fileSystem.atomicMove(c12931h0, c12931h1);
                    } else {
                        C4866l.m23470b(this.fileSystem, entry.m35811a().get(i15), false, 2, null);
                    }
                    long j10 = entry.getLengths()[i15];
                    Long size = this.fileSystem.metadata(c12931h1).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    entry.getLengths()[i15] = jLongValue;
                    this.size = (this.size - j10) + jLongValue;
                }
            }
            entry.m35819i(null);
            if (entry.getZombie()) {
                m35793X(entry);
                return;
            }
            this.operationsSinceRewrite++;
            InterfaceC12926f interfaceC12926f = this.journalWriter;
            Intrinsics.checkNotNull(interfaceC12926f);
            if (success || entry.getReadable()) {
                entry.m35822l(true);
                interfaceC12926f.mo47992C0("CLEAN");
                interfaceC12926f.writeByte(32);
                interfaceC12926f.mo47992C0(entry.getKey());
                entry.m35825o(interfaceC12926f);
                interfaceC12926f.writeByte(10);
            } else {
                this.lruEntries.remove(entry.getKey());
                interfaceC12926f.mo47992C0("REMOVE");
                interfaceC12926f.writeByte(32);
                interfaceC12926f.mo47992C0(entry.getKey());
                interfaceC12926f.writeByte(10);
            }
            interfaceC12926f.flush();
            if (this.size > this.maxSize || m35787F()) {
                m35788H();
            }
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m35800v() throws IOException {
        close();
        C4866l.m23471c(this.fileSystem, this.directory);
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final b m35801w(@NotNull String key) {
        synchronized (this.lock) {
            m35798s();
            m35796a0(key);
            m35786B();
            c cVar = this.lruEntries.get(key);
            if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
                return null;
            }
            if (cVar != null && cVar.getLockingSnapshotCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                InterfaceC12926f interfaceC12926f = this.journalWriter;
                Intrinsics.checkNotNull(interfaceC12926f);
                interfaceC12926f.mo47992C0("DIRTY");
                interfaceC12926f.writeByte(32);
                interfaceC12926f.mo47992C0(key);
                interfaceC12926f.writeByte(10);
                interfaceC12926f.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(key);
                    this.lruEntries.put(key, cVar);
                }
                b bVar = new b(cVar);
                cVar.m35819i(bVar);
                return bVar;
            }
            m35788H();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final d m35802y(@NotNull String key) {
        d dVarM35824n;
        synchronized (this.lock) {
            m35798s();
            m35796a0(key);
            m35786B();
            c cVar = this.lruEntries.get(key);
            if (cVar != null && (dVarM35824n = cVar.m35824n()) != null) {
                this.operationsSinceRewrite++;
                InterfaceC12926f interfaceC12926f = this.journalWriter;
                Intrinsics.checkNotNull(interfaceC12926f);
                interfaceC12926f.mo47992C0("READ");
                interfaceC12926f.writeByte(32);
                interfaceC12926f.mo47992C0(key);
                interfaceC12926f.writeByte(10);
                interfaceC12926f.flush();
                if (m35787F()) {
                    m35788H();
                }
                return dVarM35824n;
            }
            return null;
        }
    }
}
