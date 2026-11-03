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
public class e extends c.AbstractC0032c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2297k = new a();

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
        public final Context f2298a;

        @NonNull
        public final v2.e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final a f2299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f2300d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f2301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f2302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f2303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.i f2304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f2305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f2306j;

        public b(@NonNull Context context, @NonNull v2.e eVar, @NonNull a aVar) {
            x2.g.h(context, "Context cannot be null");
            x2.g.h(eVar, "FontRequest cannot be null");
            this.f2298a = context.getApplicationContext();
            this.b = eVar;
            this.f2299c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull c.i iVar) {
            x2.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f2300d) {
                this.f2304h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f2300d) {
                try {
                    this.f2304h = null;
                    ContentObserver contentObserver = this.f2305i;
                    if (contentObserver != null) {
                        this.f2299c.c(this.f2298a, contentObserver);
                        this.f2305i = null;
                    }
                    Handler handler = this.f2301e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2306j);
                    }
                    this.f2301e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2303g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2302f = null;
                    this.f2303g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f2300d) {
                try {
                    if (this.f2304h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f2300d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f2299c.a(this.f2298a, bVarE);
                            ByteBuffer byteBufferE = r.e(this.f2298a, null, bVarE.e());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            o.b();
                            synchronized (this.f2300d) {
                                try {
                                    c.i iVar = this.f2304h;
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
                        synchronized (this.f2300d) {
                            try {
                                c.i iVar2 = this.f2304h;
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
            synchronized (this.f2300d) {
                try {
                    if (this.f2304h == null) {
                        return;
                    }
                    if (this.f2302f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = z3.b.b("emojiCompat");
                        this.f2303g = threadPoolExecutorB;
                        this.f2302f = threadPoolExecutorB;
                    }
                    this.f2302f.execute(new Runnable() { // from class: z3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37833a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f2299c.b(this.f2298a, this.b);
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
            synchronized (this.f2300d) {
                this.f2302f = executor;
            }
        }
    }

    public e(@NonNull Context context, @NonNull v2.e eVar) {
        super(new b(context, eVar, f2297k));
    }

    @NonNull
    public e c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
