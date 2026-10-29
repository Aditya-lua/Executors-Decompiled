.class public final Ldr/r;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldr/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Landroidx/recyclerview/widget/RecyclerView$f0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0011\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Ldr/r;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Landroidx/recyclerview/widget/RecyclerView$f0;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;",
        "helpBottomSheetComponentStyle",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V",
        "",
        "Ldr/s;",
        "tips",
        "",
        "G",
        "(Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "t",
        "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;",
        "holder",
        "position",
        "r",
        "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V",
        "e",
        "()I",
        "Ljq/e;",
        "d",
        "Ljq/e;",
        "adapterHelper",
        "a",
        "ui-step-renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Ldr/r$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final d:Ljq/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljq/e<",
            "Ldr/s;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ldr/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldr/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldr/r;->e:Ldr/r$a;

    const-string v0, "#020A9B"

    const-string v1, "#02089B"

    const-string v2, "#02099C"

    const-string v3, "#030A9C"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ldr/r;->f:[Ljava/lang/String;

    const-string v0, "#D2D4FF"

    const-string v1, "#7379FC"

    const-string v2, "#D3D5FF"

    const-string v3, "#D4D6FF"

    const-string v4, "#D3D6FF"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ldr/r;->g:[Ljava/lang/String;

    const-string v0, "#7379FD"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ldr/r;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V
    .locals 6
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    new-instance v0, Ljq/e;

    new-instance v1, Ldr/p;

    invoke-direct {v1}, Ldr/p;-><init>()V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ljq/e;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v1, Ldr/s;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    sget-object v3, Ldr/r$b;->a:Ldr/r$b;

    new-instance v4, Ldr/q;

    invoke-direct {v4, p1}, Ldr/q;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V

    const-class p1, Lnq/e;

    invoke-static {p1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-virtual/range {v0 .. v5}, Ljq/e;->j(Lhu/c;Lhu/c;Lzt/n;Lzt/n;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Ldr/r;->d:Ljq/e;

    return-void
.end method

.method public static synthetic C(Ldr/s;Ldr/s;)Z
    .locals 0

    invoke-static {p0, p1}, Ldr/r;->E(Ldr/s;Ldr/s;)Z

    move-result p0

    return p0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;Ldr/s;Lnq/e;Landroidx/recyclerview/widget/RecyclerView$f0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldr/r;->F(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;Ldr/s;Lnq/e;Landroidx/recyclerview/widget/RecyclerView$f0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Ldr/s;Ldr/s;)Z
    .locals 2

    const-string v0, "old"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ldr/s;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ldr/s;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldr/s;->b()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1}, Ldr/s;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final F(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;Ldr/s;Lnq/e;Landroidx/recyclerview/widget/RecyclerView$f0;)Lkotlin/Unit;
    .locals 11

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewBinding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p2, Lnq/e;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Ldr/s;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;->getHelpTextviewStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;

    move-result-object p3

    if-eqz p3, :cond_0

    iget-object v0, p2, Lnq/e;->b:Landroid/widget/TextView;

    const-string v1, "description"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljr/e0;->c:Ljr/e0;

    invoke-static {v1}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, p3, v1}, Ljr/h0;->k(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;)V

    :cond_0
    invoke-virtual {p1}, Ldr/s;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p2, Lnq/e;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    if-eqz p0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;->getStrokeColorValue()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;->getFillColorValue()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Ldr/r;->f:[Ljava/lang/String;

    sget-object v6, Ldr/r;->g:[Ljava/lang/String;

    sget-object v8, Ldr/r;->h:[Ljava/lang/String;

    const/16 v9, 0x44

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v10}, Ljr/g;->m(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->v()V

    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final G(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldr/s;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tips"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldr/r;->d:Ljq/e;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Ljq/e;->t(Ljq/e;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Ldr/r;->d:Ljq/e;

    invoke-virtual {v0}, Ljq/e;->m()I

    move-result v0

    return v0
.end method

.method public r(Landroidx/recyclerview/widget/RecyclerView$f0;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldr/r;->d:Ljq/e;

    invoke-virtual {v0, p1, p2}, Ljq/e;->q(Landroidx/recyclerview/widget/RecyclerView$f0;I)V

    return-void
.end method

.method public t(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldr/r;->d:Ljq/e;

    invoke-virtual {v0, p1, p2}, Ljq/e;->r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;

    move-result-object p1

    return-object p1
.end method
