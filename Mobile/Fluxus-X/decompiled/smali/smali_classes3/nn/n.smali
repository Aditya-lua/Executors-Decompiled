.class public final Lnn/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/b0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/b0<",
        "Lnn/m<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J8\u0010\r\u001a\u00020\u000c2\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0008\u0000\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u000f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lnn/n;",
        "Lnn/b0;",
        "Lnn/m;",
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
        "b",
        "(Lnn/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "Lxu/c;",
        "getType",
        "()Lxu/c;",
        "type",
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


# static fields
.field public static final b:Lnn/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final synthetic a:Lnn/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnn/i<",
            "Lnn/m<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnn/n;

    invoke-direct {v0}, Lnn/n;-><init>()V

    sput-object v0, Lnn/n;->b:Lnn/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnn/i;

    const-class v1, Lnn/m;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lnn/n$a;->i:Lnn/n$a;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lnn/i;-><init>(Lxu/c;Lkotlin/jvm/functions/Function1;Lnn/g0;Lpu/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lnn/n;->a:Lnn/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lnn/m;

    invoke-virtual {p0, p1, p2, p3, p4}, Lnn/n;->b(Lnn/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnn/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lnn/m;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnn/m<",
            "*>;",
            "Lnn/z;",
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

    iget-object v0, p0, Lnn/n;->a:Lnn/i;

    invoke-virtual {v0, p1, p2, p3, p4}, Lnn/i;->a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

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
            "Lnn/m<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lnn/n;->a:Lnn/i;

    invoke-virtual {v0}, Lnn/i;->getType()Lxu/c;

    move-result-object v0

    return-object v0
.end method
