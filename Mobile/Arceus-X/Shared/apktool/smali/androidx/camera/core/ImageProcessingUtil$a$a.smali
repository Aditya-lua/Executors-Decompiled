.class public Landroidx/camera/core/ImageProcessingUtil$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/ImageProcessingUtil$a;->c(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/nio/ByteBuffer;

.field public final synthetic c:Landroidx/camera/core/ImageProcessingUtil$a;


# direct methods
.method public constructor <init>(Landroidx/camera/core/ImageProcessingUtil$a;ILjava/nio/ByteBuffer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$a$a;->c:Landroidx/camera/core/ImageProcessingUtil$a;

    iput p2, p0, Landroidx/camera/core/ImageProcessingUtil$a$a;->a:I

    iput-object p3, p0, Landroidx/camera/core/ImageProcessingUtil$a$a;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$a$a;->b:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$a$a;->a:I

    return v0
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
