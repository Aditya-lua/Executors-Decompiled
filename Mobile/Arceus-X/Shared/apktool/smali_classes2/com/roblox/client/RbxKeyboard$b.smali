.class public Lcom/roblox/client/RbxKeyboard$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/RbxKeyboard;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/RbxKeyboard;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onEditorAction() text:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "rbx.glview.text"

    invoke-static {p3, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p2}, Lcom/roblox/client/RbxKeyboard;->k()V

    iget-object p2, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p2}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide p2

    invoke-static {p2, p3}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReturnPressedFromOnScreenKeyboard(J)V

    iget-object p2, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p2}, Lcom/roblox/client/RbxKeyboard;->g()Z

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    return p3

    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    invoke-static {v0, v1, p2, p3, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassText(JLjava/lang/String;ZI)V

    iget-object p1, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lcom/roblox/client/RbxKeyboard;->e()V

    return p3
.end method
