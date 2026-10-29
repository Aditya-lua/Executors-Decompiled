package oi;

import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.i;
import ku.l0;
import ku.p0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pt.l;
import pt.m;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "conversationId", "", "conversationGuid", "message", "Ljt/n;", "b", "(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "a", "(JLjava/lang/String;Lnt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27380t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f27381u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f27382v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f27381u = str;
            this.f27382v = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f27381u, this.f27382v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            boolean zC;
            ot.c.e();
            if (this.f27380t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.a().n2()) {
                ResponseBody responseBodyA = vk.g.d().d().c(new bl.a(new String[]{this.f27381u})).execute().a();
                Intrinsics.checkNotNull(responseBodyA);
                zC = Intrinsics.c("success", new JSONObject(responseBodyA.string()).optString("status"));
            } else {
                ResponseBody responseBodyA2 = vk.g.d().d().b(new bl.b(new long[]{this.f27382v})).execute().a();
                Intrinsics.checkNotNull(responseBodyA2);
                zC = Intrinsics.c("success", new JSONObject(responseBodyA2.string()).optString("status"));
            }
            return pt.b.a(zC);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Boolean> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.job.ChatJobsKt", f = "ChatJobs.kt", l = {23}, m = "sendChatMessage", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f27383t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27384u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f27385v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f27386w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f27387x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27386w = obj;
            this.f27387x |= Integer.MIN_VALUE;
            Object objB = d.b(0L, null, null, this);
            return objB == ot.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27388t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f27389u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f27390v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f27391w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j10, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f27389u = str;
            this.f27390v = str2;
            this.f27391w = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f27389u, this.f27390v, this.f27391w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<String>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objB;
            ot.c.e();
            if (this.f27388t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String[] strArr = {this.f27389u};
            ResponseBody responseBodyA = (h.a().n2() ? vk.g.d().d().d(new bl.c(this.f27390v, strArr)).execute() : vk.g.d().d().a(new bl.d(this.f27391w, strArr)).execute()).a();
            Intrinsics.checkNotNull(responseBodyA);
            JSONArray jSONArray = new JSONObject(responseBodyA.string()).getJSONArray("messages");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                String string = jSONObject.getString("status");
                if (Intrinsics.c("success", string)) {
                    n.Companion companion = n.INSTANCE;
                    objB = n.b(jSONObject.getString("id"));
                } else {
                    n.Companion companion2 = n.INSTANCE;
                    Intrinsics.checkNotNull(string);
                    objB = n.b(o.a(new e(string, "Send Failed")));
                }
            } else {
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(new e("failed", "No messages in the response")));
            }
            return n.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<String>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final Object a(long j10, @Nullable String str, @NotNull nt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new a(str, j10, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(long j10, @Nullable String str, @NotNull String str2, @NotNull nt.b<? super n<String>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f27387x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f27387x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f27386w;
        Object objE = ot.c.e();
        int i11 = bVar2.f27387x;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(str2, str, j10, null);
            bVar2.f27384u = l.a(str);
            bVar2.f27385v = l.a(str2);
            bVar2.f27383t = j10;
            bVar2.f27387x = 1;
            objG = i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        return ((n) objG).getValue();
    }
}
