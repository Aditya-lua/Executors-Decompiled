package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.r;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import u2.o;
import v2.g;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.AbstractC0036c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2452k = new a();

    public static class a {
        public Typeface a(@NonNull Context context, @NonNull g.b bVar) {
            return g.a(context, null, new g.b[]{bVar});
        }

        @NonNull
        public g.a b(@NonNull Context context, @NonNull v2.e eVar) {
            return g.b(context, null, eVar);
        }

        public void c(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f2453a;

        @NonNull
        public final v2.e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final a f2454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f2455d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f2456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f2457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f2458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.i f2459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f2460i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f2461j;

        public b(@NonNull Context context, @NonNull v2.e eVar, @NonNull a aVar) {
            x2.g.h(context, "Context cannot be null");
            x2.g.h(eVar, "FontRequest cannot be null");
            this.f2453a = context.getApplicationContext();
            this.b = eVar;
            this.f2454c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull c.i iVar) {
            x2.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f2455d) {
                this.f2459h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f2455d) {
                try {
                    this.f2459h = null;
                    ContentObserver contentObserver = this.f2460i;
                    if (contentObserver != null) {
                        this.f2454c.c(this.f2453a, contentObserver);
                        this.f2460i = null;
                    }
                    Handler handler = this.f2456e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2461j);
                    }
                    this.f2456e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2458g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2457f = null;
                    this.f2458g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f2455d) {
                try {
                    if (this.f2459h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f2455d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f2454c.a(this.f2453a, bVarE);
                            ByteBuffer byteBufferE = r.e(this.f2453a, null, bVarE.e());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            o.b();
                            synchronized (this.f2455d) {
                                try {
                                    c.i iVar = this.f2459h;
                                    if (iVar != null) {
                                        iVar.b(fVarB);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            b();
                        } catch (Throwable th3) {
                            o.b();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (this.f2455d) {
                            try {
                                c.i iVar2 = this.f2459h;
                                if (iVar2 != null) {
                                    iVar2.a(th4);
                                }
                                b();
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

        public void d() {
            synchronized (this.f2455d) {
                try {
                    if (this.f2459h == null) {
                        return;
                    }
                    if (this.f2457f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = z3.b.b("emojiCompat");
                        this.f2458g = threadPoolExecutorB;
                        this.f2457f = threadPoolExecutorB;
                    }
                    this.f2457f.execute(new Runnable() { // from class: z3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37138a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f2454c.b(this.f2453a, this.b);
                if (aVarB.e() == 0) {
                    g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void f(@NonNull Executor executor) {
            synchronized (this.f2455d) {
                this.f2457f = executor;
            }
        }
    }

    public e(@NonNull Context context, @NonNull v2.e eVar) {
        super(new b(context, eVar, f2452k));
    }

    @NonNull
    public e c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
