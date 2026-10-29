.class public Lwh/q0;
.super Lxh/a;
.source "SourceFile"


# instance fields
.field public c:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 0

    invoke-direct {p0, p1}, Lxh/a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "rbx.glview.text"

    const-string v1, "hideKeyboard()"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->e()V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lwh/q0;->c:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

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

    if-eqz p3, :cond_1

    iput-object p5, p0, Lwh/q0;->c:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p0, p5, p1}, Lwh/q0;->k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->v1()Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez p5, :cond_2

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setInputType(I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const p2, 0x10000004

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setImeOptions(I)V

    :cond_2
    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lsg/e2;->k(Landroid/view/View;I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

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

    :cond_0
    iget-object v1, p0, Lwh/q0;->c:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iput-object v0, p0, Lwh/q0;->c:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget-object v1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p0, v0, v1}, Lwh/q0;->k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

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

.method public final k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Lwh/q0;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lcom/roblox/client/RbxKeyboard;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/roblox/client/RbxKeyboard;->m(IFF)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V
    .locals 6

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lxh/a;->g()F

    move-result v1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget v3, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    mul-float/2addr v3, v1

    if-eqz p1, :cond_1

    iget v4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    mul-float/2addr v4, v1

    if-eqz p1, :cond_2

    iget v5, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    goto :goto_2

    :cond_2
    move v5, v2

    :goto_2
    mul-float/2addr v5, v1

    if-eqz p1, :cond_3

    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    :cond_3
    mul-float/2addr v2, v1

    float-to-int v4, v4

    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    float-to-int v4, v5

    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    float-to-int v2, v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    float-to-int v2, v3

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p1, :cond_4

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingLeft:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingTop:F

    mul-float/2addr v2, v1

    float-to-int v2, v2

    iget v3, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingRight:F

    mul-float/2addr v3, v1

    float-to-int v3, v3

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->paddingBottom:F

    mul-float/2addr v1, p1

    float-to-int p1, v1

    invoke-virtual {p2, v0, v2, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :cond_4
    const/4 p1, 0x0

    invoke-virtual {p2, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
