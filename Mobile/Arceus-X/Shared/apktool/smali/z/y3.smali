.class public final synthetic Lz/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lz/h4;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/y3;->a:Lz/h4;

    iput p2, p0, Lz/y3;->b:I

    iput-wide p3, p0, Lz/y3;->c:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, Lz/y3;->a:Lz/h4;

    iget v1, p0, Lz/y3;->b:I

    iget-wide v2, p0, Lz/y3;->c:J

    invoke-static {v0, v1, v2, v3, p1}, Lz/h4;->a(Lz/h4;IJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
