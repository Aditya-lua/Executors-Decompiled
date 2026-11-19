.class public Lce/z;
.super Lde/l0;
.source "SourceFile"


# instance fields
.field public final a:Ltb/k;

.field public final synthetic b:Lce/a0;


# direct methods
.method public constructor <init>(Lce/a0;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lce/z;->b:Lce/a0;

    invoke-direct {p0}, Lde/l0;-><init>()V

    iput-object p2, p0, Lce/z;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public A0(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lce/z;->b:Lce/a0;

    iget-object p2, p2, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p2, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onGetSession(%d)"

    invoke-virtual {p2, v0, p1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final V(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lce/z;->b:Lce/a0;

    iget-object p2, p2, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p2, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onCompleteInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final X(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSplitsForAppUpdate"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public Z0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredUninstall"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final g0(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Lce/z;->b:Lce/a0;

    iget-object v0, v0, Lce/a0;->b:Lde/g;

    iget-object v1, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {v0, v1}, Lde/g;->u(Ltb/k;)V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, Lde/q1;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    new-instance v1, Lce/a;

    invoke-direct {v1, p1}, Lce/a;-><init>(I)V

    invoke-virtual {v0, v1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public i(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lce/z;->b:Lce/a0;

    iget-object p2, p2, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p2, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onCancelInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredLanguageUninstall"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public j0(ILandroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lce/z;->b:Lce/a0;

    iget-object p2, p2, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p2, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "onStartInstall(%d)"

    invoke-virtual {p2, v0, p1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public m1(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredLanguageInstall"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final r0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteInstallForAppUpdate"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public s(Ljava/util/List;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSessionStates"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public z1(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lce/z;->b:Lce/a0;

    iget-object p1, p1, Lce/a0;->b:Lde/g;

    iget-object v0, p0, Lce/z;->a:Ltb/k;

    invoke-virtual {p1, v0}, Lde/g;->u(Ltb/k;)V

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeferredInstall"

    invoke-virtual {p1, v1, v0}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
