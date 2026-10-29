.class public Landroidx/camera/core/ImageProcessingUtil$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$b;->a:Ljava/nio/ByteBuffer;

    iput p2, p0, Landroidx/camera/core/ImageProcessingUtil$b;->b:I

    return-void
.end method


# virtual methods
.method public k()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$b;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$b;->b:I

    return v0
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
