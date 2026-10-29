.class public Lae/z;
.super Lbe/l0;
.source "SourceFile"


# instance fields
.field public final a:Lsb/k;

.field public final synthetic b:Lae/a0;


# direct methods
.method public constructor <init>(Lae/a0;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Lae/z;->b:Lae/a0;

    invoke-direct {p0}, Lbe/l0;-><init>()V

    iput-object p2, p0, Lae/z;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public R0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredUninstall"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final Z(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lae/z;->b:Lae/a0;

    iget-object p2, p2, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p2, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onCompleteInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final b0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSplitsForAppUpdate"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public d1(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredLanguageInstall"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final h0(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Lae/z;->b:Lae/a0;

    iget-object v0, v0, Lae/a0;->b:Lbe/g;

    iget-object v1, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {v0, v1}, Lbe/g;->u(Lsb/k;)V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, Lbe/q1;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    new-instance v1, Lae/a;

    invoke-direct {v1, p1}, Lae/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public i(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lae/z;->b:Lae/a0;

    iget-object p2, p2, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p2, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onCancelInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredLanguageUninstall"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public k0(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lae/z;->b:Lae/a0;

    iget-object p2, p2, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p2, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onStartInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final q0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteInstallForAppUpdate"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public r(Ljava/util/List;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSessionStates"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public t1(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lae/z;->b:Lae/a0;

    iget-object p1, p1, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredInstall"

    invoke-virtual {p1, v1, v0}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public v0(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lae/z;->b:Lae/a0;

    iget-object p2, p2, Lae/a0;->b:Lbe/g;

    iget-object v0, p0, Lae/z;->a:Lsb/k;

    invoke-virtual {p2, v0}, Lbe/g;->u(Lsb/k;)V

    invoke-static {}, Lae/a0;->f()Lbe/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onGetSession(%d)"

    invoke-virtual {p2, v0, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
