package p302n6;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.AbstractC12938l;
import p560xu.C12930h;
import p560xu.C12931h0;

/* JADX INFO: renamed from: n6.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0003\u001a\u000f\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, m31665d2 = {"Ln6/f;", "Ln6/a;", "", "maxSize", "Lxu/h0;", "directory", "Lxu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLxu/h0;Lxu/l;Lkotlin/coroutines/CoroutineContext;)V", "", "key", "Ln6/a$c;", "b", "(Ljava/lang/String;)Ln6/a$c;", "Ln6/a$b;", "a", "(Ljava/lang/String;)Ln6/a$b;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "J", "d", "()J", "Lxu/h0;", "c", "()Lxu/h0;", "Lxu/l;", "getFileSystem", "()Lxu/l;", "Ln6/d;", "Ln6/d;", "cache", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8892f implements InterfaceC8887a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 directory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12938l fileSystem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C8890d cache;

    /* JADX INFO: renamed from: n6.f$b */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m31665d2 = {"Ln6/f$b;", "Ln6/a$b;", "Ln6/d$b;", "Ln6/d;", "editor", "<init>", "(Ln6/d$b;)V", "Ln6/f$c;", "b", "()Ln6/f$c;", "", "abort", "()V", "a", "Ln6/d$b;", "Lxu/h0;", "getMetadata", "()Lxu/h0;", "metadata", "getData", "data", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC8887a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C8890d.b editor;

        public b(@NotNull C8890d.b bVar) {
            this.editor = bVar;
        }

        @Override // p302n6.InterfaceC8887a.b
        public void abort() {
            this.editor.m35803a();
        }

        /* JADX DEBUG: Method merged with bridge method: a()Ln6/a$c; */
        @Override // p302n6.InterfaceC8887a.b
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c mo35767a() {
            C8890d.d dVarM35805c = this.editor.m35805c();
            if (dVarM35805c != null) {
                return new c(dVarM35805c);
            }
            return null;
        }

        @Override // p302n6.InterfaceC8887a.b
        @NotNull
        public C12931h0 getData() {
            return this.editor.m35808f(1);
        }

        @Override // p302n6.InterfaceC8887a.b
        @NotNull
        public C12931h0 getMetadata() {
            return this.editor.m35808f(0);
        }
    }

    /* JADX INFO: renamed from: n6.f$c */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m31665d2 = {"Ln6/f$c;", "Ln6/a$c;", "Ln6/d$d;", "Ln6/d;", "snapshot", "<init>", "(Ln6/d$d;)V", "", "close", "()V", "Ln6/f$b;", "a", "()Ln6/f$b;", "Ln6/d$d;", "Lxu/h0;", "getMetadata", "()Lxu/h0;", "metadata", "getData", "data", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC8887a.c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C8890d.d snapshot;

        public c(@NotNull C8890d.d dVar) {
            this.snapshot = dVar;
        }

        /* JADX DEBUG: Method merged with bridge method: s2()Ln6/a$b; */
        @Override // p302n6.InterfaceC8887a.c
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo35768s2() {
            C8890d.b bVarM35826a = this.snapshot.m35826a();
            if (bVarM35826a != null) {
                return new b(bVarM35826a);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // p302n6.InterfaceC8887a.c
        @NotNull
        public C12931h0 getData() {
            return this.snapshot.m35827b(1);
        }

        @Override // p302n6.InterfaceC8887a.c
        @NotNull
        public C12931h0 getMetadata() {
            return this.snapshot.m35827b(0);
        }
    }

    public C8892f(long j10, @NotNull C12931h0 c12931h0, @NotNull AbstractC12938l abstractC12938l, @NotNull CoroutineContext coroutineContext) {
        this.maxSize = j10;
        this.directory = c12931h0;
        this.fileSystem = abstractC12938l;
        this.cache = new C8890d(getFileSystem(), getDirectory(), coroutineContext, getMaxSize(), 3, 2);
    }

    @Override // p302n6.InterfaceC8887a
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC8887a.b mo35762a(@NotNull String key) {
        C8890d.b bVarM35801w = this.cache.m35801w(m35830e(key));
        if (bVarM35801w != null) {
            return new b(bVarM35801w);
        }
        return null;
    }

    @Override // p302n6.InterfaceC8887a
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC8887a.c mo35763b(@NotNull String key) {
        C8890d.d dVarM35802y = this.cache.m35802y(m35830e(key));
        if (dVarM35802y != null) {
            return new c(dVarM35802y);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public C12931h0 getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: e */
    public final String m35830e(String str) {
        return C12930h.INSTANCE.m48117d(str).m48088H().mo48106r();
    }

    @Override // p302n6.InterfaceC8887a
    @NotNull
    public AbstractC12938l getFileSystem() {
        return this.fileSystem;
    }
}
