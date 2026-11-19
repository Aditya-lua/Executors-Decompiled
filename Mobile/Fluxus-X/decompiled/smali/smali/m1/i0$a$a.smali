.class public Lm1/i0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm1/i0$a;->a(Lm1/h1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lm1/i0$a;


# direct methods
.method public constructor <init>(Lm1/i0$a;)V
    .locals 0

    iput-object p1, p0, Lm1/i0$a$a;->a:Lm1/i0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/i0$a$a;->a:Lm1/i0$a;

    iget-object v0, v0, Lm1/i0$a;->a:Lm1/i0;

    check-cast p1, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v0, p1}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm1/i0$a$a;->a:Lm1/i0$a;

    iget-object v0, v0, Lm1/i0$a;->a:Lm1/i0;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lm1/i0;->K(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lm1/i0$a$a;->a(Ljava/lang/Void;)V

    return-void
.end method
