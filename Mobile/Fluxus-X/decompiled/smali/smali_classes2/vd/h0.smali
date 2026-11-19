.class public final Lvd/h0;
.super Lvd/m0;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lvd/c$d;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ltb/k;

.field public final synthetic g:Lvd/n0;


# direct methods
.method public constructor <init>(Lvd/n0;Ltb/k;ILvd/c$d;JJLtb/k;)V
    .locals 0

    iput-object p4, p0, Lvd/h0;->c:Lvd/c$d;

    iput-wide p5, p0, Lvd/h0;->d:J

    iput-wide p7, p0, Lvd/h0;->e:J

    iput-object p9, p0, Lvd/h0;->f:Ltb/k;

    iput-object p1, p0, Lvd/h0;->g:Lvd/n0;

    invoke-direct {p0, p1, p2}, Lvd/m0;-><init>(Lvd/n0;Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 10

    iget-object v0, p0, Lvd/h0;->g:Lvd/n0;

    invoke-static {v0}, Lvd/n0;->j(Lvd/n0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lvd/b;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v1}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lvd/m0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvd/h0;->g:Lvd/n0;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lvd/n0;->i(Lvd/n0;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lvd/b;

    const/16 v2, -0xe

    invoke-direct {v0, v2, v1}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lvd/m0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v3, p0, Lvd/h0;->g:Lvd/n0;

    iget-object v0, v3, Lvd/n0;->f:Lge/f;

    invoke-virtual {v0}, Lge/f;->e()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lge/l0;

    iget-object v4, p0, Lvd/h0;->c:Lvd/c$d;

    iget-wide v5, p0, Lvd/h0;->d:J

    iget-wide v7, p0, Lvd/h0;->e:J

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lvd/n0;->a(Lvd/n0;Lvd/c$d;JJI)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Lvd/k0;

    iget-object v3, p0, Lvd/h0;->g:Lvd/n0;

    iget-object v4, p0, Lvd/h0;->f:Ltb/k;

    iget-wide v5, p0, Lvd/h0;->d:J

    invoke-direct {v2, v3, v4, v5, v6}, Lvd/k0;-><init>(Lvd/n0;Ltb/k;J)V

    invoke-interface {v0, v1, v2}, Lge/l0;->p0(Landroid/os/Bundle;Lge/n0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvd/h0;->g:Lvd/n0;

    iget-object v2, p0, Lvd/h0;->c:Lvd/c$d;

    invoke-static {v1}, Lvd/n0;->g(Lvd/n0;)Lge/t0;

    move-result-object v1

    invoke-virtual {v2}, Lvd/c$d;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lvd/h0;->c:Lvd/c$d;

    invoke-virtual {v3}, Lvd/c$d;->c()Ljava/util/Set;

    move-result-object v3

    iget-wide v4, p0, Lvd/h0;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "requestExpressIntegrityToken(%s, %s, %s)"

    invoke-virtual {v1, v0, v3, v2}, Lge/t0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lvd/h0;->f:Ltb/k;

    new-instance v2, Lvd/b;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
