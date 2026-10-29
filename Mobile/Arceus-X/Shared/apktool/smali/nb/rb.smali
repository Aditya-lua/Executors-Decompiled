.class public final Lnb/rb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Z)V
    .locals 0

    iput-object p2, p0, Lnb/rb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/rb;->b:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lnb/rb;->b:Lnb/tc;

    invoke-virtual {v0}, Lnb/tc;->N()Lnb/d5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send app launch"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lnb/rb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    sget-object v5, Lnb/z4;->c1:Lnb/y4;

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v1, v6, v2}, Lnb/tc;->b0(Lnb/d5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v1, v2}, Lnb/d5;->K1(Lcom/google/android/gms/measurement/internal/zzr;)V

    iget-object v4, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->E()Lnb/n5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/n5;->v()Z

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3, v6, v5}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    invoke-virtual {v0, v1, v6, v2}, Lnb/tc;->b0(Lnb/d5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0}, Lnb/tc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lnb/rb;->b:Lnb/tc;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to send app launch to the service"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
