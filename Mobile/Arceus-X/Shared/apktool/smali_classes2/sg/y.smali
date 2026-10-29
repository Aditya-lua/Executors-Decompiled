.class public Lsg/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/y$b;,
        Lsg/y$a;
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

    iput-object v1, p0, Lsg/y;->a:Ljava/lang/String;

    .line 4
    :try_start_0
    const-class v1, Lcom/roblox/client/implementation/AppImplementations;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lsg/y;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 6
    :catch_0
    const-string v1, "Failed to instantiate implementation"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :catch_1
    const-string v1, "Failed to find implementation class"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Lsg/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsg/y;-><init>()V

    return-void
.end method

.method public static h()Lsg/y;
    .locals 1

    invoke-static {}, Lsg/y$b;->a()Lsg/y;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lwh/n$a;Lwh/n$b;)Lwh/n;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/b;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/b;

    invoke-interface {v0, p1, p2}, Lxj/b;->a(Lwh/n$a;Lwh/n$b;)Lwh/n;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default DataModelNotifications"

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lwh/n;

    invoke-direct {v0, p1, p2}, Lwh/n;-><init>(Lwh/n$a;Lwh/n$b;)V

    return-object v0
.end method

.method public b()Lvh/e;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/d;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/d;

    invoke-interface {v0}, Lxj/d;->a()Lvh/e;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default GenericWebFragment"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lvh/e;

    invoke-direct {v0}, Lvh/e;-><init>()V

    return-object v0
.end method

.method public c(Landroid/content/Context;)Lzg/a;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lzg/b;

    if-eqz v1, :cond_0

    check-cast v0, Lzg/b;

    invoke-interface {v0, p1}, Lzg/b;->getRtcAudioManager(Landroid/content/Context;)Lzg/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No AudioRtcManager"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Lvi/d;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/a;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/a;

    invoke-interface {v0}, Lxj/a;->getAppsFlyerManager()Lvi/d;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No AppsFlyer"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lvi/d;

    invoke-direct {v0}, Lvi/d;-><init>()V

    return-object v0
.end method

.method public e()Lbm/r;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lhh/a;

    if-eqz v1, :cond_0

    check-cast v0, Lhh/a;

    invoke-interface {v0}, Lhh/a;->a()Lbm/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lbm/r;->y()Lbm/r;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/roblox/client/game/c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/c;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/c;

    invoke-interface {v0}, Lxj/c;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lsg/y$a;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0
.end method

.method public g()Lim/f;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lki/a;

    if-eqz v1, :cond_0

    check-cast v0, Lki/a;

    invoke-interface {v0}, Lki/a;->getIdentityProtocol()Lim/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lim/f;->z()Lim/f;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/e;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/e;

    invoke-interface {v0, p1}, Lxj/e;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Main class"

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public j(Landroid/app/Activity;)Lgj/a;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/f;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/f;

    invoke-interface {v0, p1}, Lxj/f;->a(Landroid/app/Activity;)Lgj/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "Using empty Midas"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lgj/a;

    invoke-direct {p1}, Lgj/a;-><init>()V

    return-object p1
.end method

.method public k()Lom/k;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Laj/a;

    if-eqz v1, :cond_0

    check-cast v0, Laj/a;

    invoke-interface {v0}, Laj/a;->getPermissionsProtocol()Lom/k;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lom/l;->f0()Lom/l;

    move-result-object v0

    return-object v0
.end method

.method public l()Lvk/f;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/h;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/h;

    invoke-interface {v0}, Lxj/h;->a()Lvk/f;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Provider"

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lvk/a;

    invoke-direct {v0}, Lvk/a;-><init>()V

    return-object v0
.end method

.method public m()Ljj/s;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/i;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/i;

    invoke-interface {v0}, Lxj/i;->a()Ljj/s;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No default push registrar"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public n(Lal/d;)Ljv/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal/d;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/g;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/g;

    invoke-interface {v0, p1}, Lxj/g;->a(Lal/d;)Ljv/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No default push registration call"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/j;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/j;

    invoke-interface {v0, p1}, Lxj/j;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No StartActivityIntentFactory interface implemented"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p()Lvj/a;
    .locals 2

    iget-object v0, p0, Lsg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lxj/k;

    if-eqz v1, :cond_0

    check-cast v0, Lxj/k;

    invoke-interface {v0}, Lxj/k;->a()Lvj/a;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using empty TSS"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lvj/a;

    invoke-direct {v0}, Lvj/a;-><init>()V

    return-object v0
.end method
