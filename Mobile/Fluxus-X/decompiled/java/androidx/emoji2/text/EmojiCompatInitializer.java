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
public class EmojiCompatInitializer implements l5.b<Boolean> {

    public class a implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f2209a;

        public a(l lVar) {
            this.f2209a = lVar;
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(@NonNull s sVar) {
            EmojiCompatInitializer.this.d();
            this.f2209a.d(this);
        }
    }

    public static class b extends androidx.emoji2.text.c.AbstractC0044c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements androidx.emoji2.text.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2210a;

        public class a extends androidx.emoji2.text.c.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.emoji2.text.c.i f2211a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(androidx.emoji2.text.c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2211a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th2) {
                try {
                    this.f2211a.a(th2);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(@NonNull f fVar) {
                try {
                    this.f2211a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f2210a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull final androidx.emoji2.text.c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = a4.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: a4.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(@NonNull androidx.emoji2.text.c.i iVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.f2210a);
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

    @Override // l5.b
    @NonNull
    public List<Class<? extends l5.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // l5.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean create(@NonNull Context context) {
        androidx.emoji2.text.c.h(new b(context));
        c(context);
        return Boolean.TRUE;
    }

    public void c(@NonNull Context context) {
        l lVarA = ((s) l5.a.e(context).f(ProcessLifecycleInitializer.class)).a();
        lVarA.a(new a(lVarA));
    }

    public void d() {
        a4.b.c().postDelayed(new d(), 500L);
    }
}
