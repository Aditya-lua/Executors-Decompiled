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
public class e extends c.AbstractC0044c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2258k = new a();

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
        public final Context f2259a;

        @NonNull
        public final v2.e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final a f2260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f2261d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f2262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f2263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f2264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.i f2265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f2266i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f2267j;

        public b(@NonNull Context context, @NonNull v2.e eVar, @NonNull a aVar) {
            x2.g.h(context, "Context cannot be null");
            x2.g.h(eVar, "FontRequest cannot be null");
            this.f2259a = context.getApplicationContext();
            this.b = eVar;
            this.f2260c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull c.i iVar) {
            x2.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f2261d) {
                this.f2265h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f2261d) {
                try {
                    this.f2265h = null;
                    ContentObserver contentObserver = this.f2266i;
                    if (contentObserver != null) {
                        this.f2260c.c(this.f2259a, contentObserver);
                        this.f2266i = null;
                    }
                    Handler handler = this.f2262e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2267j);
                    }
                    this.f2262e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2264g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2263f = null;
                    this.f2264g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f2261d) {
                try {
                    if (this.f2265h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f2261d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f2260c.a(this.f2259a, bVarE);
                            ByteBuffer byteBufferE = r.e(this.f2259a, null, bVarE.e());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            o.b();
                            synchronized (this.f2261d) {
                                try {
                                    c.i iVar = this.f2265h;
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
                        synchronized (this.f2261d) {
                            try {
                                c.i iVar2 = this.f2265h;
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
            synchronized (this.f2261d) {
                try {
                    if (this.f2265h == null) {
                        return;
                    }
                    if (this.f2263f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = a4.b.b("emojiCompat");
                        this.f2264g = threadPoolExecutorB;
                        this.f2263f = threadPoolExecutorB;
                    }
                    this.f2263f.execute(new Runnable() { // from class: a4.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f108a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f2260c.b(this.f2259a, this.b);
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
            synchronized (this.f2261d) {
                this.f2263f = executor;
            }
        }
    }

    public e(@NonNull Context context, @NonNull v2.e eVar) {
        super(new b(context, eVar, f2258k));
    }

    @NonNull
    public e c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
