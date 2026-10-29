.class public Lsn/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrn/i;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:Lrn/i;

.field public e:I


# direct methods
.method public constructor <init>(Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lrn/i;",
            ">;II)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lrn/i;->c(Ljava/lang/CharSequence;Lqn/y;)Lrn/i;

    move-result-object v0

    iput-object v0, p0, Lsn/i;->d:Lrn/i;

    const/4 v0, 0x0

    iput v0, p0, Lsn/i;->e:I

    iput-object p1, p0, Lsn/i;->a:Ljava/util/List;

    iput p2, p0, Lsn/i;->b:I

    iput p3, p0, Lsn/i;->c:I

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p2, p3}, Lsn/i;->a(II)V

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrn/i;

    invoke-virtual {p0, p1}, Lsn/i;->p(Lrn/i;)V

    :cond_0
    return-void
.end method

.method public static k(Lrn/j;)Lsn/i;
    .locals 2

    new-instance v0, Lsn/i;

    invoke-virtual {p0}, Lrn/j;->d()Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Lsn/i;-><init>(Ljava/util/List;II)V

    return-object v0
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    if-ltz p1, :cond_1

    iget-object v0, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrn/i;

    if-ltz p2, :cond_0

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " out of range, line length: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Line index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " out of range, number of lines: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(C)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0
.end method

.method public c(Lvn/c;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-interface {p1, v1}, Lvn/c;->a(C)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0
.end method

.method public d(Lsn/h;Lsn/h;)Lrn/j;
    .locals 4

    iget v0, p1, Lsn/h;->a:I

    iget v1, p2, Lsn/h;->a:I

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    iget v2, p1, Lsn/h;->b:I

    iget v3, p2, Lsn/h;->b:I

    invoke-interface {v1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0}, Lrn/i;->b()Lqn/y;

    move-result-object v0

    if-eqz v0, :cond_0

    iget p1, p1, Lsn/h;->b:I

    iget p2, p2, Lsn/h;->b:I

    invoke-virtual {v0, p1, p2}, Lqn/y;->g(II)Lqn/y;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v1, p1}, Lrn/i;->c(Ljava/lang/CharSequence;Lqn/y;)Lrn/i;

    move-result-object p1

    invoke-static {p1}, Lrn/j;->h(Lrn/i;)Lrn/j;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lrn/j;->b()Lrn/j;

    move-result-object v0

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    iget v2, p1, Lsn/h;->a:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrn/i;

    iget v2, p1, Lsn/h;->b:I

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lrn/i;->d(II)Lrn/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrn/j;->a(Lrn/i;)V

    iget p1, p1, Lsn/h;->a:I

    :goto_1
    add-int/lit8 p1, p1, 0x1

    iget v1, p2, Lsn/h;->a:I

    if-ge p1, v1, :cond_2

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrn/i;

    invoke-virtual {v0, v1}, Lrn/j;->a(Lrn/i;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrn/i;

    const/4 v1, 0x0

    iget p2, p2, Lsn/h;->b:I

    invoke-virtual {p1, v1, p2}, Lrn/i;->d(II)Lrn/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lrn/j;->a(Lrn/i;)V

    return-object v0
.end method

.method public e()Z
    .locals 3

    iget v0, p0, Lsn/i;->c:I

    iget v1, p0, Lsn/i;->e:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    iget v0, p0, Lsn/i;->b:I

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public f(Lvn/c;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v1

    invoke-interface {p1, v1}, Lvn/c;->a(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public g(C)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v1

    if-ne v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public h()V
    .locals 2

    iget v0, p0, Lsn/i;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lsn/i;->c:I

    iget v1, p0, Lsn/i;->e:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lsn/i;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lsn/i;->b:I

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lsn/i;->a:Ljava/util/List;

    iget v1, p0, Lsn/i;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrn/i;

    invoke-virtual {p0, v0}, Lsn/i;->p(Lrn/i;)V

    goto :goto_0

    :cond_0
    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lrn/i;->c(Ljava/lang/CharSequence;Lqn/y;)Lrn/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Lsn/i;->p(Lrn/i;)V

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lsn/i;->c:I

    :cond_1
    return-void
.end method

.method public i(C)Z
    .locals 1

    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lsn/i;->h()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public j(Ljava/lang/String;)Z
    .locals 4

    iget v0, p0, Lsn/i;->c:I

    iget v1, p0, Lsn/i;->e:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lsn/i;->e:I

    if-gt v0, v1, :cond_2

    move v0, v2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    iget v3, p0, Lsn/i;->c:I

    add-int/2addr v3, v0

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lsn/i;->c:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lsn/i;->c:I

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method public l()C
    .locals 2

    iget v0, p0, Lsn/i;->c:I

    iget v1, p0, Lsn/i;->e:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lsn/i;->c:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lsn/i;->b:I

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    const/16 v0, 0xa

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public m()I
    .locals 3

    iget v0, p0, Lsn/i;->c:I

    iget v1, p0, Lsn/i;->e:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lsn/i;->c:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lsn/i;->c:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lsn/i;->e:I

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    iget v2, p0, Lsn/i;->c:I

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    :cond_0
    return v0

    :cond_1
    iget v0, p0, Lsn/i;->b:I

    iget-object v1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    const/16 v0, 0xa

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public n()I
    .locals 4

    iget v0, p0, Lsn/i;->c:I

    if-lez v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v2}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_0

    if-lez v1, :cond_0

    iget-object v1, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    add-int/lit8 v0, v0, -0x2

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    return v0

    :cond_0
    return v2

    :cond_1
    iget v0, p0, Lsn/i;->b:I

    if-lez v0, :cond_2

    const/16 v0, 0xa

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public o()Lsn/h;
    .locals 3

    new-instance v0, Lsn/h;

    iget v1, p0, Lsn/i;->b:I

    iget v2, p0, Lsn/i;->c:I

    invoke-direct {v0, v1, v2}, Lsn/h;-><init>(II)V

    return-object v0
.end method

.method public final p(Lrn/i;)V
    .locals 0

    iput-object p1, p0, Lsn/i;->d:Lrn/i;

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Lsn/i;->e:I

    return-void
.end method

.method public q(Lsn/h;)V
    .locals 2

    iget v0, p1, Lsn/h;->a:I

    iget v1, p1, Lsn/h;->b:I

    invoke-virtual {p0, v0, v1}, Lsn/i;->a(II)V

    iget v0, p1, Lsn/h;->a:I

    iput v0, p0, Lsn/i;->b:I

    iget p1, p1, Lsn/h;->b:I

    iput p1, p0, Lsn/i;->c:I

    iget-object p1, p0, Lsn/i;->a:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrn/i;

    invoke-virtual {p0, p1}, Lsn/i;->p(Lrn/i;)V

    return-void
.end method

.method public r()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    return v0

    :cond_0
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
