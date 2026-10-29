.class public Lw7/h$e;
.super Lw7/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public e:Landroid/graphics/Path;

.field public final synthetic f:Lw7/h;


# direct methods
.method public constructor <init>(Lw7/h;Landroid/graphics/Path;FF)V
    .locals 0

    iput-object p1, p0, Lw7/h$e;->f:Lw7/h;

    invoke-direct {p0, p1, p3, p4}, Lw7/h$f;-><init>(Lw7/h;FF)V

    iput-object p2, p0, Lw7/h$e;->e:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 13

    iget-object v0, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {v0}, Lw7/h;->b(Lw7/h;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {v0}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v0

    iget-boolean v0, v0, Lw7/h$h;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {v0}, Lw7/h;->d(Lw7/h;)Landroid/graphics/Canvas;

    move-result-object v1

    iget-object v3, p0, Lw7/h$e;->e:Landroid/graphics/Path;

    iget v4, p0, Lw7/h$f;->b:F

    iget v5, p0, Lw7/h$f;->c:F

    iget-object v0, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {v0}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v0

    iget-object v6, v0, Lw7/h$h;->d:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    iget-object p1, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {p1}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object p1

    iget-boolean p1, p1, Lw7/h$h;->c:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {p1}, Lw7/h;->d(Lw7/h;)Landroid/graphics/Canvas;

    move-result-object v7

    iget-object v9, p0, Lw7/h$e;->e:Landroid/graphics/Path;

    iget v10, p0, Lw7/h$f;->b:F

    iget v11, p0, Lw7/h$f;->c:F

    iget-object p1, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {p1}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object p1

    iget-object v12, p1, Lw7/h$h;->e:Landroid/graphics/Paint;

    move-object v8, v2

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    move-object v2, p1

    :cond_2
    :goto_1
    iget p1, p0, Lw7/h$f;->b:F

    iget-object v0, p0, Lw7/h$e;->f:Lw7/h;

    invoke-static {v0}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v0

    iget-object v0, v0, Lw7/h$h;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    add-float/2addr p1, v0

    iput p1, p0, Lw7/h$f;->b:F

    return-void
.end method
