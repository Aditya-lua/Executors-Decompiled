.class public final Ly/a;
.super Lf0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/a$a;
    }
.end annotation


# static fields
.field public static final Q:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final R:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final S:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;"
        }
    .end annotation
.end field

.field public static final U:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final W:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camera2.captureRequest.templateType"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->Q:Ln0/n1$a;

    const-string v0, "camera2.cameraCaptureSession.streamUseCase"

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->R:Ln0/n1$a;

    const-string v0, "camera2.cameraDevice.stateCallback"

    const-class v1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->S:Ln0/n1$a;

    const-string v0, "camera2.cameraCaptureSession.stateCallback"

    const-class v1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->T:Ln0/n1$a;

    const-string v0, "camera2.cameraCaptureSession.captureCallback"

    const-class v1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->U:Ln0/n1$a;

    const-string v0, "camera2.captureRequest.tag"

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->V:Ln0/n1$a;

    const-string v0, "camera2.cameraCaptureSession.physicalCameraId"

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ly/a;->W:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ln0/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Lf0/l;-><init>(Ln0/n1;)V

    return-void
.end method

.method public static h0(Landroid/hardware/camera2/CaptureRequest$Key;)Ln0/n1$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;)",
            "Ln0/n1$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "camera2.captureRequest.option."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Ln0/n1$a;->b(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ln0/n1$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public i0()Lf0/l;
    .locals 1

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    invoke-static {v0}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    return-object v0
.end method

.method public j0(I)I
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->Q:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public k0(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->S:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    return-object p1
.end method

.method public l0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->W:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public m0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->U:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-object p1
.end method

.method public n0(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->T:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-object p1
.end method

.method public o0(J)J
    .locals 2

    invoke-virtual {p0}, Lf0/l;->n()Ln0/n1;

    move-result-object v0

    sget-object v1, Ly/a;->R:Ln0/n1$a;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method
