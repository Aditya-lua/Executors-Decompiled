.class public abstract Lm1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lm1/a;
.end method

.method public b()Lm1/a;
    .locals 3

    invoke-virtual {p0}, Lm1/a$a;->a()Lm1/a;

    move-result-object v0

    invoke-virtual {v0}, Lm1/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/mp4a-latm"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lm1/a;->i()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Encoder mime set to AAC, but no AAC profile was provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public abstract c(I)Lm1/a$a;
.end method

.method public abstract d(I)Lm1/a$a;
.end method

.method public abstract e(I)Lm1/a$a;
.end method

.method public abstract f(I)Lm1/a$a;
.end method

.method public abstract g(Ln0/a4;)Lm1/a$a;
.end method

.method public abstract h(Ljava/lang/String;)Lm1/a$a;
.end method

.method public abstract i(I)Lm1/a$a;
.end method
