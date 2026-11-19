.class public final Lo9/i1;
.super Lo9/v0;
.source "SourceFile"


# instance fields
.field public final g:Landroid/os/IBinder;

.field public final synthetic h:Lo9/d;


# direct methods
.method public constructor <init>(Lo9/d;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lo9/i1;->h:Lo9/d;

    invoke-direct {p0, p1, p2, p4}, Lo9/v0;-><init>(Lo9/d;ILandroid/os/Bundle;)V

    iput-object p3, p0, Lo9/i1;->g:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 7

    const-string v0, "GmsClient"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lo9/i1;->g:Landroid/os/IBinder;

    invoke-static {v2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Landroid/os/IBinder;

    invoke-interface {v2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lo9/i1;->h:Lo9/d;

    invoke-virtual {v3}, Lo9/d;->getServiceDescriptor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lo9/d;->getServiceDescriptor()Ljava/lang/String;

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
    iget-object v0, p0, Lo9/i1;->g:Landroid/os/IBinder;

    invoke-virtual {v3, v0}, Lo9/d;->createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v2, 0x2

    const/4 v4, 0x4

    invoke-virtual {v3, v2, v4, v0}, Lo9/d;->zze(IILandroid/os/IInterface;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x3

    invoke-virtual {v3, v2, v4, v0}, Lo9/d;->zze(IILandroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo9/d;->zzn(Lk9/b;)V

    invoke-virtual {v3}, Lo9/d;->zzk()Lo9/d$a;

    move-result-object v0

    invoke-virtual {v3}, Lo9/d;->getConnectionHint()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lo9/d;->zzk()Lo9/d$a;

    move-result-object v0

    invoke-interface {v0, v1}, Lo9/d$a;->onConnected(Landroid/os/Bundle;)V

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

.method public final f(Lk9/b;)V
    .locals 2

    iget-object v0, p0, Lo9/i1;->h:Lo9/d;

    invoke-virtual {v0}, Lo9/d;->zzl()Lo9/d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lo9/d;->zzl()Lo9/d$b;

    move-result-object v1

    invoke-interface {v1, p1}, Lo9/d$b;->onConnectionFailed(Lk9/b;)V

    :cond_0
    invoke-virtual {v0, p1}, Lo9/d;->onConnectionFailed(Lk9/b;)V

    return-void
.end method
