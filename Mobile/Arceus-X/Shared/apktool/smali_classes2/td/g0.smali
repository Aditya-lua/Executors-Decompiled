.class public final Ltd/g0;
.super Ltd/m0;
.source "SourceFile"


# instance fields
.field public final synthetic c:J

.field public final synthetic d:Lsb/k;

.field public final synthetic e:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;IJLsb/k;)V
    .locals 0

    iput-wide p4, p0, Ltd/g0;->c:J

    iput-object p6, p0, Ltd/g0;->d:Lsb/k;

    iput-object p1, p0, Ltd/g0;->e:Ltd/n0;

    invoke-direct {p0, p1, p2}, Ltd/m0;-><init>(Ltd/n0;Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Ltd/g0;->e:Ltd/n0;

    invoke-static {v0}, Ltd/n0;->j(Ltd/n0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Ltd/b;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v1}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Ltd/m0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Ltd/g0;->e:Ltd/n0;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ltd/n0;->i(Ltd/n0;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ltd/b;

    const/16 v2, -0xe

    invoke-direct {v0, v2, v1}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Ltd/m0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Ltd/g0;->e:Ltd/n0;

    iget-object v1, v0, Ltd/n0;->f:Lee/f;

    invoke-virtual {v1}, Lee/f;->e()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lee/l0;

    iget-wide v3, p0, Ltd/g0;->c:J

    invoke-static {v0, v3, v4, v2}, Ltd/n0;->b(Ltd/n0;JI)Landroid/os/Bundle;

    move-result-object v0

    new-instance v2, Ltd/l0;

    iget-object v3, p0, Ltd/g0;->e:Ltd/n0;

    iget-object v4, p0, Ltd/g0;->d:Lsb/k;

    invoke-direct {v2, v3, v4}, Ltd/l0;-><init>(Ltd/n0;Lsb/k;)V

    invoke-interface {v1, v0, v2}, Lee/l0;->L0(Landroid/os/Bundle;Lee/n0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Ltd/g0;->e:Ltd/n0;

    iget-wide v2, p0, Ltd/g0;->c:J

    invoke-static {v1}, Ltd/n0;->g(Ltd/n0;)Lee/t0;

    move-result-object v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "warmUpIntegrityToken(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lee/t0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Ltd/g0;->d:Lsb/k;

    new-instance v2, Ltd/b;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
