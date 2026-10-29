.class public final synthetic Lin/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lin/f;


# direct methods
.method public synthetic constructor <init>(Lin/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lin/d;->a:Lin/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lin/d;->a:Lin/f;

    check-cast p1, Ljava/nio/ByteBuffer;

    check-cast p2, Landroid/media/MediaCodec$BufferInfo;

    invoke-static {v0, p1, p2}, Lin/f;->b(Lin/f;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
