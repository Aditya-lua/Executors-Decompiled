.class public final synthetic Lz/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Z

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lz/h4;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/z3;->a:Lz/h4;

    iput-boolean p2, p0, Lz/z3;->b:Z

    iput-wide p3, p0, Lz/z3;->c:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, Lz/z3;->a:Lz/h4;

    iget-boolean v1, p0, Lz/z3;->b:Z

    iget-wide v2, p0, Lz/z3;->c:J

    invoke-static {v0, v1, v2, v3, p1}, Lz/h4;->k(Lz/h4;ZJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
