.class public Lq/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/z;->onRestoreInstanceState(Landroid/os/Parcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lq/z;


# direct methods
.method public constructor <init>(Lq/z;)V
    .locals 0

    iput-object p1, p0, Lq/z$b;->a:Lq/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lq/z$b;->a:Lq/z;

    invoke-virtual {v0}, Lq/z;->getInternalPopup()Lq/z$h;

    move-result-object v0

    invoke-interface {v0}, Lq/z$h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/z$b;->a:Lq/z;

    invoke-virtual {v0}, Lq/z;->b()V

    :cond_0
    iget-object v0, p0, Lq/z$b;->a:Lq/z;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    return-void
.end method
