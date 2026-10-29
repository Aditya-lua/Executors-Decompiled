.class public Ld2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/f$a;
    }
.end annotation


# instance fields
.field public a:Ld2/d;

.field public b:Z

.field public c:Z

.field public d:Ld2/p;

.field public e:Ld2/f$a;

.field public f:I

.field public g:I

.field public h:I

.field public i:Ld2/g;

.field public j:Z

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/d;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld2/p;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld2/f;->a:Ld2/d;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ld2/f;->b:Z

    iput-boolean v1, p0, Ld2/f;->c:Z

    sget-object v2, Ld2/f$a;->a:Ld2/f$a;

    iput-object v2, p0, Ld2/f;->e:Ld2/f$a;

    const/4 v2, 0x1

    iput v2, p0, Ld2/f;->h:I

    iput-object v0, p0, Ld2/f;->i:Ld2/g;

    iput-boolean v1, p0, Ld2/f;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/f;->k:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/f;->l:Ljava/util/List;

    iput-object p1, p0, Ld2/f;->d:Ld2/p;

    return-void
.end method


# virtual methods
.method public a(Ld2/d;)V
    .locals 5

    iget-object p1, p0, Ld2/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld2/f;

    iget-boolean v0, v0, Ld2/f;->j:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Ld2/f;->c:Z

    iget-object v0, p0, Ld2/f;->a:Ld2/d;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Ld2/d;->a(Ld2/d;)V

    :cond_2
    iget-boolean v0, p0, Ld2/f;->b:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, Ld2/f;->d:Ld2/p;

    invoke-virtual {p1, p0}, Ld2/p;->a(Ld2/d;)V

    return-void

    :cond_3
    iget-object v0, p0, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld2/f;

    instance-of v4, v3, Ld2/g;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_7

    if-ne v2, p1, :cond_7

    iget-boolean p1, v1, Ld2/f;->j:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Ld2/f;->i:Ld2/g;

    if-eqz p1, :cond_6

    iget-boolean v0, p1, Ld2/f;->j:Z

    if-eqz v0, :cond_8

    iget v0, p0, Ld2/f;->h:I

    iget p1, p1, Ld2/f;->g:I

    mul-int/2addr v0, p1

    iput v0, p0, Ld2/f;->f:I

    :cond_6
    iget p1, v1, Ld2/f;->g:I

    iget v0, p0, Ld2/f;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ld2/f;->d(I)V

    :cond_7
    iget-object p1, p0, Ld2/f;->a:Ld2/d;

    if-eqz p1, :cond_8

    invoke-interface {p1, p0}, Ld2/d;->a(Ld2/d;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public b(Ld2/d;)V
    .locals 1

    iget-object v0, p0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Ld2/f;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, Ld2/d;->a(Ld2/d;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld2/f;->j:Z

    iput v0, p0, Ld2/f;->g:I

    iput-boolean v0, p0, Ld2/f;->c:Z

    iput-boolean v0, p0, Ld2/f;->b:Z

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-boolean v0, p0, Ld2/f;->j:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld2/f;->j:Z

    iput p1, p0, Ld2/f;->g:I

    iget-object p1, p0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld2/d;

    invoke-interface {v0, v0}, Ld2/d;->a(Ld2/d;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ld2/f;->d:Ld2/p;

    iget-object v1, v1, Ld2/p;->b:Lc2/e;

    invoke-virtual {v1}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld2/f;->e:Ld2/f$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ld2/f;->j:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ld2/f;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "unresolved"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
