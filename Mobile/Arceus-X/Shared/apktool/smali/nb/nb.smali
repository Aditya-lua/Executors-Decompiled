.class public final Lnb/nb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzpl;

.field public final synthetic d:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzpl;)V
    .locals 0

    iput-object p2, p0, Lnb/nb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iput-boolean p3, p0, Lnb/nb;->b:Z

    iput-object p4, p0, Lnb/nb;->c:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/nb;->d:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/nb;->d:Lnb/tc;

    invoke-virtual {v0}, Lnb/tc;->N()Lnb/d5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lnb/nb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v3, p0, Lnb/nb;->b:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lnb/nb;->c:Lcom/google/android/gms/measurement/internal/zzpl;

    :goto_0
    invoke-virtual {v0, v1, v3, v2}, Lnb/tc;->b0(Lnb/d5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0}, Lnb/tc;->J()V

    return-void
.end method
