.class public Lbh/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbh/y$b;,
        Lbh/y$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    const-string v0, "rbx.main"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v1, "com.roblox.client.implementation.AppImplementations"

    iput-object v1, p0, Lbh/y;->a:Ljava/lang/String;

    .line 4
    :try_start_0
    const-class v1, Lcom/roblox/client/implementation/AppImplementations;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lbh/y;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 6
    :catch_0
    const-string v1, "Failed to instantiate implementation"

    invoke-static {v0, v1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :catch_1
    const-string v1, "Failed to find implementation class"

    invoke-static {v0, v1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Lbh/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbh/y;-><init>()V

    return-void
.end method

.method public static h()Lbh/y;
    .locals 1

    invoke-static {}, Lbh/y$b;->a()Lbh/y;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lei/n$a;Lei/n$b;)Lei/n;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/b;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/b;

    invoke-interface {v0, p1, p2}, Lfk/b;->a(Lei/n$a;Lei/n$b;)Lei/n;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default DataModelNotifications"

    invoke-static {v0, v1}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lei/n;

    invoke-direct {v0, p1, p2}, Lei/n;-><init>(Lei/n$a;Lei/n$b;)V

    return-object v0
.end method

.method public b()Ldi/d;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/d;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/d;

    invoke-interface {v0}, Lfk/d;->a()Ldi/d;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default GenericWebFragment"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ldi/d;

    invoke-direct {v0}, Ldi/d;-><init>()V

    return-object v0
.end method

.method public c(Landroid/content/Context;)Lih/a;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lih/b;

    if-eqz v1, :cond_0

    check-cast v0, Lih/b;

    invoke-interface {v0, p1}, Lih/b;->getRtcAudioManager(Landroid/content/Context;)Lih/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No AudioRtcManager"

    invoke-static {p1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Ldj/d;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/a;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/a;

    invoke-interface {v0}, Lfk/a;->getAppsFlyerManager()Ldj/d;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No AppsFlyer"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ldj/d;

    invoke-direct {v0}, Ldj/d;-><init>()V

    return-object v0
.end method

.method public e()Lpm/r;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lqh/a;

    if-eqz v1, :cond_0

    check-cast v0, Lqh/a;

    invoke-interface {v0}, Lqh/a;->a()Lpm/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lpm/r;->y()Lpm/r;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/roblox/client/game/c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/c;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/c;

    invoke-interface {v0}, Lfk/c;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lbh/y$a;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0
.end method

.method public g()Lwm/f;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lsi/a;

    if-eqz v1, :cond_0

    check-cast v0, Lsi/a;

    invoke-interface {v0}, Lsi/a;->getIdentityProtocol()Lwm/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lwm/f;->z()Lwm/f;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/e;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/e;

    invoke-interface {v0, p1}, Lfk/e;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->Q1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0

    :cond_1
    const-string v0, "rbx.main"

    const-string v1, "Using default Main class"

    invoke-static {v0, v1}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public j(Landroid/app/Activity;)Loj/a;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/f;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/f;

    invoke-interface {v0, p1}, Lfk/f;->a(Landroid/app/Activity;)Loj/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "Using empty Midas"

    invoke-static {p1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Loj/a;

    invoke-direct {p1}, Loj/a;-><init>()V

    return-object p1
.end method

.method public k()Lbn/k;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lij/a;

    if-eqz v1, :cond_0

    check-cast v0, Lij/a;

    invoke-interface {v0}, Lij/a;->getPermissionsProtocol()Lbn/k;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lbn/l;->U()Lbn/l;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcl/f;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/h;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/h;

    invoke-interface {v0}, Lfk/h;->a()Lcl/f;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Provider"

    invoke-static {v0, v1}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcl/a;

    invoke-direct {v0}, Lcl/a;-><init>()V

    return-object v0
.end method

.method public m()Lrj/s;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/i;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/i;

    invoke-interface {v0}, Lfk/i;->a()Lrj/s;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No default push registrar"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public n(Lkl/d;)Lsw/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/d;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/g;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/g;

    invoke-interface {v0, p1}, Lfk/g;->a(Lkl/d;)Lsw/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No default push registration call"

    invoke-static {p1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/j;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/j;

    invoke-interface {v0, p1}, Lfk/j;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No StartActivityIntentFactory interface implemented"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p()Ldk/a;
    .locals 2

    iget-object v0, p0, Lbh/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lfk/k;

    if-eqz v1, :cond_0

    check-cast v0, Lfk/k;

    invoke-interface {v0}, Lfk/k;->a()Ldk/a;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using empty TSS"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ldk/a;

    invoke-direct {v0}, Ldk/a;-><init>()V

    return-object v0
.end method
