.class public Lf4/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/c0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/r0;

.field public final synthetic b:Lf4/c0;


# direct methods
.method public constructor <init>(Lf4/c0;Lf4/r0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf4/c0$a;->b:Lf4/c0;

    iput-object p2, p0, Lf4/c0$a;->a:Lf4/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lf4/c0$a;->a:Lf4/r0;

    invoke-virtual {p1}, Lf4/r0;->k()Lf4/q;

    move-result-object p1

    iget-object v0, p0, Lf4/c0$a;->a:Lf4/r0;

    invoke-virtual {v0}, Lf4/r0;->m()V

    iget-object p1, p1, Lf4/q;->K:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lf4/c0$a;->b:Lf4/c0;

    iget-object v0, v0, Lf4/c0;->a:Lf4/k0;

    invoke-static {p1, v0}, Lf4/c1;->u(Landroid/view/ViewGroup;Lf4/k0;)Lf4/c1;

    move-result-object p1

    invoke-virtual {p1}, Lf4/c1;->q()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
