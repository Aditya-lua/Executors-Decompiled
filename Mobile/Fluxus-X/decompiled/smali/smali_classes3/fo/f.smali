.class public Lfo/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfo/f$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lho/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/e;",
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

.field public final f:Lfo/d;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfo/h;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lfo/a;

.field public final i:I


# direct methods
.method public constructor <init>(Lfo/f$a;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lfo/f$a;->a(Lfo/f$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lfo/f$a;->c(Lfo/f$a;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lao/k;->m(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lfo/f;->a:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lfo/f$a;->j(Lfo/f$a;)Lfo/d;

    move-result-object v0

    iput-object v0, p0, Lfo/f;->f:Lfo/d;

    .line 5
    invoke-static {p1}, Lfo/f$a;->i(Lfo/f$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lfo/f;->g:Ljava/util/List;

    .line 6
    invoke-static {p1}, Lfo/f$a;->e(Lfo/f$a;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lfo/f;->b:Ljava/util/List;

    .line 7
    invoke-static {p1}, Lfo/f$a;->b(Lfo/f$a;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lfo/f;->c:Ljava/util/List;

    .line 8
    invoke-static {p1}, Lfo/f$a;->g(Lfo/f$a;)Ljava/util/List;

    move-result-object v5

    iput-object v5, p0, Lfo/f;->d:Ljava/util/List;

    .line 9
    invoke-static {p1}, Lfo/f$a;->f(Lfo/f$a;)Ljava/util/Set;

    move-result-object v6

    iput-object v6, p0, Lfo/f;->e:Ljava/util/Set;

    .line 10
    invoke-static {p1}, Lfo/f$a;->d(Lfo/f$a;)Lfo/a;

    move-result-object v1

    iput-object v1, p0, Lfo/f;->h:Lfo/a;

    .line 11
    invoke-static {p1}, Lfo/f$a;->h(Lfo/f$a;)I

    move-result p1

    iput p1, p0, Lfo/f;->i:I

    .line 12
    new-instance v2, Lao/q;

    new-instance v7, Lao/f;

    invoke-direct {v7}, Lao/f;-><init>()V

    invoke-direct/range {v2 .. v7}, Lao/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lao/f;)V

    .line 13
    invoke-interface {v0, v2}, Lfo/d;->a(Lfo/c;)Lfo/b;

    return-void
.end method

.method public synthetic constructor <init>(Lfo/f$a;Lfo/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lfo/f;-><init>(Lfo/f$a;)V

    return-void
.end method


# virtual methods
.method public final a()Lao/k;
    .locals 9

    new-instance v0, Lao/k;

    iget-object v1, p0, Lfo/f;->a:Ljava/util/List;

    iget-object v2, p0, Lfo/f;->f:Lfo/d;

    iget-object v3, p0, Lfo/f;->b:Ljava/util/List;

    iget-object v4, p0, Lfo/f;->c:Ljava/util/List;

    iget-object v5, p0, Lfo/f;->d:Ljava/util/List;

    iget-object v6, p0, Lfo/f;->e:Ljava/util/Set;

    iget-object v7, p0, Lfo/f;->h:Lfo/a;

    iget v8, p0, Lfo/f;->i:I

    invoke-direct/range {v0 .. v8}, Lao/k;-><init>(Ljava/util/List;Lfo/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lfo/a;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Leo/s;
    .locals 1

    const-string v0, "input must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Lfo/f;->a()Lao/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lao/k;->u(Ljava/lang/String;)Leo/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lfo/f;->c(Leo/s;)Leo/s;

    move-result-object p1

    return-object p1
.end method

.method public final c(Leo/s;)Leo/s;
    .locals 2

    iget-object v0, p0, Lfo/f;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfo/h;

    invoke-interface {v1, p1}, Lfo/h;->a(Leo/s;)Leo/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
