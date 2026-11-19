package pv;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.j0;
import ew.k;
import ew.l;
import ew.l0;
import ew.n;
import ew.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import nv.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001r\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004B>?:B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0000¢\u0006\u0004\b$\u0010\u0013J\u001e\u0010&\u001a\b\u0018\u00010%R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\b\u0018\u00010)R\u00020\u00002\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00112\n\u0010,\u001a\u00060)R\u00020\u00002\u0006\u0010-\u001a\u00020\u001cH\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\u00103\u001a\u000602R\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u0013J\r\u00109\u001a\u00020\u0011¢\u0006\u0004\b9\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0015R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER*\u0010\f\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010HR\u0018\u0010W\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010^\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u00000Xj\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u0000`Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0015R\u0016\u0010b\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010aR\"\u0010h\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010a\u001a\u0004\be\u0010\u001e\"\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010aR\u0016\u0010l\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010aR\u0016\u0010m\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010HR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010s¨\u0006v"}, d2 = {"Lpv/f;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", BuildConfig.FLAVOR, "Lew/k;", "fileSystem", "Lew/b0;", "directory", BuildConfig.FLAVOR, "appVersion", "valueCount", BuildConfig.FLAVOR, "maxSize", "Lqv/d;", "taskRunner", "<init>", "(Lew/k;Lew/b0;IIJLqv/d;)V", BuildConfig.FLAVOR, "N", "()V", "Lew/f;", "I", "()Lew/f;", BuildConfig.FLAVOR, "line", "O", "(Ljava/lang/String;)V", "L", BuildConfig.FLAVOR, "E", "()Z", "m", "b0", "key", "d0", "A", "Q", "Lpv/f$d;", "s", "(Ljava/lang/String;)Lpv/f$d;", "expectedSequenceNumber", "Lpv/f$b;", "p", "(Ljava/lang/String;J)Lpv/f$b;", "editor", "success", "n", "(Lpv/f$b;Z)V", "T", "(Ljava/lang/String;)Z", "Lpv/f$c;", "entry", "Y", "(Lpv/f$c;)Z", "flush", "close", "c0", "o", "a", "Lew/b0;", "w", "()Lew/b0;", "b", "c", "z", "()I", "d", "Lew/k;", "y", "()Lew/k;", "value", "e", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "f", "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "i", "size", "j", "Lew/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", "Z", "hasJournalErrors", "civilizedFileSystem", "initialized", "u", "setClosed$okhttp", "(Z)V", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "nextSequenceNumber", "Lqv/c;", "t", "Lqv/c;", "cleanupQueue", "pv/f$e", "Lpv/f$e;", "cleanupTask", "v", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 directory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int appVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int valueCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileSystem;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long maxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 journalFile;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 journalFileTmp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 journalFileBackup;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ew.f journalWriter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, c> lruEntries;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int redundantOpCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasJournalErrors;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean civilizedFileSystem;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean initialized;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentTrimFailed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentRebuildFailed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public long nextSequenceNumber;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.c cleanupQueue;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e cleanupTask;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f29339w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f29340x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final String f29341y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final String f29342z = "libcore.io.DiskLruCache";

    @NotNull
    public static final String A = "1";
    public static final long B = -1;

    @NotNull
    public static final Regex C = new Regex("[a-z0-9_-]{1,120}");

    @NotNull
    public static final String D = "CLEAN";

    @NotNull
    public static final String E = "DIRTY";

    @NotNull
    public static final String F = "REMOVE";

    @NotNull
    public static final String G = "READ";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpv/f$b;", BuildConfig.FLAVOR, "Lpv/f$c;", "Lpv/f;", "entry", "<init>", "(Lpv/f;Lpv/f$c;)V", BuildConfig.FLAVOR, "d", "()V", BuildConfig.FLAVOR, "index", "Lew/j0;", "g", "(I)Lew/j0;", "c", "b", "a", "Lpv/f$c;", "e", "()Lpv/f$c;", BuildConfig.FLAVOR, "[Z", "f", "()[Z", "written", BuildConfig.FLAVOR, "Z", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c entry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final boolean[] written;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean done;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f29365d;

        public b(@NotNull f fVar, c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f29365d = fVar;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[fVar.getValueCount()];
        }

        public static final Unit h(f fVar, b bVar, IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            synchronized (fVar) {
                bVar.d();
            }
            return Unit.f21506a;
        }

        public final void b() {
            f fVar = this.f29365d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                        fVar.n(this, false);
                    }
                    this.done = true;
                    Unit unit = Unit.f21506a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            f fVar = this.f29365d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                        fVar.n(this, true);
                    }
                    this.done = true;
                    Unit unit = Unit.f21506a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void d() {
            if (Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                if (this.f29365d.civilizedFileSystem) {
                    this.f29365d.n(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        @NotNull
        public final j0 g(int index) {
            final f fVar = this.f29365d;
            synchronized (fVar) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                    return v.a();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    Intrinsics.checkNotNull(zArr);
                    zArr[index] = true;
                }
                try {
                    return new h(fVar.getFileSystem().s(this.entry.c().get(index)), new Function1() { // from class: pv.g
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.b.h(fVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return v.a();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lpv/f$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", "<init>", "(Lpv/f;Ljava/lang/String;)V", BuildConfig.FLAVOR, "strings", BuildConfig.FLAVOR, "m", "(Ljava/util/List;)V", "Lew/f;", "writer", "s", "(Lew/f;)V", "Lpv/f$d;", "Lpv/f;", "r", "()Lpv/f$d;", BuildConfig.FLAVOR, "j", "(Ljava/util/List;)Ljava/lang/Void;", BuildConfig.FLAVOR, "index", "Lew/l0;", "k", "(I)Lew/l0;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", BuildConfig.FLAVOR, "b", "[J", "e", "()[J", "lengths", BuildConfig.FLAVOR, "Lew/b0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", BuildConfig.FLAVOR, "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "Lpv/f$b;", "Lpv/f$b;", "()Lpv/f$b;", "l", "(Lpv/f$b;)V", "currentEditor", "h", "I", "()I", "n", "(I)V", "lockingSourceCount", BuildConfig.FLAVOR, "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> cleanFiles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> dirtyFiles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean readable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean zombie;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b currentEditor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int lockingSourceCount;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public long sequenceNumber;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f29374j;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"pv/f$c$a", "Lew/n;", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "b", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends n {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean closed;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f29375c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f29376d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, f fVar, c cVar) {
                super(l0Var);
                this.f29375c = fVar;
                this.f29376d = cVar;
            }

            @Override // ew.n, ew.l0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.closed) {
                    return;
                }
                this.closed = true;
                f fVar = this.f29375c;
                c cVar = this.f29376d;
                synchronized (fVar) {
                    try {
                        cVar.n(cVar.getLockingSourceCount() - 1);
                        if (cVar.getLockingSourceCount() == 0 && cVar.getZombie()) {
                            fVar.Y(cVar);
                        }
                        Unit unit = Unit.f21506a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(@NotNull f fVar, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f29374j = fVar;
            this.key = key;
            this.lengths = new long[fVar.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = fVar.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                List<b0> list = this.cleanFiles;
                b0 directory = this.f29374j.getDirectory();
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                list.add(directory.p(string));
                sb2.append(".tmp");
                List<b0> list2 = this.dirtyFiles;
                b0 directory2 = this.f29374j.getDirectory();
                String string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                list2.add(directory2.p(string2));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final List<b0> a() {
            return this.cleanFiles;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final List<b0> c() {
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
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final Void j(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        public final l0 k(int index) {
            l0 l0VarW = this.f29374j.getFileSystem().w(this.cleanFiles.get(index));
            if (this.f29374j.civilizedFileSystem) {
                return l0VarW;
            }
            this.lockingSourceCount++;
            return new a(l0VarW, this.f29374j, this);
        }

        public final void l(@Nullable b bVar) {
            this.currentEditor = bVar;
        }

        public final void m(@NotNull List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f29374j.getValueCount()) {
                j(strings);
                throw new zt.d();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new zt.d();
            }
        }

        public final void n(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void o(boolean z10) {
            this.readable = z10;
        }

        public final void p(long j10) {
            this.sequenceNumber = j10;
        }

        public final void q(boolean z10) {
            this.zombie = z10;
        }

        @Nullable
        public final d r() {
            f fVar = this.f29374j;
            if (q.b && !Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f29374j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            int i10 = 0;
            try {
                int valueCount = this.f29374j.getValueCount();
                for (int i11 = 0; i11 < valueCount; i11++) {
                    arrayList.add(k(i11));
                }
                return new d(this.f29374j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nv.n.f((l0) obj);
                }
                try {
                    this.f29374j.Y(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(@NotNull ew.f writer) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : this.lengths) {
                writer.writeByte(32).A1(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpv/f$d;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "sequenceNumber", BuildConfig.FLAVOR, "Lew/l0;", "sources", BuildConfig.FLAVOR, "lengths", "<init>", "(Lpv/f;Ljava/lang/String;JLjava/util/List;[J)V", "Lpv/f$b;", "Lpv/f;", "a", "()Lpv/f$b;", BuildConfig.FLAVOR, "index", "b", "(I)Lew/l0;", BuildConfig.FLAVOR, "close", "()V", "Ljava/lang/String;", "J", "c", "Ljava/util/List;", "d", "[J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long sequenceNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<l0> sources;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f29380e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull f fVar, String key, @NotNull long j10, @NotNull List<? extends l0> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f29380e = fVar;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Nullable
        public final b a() {
            return this.f29380e.p(this.key, this.sequenceNumber);
        }

        @NotNull
        public final l0 b(int index) {
            return this.sources.get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<l0> it = this.sources.iterator();
            while (it.hasNext()) {
                nv.n.f(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pv/f$e", "Lqv/a;", BuildConfig.FLAVOR, "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends qv.a {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // qv.a
        public long f() {
            f fVar = f.this;
            synchronized (fVar) {
                if (!fVar.initialized || fVar.getClosed()) {
                    return -1L;
                }
                try {
                    fVar.c0();
                } catch (IOException unused) {
                    fVar.mostRecentTrimFailed = true;
                }
                try {
                    if (fVar.E()) {
                        fVar.Q();
                        fVar.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    fVar.mostRecentRebuildFailed = true;
                    ew.f fVar2 = fVar.journalWriter;
                    if (fVar2 != null) {
                        nv.n.f(fVar2);
                    }
                    fVar.journalWriter = v.b(v.a());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: pv.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pv/f$f", "Lew/l;", "Lew/b0;", "file", BuildConfig.FLAVOR, "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0573f extends l {
        public C0573f(k kVar) {
            super(kVar);
        }

        @Override // ew.l, ew.k
        public j0 u(b0 file, boolean mustCreate) {
            Intrinsics.checkNotNullParameter(file, "file");
            b0 b0VarK = file.k();
            if (b0VarK != null) {
                d(b0VarK);
            }
            return super.u(file, mustCreate);
        }
    }

    public f(@NotNull k fileSystem, @NotNull b0 directory, int i10, int i11, long j10, @NotNull qv.d taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.directory = directory;
        this.appVersion = i10;
        this.valueCount = i11;
        this.fileSystem = new C0573f(fileSystem);
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.k();
        this.cleanupTask = new e(q.f26640c + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = directory.p(f29339w);
        this.journalFileTmp = directory.p(f29340x);
        this.journalFileBackup = directory.p(f29341y);
    }

    public static final Unit K(f fVar, IOException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!q.b || Thread.holdsLock(fVar)) {
            fVar.hasJournalErrors = true;
            return Unit.f21506a;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public static /* synthetic */ b r(f fVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = B;
        }
        return fVar.p(str, j10);
    }

    public final synchronized void A() {
        try {
            if (q.b && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.m(this.journalFileBackup)) {
                if (this.fileSystem.m(this.journalFile)) {
                    this.fileSystem.h(this.journalFileBackup);
                } else {
                    this.fileSystem.c(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = nv.n.x(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.m(this.journalFile)) {
                try {
                    N();
                    L();
                    this.initialized = true;
                    return;
                } catch (IOException e10) {
                    okhttp3.internal.platform.c.INSTANCE.e().m("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        o();
                        this.closed = false;
                        Q();
                        this.initialized = true;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            Q();
            this.initialized = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final boolean E() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    public final ew.f I() {
        return v.b(new h(this.fileSystem.a(this.journalFile), new Function1() { // from class: pv.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.K(this.f29337a, (IOException) obj);
            }
        }));
    }

    public final void L() {
        nv.n.i(this.fileSystem, this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            c cVar = next;
            int i10 = 0;
            if (cVar.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += cVar.getLengths()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    nv.n.i(this.fileSystem, cVar.a().get(i10));
                    nv.n.i(this.fileSystem, cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    public final void N() throws Throwable {
        ew.g gVarC = v.c(this.fileSystem.w(this.journalFile));
        try {
            String strB1 = gVarC.b1();
            String strB2 = gVarC.b1();
            String strB3 = gVarC.b1();
            String strB4 = gVarC.b1();
            String strB5 = gVarC.b1();
            if (!Intrinsics.c(f29342z, strB1) || !Intrinsics.c(A, strB2) || !Intrinsics.c(String.valueOf(this.appVersion), strB3) || !Intrinsics.c(String.valueOf(this.valueCount), strB4) || strB5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strB1 + ", " + strB2 + ", " + strB4 + ", " + strB5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    O(gVarC.b1());
                    i10++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i10 - this.lruEntries.size();
                    if (gVarC.c2()) {
                        ew.f fVar = this.journalWriter;
                        if (fVar != null) {
                            nv.n.f(fVar);
                        }
                        this.journalWriter = I();
                    } else {
                        Q();
                    }
                    Unit unit = Unit.f21506a;
                    if (gVarC != null) {
                        try {
                            gVarC.close();
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
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th4) {
                    zt.a.a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    public final void O(String line) throws IOException {
        String strSubstring;
        int iM0 = StringsKt.m0(line, ' ', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iM0 + 1;
        int iM1 = StringsKt.m0(line, ' ', i10, false, 4, null);
        if (iM1 == -1) {
            strSubstring = line.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String str = F;
            if (iM0 == str.length() && x.T(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iM1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        c cVar = this.lruEntries.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.lruEntries.put(strSubstring, cVar);
        }
        if (iM1 != -1) {
            String str2 = D;
            if (iM0 == str2.length() && x.T(line, str2, false, 2, null)) {
                String strSubstring2 = line.substring(iM1 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                List<String> listN0 = StringsKt.N0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listN0);
                return;
            }
        }
        if (iM1 == -1) {
            String str3 = E;
            if (iM0 == str3.length() && x.T(line, str3, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iM1 == -1) {
            String str4 = G;
            if (iM0 == str4.length() && x.T(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    public final synchronized void Q() {
        Throwable th2;
        try {
            ew.f fVar = this.journalWriter;
            if (fVar != null) {
                fVar.close();
            }
            ew.f fVarB = v.b(this.fileSystem.u(this.journalFileTmp, false));
            try {
                fVarB.D0(f29342z).writeByte(10);
                fVarB.D0(A).writeByte(10);
                fVarB.A1(this.appVersion).writeByte(10);
                fVarB.A1(this.valueCount).writeByte(10);
                fVarB.writeByte(10);
                for (c cVar : this.lruEntries.values()) {
                    Intrinsics.checkNotNullExpressionValue(cVar, "next(...)");
                    c cVar2 = cVar;
                    if (cVar2.getCurrentEditor() != null) {
                        fVarB.D0(E).writeByte(32);
                        fVarB.D0(cVar2.getKey());
                        fVarB.writeByte(10);
                    } else {
                        fVarB.D0(D).writeByte(32);
                        fVarB.D0(cVar2.getKey());
                        cVar2.s(fVarB);
                        fVarB.writeByte(10);
                    }
                }
                Unit unit = Unit.f21506a;
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th5) {
                        zt.a.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.fileSystem.m(this.journalFile)) {
                this.fileSystem.c(this.journalFile, this.journalFileBackup);
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
                nv.n.i(this.fileSystem, this.journalFileBackup);
            } else {
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
            }
            ew.f fVar2 = this.journalWriter;
            if (fVar2 != null) {
                nv.n.f(fVar2);
            }
            this.journalWriter = I();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized boolean T(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A();
        m();
        d0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zY = Y(cVar);
        if (zY && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zY;
    }

    public final boolean Y(@NotNull c entry) {
        ew.f fVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (fVar = this.journalWriter) != null) {
                fVar.D0(E);
                fVar.writeByte(32);
                fVar.D0(entry.getKey());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.q(true);
                return true;
            }
        }
        b currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.d();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            nv.n.i(this.fileSystem, entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        ew.f fVar2 = this.journalWriter;
        if (fVar2 != null) {
            fVar2.D0(F);
            fVar2.writeByte(32);
            fVar2.D0(entry.getKey());
            fVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (E()) {
            qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final boolean b0() {
        for (c cVar : this.lruEntries.values()) {
            Intrinsics.checkNotNullExpressionValue(cVar, "next(...)");
            c cVar2 = cVar;
            if (!cVar2.getZombie()) {
                Y(cVar2);
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        while (this.size > this.maxSize) {
            if (!b0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<c> collectionValues = this.lruEntries.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    Intrinsics.checkNotNull(cVar);
                    if (cVar.getCurrentEditor() != null && (currentEditor = cVar.getCurrentEditor()) != null) {
                        currentEditor.d();
                    }
                }
                c0();
                ew.f fVar = this.journalWriter;
                if (fVar != null) {
                    nv.n.f(fVar);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d0(String key) {
        if (C.f(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            m();
            c0();
            ew.f fVar = this.journalWriter;
            Intrinsics.checkNotNull(fVar);
            fVar.flush();
        }
    }

    public final synchronized void m() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void n(@NotNull b editor, boolean success) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        c entry = editor.getEntry();
        if (!Intrinsics.c(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                Intrinsics.checkNotNull(written);
                if (!written[i11]) {
                    editor.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.m(entry.c().get(i11))) {
                    editor.b();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            b0 b0Var = entry.c().get(i13);
            if (!success || entry.getZombie()) {
                nv.n.i(this.fileSystem, b0Var);
            } else if (this.fileSystem.m(b0Var)) {
                b0 b0Var2 = entry.a().get(i13);
                this.fileSystem.c(b0Var, b0Var2);
                long j10 = entry.getLengths()[i13];
                Long size = this.fileSystem.o(b0Var2).getSize();
                long jLongValue = size != null ? size.longValue() : 0L;
                entry.getLengths()[i13] = jLongValue;
                this.size = (this.size - j10) + jLongValue;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            Y(entry);
            return;
        }
        this.redundantOpCount++;
        ew.f fVar = this.journalWriter;
        Intrinsics.checkNotNull(fVar);
        if (entry.getReadable() || success) {
            entry.o(true);
            fVar.D0(D).writeByte(32);
            fVar.D0(entry.getKey());
            entry.s(fVar);
            fVar.writeByte(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.p(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            fVar.D0(F).writeByte(32);
            fVar.D0(entry.getKey());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.size > this.maxSize || E()) {
            qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void o() throws IOException {
        close();
        nv.n.h(this.fileSystem, this.directory);
    }

    @Nullable
    public final synchronized b p(@NotNull String key, long expectedSequenceNumber) {
        Intrinsics.checkNotNullParameter(key, "key");
        A();
        m();
        d0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != B && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            ew.f fVar = this.journalWriter;
            Intrinsics.checkNotNull(fVar);
            fVar.D0(E).writeByte(32).D0(key).writeByte(10);
            fVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.lruEntries.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    @Nullable
    public final synchronized d s(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A();
        m();
        d0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.redundantOpCount++;
        ew.f fVar = this.journalWriter;
        Intrinsics.checkNotNull(fVar);
        fVar.D0(G).writeByte(32).D0(key).writeByte(10);
        if (E()) {
            qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return dVarR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final b0 getDirectory() {
        return this.directory;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final k getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }
}
