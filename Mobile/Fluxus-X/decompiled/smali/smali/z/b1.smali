.class public Lz/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l1$b;


# static fields
.field public static final a:Lz/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/b1;

    invoke-direct {v0}, Lz/b1;-><init>()V

    sput-object v0, Lz/b1;->a:Lz/b1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln0/i4;Ln0/l1$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Ln0/l1$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ln0/i4;->s(Ln0/l1;)Ln0/l1;

    move-result-object v0

    invoke-static {}, Ln0/c3;->i0()Ln0/c3;

    move-result-object v1

    invoke-static {}, Ln0/l1;->b()Ln0/l1;

    move-result-object v2

    invoke-virtual {v2}, Ln0/l1;->k()I

    move-result v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/l1;->k()I

    move-result v2

    invoke-virtual {v0}, Ln0/l1;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Ln0/l1$a;->a(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ln0/l1;->g()Ln0/n1;

    move-result-object v1

    :cond_0
    invoke-virtual {p2, v1}, Ln0/l1$a;->s(Ln0/n1;)V

    new-instance v0, Ly/a;

    invoke-direct {v0, p1}, Ly/a;-><init>(Ln0/n1;)V

    invoke-virtual {v0, v2}, Ly/a;->j0(I)I

    move-result p1

    invoke-virtual {p2, p1}, Ln0/l1$a;->v(I)V

    invoke-static {}, Lz/a1;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly/a;->m0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-static {p1}, Lz/c3;->e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lz/c3;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/l1$a;->c(Ln0/u;)V

    invoke-virtual {v0}, Ly/a;->i0()Lf0/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/l1$a;->e(Ln0/n1;)V

    return-void
.end method
