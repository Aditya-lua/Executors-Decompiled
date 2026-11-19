.class public final Le/d0;
.super Le/c0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Le/d0;",
        "Le/c0;",
        "<init>",
        "()V",
        "Le/u0;",
        "statusBarStyle",
        "navigationBarStyle",
        "Landroid/view/Window;",
        "window",
        "Landroid/view/View;",
        "view",
        "",
        "statusBarIsDark",
        "navigationBarIsDark",
        "",
        "a",
        "(Le/u0;Le/u0;Landroid/view/Window;Landroid/view/View;ZZ)V",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/u0;Le/u0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 16
    .param p1    # Le/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Le/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/Window;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    const-string v6, "statusBarStyle"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "navigationBarStyle"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "window"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "view"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-static {v2, v6}, Landroidx/core/view/c1;->b(Landroid/view/Window;Z)V

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    iget v8, v7, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v8, v8, 0x100

    const/4 v9, 0x1

    if-nez v8, :cond_0

    iget v8, v7, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v10, -0x2

    if-ne v8, v10, :cond_0

    iget v7, v7, Landroid/view/WindowManager$LayoutParams;->height:I

    if-eq v7, v10, :cond_1

    :cond_0
    invoke-virtual {v2, v6}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {v2, v6}, Landroid/view/Window;->setNavigationBarColor(I)V

    invoke-virtual {v0, v4}, Le/u0;->e(Z)I

    move-result v0

    invoke-virtual {v1, v5}, Le/u0;->e(Z)I

    move-result v7

    move-object v8, v3

    check-cast v8, Landroid/view/ViewGroup;

    new-instance v10, Lb3/d;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    new-instance v12, Lb3/a;

    const/4 v13, 0x2

    invoke-direct {v12, v13, v0}, Lb3/a;-><init>(II)V

    new-instance v0, Lb3/a;

    invoke-direct {v0, v9, v7}, Lb3/a;-><init>(II)V

    new-instance v13, Lb3/a;

    const/4 v14, 0x4

    invoke-direct {v13, v14, v7}, Lb3/a;-><init>(II)V

    new-instance v14, Lb3/a;

    const/16 v15, 0x8

    invoke-direct {v14, v15, v7}, Lb3/a;-><init>(II)V

    filled-new-array {v12, v0, v13, v14}, [Lb3/a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v10, v11, v0}, Lb3/d;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1}, Le/u0;->c()I

    move-result v0

    if-nez v0, :cond_2

    move v6, v9

    :cond_2
    invoke-virtual {v2, v6}, Landroid/view/Window;->setNavigationBarContrastEnforced(Z)V

    new-instance v0, Landroidx/core/view/l1;

    invoke-direct {v0, v2, v3}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    xor-int/lit8 v1, v4, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/view/l1;->d(Z)V

    xor-int/lit8 v1, v5, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/view/l1;->c(Z)V

    return-void
.end method
