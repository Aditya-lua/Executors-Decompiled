.class public Lus/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/e$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lus/j;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/widget/TextView$BufferType;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lus/f;->b:Ljava/util/List;

    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    iput-object v0, p0, Lus/f;->c:Landroid/widget/TextView$BufferType;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lus/f;->d:Z

    iput-object p1, p0, Lus/f;->a:Landroid/content/Context;

    return-void
.end method

.method public static b(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lus/j;",
            ">;)",
            "Ljava/util/List<",
            "Lus/j;",
            ">;"
        }
    .end annotation

    new-instance v0, Lus/q;

    invoke-direct {v0, p0}, Lus/q;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lus/q;->b()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lus/j;)Lus/e$a;
    .locals 1
    .param p1    # Lus/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/f;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public build()Lus/e;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lus/f;->b:Ljava/util/List;

    invoke-static {v0}, Lus/f;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lrn/f$a;

    invoke-direct {v1}, Lrn/f$a;-><init>()V

    iget-object v2, p0, Lus/f;->a:Landroid/content/Context;

    invoke-static {v2}, Lvs/c;->i(Landroid/content/Context;)Lvs/c$a;

    move-result-object v2

    new-instance v3, Lus/g$a;

    invoke-direct {v3}, Lus/g$a;-><init>()V

    new-instance v4, Lus/o$a;

    invoke-direct {v4}, Lus/o$a;-><init>()V

    new-instance v5, Lus/l$a;

    invoke-direct {v5}, Lus/l$a;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lus/j;

    invoke-interface {v7, v1}, Lus/j;->i(Lrn/f$a;)V

    invoke-interface {v7, v2}, Lus/j;->k(Lvs/c$a;)V

    invoke-interface {v7, v3}, Lus/j;->h(Lus/g$a;)V

    invoke-interface {v7, v4}, Lus/j;->f(Lus/m$b;)V

    invoke-interface {v7, v5}, Lus/j;->g(Lus/k$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lvs/c$a;->z()Lvs/c;

    move-result-object v2

    invoke-interface {v5}, Lus/k$a;->build()Lus/k;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Lus/g$a;->h(Lvs/c;Lus/k;)Lus/g;

    move-result-object v11

    invoke-static {v4, v11}, Lus/n;->b(Lus/m$b;Lus/g;)Lus/n;

    move-result-object v10

    new-instance v6, Lus/i;

    iget-object v7, p0, Lus/f;->c:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1}, Lrn/f$a;->k()Lrn/f;

    move-result-object v9

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    iget-boolean v13, p0, Lus/f;->d:Z

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v13}, Lus/i;-><init>(Landroid/widget/TextView$BufferType;Lus/e$b;Lrn/f;Lus/n;Lus/g;Ljava/util/List;Z)V

    return-object v6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No plugins were added to this builder. Use #usePlugin method to add them"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
