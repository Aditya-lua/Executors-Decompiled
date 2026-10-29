.class public final Lan/d$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lzt/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lan/d;-><init>(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lzt/o<",
        "Landroid/view/View;",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Ljava/lang/Object;",
        "-",
        "Lan/y;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lan/d<",
        "*>;",
        "Lan/y;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u000c\u001a\u00020\u0006\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0008\u001a\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0008\u0012\u0004\u0012\u00020\u0000`\u00072\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0005H\n\u00a2\u0006\u0004\u0008\u000c\u0010\r"
    }
    d2 = {
        "",
        "W",
        "Landroid/view/View;",
        "view",
        "Lkotlin/Function2;",
        "Lan/y;",
        "",
        "Lcom/squareup/workflow1/ui/ViewShowRendering;",
        "innerShowRendering",
        "Lan/d;",
        "outerRendering",
        "viewEnvironment",
        "a",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lan/d;Lan/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final i:Lan/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lan/d$b;

    invoke-direct {v0}, Lan/d$b;-><init>()V

    sput-object v0, Lan/d$b;->i:Lan/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lan/d;Lan/y;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lan/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Object;",
            "-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;",
            "Lan/d<",
            "*>;",
            "Lan/y;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "innerShowRendering"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outerRendering"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lan/d;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lan/d;->b()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {p1, v0}, Lan/e;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    invoke-virtual {p3}, Lan/d;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lan/d;->c()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p3}, Lan/d;->b()Lkotlin/jvm/functions/Function0;

    move-result-object p2

    invoke-static {p1, p2}, Lan/e;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    check-cast p2, Lkotlin/jvm/functions/Function2;

    check-cast p3, Lan/d;

    check-cast p4, Lan/y;

    invoke-virtual {p0, p1, p2, p3, p4}, Lan/d$b;->a(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lan/d;Lan/y;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
