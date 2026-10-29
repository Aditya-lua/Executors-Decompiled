.class public Lnn/l;
.super Ltn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/l$a;
    }
.end annotation


# instance fields
.field public final a:Lqn/h;

.field public final b:C

.field public final c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(CII)V
    .locals 2

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/h;

    invoke-direct {v0}, Lqn/h;-><init>()V

    iput-object v0, p0, Lnn/l;->a:Lqn/h;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, p0, Lnn/l;->e:Ljava/lang/StringBuilder;

    iput-char p1, p0, Lnn/l;->b:C

    iput p2, p0, Lnn/l;->c:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqn/h;->v(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqn/h;->z(Ljava/lang/Integer;)V

    invoke-virtual {v0, p3}, Lqn/h;->w(I)V

    return-void
.end method

.method public static bridge synthetic k(Lnn/l;)Lqn/h;
    .locals 0

    iget-object p0, p0, Lnn/l;->a:Lqn/h;

    return-object p0
.end method

.method public static bridge synthetic l(Ljava/lang/CharSequence;II)Lnn/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lnn/l;->m(Ljava/lang/CharSequence;II)Lnn/l;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/CharSequence;II)Lnn/l;
    .locals 7

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    move v3, p1

    move v2, v1

    :goto_0
    const/16 v4, 0x7e

    const/16 v5, 0x60

    if-ge v3, v0, :cond_2

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v6, v5, :cond_1

    if-eq v6, v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    const/4 v0, 0x0

    const/4 v3, 0x3

    if-lt v1, v3, :cond_4

    if-nez v2, :cond_4

    add-int/2addr p1, v1

    invoke-static {v5, p0, p1}, Lvn/d;->a(CLjava/lang/CharSequence;I)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_3

    return-object v0

    :cond_3
    new-instance p0, Lnn/l;

    invoke-direct {p0, v5, v1, p2}, Lnn/l;-><init>(CII)V

    return-object p0

    :cond_4
    if-lt v2, v3, :cond_5

    if-nez v1, :cond_5

    new-instance p0, Lnn/l;

    invoke-direct {p0, v4, v2, p2}, Lnn/l;-><init>(CII)V

    return-object p0

    :cond_5
    return-object v0
.end method


# virtual methods
.method public b(Ltn/h;)Ltn/c;
    .locals 5

    invoke-interface {p1}, Ltn/h;->e()I

    move-result v0

    invoke-interface {p1}, Ltn/h;->getIndex()I

    move-result v1

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object v2

    invoke-virtual {v2}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {p1}, Ltn/h;->d()I

    move-result p1

    sget v3, Lpn/f;->a:I

    if-ge p1, v3, :cond_0

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0, v2, v0}, Lnn/l;->n(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ltn/c;->c()Ltn/c;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lnn/l;->a:Lqn/h;

    invoke-virtual {p1}, Lqn/h;->q()I

    move-result p1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    if-lez p1, :cond_1

    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ltn/c;->b(I)Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lqn/a;
    .locals 1

    iget-object v0, p0, Lnn/l;->a:Lqn/h;

    return-object v0
.end method

.method public g(Lrn/i;)V
    .locals 1

    iget-object v0, p0, Lnn/l;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnn/l;->d:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lnn/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lnn/l;->e:Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lnn/l;->a:Lqn/h;

    iget-object v1, p0, Lnn/l;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lpn/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/h;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lnn/l;->a:Lqn/h;

    iget-object v1, p0, Lnn/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/h;->y(Ljava/lang/String;)V

    return-void
.end method

.method public final n(Ljava/lang/CharSequence;I)Z
    .locals 3

    iget-char v0, p0, Lnn/l;->b:C

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, p1, p2, v1}, Lvn/d;->i(CLjava/lang/CharSequence;II)I

    move-result v0

    sub-int/2addr v0, p2

    iget v1, p0, Lnn/l;->c:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    add-int/2addr p2, v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p1, p2, v1}, Lvn/d;->k(Ljava/lang/CharSequence;II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lnn/l;->a:Lqn/h;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqn/h;->u(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method
