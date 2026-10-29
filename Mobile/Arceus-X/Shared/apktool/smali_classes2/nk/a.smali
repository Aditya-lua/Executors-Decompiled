.class public abstract Lnk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnk/a$a;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lnk/b;

.field public c:Lnk/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnk/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lnk/a;->c:Lnk/a$a;

    return-void
.end method


# virtual methods
.method public final a(IIIII)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "doUpdateAppUISizes() vw:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " tbh:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bm:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " rm:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.layout"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, p2, p3, p4, p5}, Lcom/roblox/engine/jni/NativeGLInterface;->updateAppUISizes(IIIII)V

    return-void
.end method

.method public abstract b()Lnk/b;
.end method

.method public c(Lnk/b;Z)V
    .locals 7

    if-nez p1, :cond_0

    :goto_0
    move-object v1, p0

    goto :goto_2

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lnk/a;->b:Lnk/b;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lnk/b;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iput-object p1, p0, Lnk/a;->b:Lnk/b;

    :try_start_0
    iget-object p2, p0, Lnk/a;->a:Landroid/content/Context;

    invoke-static {p2}, Lel/a;->e(Landroid/content/Context;)F

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p1, Lnk/b;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, v0, p2}, Lnk/a;->f(IF)I

    move-result v5

    iget v0, p1, Lnk/b;->f:I

    invoke-virtual {p0, v0, p2}, Lnk/a;->f(IF)I

    move-result v4

    iget v0, p1, Lnk/b;->e:I

    if-lez v0, :cond_2

    const/4 v3, 0x0

    invoke-virtual {p0, v0, p2}, Lnk/a;->f(IF)I

    move-result v6

    const/4 v2, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lnk/a;->e(ZIIII)V

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lnk/a;->e(ZIIII)V

    :goto_1
    invoke-virtual {p0}, Lnk/a;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_2
    return-void

    :cond_3
    iget v0, p1, Lnk/b;->c:I

    invoke-virtual {p0, v0, p2}, Lnk/a;->f(IF)I

    move-result v0

    iget v2, p1, Lnk/b;->g:I

    invoke-virtual {p0, v2, p2}, Lnk/a;->f(IF)I

    move-result v3

    iget p1, p1, Lnk/b;->d:I

    invoke-virtual {p0, p1, p2}, Lnk/a;->f(IF)I

    move-result v6

    iget-object p1, v1, Lnk/a;->c:Lnk/a$a;

    if-eqz p1, :cond_4

    iget p1, p1, Lnk/a$a;->a:I

    :goto_3
    move v4, p1

    move v2, v5

    move v5, v0

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual/range {v1 .. v6}, Lnk/a;->a(IIIII)V

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onGlobalLayout() exception:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.glview.layout"

    invoke-static {p2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d(Z)V
    .locals 1

    invoke-virtual {p0}, Lnk/a;->b()Lnk/b;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnk/a;->c(Lnk/b;Z)V

    return-void
.end method

.method public e(ZIIII)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onUpdateKeyboardSize() v:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " x:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " y:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " w:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " h:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.layout"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, p2, p3, p4, p5}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    return-void
.end method

.method public final f(IF)I
    .locals 2

    int-to-float p1, p1

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
