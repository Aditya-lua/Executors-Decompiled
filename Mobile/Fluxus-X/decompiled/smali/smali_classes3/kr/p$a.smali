.class public final Lkr/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkr/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/b0<",
        "Lkr/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J2\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkr/p$a;",
        "Lnn/b0;",
        "Lkr/m;",
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
        "(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "Lxu/c;",
        "getType",
        "()Lxu/c;",
        "type",
        "shared_release"
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
            "Lkr/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lnn/f;

    const-class v1, Lkr/m;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    new-instance v2, Lkr/o;

    invoke-direct {v2}, Lkr/o;-><init>()V

    invoke-direct {v0, v1, v2}, Lnn/f;-><init>(Lxu/c;Lpu/o;)V

    iput-object v0, p0, Lkr/p$a;->a:Lnn/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkr/p$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkr/p$a;->c(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    const-string p3, "initialRendering"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "initialEnv"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "context"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/p;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v6}, Lkr/p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget p2, Lxq/t;->r:I

    invoke-virtual {v0, p2}, Landroid/view/View;->setId(I)V

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 p3, -0x1

    invoke-direct {p2, p3, p3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lkr/p$a$a;

    invoke-direct {p2, v0}, Lkr/p$a$a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p0, p1, p2}, Lnn/f0;->a(Landroid/view/View;Ljava/lang/Object;Lnn/z;Lkotlin/jvm/functions/Function2;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lkr/m;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkr/p$a;->d(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public d(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lkr/m;
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

    iget-object v0, p0, Lkr/p$a;->a:Lnn/f;

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
            "Lkr/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lkr/p$a;->a:Lnn/f;

    invoke-virtual {v0}, Lnn/f;->getType()Lxu/c;

    move-result-object v0

    return-object v0
.end method
