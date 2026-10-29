.class public final Lfn/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0017\u001a\u0004\u0008\u000f\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u001a\u001a\u0004\u0008\u0013\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lfn/r;",
        "",
        "Lg0/l;",
        "camera",
        "Lg0/f1;",
        "imageCapture",
        "Lf1/r0;",
        "recorder",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "cameraProperties",
        "<init>",
        "(Lg0/l;Lg0/f1;Lf1/r0;Lcom/withpersona/sdk2/camera/CameraProperties;)V",
        "a",
        "Lg0/l;",
        "()Lg0/l;",
        "b",
        "Lg0/f1;",
        "d",
        "()Lg0/f1;",
        "c",
        "Lf1/r0;",
        "e",
        "()Lf1/r0;",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "()Lcom/withpersona/sdk2/camera/CameraProperties;",
        "Lcom/withpersona/sdk2/camera/h;",
        "Lcom/withpersona/sdk2/camera/h;",
        "()Lcom/withpersona/sdk2/camera/h;",
        "f",
        "(Lcom/withpersona/sdk2/camera/h;)V",
        "currentRecordingHelper",
        "camera_release"
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
.field public final a:Lg0/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lg0/f1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lf1/r0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/camera/CameraProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lcom/withpersona/sdk2/camera/h;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg0/l;Lg0/f1;Lf1/r0;Lcom/withpersona/sdk2/camera/CameraProperties;)V
    .locals 1
    .param p1    # Lg0/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg0/f1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lf1/r0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/camera/CameraProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "camera"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraProperties"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/r;->a:Lg0/l;

    iput-object p2, p0, Lfn/r;->b:Lg0/f1;

    iput-object p3, p0, Lfn/r;->c:Lf1/r0;

    iput-object p4, p0, Lfn/r;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    return-void
.end method


# virtual methods
.method public final a()Lg0/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lfn/r;->a:Lg0/l;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/camera/CameraProperties;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lfn/r;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    return-object v0
.end method

.method public final c()Lcom/withpersona/sdk2/camera/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lfn/r;->e:Lcom/withpersona/sdk2/camera/h;

    return-object v0
.end method

.method public final d()Lg0/f1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lfn/r;->b:Lg0/f1;

    return-object v0
.end method

.method public final e()Lf1/r0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lfn/r;->c:Lf1/r0;

    return-object v0
.end method

.method public final f(Lcom/withpersona/sdk2/camera/h;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/camera/h;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lfn/r;->e:Lcom/withpersona/sdk2/camera/h;

    return-void
.end method
