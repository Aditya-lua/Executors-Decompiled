.class public Lqn/h;
.super Lqn/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/Integer;

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/a;-><init>()V

    return-void
.end method

.method public static p(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-lt p1, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "fence lengths required to be: closingFenceLength >= openingFenceLength"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->E(Lqn/h;)V

    return-void
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lqn/h;->j:I

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/h;->k:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/h;->l:Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqn/h;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public u(Ljava/lang/Integer;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "closingFenceLength needs to be >= 3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lqn/h;->h:Ljava/lang/Integer;

    invoke-static {v0, p1}, Lqn/h;->p(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iput-object p1, p0, Lqn/h;->i:Ljava/lang/Integer;

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/h;->g:Ljava/lang/String;

    return-void
.end method

.method public w(I)V
    .locals 0

    iput p1, p0, Lqn/h;->j:I

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/h;->k:Ljava/lang/String;

    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/h;->l:Ljava/lang/String;

    return-void
.end method

.method public z(Ljava/lang/Integer;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "openingFenceLength needs to be >= 3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lqn/h;->i:Ljava/lang/Integer;

    invoke-static {p1, v0}, Lqn/h;->p(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iput-object p1, p0, Lqn/h;->h:Ljava/lang/Integer;

    return-void
.end method
