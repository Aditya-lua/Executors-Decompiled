.class public final Lcom/withpersona/sdk2/inquiry/ui/g$b;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/g;->u0(Lar/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/ui/g$b",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;",
        "Landroid/view/View;",
        "bottomSheet",
        "",
        "newState",
        "",
        "c",
        "(Landroid/view/View;I)V",
        "",
        "slideOffset",
        "b",
        "(Landroid/view/View;F)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroidx/core/widget/NestedScrollView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/g;",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroidx/core/widget/NestedScrollView;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 4

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;

    move-result-object p1

    iget-object p1, p1, Lpr/a;->h:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u0()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    mul-float/2addr p2, p1

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;

    move-result-object p1

    iget-object p1, p1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;

    move-result-object v0

    iget-object v0, v0, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;

    move-result-object v1

    iget-object v1, v1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/ui/g;->b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;

    move-result-object v2

    iget-object v2, v2, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g$b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u0()I

    move-result v3

    float-to-int p2, p2

    add-int/2addr v3, p2

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 0

    const-string p2, "bottomSheet"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
