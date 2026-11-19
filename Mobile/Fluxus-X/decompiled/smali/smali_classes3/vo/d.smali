.class public final Lvo/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvo/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvo/y3$b;",
        "Landroid/content/Context;",
        "context",
        "Lsn/t;",
        "cameraPreview",
        "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;",
        "camera2Preview",
        "Landroidx/camera/view/PreviewView;",
        "cameraXPreview",
        "Lsn/h0;",
        "governmentIdFeed",
        "",
        "useCameraXForVideo",
        "Lsn/i;",
        "a",
        "(Lvo/y3$b;Landroid/content/Context;Lsn/t;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lsn/h0;Z)Lsn/i;",
        "government-id_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lvo/y3$b;Landroid/content/Context;Lsn/t;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lsn/h0;Z)Lsn/i;
    .locals 8
    .param p0    # Lvo/y3$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/camera/view/PreviewView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lsn/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPreview"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera2Preview"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraXPreview"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "governmentIdFeed"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvo/y3$b;->O()Lzn/a;

    move-result-object v0

    sget-object v1, Lvo/d$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_1
    if-nez p6, :cond_3

    :cond_2
    move-object p4, p5

    goto :goto_2

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lvo/y3$b;->O()Lzn/a;

    move-result-object p1

    sget-object p3, Lzn/a;->b:Lzn/a;

    if-ne p1, p3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Lvo/y3$b;->j()Lsn/a0$a;

    move-result-object p6

    move-object p1, p0

    new-instance p0, Lvo/d$b;

    move-object p3, p4

    move-object p4, p5

    move p5, v1

    invoke-direct/range {p0 .. p5}, Lvo/d$b;-><init>(Lvo/y3$b;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/h0;Z)V

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    invoke-virtual {p0}, Lvo/y3$b;->R()Z

    move-result p0

    invoke-interface {p6, p2, p3, p1, p0}, Lsn/a0$a;->a(Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;

    move-result-object p0

    return-object p0

    :goto_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getApplicationContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lun/m0;->b:Lun/m0;

    invoke-static {p1, p2}, Lun/f0;->b(Landroid/content/Context;Lun/m0;)Lun/k0;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lvo/y3$b;->D()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p1, Lsn/v0;

    invoke-direct {p1}, Lsn/v0;-><init>()V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lsn/u0;

    invoke-direct {p0, p3}, Lsn/u0;-><init>(Landroid/view/View;)V

    return-object p0

    :cond_5
    invoke-virtual {p0}, Lvo/y3$b;->i()Lun/c$a;

    move-result-object v0

    invoke-virtual {p0}, Lvo/y3$b;->O()Lzn/a;

    move-result-object v4

    invoke-virtual {p0}, Lvo/y3$b;->Q()Lks/a;

    move-result-object v5

    invoke-virtual {p0}, Lvo/y3$b;->R()Z

    move-result v6

    move-object v2, p3

    move-object v3, p4

    invoke-interface/range {v0 .. v6}, Lun/c$a;->a(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/c;

    move-result-object p0

    return-object p0
.end method
