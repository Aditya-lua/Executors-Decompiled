.class public final Lcom/withpersona/sdk2/inquiry/selfie/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/a0<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\u001f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/d;",
        "Lan/a0;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;",
        "Lcom/withpersona/sdk2/camera/b;",
        "cameraPreview",
        "Lct/a;",
        "Lfn/n0;",
        "selfieDirectionFeed",
        "Lhn/i0;",
        "cameraChoiceHelper",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "initialRendering",
        "Lan/y;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "d",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "b",
        "Lcom/withpersona/sdk2/camera/b;",
        "c",
        "Lct/a;",
        "Lhn/i0;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Lhu/c;",
        "getType",
        "()Lhu/c;",
        "type",
        "selfie_release"
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/camera/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lct/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lct/a<",
            "Lfn/n0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lhn/i0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 3
    .param p1    # Lcom/withpersona/sdk2/camera/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lct/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lhn/i0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lct/a<",
            "Lfn/n0;",
            ">;",
            "Lhn/i0;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")V"
        }
    .end annotation

    const-string v0, "cameraPreview"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfieDirectionFeed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraChoiceHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lan/f;

    const-class v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    new-instance v2, Lyp/l;

    invoke-direct {v2, p2, p1, p4}, Lyp/l;-><init>(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    invoke-direct {v0, v1, v2}, Lan/f;-><init>(Lhu/c;Lzt/o;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->a:Lan/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->c:Lct/a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->d:Lhn/i0;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static synthetic b(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/selfie/d;->c(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "initialRendering"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "initialViewEnvironment"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p6, :cond_0

    invoke-virtual/range {p6 .. p6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    move-object v4, v3

    :cond_1
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-static {v4}, Laq/a;->c(Landroid/view/LayoutInflater;)Laq/a;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->p()Lmn/a;

    move-result-object v5

    sget-object v6, Lmn/a;->c:Lmn/a;

    const-string v7, "get(...)"

    if-eq v5, v6, :cond_3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "getApplicationContext(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lhn/m0;->a:Lhn/m0;

    invoke-static {v0, v3}, Lhn/f0;->b(Landroid/content/Context;Lhn/m0;)Lhn/k0;

    move-result-object v9

    const-string v0, "camera2Preview"

    if-nez v9, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->i()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    new-instance v5, Lfn/i0;

    invoke-direct {v5}, Lfn/i0;-><init>()V

    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/withpersona/sdk2/camera/g;

    iget-object v5, v4, Laq/a;->c:Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v5}, Lcom/withpersona/sdk2/camera/g;-><init>(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->b()Lhn/c$a;

    move-result-object v8

    iget-object v10, v4, Laq/a;->c:Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lct/a;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, Lhn/g;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->p()Lmn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lmn/a;->valueOf(Ljava/lang/String;)Lmn/a;

    move-result-object v12

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->r()Lur/a;

    move-result-object v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->s()Z

    move-result v14

    invoke-interface/range {v8 .. v14}, Lhn/c$a;->a(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;

    move-result-object v3

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->c()Lcom/withpersona/sdk2/camera/e$a;

    move-result-object v3

    iget-object v5, v4, Laq/a;->k:Landroidx/camera/view/PreviewView;

    const-string v6, "previewviewSelfieCamera"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/d$b;

    invoke-direct {v6, v4, p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/d$b;-><init>(Laq/a;Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->s()Z

    move-result v8

    invoke-interface {v3, v0, v5, v6, v8}, Lcom/withpersona/sdk2/camera/e$a;->a(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;

    move-result-object v3

    :goto_0
    invoke-virtual {v4}, Laq/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v5, "getRoot(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/d$a;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0}, Lct/a;->get()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lfn/n0;

    move-object/from16 v7, p2

    invoke-direct {v6, v4, v3, p0, v7}, Lcom/withpersona/sdk2/inquiry/selfie/c;-><init>(Laq/a;Lfn/g;Lfn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/selfie/d$a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2, v5}, Lan/e0;->a(Landroid/view/View;Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, Laq/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    const-string v0, "let(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/d;->d(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;
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

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->a:Lan/f;

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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d;->a:Lan/f;

    invoke-virtual {v0}, Lan/f;->getType()Lhu/c;

    move-result-object v0

    return-object v0
.end method
