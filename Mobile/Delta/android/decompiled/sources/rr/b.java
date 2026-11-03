package rr;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import hv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.h;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\r\u0011B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrr/b;", "Lwm/o;", "Lrr/b$b;", "Ltr/h;", "Lrr/a;", "service", "", "jwt", "<init>", "(Lrr/a;Ljava/lang/String;)V", "Llu/h;", "run", "()Llu/h;", "b", "Lrr/a;", "c", "Ljava/lang/String;", "a", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<AbstractC0541b>, h<AbstractC0541b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final rr.a service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String jwt;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrr/b$a;", "", "Lrr/a;", "service", "<init>", "(Lrr/a;)V", "", "jwt", "Lrr/b;", "a", "(Ljava/lang/String;)Lrr/b;", "Lrr/a;", "b", "()Lrr/a;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final rr.a service;

        public a(@NotNull rr.a service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final b a(@Nullable String jwt) {
            return new b(this.service, jwt);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final rr.a getService() {
            return this.service;
        }
    }

    /* JADX INFO: renamed from: rr.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrr/b$b;", "", "<init>", "()V", "b", "a", "Lrr/b$b$a;", "Lrr/b$b$b;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0541b {

        /* JADX INFO: renamed from: rr.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrr/b$b$a;", "Lrr/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends AbstractC0541b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: rr.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lrr/b$b$b;", "Lrr/b$b;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0542b extends AbstractC0541b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AuthorizeWebRtcResponse result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0542b(@NotNull AuthorizeWebRtcResponse result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AuthorizeWebRtcResponse getResult() {
                return this.result;
            }
        }

        public /* synthetic */ AbstractC0541b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0541b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1", f = "WebRtcWorker.kt", l = {37, 41, 43, 54}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lrr/b$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<i<? super AbstractC0541b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30884t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30885u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f30886v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f30887w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f30888x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f30889y;

        @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1", f = "WebRtcWorker.kt", l = {38}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<AuthorizeWebRtcResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30891t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f30892u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, lt.b<? super a> bVar2) {
                super(1, bVar2);
                this.f30892u = bVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f30892u, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30891t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                rr.a aVar = this.f30892u.service;
                String str = this.f30892u.jwt;
                this.f30891t = 1;
                Object objA = aVar.a(str, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<AuthorizeWebRtcResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f30889y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
        
            if (r1.emit(r6, r16) == r2) goto L30;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rr.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0541b> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public b(@NotNull rr.a service, @Nullable String str) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.jwt = str;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<AbstractC0541b> run() {
        return j.w(new c(null));
    }
}
