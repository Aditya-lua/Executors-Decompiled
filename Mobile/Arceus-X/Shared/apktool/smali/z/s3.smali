.class public Lz/s3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz/y;

.field public final b:Lz/t3;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Z

.field public e:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lz/y$c;


# direct methods
.method public constructor <init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/s3;->d:Z

    iput-object p1, p0, Lz/s3;->a:Lz/y;

    new-instance p1, Lz/t3;

    invoke-direct {p1, p2, v0}, Lz/t3;-><init>(La0/c0;I)V

    iput-object p1, p0, Lz/s3;->b:Lz/t3;

    iput-object p3, p0, Lz/s3;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lz/s3;->e:Ly1/c$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lg0/m$a;

    const-string v3, "Cancelled by another setExposureCompensationIndex()"

    invoke-direct {v2, v3}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    iput-object v1, p0, Lz/s3;->e:Ly1/c$a;

    :cond_0
    iget-object v0, p0, Lz/s3;->f:Lz/y$c;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lz/s3;->a:Lz/y;

    invoke-virtual {v2, v0}, Lz/y;->g0(Lz/y$c;)V

    iput-object v1, p0, Lz/s3;->f:Lz/y$c;

    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lz/s3;->d:Z

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lz/s3;->d:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lz/s3;->b:Lz/t3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz/t3;->b(I)V

    invoke-virtual {p0}, Lz/s3;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ly/a$a;)V
    .locals 3

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lz/s3;->b:Lz/t3;

    invoke-virtual {v1}, Lz/t3;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ln0/n1$c;->c:Ln0/n1$c;

    invoke-virtual {p1, v0, v1, v2}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    return-void
.end method
