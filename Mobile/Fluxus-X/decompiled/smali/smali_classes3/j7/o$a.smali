.class public Lj7/o$a;
.super Lu7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/o;->s(Lu7/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu7/c<",
        "Lm7/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lu7/b;

.field public final synthetic e:Lu7/c;

.field public final synthetic f:Lm7/b;

.field public final synthetic g:Lj7/o;


# direct methods
.method public constructor <init>(Lj7/o;Lu7/b;Lu7/c;Lm7/b;)V
    .locals 0

    iput-object p2, p0, Lj7/o$a;->d:Lu7/b;

    iput-object p3, p0, Lj7/o$a;->e:Lu7/c;

    iput-object p4, p0, Lj7/o$a;->f:Lm7/b;

    iput-object p1, p0, Lj7/o$a;->g:Lj7/o;

    invoke-direct {p0}, Lu7/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu7/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj7/o$a;->d(Lu7/b;)Lm7/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lu7/b;)Lm7/b;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/b<",
            "Lm7/b;",
            ">;)",
            "Lm7/b;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lj7/o$a;->d:Lu7/b;

    invoke-virtual/range {p1 .. p1}, Lu7/b;->f()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lu7/b;->a()F

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lu7/b;->g()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm7/b;

    iget-object v4, v4, Lm7/b;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lu7/b;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm7/b;

    iget-object v5, v5, Lm7/b;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lu7/b;->d()F

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lu7/b;->c()F

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lu7/b;->e()F

    move-result v8

    invoke-virtual/range {v1 .. v8}, Lu7/b;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)Lu7/b;

    iget-object v1, v0, Lj7/o$a;->e:Lu7/c;

    iget-object v2, v0, Lj7/o$a;->d:Lu7/b;

    invoke-virtual {v1, v2}, Lu7/c;->a(Lu7/b;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lu7/b;->c()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lu7/b;->b()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lm7/b;

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lu7/b;->g()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    iget-object v2, v0, Lj7/o$a;->f:Lm7/b;

    iget-object v4, v1, Lm7/b;->b:Ljava/lang/String;

    iget v5, v1, Lm7/b;->c:F

    iget-object v6, v1, Lm7/b;->d:Lm7/b$a;

    iget v7, v1, Lm7/b;->e:I

    iget v8, v1, Lm7/b;->f:F

    iget v9, v1, Lm7/b;->g:F

    iget v10, v1, Lm7/b;->h:I

    iget v11, v1, Lm7/b;->i:I

    iget v12, v1, Lm7/b;->j:F

    iget-boolean v13, v1, Lm7/b;->k:Z

    iget-object v14, v1, Lm7/b;->l:Landroid/graphics/PointF;

    iget-object v15, v1, Lm7/b;->m:Landroid/graphics/PointF;

    invoke-virtual/range {v2 .. v15}, Lm7/b;->a(Ljava/lang/String;Ljava/lang/String;FLm7/b$a;IFFIIFZLandroid/graphics/PointF;Landroid/graphics/PointF;)V

    iget-object v1, v0, Lj7/o$a;->f:Lm7/b;

    return-object v1
.end method
