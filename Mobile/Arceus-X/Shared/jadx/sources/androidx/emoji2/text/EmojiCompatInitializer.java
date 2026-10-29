package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import androidx.p616lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p238k5.C7447a;
import p238k5.InterfaceC7448b;
import p456u2.C11786o;
import p593z3.C13691b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC7448b<Boolean> {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public class C0894a implements InterfaceC0954f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0966l f3163a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0894a(AbstractC0966l abstractC0966l) {
            this.f3163a = abstractC0966l;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(@NonNull InterfaceC0980s interfaceC0980s) {
            EmojiCompatInitializer.this.m4248c();
            this.f3163a.mo4938d(this);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0895b extends C0900c.c {
        public C0895b(Context context) {
            super(new C0896c(context));
            m4295b(1);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C0896c implements C0900c.h {

        /* JADX INFO: renamed from: a */
        public final Context f3165a;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        public class a extends C0900c.i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0900c.i f3166a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f3167b;

            public a(C0900c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3166a = iVar;
                this.f3167b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C0900c.i
            /* JADX INFO: renamed from: a */
            public void mo4252a(Throwable th2) {
                try {
                    this.f3166a.mo4252a(th2);
                } finally {
                    this.f3167b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C0900c.i
            /* JADX INFO: renamed from: b */
            public void mo4253b(@NonNull C0903f c0903f) {
                try {
                    this.f3166a.mo4253b(c0903f);
                } finally {
                    this.f3167b.shutdown();
                }
            }
        }

        public C0896c(Context context) {
            this.f3165a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0900c.h
        /* JADX INFO: renamed from: a */
        public void mo4250a(@NonNull final C0900c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorM50012b = C13691b.m50012b("EmojiCompatInitializer");
            threadPoolExecutorM50012b.execute(new Runnable() { // from class: z3.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48066a.m4251c(iVar, threadPoolExecutorM50012b);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public void m4251c(@NonNull C0900c.i iVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0902e c0902eM4254a = C0898a.m4254a(this.f3165a);
                if (c0902eM4254a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c0902eM4254a.m4320c(threadPoolExecutor);
                c0902eM4254a.m4294a().mo4250a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.mo4252a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    public static class RunnableC0897d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C11786o.m44081a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0900c.m4274i()) {
                    C0900c.m4270c().m4279l();
                }
            } finally {
                C11786o.m44082b();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // p238k5.InterfaceC7448b
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(@NonNull Context context) {
        C0900c.m4273h(new C0895b(context));
        m4247b(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public void m4247b(@NonNull Context context) {
        AbstractC0966l abstractC0966lMo4656a = ((InterfaceC0980s) C7447a.m30961e(context).m30966f(ProcessLifecycleInitializer.class)).mo4656a();
        abstractC0966lMo4656a.mo4935a(new C0894a(abstractC0966lMo4656a));
    }

    /* JADX INFO: renamed from: c */
    public void m4248c() {
        C13691b.m50013c().postDelayed(new RunnableC0897d(), 500L);
    }

    @Override // p238k5.InterfaceC7448b
    @NonNull
    public List<Class<? extends InterfaceC7448b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
