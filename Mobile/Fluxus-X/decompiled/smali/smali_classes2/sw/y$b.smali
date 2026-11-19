.class public final Lsw/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lmv/e$a;

.field public b:Lmv/z;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsw/h$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsw/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/concurrent/Executor;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsw/y$b;->c:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsw/y$b;->d:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lsw/y;)V
    .locals 4

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsw/y$b;->c:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsw/y$b;->d:Ljava/util/List;

    .line 7
    iget-object v0, p1, Lsw/y;->b:Lmv/e$a;

    iput-object v0, p0, Lsw/y$b;->a:Lmv/e$a;

    .line 8
    iget-object v0, p1, Lsw/y;->c:Lmv/z;

    iput-object v0, p0, Lsw/y$b;->b:Lmv/z;

    .line 9
    iget-object v0, p1, Lsw/y;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lsw/y;->e:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    iget-object v2, p0, Lsw/y$b;->c:Ljava/util/List;

    iget-object v3, p1, Lsw/y;->d:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw/h$a;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p1, Lsw/y;->f:Ljava/util/List;

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lsw/y;->g:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 13
    iget-object v2, p0, Lsw/y$b;->d:Ljava/util/List;

    iget-object v3, p1, Lsw/y;->f:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw/e$a;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 14
    :cond_1
    iget-object v0, p1, Lsw/y;->h:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lsw/y$b;->e:Ljava/util/concurrent/Executor;

    .line 15
    iget-boolean p1, p1, Lsw/y;->i:Z

    iput-boolean p1, p0, Lsw/y$b;->f:Z

    return-void
.end method


# virtual methods
.method public a(Lsw/e$a;)Lsw/y$b;
    .locals 2

    iget-object v0, p0, Lsw/y$b;->d:Ljava/util/List;

    const-string v1, "factory == null"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Lsw/h$a;)Lsw/y$b;
    .locals 2

    iget-object v0, p0, Lsw/y$b;->c:Ljava/util/List;

    const-string v1, "factory == null"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lsw/y$b;
    .locals 1

    const-string v0, "baseUrl == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmv/z;->g(Ljava/lang/String;)Lmv/z;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsw/y$b;->d(Lmv/z;)Lsw/y$b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lmv/z;)Lsw/y$b;
    .locals 3

    const-string v0, "baseUrl == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lmv/z;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lsw/y$b;->b:Lmv/z;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "baseUrl must end in /: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lsw/y;
    .locals 10

    iget-object v0, p0, Lsw/y$b;->b:Lmv/z;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsw/y$b;->a:Lmv/e$a;

    if-nez v0, :cond_0

    new-instance v0, Lmv/d0;

    invoke-direct {v0}, Lmv/d0;-><init>()V

    :cond_0
    move-object v2, v0

    iget-object v0, p0, Lsw/y$b;->e:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    sget-object v0, Lsw/t;->a:Ljava/util/concurrent/Executor;

    :cond_1
    move-object v8, v0

    sget-object v0, Lsw/t;->c:Lsw/c;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lsw/y$b;->d:Ljava/util/List;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v8}, Lsw/c;->a(Ljava/util/concurrent/Executor;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lsw/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    new-instance v4, Ljava/util/ArrayList;

    iget-object v6, p0, Lsw/y$b;->c:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v6, v5

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Lsw/b;

    invoke-direct {v6}, Lsw/b;-><init>()V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lsw/y$b;->c:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    new-instance v1, Lsw/y;

    move-object v6, v3

    iget-object v3, p0, Lsw/y$b;->b:Lmv/z;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    iget-boolean v9, p0, Lsw/y$b;->f:Z

    move-object v6, v0

    invoke-direct/range {v1 .. v9}, Lsw/y;-><init>(Lmv/e$a;Lmv/z;Ljava/util/List;ILjava/util/List;ILjava/util/concurrent/Executor;Z)V

    return-object v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Base URL required."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Lmv/e$a;)Lsw/y$b;
    .locals 1

    const-string v0, "factory == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lmv/e$a;

    iput-object p1, p0, Lsw/y$b;->a:Lmv/e$a;

    return-object p0
.end method

.method public g(Lmv/d0;)Lsw/y$b;
    .locals 1

    const-string v0, "client == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lmv/e$a;

    invoke-virtual {p0, p1}, Lsw/y$b;->f(Lmv/e$a;)Lsw/y$b;

    move-result-object p1

    return-object p1
.end method
