.class public final Lko/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lko/z$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/a0<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\u001e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lko/z;",
        "Lan/a0;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
        "Lfn/x;",
        "governmentIdFeed",
        "Lcom/withpersona/sdk2/camera/b;",
        "cameraPreview",
        "Lgo/e;",
        "featureFlagManager",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "initialRendering",
        "Lan/y;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "d",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "b",
        "Lfn/x;",
        "c",
        "Lcom/withpersona/sdk2/camera/b;",
        "Lgo/e;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Lhu/c;",
        "getType",
        "()Lhu/c;",
        "type",
        "government-id_release"
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
.field public final synthetic a:Lan/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan/f<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lfn/x;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/camera/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 3
    .param p1    # Lfn/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/camera/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lgo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "governmentIdFeed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPreview"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lan/f;

    const-class v1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    new-instance v2, Lko/y;

    invoke-direct {v2, p1, p2, p3, p4}, Lko/y;-><init>(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    invoke-direct {v0, v1, v2}, Lan/f;-><init>(Lhu/c;Lzt/o;)V

    iput-object v0, p0, Lko/z;->a:Lan/f;

    iput-object p1, p0, Lko/z;->b:Lfn/x;

    iput-object p2, p0, Lko/z;->c:Lcom/withpersona/sdk2/camera/b;

    iput-object p3, p0, Lko/z;->d:Lgo/e;

    iput-object p4, p0, Lko/z;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static synthetic b(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static/range {p0 .. p7}, Lko/z;->c(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    const-string v0, "initialRendering"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwn/a;->a:Lwn/a;

    new-instance v1, Lko/z$b;

    invoke-direct {v1}, Lko/z$b;-><init>()V

    const-class v2, Lko/w$a;

    invoke-virtual {v0, v2, v1}, Lwn/a;->c(Ljava/lang/Class;Lwn/c;)Lwn/a$a;

    move-result-object v0

    invoke-virtual {p4}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->q()Lio/d;

    move-result-object v1

    sget-object v2, Lko/z$c;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    sget-object v1, Lwn/d;->g:Lwn/d;

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Lwn/d;->b:Lwn/d;

    :goto_0
    invoke-virtual {v0, v1}, Lwn/a$a;->a(Lwn/d;)Lwn/c;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lko/w$a;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p4

    move-object v6, p6

    move-object v7, p7

    invoke-interface/range {v1 .. v7}, Lko/w$a;->b(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lko/w;

    move-result-object v4

    move-object p0, v5

    invoke-interface {v4}, Lko/w;->getRoot()Landroid/view/View;

    move-result-object p1

    new-instance p2, Lko/z$a;

    move-object v6, v2

    new-instance v2, Lko/u;

    invoke-interface {v4}, Lko/w;->getRoot()Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string p4, "getContext(...)"

    invoke-static {v3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Lko/w;->f()Lfn/g;

    move-result-object v5

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lko/u;-><init>(Landroid/content/Context;Lko/w;Lfn/g;Lfn/x;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    invoke-direct {p2, v2}, Lko/z$a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p0, p5, p2}, Lan/e0;->a(Landroid/view/View;Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v4}, Lko/w;->getRoot()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {p0, p1, p2, p3, p4}, Lko/z;->d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initialRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextForNewView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lko/z;->a:Lan/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lan/f;->a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getType()Lhu/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhu/c<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lko/z;->a:Lan/f;

    invoke-virtual {v0}, Lan/f;->getType()Lhu/c;

    move-result-object v0

    return-object v0
.end method
