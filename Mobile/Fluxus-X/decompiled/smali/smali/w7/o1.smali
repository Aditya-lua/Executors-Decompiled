.class public final Lw7/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lz7/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {p1}, Lc8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lc8/t;->c()Lc8/t;

    move-result-object p1

    sget-object v0, La8/a;->g:La8/a;

    invoke-virtual {p1, v0}, Lc8/t;->g(Lc8/f;)Lz7/i;

    move-result-object p1

    const-string v0, "PLAY_BILLING_LIBRARY"

    const-class v1, Lcom/google/android/gms/internal/play_billing/x8;

    const-string v2, "proto"

    invoke-static {v2}, Lz7/c;->b(Ljava/lang/String;)Lz7/c;

    move-result-object v2

    new-instance v3, Lw7/n1;

    invoke-direct {v3}, Lw7/n1;-><init>()V

    invoke-interface {p1, v0, v1, v2, v3}, Lz7/i;->a(Ljava/lang/String;Ljava/lang/Class;Lz7/c;Lz7/g;)Lz7/h;

    move-result-object p1

    iput-object p1, p0, Lw7/o1;->b:Lz7/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lw7/o1;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/x8;)V
    .locals 2

    iget-boolean v0, p0, Lw7/o1;->a:Z

    const-string v1, "BillingLogger"

    if-eqz v0, :cond_0

    const-string p1, "Skipping logging since initialization failed."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw7/o1;->b:Lz7/h;

    invoke-static {p1}, Lz7/d;->e(Ljava/lang/Object;)Lz7/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lz7/h;->a(Lz7/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "logging failed."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
