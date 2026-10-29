.class public Lnn/c;
.super Ltn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/c$a;
    }
.end annotation


# instance fields
.field public final a:Lqn/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/b;

    invoke-direct {v0}, Lqn/b;-><init>()V

    iput-object v0, p0, Lnn/c;->a:Lqn/b;

    return-void
.end method

.method public static bridge synthetic k(Ltn/h;I)Z
    .locals 0

    invoke-static {p0, p1}, Lnn/c;->m(Ltn/h;I)Z

    move-result p0

    return p0
.end method

.method public static m(Ltn/h;I)Z
    .locals 2

    invoke-interface {p0}, Ltn/h;->b()Lrn/i;

    move-result-object v0

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {p0}, Ltn/h;->d()I

    move-result p0

    sget v1, Lpn/f;->a:I

    if-ge p0, v1, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-ge p1, p0, :cond_0

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x3e

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Ltn/h;)Ltn/c;
    .locals 3

    invoke-interface {p1}, Ltn/h;->e()I

    move-result v0

    invoke-static {p1, v0}, Lnn/c;->m(Ltn/h;I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ltn/h;->c()I

    move-result v1

    invoke-interface {p1}, Ltn/h;->d()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object p1

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lvn/d;->g(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v2, v1, 0x2

    :cond_0
    invoke-static {v2}, Ltn/c;->a(I)Ltn/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lqn/a;
    .locals 1

    invoke-virtual {p0}, Lnn/c;->l()Lqn/b;

    move-result-object v0

    return-object v0
.end method

.method public e(Lqn/a;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public l()Lqn/b;
    .locals 1

    iget-object v0, p0, Lnn/c;->a:Lqn/b;

    return-object v0
.end method
