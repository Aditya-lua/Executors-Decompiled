.class public final Lfb/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lfb/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lfb/m;
    .locals 7

    sget-object v0, Lfb/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb/m;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lfb/p1;->a()Lfb/k1;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lfb/k1;->a(I)Lfb/k1;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lfb/k1;->b(Ljava/lang/String;)Lfb/k1;

    invoke-virtual {v1}, Lfb/k1;->c()Lfb/p1;

    move-result-object v1

    invoke-static {p0}, Lga/o;->a(Landroid/app/Application;)Lga/o;

    move-result-object v2

    new-instance v3, Lfb/b0;

    invoke-static {}, Lcom/google/android/gms/games/internal/v2/resolution/a;->a()Lcom/google/android/gms/games/internal/v2/resolution/a;

    move-result-object v4

    new-instance v5, Lfb/f0;

    new-instance v6, Lfb/n;

    invoke-direct {v6, p0, v1}, Lfb/n;-><init>(Landroid/app/Application;Lfb/p1;)V

    invoke-direct {v5, p0, v2, v6}, Lfb/f0;-><init>(Landroid/app/Application;Lga/o;Lfb/n;)V

    invoke-direct {v3, p0, v2, v4, v5}, Lfb/b0;-><init>(Landroid/app/Application;Lga/o;Lcom/google/android/gms/games/internal/v2/resolution/a;Lfb/c0;)V

    const/4 p0, 0x0

    invoke-static {v0, p0, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfb/m;

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfb/m;

    return-object p0
.end method
