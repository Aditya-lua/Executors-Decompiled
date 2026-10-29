.class public Lcom/roblox/client/components/RbxButton;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field public a:Lcom/roblox/client/components/RbxButton;

.field public b:Leh/f;

.field public c:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->a:Lcom/roblox/client/components/RbxButton;

    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->b:Leh/f;

    invoke-static {p0, p1, p2}, Leh/e;->c(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/components/RbxButton;->a(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)V
    .locals 1

    iput-object p0, p0, Lcom/roblox/client/components/RbxButton;->a:Lcom/roblox/client/components/RbxButton;

    new-instance v0, Leh/f;

    invoke-direct {v0, p0, p1}, Leh/f;-><init>(Landroid/view/View;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/roblox/client/components/RbxButton;->b:Leh/f;

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/roblox/client/components/RbxButton;->b:Leh/f;

    invoke-virtual {v0, p1}, Leh/f;->i(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxButton;->b:Leh/f;

    invoke-virtual {v0, p1}, Leh/f;->l(Landroid/view/MotionEvent;)V

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object p1, p0, Lcom/roblox/client/components/RbxButton;->c:Landroid/view/View$OnClickListener;

    return-void
.end method
