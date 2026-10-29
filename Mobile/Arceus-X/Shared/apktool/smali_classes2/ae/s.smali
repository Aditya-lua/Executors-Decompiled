.class public final Lae/s;
.super Lbe/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljava/util/Collection;

.field public final synthetic c:Ljava/util/Collection;

.field public final synthetic d:Lbe/j1;

.field public final synthetic e:Lsb/k;

.field public final synthetic f:Lae/a0;


# direct methods
.method public constructor <init>(Lae/a0;Lsb/k;Ljava/util/Collection;Ljava/util/Collection;Lbe/j1;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Lae/s;->f:Lae/a0;

    iput-object p3, p0, Lae/s;->b:Ljava/util/Collection;

    iput-object p4, p0, Lae/s;->c:Ljava/util/Collection;

    iput-object p5, p0, Lae/s;->d:Lbe/j1;

    iput-object p6, p0, Lae/s;->e:Lsb/k;

    invoke-direct {p0, p2}, Lbe/r1;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 7

    iget-object v0, p0, Lae/s;->b:Ljava/util/Collection;

    invoke-static {v0}, Lae/a0;->i(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lae/s;->c:Ljava/util/Collection;

    invoke-static {v1}, Lae/a0;->h(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :try_start_0
    iget-object v1, p0, Lae/s;->d:Lbe/j1;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lbe/j1;->b(I)V

    iget-object v1, p0, Lae/s;->f:Lae/a0;

    iget-object v1, v1, Lae/a0;->b:Lbe/g;

    invoke-virtual {v1}, Lbe/g;->e()Landroid/os/IInterface;

    move-result-object v1

    iget-object v2, p0, Lae/s;->f:Lae/a0;

    invoke-static {v2}, Lae/a0;->g(Lae/a0;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lae/s;->d:Lbe/j1;

    invoke-static {v3}, Lae/a0;->b(Lbe/j1;)Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lae/y;

    iget-object v5, p0, Lae/s;->f:Lae/a0;

    iget-object v6, p0, Lae/s;->e:Lsb/k;

    invoke-direct {v4, v5, v6}, Lae/y;-><init>(Lae/a0;Lsb/k;)V

    invoke-interface {v1, v2, v0, v3, v4}, Lbe/k0;->E0(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lbe/m0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object v1

    iget-object v2, p0, Lae/s;->b:Ljava/util/Collection;

    iget-object v3, p0, Lae/s;->c:Ljava/util/Collection;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "startInstall(%s,%s)"

    invoke-virtual {v1, v0, v3, v2}, Lbe/q1;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lae/s;->e:Lsb/k;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
