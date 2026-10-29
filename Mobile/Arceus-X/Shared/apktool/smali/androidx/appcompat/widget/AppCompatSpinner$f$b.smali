.class public Landroidx/appcompat/widget/AppCompatSpinner$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$f;->k(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/AppCompatSpinner$f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$f;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$f$b;->a:Landroidx/appcompat/widget/AppCompatSpinner$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$f$b;->a:Landroidx/appcompat/widget/AppCompatSpinner$f;

    iget-object v1, v0, Landroidx/appcompat/widget/AppCompatSpinner$f;->M:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$f;->U(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$f$b;->a:Landroidx/appcompat/widget/AppCompatSpinner$f;

    invoke-virtual {v0}, Lq/o0;->dismiss()V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$f$b;->a:Landroidx/appcompat/widget/AppCompatSpinner$f;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner$f;->S()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$f$b;->a:Landroidx/appcompat/widget/AppCompatSpinner$f;

    invoke-static {v0}, Landroidx/appcompat/widget/AppCompatSpinner$f;->R(Landroidx/appcompat/widget/AppCompatSpinner$f;)V

    return-void
.end method
