.class public final Ln9/y0;
.super Ln9/l0;
.source "SourceFile"


# instance fields
.field public final g:Landroid/os/IBinder;

.field public final synthetic h:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/y0;->h:Ln9/c;

    invoke-direct {p0, p1, p2, p4}, Ln9/l0;-><init>(Ln9/c;ILandroid/os/Bundle;)V

    iput-object p3, p0, Ln9/y0;->g:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 7

    const-string v0, "GmsClient"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Ln9/y0;->g:Landroid/os/IBinder;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Landroid/os/IBinder;

    invoke-interface {v2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Ln9/y0;->h:Ln9/c;

    invoke-virtual {v3}, Ln9/c;->getServiceDescriptor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ln9/c;->getServiceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v4, v4, 0x22

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v4, v5

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "service descriptor mismatch: "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " vs. "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    iget-object v0, p0, Ln9/y0;->g:Landroid/os/IBinder;

    invoke-virtual {v3, v0}, Ln9/c;->createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v2, 0x2

    const/4 v4, 0x4

    invoke-virtual {v3, v2, v4, v0}, Ln9/c;->zze(IILandroid/os/IInterface;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x3

    invoke-virtual {v3, v2, v4, v0}, Ln9/c;->zze(IILandroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ln9/c;->zzn(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v3}, Ln9/c;->zzk()Ln9/c$a;

    move-result-object v0

    invoke-virtual {v3}, Ln9/c;->getConnectionHint()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Ln9/c;->zzk()Ln9/c$a;

    move-result-object v0

    invoke-interface {v0, v1}, Ln9/c$a;->onConnected(Landroid/os/Bundle;)V

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    return v1

    :catch_0
    const-string v2, "service probably died"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Ln9/y0;->h:Ln9/c;

    invoke-virtual {v0}, Ln9/c;->zzl()Ln9/c$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ln9/c;->zzl()Ln9/c$b;

    move-result-object v1

    invoke-interface {v1, p1}, Ln9/c$b;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    invoke-virtual {v0, p1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
