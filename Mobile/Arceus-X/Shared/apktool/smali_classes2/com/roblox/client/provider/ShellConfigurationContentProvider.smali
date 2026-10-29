.class public Lcom/roblox/client/provider/ShellConfigurationContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Landroid/content/UriMatcher;

.field public c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ldj/i;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lgh/c;

.field public e:Lgh/c$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    const-string v0, "rbx.config"

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->a:Ljava/lang/String;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "com.roblox.client"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "com.tencent.roblox"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lsg/q0;->E1:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()Lgh/c$a;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e:Lgh/c$a;

    return-object v0
.end method

.method public d()Lgh/c;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d:Lgh/c;

    return-object v0
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public final e(Ljava/lang/String;Ldj/i;)V
    .locals 1

    sget-object v0, Ldj/i$a;->a:Ldj/i$a;

    invoke-interface {p2, v0}, Ldj/i;->a(Ldj/i$a;)Lgh/a;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->f(Ljava/lang/String;Ldj/i;Lgh/a;)V

    sget-object v0, Ldj/i$a;->b:Ldj/i$a;

    invoke-interface {p2, v0}, Ldj/i;->a(Ldj/i$a;)Lgh/a;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->f(Ljava/lang/String;Ldj/i;Lgh/a;)V

    return-void
.end method

.method public final f(Ljava/lang/String;Ldj/i;Lgh/a;)V
    .locals 3

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b:Landroid/content/UriMatcher;

    iget-object v1, p3, Lgh/a;->a:Ljava/lang/String;

    iget v2, p3, Lgh/a;->b:I

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c:Landroid/util/SparseArray;

    iget p3, p3, Lgh/a;->b:I

    invoke-virtual {p1, p3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ldj/g;

    invoke-direct {v1}, Ldj/g;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    new-instance v1, Ldj/d;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ldj/d;-><init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    new-instance v1, Ldj/j;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Ldj/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    new-instance v1, Ldj/f;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Ldj/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    new-instance v1, Ldj/e;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ldj/e;-><init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    new-instance v1, Ldj/h;

    invoke-direct {v1}, Ldj/h;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ldj/i;)V

    return-void
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return-object p1
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "insert() called with uri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.config"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    iget-object v2, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj/i;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Ldj/i;->c(Landroid/net/Uri;Landroid/content/ContentValues;)V

    return-object p1

    :cond_1
    const-string p2, "No handler found for insert"

    invoke-static {v1, p2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method

.method public onCreate()Z
    .locals 3

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcj/c;

    invoke-direct {v2, v0}, Lcj/c;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e:Lgh/c$a;

    invoke-interface {v2}, Lgh/c$a;->read()Lgh/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d:Lgh/c;

    invoke-static {v0}, Lsg/a1;->K0(Lgh/c;)Z

    invoke-static {}, Lak/x;->m()Lak/x;

    move-result-object v0

    invoke-virtual {v0, v1}, Lak/x;->F(Landroid/content/Context;)V

    sget-object v0, Lth/f;->a:Lth/f;

    invoke-static {v1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {v0, v1}, Lth/f;->p(Landroid/content/SharedPreferences;)V

    invoke-static {}, Lak/x;->m()Lak/x;

    move-result-object v0

    invoke-virtual {v0}, Lak/x;->E()V

    invoke-virtual {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->g()V

    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->a()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    return-object p3

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "query() called with uri: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, "rbx.config"

    invoke-static {p4, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {p2, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result p2

    iget-object p5, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c:Landroid/util/SparseArray;

    invoke-virtual {p5, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldj/i;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Ldj/i;->b(Landroid/net/Uri;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "No handler found for query"

    invoke-static {p4, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-object p3
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method
