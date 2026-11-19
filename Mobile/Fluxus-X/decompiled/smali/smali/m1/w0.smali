.class public final synthetic Lm1/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$g;

.field public final synthetic b:Landroid/media/MediaCodec$BufferInfo;

.field public final synthetic c:Landroid/media/MediaCodec;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lm1/i0$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/w0;->a:Lm1/i0$g;

    iput-object p2, p0, Lm1/w0;->b:Landroid/media/MediaCodec$BufferInfo;

    iput-object p3, p0, Lm1/w0;->c:Landroid/media/MediaCodec;

    iput p4, p0, Lm1/w0;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lm1/w0;->a:Lm1/i0$g;

    iget-object v1, p0, Lm1/w0;->b:Landroid/media/MediaCodec$BufferInfo;

    iget-object v2, p0, Lm1/w0;->c:Landroid/media/MediaCodec;

    iget v3, p0, Lm1/w0;->d:I

    invoke-static {v0, v1, v2, v3}, Lm1/i0$g;->e(Lm1/i0$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    return-void
.end method
