package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0565r;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p456u2.C11786o;
import p482v2.C12002e;
import p482v2.C12004g;
import p533x2.C12637g;
import p593z3.C13691b;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public class C0902e extends C0900c.c {

    /* JADX INFO: renamed from: k */
    public static final a f3222k = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public Typeface m4321a(@NonNull Context context, @NonNull C12004g.b bVar) {
            return C12004g.m44807a(context, null, new C12004g.b[]{bVar});
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C12004g.a m4322b(@NonNull Context context, @NonNull C12002e c12002e) {
            return C12004g.m44808b(context, null, c12002e);
        }

        /* JADX INFO: renamed from: c */
        public void m4323c(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$b */
    public static class b implements C0900c.h {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Context f3223a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final C12002e f3224b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final a f3225c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public final Object f3226d = new Object();

        /* JADX INFO: renamed from: e */
        public Handler f3227e;

        /* JADX INFO: renamed from: f */
        public Executor f3228f;

        /* JADX INFO: renamed from: g */
        public ThreadPoolExecutor f3229g;

        /* JADX INFO: renamed from: h */
        public C0900c.i f3230h;

        /* JADX INFO: renamed from: i */
        public ContentObserver f3231i;

        /* JADX INFO: renamed from: j */
        public Runnable f3232j;

        public b(@NonNull Context context, @NonNull C12002e c12002e, @NonNull a aVar) {
            C12637g.m47076h(context, "Context cannot be null");
            C12637g.m47076h(c12002e, "FontRequest cannot be null");
            this.f3223a = context.getApplicationContext();
            this.f3224b = c12002e;
            this.f3225c = aVar;
        }

        @Override // androidx.emoji2.text.C0900c.h
        /* JADX INFO: renamed from: a */
        public void mo4250a(@NonNull C0900c.i iVar) {
            C12637g.m47076h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f3226d) {
                this.f3230h = iVar;
            }
            m4326d();
        }

        /* JADX INFO: renamed from: b */
        public final void m4324b() {
            synchronized (this.f3226d) {
                try {
                    this.f3230h = null;
                    ContentObserver contentObserver = this.f3231i;
                    if (contentObserver != null) {
                        this.f3225c.m4323c(this.f3223a, contentObserver);
                        this.f3231i = null;
                    }
                    Handler handler = this.f3227e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f3232j);
                    }
                    this.f3227e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f3229g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f3228f = null;
                    this.f3229g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m4325c() {
            synchronized (this.f3226d) {
                try {
                    if (this.f3230h == null) {
                        return;
                    }
                    try {
                        C12004g.b bVarM4327e = m4327e();
                        int iM44817b = bVarM4327e.m44817b();
                        if (iM44817b == 2) {
                            synchronized (this.f3226d) {
                            }
                        }
                        if (iM44817b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iM44817b + ")");
                        }
                        try {
                            C11786o.m44081a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceM4321a = this.f3225c.m4321a(this.f3223a, bVarM4327e);
                            ByteBuffer byteBufferM2787e = C0565r.m2787e(this.f3223a, null, bVarM4327e.m44820e());
                            if (byteBufferM2787e == null || typefaceM4321a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C0903f c0903fM4329b = C0903f.m4329b(typefaceM4321a, byteBufferM2787e);
                            C11786o.m44082b();
                            synchronized (this.f3226d) {
                                try {
                                    C0900c.i iVar = this.f3230h;
                                    if (iVar != null) {
                                        iVar.mo4253b(c0903fM4329b);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            m4324b();
                        } catch (Throwable th3) {
                            C11786o.m44082b();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (this.f3226d) {
                            try {
                                C0900c.i iVar2 = this.f3230h;
                                if (iVar2 != null) {
                                    iVar2.mo4252a(th4);
                                }
                                m4324b();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m4326d() {
            synchronized (this.f3226d) {
                try {
                    if (this.f3230h == null) {
                        return;
                    }
                    if (this.f3228f == null) {
                        ThreadPoolExecutor threadPoolExecutorM50012b = C13691b.m50012b("emojiCompat");
                        this.f3229g = threadPoolExecutorM50012b;
                        this.f3228f = threadPoolExecutorM50012b;
                    }
                    this.f3228f.execute(new Runnable() { // from class: z3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48074a.m4325c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final C12004g.b m4327e() {
            try {
                C12004g.a aVarM4322b = this.f3225c.m4322b(this.f3223a, this.f3224b);
                if (aVarM4322b.m44814e() == 0) {
                    C12004g.b[] bVarArrM44812c = aVarM4322b.m44812c();
                    if (bVarArrM44812c == null || bVarArrM44812c.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrM44812c[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarM4322b.m44814e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m4328f(@NonNull Executor executor) {
            synchronized (this.f3226d) {
                this.f3228f = executor;
            }
        }
    }

    public C0902e(@NonNull Context context, @NonNull C12002e c12002e) {
        super(new b(context, c12002e, f3222k));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C0902e m4320c(@NonNull Executor executor) {
        ((b) m4294a()).m4328f(executor);
        return this;
    }
}
