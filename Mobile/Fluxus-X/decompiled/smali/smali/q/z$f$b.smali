.class public Lq/z$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/z$f;->k(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lq/z$f;


# direct methods
.method public constructor <init>(Lq/z$f;)V
    .locals 0

    iput-object p1, p0, Lq/z$f$b;->a:Lq/z$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lq/z$f$b;->a:Lq/z$f;

    iget-object v1, v0, Lq/z$f;->M:Lq/z;

    invoke-virtual {v0, v1}, Lq/z$f;->U(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/z$f$b;->a:Lq/z$f;

    invoke-virtual {v0}, Lq/p0;->dismiss()V

    return-void

    :cond_0
    iget-object v0, p0, Lq/z$f$b;->a:Lq/z$f;

    invoke-virtual {v0}, Lq/z$f;->S()V

    iget-object v0, p0, Lq/z$f$b;->a:Lq/z$f;

    invoke-static {v0}, Lq/z$f;->R(Lq/z$f;)V

    return-void
.end method
