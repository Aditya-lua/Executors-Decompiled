.class public Lb1/p;
.super Ln0/c2;
.source "SourceFile"


# instance fields
.field public final c:Lb1/g$a;


# direct methods
.method public constructor <init>(Ln0/l0;Lb1/g$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln0/c2;-><init>(Ln0/l0;)V

    iput-object p2, p0, Lb1/p;->c:Lb1/g$a;

    return-void
.end method

.method public static synthetic p(Lb1/p;Ljava/util/List;Ljava/lang/Void;)Lne/x;
    .locals 2

    iget-object p2, p0, Lb1/p;->c:Lb1/g$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/l1;

    invoke-virtual {p0, v1}, Lb1/p;->s(Ln0/l1;)I

    move-result v1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/l1;

    invoke-virtual {p0, p1}, Lb1/p;->t(Ln0/l1;)I

    move-result p0

    invoke-interface {p2, v1, p0}, Lb1/g$a;->a(II)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lne/x;Ljava/lang/Void;)Lne/x;
    .locals 0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/m;

    invoke-interface {p0}, Lm0/m;->b()Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lne/x;Lm0/m;)Lne/x;
    .locals 0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/m;

    invoke-interface {p0}, Lm0/m;->a()Lne/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public f(Ljava/util/List;II)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;II)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string v1, "Only support one capture config."

    invoke-static {p3, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p2, v0}, Ln0/c2;->m(II)Lne/x;

    move-result-object p2

    invoke-static {p2}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p3

    new-instance v0, Lb1/m;

    invoke-direct {v0, p2}, Lb1/m;-><init>(Lne/x;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p3

    new-instance v0, Lb1/n;

    invoke-direct {v0, p0, p1}, Lb1/n;-><init>(Lb1/p;Ljava/util/List;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance p3, Lb1/o;

    invoke-direct {p3, p2}, Lb1/o;-><init>(Lne/x;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->k(Ljava/util/Collection;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ln0/l1;)I
    .locals 2

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object p1

    sget-object v0, Ln0/l1;->j:Ln0/n1$a;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final t(Ln0/l1;)I
    .locals 2

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object p1

    sget-object v0, Ln0/l1;->i:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
