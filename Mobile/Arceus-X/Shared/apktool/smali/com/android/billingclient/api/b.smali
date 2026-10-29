.class public Lcom/android/billingclient/api/b;
.super Lcom/android/billingclient/api/a;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Lv7/i;

.field public G:Z

.field public H:Z

.field public I:Lcom/google/android/gms/internal/play_billing/s0;

.field public volatile J:Lv7/d;

.field public K:Ljava/util/concurrent/ExecutorService;

.field public final L:Ljava/lang/Long;

.field public final M:Lcom/google/android/gms/internal/play_billing/c0;

.field public final a:Ljava/lang/Object;

.field public volatile b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/os/Handler;

.field public volatile f:Lv7/t;

.field public g:Landroid/content/Context;

.field public h:Lv7/i1;

.field public volatile i:Lcom/google/android/gms/internal/play_billing/f;

.field public volatile j:Lv7/p0;

.field public k:Z

.field public l:Z

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s0;->k()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    new-instance p3, Ljava/util/Random;

    .line 3
    invoke-direct {p3}, Ljava/util/Random;-><init>()V

    invoke-virtual {p3}, Ljava/util/Random;->nextLong()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r;->a()Lcom/google/android/gms/internal/play_billing/c0;

    move-result-object p4

    iput-object p4, p0, Lcom/android/billingclient/api/b;->M:Lcom/google/android/gms/internal/play_billing/c0;

    const-string p4, "9.0.0"

    iput-object p4, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/android/billingclient/api/b;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 6
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h8;->L()Lcom/google/android/gms/internal/play_billing/e8;

    move-result-object v1

    .line 8
    invoke-virtual {v1, p4}, Lcom/google/android/gms/internal/play_billing/e8;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/e8;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    :cond_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 10
    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v1, p4}, Lcom/google/android/gms/internal/play_billing/e8;->v(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    .line 11
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {v1, p3, p4}, Lcom/google/android/gms/internal/play_billing/e8;->r(J)Lcom/google/android/gms/internal/play_billing/e8;

    iget-boolean p3, p5, Lcom/android/billingclient/api/a$a;->j:Z

    .line 12
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/play_billing/e8;->D(Z)Lcom/google/android/gms/internal/play_billing/e8;

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/play_billing/e8;->o(I)Lcom/google/android/gms/internal/play_billing/e8;

    const-wide/32 p3, 0x365f4650

    .line 14
    invoke-virtual {v1, p3, p4}, Lcom/google/android/gms/internal/play_billing/e8;->t(J)Lcom/google/android/gms/internal/play_billing/e8;

    .line 15
    invoke-static {v1, p2}, Lcom/android/billingclient/api/b;->m0(Lcom/google/android/gms/internal/play_billing/e8;Landroid/content/Context;)V

    :try_start_0
    iget-object p2, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 16
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    iget-object p3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 17
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    .line 18
    invoke-virtual {p2, p3, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 19
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/e8;->p(I)Lcom/google/android/gms/internal/play_billing/e8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 20
    const-string p2, "BillingClient"

    const-string p3, "Error getting app version code."

    .line 21
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    :goto_0
    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    new-instance p3, Lv7/m1;

    .line 24
    invoke-direct {p3, p1, p2}, Lv7/m1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/h8;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    iget-boolean p1, p5, Lcom/android/billingclient/api/a$a;->j:Z

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->G:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/m;Lv7/c0;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 8

    .line 53
    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 54
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s0;->k()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    new-instance p1, Ljava/util/Random;

    .line 55
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    .line 56
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r;->a()Lcom/google/android/gms/internal/play_billing/c0;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->M:Lcom/google/android/gms/internal/play_billing/c0;

    const-string v5, "9.0.0"

    iput-object v5, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 57
    invoke-static {}, Lcom/android/billingclient/api/b;->B()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v1, p3

    move-object v2, p4

    move-object/from16 v7, p8

    .line 58
    invoke-virtual/range {v0 .. v7}, Lcom/android/billingclient/api/b;->j(Landroid/content/Context;Lv7/m;Lv7/i;Lv7/c0;Ljava/lang/String;Lv7/i1;Lcom/android/billingclient/api/a$a;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/p1;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 8

    .line 26
    const-string p1, "BillingClient"

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p4, Ljava/lang/Object;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p4, 0x0

    iput p4, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p4, p0, Lcom/android/billingclient/api/b;->m:I

    .line 27
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s0;->k()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object p5

    iput-object p5, p0, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    new-instance p5, Ljava/util/Random;

    .line 28
    invoke-direct {p5}, Ljava/util/Random;-><init>()V

    invoke-virtual {p5}, Ljava/util/Random;->nextLong()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    iput-object p5, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r;->a()Lcom/google/android/gms/internal/play_billing/c0;

    move-result-object p6

    iput-object p6, p0, Lcom/android/billingclient/api/b;->M:Lcom/google/android/gms/internal/play_billing/c0;

    const-string p6, "9.0.0"

    iput-object p6, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 30
    invoke-static {}, Lcom/android/billingclient/api/b;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 31
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h8;->L()Lcom/google/android/gms/internal/play_billing/e8;

    move-result-object v1

    .line 33
    invoke-virtual {v1, p6}, Lcom/google/android/gms/internal/play_billing/e8;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/e8;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    :cond_0
    iget-object p6, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 35
    invoke-virtual {p6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {v1, p6}, Lcom/google/android/gms/internal/play_billing/e8;->v(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    .line 36
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    invoke-virtual {v1, p5, p6}, Lcom/google/android/gms/internal/play_billing/e8;->r(J)Lcom/google/android/gms/internal/play_billing/e8;

    iget-boolean p5, p7, Lcom/android/billingclient/api/a$a;->j:Z

    .line 37
    invoke-virtual {v1, p5}, Lcom/google/android/gms/internal/play_billing/e8;->D(Z)Lcom/google/android/gms/internal/play_billing/e8;

    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    invoke-virtual {v1, p5}, Lcom/google/android/gms/internal/play_billing/e8;->o(I)Lcom/google/android/gms/internal/play_billing/e8;

    const-wide/32 p5, 0x365f4650

    .line 39
    invoke-virtual {v1, p5, p6}, Lcom/google/android/gms/internal/play_billing/e8;->t(J)Lcom/google/android/gms/internal/play_billing/e8;

    .line 40
    invoke-static {v1, p3}, Lcom/android/billingclient/api/b;->m0(Lcom/google/android/gms/internal/play_billing/e8;Landroid/content/Context;)V

    :try_start_0
    iget-object p3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 41
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    iget-object p5, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 42
    invoke-virtual {p5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    .line 43
    invoke-virtual {p3, p5, p4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p3

    iget p3, p3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 44
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/play_billing/e8;->p(I)Lcom/google/android/gms/internal/play_billing/e8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p3, v0

    .line 45
    const-string p4, "Error getting app version code."

    .line 46
    invoke-static {p1, p4, p3}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    :goto_0
    iget-object p3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/play_billing/h8;

    new-instance p5, Lv7/m1;

    .line 49
    invoke-direct {p5, p3, p4}, Lv7/m1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/h8;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    const-string p3, "Billing client should have a valid listener but the provided is null."

    .line 50
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lv7/t;

    iget-object v1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 51
    invoke-direct/range {v0 .. v7}, Lv7/t;-><init>(Landroid/content/Context;Lv7/m;Lv7/p1;Lv7/c0;Lv7/q;Lv7/h;Lv7/i1;)V

    iput-object v0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    iput-object p2, p0, Lcom/android/billingclient/api/b;->F:Lv7/i;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    iget-boolean p1, p7, Lcom/android/billingclient/api/a$a;->j:Z

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->G:Z

    return-void
.end method

.method public static B()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.android.billingclient.ktx.BuildConfig"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "VERSION_NAME"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public static bridge synthetic B0(Lcom/android/billingclient/api/b;)Lv7/d;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->J:Lv7/d;

    return-object p0
.end method

.method public static bridge synthetic C0(Lcom/android/billingclient/api/b;)Lv7/i1;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    return-object p0
.end method

.method public static bridge synthetic E0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/d;
    .locals 0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->x()Lcom/android/billingclient/api/d;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic F(Lcom/android/billingclient/api/b;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    return-void
.end method

.method public static bridge synthetic F0(Ljava/lang/Exception;)Lcom/android/billingclient/api/d;
    .locals 0

    instance-of p0, p0, Landroid/os/DeadObjectException;

    if-eqz p0, :cond_0

    sget-object p0, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    return-object p0

    :cond_0
    sget-object p0, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    return-object p0
.end method

.method public static bridge synthetic G(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/f;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    return-void
.end method

.method public static bridge synthetic H(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->l:Z

    return-void
.end method

.method public static bridge synthetic H0(Lcom/android/billingclient/api/b;)Lv7/i;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->F:Lv7/i;

    return-object p0
.end method

.method public static bridge synthetic I(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->k:Z

    return-void
.end method

.method public static bridge synthetic I0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/f;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    return-object p0
.end method

.method public static bridge synthetic J(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s0;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    return-void
.end method

.method public static bridge synthetic J0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/c0;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->M:Lcom/google/android/gms/internal/play_billing/c0;

    return-object p0
.end method

.method public static bridge synthetic K(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/l7;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->b0(Lcom/google/android/gms/internal/play_billing/l7;)V

    return-void
.end method

.method public static bridge synthetic K0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/s0;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    return-object p0
.end method

.method public static bridge synthetic L(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/p7;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->d0(Lcom/google/android/gms/internal/play_billing/p7;)V

    return-void
.end method

.method public static bridge synthetic L0(Lcom/android/billingclient/api/b;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic M(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    return-void
.end method

.method public static synthetic M0(Lcom/android/billingclient/api/b;ILcom/google/android/gms/internal/play_billing/t9;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lv7/m0;

    invoke-direct {v0, p0, p2}, Lv7/m0;-><init>(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/t9;)V

    invoke-virtual {p0, v0, p1}, Lcom/android/billingclient/api/b;->g0(Lv7/d;I)V

    const-string p0, "reconnectIfNeeded"

    return-object p0
.end method

.method public static bridge synthetic N(Lcom/android/billingclient/api/b;I)V
    .locals 3

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    const/16 v0, 0x1c

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt p1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->E:Z

    const/16 v0, 0x1b

    if-lt p1, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->D:Z

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->C:Z

    const/16 v0, 0x18

    if-lt p1, v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->B:Z

    const/16 v0, 0x17

    if-lt p1, v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->A:Z

    const/16 v0, 0x16

    if-lt p1, v0, :cond_5

    move v0, v2

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->z:Z

    const/16 v0, 0x15

    if-lt p1, v0, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    move v0, v1

    :goto_6
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->y:Z

    const/16 v0, 0x14

    if-lt p1, v0, :cond_7

    move v0, v2

    goto :goto_7

    :cond_7
    move v0, v1

    :goto_7
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->x:Z

    const/16 v0, 0x13

    if-lt p1, v0, :cond_8

    move v0, v2

    goto :goto_8

    :cond_8
    move v0, v1

    :goto_8
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->w:Z

    const/16 v0, 0x12

    if-lt p1, v0, :cond_9

    move v0, v2

    goto :goto_9

    :cond_9
    move v0, v1

    :goto_9
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->v:Z

    const/16 v0, 0x11

    if-lt p1, v0, :cond_a

    move v0, v2

    goto :goto_a

    :cond_a
    move v0, v1

    :goto_a
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->u:Z

    const/16 v0, 0x10

    if-lt p1, v0, :cond_b

    move v0, v2

    goto :goto_b

    :cond_b
    move v0, v1

    :goto_b
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->t:Z

    const/16 v0, 0xf

    if-lt p1, v0, :cond_c

    move v0, v2

    goto :goto_c

    :cond_c
    move v0, v1

    :goto_c
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->s:Z

    const/16 v0, 0xe

    if-lt p1, v0, :cond_d

    move v0, v2

    goto :goto_d

    :cond_d
    move v0, v1

    :goto_d
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->r:Z

    const/16 v0, 0xc

    if-lt p1, v0, :cond_e

    move v0, v2

    goto :goto_e

    :cond_e
    move v0, v1

    :goto_e
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->q:Z

    const/16 v0, 0x9

    if-lt p1, v0, :cond_f

    move v0, v2

    goto :goto_f

    :cond_f
    move v0, v1

    :goto_f
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->p:Z

    const/16 v0, 0x8

    if-lt p1, v0, :cond_10

    move v0, v2

    goto :goto_10

    :cond_10
    move v0, v1

    :goto_10
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->o:Z

    const/4 v0, 0x6

    if-lt p1, v0, :cond_11

    move v1, v2

    :cond_11
    iput-boolean v1, p0, Lcom/android/billingclient/api/b;->n:Z

    return-void
.end method

.method public static synthetic N0(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lv7/l1;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/android/billingclient/api/b;->j0(J)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    const/4 v2, 0x4

    invoke-virtual {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-virtual {p2}, Lv7/e;->a()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v1, p0}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, p1}, Lcom/android/billingclient/api/b;->C(Lv7/e;Lv7/f;)V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic O(Lcom/android/billingclient/api/b;I)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->f0(I)V

    return-void
.end method

.method public static synthetic O0(Lcom/android/billingclient/api/b;Lv7/j;Lcom/android/billingclient/api/f;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lv7/l1;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/android/billingclient/api/b;->j0(J)Z

    move-result v0

    const/4 v1, 0x7

    if-nez v0, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v0, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    new-instance p0, Lv7/n;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v1

    invoke-direct {p0, p2, v1}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p1, v0, p0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->u:Z

    if-nez v0, :cond_1

    const-string p2, "BillingClient"

    const-string v0, "Querying product details is not supported."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->u:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v0, Lcom/android/billingclient/api/h;->s:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    new-instance p0, Lv7/n;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v1

    invoke-direct {p0, p2, v1}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p1, v0, p0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Lcom/android/billingclient/api/b;->A0(Lcom/android/billingclient/api/f;)Lv7/r0;

    move-result-object p0

    invoke-virtual {p0}, Lv7/r0;->a()I

    move-result p2

    invoke-virtual {p0}, Lv7/r0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p2

    new-instance v0, Lv7/n;

    invoke-virtual {p0}, Lv7/r0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lv7/r0;->d()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p1, p2, v0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic P(Lcom/android/billingclient/api/b;I)V
    .locals 2

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/android/billingclient/api/b;->f0(I)V

    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    iget-boolean p0, p0, Lcom/android/billingclient/api/b;->y:Z

    invoke-virtual {v0, p0}, Lv7/t;->h(Z)V

    :cond_2
    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->f0(I)V

    return-void
.end method

.method public static synthetic P0(Lcom/android/billingclient/api/b;Lv7/c;Lv7/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/billingclient/api/b;->z(Lv7/c;Lv7/b;)Ljava/lang/Object;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic Q(Lcom/android/billingclient/api/b;)V
    .locals 0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->h0()V

    return-void
.end method

.method public static bridge synthetic S(Lcom/android/billingclient/api/b;J)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/billingclient/api/b;->j0(J)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic T(Lcom/android/billingclient/api/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic U(Lcom/android/billingclient/api/b;Ljava/lang/String;ZI)Lv7/x1;
    .locals 0

    const/16 p3, 0x9

    invoke-virtual {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->o0(Ljava/lang/String;ZI)Lv7/x1;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic V(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    return-void
.end method

.method public static bridge synthetic Z(Lcom/android/billingclient/api/b;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/b;->m:I

    return p0
.end method

.method public static bridge synthetic k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/android/billingclient/api/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final l0(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "CLOSED"

    return-object p0

    :cond_0
    const-string p0, "CONNECTED"

    return-object p0

    :cond_1
    const-string p0, "CONNECTING"

    return-object p0

    :cond_2
    const-string p0, "DISCONNECTED"

    return-object p0
.end method

.method public static bridge synthetic m(Lcom/android/billingclient/api/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final m0(Lcom/google/android/gms/internal/play_billing/e8;Landroid/content/Context;)V
    .locals 4

    :try_start_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    if-eqz p1, :cond_0

    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {p1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    const-wide/32 v2, 0x100000

    div-long/2addr v0, v2

    long-to-int p1, v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e8;->C(I)Lcom/google/android/gms/internal/play_billing/e8;

    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e8;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e8;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    sget-object p1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e8;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    sget-object p1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e8;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    const-string p1, "BillingClient"

    const-string v0, "Runtime error while populating device info."

    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p1, p1

    new-instance p5, Lv7/d0;

    invoke-direct {p5, p0, p3}, Lv7/d0;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    const-wide v0, 0x3fee666666666666L    # 0.95

    mul-double/2addr p1, v0

    double-to-long p1, p1

    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "BillingClient"

    const-string p2, "Async task throws exception!"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic p(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    const/4 v2, 0x4

    invoke-virtual {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-virtual {p2}, Lv7/e;->a()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v1, p0}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic q(Lcom/android/billingclient/api/b;Lv7/l;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    const/16 v2, 0x9

    invoke-virtual {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p0

    invoke-interface {p1, v1, p0}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic r(Lcom/android/billingclient/api/b;Lv7/c;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    const/4 v2, 0x3

    invoke-virtual {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-interface {p1, v1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public static synthetic s(Lcom/android/billingclient/api/b;Lv7/j;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    const/4 v2, 0x7

    invoke-virtual {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    new-instance p0, Lv7/n;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p1, v1, p0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method

.method public static synthetic t(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/d;)V
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    invoke-virtual {v0}, Lv7/t;->e()Lv7/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    invoke-virtual {p0}, Lv7/t;->e()Lv7/m;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lv7/m;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    const-string p0, "BillingClient"

    const-string p1, "No valid listener is set in BroadcastManager"

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic u(Lcom/android/billingclient/api/b;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    return p0
.end method

.method public static bridge synthetic v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic w0(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/billingclient/api/b;->X(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/android/billingclient/api/b;->W(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y0(Lcom/android/billingclient/api/b;)Landroid/os/Handler;
    .locals 0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->Y()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic z0(Lcom/android/billingclient/api/b;)Lv7/t;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    return-object p0
.end method


# virtual methods
.method public final A(Lcom/android/billingclient/api/f;)Ljava/lang/String;
    .locals 1

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final A0(Lcom/android/billingclient/api/f;)Lv7/r0;
    .locals 22

    move-object/from16 v1, p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/f;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/f;->b()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v10, :cond_e

    add-int/lit8 v12, v3, 0x14

    if-le v12, v10, :cond_0

    move v4, v10

    goto :goto_1

    :cond_0
    move v4, v12

    :goto_1
    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v9, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_1

    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/android/billingclient/api/f$b;

    invoke-virtual {v7}, Lcom/android/billingclient/api/f$b;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    const-string v4, "ITEM_ID_LIST"

    invoke-virtual {v7, v4, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v13, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    const-string v3, "playBillingLibraryVersion"

    invoke-virtual {v7, v3, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v3

    :try_start_1
    iget-object v3, v1, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v4, 0x0

    if-nez v3, :cond_2

    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v3, "Service has been reset to null."

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto/16 :goto_b

    :catch_1
    move-exception v0

    goto/16 :goto_c

    :cond_2
    iget-boolean v5, v1, Lcom/android/billingclient/api/b;->w:Z

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    iget-object v5, v1, Lcom/android/billingclient/api/b;->F:Lv7/i;

    invoke-virtual {v5}, Lv7/i;->b()Z

    move-result v5

    if-eqz v5, :cond_3

    move/from16 v16, v8

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p1}, Lcom/android/billingclient/api/b;->A(Lcom/android/billingclient/api/f;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p1}, Lcom/android/billingclient/api/b;->A(Lcom/android/billingclient/api/f;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p1}, Lcom/android/billingclient/api/b;->A(Lcom/android/billingclient/api/f;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p1}, Lcom/android/billingclient/api/b;->A(Lcom/android/billingclient/api/f;)Ljava/lang/String;

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x1

    invoke-static/range {v16 .. v21}, Lcom/google/android/gms/internal/play_billing/a;->a(ZZZZZZ)Lcom/google/android/gms/internal/play_billing/a;

    move-result-object v18

    iget-boolean v5, v1, Lcom/android/billingclient/api/b;->x:Z

    if-eq v8, v5, :cond_4

    const/16 v5, 0x11

    goto :goto_4

    :cond_4
    const/16 v5, 0x14

    :goto_4
    iget-object v8, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    iget-object v14, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    iget-object v4, v1, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v20}, Lcom/google/android/gms/internal/play_billing/m0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/a;J)Landroid/os/Bundle;

    move-result-object v4

    move-object v13, v8

    move-object v8, v4

    move v4, v5

    move-object v5, v13

    const/4 v13, 0x0

    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/f;->a2(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v3, :cond_5

    sget-object v0, Lcom/android/billingclient/api/h;->B:Lcom/android/billingclient/api/d;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->S:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v3, "queryProductDetailsAsync got empty product details response."

    invoke-virtual {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_5
    const-string v4, "DETAILS_LIST"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x6

    if-nez v4, :cond_7

    const-string v0, "BillingClient"

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    const-string v2, "BillingClient"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_6

    invoke-static {v0, v2}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->x:Lcom/google/android/gms/internal/play_billing/s7;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0, v13}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_6
    invoke-static {v5, v2}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->T:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    invoke-virtual {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_7
    const-string v4, "DETAILS_LIST"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_8

    sget-object v0, Lcom/android/billingclient/api/h;->B:Lcom/android/billingclient/api/d;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->U:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v3, "queryProductDetailsAsync got null response list"

    invoke-virtual {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v8, :cond_9

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    :try_start_3
    new-instance v11, Lcom/android/billingclient/api/e;

    invoke-direct {v11, v14}, Lcom/android/billingclient/api/e;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v5, "Got product details: "

    invoke-virtual {v5, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v14, "BillingClient"

    invoke-static {v14, v5}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x6

    goto :goto_5

    :catch_2
    move-exception v0

    const-string v2, "Error trying to decode SkuDetails."

    const/4 v3, 0x6

    invoke-static {v3, v2}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->V:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v4, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_9
    const-string v4, "UNFETCHED_PRODUCT_LIST"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :try_start_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v5, :cond_d

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v8, v8, 0x1

    check-cast v11, Ljava/lang/String;

    new-instance v13, Lv7/p;

    invoke-direct {v13, v11}, Lv7/p;-><init>(Ljava/lang/String;)V

    const-string v11, "BillingClient"

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v15, "Got unfetchedProduct: "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v11, v14}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :catch_3
    move-exception v0

    goto/16 :goto_a

    :cond_a
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v3, :cond_d

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v5, v5, 0x1

    check-cast v8, Lcom/android/billingclient/api/f$b;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v11, :cond_c

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v13, v13, 0x1

    check-cast v14, Lcom/android/billingclient/api/e;

    move/from16 v18, v3

    invoke-virtual {v8}, Lcom/android/billingclient/api/f$b;->c()Ljava/lang/String;

    move-result-object v3

    move/from16 v19, v5

    invoke-virtual {v14}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v8}, Lcom/android/billingclient/api/f$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_9
    move/from16 v3, v18

    move/from16 v5, v19

    goto :goto_7

    :cond_b
    move/from16 v3, v18

    move/from16 v5, v19

    goto :goto_8

    :cond_c
    move/from16 v18, v3

    move/from16 v19, v5

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "productId"

    invoke-virtual {v8}, Lcom/android/billingclient/api/f$b;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v5, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v5, "type"

    invoke-virtual {v8}, Lcom/android/billingclient/api/f$b;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v5, "statusCode"

    const/4 v8, 0x0

    invoke-virtual {v3, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v3

    new-instance v5, Lv7/p;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lv7/p;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_9

    :cond_d
    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move v3, v12

    goto/16 :goto_0

    :goto_a
    const-string v2, "Error trying to decode SkuDetails."

    const/4 v3, 0x6

    invoke-static {v3, v2}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->V:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v4, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: "

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catch Landroid/os/DeadObjectException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_b
    sget-object v2, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->R:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :goto_c
    sget-object v2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->R:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;

    move-result-object v0

    return-object v0

    :cond_e
    const-string v3, ""

    new-instance v4, Lv7/r0;

    const/4 v8, 0x0

    invoke-direct {v4, v8, v3, v0, v2}, Lv7/r0;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v4
.end method

.method public final C(Lv7/e;Lv7/f;)V
    .locals 9

    invoke-virtual {p1}, Lv7/e;->a()Ljava/lang/String;

    move-result-object v3

    :try_start_0
    const-string p1, "BillingClient"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Consuming purchase with token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    :try_start_2
    sget-object v4, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v6, "Service has been reset to null."
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p2

    :try_start_3
    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->E(Lv7/f;Ljava/lang/String;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    move-object v7, p1

    goto/16 :goto_6

    :catch_1
    move-exception v0

    :goto_1
    move-object p1, v0

    move-object v7, p1

    goto/16 :goto_7

    :catch_2
    move-exception v0

    move-object v1, p0

    :goto_2
    move-object v2, p2

    goto :goto_0

    :catch_3
    move-exception v0

    move-object v1, p0

    :goto_3
    move-object v2, p2

    goto :goto_1

    :cond_0
    move-object v1, p0

    move-object v2, p2

    iget-boolean p1, v1, Lcom/android/billingclient/api/b;->p:Z

    if-eqz p1, :cond_2

    iget-object p1, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iget-boolean p2, v1, Lcom/android/billingclient/api/b;->p:Z

    iget-object v4, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    iget-object v5, v1, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-string v7, "9.0.0"

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    if-eqz p2, :cond_1

    invoke-static {v8, v7, v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/m0;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    :cond_1
    const/16 p2, 0x9

    invoke-interface {v0, p2, p1, v3, v8}, Lcom/google/android/gms/internal/play_billing/f;->O0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    const-string p2, "RESPONSE_CODE"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p2

    const-string v0, "BillingClient"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_2
    iget-object p1, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x3

    invoke-interface {v0, p2, p1, v3}, Lcom/google/android/gms/internal/play_billing/f;->u(ILjava/lang/String;Ljava/lang/String;)I

    move-result p2

    const-string p1, ""

    :goto_4
    invoke-static {p2, p1}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v4

    if-nez p2, :cond_3

    const-string p1, "BillingClient"

    const-string p2, "Successfully consumed purchase."

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4, v3}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->x:Lcom/google/android/gms/internal/play_billing/s7;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error consuming purchase with token. Response code: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->E(Lv7/f;Ljava/lang/String;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catch Landroid/os/DeadObjectException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catchall_0
    move-exception v0

    move-object v2, p2

    :goto_5
    move-object p2, v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw p2
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    goto :goto_3

    :goto_6
    sget-object v4, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->D:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v6, "Error consuming purchase!"

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->E(Lv7/f;Ljava/lang/String;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :goto_7
    sget-object v4, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->D:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v6, "Error consuming purchase!"

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->E(Lv7/f;Ljava/lang/String;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final D(Lv7/c;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "BillingClient"

    const-string v1, "Error in acknowledge purchase!"

    invoke-static {v0, v1, p4}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x3

    invoke-static {p4}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p3, v0, p2, p4}, Lcom/android/billingclient/api/b;->s0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public final D0()Lv7/i1;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    return-object v0
.end method

.method public final E(Lv7/f;Ljava/lang/String;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "BillingClient"

    invoke-static {v0, p5, p6}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p5, 0x4

    invoke-static {p6}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p0, p4, p5, p3, p6}, Lcom/android/billingclient/api/b;->s0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;)V

    invoke-interface {p1, p3, p2}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method

.method public final G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    new-instance v1, Lv7/a0;

    invoke-direct {v1, p0, p1}, Lv7/a0;-><init>(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method public final R(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic W(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    :try_start_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter p4
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->d(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/f;->l0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    sget-object p2, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object p3, Lcom/google/android/gms/internal/play_billing/s7;->f:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->e(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :goto_1
    sget-object p2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object p3, Lcom/google/android/gms/internal/play_billing/s7;->f:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->e(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic X(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 8

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->d(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v3, 0x3

    move-object v5, p1

    move-object v6, p2

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/play_billing/f;->e1(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    sget-object p2, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->f:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->e(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :goto_1
    sget-object p2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->f:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->e(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final Y()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method public a(Lv7/b;Lv7/c;)V
    .locals 6

    new-instance v0, Lv7/z;

    invoke-direct {v0, p0, p2, p1}, Lv7/z;-><init>(Lcom/android/billingclient/api/b;Lv7/c;Lv7/b;)V

    new-instance v3, Lv7/b0;

    invoke-direct {v3, p0, p2}, Lv7/b0;-><init>(Lcom/android/billingclient/api/b;Lv7/c;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->Y()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    const-wide/16 v1, 0x7530

    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->x()Lcom/android/billingclient/api/d;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-interface {p2, p1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    :cond_0
    return-void
.end method

.method public final a0(I)V
    .locals 2

    :try_start_0
    sget v0, Lv7/h1;->a:I

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-static {p1, v0}, Lv7/h1;->c(ILcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/p7;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->d0(Lcom/google/android/gms/internal/play_billing/p7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lv7/e;Lv7/f;)V
    .locals 6

    new-instance v0, Lv7/e0;

    invoke-direct {v0, p0, p2, p1}, Lv7/e0;-><init>(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)V

    new-instance v3, Lv7/f0;

    invoke-direct {v3, p0, p2, p1}, Lv7/f0;-><init>(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->Y()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    const-wide/16 v1, 0x7530

    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->x()Lcom/android/billingclient/api/d;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2, v0}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-virtual {p1}, Lv7/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b0(Lcom/google/android/gms/internal/play_billing/l7;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    invoke-interface {v0, p1, v1}, Lv7/i1;->k(Lcom/google/android/gms/internal/play_billing/l7;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/android/billingclient/api/d;
    .locals 3

    invoke-static {}, Lv7/l1;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/android/billingclient/api/b;->i0(J)Z

    move-result v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    sget-object p1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    return-object p1

    :cond_0
    invoke-virtual {p0, v1}, Lcom/android/billingclient/api/b;->a0(I)V

    return-object p1

    :cond_1
    sget-object v0, Lcom/android/billingclient/api/h;->a:Lcom/android/billingclient/api/d;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_12

    :sswitch_0
    const-string v0, "subscriptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->k:Z

    if-eqz p1, :cond_2

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/android/billingclient/api/h;->l:Lcom/android/billingclient/api/d;

    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->j:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_1
    const-string v0, "priceChangeConfirmation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->o:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/android/billingclient/api/h;->n:Lcom/android/billingclient/api/d;

    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->J:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_2
    const-string v0, "ooo"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->E:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_2

    :cond_4
    sget-object p1, Lcom/android/billingclient/api/h;->r:Lcom/android/billingclient/api/d;

    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->N1:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x16

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_3
    const-string v0, "nnn"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->C:Z

    if-eqz p1, :cond_5

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_3

    :cond_5
    sget-object p1, Lcom/android/billingclient/api/h;->x:Lcom/android/billingclient/api/d;

    :goto_3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->I1:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x15

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_4
    const-string v0, "mmm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->B:Z

    if-eqz p1, :cond_6

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_4

    :cond_6
    sget-object p1, Lcom/android/billingclient/api/h;->w:Lcom/android/billingclient/api/d;

    :goto_4
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->p1:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x14

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_5
    const-string v0, "lll"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->A:Z

    if-eqz p1, :cond_7

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_5

    :cond_7
    sget-object p1, Lcom/android/billingclient/api/h;->v:Lcom/android/billingclient/api/d;

    :goto_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->a1:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x13

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_6
    const-string v0, "kkk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->B:Z

    if-eqz p1, :cond_8

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_6

    :cond_8
    sget-object p1, Lcom/android/billingclient/api/h;->u:Lcom/android/billingclient/api/d;

    :goto_6
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->F0:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x12

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_7
    const-string v0, "jjj"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->y:Z

    if-eqz p1, :cond_9

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_7

    :cond_9
    sget-object p1, Lcom/android/billingclient/api/h;->D:Lcom/android/billingclient/api/d;

    :goto_7
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->o0:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0xe

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_8
    const-string v0, "iii"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->x:Z

    if-eqz p1, :cond_a

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_8

    :cond_a
    sget-object p1, Lcom/android/billingclient/api/h;->C:Lcom/android/billingclient/api/d;

    :goto_8
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->i0:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0xd

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_9
    const-string v0, "hhh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->v:Z

    if-eqz p1, :cond_b

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_9

    :cond_b
    sget-object p1, Lcom/android/billingclient/api/h;->A:Lcom/android/billingclient/api/d;

    :goto_9
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->H:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0xc

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_a
    const-string v0, "ggg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->v:Z

    if-eqz p1, :cond_c

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_a

    :cond_c
    sget-object p1, Lcom/android/billingclient/api/h;->z:Lcom/android/billingclient/api/d;

    :goto_a
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->G:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0xb

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_b
    const-string v0, "fff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->u:Z

    if-eqz p1, :cond_d

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_b

    :cond_d
    sget-object p1, Lcom/android/billingclient/api/h;->s:Lcom/android/billingclient/api/d;

    :goto_b
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->u:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_c
    const-string v0, "eee"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->t:Z

    if-eqz p1, :cond_e

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_c

    :cond_e
    sget-object p1, Lcom/android/billingclient/api/h;->p:Lcom/android/billingclient/api/d;

    :goto_c
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->j0:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x9

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_d
    const-string v0, "ddd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->r:Z

    if-eqz p1, :cond_f

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_d

    :cond_f
    sget-object p1, Lcom/android/billingclient/api/h;->q:Lcom/android/billingclient/api/d;

    :goto_d
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->v:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x7

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_e
    const-string v0, "ccc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->t:Z

    if-eqz p1, :cond_10

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_e

    :cond_10
    sget-object p1, Lcom/android/billingclient/api/h;->p:Lcom/android/billingclient/api/d;

    :goto_e
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->t:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x8

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_f
    const-string v0, "bbb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->q:Z

    if-eqz p1, :cond_11

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_f

    :cond_11
    sget-object p1, Lcom/android/billingclient/api/h;->t:Lcom/android/billingclient/api/d;

    :goto_f
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->E:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_10
    const-string v0, "aaa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->s:Z

    if-eqz p1, :cond_12

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_10

    :cond_12
    sget-object p1, Lcom/android/billingclient/api/h;->o:Lcom/android/billingclient/api/d;

    :goto_10
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->F:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x6

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :sswitch_11
    const-string v0, "subscriptionsUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->l:Z

    if-eqz p1, :cond_13

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    goto :goto_11

    :cond_13
    sget-object p1, Lcom/android/billingclient/api/h;->m:Lcom/android/billingclient/api/d;

    :goto_11
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->k:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x3

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    :cond_14
    :goto_12
    const-string v0, "BillingClient"

    const-string v1, "Unsupported feature: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/h;->y:Lcom/android/billingclient/api/d;

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->I:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_11
        0x17841 -> :sswitch_10
        0x17c22 -> :sswitch_f
        0x18003 -> :sswitch_e
        0x183e4 -> :sswitch_d
        0x187c5 -> :sswitch_c
        0x18ba6 -> :sswitch_b
        0x18f87 -> :sswitch_a
        0x19368 -> :sswitch_9
        0x19749 -> :sswitch_8
        0x19b2a -> :sswitch_7
        0x19f0b -> :sswitch_6
        0x1a2ec -> :sswitch_5
        0x1a6cd -> :sswitch_4
        0x1aaae -> :sswitch_3
        0x1ae8f -> :sswitch_2
        0xc5ff92e -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c0(Lcom/google/android/gms/internal/play_billing/l7;JZ)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    iget v2, p0, Lcom/android/billingclient/api/b;->m:I

    move-object v1, p1

    move-wide v3, p2

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lv7/i1;->b(Lcom/google/android/gms/internal/play_billing/l7;IJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->G:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result v0

    return v0
.end method

.method public final d0(Lcom/google/android/gms/internal/play_billing/p7;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    invoke-interface {v0, p1, v1}, Lv7/i1;->e(Lcom/google/android/gms/internal/play_billing/p7;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;
    .locals 23

    move-object/from16 v1, p0

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v5

    iget-object v0, v1, Lcom/android/billingclient/api/b;->f:Lv7/t;

    if-eqz v0, :cond_28

    iget-object v0, v1, Lcom/android/billingclient/api/b;->f:Lv7/t;

    invoke-virtual {v0}, Lv7/t;->e()Lv7/m;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->a()Lv7/g;

    invoke-static {}, Lv7/l1;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/android/billingclient/api/b;->i0(J)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->r0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;J)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_0
    iget-object v2, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    invoke-virtual {v0}, Lv7/p0;->g()Z

    move-result v0

    move v8, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    :cond_1
    const/4 v8, 0x0

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->l()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->m()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/play_billing/t0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lv7/g2;

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/t0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v21, v10

    check-cast v21, Lcom/android/billingclient/api/c$b;

    if-nez v9, :cond_27

    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v9

    const-string v10, "subs"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    iget-boolean v10, v1, Lcom/android/billingclient/api/b;->k:Z

    if-eqz v10, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support subscriptions."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->j:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->l:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move v7, v8

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_3
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->w()Z

    move-result v10

    if-eqz v10, :cond_4

    iget-boolean v10, v1, Lcom/android/billingclient/api/b;->n:Z

    if-nez v10, :cond_4

    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support extra params for buy intent."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->s:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->f:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move v7, v8

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x1

    if-le v10, v11, :cond_5

    iget-boolean v10, v1, Lcom/android/billingclient/api/b;->t:Z

    if-nez v10, :cond_5

    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support multi-item purchases."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->t:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->p:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move v7, v8

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_6

    iget-boolean v10, v1, Lcom/android/billingclient/api/b;->u:Z

    if-nez v10, :cond_6

    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support purchases with ProductDetails."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->u:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->s:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move v7, v8

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v12}, Lcom/android/billingclient/api/c$b;->d()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_7

    const-string v13, ":"

    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_7

    iget-boolean v12, v1, Lcom/android/billingclient/api/b;->E:Z

    if-nez v12, :cond_7

    const-string v0, "BillingClient"

    const-string v2, "Current Play Store version doesn\'t support gift code purchase."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->N1:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->r:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move v7, v8

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->f()Lcom/android/billingclient/api/d;

    move-result-object v10

    sget-object v12, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    if-eq v10, v12, :cond_9

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->e1:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v3, 0x2

    move v7, v8

    move-object v4, v10

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_9
    move v7, v8

    iget-boolean v8, v1, Lcom/android/billingclient/api/b;->n:Z

    if-eqz v8, :cond_1f

    move-object v8, v9

    iget-boolean v9, v1, Lcom/android/billingclient/api/b;->p:Z

    iget-boolean v10, v1, Lcom/android/billingclient/api/b;->w:Z

    iget-object v12, v1, Lcom/android/billingclient/api/b;->F:Lv7/i;

    invoke-virtual {v12}, Lv7/i;->a()Z

    move-result v12

    iget-object v13, v1, Lcom/android/billingclient/api/b;->F:Lv7/i;

    invoke-virtual {v13}, Lv7/i;->b()Z

    move-result v13

    move v14, v11

    move v11, v12

    move v12, v13

    iget-boolean v13, v1, Lcom/android/billingclient/api/b;->H:Z

    move v15, v14

    iget-object v14, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    move/from16 v16, v15

    iget-object v15, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    iget-object v3, v1, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    iget-object v3, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    move-wide/from16 v19, v17

    move-object/from16 v18, v3

    move/from16 v3, v16

    move-wide/from16 v16, v19

    move-wide/from16 v19, v5

    move-object v5, v8

    move-object/from16 v8, p2

    invoke-static/range {v8 .. v20}, Lcom/google/android/gms/internal/play_billing/m0;->f(Lcom/android/billingclient/api/c;ZZZZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_d

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_a

    const-string v9, "skuDetailsTokens"

    invoke-virtual {v6, v9, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_a
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v3, :cond_15

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    if-gt v10, v3, :cond_b

    const-string v0, "additionalSkus"

    invoke-virtual {v6, v0, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "additionalSkuTypes"

    invoke-virtual {v6, v0, v9}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_3

    :cond_b
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/g2;

    throw v4

    :cond_c
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/g2;

    throw v4

    :cond_d
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_11

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v14}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v15

    invoke-virtual {v15}, Lcom/android/billingclient/api/e;->h()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_e

    invoke-virtual {v15}, Lcom/android/billingclient/api/e;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v14}, Lcom/android/billingclient/api/c$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15, v3}, Lcom/android/billingclient/api/e;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_f

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    if-lez v13, :cond_10

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v3}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v3}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x1

    goto :goto_2

    :cond_11
    const-string v3, "SKU_OFFER_ID_TOKEN_LIST"

    invoke-virtual {v6, v3, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_12

    const-string v3, "autoPayBalanceThresholdList"

    invoke-virtual {v6, v3, v12}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_12
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_13

    const-string v3, "skuDetailsTokens"

    invoke-virtual {v6, v3, v9}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_13
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, "SKU_SERIALIZED_DOCID_LIST"

    invoke-virtual {v6, v3, v11}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_15

    const-string v3, "additionalSkus"

    invoke-virtual {v6, v3, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "additionalSkuTypes"

    invoke-virtual {v6, v0, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_15
    :goto_3
    const-string v0, "SKU_OFFER_ID_TOKEN_LIST"

    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->r:Z

    if-nez v0, :cond_16

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->v:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->q:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    move-wide/from16 v5, v19

    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_16
    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v0

    const-string v3, "skuPackageName"

    invoke-virtual {v6, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    goto :goto_4

    :cond_17
    const/4 v11, 0x0

    :goto_4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    const-string v0, "accountName"

    invoke-virtual {v6, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_19

    const-string v0, "BillingClient"

    const-string v3, "Activity\'s intent is null."

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_19
    const-string v3, "PROXY_PACKAGE"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1a

    const-string v3, "PROXY_PACKAGE"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "proxyPackage"

    invoke-virtual {v6, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    iget-object v3, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v8, 0x0

    invoke-virtual {v3, v0, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v3, "proxyPackageVersion"

    invoke-virtual {v6, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    const-string v0, "proxyPackageVersion"

    const-string v3, "package not found"

    invoke-virtual {v6, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    :goto_5
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->E:Z

    if-eqz v0, :cond_1b

    const/16 v0, 0x1c

    :goto_6
    move v2, v0

    goto :goto_7

    :cond_1b
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->u:Z

    if-eqz v0, :cond_1c

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    const/16 v0, 0x11

    goto :goto_6

    :cond_1c
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->s:Z

    if-eqz v0, :cond_1d

    if-eqz v11, :cond_1d

    const/16 v0, 0xf

    goto :goto_6

    :cond_1d
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->p:Z

    if-eqz v0, :cond_1e

    const/16 v0, 0x9

    goto :goto_6

    :cond_1e
    const/4 v0, 0x6

    goto :goto_6

    :goto_7
    new-instance v0, Lv7/x;

    move-object/from16 v15, p1

    move-object v14, v4

    move-object v4, v5

    move-object/from16 v3, v22

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v6}, Lv7/x;-><init>(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)V

    iget-object v12, v1, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    invoke-virtual {v1}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v13

    const-wide/16 v9, 0x1388

    const/4 v11, 0x0

    move-object v8, v0

    invoke-static/range {v8 .. v13}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_8

    :cond_1f
    move-object/from16 v15, p1

    move-object v14, v4

    move-wide/from16 v19, v5

    move-object v4, v9

    move-object/from16 v3, v22

    new-instance v8, Lv7/y;

    invoke-direct {v8, v1, v3, v4}, Lv7/y;-><init>(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v12, v1, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    invoke-virtual {v1}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v13

    const-wide/16 v9, 0x1388

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    :goto_8
    if-nez v0, :cond_20

    :try_start_2
    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->c:Lcom/android/billingclient/api/d;
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    const/4 v3, 0x2

    move-wide/from16 v5, v19

    :try_start_3
    invoke-virtual/range {v1 .. v7}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :catch_1
    move-exception v0

    goto/16 :goto_f

    :catch_2
    move-exception v0

    goto/16 :goto_10

    :catch_3
    move-exception v0

    goto/16 :goto_10

    :catch_4
    move-exception v0

    move-wide/from16 v5, v19

    goto/16 :goto_f

    :catch_5
    move-exception v0

    :goto_9
    move-wide/from16 v5, v19

    goto/16 :goto_10

    :catch_6
    move-exception v0

    goto :goto_9

    :cond_20
    move-wide/from16 v5, v19

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1388

    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    const-string v0, "BillingClient"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    const-string v3, "BillingClient"

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_26

    const-string v4, "BillingClient"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unable to buy item, Error response code: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v4

    const-string v3, "BillingClient"
    :try_end_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-nez v2, :cond_21

    :try_start_4
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_21
    const-string v0, "LOG_REASON"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_b

    :cond_22
    instance-of v8, v0, Ljava/lang/Integer;

    if-eqz v8, :cond_23

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/s7;->a(I)Lcom/google/android/gms/internal/play_billing/s7;

    move-result-object v0

    goto :goto_b

    :cond_23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unexpected type for bundle log reason: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :goto_a
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v8, "Failed to get log reason from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    :goto_b
    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    if-ne v0, v3, :cond_24

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->x:Lcom/google/android/gms/internal/play_billing/s7;

    :cond_24
    move-object v3, v0

    const-string v8, "BillingClient"
    :try_end_5
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-nez v2, :cond_25

    :goto_c
    move-object v2, v3

    move-wide/from16 v19, v5

    move-object v5, v14

    goto :goto_d

    :cond_25
    :try_start_6
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v2, v3

    move-wide/from16 v19, v5

    move-object v5, v0

    goto :goto_d

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Failed to get additional log details from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_c

    :goto_d
    const/4 v3, 0x2

    move v8, v7

    move-wide/from16 v6, v19

    :try_start_8
    invoke-virtual/range {v1 .. v8}, Lcom/android/billingclient/api/b;->u0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;JZ)V
    :try_end_8
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    move-wide v5, v6

    move v7, v8

    :try_start_9
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :catch_7
    move-exception v0

    move-wide v5, v6

    move v7, v8

    goto :goto_f

    :catch_8
    move-exception v0

    :goto_e
    move-wide v5, v6

    move v7, v8

    goto :goto_10

    :catch_9
    move-exception v0

    goto :goto_e

    :cond_26
    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    invoke-direct {v0, v15, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "BUY_INTENT"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    const-string v3, "BUY_INTENT"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v2, "billingClientTransactionId"

    invoke-virtual {v0, v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v2, "wasServiceAutoReconnected"

    invoke-virtual {v0, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v15, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_9
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    sget-object v0, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    return-object v0

    :goto_f
    const-string v2, "BillingClient"

    const-string v3, "Exception while launching billing flow. Try to reconnect"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->f:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    invoke-static {v0}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    move v8, v7

    move-wide v6, v5

    move-object v5, v0

    invoke-virtual/range {v1 .. v8}, Lcom/android/billingclient/api/b;->u0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :goto_10
    const-string v2, "BillingClient"

    const-string v3, "Time out while launching billing flow. Try to reconnect"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->e:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    invoke-static {v0}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    move v8, v7

    move-wide v6, v5

    move-object v5, v0

    invoke-virtual/range {v1 .. v8}, Lcom/android/billingclient/api/b;->u0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;JZ)V

    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->G0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v4

    :cond_27
    move-object v14, v4

    throw v14

    :goto_11
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw v0

    :cond_28
    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->m:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->E:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->r0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;J)V

    return-object v4
.end method

.method public final e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V
    .locals 3

    :try_start_0
    sget v0, Lv7/h1;->a:I

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2, v0}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object p2

    if-lez p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/j7;->s(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/l7;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->b0(Lcom/google/android/gms/internal/play_billing/l7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final f0(I)V
    .locals 6

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string v1, "BillingClient"

    iget v2, p0, Lcom/android/billingclient/api/b;->b:I

    invoke-static {v2}, Lcom/android/billingclient/api/b;->l0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/android/billingclient/api/b;->l0(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Setting clientState from "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Lcom/android/billingclient/api/f;Lv7/j;)V
    .locals 6

    new-instance v0, Lv7/g0;

    invoke-direct {v0, p0, p2, p1}, Lv7/g0;-><init>(Lcom/android/billingclient/api/b;Lv7/j;Lcom/android/billingclient/api/f;)V

    new-instance v3, Lv7/h0;

    invoke-direct {v3, p0, p2}, Lv7/h0;-><init>(Lcom/android/billingclient/api/b;Lv7/j;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->Y()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    const-wide/16 v1, 0x7530

    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->x()Lcom/android/billingclient/api/d;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x7

    invoke-virtual {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    new-instance v0, Lv7/n;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p2, p1, v0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    :cond_0
    return-void
.end method

.method public final g0(Lv7/d;I)V
    .locals 7

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p2}, Lcom/android/billingclient/api/b;->w(I)Lcom/android/billingclient/api/d;

    move-result-object p2

    monitor-exit v0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v1, "BillingClient"

    const-string v2, "Client is already in the process of connecting to billing service."

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->L:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v2, Lcom/android/billingclient/api/h;->d:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    monitor-exit v0

    :goto_0
    move-object p2, v2

    goto/16 :goto_4

    :cond_1
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_2

    const-string v1, "BillingClient"

    const-string v2, "Client was already closed and can\'t be reused. Please create another instance."

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->M:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    monitor-exit v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Lcom/android/billingclient/api/b;->f0(I)V

    const/4 v1, 0x0

    if-nez p2, :cond_3

    iput-object p1, p0, Lcom/android/billingclient/api/b;->J:Lv7/d;

    move p2, v1

    :cond_3
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->h0()V

    const-string v3, "BillingClient"

    const-string v4, "Starting in-app billing setup."

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lv7/p0;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, p2, v4}, Lv7/p0;-><init>(Lcom/android/billingclient/api/b;Lv7/d;ILv7/s0;)V

    iput-object v3, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    iget-object v3, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    invoke-virtual {v3}, Lv7/p0;->f()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.android.vending"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v3, :cond_9

    iget-object v5, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    const-string v6, "com.android.vending"

    invoke-static {v5, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    if-eqz v3, :cond_8

    new-instance v6, Landroid/content/ComponentName;

    invoke-direct {v6, v5, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v3, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    const-string v5, "playBillingLibraryVersion"

    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget v5, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_4

    invoke-virtual {p0, p2}, Lcom/android/billingclient/api/b;->w(I)Lcom/android/billingclient/api/d;

    move-result-object p2

    monitor-exit v0

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_4
    iget v5, p0, Lcom/android/billingclient/api/b;->b:I

    if-eq v5, v2, :cond_5

    const-string v1, "BillingClient"

    const-string v2, "Client state no longer CONNECTING, returning service disconnected."

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->b1:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    monitor-exit v0

    goto/16 :goto_0

    :cond_5
    iget-object v5, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez p2, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v0, v6, :cond_6

    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    invoke-virtual {v0, v3, v2, v6, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    move-result v0

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v0, v3, v5, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_7

    const-string p2, "BillingClient"

    const-string v0, "Service was bonded successfully."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, v4

    goto :goto_4

    :cond_7
    const-string v0, "BillingClient"

    const-string v2, "Connection to Billing service is blocked."

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->N:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_8
    const-string v0, "BillingClient"

    const-string v2, "The device doesn\'t have valid Play Store."

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->O:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    const-string v0, "BillingClient"

    const-string v2, "The device doesn\'t have valid Play Store."

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->O:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->P:Lcom/google/android/gms/internal/play_billing/s7;

    :goto_3
    invoke-virtual {p0, v1}, Lcom/android/billingclient/api/b;->f0(I)V

    const-string v0, "BillingClient"

    const-string v1, "Billing service unavailable on device."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/h;->b:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, v3, v0, p2}, Lcom/android/billingclient/api/b;->e0(Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    move-object p2, v0

    :goto_4
    if-eqz p2, :cond_b

    invoke-interface {p1, p2}, Lv7/d;->a(Lcom/android/billingclient/api/d;)V

    :cond_b
    return-void

    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final h(Lv7/o;Lv7/l;)V
    .locals 7

    invoke-virtual {p1}, Lv7/o;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv7/o;->a()Z

    move-result p1

    new-instance v1, Lv7/j0;

    invoke-direct {v1, p0, p2, v0, p1}, Lv7/j0;-><init>(Lcom/android/billingclient/api/b;Lv7/l;Ljava/lang/String;Z)V

    new-instance v4, Lv7/w;

    invoke-direct {v4, p0, p2}, Lv7/w;-><init>(Lcom/android/billingclient/api/b;Lv7/l;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->Y()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    const-wide/16 v2, 0x7530

    invoke-static/range {v1 .. v6}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->x()Lcom/android/billingclient/api/d;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    const/16 v1, 0x9

    invoke-virtual {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 5

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_3
    const-string v3, "BillingClient"

    const-string v4, "There was an exception while unbinding service!"

    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    goto :goto_0

    :catchall_2
    move-exception v2

    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    throw v2

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public i(Lv7/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/android/billingclient/api/b;->g0(Lv7/d;I)V

    return-void
.end method

.method public final i0(J)Z
    .locals 3

    const-string v0, "BillingClient"

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v1, v2, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/android/billingclient/api/b;->y(I)Lcom/google/android/gms/internal/play_billing/i2;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, p2, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/d;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reconnection succeeded with result: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reconnection failed with result: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    instance-of p2, p1, Ljava/lang/InterruptedException;

    if-eqz p2, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    const-string p2, "Error during reconnection attempt: "

    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result p1

    return p1
.end method

.method public final j(Landroid/content/Context;Lv7/m;Lv7/i;Lv7/c0;Ljava/lang/String;Lv7/i1;Lcom/android/billingclient/api/a$a;)V
    .locals 12

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    const-string v3, "BillingClient"

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h8;->L()Lcom/google/android/gms/internal/play_billing/e8;

    move-result-object v4

    move-object/from16 v0, p5

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->v(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/e8;->r(J)Lcom/google/android/gms/internal/play_billing/e8;

    iget-boolean v0, v2, Lcom/android/billingclient/api/a$a;->j:Z

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->D(Z)Lcom/google/android/gms/internal/play_billing/e8;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->o(I)Lcom/google/android/gms/internal/play_billing/e8;

    const-wide/32 v5, 0x365f4650

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/e8;->t(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-static {v4, p1}, Lcom/android/billingclient/api/b;->m0(Lcom/google/android/gms/internal/play_billing/e8;Landroid/content/Context;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v5, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->p(I)Lcom/google/android/gms/internal/play_billing/e8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v5, "Error getting app version code."

    invoke-static {v3, v5, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-eqz v1, :cond_1

    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/h8;

    new-instance v4, Lv7/m1;

    invoke-direct {v4, v0, v1}, Lv7/m1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/h8;)V

    iput-object v4, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    :goto_1
    if-nez p2, :cond_2

    const-string v0, "Billing client should have a valid listener but the provided is null."

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    new-instance v4, Lv7/t;

    iget-object v5, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    const/4 v10, 0x0

    iget-object v11, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    move-object/from16 v8, p4

    invoke-direct/range {v4 .. v11}, Lv7/t;-><init>(Landroid/content/Context;Lv7/m;Lv7/p1;Lv7/c0;Lv7/q;Lv7/h;Lv7/i1;)V

    iput-object v4, p0, Lcom/android/billingclient/api/b;->f:Lv7/t;

    iput-object p3, p0, Lcom/android/billingclient/api/b;->F:Lv7/i;

    if-eqz p4, :cond_3

    const/4 p1, 0x1

    :cond_3
    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->H:Z

    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    iget-boolean p1, v2, Lcom/android/billingclient/api/a$a;->j:Z

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->G:Z

    return-void
.end method

.method public final j0(J)Z
    .locals 13

    iget-object v0, p0, Lcom/android/billingclient/api/b;->M:Lcom/google/android/gms/internal/play_billing/c0;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/z;->b(Lcom/google/android/gms/internal/play_billing/c0;)Lcom/google/android/gms/internal/play_billing/z;

    move-result-object v1

    invoke-static {}, Lv7/l1;->a()I

    move-result v2

    const/4 v0, 0x1

    move-wide v4, p1

    move v3, v0

    :goto_0
    const-string v6, "BillingClient"

    if-gt v3, v2, :cond_5

    const-wide/16 v7, 0x0

    :try_start_0
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    cmp-long v0, v4, v7

    if-gtz v0, :cond_0

    const-string v0, "No time remaining for reconnection attempt."

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result p1

    return p1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v3}, Lcom/android/billingclient/api/b;->y(I)Lcom/google/android/gms/internal/play_billing/i2;

    move-result-object v0

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v9}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/d;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Reconnection succeeded with result: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Reconnection failed with result: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    instance-of v4, v0, Ljava/lang/InterruptedException;

    if-eqz v4, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    const-string v4, "Error during reconnection attempt: "

    invoke-static {v6, v4, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/z;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    sub-long v4, p1, v4

    add-int/lit8 v9, v3, -0x1

    int-to-double v9, v9

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    double-to-long v9, v9

    const-wide/16 v11, 0x3e8

    mul-long/2addr v9, v11

    cmp-long v11, v4, v9

    if-gez v11, :cond_3

    const-string p1, "Reconnection failed due to timeout limit reached."

    invoke-static {v6, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result p1

    return p1

    :cond_3
    if-ge v3, v2, :cond_4

    cmp-long v7, v9, v7

    if-lez v7, :cond_4

    :try_start_1
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/z;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    sub-long v4, p1, v4

    goto :goto_3

    :catch_1
    move-exception v0

    move-object p1, v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    const-string p2, "Error sleeping during reconnection attempt: "

    invoke-static {v6, p2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string p1, "Max retries reached."

    invoke-static {v6, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result p1

    return p1
.end method

.method public final k0()Z
    .locals 4

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/b;->j:Lv7/p0;

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v3

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final declared-synchronized n()Ljava/util/concurrent/ExecutorService;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->K:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/m0;->a:I

    new-instance v1, Lv7/i0;

    invoke-direct {v1, p0}, Lv7/i0;-><init>(Lcom/android/billingclient/api/b;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->K:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->K:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;
    .locals 1

    const/16 p1, 0x9

    invoke-static {p5}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p3, p1, p2, v0}, Lcom/android/billingclient/api/b;->s0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;)V

    const-string p1, "BillingClient"

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lv7/x1;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lv7/x1;-><init>(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-object p1
.end method

.method public final o0(Ljava/lang/String;ZI)Lv7/x1;
    .locals 16

    move-object/from16 v1, p0

    const-string v0, "Querying owned items, item type: "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "BillingClient"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->p:Z

    iget-boolean v3, v1, Lcom/android/billingclient/api/b;->w:Z

    iget-object v4, v1, Lcom/android/billingclient/api/b;->F:Lv7/i;

    invoke-virtual {v4}, Lv7/i;->a()Z

    move-result v4

    iget-object v5, v1, Lcom/android/billingclient/api/b;->F:Lv7/i;

    invoke-virtual {v5}, Lv7/i;->b()Z

    move-result v5

    iget-object v6, v1, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const-string v8, "9.0.0"

    iget-object v9, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    invoke-static {v13, v8, v9, v6, v7}, Lcom/google/android/gms/internal/play_billing/m0;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    const/4 v6, 0x1

    if-eqz v2, :cond_0

    if-eqz v4, :cond_0

    const-string v2, "enablePendingPurchases"

    invoke-virtual {v13, v2, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    if-eqz v3, :cond_1

    if-eqz v5, :cond_1

    const-string v2, "enablePendingPurchaseForSubscriptions"

    invoke-virtual {v13, v2, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_1
    const/4 v2, 0x0

    if-eqz p2, :cond_2

    const-string v3, "includeSuspendedSubscriptions"

    invoke-virtual {v13, v3, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_2
    move-object v12, v2

    :goto_0
    :try_start_0
    iget-object v2, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v8, v1, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v8, :cond_3

    :try_start_2
    sget-object v3, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v5, "Service has been reset to null"

    const/4 v6, 0x0

    const/16 v2, 0x9

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v6, v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v6, v0

    goto/16 :goto_9

    :cond_3
    if-eqz p2, :cond_4

    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->C:Z

    if-nez v2, :cond_4

    sget-object v3, Lcom/android/billingclient/api/h;->x:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->I1:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v5, "Include suspended subscriptions is not supported"

    const/4 v6, 0x0

    const/16 v2, 0x9

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0

    :cond_4
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->p:Z

    const/16 v3, 0x9

    if-nez v2, :cond_5

    iget-object v2, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x3

    move-object/from16 v11, p1

    invoke-interface {v8, v4, v2, v11, v12}, Lcom/google/android/gms/internal/play_billing/f;->Y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_3

    :cond_5
    move-object/from16 v11, p1

    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->C:Z

    if-eqz v2, :cond_6

    const/16 v2, 0x1a

    :goto_1
    move v9, v2

    goto :goto_2

    :cond_6
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->B:Z

    if-eqz v2, :cond_7

    const/16 v2, 0x18

    goto :goto_1

    :cond_7
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->w:Z

    if-eqz v2, :cond_8

    const/16 v2, 0x13

    goto :goto_1

    :cond_8
    move v9, v3

    :goto_2
    iget-object v2, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/f;->u0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sget-object v4, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    const-string v5, "getPurchase()"

    const-string v7, "BillingClient"

    if-nez v2, :cond_9

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "%s got null owned items list"

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->c0:Lcom/google/android/gms/internal/play_billing/s7;

    :goto_4
    move-object v9, v4

    goto/16 :goto_6

    :cond_9
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/m0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v8

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/android/billingclient/api/d;->d()Lcom/android/billingclient/api/d$a;

    move-result-object v10

    invoke-virtual {v10, v8}, Lcom/android/billingclient/api/d$a;->d(I)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v10, v9}, Lcom/android/billingclient/api/d$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v10}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object v9

    if-eqz v8, :cond_a

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v8}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "%s failed. Response code: %s"

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->x:Lcom/google/android/gms/internal/play_billing/s7;

    goto/16 :goto_6

    :cond_a
    const-string v8, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_f

    const-string v8, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_f

    const-string v8, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_5

    :cond_b
    const-string v8, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v9, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string v10, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    if-nez v8, :cond_c

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Bundle returned from %s contains null SKUs list."

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->e0:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_4

    :cond_c
    if-nez v9, :cond_d

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Bundle returned from %s contains null purchases list."

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->f0:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_4

    :cond_d
    if-nez v10, :cond_e

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Bundle returned from %s contains null signatures list."

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->g0:Lcom/google/android/gms/internal/play_billing/s7;

    goto/16 :goto_4

    :cond_e
    sget-object v9, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_6

    :cond_f
    :goto_5
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Bundle returned from %s doesn\'t contain required fields."

    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/play_billing/s7;->d0:Lcom/google/android/gms/internal/play_billing/s7;

    goto/16 :goto_4

    :goto_6
    sget-object v7, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    if-eq v9, v7, :cond_10

    move-object v4, v5

    const-string v5, "Purchase bundle invalid"

    const/4 v6, 0x0

    const/16 v2, 0x9

    move-object v3, v9

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0

    :cond_10
    move-object v5, v4

    const-string v4, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    const-string v7, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const-string v8, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const/4 v9, 0x0

    move v10, v9

    :goto_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v9, v11, :cond_12

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "Sku is owned: "

    const-string v6, "BillingClient"

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v6, v14}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    new-instance v6, Lv7/k;

    invoke-direct {v6, v11, v12}, Lv7/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v11, v1, Lcom/android/billingclient/api/b;->I:Lcom/google/android/gms/internal/play_billing/s0;

    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    invoke-virtual {v6}, Lv7/k;->g()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_11

    const-string v10, "BillingClient"

    const-string v11, "BUG: empty/null token!"

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x1

    :cond_11
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    const/4 v6, 0x1

    goto :goto_7

    :catch_2
    move-exception v0

    move-object v6, v0

    sget-object v3, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->Z:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v5, "Got an exception trying to decode the purchase!"

    const/16 v2, 0x9

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0

    :cond_12
    if-eqz v10, :cond_13

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->A:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v1, v4, v3, v5}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    :cond_13
    const-string v3, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Continuation token: "

    const-string v4, "BillingClient"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_14

    new-instance v2, Lv7/x1;

    sget-object v3, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    invoke-direct {v2, v3, v0}, Lv7/x1;-><init>(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-object v2

    :cond_14
    const/4 v6, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_8
    sget-object v3, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->a0:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v5, "Got exception trying to get purchases try to reconnect"

    const/16 v2, 0x9

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0

    :goto_9
    sget-object v3, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->a0:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v5, "Got exception trying to get purchases try to reconnect"

    const/16 v2, 0x9

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/android/billingclient/api/b;->n0(ILcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/x1;

    move-result-object v0

    return-object v0
.end method

.method public final p0(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;I)V
    .locals 7

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Unable to create logging payload"

    const-string v3, "BillingLogger"

    const/4 v4, 0x5

    if-eqz v0, :cond_0

    sget v0, Lv7/h1;->a:I

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l7;->E()Lcom/google/android/gms/internal/play_billing/j7;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v5

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/play_billing/q7;->t(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/play_billing/q7;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v5, p2}, Lcom/google/android/gms/internal/play_billing/q7;->s(Lcom/google/android/gms/internal/play_billing/s7;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/play_billing/j7;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/play_billing/j7;->t(I)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o8;->B()Lcom/google/android/gms/internal/play_billing/l8;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/l8;->o(I)Lcom/google/android/gms/internal/play_billing/l8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/o8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/j7;->q(Lcom/google/android/gms/internal/play_billing/o8;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/l7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {p0, v1}, Lcom/android/billingclient/api/b;->b0(Lcom/google/android/gms/internal/play_billing/l7;)V

    return-void

    :cond_0
    sget p1, Lv7/h1;->a:I

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p7;->C()Lcom/google/android/gms/internal/play_billing/n7;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/play_billing/n7;->s(I)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o8;->B()Lcom/google/android/gms/internal/play_billing/l8;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/l8;->o(I)Lcom/google/android/gms/internal/play_billing/l8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/o8;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/n7;->p(Lcom/google/android/gms/internal/play_billing/o8;)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p7;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, p1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p0, v1}, Lcom/android/billingclient/api/b;->d0(Lcom/google/android/gms/internal/play_billing/p7;)V

    return-void
.end method

.method public final q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V
    .locals 2

    :try_start_0
    sget v0, Lv7/h1;->a:I

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    const/4 v1, 0x0

    invoke-static {p1, p2, p3, v1, v0}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->b0(Lcom/google/android/gms/internal/play_billing/l7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final r0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;J)V
    .locals 4

    const-string p2, "Unable to log."

    const-string v0, "BillingClient"

    :try_start_0
    sget v1, Lv7/h1;->a:I

    sget-object v1, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, p3, v3, v1}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p3, p0, Lcom/android/billingclient/api/b;->h:Lv7/i1;

    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    invoke-interface {p3, p1, v1, p4, p5}, Lv7/i1;->n(Lcom/google/android/gms/internal/play_billing/l7;IJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final s0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    sget v0, Lv7/h1;->a:I

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-static {p1, p2, p3, p4, v0}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->b0(Lcom/google/android/gms/internal/play_billing/l7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final t0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;JZ)V
    .locals 2

    :try_start_0
    sget p2, Lv7/h1;->a:I

    sget-object p2, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, p3, v1, p2}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p0, p1, p4, p5, p6}, Lcom/android/billingclient/api/b;->c0(Lcom/google/android/gms/internal/play_billing/l7;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final u0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;JZ)V
    .locals 1

    :try_start_0
    sget p2, Lv7/h1;->a:I

    sget-object p2, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    const/4 v0, 0x2

    invoke-static {p1, v0, p3, p4, p2}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p0, p1, p5, p6, p7}, Lcom/android/billingclient/api/b;->c0(Lcom/google/android/gms/internal/play_billing/l7;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final v(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;Ljava/lang/Exception;)Lv7/r0;
    .locals 1

    const-string v0, "BillingClient"

    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p3, 0x7

    invoke-static {p4}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p2, p3, p1, p4}, Lcom/android/billingclient/api/b;->s0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;)V

    new-instance p2, Lv7/r0;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p2, p3, p1, p4, v0}, Lv7/r0;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object p2
.end method

.method public final w(I)Lcom/android/billingclient/api/d;
    .locals 3

    const-string v0, "BillingClient"

    const-string v1, "Service connection is valid. No need to re-initialize."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p7;->C()Lcom/google/android/gms/internal/play_billing/n7;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/n7;->s(I)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/n9;->s(Z)Lcom/google/android/gms/internal/play_billing/n9;

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/n7;->r(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p7;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/b;->d0(Lcom/google/android/gms/internal/play_billing/p7;)V

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    return-object p1
.end method

.method public final x()Lcom/android/billingclient/api/d;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    filled-new-array {v1, v0}, [I

    move-result-object v0

    iget-object v2, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2

    :goto_0
    const/4 v3, 0x2

    if-ge v1, v3, :cond_1

    :try_start_0
    aget v3, v0, v1

    iget v4, p0, Lcom/android/billingclient/api/b;->b:I

    if-ne v4, v3, :cond_0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    return-object v0

    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final y(I)Lcom/google/android/gms/internal/play_billing/i2;
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->G:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lv7/v;

    invoke-direct {v0, p0, p1}, Lv7/v;-><init>(Lcom/android/billingclient/api/b;I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/y9;->a(Lcom/google/android/gms/internal/play_billing/v9;)Lcom/google/android/gms/internal/play_billing/i2;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, "BillingClient"

    const-string v0, "Already connected or not opted into auto reconnection."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/d2;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/i2;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic z(Lv7/c;Lv7/b;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lv7/l1;->b()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/android/billingclient/api/b;->j0(J)Z

    move-result v1

    const/4 v2, 0x3

    if-nez v1, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, p2, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-interface {p1, v1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto/16 :goto_1

    :catch_1
    move-exception p2

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lv7/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p2, "BillingClient"

    const-string v1, "Please provide a valid purchase token."

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->A:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->g:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, p2, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-interface {p1, v1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Lcom/android/billingclient/api/b;->p:Z

    if-nez v1, :cond_2

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->B:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->a:Lcom/android/billingclient/api/d;

    invoke-virtual {p0, p2, v2, v1}, Lcom/android/billingclient/api/b;->q0(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    invoke-interface {p1, v1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_3

    :try_start_2
    sget-object p2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/android/billingclient/api/b;->D(Lv7/c;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/Exception;)V

    :goto_0
    return-object v0

    :cond_3
    iget-object v1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lv7/b;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v3, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/android/billingclient/api/b;->L:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sget v6, Lcom/google/android/gms/internal/play_billing/m0;->a:I

    const-string v6, "9.0.0"

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-static {v7, v6, v3, v4, v5}, Lcom/google/android/gms/internal/play_billing/m0;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    const/16 v3, 0x9

    invoke-interface {v2, v3, v1, p2, v7}, Lcom/google/android/gms/internal/play_billing/f;->o2(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v1, "BillingClient"

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/play_billing/m0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v1

    const-string v2, "BillingClient"

    invoke-static {p2, v2}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p2

    invoke-interface {p1, p2}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    return-object v0

    :catchall_0
    move-exception p2

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v1, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->C:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p0, p1, v1, v2, p2}, Lcom/android/billingclient/api/b;->D(Lv7/c;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/Exception;)V

    return-object v0

    :goto_2
    sget-object v1, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/s7;->C:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p0, p1, v1, v2, p2}, Lcom/android/billingclient/api/b;->D(Lv7/c;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/Exception;)V

    return-object v0
.end method
