.class public Ldj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/i;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Landroid/content/Context;

.field public c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;


# direct methods
.method public constructor <init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.config"

    iput-object v0, p0, Ldj/d;->a:Ljava/lang/String;

    iput-object p1, p0, Ldj/d;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    iput-object p2, p0, Ldj/d;->b:Landroid/content/Context;

    return-void
.end method

.method public static synthetic d(Ldj/d;)V
    .locals 0

    invoke-virtual {p0}, Ldj/d;->i()V

    return-void
.end method

.method public static synthetic e(Ldj/d;)V
    .locals 0

    invoke-virtual {p0}, Ldj/d;->h()V

    return-void
.end method


# virtual methods
.method public a(Ldj/i$a;)Lgh/a;
    .locals 1

    sget-object v0, Ldj/i$a;->a:Ldj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lgh/a;->d:Lgh/a;

    return-object p1

    :cond_0
    sget-object v0, Ldj/i$a;->b:Ldj/i$a;

    if-ne p1, v0, :cond_1

    sget-object p1, Lgh/a;->e:Lgh/a;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    new-instance p1, Lcj/b;

    iget-object v0, p0, Ldj/d;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lgh/c;

    move-result-object v0

    invoke-direct {p1, v0}, Lcj/b;-><init>(Lgh/c;)V

    return-object p1
.end method

.method public c(Landroid/net/Uri;Landroid/content/ContentValues;)V
    .locals 4

    const-string p1, "settings_param"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "rbx.config"

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new payload:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgh/c;->l(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lgh/c$a;->b(Ljava/lang/String;)V

    :cond_0
    const-string p1, "channel_param"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new robloxChannel:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgh/c;->r(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lgh/c$a;->g(Ljava/lang/String;)V

    :cond_1
    const-string p1, "base_url_param"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new baseUrl:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgh/c;->m(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lgh/c$a;->c(Ljava/lang/String;)V

    :cond_2
    const-string p1, "user_agent_param"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "set user agent:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgh/c;->s(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lgh/c$a;->e(Ljava/lang/String;)V

    :cond_3
    const-string p1, "dev_branch"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "dev_commit"

    if-nez v0, :cond_4

    invoke-virtual {p2, v2}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set dev branch: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgh/c;->o(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lgh/c$a;->d(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set dev commit: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgh/c;->p(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object v2

    invoke-interface {v2, v0}, Lgh/c$a;->a(Ljava/lang/String;)V

    iget-object v2, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-static {v2, p1, v0}, Lnh/c;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ldj/b;

    invoke-direct {v0, p0}, Ldj/b;-><init>(Ldj/d;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_5
    const-string p1, "dev_rpc_ip_port_override"

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "set dev rpc ip and port:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ldj/d;->f()Lgh/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgh/c;->q(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldj/d;->g()Lgh/c$a;

    move-result-object p2

    invoke-interface {p2, p1}, Lgh/c$a;->f(Ljava/lang/String;)V

    iget-object p2, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-static {p2, p1}, Lsg/t;->e(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Ldj/c;

    invoke-direct {p2, p0}, Ldj/c;-><init>(Ldj/d;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p1

    invoke-virtual {p1}, Lak/k0;->v()Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    invoke-static {p1}, Lsg/a1;->P0(Z)V

    :cond_6
    return-void
.end method

.method public final f()Lgh/c;
    .locals 1

    iget-object v0, p0, Ldj/d;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lgh/c;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lgh/c$a;
    .locals 1

    iget-object v0, p0, Ldj/d;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c()Lgh/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()V
    .locals 3

    iget-object v0, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lsg/q0;->R:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final synthetic i()V
    .locals 3

    iget-object v0, p0, Ldj/d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lsg/q0;->R:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
