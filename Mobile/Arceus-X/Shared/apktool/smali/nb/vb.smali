.class public final Lnb/vb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzbe;

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;ZLcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzbe;Landroid/os/Bundle;)V
    .locals 0

    iput-object p3, p0, Lnb/vb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iput-boolean p4, p0, Lnb/vb;->b:Z

    iput-object p5, p0, Lnb/vb;->c:Lcom/google/android/gms/measurement/internal/zzbe;

    iput-object p6, p0, Lnb/vb;->d:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/vb;->e:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lnb/vb;->e:Lnb/tc;

    invoke-virtual {v0}, Lnb/tc;->N()Lnb/d5;

    move-result-object v1

    const-string v2, "Failed to send default event parameters to service"

    if-nez v1, :cond_0

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v3, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    sget-object v4, Lnb/z4;->c1:Lnb/y4;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lnb/vb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lnb/vb;->e:Lnb/tc;

    iget-boolean v3, p0, Lnb/vb;->b:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lnb/vb;->c:Lcom/google/android/gms/measurement/internal/zzbe;

    :goto_0
    invoke-virtual {v2, v1, v5, v0}, Lnb/tc;->b0(Lnb/d5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v3, p0, Lnb/vb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lnb/vb;->d:Landroid/os/Bundle;

    invoke-interface {v1, v4, v3}, Lnb/d5;->E1(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0}, Lnb/tc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lnb/vb;->e:Lnb/tc;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
