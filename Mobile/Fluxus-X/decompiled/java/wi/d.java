package wi;

import av.g1;
import av.i;
import av.l0;
import av.p0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import gu.l;
import gu.m;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {BuildConfig.FLAVOR, "conversationId", BuildConfig.FLAVOR, "conversationGuid", "message", "Lzt/n;", "b", "(JLjava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(JLjava/lang/String;Leu/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35815t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f35816u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f35817v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f35816u = str;
            this.f35817v = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f35816u, this.f35817v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Boolean> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            boolean zC;
            fu.c.e();
            if (this.f35815t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.a().A2()) {
                i0 i0VarA = cl.g.d().c().markConversations(new ll.a(new String[]{this.f35816u})).j().a();
                Intrinsics.checkNotNull(i0VarA);
                zC = Intrinsics.c("success", new JSONObject(i0VarA.h()).optString("status"));
            } else {
                i0 i0VarA2 = cl.g.d().c().markConversations(new ll.b(new long[]{this.f35817v})).j().a();
                Intrinsics.checkNotNull(i0VarA2);
                zC = Intrinsics.c("success", new JSONObject(i0VarA2.h()).optString("status"));
            }
            return gu.b.a(zC);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.job.ChatJobsKt", f = "ChatJobs.kt", l = {23}, m = "sendChatMessage", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f35818t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35819u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f35820v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f35821w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f35822x;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35821w = obj;
            this.f35822x |= Integer.MIN_VALUE;
            Object objB = d.b(0L, null, null, this);
            return objB == fu.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35823t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f35824u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35825v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f35826w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j10, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f35824u = str;
            this.f35825v = str2;
            this.f35826w = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f35824u, this.f35825v, this.f35826w, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<String>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objB;
            fu.c.e();
            if (this.f35823t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String[] strArr = {this.f35824u};
            i0 i0VarA = (h.a().A2() ? cl.g.d().c().sendMessages(new ll.c(this.f35825v, strArr)).j() : cl.g.d().c().sendMessages(new ll.d(this.f35826w, strArr)).j()).a();
            Intrinsics.checkNotNull(i0VarA);
            JSONArray jSONArray = new JSONObject(i0VarA.h()).getJSONArray("messages");
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

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<String>>) bVar);
        }
    }

    @Nullable
    public static final Object a(long j10, @Nullable String str, @NotNull eu.b<? super Boolean> bVar) {
        return i.g(g1.b(), new a(str, j10, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(long j10, @Nullable String str, @NotNull String str2, @NotNull eu.b<? super n<String>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f35822x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f35822x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f35821w;
        Object objE = fu.c.e();
        int i11 = bVar2.f35822x;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(str2, str, j10, null);
            bVar2.f35819u = l.a(str);
            bVar2.f35820v = l.a(str2);
            bVar2.f35818t = j10;
            bVar2.f35822x = 1;
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
