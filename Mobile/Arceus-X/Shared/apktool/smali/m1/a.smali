.class public abstract Lm1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lm1/a$a;
    .locals 2

    new-instance v0, Lm1/c$b;

    invoke-direct {v0}, Lm1/c$b;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lm1/c$b;->i(I)Lm1/a$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Landroid/media/MediaFormat;
    .locals 3

    invoke-virtual {p0}, Lm1/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm1/a;->h()I

    move-result v1

    invoke-virtual {p0}, Lm1/a;->g()I

    move-result v2

    invoke-static {v0, v1, v2}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    const-string v1, "bitrate"

    invoke-virtual {p0}, Lm1/a;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    invoke-virtual {p0}, Lm1/a;->i()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Lm1/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "aac-profile"

    invoke-virtual {p0}, Lm1/a;->i()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object v0

    :cond_0
    const-string v1, "profile"

    invoke-virtual {p0}, Lm1/a;->i()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    return-object v0
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ln0/a4;
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()I
.end method
