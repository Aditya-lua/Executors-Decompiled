package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.ProcessLifecycleInitializer;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import u2.o;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements k5.b<Boolean> {

    public class a implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f2403a;

        public a(l lVar) {
            this.f2403a = lVar;
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(@NonNull s sVar) {
            EmojiCompatInitializer.this.c();
            this.f2403a.d(this);
        }
    }

    public static class b extends androidx.emoji2.text.c.AbstractC0036c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements androidx.emoji2.text.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2404a;

        public class a extends androidx.emoji2.text.c.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.emoji2.text.c.i f2405a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(androidx.emoji2.text.c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2405a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th2) {
                try {
                    this.f2405a.a(th2);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(@NonNull f fVar) {
                try {
                    this.f2405a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f2404a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull final androidx.emoji2.text.c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = z3.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: z3.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37132a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(@NonNull androidx.emoji2.text.c.i iVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.f2404a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.i()) {
                    androidx.emoji2.text.c.c().l();
                }
            } finally {
                o.b();
            }
        }
    }

    @Override // k5.b
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(@NonNull Context context) {
        androidx.emoji2.text.c.h(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    public void b(@NonNull Context context) {
        l lVarA = ((s) k5.a.e(context).f(ProcessLifecycleInitializer.class)).a();
        lVarA.a(new a(lVarA));
    }

    public void c() {
        z3.b.c().postDelayed(new d(), 500L);
    }

    @Override // k5.b
    @NonNull
    public List<Class<? extends k5.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
