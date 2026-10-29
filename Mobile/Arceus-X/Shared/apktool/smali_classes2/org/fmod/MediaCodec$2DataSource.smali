.class Lorg/fmod/MediaCodec$2DataSource;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/fmod/MediaCodec;->init(J)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DataSource"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/fmod/MediaCodec;


# direct methods
.method public constructor <init>(Lorg/fmod/MediaCodec;)V
    .locals 0

    iput-object p1, p0, Lorg/fmod/MediaCodec$2DataSource;->this$0:Lorg/fmod/MediaCodec;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public getSize()J
    .locals 2

    iget-object v0, p0, Lorg/fmod/MediaCodec$2DataSource;->this$0:Lorg/fmod/MediaCodec;

    invoke-static {v0}, Lorg/fmod/MediaCodec;->a(Lorg/fmod/MediaCodec;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/fmod/MediaCodec;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public readAt(J[BII)I
    .locals 8

    iget-object v0, p0, Lorg/fmod/MediaCodec$2DataSource;->this$0:Lorg/fmod/MediaCodec;

    invoke-static {v0}, Lorg/fmod/MediaCodec;->a(Lorg/fmod/MediaCodec;)J

    move-result-wide v1

    move-wide v3, p1

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v1 .. v7}, Lorg/fmod/MediaCodec;->c(JJ[BII)I

    move-result p1

    return p1
.end method
