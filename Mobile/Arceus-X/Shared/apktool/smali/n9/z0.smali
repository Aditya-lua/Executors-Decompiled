.class public final Ln9/z0;
.super Ln9/l0;
.source "SourceFile"


# instance fields
.field public final synthetic g:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/c;ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/z0;->g:Ln9/c;

    invoke-direct {p0, p1, p2, p3}, Ln9/l0;-><init>(Ln9/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 2

    iget-object v0, p0, Ln9/z0;->g:Ln9/c;

    iget-object v0, v0, Ln9/c;->zzc:Ln9/c$c;

    sget-object v1, Lcom/google/android/gms/common/ConnectionResult;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-interface {v0, v1}, Ln9/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Ln9/z0;->g:Ln9/c;

    invoke-virtual {v0}, Ln9/c;->enableLocalFallback()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ln9/c;->zzg()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x10

    invoke-virtual {v0, p1}, Ln9/c;->zzf(I)V

    return-void

    :cond_0
    iget-object v1, v0, Ln9/c;->zzc:Ln9/c$c;

    invoke-interface {v1, p1}, Ln9/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, p1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
