.class public Lz1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/b$a;


# static fields
.field public static l:F = 0.001f


# instance fields
.field public a:I

.field public final b:Lz1/b;

.field public final c:Lz1/c;

.field public d:I

.field public e:Lz1/i;

.field public f:[I

.field public g:[I

.field public h:[F

.field public i:I

.field public j:I

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz1/b;Lz1/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lz1/a;->a:I

    const/16 v1, 0x8

    iput v1, p0, Lz1/a;->d:I

    const/4 v2, 0x0

    iput-object v2, p0, Lz1/a;->e:Lz1/i;

    new-array v2, v1, [I

    iput-object v2, p0, Lz1/a;->f:[I

    new-array v2, v1, [I

    iput-object v2, p0, Lz1/a;->g:[I

    new-array v1, v1, [F

    iput-object v1, p0, Lz1/a;->h:[F

    const/4 v1, -0x1

    iput v1, p0, Lz1/a;->i:I

    iput v1, p0, Lz1/a;->j:I

    iput-boolean v0, p0, Lz1/a;->k:Z

    iput-object p1, p0, Lz1/a;->b:Lz1/b;

    iput-object p2, p0, Lz1/a;->c:Lz1/c;

    return-void
.end method


# virtual methods
.method public final a(Lz1/i;)F
    .locals 4

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Lz1/a;->a:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lz1/a;->f:[I

    aget v2, v2, v0

    iget v3, p1, Lz1/i;->c:I

    if-ne v2, v3, :cond_0

    iget-object p1, p0, Lz1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Lz1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b(I)Lz1/i;
    .locals 3

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Lz1/a;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lz1/a;->c:Lz1/c;

    iget-object p1, p1, Lz1/c;->d:[Lz1/i;

    iget-object v1, p0, Lz1/a;->f:[I

    aget v0, v1, v0

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    iget-object v2, p0, Lz1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Lz1/i;F)V
    .locals 8

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, v1}, Lz1/a;->j(Lz1/i;Z)F

    return-void

    :cond_0
    iget v0, p0, Lz1/a;->i:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    iput v2, p0, Lz1/a;->i:I

    iget-object v0, p0, Lz1/a;->h:[F

    aput p2, v0, v2

    iget-object p2, p0, Lz1/a;->f:[I

    iget v0, p1, Lz1/i;->c:I

    aput v0, p2, v2

    iget-object p2, p0, Lz1/a;->g:[I

    aput v3, p2, v2

    iget p2, p1, Lz1/i;->m:I

    add-int/2addr p2, v1

    iput p2, p1, Lz1/i;->m:I

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->a(Lz1/b;)V

    iget p1, p0, Lz1/a;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Lz1/a;->a:I

    iget-boolean p1, p0, Lz1/a;->k:Z

    if-nez p1, :cond_d

    iget p1, p0, Lz1/a;->j:I

    add-int/2addr p1, v1

    iput p1, p0, Lz1/a;->j:I

    iget-object p2, p0, Lz1/a;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_d

    iput-boolean v1, p0, Lz1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Lz1/a;->j:I

    return-void

    :cond_1
    move v4, v2

    move v5, v3

    :goto_0
    if-eq v0, v3, :cond_4

    iget v6, p0, Lz1/a;->a:I

    if-ge v4, v6, :cond_4

    iget-object v6, p0, Lz1/a;->f:[I

    aget v6, v6, v0

    iget v7, p1, Lz1/i;->c:I

    if-ne v6, v7, :cond_2

    iget-object p1, p0, Lz1/a;->h:[F

    aput p2, p1, v0

    return-void

    :cond_2
    if-ge v6, v7, :cond_3

    move v5, v0

    :cond_3
    iget-object v6, p0, Lz1/a;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iget v0, p0, Lz1/a;->j:I

    add-int/lit8 v4, v0, 0x1

    iget-boolean v6, p0, Lz1/a;->k:Z

    if-eqz v6, :cond_6

    iget-object v4, p0, Lz1/a;->f:[I

    aget v6, v4, v0

    if-ne v6, v3, :cond_5

    goto :goto_1

    :cond_5
    array-length v0, v4

    goto :goto_1

    :cond_6
    move v0, v4

    :goto_1
    iget-object v4, p0, Lz1/a;->f:[I

    array-length v6, v4

    if-lt v0, v6, :cond_8

    iget v6, p0, Lz1/a;->a:I

    array-length v4, v4

    if-ge v6, v4, :cond_8

    move v4, v2

    :goto_2
    iget-object v6, p0, Lz1/a;->f:[I

    array-length v7, v6

    if-ge v4, v7, :cond_8

    aget v6, v6, v4

    if-ne v6, v3, :cond_7

    move v0, v4

    goto :goto_3

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    iget-object v4, p0, Lz1/a;->f:[I

    array-length v6, v4

    if-lt v0, v6, :cond_9

    array-length v0, v4

    iget v4, p0, Lz1/a;->d:I

    mul-int/lit8 v4, v4, 0x2

    iput v4, p0, Lz1/a;->d:I

    iput-boolean v2, p0, Lz1/a;->k:Z

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lz1/a;->j:I

    iget-object v2, p0, Lz1/a;->h:[F

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v2

    iput-object v2, p0, Lz1/a;->h:[F

    iget-object v2, p0, Lz1/a;->f:[I

    iget v4, p0, Lz1/a;->d:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lz1/a;->f:[I

    iget-object v2, p0, Lz1/a;->g:[I

    iget v4, p0, Lz1/a;->d:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lz1/a;->g:[I

    :cond_9
    iget-object v2, p0, Lz1/a;->f:[I

    iget v4, p1, Lz1/i;->c:I

    aput v4, v2, v0

    iget-object v2, p0, Lz1/a;->h:[F

    aput p2, v2, v0

    if-eq v5, v3, :cond_a

    iget-object p2, p0, Lz1/a;->g:[I

    aget v2, p2, v5

    aput v2, p2, v0

    aput v0, p2, v5

    goto :goto_4

    :cond_a
    iget-object p2, p0, Lz1/a;->g:[I

    iget v2, p0, Lz1/a;->i:I

    aput v2, p2, v0

    iput v0, p0, Lz1/a;->i:I

    :goto_4
    iget p2, p1, Lz1/i;->m:I

    add-int/2addr p2, v1

    iput p2, p1, Lz1/i;->m:I

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->a(Lz1/b;)V

    iget p1, p0, Lz1/a;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Lz1/a;->a:I

    iget-boolean p2, p0, Lz1/a;->k:Z

    if-nez p2, :cond_b

    iget p2, p0, Lz1/a;->j:I

    add-int/2addr p2, v1

    iput p2, p0, Lz1/a;->j:I

    :cond_b
    iget-object p2, p0, Lz1/a;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_c

    iput-boolean v1, p0, Lz1/a;->k:Z

    :cond_c
    iget p1, p0, Lz1/a;->j:I

    array-length v0, p2

    if-lt p1, v0, :cond_d

    iput-boolean v1, p0, Lz1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Lz1/a;->j:I

    :cond_d
    return-void
.end method

.method public final clear()V
    .locals 5

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    iget v4, p0, Lz1/a;->a:I

    if-ge v2, v4, :cond_1

    iget-object v3, p0, Lz1/a;->c:Lz1/c;

    iget-object v3, v3, Lz1/c;->d:[Lz1/i;

    iget-object v4, p0, Lz1/a;->f:[I

    aget v4, v4, v0

    aget-object v3, v3, v4

    if-eqz v3, :cond_0

    iget-object v4, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {v3, v4}, Lz1/i;->d(Lz1/b;)V

    :cond_0
    iget-object v3, p0, Lz1/a;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v3, p0, Lz1/a;->i:I

    iput v3, p0, Lz1/a;->j:I

    iput-boolean v1, p0, Lz1/a;->k:Z

    iput v1, p0, Lz1/a;->a:I

    return-void
.end method

.method public d()V
    .locals 5

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget v2, p0, Lz1/a;->a:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lz1/a;->h:[F

    aget v3, v2, v0

    const/high16 v4, -0x40800000    # -1.0f

    mul-float/2addr v3, v4

    aput v3, v2, v0

    iget-object v2, p0, Lz1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Lz1/b;Z)F
    .locals 5

    iget-object v0, p1, Lz1/b;->a:Lz1/i;

    invoke-virtual {p0, v0}, Lz1/a;->a(Lz1/i;)F

    move-result v0

    iget-object v1, p1, Lz1/b;->a:Lz1/i;

    invoke-virtual {p0, v1, p2}, Lz1/a;->j(Lz1/i;Z)F

    iget-object p1, p1, Lz1/b;->e:Lz1/b$a;

    invoke-interface {p1}, Lz1/b$a;->h()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p1, v2}, Lz1/b$a;->b(I)Lz1/i;

    move-result-object v3

    invoke-interface {p1, v3}, Lz1/b$a;->a(Lz1/i;)F

    move-result v4

    mul-float/2addr v4, v0

    invoke-virtual {p0, v3, v4, p2}, Lz1/a;->f(Lz1/i;FZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public f(Lz1/i;FZ)V
    .locals 8

    sget v0, Lz1/a;->l:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    iput v1, p0, Lz1/a;->i:I

    iget-object p3, p0, Lz1/a;->h:[F

    aput p2, p3, v1

    iget-object p2, p0, Lz1/a;->f:[I

    iget p3, p1, Lz1/i;->c:I

    aput p3, p2, v1

    iget-object p2, p0, Lz1/a;->g:[I

    aput v2, p2, v1

    iget p2, p1, Lz1/i;->m:I

    add-int/2addr p2, v3

    iput p2, p1, Lz1/i;->m:I

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->a(Lz1/b;)V

    iget p1, p0, Lz1/a;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Lz1/a;->a:I

    iget-boolean p1, p0, Lz1/a;->k:Z

    if-nez p1, :cond_10

    iget p1, p0, Lz1/a;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Lz1/a;->j:I

    iget-object p2, p0, Lz1/a;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_10

    iput-boolean v3, p0, Lz1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Lz1/a;->j:I

    return-void

    :cond_1
    move v4, v1

    move v5, v2

    :goto_0
    if-eq v0, v2, :cond_8

    iget v6, p0, Lz1/a;->a:I

    if-ge v4, v6, :cond_8

    iget-object v6, p0, Lz1/a;->f:[I

    aget v6, v6, v0

    iget v7, p1, Lz1/i;->c:I

    if-ne v6, v7, :cond_6

    iget-object v1, p0, Lz1/a;->h:[F

    aget v2, v1, v0

    add-float/2addr v2, p2

    sget p2, Lz1/a;->l:F

    neg-float v4, p2

    cmpl-float v4, v2, v4

    const/4 v6, 0x0

    if-lez v4, :cond_2

    cmpg-float p2, v2, p2

    if-gez p2, :cond_2

    move v2, v6

    :cond_2
    aput v2, v1, v0

    cmpl-float p2, v2, v6

    if-nez p2, :cond_10

    iget p2, p0, Lz1/a;->i:I

    if-ne v0, p2, :cond_3

    iget-object p2, p0, Lz1/a;->g:[I

    aget p2, p2, v0

    iput p2, p0, Lz1/a;->i:I

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lz1/a;->g:[I

    aget v1, p2, v0

    aput v1, p2, v5

    :goto_1
    if-eqz p3, :cond_4

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->d(Lz1/b;)V

    :cond_4
    iget-boolean p2, p0, Lz1/a;->k:Z

    if-eqz p2, :cond_5

    iput v0, p0, Lz1/a;->j:I

    :cond_5
    iget p2, p1, Lz1/i;->m:I

    sub-int/2addr p2, v3

    iput p2, p1, Lz1/i;->m:I

    iget p1, p0, Lz1/a;->a:I

    sub-int/2addr p1, v3

    iput p1, p0, Lz1/a;->a:I

    return-void

    :cond_6
    if-ge v6, v7, :cond_7

    move v5, v0

    :cond_7
    iget-object v6, p0, Lz1/a;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_8
    iget p3, p0, Lz1/a;->j:I

    add-int/lit8 v0, p3, 0x1

    iget-boolean v4, p0, Lz1/a;->k:Z

    if-eqz v4, :cond_a

    iget-object v0, p0, Lz1/a;->f:[I

    aget v4, v0, p3

    if-ne v4, v2, :cond_9

    goto :goto_2

    :cond_9
    array-length p3, v0

    goto :goto_2

    :cond_a
    move p3, v0

    :goto_2
    iget-object v0, p0, Lz1/a;->f:[I

    array-length v4, v0

    if-lt p3, v4, :cond_c

    iget v4, p0, Lz1/a;->a:I

    array-length v0, v0

    if-ge v4, v0, :cond_c

    move v0, v1

    :goto_3
    iget-object v4, p0, Lz1/a;->f:[I

    array-length v6, v4

    if-ge v0, v6, :cond_c

    aget v4, v4, v0

    if-ne v4, v2, :cond_b

    move p3, v0

    goto :goto_4

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_c
    :goto_4
    iget-object v0, p0, Lz1/a;->f:[I

    array-length v4, v0

    if-lt p3, v4, :cond_d

    array-length p3, v0

    iget v0, p0, Lz1/a;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lz1/a;->d:I

    iput-boolean v1, p0, Lz1/a;->k:Z

    add-int/lit8 v1, p3, -0x1

    iput v1, p0, Lz1/a;->j:I

    iget-object v1, p0, Lz1/a;->h:[F

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lz1/a;->h:[F

    iget-object v0, p0, Lz1/a;->f:[I

    iget v1, p0, Lz1/a;->d:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lz1/a;->f:[I

    iget-object v0, p0, Lz1/a;->g:[I

    iget v1, p0, Lz1/a;->d:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lz1/a;->g:[I

    :cond_d
    iget-object v0, p0, Lz1/a;->f:[I

    iget v1, p1, Lz1/i;->c:I

    aput v1, v0, p3

    iget-object v0, p0, Lz1/a;->h:[F

    aput p2, v0, p3

    if-eq v5, v2, :cond_e

    iget-object p2, p0, Lz1/a;->g:[I

    aget v0, p2, v5

    aput v0, p2, p3

    aput p3, p2, v5

    goto :goto_5

    :cond_e
    iget-object p2, p0, Lz1/a;->g:[I

    iget v0, p0, Lz1/a;->i:I

    aput v0, p2, p3

    iput p3, p0, Lz1/a;->i:I

    :goto_5
    iget p2, p1, Lz1/i;->m:I

    add-int/2addr p2, v3

    iput p2, p1, Lz1/i;->m:I

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->a(Lz1/b;)V

    iget p1, p0, Lz1/a;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Lz1/a;->a:I

    iget-boolean p1, p0, Lz1/a;->k:Z

    if-nez p1, :cond_f

    iget p1, p0, Lz1/a;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Lz1/a;->j:I

    :cond_f
    iget p1, p0, Lz1/a;->j:I

    iget-object p2, p0, Lz1/a;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_10

    iput-boolean v3, p0, Lz1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Lz1/a;->j:I

    :cond_10
    :goto_6
    return-void
.end method

.method public g(Lz1/i;)Z
    .locals 6

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    move v3, v1

    :goto_0
    if-eq v0, v2, :cond_2

    iget v4, p0, Lz1/a;->a:I

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lz1/a;->f:[I

    aget v4, v4, v0

    iget v5, p1, Lz1/i;->c:I

    if-ne v4, v5, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v4, p0, Lz1/a;->g:[I

    aget v0, v4, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lz1/a;->a:I

    return v0
.end method

.method public i(I)F
    .locals 3

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Lz1/a;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lz1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Lz1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final j(Lz1/i;Z)F
    .locals 8

    iget-object v0, p0, Lz1/a;->e:Lz1/i;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lz1/a;->e:Lz1/i;

    :cond_0
    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-eq v0, v2, :cond_6

    iget v5, p0, Lz1/a;->a:I

    if-ge v3, v5, :cond_6

    iget-object v5, p0, Lz1/a;->f:[I

    aget v5, v5, v0

    iget v6, p1, Lz1/i;->c:I

    if-ne v5, v6, :cond_5

    iget v1, p0, Lz1/a;->i:I

    if-ne v0, v1, :cond_2

    iget-object v1, p0, Lz1/a;->g:[I

    aget v1, v1, v0

    iput v1, p0, Lz1/a;->i:I

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lz1/a;->g:[I

    aget v3, v1, v0

    aput v3, v1, v4

    :goto_1
    if-eqz p2, :cond_3

    iget-object p2, p0, Lz1/a;->b:Lz1/b;

    invoke-virtual {p1, p2}, Lz1/i;->d(Lz1/b;)V

    :cond_3
    iget p2, p1, Lz1/i;->m:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lz1/i;->m:I

    iget p1, p0, Lz1/a;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lz1/a;->a:I

    iget-object p1, p0, Lz1/a;->f:[I

    aput v2, p1, v0

    iget-boolean p1, p0, Lz1/a;->k:Z

    if-eqz p1, :cond_4

    iput v0, p0, Lz1/a;->j:I

    :cond_4
    iget-object p1, p0, Lz1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_5
    iget-object v4, p0, Lz1/a;->g:[I

    aget v4, v4, v0

    add-int/lit8 v3, v3, 0x1

    move v7, v4

    move v4, v0

    move v0, v7

    goto :goto_0

    :cond_6
    return v1
.end method

.method public k(F)V
    .locals 4

    iget v0, p0, Lz1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget v2, p0, Lz1/a;->a:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lz1/a;->h:[F

    aget v3, v2, v0

    div-float/2addr v3, p1

    aput v3, v2, v0

    iget-object v2, p0, Lz1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lz1/a;->i:I

    const-string v1, ""

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    iget v3, p0, Lz1/a;->a:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz1/a;->h:[F

    aget v1, v1, v0

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz1/a;->c:Lz1/c;

    iget-object v1, v1, Lz1/c;->d:[Lz1/i;

    iget-object v4, p0, Lz1/a;->f:[I

    aget v4, v4, v0

    aget-object v1, v1, v4

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lz1/a;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
