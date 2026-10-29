.class public Ltj/a$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/util/List<",
        "Ltj/d;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Lfv/c;

.field public b:Ltj/b;

.field public c:Ljava/util/concurrent/Executor;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfv/c;Ltj/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Ltj/a$c;->a:Lfv/c;

    iput-object p2, p0, Ltj/a$c;->b:Ltj/b;

    iput-object p3, p0, Ltj/a$c;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic a(Ltj/a$c;)Lfv/c;
    .locals 0

    iget-object p0, p0, Ltj/a$c;->a:Lfv/c;

    return-object p0
.end method

.method public static bridge synthetic b(Ltj/a$c;)Ltj/b;
    .locals 0

    iget-object p0, p0, Ltj/a$c;->b:Ltj/b;

    return-object p0
.end method

.method public static bridge synthetic c(Ltj/a$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ltj/a$c;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/util/List;Ljava/util/HashMap;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ltj/d;",
            ">;"
        }
    .end annotation

    const-string v0, "AppRouter"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    :try_start_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ltj/c;->valueOf(Ljava/lang/String;)Ltj/c;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v2, v4, :cond_1

    invoke-virtual {v3}, Ltj/c;->c()I

    move-result v4

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result v5

    if-eq v4, v5, :cond_0

    const-string p1, "Incorrect number of parameters. Stop building routes."

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ltj/a$c;->b:Ltj/b;

    invoke-virtual {v3}, Ltj/c;->b()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Ltj/a$c;->d:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Ltj/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    new-instance v4, Ltj/d;

    invoke-direct {v4, v3, p2}, Ltj/d;-><init>(Ltj/c;Ljava/util/HashMap;)V

    goto :goto_1

    :cond_1
    new-instance v4, Ltj/d;

    invoke-direct {v4, v3}, Ltj/d;-><init>(Ltj/c;)V

    :goto_1
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    const-string p1, "AppTarget not recognized. Stop building routes."

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v1
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Ltj/a$c;->e([Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public varargs e([Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltj/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltj/a$c;->b:Ltj/b;

    invoke-virtual {v0}, Ltj/b;->h()V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p0, p1}, Ltj/a$c;->i(Ljava/lang/String;)Lcom/roblox/client/routing/model/RouteModel;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "defaultActionHandler: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/roblox/client/routing/model/RouteModel;->default_action_handler:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/roblox/client/routing/model/RouteModel;->default_action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRouter"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Ltj/a$c;->n(Lcom/roblox/client/routing/model/RouteModel;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltj/a$c;->b:Ltj/b;

    invoke-virtual {v0}, Ltj/b;->b()V

    iget-object p1, p1, Lcom/roblox/client/routing/model/RouteModel;->default_action:Ljava/lang/String;

    iput-object p1, p0, Ltj/a$c;->d:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ltj/a$c;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ltj/a$c;->b:Ltj/b;

    iget-object v1, p0, Ltj/a$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltj/b;->g(Ljava/lang/String;)V

    :cond_1
    return-object p1

    :cond_2
    iget-object p1, p0, Ltj/a$c;->b:Ltj/b;

    invoke-virtual {p1}, Ltj/b;->a()V

    const-string p1, "Should be handled by Lua."

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "\\?"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    if-nez v2, :cond_2

    :goto_0
    return-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    aget-object p1, v1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public h(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "\\?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    aget-object p1, p1, v1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "&"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v3, p1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v6, p1, v5

    if-eqz v6, :cond_2

    const-string v7, "="

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    if-ne v7, v2, :cond_2

    aget-object v7, v6, v4

    aget-object v6, v6, v1

    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final i(Ljava/lang/String;)Lcom/roblox/client/routing/model/RouteModel;
    .locals 2

    :try_start_0
    const-class v0, Lcom/roblox/client/routing/model/RouteModel;

    invoke-static {p1, v0}, Lgk/n;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/routing/model/RouteModel;
    :try_end_0
    .catch Lkg/u; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "AppRouter"

    const-string v1, "Invalid json string."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ltj/a$c;->b:Ltj/b;

    invoke-virtual {v0, p1}, Ltj/b;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final j(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltj/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Ltj/a$c;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Path: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppRouter"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ltj/a$c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltj/a$c;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ActionType: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltj/a$c;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Ltj/a$c;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Actions: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0, p1}, Ltj/a$c;->h(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Ltj/a$c;->d(Ljava/util/List;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltj/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltj/a$c;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Ltj/a$c$a;

    invoke-direct {v1, p0, p1}, Ltj/a$c$a;-><init>(Ltj/a$c;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public l(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltj/d;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ltj/a$c;->k(Ljava/util/List;)V

    return-void
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lcom/roblox/client/routing/model/RouteModel;)Z
    .locals 2
    .param p1    # Lcom/roblox/client/routing/model/RouteModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p1, Lcom/roblox/client/routing/model/RouteModel;->android_default_action_handler:Ljava/lang/String;

    const-string v1, "native"

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    iget-object p1, p1, Lcom/roblox/client/routing/model/RouteModel;->default_action_handler:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ltj/a$c;->l(Ljava/util/List;)V

    return-void
.end method
