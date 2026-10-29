.class public abstract Lxh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/w0;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lcom/roblox/client/RbxKeyboard;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.glview.text"

    iput-object v0, p0, Lxh/a;->a:Ljava/lang/String;

    iput-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const v0, 0x10000004

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lcom/roblox/client/RbxKeyboard;->f()V

    return-void
.end method


# virtual methods
.method public f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public g()F
    .locals 1

    invoke-virtual {p0}, Lxh/a;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lel/a;->e(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v0

    return-wide v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lq/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lxh/a;->b:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->k()V

    return-void
.end method
