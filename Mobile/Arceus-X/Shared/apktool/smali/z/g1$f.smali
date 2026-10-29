.class public Lz/g1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/g1$f$a;
    }
.end annotation


# instance fields
.field public a:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lz/g1$f$a;


# direct methods
.method public constructor <init>(Lz/g1$f$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz/q1;

    invoke-direct {v0, p0}, Lz/q1;-><init>(Lz/g1$f;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lz/g1$f;->b:Lne/x;

    iput-object p1, p0, Lz/g1$f;->c:Lz/g1$f$a;

    return-void
.end method

.method public static synthetic b(Lz/g1$f;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lz/g1$f;->a:Ly1/c$a;

    const-string p0, "waitFor3AResult"

    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lz/g1$f;->c:Lz/g1$f$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lz/g1$f$a;->a(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lz/g1$f;->a:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public c()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/g1$f;->b:Lne/x;

    return-object v0
.end method
