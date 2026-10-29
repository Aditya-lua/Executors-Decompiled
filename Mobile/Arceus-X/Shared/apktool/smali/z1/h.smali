.class public Lz1/h;
.super Lz1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/h$b;
    }
.end annotation


# instance fields
.field public g:I

.field public h:[Lz1/i;

.field public i:[Lz1/i;

.field public j:I

.field public k:Lz1/h$b;

.field public l:Lz1/c;


# direct methods
.method public constructor <init>(Lz1/c;)V
    .locals 2

    invoke-direct {p0, p1}, Lz1/b;-><init>(Lz1/c;)V

    const/16 v0, 0x80

    iput v0, p0, Lz1/h;->g:I

    new-array v1, v0, [Lz1/i;

    iput-object v1, p0, Lz1/h;->h:[Lz1/i;

    new-array v0, v0, [Lz1/i;

    iput-object v0, p0, Lz1/h;->i:[Lz1/i;

    const/4 v0, 0x0

    iput v0, p0, Lz1/h;->j:I

    new-instance v0, Lz1/h$b;

    invoke-direct {v0, p0, p0}, Lz1/h$b;-><init>(Lz1/h;Lz1/h;)V

    iput-object v0, p0, Lz1/h;->k:Lz1/h$b;

    iput-object p1, p0, Lz1/h;->l:Lz1/c;

    return-void
.end method

.method public static synthetic E(Lz1/h;Lz1/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz1/h;->G(Lz1/i;)V

    return-void
.end method


# virtual methods
.method public B(Lz1/d;Lz1/b;Z)V
    .locals 5

    iget-object p1, p2, Lz1/b;->a:Lz1/i;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p3, p2, Lz1/b;->e:Lz1/b$a;

    invoke-interface {p3}, Lz1/b$a;->h()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p3, v1}, Lz1/b$a;->b(I)Lz1/i;

    move-result-object v2

    invoke-interface {p3, v1}, Lz1/b$a;->i(I)F

    move-result v3

    iget-object v4, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v4, v2}, Lz1/h$b;->b(Lz1/i;)V

    iget-object v4, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v4, p1, v3}, Lz1/h$b;->a(Lz1/i;F)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v2}, Lz1/h;->F(Lz1/i;)V

    :cond_1
    iget v2, p0, Lz1/b;->b:F

    iget v4, p2, Lz1/b;->b:F

    mul-float/2addr v4, v3

    add-float/2addr v2, v4

    iput v2, p0, Lz1/b;->b:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lz1/h;->G(Lz1/i;)V

    return-void
.end method

.method public final F(Lz1/i;)V
    .locals 5

    iget v0, p0, Lz1/h;->j:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    array-length v3, v2

    if-le v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz1/i;

    iput-object v0, p0, Lz1/h;->h:[Lz1/i;

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz1/i;

    iput-object v0, p0, Lz1/h;->i:[Lz1/i;

    :cond_0
    iget-object v0, p0, Lz1/h;->h:[Lz1/i;

    iget v2, p0, Lz1/h;->j:I

    aput-object p1, v0, v2

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lz1/h;->j:I

    if-le v3, v1, :cond_2

    aget-object v0, v0, v2

    iget v0, v0, Lz1/i;->c:I

    iget v2, p1, Lz1/i;->c:I

    if-le v0, v2, :cond_2

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget v3, p0, Lz1/h;->j:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lz1/h;->i:[Lz1/i;

    iget-object v4, p0, Lz1/h;->h:[Lz1/i;

    aget-object v4, v4, v2

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lz1/h;->i:[Lz1/i;

    new-instance v4, Lz1/h$a;

    invoke-direct {v4, p0}, Lz1/h$a;-><init>(Lz1/h;)V

    invoke-static {v2, v0, v3, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    :goto_1
    iget v2, p0, Lz1/h;->j:I

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    iget-object v3, p0, Lz1/h;->i:[Lz1/i;

    aget-object v3, v3, v0

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v1, p1, Lz1/i;->a:Z

    invoke-virtual {p1, p0}, Lz1/i;->a(Lz1/b;)V

    return-void
.end method

.method public final G(Lz1/i;)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lz1/h;->j:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    iget v2, p0, Lz1/h;->j:I

    add-int/lit8 v3, v2, -0x1

    if-ge v1, v3, :cond_0

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    add-int/lit8 v3, v1, 0x1

    aget-object v4, v2, v3

    aput-object v4, v2, v1

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lz1/h;->j:I

    iput-boolean v0, p1, Lz1/i;->a:Z

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Lz1/d;[Z)Lz1/i;
    .locals 4

    const/4 p1, -0x1

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    iget v2, p0, Lz1/h;->j:I

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    aget-object v2, v2, v0

    iget v3, v2, Lz1/i;->c:I

    aget-boolean v3, p2, v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v3, v2}, Lz1/h$b;->b(Lz1/i;)V

    if-ne v1, p1, :cond_1

    iget-object v2, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v2}, Lz1/h$b;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lz1/h;->k:Lz1/h$b;

    iget-object v3, p0, Lz1/h;->h:[Lz1/i;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Lz1/h$b;->d(Lz1/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    move v1, v0

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    if-ne v1, p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    iget-object p1, p0, Lz1/h;->h:[Lz1/i;

    aget-object p1, p1, v1

    return-object p1
.end method

.method public b(Lz1/i;)V
    .locals 3

    iget-object v0, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v0, p1}, Lz1/h$b;->b(Lz1/i;)V

    iget-object v0, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v0}, Lz1/h$b;->e()V

    iget-object v0, p1, Lz1/i;->i:[F

    iget v1, p1, Lz1/i;->e:I

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    invoke-virtual {p0, p1}, Lz1/h;->F(Lz1/i;)V

    return-void
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lz1/h;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lz1/b;->b:F

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Lz1/h;->j:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " goal -> ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz1/b;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ") : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lz1/h;->j:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lz1/h;->h:[Lz1/i;

    aget-object v2, v2, v1

    iget-object v3, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v3, v2}, Lz1/h$b;->b(Lz1/i;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz1/h;->k:Lz1/h$b;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
