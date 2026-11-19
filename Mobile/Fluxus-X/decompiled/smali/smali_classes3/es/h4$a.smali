.class public final Les/h4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/h4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/b0<",
        "Les/s6$d$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J2\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Les/h4$a;",
        "Lnn/b0;",
        "Les/s6$d$a;",
        "<init>",
        "()V",
        "initialRendering",
        "Lnn/z;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "d",
        "(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "Lxu/c;",
        "getType",
        "()Lxu/c;",
        "type",
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
.field public final synthetic a:Lnn/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnn/f<",
            "Les/s6$d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnn/f;

    const-class v1, Les/s6$d$a;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    new-instance v2, Les/g4;

    invoke-direct {v2}, Les/g4;-><init>()V

    invoke-direct {v0, v1, v2}, Lnn/f;-><init>(Lxu/c;Lpu/o;)V

    iput-object v0, p0, Les/h4$a;->a:Lnn/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Les/h4$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Les/h4$a;->c(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const-string v0, "initialRendering"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    if-nez p3, :cond_1

    :cond_0
    move-object p3, p2

    :cond_1
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2}, Lfs/a;->c(Landroid/view/LayoutInflater;)Lfs/a;

    move-result-object p2

    invoke-virtual {p2}, Lfs/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p3

    const-string v0, "getRoot(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Les/h4$a$a;

    new-instance v1, Les/h4;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, p2, p0}, Les/h4;-><init>(Lfs/a;Les/s6$d$a;)V

    invoke-direct {v0, v1}, Les/h4$a$a;-><init>(Ljava/lang/Object;)V

    invoke-static {p3, p0, p1, v0}, Lnn/f0;->a(Landroid/view/View;Ljava/lang/Object;Lnn/z;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p2}, Lfs/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p0

    const-string p1, "let(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Les/s6$d$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Les/h4$a;->d(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public d(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Les/s6$d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initialRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextForNewView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Les/h4$a;->a:Lnn/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lnn/f;->a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getType()Lxu/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxu/c<",
            "-",
            "Les/s6$d$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Les/h4$a;->a:Lnn/f;

    invoke-virtual {v0}, Lnn/f;->getType()Lxu/c;

    move-result-object v0

    return-object v0
.end method
