.class public Li7/o$a;
.super Lt7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/o;->s(Lt7/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt7/c<",
        "Ll7/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lt7/b;

.field public final synthetic e:Lt7/c;

.field public final synthetic f:Ll7/b;

.field public final synthetic g:Li7/o;


# direct methods
.method public constructor <init>(Li7/o;Lt7/b;Lt7/c;Ll7/b;)V
    .locals 0

    iput-object p2, p0, Li7/o$a;->d:Lt7/b;

    iput-object p3, p0, Li7/o$a;->e:Lt7/c;

    iput-object p4, p0, Li7/o$a;->f:Ll7/b;

    iput-object p1, p0, Li7/o$a;->g:Li7/o;

    invoke-direct {p0}, Lt7/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lt7/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li7/o$a;->d(Lt7/b;)Ll7/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lt7/b;)Ll7/b;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/b<",
            "Ll7/b;",
            ">;)",
            "Ll7/b;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Li7/o$a;->d:Lt7/b;

    invoke-virtual/range {p1 .. p1}, Lt7/b;->f()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lt7/b;->a()F

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lt7/b;->g()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll7/b;

    iget-object v4, v4, Ll7/b;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lt7/b;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll7/b;

    iget-object v5, v5, Ll7/b;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lt7/b;->d()F

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lt7/b;->c()F

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lt7/b;->e()F

    move-result v8

    invoke-virtual/range {v1 .. v8}, Lt7/b;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)Lt7/b;

    iget-object v1, v0, Li7/o$a;->e:Lt7/c;

    iget-object v2, v0, Li7/o$a;->d:Lt7/b;

    invoke-virtual {v1, v2}, Lt7/c;->a(Lt7/b;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lt7/b;->c()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lt7/b;->b()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ll7/b;

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lt7/b;->g()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    iget-object v2, v0, Li7/o$a;->f:Ll7/b;

    iget-object v4, v1, Ll7/b;->b:Ljava/lang/String;

    iget v5, v1, Ll7/b;->c:F

    iget-object v6, v1, Ll7/b;->d:Ll7/b$a;

    iget v7, v1, Ll7/b;->e:I

    iget v8, v1, Ll7/b;->f:F

    iget v9, v1, Ll7/b;->g:F

    iget v10, v1, Ll7/b;->h:I

    iget v11, v1, Ll7/b;->i:I

    iget v12, v1, Ll7/b;->j:F

    iget-boolean v13, v1, Ll7/b;->k:Z

    iget-object v14, v1, Ll7/b;->l:Landroid/graphics/PointF;

    iget-object v15, v1, Ll7/b;->m:Landroid/graphics/PointF;

    invoke-virtual/range {v2 .. v15}, Ll7/b;->a(Ljava/lang/String;Ljava/lang/String;FLl7/b$a;IFFIIFZLandroid/graphics/PointF;Landroid/graphics/PointF;)V

    iget-object v1, v0, Li7/o$a;->f:Ll7/b;

    return-object v1
.end method
