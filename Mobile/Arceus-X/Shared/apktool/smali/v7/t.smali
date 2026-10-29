.class public final Lv7/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lv7/m;

.field public final c:Lv7/i1;

.field public final d:Lv7/s;

.field public final e:Lv7/s;

.field public f:Z

.field public g:Lcom/google/android/gms/internal/play_billing/s0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv7/m;Lv7/p1;Lv7/c0;Lv7/q;Lv7/h;Lv7/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s0;->k()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object p3

    iput-object p3, p0, Lv7/t;->g:Lcom/google/android/gms/internal/play_billing/s0;

    iput-object p1, p0, Lv7/t;->a:Landroid/content/Context;

    iput-object p2, p0, Lv7/t;->b:Lv7/m;

    iput-object p7, p0, Lv7/t;->c:Lv7/i1;

    new-instance p1, Lv7/s;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lv7/s;-><init>(Lv7/t;Z)V

    iput-object p1, p0, Lv7/t;->d:Lv7/s;

    new-instance p1, Lv7/s;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lv7/s;-><init>(Lv7/t;Z)V

    iput-object p1, p0, Lv7/t;->e:Lv7/s;

    return-void
.end method

.method public static bridge synthetic a(Lv7/t;)Lv7/c0;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic b(Lv7/t;)Lv7/i1;
    .locals 0

    iget-object p0, p0, Lv7/t;->c:Lv7/i1;

    return-object p0
.end method

.method public static bridge synthetic c(Lv7/t;)Lv7/h;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic d(Lv7/t;)Lv7/m;
    .locals 0

    iget-object p0, p0, Lv7/t;->b:Lv7/m;

    return-object p0
.end method

.method public static bridge synthetic f(Lv7/t;)Lv7/q;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic g(Lv7/t;)Lcom/google/android/gms/internal/play_billing/s0;
    .locals 0

    iget-object p0, p0, Lv7/t;->g:Lcom/google/android/gms/internal/play_billing/s0;

    return-object p0
.end method


# virtual methods
.method public final e()Lv7/m;
    .locals 1

    iget-object v0, p0, Lv7/t;->b:Lv7/m;

    return-object v0
.end method

.method public final h(Z)V
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v2, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iput-boolean p1, p0, Lv7/t;->f:Z

    iget-object p1, p0, Lv7/t;->e:Lv7/s;

    iget-object v2, p0, Lv7/t;->a:Landroid/content/Context;

    invoke-virtual {p1, v2, v1}, Lv7/s;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    iget-boolean p1, p0, Lv7/t;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/t;->d:Lv7/s;

    const-string v1, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    invoke-virtual {p1, v2, v0, v1}, Lv7/s;->b(Landroid/content/Context;Landroid/content/IntentFilter;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lv7/t;->d:Lv7/s;

    invoke-virtual {p1, v2, v0}, Lv7/s;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/play_billing/s0;)V
    .locals 0

    iput-object p1, p0, Lv7/t;->g:Lcom/google/android/gms/internal/play_billing/s0;

    return-void
.end method
