package jq;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "maxAttempts", "Lkotlin/Function2;", "Lnt/b;", "", "", "block", "", "a", "(ILkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    @pt.f(c = "com.withpersona.sdk2.inquiry.shared.RetryKt", f = "Retry.kt", l = {13}, m = "retry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21594t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f21595u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21596v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f21597w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f21598x;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21597w = obj;
            this.f21598x |= Integer.MIN_VALUE;
            return b0.a(0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super nt.b<? super java.lang.Boolean>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof jq.b0.a
            if (r0 == 0) goto L13
            r0 = r7
            jq.b0$a r0 = (jq.b0.a) r0
            int r1 = r0.f21598x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21598x = r1
            goto L18
        L13:
            jq.b0$a r0 = new jq.b0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21597w
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f21598x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.f21595u
            int r6 = r0.f21594t
            java.lang.Object r2 = r0.f21596v
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            jt.o.b(r7)
            goto L59
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            jt.o.b(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L41:
            if (r5 >= r6) goto L65
            java.lang.Integer r2 = pt.b.d(r5)
            r0.f21596v = r7
            r0.f21594t = r6
            r0.f21595u = r5
            r0.f21598x = r3
            java.lang.Object r2 = r7.invoke(r2, r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r2
            r2 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L62
            goto L65
        L62:
            int r5 = r5 + r3
            r7 = r2
            goto L41
        L65:
            kotlin.Unit r5 = kotlin.Unit.f22483a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b0.a(int, kotlin.jvm.functions.Function2, nt.b):java.lang.Object");
    }
}
