package g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
import iu.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b&\u0018\u0000 .2\u00020\u0001:\u00037=:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010 J)\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u00020&\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00028\u0000H\u0007¢\u0006\u0004\b*\u0010+J?\u0010.\u001a\u00020\r\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030,068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00108R\u0014\u0010F\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010E¨\u0006G"}, d2 = {"Lg/f;", "", "<init>", "()V", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Lk2/c;", "options", "", "k", "(ILh/a;Ljava/lang/Object;Lk2/c;)V", "", "key", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg/a;", "callback", "Lg/c;", "n", "(Ljava/lang/String;Landroidx/lifecycle/s;Lh/a;Lg/a;)Lg/c;", "o", "(Ljava/lang/String;Lh/a;Lg/a;)Lg/c;", "r", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "outState", "m", "(Landroid/os/Bundle;)V", "savedInstanceState", "l", "resultCode", "Landroid/content/Intent;", "data", "", "f", "(IILandroid/content/Intent;)Z", "result", "g", "(ILjava/lang/Object;)Z", "Lg/f$a;", "callbackAndContract", "h", "(Ljava/lang/String;ILandroid/content/Intent;Lg/f$a;)V", "q", "i", "()I", "rc", "e", "(ILjava/lang/String;)V", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Lg/f$c;", "c", "keyToLifecycleContainers", "", "d", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> launchedKeys = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg/f$a;", "O", "", "Lg/a;", "callback", "Lh/a;", "contract", "<init>", "(Lg/a;Lh/a;)V", "a", "Lg/a;", "()Lg/a;", "b", "Lh/a;", "()Lh/a;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.a<O> callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final h.a<?, O> contract;

        public a(@NotNull g.a<O> callback, @NotNull h.a<?, O> contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        @NotNull
        public final g.a<O> a() {
            return this.callback;
        }

        @NotNull
        public final h.a<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg/f$c;", "", "Landroidx/lifecycle/l;", "lifecycle", "<init>", "(Landroidx/lifecycle/l;)V", "Landroidx/lifecycle/p;", "observer", "", "a", "(Landroidx/lifecycle/p;)V", "b", "()V", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "", "Ljava/util/List;", "observers", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l lifecycle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<p> observers;

        public c(@NotNull l lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void a(@NotNull p observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((p) it.next());
            }
            this.observers.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"g/f$d", "Lg/c;", "input", "Lk2/c;", "options", "", "c", "(Ljava/lang/Object;Lk2/c;)V", "d", "()V", "Lh/a;", "a", "()Lh/a;", "contract", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d<I> extends g.c<I> {
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h.a<I, O> f17313c;

        public d(String str, h.a<I, O> aVar) {
            this.b = str;
            this.f17313c = aVar;
        }

        @Override // g.c
        public h.a<I, ?> a() {
            return (h.a<I, ?>) this.f17313c;
        }

        @Override // g.c
        public void c(I input, k2.c options) throws Exception {
            Object obj = f.this.keyToRc.get(this.b);
            Object obj2 = this.f17313c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.launchedKeys.add(this.b);
                try {
                    f.this.k(iIntValue, this.f17313c, input, options);
                    return;
                } catch (Exception e10) {
                    f.this.launchedKeys.remove(this.b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.c
        public void d() {
            f.this.r(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"g/f$e", "Lg/c;", "input", "Lk2/c;", "options", "", "c", "(Ljava/lang/Object;Lk2/c;)V", "d", "()V", "Lh/a;", "a", "()Lh/a;", "contract", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e<I> extends g.c<I> {
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h.a<I, O> f17315c;

        public e(String str, h.a<I, O> aVar) {
            this.b = str;
            this.f17315c = aVar;
        }

        @Override // g.c
        public h.a<I, ?> a() {
            return (h.a<I, ?>) this.f17315c;
        }

        @Override // g.c
        public void c(I input, k2.c options) throws Exception {
            Object obj = f.this.keyToRc.get(this.b);
            Object obj2 = this.f17315c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.launchedKeys.add(this.b);
                try {
                    f.this.k(iIntValue, this.f17315c, input, options);
                    return;
                } catch (Exception e10) {
                    f.this.launchedKeys.remove(this.b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.c
        public void d() {
            f.this.r(this.b);
        }
    }

    public static final Integer j() {
        return Integer.valueOf(eu.d.INSTANCE.g(2147418112) + 65536);
    }

    public static final void p(f fVar, String str, g.a aVar, h.a aVar2, s sVar, l.a event) {
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (l.a.ON_START != event) {
            if (l.a.ON_STOP == event) {
                fVar.keyToCallback.remove(str);
                return;
            } else {
                if (l.a.ON_DESTROY == event) {
                    fVar.r(str);
                    return;
                }
                return;
            }
        }
        fVar.keyToCallback.put(str, new a<>(aVar, aVar2));
        if (fVar.parsedPendingResults.containsKey(str)) {
            Object obj = fVar.parsedPendingResults.get(str);
            fVar.parsedPendingResults.remove(str);
            aVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u2.c.a(fVar.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            fVar.pendingResults.remove(str);
            aVar.a(aVar2.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    public final void e(int rc2, String key) {
        this.rcToKey.put(Integer.valueOf(rc2), key);
        this.keyToRc.put(key, Integer.valueOf(rc2));
    }

    public final boolean f(int requestCode, int resultCode, @Nullable Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        h(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean g(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        g.a<?> aVarA = aVar.a();
        Intrinsics.d(aVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        aVarA.a(result);
        return true;
    }

    public final <O> void h(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().parseResult(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    public final int i() {
        for (Number number : m.i(new Function0() { // from class: g.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.j();
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract <I, O> void k(int requestCode, @NotNull h.a<I, O> contract, I input, @Nullable k2.c options);

    public final void l(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    h0.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(num, "get(...)");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    @NotNull
    public final <I, O> g.c<I> n(@NotNull final String key, @NotNull s lifecycleOwner, @NotNull final h.a<I, O> contract, @NotNull final g.a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        l lVarA = lifecycleOwner.a();
        if (lVarA.getState().b(l.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lVarA.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lVarA);
        }
        cVar.a(new p() { // from class: g.d
            @Override // androidx.p000lifecycle.p
            public final void g(s sVar, l.a aVar) {
                f.p(this.f17300a, key, callback, contract, sVar, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new d(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <I, O> g.c<I> o(@NotNull String key, @NotNull h.a<I, O> contract, @NotNull g.a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        q(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u2.c.a(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.a(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new e(key, contract);
    }

    public final void q(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        e(i(), key);
    }

    public final void r(@NotNull String key) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) u2.c.a(this.pendingResults, key, ActivityResult.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
