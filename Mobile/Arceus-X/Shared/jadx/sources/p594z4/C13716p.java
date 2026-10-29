package p594z4;

import android.database.SQLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7685i;
import kotlin.collections.C7708u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p229jt.C7328a;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.InterfaceC11970a;
import p535x4.InterfaceC12661f0;
import p535x4.InterfaceC12663g0;
import p559xt.C12915a;
import p566y4.C13030d;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u0019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJH\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u00069"}, m31665d2 = {"Lz4/p;", "Lx4/g0;", "Lz4/q;", "Lz4/b;", "connectionElementKey", "Lz4/j;", "delegate", "", "isReadOnly", "<init>", "(Lz4/b;Lz4/j;Z)V", "R", "Lx4/g0$a;", Payload.TYPE, "Lkotlin/Function2;", "Lx4/f0;", "Lnt/b;", "", "block", "o", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "c", "b", "(Lnt/b;)Ljava/lang/Object;", "", "n", "()V", "i", "(Lx4/g0$a;Lnt/b;)Ljava/lang/Object;", "success", "j", "(ZLnt/b;)Ljava/lang/Object;", "Lz4/b;", "k", "()Lz4/b;", "Lz4/j;", "l", "()Lz4/j;", "Z", "m", "()Z", "Lkotlin/collections/i;", "Lz4/p$c;", "d", "Lkotlin/collections/i;", "transactionStack", "e", "isRecycled", "Lf5/b;", "()Lf5/b;", "rawConnection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13716p implements InterfaceC12663g0, InterfaceC13717q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C13702b connectionElementKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13710j delegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isReadOnly;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C7685i<c> transactionStack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile boolean isRecycled;

    /* JADX INFO: renamed from: z4.p$a */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Lz4/p$a;", "Lf5/d;", "delegate", "<init>", "(Lz4/p;Lf5/d;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "a", "Lf5/d;", "b", "J", "threadId", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a implements InterfaceC5361d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5361d delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long threadId;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C13716p f48205c;

        public a(@NotNull C13716p c13716p, InterfaceC5361d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f48205c = c13716p;
            this.delegate = delegate;
            this.threadId = C13030d.m48546b();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.mo24699A(index, value);
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.mo24700C(index);
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.mo24701E();
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.mo24702E2(index);
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.close();
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.mo24704g3();
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.getBlob(index);
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.getColumnCount();
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.getColumnName(index);
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.getLong(index);
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                return this.delegate.isNull(index);
            }
            C5358a.m24694b(21, "Attempted to use statement on a different thread");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.mo24705k0(index, value);
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.reset();
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            if (this.f48205c.isRecycled) {
                C5358a.m24694b(21, "Statement is recycled");
                throw new C7334d();
            }
            if (this.threadId == C13030d.m48546b()) {
                this.delegate.mo24706z(index, value);
            } else {
                C5358a.m24694b(21, "Attempted to use statement on a different thread");
                throw new C7334d();
            }
        }
    }

    /* JADX INFO: renamed from: z4.p$b */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lz4/p$b;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/p;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lf5/b;", "d", "()Lf5/b;", "rawConnection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class b<T> implements InterfaceC12661f0<T>, InterfaceC13717q {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // p535x4.InterfaceC12674m
        @Nullable
        /* JADX INFO: renamed from: a */
        public <R> Object mo47227a(@NotNull String str, @NotNull Function1<? super InterfaceC5361d, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
            return C13716p.this.mo47227a(str, function1, interfaceC9557b);
        }

        @Override // p594z4.InterfaceC13717q
        @NotNull
        /* JADX INFO: renamed from: d */
        public InterfaceC5359b getDelegate() {
            return C13716p.this.getDelegate();
        }
    }

    /* JADX INFO: renamed from: z4.p$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lz4/p$c;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean shouldRollback;

        public c(int i10, boolean z10) {
            this.id = i10;
            this.shouldRollback = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }
    }

    /* JADX INFO: renamed from: z4.p$d */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48209a;

        static {
            int[] iArr = new int[InterfaceC12663g0.a.values().length];
            try {
                iArr[InterfaceC12663g0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC12663g0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC12663g0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48209a = iArr;
        }
    }

    /* JADX INFO: renamed from: z4.p$e */
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PooledConnectionImpl", m39664f = "ConnectionPoolImpl.kt", m39665l = {629}, m39666m = "beginTransaction")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48210t;

        /* JADX INFO: renamed from: u */
        public Object f48211u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48212v;

        /* JADX INFO: renamed from: x */
        public int f48214x;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48212v = obj;
            this.f48214x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13716p.this.m50104i(null, this);
        }
    }

    /* JADX INFO: renamed from: z4.p$f */
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PooledConnectionImpl", m39664f = "ConnectionPoolImpl.kt", m39665l = {629}, m39666m = "endTransaction")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public boolean f48215t;

        /* JADX INFO: renamed from: u */
        public Object f48216u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48217v;

        /* JADX INFO: renamed from: x */
        public int f48219x;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48217v = obj;
            this.f48219x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13716p.this.m50105j(false, this);
        }
    }

    /* JADX INFO: renamed from: z4.p$g */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PooledConnectionImpl", m39664f = "ConnectionPoolImpl.kt", m39665l = {464, 468, 482, 482, 482}, m39666m = "transaction")
    public static final class g<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48220t;

        /* JADX INFO: renamed from: u */
        public Object f48221u;

        /* JADX INFO: renamed from: v */
        public int f48222v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f48223w;

        /* JADX INFO: renamed from: y */
        public int f48225y;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48223w = obj;
            this.f48225y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13716p.this.m50103o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: z4.p$h */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PooledConnectionImpl", m39664f = "ConnectionPoolImpl.kt", m39665l = {640}, m39666m = "usePrepared")
    public static final class h<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48226t;

        /* JADX INFO: renamed from: u */
        public Object f48227u;

        /* JADX INFO: renamed from: v */
        public Object f48228v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f48229w;

        /* JADX INFO: renamed from: y */
        public int f48231y;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48229w = obj;
            this.f48231y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13716p.this.mo47227a(null, null, this);
        }
    }

    public C13716p(@NotNull C13702b connectionElementKey, @NotNull C13710j delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new C7685i<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (m50105j(false, r0) == r1) goto L60;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object m50103o(InterfaceC12663g0.a aVar, Function2<? super InterfaceC12661f0<R>, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super R> interfaceC9557b) throws Throwable {
        g gVar;
        Throwable th2;
        int i10;
        boolean z10;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i11 = gVar.f48225y;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f48225y = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object objInvoke = gVar.f48223w;
        Object objM38805e = C10047c.m38805e();
        int i12 = gVar.f48225y;
        InterfaceC13703c.a aVar2 = null;
        try {
            if (i12 == 0) {
                C7348o.m30470b(objInvoke);
                if (aVar == null) {
                    aVar = InterfaceC12663g0.a.DEFERRED;
                }
                gVar.f48220t = function2;
                gVar.f48225y = 1;
                if (m50104i(aVar, gVar) != objM38805e) {
                }
                return objM38805e;
            }
            if (i12 == 1) {
                function2 = (Function2) gVar.f48220t;
                C7348o.m30470b(objInvoke);
            } else {
                if (i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        Object obj = gVar.f48220t;
                        C7348o.m30470b(objInvoke);
                        return obj;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) gVar.f48221u;
                    th2 = (Throwable) gVar.f48220t;
                    try {
                        C7348o.m30470b(objInvoke);
                    } catch (SQLException e10) {
                        e = e10;
                        if (th2 != null) {
                            throw e;
                        }
                        C7328a.m30429a(th2, e);
                    }
                    throw th;
                }
                i10 = gVar.f48222v;
                C7348o.m30470b(objInvoke);
            }
            z10 = i10 != 0;
            gVar.f48220t = objInvoke;
            gVar.f48225y = 3;
            if (m50105j(z10, gVar) != objM38805e) {
                return objM38805e;
            }
            return objInvoke;
            b bVar = new b();
            gVar.f48220t = null;
            gVar.f48222v = 1;
            gVar.f48225y = 2;
            objInvoke = function2.invoke(bVar, gVar);
            if (objInvoke != objM38805e) {
                i10 = 1;
                if (i10 != 0) {
                }
                gVar.f48220t = objInvoke;
                gVar.f48225y = 3;
                if (m50105j(z10, gVar) != objM38805e) {
                    return objInvoke;
                }
            }
        } catch (Throwable th3) {
            try {
                try {
                    if (th3 instanceof InterfaceC13703c.a) {
                        Object objM50064a = th3.m50064a();
                        gVar.f48220t = objM50064a;
                        gVar.f48225y = 4;
                        if (m50105j(false, gVar) == objM38805e) {
                            return objM38805e;
                        }
                        return objM50064a;
                    }
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        aVar2 = th3;
                        th = th4;
                        gVar.f48220t = aVar2;
                        gVar.f48221u = th;
                        gVar.f48225y = 5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                gVar.f48220t = aVar2;
                gVar.f48221u = th;
                gVar.f48225y = 5;
            } catch (SQLException e11) {
                e = e11;
                th2 = aVar2;
                if (th2 != null) {
                    throw e;
                }
                C7328a.m30429a(th2, e);
            }
        }
        return objM38805e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p535x4.InterfaceC12674m
    @Nullable
    /* JADX INFO: renamed from: a */
    public <R> Object mo47227a(@NotNull String str, @NotNull Function1<? super InterfaceC5361d, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        h hVar;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof h) {
            hVar = (h) interfaceC9557b;
            int i10 = hVar.f48231y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                hVar.f48231y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                hVar = new h(interfaceC9557b);
            }
        } else {
            hVar = new h(interfaceC9557b);
        }
        Object obj = hVar.f48229w;
        Object objM38805e = C10047c.m38805e();
        int i11 = hVar.f48231y;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (this.isRecycled) {
                C5358a.m24694b(21, "Connection is recycled");
                throw new C7334d();
            }
            C13701a c13701a = (C13701a) hVar.getContext().get(getConnectionElementKey());
            if (c13701a == null || c13701a.getConnectionWrapper() != this) {
                C5358a.m24694b(21, "Attempted to use connection on a different coroutine");
                throw new C7334d();
            }
            interfaceC11970a = this.delegate;
            hVar.f48226t = str;
            hVar.f48227u = function1;
            hVar.f48228v = interfaceC11970a;
            hVar.f48231y = 1;
            if (interfaceC11970a.mo44674f(null, hVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC11970a interfaceC11970a2 = (InterfaceC11970a) hVar.f48228v;
            function1 = (Function1) hVar.f48227u;
            String str2 = (String) hVar.f48226t;
            C7348o.m30470b(obj);
            interfaceC11970a = interfaceC11970a2;
            str = str2;
        }
        try {
            a aVar = new a(this, this.delegate.mo24696r3(str));
            try {
                R rInvoke = function1.invoke(aVar);
                C12915a.m47941a(aVar, null);
                interfaceC11970a.mo44673e(null);
                return rInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(aVar, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            interfaceC11970a.mo44673e(null);
            throw th4;
        }
    }

    @Override // p535x4.InterfaceC12663g0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo47174b(@NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        if (this.isRecycled) {
            C5358a.m24694b(21, "Connection is recycled");
            throw new C7334d();
        }
        C13701a c13701a = (C13701a) interfaceC9557b.getContext().get(getConnectionElementKey());
        if (c13701a != null && c13701a.getConnectionWrapper() == this) {
            return C10340b.m39658a(!this.transactionStack.isEmpty() || this.delegate.mo24695D());
        }
        C5358a.m24694b(21, "Attempted to use connection on a different coroutine");
        throw new C7334d();
    }

    @Override // p535x4.InterfaceC12663g0
    @Nullable
    /* JADX INFO: renamed from: c */
    public <R> Object mo47175c(@NotNull InterfaceC12663g0.a aVar, @NotNull Function2<? super InterfaceC12661f0<R>, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        if (this.isRecycled) {
            C5358a.m24694b(21, "Connection is recycled");
            throw new C7334d();
        }
        C13701a c13701a = (C13701a) interfaceC9557b.getContext().get(getConnectionElementKey());
        if (c13701a != null && c13701a.getConnectionWrapper() == this) {
            return m50103o(aVar, function2, interfaceC9557b);
        }
        C5358a.m24694b(21, "Attempted to use connection on a different coroutine");
        throw new C7334d();
    }

    @Override // p594z4.InterfaceC13717q
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC5359b getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m50104i(InterfaceC12663g0.a aVar, InterfaceC9557b<? super Unit> interfaceC9557b) {
        e eVar;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f48214x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f48214x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object obj = eVar.f48212v;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f48214x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            interfaceC11970a = this.delegate;
            eVar.f48210t = aVar;
            eVar.f48211u = interfaceC11970a;
            eVar.f48214x = 1;
            if (interfaceC11970a.mo44674f(null, eVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC11970a interfaceC11970a2 = (InterfaceC11970a) eVar.f48211u;
            InterfaceC12663g0.a aVar2 = (InterfaceC12663g0.a) eVar.f48210t;
            C7348o.m30470b(obj);
            interfaceC11970a = interfaceC11970a2;
            aVar = aVar2;
        }
        try {
            int size = this.transactionStack.size();
            if (this.transactionStack.isEmpty()) {
                int i12 = d.f48209a[aVar.ordinal()];
                if (i12 == 1) {
                    C5358a.m24693a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i12 == 2) {
                    C5358a.m24693a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i12 != 3) {
                        throw new C7345l();
                    }
                    C5358a.m24693a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                C5358a.m24693a(this.delegate, "SAVEPOINT '" + size + '\'');
            }
            this.transactionStack.addLast(new c(size, false));
            Unit unit = Unit.f29331a;
            interfaceC11970a.mo44673e(null);
            return unit;
        } catch (Throwable th2) {
            interfaceC11970a.mo44673e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m50105j(boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        f fVar;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f48219x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f48219x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object obj = fVar.f48217v;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f48219x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C13710j c13710j = this.delegate;
            fVar.f48216u = c13710j;
            fVar.f48215t = z10;
            fVar.f48219x = 1;
            if (c13710j.mo44674f(null, fVar) == objM38805e) {
                return objM38805e;
            }
            interfaceC11970a = c13710j;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = fVar.f48215t;
            interfaceC11970a = (InterfaceC11970a) fVar.f48216u;
            C7348o.m30470b(obj);
        }
        try {
            if (this.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) C7708u.m31927H(this.transactionStack);
            if (!z10 || cVar.getShouldRollback()) {
                if (this.transactionStack.isEmpty()) {
                    C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
                } else {
                    C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.getId() + '\'');
                }
            } else if (this.transactionStack.isEmpty()) {
                C5358a.m24693a(this.delegate, "END TRANSACTION");
            } else {
                C5358a.m24693a(this.delegate, "RELEASE SAVEPOINT '" + cVar.getId() + '\'');
            }
            Unit unit = Unit.f29331a;
            interfaceC11970a.mo44673e(null);
            return unit;
        } catch (Throwable th2) {
            interfaceC11970a.mo44673e(null);
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final C13702b getConnectionElementKey() {
        return this.connectionElementKey;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final C13710j getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: renamed from: n */
    public final void m50109n() {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.mo24695D()) {
            C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
        }
    }
}
