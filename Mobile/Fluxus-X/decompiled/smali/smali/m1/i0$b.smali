.class public Lm1/i0$b;
.super Lm1/j1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm1/i0;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Lm1/i0;


# direct methods
.method public constructor <init>(Lm1/i0;Landroid/media/MediaCodec;I)V
    .locals 0

    iput-object p1, p0, Lm1/i0$b;->i:Lm1/i0;

    invoke-direct {p0, p2, p3}, Lm1/j1;-><init>(Landroid/media/MediaCodec;I)V

    return-void
.end method


# virtual methods
.method public c(J)V
    .locals 2

    iget-object v0, p0, Lm1/i0$b;->i:Lm1/i0;

    iget-boolean v1, v0, Lm1/i0;->c:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1, p2}, Lm1/i0;->A(Lm1/i0;J)J

    move-result-wide p1

    :goto_0
    invoke-super {p0, p1, p2}, Lm1/j1;->c(J)V

    return-void
.end method
