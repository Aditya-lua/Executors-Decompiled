.class public final Lgb/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lgb/p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lgb/n;
    .locals 7

    sget-object v0, Lgb/p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/n;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lgb/q1;->a()Lgb/l1;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lgb/l1;->a(I)Lgb/l1;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgb/l1;->b(Ljava/lang/String;)Lgb/l1;

    invoke-virtual {v1}, Lgb/l1;->c()Lgb/q1;

    move-result-object v1

    invoke-static {p0}, Lha/o;->a(Landroid/app/Application;)Lha/o;

    move-result-object v2

    new-instance v3, Lgb/c0;

    invoke-static {}, Lma/b;->a()Lma/b;

    move-result-object v4

    new-instance v5, Lgb/g0;

    new-instance v6, Lgb/o;

    invoke-direct {v6, p0, v1}, Lgb/o;-><init>(Landroid/app/Application;Lgb/q1;)V

    invoke-direct {v5, p0, v2, v6}, Lgb/g0;-><init>(Landroid/app/Application;Lha/o;Lgb/o;)V

    invoke-direct {v3, p0, v2, v4, v5}, Lgb/c0;-><init>(Landroid/app/Application;Lha/o;Lma/b;Lgb/d0;)V

    const/4 p0, 0x0

    invoke-static {v0, p0, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgb/n;

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgb/n;

    return-object p0
.end method
