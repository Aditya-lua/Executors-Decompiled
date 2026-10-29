.class public Lh7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/c;
.implements Li7/a$b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li7/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ln7/t$a;

.field public final e:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo7/b;Ln7/t;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh7/u;->c:Ljava/util/List;

    invoke-virtual {p2}, Ln7/t;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh7/u;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ln7/t;->g()Z

    move-result v0

    iput-boolean v0, p0, Lh7/u;->b:Z

    invoke-virtual {p2}, Ln7/t;->f()Ln7/t$a;

    move-result-object v0

    iput-object v0, p0, Lh7/u;->d:Ln7/t$a;

    invoke-virtual {p2}, Ln7/t;->e()Lm7/b;

    move-result-object v0

    invoke-virtual {v0}, Lm7/b;->d()Li7/d;

    move-result-object v0

    iput-object v0, p0, Lh7/u;->e:Li7/a;

    invoke-virtual {p2}, Ln7/t;->b()Lm7/b;

    move-result-object v1

    invoke-virtual {v1}, Lm7/b;->d()Li7/d;

    move-result-object v1

    iput-object v1, p0, Lh7/u;->f:Li7/a;

    invoke-virtual {p2}, Ln7/t;->d()Lm7/b;

    move-result-object p2

    invoke-virtual {p2}, Lm7/b;->d()Li7/d;

    move-result-object p2

    iput-object p2, p0, Lh7/u;->g:Li7/a;

    invoke-virtual {p1, v0}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p1, v1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p1, p2}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {v0, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p0}, Li7/a;->a(Li7/a$b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lh7/u;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lh7/u;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/a$b;

    invoke-interface {v1}, Li7/a$b;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public c(Li7/a$b;)V
    .locals 1

    iget-object v0, p0, Lh7/u;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()Li7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh7/u;->f:Li7/a;

    return-object v0
.end method

.method public h()Li7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh7/u;->g:Li7/a;

    return-object v0
.end method

.method public j()Li7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh7/u;->e:Li7/a;

    return-object v0
.end method

.method public k()Ln7/t$a;
    .locals 1

    iget-object v0, p0, Lh7/u;->d:Ln7/t$a;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lh7/u;->b:Z

    return v0
.end method
