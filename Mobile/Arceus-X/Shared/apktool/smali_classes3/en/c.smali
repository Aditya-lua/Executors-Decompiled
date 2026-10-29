.class public final Len/c;
.super Lcom/squareup/workflow1/ui/modal/ModalContainer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Len/c$a;,
        Len/c$b;,
        Len/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/workflow1/ui/modal/ModalContainer<",
        "Len/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB;\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Len/c;",
        "Lcom/squareup/workflow1/ui/modal/ModalContainer;",
        "Len/e;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "",
        "defStyle",
        "defStyleRes",
        "dialogThemeResId",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;III)V",
        "initialModalRendering",
        "Lan/y;",
        "initialViewEnvironment",
        "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;",
        "g",
        "(Len/e;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;",
        "dialogRef",
        "",
        "d",
        "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V",
        "Len/e$a;",
        "h",
        "(Len/e$a;)I",
        "e",
        "I",
        "f",
        "a",
        "b",
        "wf1-container-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:Len/c$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Len/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Len/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Len/c;->f:Len/c$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;III)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/squareup/workflow1/ui/modal/ModalContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 3
    iput p5, p0, Len/c;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p7, 0x0

    if-eqz p2, :cond_1

    move v3, p7

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move v4, p7

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move v5, p7

    :goto_2
    move-object v0, p0

    move-object v1, p1

    goto :goto_3

    :cond_3
    move v5, p5

    goto :goto_2

    .line 1
    :goto_3
    invoke-direct/range {v0 .. v5}, Len/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;III)V

    return-void
.end method

.method public static synthetic e(Len/e;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Len/c;->i(Len/e;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic f(Len/e;Len/e$a;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Len/c;->j(Len/e;Len/e$a;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final i(Len/e;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "$rendering"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Len/e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    sget-object p1, Len/e$b$b;->a:Len/e$b$b;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Len/e;Len/e$a;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "$rendering"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$button"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Len/e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p2, Len/e$b$a;

    invoke-direct {p2, p1}, Len/e$b$a;-><init>(Len/e$a;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;
    .locals 0

    check-cast p1, Len/e;

    invoke-virtual {p0, p1, p2}, Len/c;->g(Len/e;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V
    .locals 8
    .param p1    # Lcom/squareup/workflow1/ui/modal/ModalContainer$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "Len/e;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dialogRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/workflow1/ui/modal/ModalContainer$a;->d()Landroid/app/Dialog;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/a;

    invoke-virtual {p1}, Lcom/squareup/workflow1/ui/modal/ModalContainer$a;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Len/e;

    invoke-virtual {p1}, Len/e;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Len/a;

    invoke-direct {v1, p1}, Len/a;-><init>(Len/e;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    :goto_0
    invoke-static {}, Len/e$a;->values()[Len/e$a;

    move-result-object v1

    array-length v3, v1

    :cond_1
    :goto_1
    if-ge v2, v3, :cond_4

    aget-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Len/e;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v4}, Len/c;->h(Len/e$a;)I

    move-result v6

    new-instance v7, Len/b;

    invoke-direct {v7, p1, v4}, Len/b;-><init>(Len/e;Len/e$a;)V

    invoke-virtual {v0, v6, v5, v7}, Landroidx/appcompat/app/a;->t(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_2
    if-nez v5, :cond_1

    invoke-virtual {p0, v4}, Len/c;->h(Len/e$a;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/a;->p(I)Landroid/widget/Button;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Len/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->u(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Len/e;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public g(Len/e;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;
    .locals 10
    .param p1    # Len/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Len/e;",
            "Lan/y;",
            ")",
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "Len/e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initialModalRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Len/c;->e:I

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v6

    const-string v0, "Builder(context, dialogThemeResId)\n      .create()"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/squareup/workflow1/ui/modal/ModalContainer$a;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v3 .. v9}, Lcom/squareup/workflow1/ui/modal/ModalContainer$a;-><init>(Ljava/lang/Object;Lan/y;Landroid/app/Dialog;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v3}, Len/c;->d(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V

    return-object v3
.end method

.method public final h(Len/e$a;)I
    .locals 1

    sget-object v0, Len/c$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_1
    const/4 p1, -0x2

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method
