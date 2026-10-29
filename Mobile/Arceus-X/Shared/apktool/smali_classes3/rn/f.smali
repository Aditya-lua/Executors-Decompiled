.class public Lrn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrn/f$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lrn/d;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrn/h;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lrn/a;

.field public final i:I


# direct methods
.method public constructor <init>(Lrn/f$a;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lrn/f$a;->a(Lrn/f$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lrn/f$a;->c(Lrn/f$a;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lnn/k;->m(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lrn/f;->a:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lrn/f$a;->j(Lrn/f$a;)Lrn/d;

    move-result-object v0

    iput-object v0, p0, Lrn/f;->f:Lrn/d;

    .line 5
    invoke-static {p1}, Lrn/f$a;->i(Lrn/f$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lrn/f;->g:Ljava/util/List;

    .line 6
    invoke-static {p1}, Lrn/f$a;->e(Lrn/f$a;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lrn/f;->b:Ljava/util/List;

    .line 7
    invoke-static {p1}, Lrn/f$a;->b(Lrn/f$a;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lrn/f;->c:Ljava/util/List;

    .line 8
    invoke-static {p1}, Lrn/f$a;->g(Lrn/f$a;)Ljava/util/List;

    move-result-object v5

    iput-object v5, p0, Lrn/f;->d:Ljava/util/List;

    .line 9
    invoke-static {p1}, Lrn/f$a;->f(Lrn/f$a;)Ljava/util/Set;

    move-result-object v6

    iput-object v6, p0, Lrn/f;->e:Ljava/util/Set;

    .line 10
    invoke-static {p1}, Lrn/f$a;->d(Lrn/f$a;)Lrn/a;

    move-result-object v1

    iput-object v1, p0, Lrn/f;->h:Lrn/a;

    .line 11
    invoke-static {p1}, Lrn/f$a;->h(Lrn/f$a;)I

    move-result p1

    iput p1, p0, Lrn/f;->i:I

    .line 12
    new-instance v2, Lnn/q;

    new-instance v7, Lnn/f;

    invoke-direct {v7}, Lnn/f;-><init>()V

    invoke-direct/range {v2 .. v7}, Lnn/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lnn/f;)V

    .line 13
    invoke-interface {v0, v2}, Lrn/d;->a(Lrn/c;)Lrn/b;

    return-void
.end method

.method public synthetic constructor <init>(Lrn/f$a;Lrn/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrn/f;-><init>(Lrn/f$a;)V

    return-void
.end method


# virtual methods
.method public final a()Lnn/k;
    .locals 9

    new-instance v0, Lnn/k;

    iget-object v1, p0, Lrn/f;->a:Ljava/util/List;

    iget-object v2, p0, Lrn/f;->f:Lrn/d;

    iget-object v3, p0, Lrn/f;->b:Ljava/util/List;

    iget-object v4, p0, Lrn/f;->c:Ljava/util/List;

    iget-object v5, p0, Lrn/f;->d:Ljava/util/List;

    iget-object v6, p0, Lrn/f;->e:Ljava/util/Set;

    iget-object v7, p0, Lrn/f;->h:Lrn/a;

    iget v8, p0, Lrn/f;->i:I

    invoke-direct/range {v0 .. v8}, Lnn/k;-><init>(Ljava/util/List;Lrn/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lrn/a;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lqn/s;
    .locals 1

    const-string v0, "input must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Lrn/f;->a()Lnn/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnn/k;->u(Ljava/lang/String;)Lqn/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrn/f;->c(Lqn/s;)Lqn/s;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lqn/s;)Lqn/s;
    .locals 2

    iget-object v0, p0, Lrn/f;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrn/h;

    invoke-interface {v1, p1}, Lrn/h;->a(Lqn/s;)Lqn/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
