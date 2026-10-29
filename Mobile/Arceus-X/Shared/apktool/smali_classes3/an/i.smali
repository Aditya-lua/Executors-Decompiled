.class public final Lan/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OuterT:",
        "Ljava/lang/Object;",
        "InnerT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lan/a0<",
        "TOuterT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0008\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00080\t0\u0007\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012B\u0008\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\u0007j\u0008\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B{\u0008\u0016\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012B\u0008\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\u0007j\u0008\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0008\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00080\t0\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\u0007j\u0008\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lan/i;",
        "",
        "OuterT",
        "InnerT",
        "Lan/a0;",
        "Lhu/c;",
        "type",
        "Lkotlin/Function2;",
        "Lan/y;",
        "Lkotlin/Pair;",
        "map",
        "Lan/f0;",
        "viewStarter",
        "Lkotlin/Function4;",
        "Landroid/view/View;",
        "",
        "Lcom/squareup/workflow1/ui/ViewShowRendering;",
        "doShowRendering",
        "<init>",
        "(Lhu/c;Lkotlin/jvm/functions/Function2;Lan/f0;Lzt/o;)V",
        "Lkotlin/Function1;",
        "(Lhu/c;Lkotlin/jvm/functions/Function1;Lan/f0;Lzt/o;)V",
        "initialRendering",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "a",
        "(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "Lhu/c;",
        "getType",
        "()Lhu/c;",
        "b",
        "Lkotlin/jvm/functions/Function2;",
        "c",
        "Lan/f0;",
        "d",
        "Lzt/o;",
        "wf1-core-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lhu/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhu/c<",
            "TOuterT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TOuterT;",
            "Lan/y;",
            "Lkotlin/Pair<",
            "TInnerT;",
            "Lan/y;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lan/f0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lzt/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/o<",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function2<",
            "-TInnerT;-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;TOuterT;",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhu/c;Lkotlin/jvm/functions/Function1;Lan/f0;Lzt/o;)V
    .locals 1
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lan/f0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lzt/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu/c<",
            "TOuterT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TOuterT;+TInnerT;>;",
            "Lan/f0;",
            "Lzt/o<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function2<",
            "-TInnerT;-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;-TOuterT;-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doShowRendering"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lan/i$b;

    invoke-direct {v0, p2}, Lan/i$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 9
    invoke-direct {p0, p1, v0, p3, p4}, Lan/i;-><init>(Lhu/c;Lkotlin/jvm/functions/Function2;Lan/f0;Lzt/o;)V

    return-void
.end method

.method public synthetic constructor <init>(Lhu/c;Lkotlin/jvm/functions/Function1;Lan/f0;Lzt/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 6
    new-instance p4, Lan/i$a;

    invoke-direct {p4, p2}, Lan/i$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lan/i;-><init>(Lhu/c;Lkotlin/jvm/functions/Function1;Lan/f0;Lzt/o;)V

    return-void
.end method

.method public constructor <init>(Lhu/c;Lkotlin/jvm/functions/Function2;Lan/f0;Lzt/o;)V
    .locals 1
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lan/f0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lzt/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu/c<",
            "TOuterT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TOuterT;-",
            "Lan/y;",
            "+",
            "Lkotlin/Pair<",
            "+TInnerT;",
            "Lan/y;",
            ">;>;",
            "Lan/f0;",
            "Lzt/o<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function2<",
            "-TInnerT;-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;-TOuterT;-",
            "Lan/y;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doShowRendering"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lan/i;->a:Lhu/c;

    .line 3
    iput-object p2, p0, Lan/i;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    iput-object p3, p0, Lan/i;->c:Lan/f0;

    .line 5
    iput-object p4, p0, Lan/i;->d:Lzt/o;

    return-void
.end method

.method public static final synthetic b(Lan/i;)Lzt/o;
    .locals 0

    iget-object p0, p0, Lan/i;->d:Lzt/o;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOuterT;",
            "Lan/y;",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initialRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextForNewView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lan/i;->b:Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/Pair;

    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lan/y;

    sget-object p2, Lan/c0;->a:Lan/c0$a;

    invoke-virtual {v2, p2}, Lan/y;->a(Lan/z;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lan/c0;

    iget-object v5, p0, Lan/i;->c:Lan/f0;

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lan/d0;->c(Lan/c0;Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;Lan/f0;)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lan/e0;->d(Landroid/view/View;)Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance p4, Lan/i$c;

    invoke-direct {p4, p0, p2, p3}, Lan/i$c;-><init>(Lan/i;Landroid/view/View;Lkotlin/jvm/functions/Function2;)V

    invoke-static {p2, p1, v2, p4}, Lan/e0;->a(Landroid/view/View;Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;)V

    return-object p2
.end method

.method public getType()Lhu/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhu/c<",
            "TOuterT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lan/i;->a:Lhu/c;

    return-object v0
.end method
