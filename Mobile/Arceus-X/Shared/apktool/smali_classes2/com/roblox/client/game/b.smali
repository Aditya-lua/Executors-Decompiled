.class public Lcom/roblox/client/game/b;
.super Lxh/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/content/ComponentCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/b$d;,
        Lcom/roblox/client/game/b$b;,
        Lcom/roblox/client/game/b$c;
    }
.end annotation


# instance fields
.field public final c:Z

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:Lnk/b;

.field public h:Lwh/i0;

.field public i:Lcom/roblox/client/game/ExperienceSession$f;

.field public j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field public k:Lcom/roblox/client/game/b$d;

.field public l:Landroid/os/Handler;

.field public m:J

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:I

.field public s:I

.field public t:Lcom/roblox/client/game/b$b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;Lwh/i0;Lcom/roblox/client/game/ExperienceSession$f;)V
    .locals 2

    invoke-direct {p0, p1}, Lxh/a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/roblox/client/game/b;->c:Z

    const/16 v0, 0xc

    iput v0, p0, Lcom/roblox/client/game/b;->d:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/roblox/client/game/b;->e:I

    const v0, 0xfa00

    iput v0, p0, Lcom/roblox/client/game/b;->f:I

    new-instance v0, Lcom/roblox/client/game/b$d;

    const-string v1, "rbx.glview.text"

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/game/b$d;-><init>(Lcom/roblox/client/game/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roblox/client/game/b;->k:Lcom/roblox/client/game/b$d;

    iput p1, p0, Lcom/roblox/client/game/b;->n:I

    iput p1, p0, Lcom/roblox/client/game/b;->o:I

    iput-boolean p1, p0, Lcom/roblox/client/game/b;->p:Z

    iput-boolean p1, p0, Lcom/roblox/client/game/b;->q:Z

    iput p1, p0, Lcom/roblox/client/game/b;->r:I

    iput p1, p0, Lcom/roblox/client/game/b;->s:I

    new-instance p1, Lcom/roblox/client/game/b$b;

    invoke-direct {p1, p0, v1}, Lcom/roblox/client/game/b$b;-><init>(Lcom/roblox/client/game/b;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/roblox/client/game/b;->t:Lcom/roblox/client/game/b$b;

    iput-object p2, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    iput-object p3, p0, Lcom/roblox/client/game/b;->i:Lcom/roblox/client/game/ExperienceSession$f;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/roblox/client/game/b;->l:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic k(Lcom/roblox/client/game/b;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/game/b;->r:I

    return p0
.end method

.method public static bridge synthetic l(Lcom/roblox/client/game/b;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/game/b;->s:I

    return p0
.end method

.method public static bridge synthetic m(Lcom/roblox/client/game/b;)Lnk/b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/b;->g:Lnk/b;

    return-object p0
.end method

.method public static bridge synthetic n(Lcom/roblox/client/game/b;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/b;->l:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/roblox/client/game/b;I)V
    .locals 0

    iput p1, p0, Lcom/roblox/client/game/b;->r:I

    return-void
.end method

.method public static bridge synthetic p(Lcom/roblox/client/game/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/game/b;->p:Z

    return-void
.end method

.method public static bridge synthetic q(Lcom/roblox/client/game/b;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->z(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic r(Lcom/roblox/client/game/b;Lnk/b;F)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/b;->D(Lnk/b;F)V

    return-void
.end method

.method public static bridge synthetic s(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->M(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public static bridge synthetic t(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->N(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public static synthetic u(Lcom/roblox/client/game/b;)F
    .locals 0

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result p0

    return p0
.end method

.method public static synthetic v(Lcom/roblox/client/game/b;)Lcom/roblox/client/RbxKeyboard;
    .locals 0

    iget-object p0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    return-object p0
.end method

.method public static synthetic w(Lcom/roblox/client/game/b;)F
    .locals 0

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result p0

    return p0
.end method


# virtual methods
.method public final A(FF)F
    .locals 0

    mul-float/2addr p1, p2

    return p1
.end method

.method public B()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v0}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Lock screen: ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/roblox/client/game/b;->z(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/roblox/client/game/b;->C(Landroid/view/View;II)V

    return-void
.end method

.method public final C(Landroid/view/View;II)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x1

    if-eq v1, p2, :cond_0

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move p2, v2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v1, p3, :cond_1

    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method public final D(Lnk/b;F)V
    .locals 8

    iget v0, p1, Lnk/b;->e:I

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-le v0, v1, :cond_7

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGetTextBoxInfo()Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v3, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v0, :cond_1

    iget v4, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-eqz v0, :cond_2

    iget v5, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v6, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    goto :goto_3

    :cond_3
    move v6, v1

    :goto_3
    if-eqz v0, :cond_4

    iget v1, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "textbox pos/size/fontSize: ("

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->z(Ljava/lang/String;)V

    add-float/2addr v6, v4

    invoke-virtual {p0, v6, p2}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v0

    iget v3, p1, Lnk/b;->b:I

    int-to-float v3, v3

    cmpl-float v3, v0, v3

    if-ltz v3, :cond_5

    add-float/2addr v4, v1

    iget v0, p1, Lnk/b;->f:I

    int-to-float v0, v0

    invoke-virtual {p0, v4, p2}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v1

    sub-float/2addr v0, v1

    goto :goto_4

    :cond_5
    iget v1, p1, Lnk/b;->f:I

    int-to-float v1, v1

    sub-float v0, v1, v0

    :goto_4
    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {p0, v1, p2}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v1

    sub-float v3, v0, v1

    float-to-int v3, v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "margin:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " delta:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " adjustment:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->z(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Y3()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->J(I)V

    goto :goto_5

    :cond_6
    if-gez v3, :cond_8

    invoke-virtual {p0, v3}, Lcom/roblox/client/game/b;->J(I)V

    goto :goto_5

    :cond_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->o1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0, v2}, Lcom/roblox/client/game/b;->x(I)V

    :cond_8
    :goto_5
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U4()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/b;->E(Lnk/b;F)V

    :cond_9
    return-void
.end method

.method public E(Lnk/b;F)V
    .locals 6

    iget v0, p1, Lnk/b;->e:I

    const/16 v1, 0xa

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-le v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->U4()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->p:Z

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/roblox/client/game/b;->r:I

    :goto_1
    iget v4, p1, Lnk/b;->f:I

    sub-int/2addr v4, v1

    invoke-virtual {p0, v4, p2}, Lcom/roblox/client/game/b;->F(IF)F

    move-result v1

    :goto_2
    float-to-int v1, v1

    goto :goto_3

    :cond_2
    iget v1, p1, Lnk/b;->f:I

    invoke-virtual {p0, v1, p2}, Lcom/roblox/client/game/b;->F(IF)F

    move-result v1

    goto :goto_2

    :goto_3
    iget-object v4, p1, Lnk/b;->a:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, v4, p2}, Lcom/roblox/client/game/b;->F(IF)F

    move-result v4

    float-to-int v4, v4

    iget p1, p1, Lnk/b;->e:I

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/b;->F(IF)F

    move-result p1

    float-to-int p1, p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onUpdateKeyboardSize() v:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " x:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " y:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " w:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " h:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v5, "rbx.glview.text"

    invoke-static {v5, p2}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_3

    invoke-static {v2, v3, v1, v4, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    return-void

    :cond_3
    invoke-static {v3, v3, v1, v4, v3}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    return-void
.end method

.method public final F(IF)F
    .locals 0

    int-to-float p1, p1

    div-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    return p1
.end method

.method public G()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v0}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/o0;->H0(Landroid/view/View;Landroidx/core/view/d1$b;)V

    return-void
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v0}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, v1}, Lcom/roblox/client/game/b;->C(Landroid/view/View;II)V

    return-void
.end method

.method public final I(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/game/b;->k:Lcom/roblox/client/game/b$d;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->H5()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Leh/b;->e(Ljava/lang/Object;J)V

    :cond_0
    return-void
.end method

.method public final J(I)V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/game/b;->t:Lcom/roblox/client/game/b$b;

    new-instance v1, Lcom/roblox/client/game/b$c;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/game/b$c;-><init>(Lcom/roblox/client/game/b;I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->p1()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Leh/b;->e(Ljava/lang/Object;J)V

    iput p1, p0, Lcom/roblox/client/game/b;->s:I

    return-void
.end method

.method public K(J)V
    .locals 0

    iput-wide p1, p0, Lcom/roblox/client/game/b;->m:J

    return-void
.end method

.method public final L(FFFF)V
    .locals 2

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v1

    invoke-virtual {p0, p1, v1}, Lcom/roblox/client/game/b;->A(FF)F

    move-result p1

    invoke-virtual {p0, p2, v1}, Lcom/roblox/client/game/b;->A(FF)F

    move-result p2

    invoke-virtual {p0, p3, v1}, Lcom/roblox/client/game/b;->A(FF)F

    move-result p3

    invoke-virtual {p0, p4, v1}, Lcom/roblox/client/game/b;->A(FF)F

    move-result p4

    float-to-int p2, p2

    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    float-to-int p2, p3

    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    float-to-int p2, p4

    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    float-to-int p1, p1

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final M(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 5

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iget v3, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/roblox/client/game/b;->L(FFFF)V

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v0

    iget-object v1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingLeft:F

    invoke-virtual {p0, v2, v0}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v2

    float-to-int v2, v2

    iget v3, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingTop:F

    invoke-virtual {p0, v3, v0}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v3

    float-to-int v3, v3

    iget v4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingRight:F

    invoke-virtual {p0, v4, v0}, Lcom/roblox/client/game/b;->A(FF)F

    move-result v4

    float-to-int v4, v4

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingBottom:F

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/game/b;->A(FF)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v1, v2, v3, v4, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final N(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1}, Lcom/roblox/client/RbxKeyboard;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/roblox/client/RbxKeyboard;->m(IFF)V

    :cond_0
    return-void
.end method

.method public a()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->o1()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "rbx.glview.text"

    const-string v1, "hideKeyboard()"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->J(I)V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 4

    iput-object p5, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-virtual {p0}, Lcom/roblox/client/game/b;->B()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKeyboard() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.text"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const v2, 0xfa00

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/text/InputFilter;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/RbxKeyboard;->setCurrentTextBox(J)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->D2()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, p5, p4}, Lcom/roblox/client/RbxKeyboard;->i(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_2

    iget-object p1, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    const/high16 p2, -0x3cea0000    # -150.0f

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    iget p4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-virtual {p0, p3, p2, p4, p1}, Lcom/roblox/client/game/b;->L(FFFF)V

    goto :goto_0

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    const/high16 p4, 0x41200000    # 10.0f

    invoke-virtual {p0, p3, p2, p1, p4}, Lcom/roblox/client/game/b;->L(FFFF)V

    :goto_0
    iget-object p1, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->I(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    :cond_2
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->f0()Z

    move-result p1

    const/4 p2, 0x2

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    iget-boolean p1, p5, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->editable:Z

    if-eqz p1, :cond_5

    :cond_3
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-static {p1, p2}, Lsg/e2;->k(Landroid/view/View;I)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-static {p1, p2}, Lsg/e2;->k(Landroid/view/View;I)V

    :cond_5
    :goto_1
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lq/l;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    invoke-virtual {p0}, Lxh/a;->j()V

    return-void
.end method

.method public c()V
    .locals 3

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGetTextBoxInfo()Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onLuaTextBoxPropertyChanged() x:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " y:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " width:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " height:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " fontSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.glview.text"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/b;->I(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    :cond_0
    iput-object v0, p0, Lcom/roblox/client/game/b;->j:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lxh/a;->i(Ljava/lang/String;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->h()V

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const-string p1, "rbx.glview.text"

    const-string v0, "Configuration change detected"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/game/b;->H()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->o1()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lxh/a;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    invoke-virtual {p0}, Lcom/roblox/client/game/b;->a()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {p1}, Lwh/i0;->r()Landroid/view/SurfaceView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/roblox/client/game/b;->n:I

    iget-object p1, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {p1}, Lwh/i0;->r()Landroid/view/SurfaceView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/roblox/client/game/b;->o:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b;->x(I)V

    iput p1, p0, Lcom/roblox/client/game/b;->r:I

    return-void
.end method

.method public onGlobalLayout()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/game/b;->i:Lcom/roblox/client/game/ExperienceSession$f;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession$f;->a()Lnk/b;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/game/b;->g:Lnk/b;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lnk/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    iput-object v0, p0, Lcom/roblox/client/game/b;->g:Lnk/b;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->o1()Z

    move-result v1

    const-string v2, "rbx.glview.text"

    if-eqz v1, :cond_3

    const-string v1, "onGlobalLayout()"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lxh/a;->f()Landroid/content/Context;

    move-result-object v1

    const-string v3, "input_method"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v1}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v4, p0, Lcom/roblox/client/game/b;->n:I

    if-ne v3, v4, :cond_2

    iget v4, p0, Lcom/roblox/client/game/b;->o:I

    if-eq v1, v4, :cond_3

    :cond_2
    iput v3, p0, Lcom/roblox/client/game/b;->n:I

    iput v1, p0, Lcom/roblox/client/game/b;->o:I

    invoke-virtual {p0}, Lcom/roblox/client/game/b;->B()V

    :cond_3
    iget v1, v0, Lnk/b;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Keyboard height: %d"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, p0, Lcom/roblox/client/game/b;->q:Z

    iget v3, v0, Lnk/b;->e:I

    const/16 v4, 0xa

    const/4 v5, 0x0

    if-le v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    move v3, v5

    :goto_0
    iput-boolean v3, p0, Lcom/roblox/client/game/b;->q:Z

    if-eqz v1, :cond_5

    if-nez v3, :cond_5

    const-string v1, "Remove view shift on keyboard close"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v5}, Lcom/roblox/client/game/b;->J(I)V

    :cond_5
    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/game/b;->D(Lnk/b;F)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->U4()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/game/b;->E(Lnk/b;F)V

    :cond_6
    :goto_1
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public x(I)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v0}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    if-eq v2, p1, :cond_0

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public y()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/game/b;->h:Lwh/i0;

    invoke-virtual {v0}, Lwh/i0;->k()Landroid/widget/FrameLayout;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/game/b$a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/roblox/client/game/b$a;-><init>(Lcom/roblox/client/game/b;I)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->H0(Landroid/view/View;Landroidx/core/view/d1$b;)V

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
