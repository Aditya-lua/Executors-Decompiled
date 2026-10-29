package com.roblox.client.ossearch;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.shortcuts.PinShortcutHandler;
import gk.p;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import ku.z2;
import m2.e;
import org.jetbrains.annotations.NotNull;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR(\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/roblox/client/ossearch/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "g", "(Landroid/content/Context;)V", "e", "", PinShortcutHandler.EXTRA_PLACE_ID, "b", "(Landroid/content/Context;J)V", "f", "c", "(Landroid/content/Context;)J", "timestampMs", "d", "a", "Lku/p0;", "Lku/p0;", "getCoroutineScope$NativeShell_googleProdRelease", "()Lku/p0;", "setCoroutineScope$NativeShell_googleProdRelease", "(Lku/p0;)V", "getCoroutineScope$NativeShell_googleProdRelease$annotations", "coroutineScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f9167a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static p0 coroutineScope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchManager$stopSyncAndDeleteIndex$1", f = "OSSearchManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9169u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f9169u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f9169u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9168t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            c.INSTANCE.a().f();
            e.i(this.f9169u);
            b bVar = b.f9167a;
            Context context = this.f9169u;
            Intrinsics.checkNotNull(context);
            bVar.a(context);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final void b(@NotNull Context context, long placeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        p.h("OSSearchManager", "Scheduling search result fetch for placeId: " + placeId);
        OSSearchSingleResultFetchWorker.INSTANCE.b(context, placeId);
    }

    public static final void e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p.h("OSSearchManager", "Scheduling periodic OS search index sync");
        OSSearchIndexSyncWorker.INSTANCE.d(context);
    }

    public static final void f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p.h("OSSearchManager", "Stopping OS search sync and deleting index");
        OSSearchIndexSyncWorker.Companion aVar = OSSearchIndexSyncWorker.INSTANCE;
        aVar.a(context);
        aVar.b(context);
        OSSearchSingleResultFetchWorker.INSTANCE.a(context);
        k.d(coroutineScope, null, null, new a(context.getApplicationContext(), null), 3, null);
    }

    public static final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p.h("OSSearchManager", "Triggering OS search index sync on login");
        OSSearchIndexSyncWorker.INSTANCE.c(context);
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("os_search_sync", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("os_search_next_sync_timestamp_ms");
        editorEdit.apply();
    }

    public final long c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences("os_search_sync", 0).getLong("os_search_next_sync_timestamp_ms", 0L);
    }

    public final void d(@NotNull Context context, long timestampMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("os_search_sync", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("os_search_next_sync_timestamp_ms", timestampMs);
        editorEdit.apply();
    }
}
