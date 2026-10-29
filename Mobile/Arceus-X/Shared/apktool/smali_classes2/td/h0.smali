.class public final Ltd/h0;
.super Ltd/m0;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ltd/c$d;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Lsb/k;

.field public final synthetic g:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;ILtd/c$d;JJLsb/k;)V
    .locals 0

    iput-object p4, p0, Ltd/h0;->c:Ltd/c$d;

    iput-wide p5, p0, Ltd/h0;->d:J

    iput-wide p7, p0, Ltd/h0;->e:J

    iput-object p9, p0, Ltd/h0;->f:Lsb/k;

    iput-object p1, p0, Ltd/h0;->g:Ltd/n0;

    invoke-direct {p0, p1, p2}, Ltd/m0;-><init>(Ltd/n0;Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 10

    iget-object v0, p0, Ltd/h0;->g:Ltd/n0;

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
    iget-object v0, p0, Ltd/h0;->g:Ltd/n0;

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
    iget-object v3, p0, Ltd/h0;->g:Ltd/n0;

    iget-object v0, v3, Ltd/n0;->f:Lee/f;

    invoke-virtual {v0}, Lee/f;->e()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lee/l0;

    iget-object v4, p0, Ltd/h0;->c:Ltd/c$d;

    iget-wide v5, p0, Ltd/h0;->d:J

    iget-wide v7, p0, Ltd/h0;->e:J

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Ltd/n0;->a(Ltd/n0;Ltd/c$d;JJI)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Ltd/k0;

    iget-object v3, p0, Ltd/h0;->g:Ltd/n0;

    iget-object v4, p0, Ltd/h0;->f:Lsb/k;

    iget-wide v5, p0, Ltd/h0;->d:J

    invoke-direct {v2, v3, v4, v5, v6}, Ltd/k0;-><init>(Ltd/n0;Lsb/k;J)V

    invoke-interface {v0, v1, v2}, Lee/l0;->m1(Landroid/os/Bundle;Lee/n0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Ltd/h0;->g:Ltd/n0;

    iget-object v2, p0, Ltd/h0;->c:Ltd/c$d;

    invoke-static {v1}, Ltd/n0;->g(Ltd/n0;)Lee/t0;

    move-result-object v1

    invoke-virtual {v2}, Ltd/c$d;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ltd/h0;->c:Ltd/c$d;

    invoke-virtual {v3}, Ltd/c$d;->c()Ljava/util/Set;

    move-result-object v3

    iget-wide v4, p0, Ltd/h0;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "requestExpressIntegrityToken(%s, %s, %s)"

    invoke-virtual {v1, v0, v3, v2}, Lee/t0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Ltd/h0;->f:Lsb/k;

    new-instance v2, Ltd/b;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
