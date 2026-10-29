.class public final Landroidx/emoji2/text/d$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:I

.field public final b:Landroidx/emoji2/text/f$a;

.field public c:Landroidx/emoji2/text/f$a;

.field public d:Landroidx/emoji2/text/f$a;

.field public e:I

.field public f:I

.field public final g:Z

.field public final h:[I


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/f$a;Z[I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/d$e;->a:I

    iput-object p1, p0, Landroidx/emoji2/text/d$e;->b:Landroidx/emoji2/text/f$a;

    iput-object p1, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    iput-boolean p2, p0, Landroidx/emoji2/text/d$e;->g:Z

    iput-object p3, p0, Landroidx/emoji2/text/d$e;->h:[I

    return-void
.end method

.method public static d(I)Z
    .locals 1

    const v0, 0xfe0f

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f(I)Z
    .locals 1

    const v0, 0xfe0e

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(I)I
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/f$a;->a(I)Landroidx/emoji2/text/f$a;

    move-result-object v0

    iget v1, p0, Landroidx/emoji2/text/d$e;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    move-result v3

    goto :goto_0

    :cond_0
    iput v3, p0, Landroidx/emoji2/text/d$e;->a:I

    iput-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    iput v2, p0, Landroidx/emoji2/text/d$e;->f:I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    iput-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    iget v0, p0, Landroidx/emoji2/text/d$e;->f:I

    add-int/2addr v0, v2

    iput v0, p0, Landroidx/emoji2/text/d$e;->f:I

    goto :goto_0

    :cond_2
    invoke-static {p1}, Landroidx/emoji2/text/d$e;->f(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    move-result v3

    goto :goto_0

    :cond_3
    invoke-static {p1}, Landroidx/emoji2/text/d$e;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    if-eqz v0, :cond_7

    iget v0, p0, Landroidx/emoji2/text/d$e;->f:I

    const/4 v3, 0x3

    if-ne v0, v2, :cond_6

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    iput-object v0, p0, Landroidx/emoji2/text/d$e;->d:Landroidx/emoji2/text/f$a;

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    move-result v3

    goto :goto_0

    :cond_6
    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    iput-object v0, p0, Landroidx/emoji2/text/d$e;->d:Landroidx/emoji2/text/f$a;

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->g()I

    move-result v3

    :goto_0
    iput p1, p0, Landroidx/emoji2/text/d$e;->e:I

    return v3
.end method

.method public b()Lz3/i;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    return-object v0
.end method

.method public c()Lz3/i;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->d:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Landroidx/emoji2/text/d$e;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/emoji2/text/d$e;->f:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/emoji2/text/d$e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final g()I
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/d$e;->a:I

    iget-object v1, p0, Landroidx/emoji2/text/d$e;->b:Landroidx/emoji2/text/f$a;

    iput-object v1, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    const/4 v1, 0x0

    iput v1, p0, Landroidx/emoji2/text/d$e;->f:I

    return v0
.end method

.method public final h()Z
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    invoke-virtual {v0}, Lz3/i;->j()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Landroidx/emoji2/text/d$e;->e:I

    invoke-static {v0}, Landroidx/emoji2/text/d$e;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Landroidx/emoji2/text/d$e;->g:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/emoji2/text/d$e;->h:[I

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Landroidx/emoji2/text/d$e;->c:Landroidx/emoji2/text/f$a;

    invoke-virtual {v0}, Landroidx/emoji2/text/f$a;->b()Lz3/i;

    move-result-object v0

    invoke-virtual {v0, v2}, Lz3/i;->b(I)I

    move-result v0

    iget-object v3, p0, Landroidx/emoji2/text/d$e;->h:[I

    invoke-static {v3, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    return v2
.end method
