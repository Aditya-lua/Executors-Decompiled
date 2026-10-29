.class public final Lv7/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv7/l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/android/billingclient/api/b;


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/b;Lv7/l;Ljava/lang/String;Z)V
    .locals 0

    iput-object p2, p0, Lv7/j0;->a:Lv7/l;

    iput-object p3, p0, Lv7/j0;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lv7/j0;->c:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/j0;->d:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lv7/j0;->d:Lcom/android/billingclient/api/b;

    invoke-static {}, Lv7/l1;->b()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->S(Lcom/android/billingclient/api/b;J)Z

    move-result v1

    const/16 v2, 0x9

    if-nez v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->c:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v3, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-static {v0, v1, v2, v3}, Lcom/android/billingclient/api/b;->V(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    iget-object v0, p0, Lv7/j0;->a:Lv7/l;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lv7/j0;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v1, "BillingClient"

    const-string v3, "Please provide a valid product type."

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->Y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v3, Lcom/android/billingclient/api/h;->e:Lcom/android/billingclient/api/d;

    invoke-static {v0, v1, v2, v3}, Lcom/android/billingclient/api/b;->V(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;)V

    iget-object v0, p0, Lv7/j0;->a:Lv7/l;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    iget-boolean v3, p0, Lv7/j0;->c:Z

    invoke-static {v0, v1, v3, v2}, Lcom/android/billingclient/api/b;->U(Lcom/android/billingclient/api/b;Ljava/lang/String;ZI)Lv7/x1;

    move-result-object v0

    invoke-virtual {v0}, Lv7/x1;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv7/j0;->a:Lv7/l;

    invoke-virtual {v0}, Lv7/x1;->a()Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v0}, Lv7/x1;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lv7/j0;->a:Lv7/l;

    invoke-virtual {v0}, Lv7/x1;->a()Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lv7/l;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
