.class public Landroidx/camera/core/ImageProcessingUtil$a;
.super Landroidx/camera/core/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final d:[Landroidx/camera/core/d$a;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroidx/camera/core/d;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/b;-><init>(Landroidx/camera/core/d;)V

    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/camera/core/ImageProcessingUtil$a;->c(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/d$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$a;->d:[Landroidx/camera/core/d$a;

    iput p5, p0, Landroidx/camera/core/ImageProcessingUtil$a;->e:I

    iput p6, p0, Landroidx/camera/core/ImageProcessingUtil$a;->f:I

    return-void
.end method


# virtual methods
.method public H1()[Landroidx/camera/core/d$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->d:[Landroidx/camera/core/d$a;

    return-object v0
.end method

.method public final c(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/d$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$a$a;

    invoke-direct {v0, p0, p4, p1}, Landroidx/camera/core/ImageProcessingUtil$a$a;-><init>(Landroidx/camera/core/ImageProcessingUtil$a;ILjava/nio/ByteBuffer;)V

    new-instance p1, Landroidx/camera/core/ImageProcessingUtil$b;

    invoke-direct {p1, p2, p4}, Landroidx/camera/core/ImageProcessingUtil$b;-><init>(Ljava/nio/ByteBuffer;I)V

    new-instance p2, Landroidx/camera/core/ImageProcessingUtil$b;

    invoke-direct {p2, p3, p4}, Landroidx/camera/core/ImageProcessingUtil$b;-><init>(Ljava/nio/ByteBuffer;I)V

    const/4 p3, 0x3

    new-array p3, p3, [Landroidx/camera/core/d$a;

    const/4 p4, 0x0

    aput-object v0, p3, p4

    const/4 p4, 0x1

    aput-object p1, p3, p4

    const/4 p1, 0x2

    aput-object p2, p3, p1

    return-object p3
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->f:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->e:I

    return v0
.end method
