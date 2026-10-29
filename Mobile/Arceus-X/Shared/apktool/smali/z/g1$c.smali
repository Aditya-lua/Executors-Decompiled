.class public Lz/g1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lz/g1$d;

.field public c:I


# direct methods
.method public constructor <init>(Lz/g1$d;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g1$c;->b:Lz/g1$d;

    iput-object p2, p0, Lz/g1$c;->a:Ljava/util/concurrent/Executor;

    iput p3, p0, Lz/g1$c;->c:I

    return-void
.end method

.method public static synthetic c(Lz/g1$c;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lz/g1$c;->b:Lz/g1$d;

    invoke-virtual {p0}, Lz/g1$d;->j()V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    const-string p0, "invokePostCaptureFuture"

    return-object p0
.end method

.method public static synthetic d(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "invokePreCapture"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/g1$c;->b:Lz/g1$d;

    iget v1, p0, Lz/g1$c;->c:I

    invoke-virtual {v0, v1}, Lz/g1$d;->k(I)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v0

    new-instance v1, Lz/i1;

    invoke-direct {v1}, Lz/i1;-><init>()V

    iget-object v2, p0, Lz/g1$c;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object v0

    return-object v0
.end method

.method public b()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/h1;

    invoke-direct {v0, p0}, Lz/h1;-><init>(Lz/g1$c;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method
