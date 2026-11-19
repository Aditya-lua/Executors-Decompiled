.class public final Lz/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o3$e;


# static fields
.field public static final a:Lz/s2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/s2;

    invoke-direct {v0}, Lz/s2;-><init>()V

    sput-object v0, Lz/s2;->a:Lz/s2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;Ln0/i4;Ln0/o3$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/i4<",
            "*>;",
            "Ln0/o3$b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ln0/i4;->j(Ln0/o3;)Ln0/o3;

    move-result-object v1

    invoke-static {}, Ln0/c3;->i0()Ln0/c3;

    move-result-object v2

    invoke-static {}, Ln0/o3;->b()Ln0/o3;

    move-result-object v3

    invoke-virtual {v3}, Ln0/o3;->q()I

    move-result v3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ln0/o3;->q()I

    move-result v3

    invoke-virtual {v1}, Ln0/o3;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Ln0/o3$b;->b(Ljava/util/Collection;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Ln0/o3$b;->d(Ljava/util/List;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Ln0/o3$b;->c(Ljava/util/Collection;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->g()Ln0/n1;

    move-result-object v2

    :cond_0
    invoke-virtual {p3, v2}, Ln0/o3$b;->w(Ln0/n1;)Ln0/o3$b;

    instance-of v1, p2, Ln0/f3;

    if-eqz v1, :cond_1

    invoke-static {p1, p3}, Ld0/o;->b(Landroid/util/Size;Ln0/o3$b;)V

    :cond_1
    new-instance p1, Ly/a;

    invoke-direct {p1, p2}, Ly/a;-><init>(Ln0/n1;)V

    invoke-virtual {p1, v3}, Ly/a;->j0(I)I

    move-result v1

    invoke-virtual {p3, v1}, Ln0/o3$b;->B(I)Ln0/o3$b;

    invoke-static {}, Lz/w2;->b()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v1

    invoke-virtual {p1, v1}, Ly/a;->k0(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v1

    invoke-virtual {p3, v1}, Ln0/o3$b;->f(Landroid/hardware/camera2/CameraDevice$StateCallback;)Ln0/o3$b;

    invoke-static {}, Lz/v2;->b()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v1

    invoke-virtual {p1, v1}, Ly/a;->n0(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v1

    invoke-virtual {p3, v1}, Ln0/o3$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Ln0/o3$b;

    invoke-static {}, Lz/a1;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v1

    invoke-virtual {p1, v1}, Ly/a;->m0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v1

    invoke-static {v1}, Lz/c3;->e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lz/c3;

    move-result-object v1

    invoke-virtual {p3, v1}, Ln0/o3$b;->e(Ln0/u;)Ln0/o3$b;

    invoke-interface {p2}, Ln0/i4;->x()I

    move-result v1

    invoke-virtual {p3, v1}, Ln0/o3$b;->C(I)Ln0/o3$b;

    invoke-interface {p2}, Ln0/i4;->E()I

    move-result p2

    invoke-virtual {p3, p2}, Ln0/o3$b;->z(I)Ln0/o3$b;

    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object p2

    sget-object v1, Ly/a;->W:Ln0/n1$a;

    invoke-virtual {p1, v0}, Ly/a;->l0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v0, Ly/a;->R:Ln0/n1$a;

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Ly/a;->o0(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    invoke-virtual {p1}, Ly/a;->i0()Lf0/l;

    move-result-object p1

    invoke-virtual {p3, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    return-void
.end method
