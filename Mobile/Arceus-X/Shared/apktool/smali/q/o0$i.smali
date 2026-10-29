.class public Lq/o0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final synthetic a:Lq/o0;


# direct methods
.method public constructor <init>(Lq/o0;)V
    .locals 0

    iput-object p1, p0, Lq/o0$i;->a:Lq/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lq/o0$i;->a:Lq/o0;

    iget-object v0, v0, Lq/o0;->c:Lq/l0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq/o0$i;->a:Lq/o0;

    iget-object v0, v0, Lq/o0;->c:Lq/l0;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget-object v1, p0, Lq/o0$i;->a:Lq/o0;

    iget-object v1, v1, Lq/o0;->c:Lq/l0;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lq/o0$i;->a:Lq/o0;

    iget-object v0, v0, Lq/o0;->c:Lq/l0;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lq/o0$i;->a:Lq/o0;

    iget v2, v1, Lq/o0;->o:I

    if-gt v0, v2, :cond_0

    iget-object v0, v1, Lq/o0;->F:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v0, p0, Lq/o0$i;->a:Lq/o0;

    invoke-virtual {v0}, Lq/o0;->show()V

    :cond_0
    return-void
.end method
