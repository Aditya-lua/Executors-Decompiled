package com.roblox.client.ossearch;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.shortcuts.PinShortcutHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p283m2.C8412e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.roblox.client.ossearch.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR(\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m31665d2 = {"Lcom/roblox/client/ossearch/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "g", "(Landroid/content/Context;)V", "e", "", PinShortcutHandler.EXTRA_PLACE_ID, "b", "(Landroid/content/Context;J)V", "f", "c", "(Landroid/content/Context;)J", "timestampMs", "d", "a", "Lku/p0;", "Lku/p0;", "getCoroutineScope$NativeShell_googleProdRelease", "()Lku/p0;", "setCoroutineScope$NativeShell_googleProdRelease", "(Lku/p0;)V", "getCoroutineScope$NativeShell_googleProdRelease$annotations", "coroutineScope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3210b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3210b f11954a = new C3210b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC7906p0 coroutineScope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));

    /* JADX INFO: renamed from: com.roblox.client.ossearch.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchManager$stopSyncAndDeleteIndex$1", m39664f = "OSSearchManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11956t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f11957u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f11957u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f11957u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f11956t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C3211c.INSTANCE.m15336a().m15332f();
            C8412e.m34108i(this.f11957u);
            C3210b c3210b = C3210b.f11954a;
            Context context = this.f11957u;
            Intrinsics.checkNotNull(context);
            c3210b.m15321a(context);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15317b(@NotNull Context context, long placeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6124q.m27063h("OSSearchManager", "Scheduling search result fetch for placeId: " + placeId);
        OSSearchSingleResultFetchWorker.INSTANCE.m15301b(context, placeId);
    }

    /* JADX INFO: renamed from: e */
    public static final void m15318e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6124q.m27063h("OSSearchManager", "Scheduling periodic OS search index sync");
        OSSearchIndexSyncWorker.INSTANCE.m15295d(context);
    }

    /* JADX INFO: renamed from: f */
    public static final void m15319f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6124q.m27063h("OSSearchManager", "Stopping OS search sync and deleting index");
        OSSearchIndexSyncWorker.Companion c3199a = OSSearchIndexSyncWorker.INSTANCE;
        c3199a.m15292a(context);
        c3199a.m15293b(context);
        OSSearchSingleResultFetchWorker.INSTANCE.m15300a(context);
        C7882k.m32780d(coroutineScope, null, null, new a(context.getApplicationContext(), null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m15320g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6124q.m27063h("OSSearchManager", "Triggering OS search index sync on login");
        OSSearchIndexSyncWorker.INSTANCE.m15294c(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m15321a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("os_search_sync", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("os_search_next_sync_timestamp_ms");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public final long m15322c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences("os_search_sync", 0).getLong("os_search_next_sync_timestamp_ms", 0L);
    }

    /* JADX INFO: renamed from: d */
    public final void m15323d(@NotNull Context context, long timestampMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("os_search_sync", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("os_search_next_sync_timestamp_ms", timestampMs);
        editorEdit.apply();
    }
}
