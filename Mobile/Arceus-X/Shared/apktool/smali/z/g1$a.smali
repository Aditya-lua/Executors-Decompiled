.class public Lz/g1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lz/y;

.field public final b:Ld0/n;

.field public final c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lz/y;ILd0/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/g1$a;->d:Z

    iput-object p1, p0, Lz/g1$a;->a:Lz/y;

    iput p2, p0, Lz/g1$a;->c:I

    iput-object p3, p0, Lz/g1$a;->b:Ld0/n;

    return-void
.end method

.method public static synthetic d(Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic e(Lz/g1$a;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/g1$a;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->I()Lz/h4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz/h4;->R(Ly1/c$a;)V

    iget-object p0, p0, Lz/g1$a;->b:Ld0/n;

    invoke-virtual {p0}, Ld0/n;->b()V

    const-string p0, "AePreCapture"

    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ")",
            "Lne/x<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/g1$a;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->b0()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lz/g1$a;->c:I

    invoke-static {v0, p1}, Lz/g1;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Camera2CapturePipeline"

    const-string v0, "Trigger AE"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz/g1$a;->d:Z

    new-instance p1, Lz/e1;

    invoke-direct {p1, p0}, Lz/e1;-><init>(Lz/g1$a;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/f1;

    invoke-direct {v0}, Lz/f1;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget v0, p0, Lz/g1$a;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, Lz/g1$a;->d:Z

    if-eqz v0, :cond_0

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "cancel TriggerAePreCapture"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/g1$a;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->I()Lz/h4;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lz/h4;->o(ZZ)V

    iget-object v0, p0, Lz/g1$a;->b:Ld0/n;

    invoke-virtual {v0}, Ld0/n;->a()V

    :cond_0
    return-void
.end method
