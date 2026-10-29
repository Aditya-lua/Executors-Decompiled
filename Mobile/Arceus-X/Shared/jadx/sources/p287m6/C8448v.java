package p287m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4861h0;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: m6.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m31665d2 = {"Lm6/v;", "Lm6/s;", "Lxu/g;", Payload.SOURCE, "Lxu/l;", "fileSystem", "Lm6/s$a;", "metadata", "<init>", "(Lxu/g;Lxu/l;Lm6/s$a;)V", "", "a", "()V", "()Lxu/g;", "Lxu/h0;", "X2", "()Lxu/h0;", "close", "Lxu/l;", "getFileSystem", "()Lxu/l;", "b", "Lm6/s$a;", "getMetadata", "()Lm6/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "", "d", "Z", "isClosed", "e", "Lxu/g;", "f", "Lxu/h0;", "file", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8448v implements InterfaceC8445s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12938l fileSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC8445s.a metadata;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC12928g source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C12931h0 file;

    public C8448v(@NotNull InterfaceC12928g interfaceC12928g, @NotNull AbstractC12938l abstractC12938l, @Nullable InterfaceC8445s.a aVar) {
        this.fileSystem = abstractC12938l;
        this.metadata = aVar;
        this.source = interfaceC12928g;
    }

    /* JADX INFO: renamed from: a */
    private final void m34223a() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // p287m6.InterfaceC8445s
    @Nullable
    /* JADX INFO: renamed from: X2 */
    public C12931h0 mo34213X2() {
        C12931h0 c12931h0;
        synchronized (this.lock) {
            m34223a();
            c12931h0 = this.file;
        }
        return c12931h0;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                InterfaceC12928g interfaceC12928g = this.source;
                if (interfaceC12928g != null) {
                    C4861h0.m23441h(interfaceC12928g);
                }
                C12931h0 c12931h0 = this.file;
                if (c12931h0 != null) {
                    getFileSystem().delete(c12931h0);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p287m6.InterfaceC8445s
    @NotNull
    public AbstractC12938l getFileSystem() {
        return this.fileSystem;
    }

    @Override // p287m6.InterfaceC8445s
    @Nullable
    public InterfaceC8445s.a getMetadata() {
        return this.metadata;
    }

    @Override // p287m6.InterfaceC8445s
    @NotNull
    public InterfaceC12928g source() {
        synchronized (this.lock) {
            m34223a();
            InterfaceC12928g interfaceC12928g = this.source;
            if (interfaceC12928g != null) {
                return interfaceC12928g;
            }
            AbstractC12938l fileSystem = getFileSystem();
            C12931h0 c12931h0 = this.file;
            Intrinsics.checkNotNull(c12931h0);
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(fileSystem.source(c12931h0));
            this.source = interfaceC12928gM47961c;
            return interfaceC12928gM47961c;
        }
    }
}
