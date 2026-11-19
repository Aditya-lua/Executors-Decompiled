.class public final Ll1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx2/h<",
        "Li1/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lf1/a;

.field public final b:Ln0/a2$a;

.field public final c:Landroid/util/Rational;


# direct methods
.method public constructor <init>(Lf1/a;Ln0/a2$a;Landroid/util/Rational;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/f;->a:Lf1/a;

    iput-object p2, p0, Ll1/f;->b:Ln0/a2$a;

    iput-object p3, p0, Ll1/f;->c:Landroid/util/Rational;

    return-void
.end method


# virtual methods
.method public a()Li1/a;
    .locals 8

    iget-object v0, p0, Ll1/f;->a:Lf1/a;

    invoke-static {v0}, Ll1/b;->e(Lf1/a;)I

    move-result v0

    iget-object v1, p0, Ll1/f;->a:Lf1/a;

    invoke-static {v1}, Ll1/b;->f(Lf1/a;)I

    move-result v1

    iget-object v2, p0, Ll1/f;->a:Lf1/a;

    invoke-virtual {v2}, Lf1/a;->c()I

    move-result v2

    iget-object v3, p0, Ll1/f;->b:Ln0/a2$a;

    invoke-virtual {v3}, Ln0/a2$a;->c()I

    move-result v3

    const/4 v4, -0x1

    const-string v5, "AudioSrcAdPrflRslvr"

    if-ne v2, v4, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Resolved AUDIO channel count from AudioProfile: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v3

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", Resolved Channel Count: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v3, p0, Ll1/f;->a:Lf1/a;

    invoke-virtual {v3}, Lf1/a;->d()Landroid/util/Range;

    move-result-object v3

    iget-object v4, p0, Ll1/f;->b:Ln0/a2$a;

    invoke-virtual {v4}, Ln0/a2$a;->g()I

    move-result v4

    iget-object v6, p0, Ll1/f;->c:Landroid/util/Rational;

    invoke-static {v3, v4, v2, v1, v6}, Ll1/b;->g(Landroid/util/Range;IIILandroid/util/Rational;)Ll1/j;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll1/j;->a()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "Hz. Encode sample rate: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll1/j;->b()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "Hz. [AudioProfile sample rate: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "Hz]"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Li1/a;->a()Li1/a$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Li1/a$a;->d(I)Li1/a$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Li1/a$a;->c(I)Li1/a$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Li1/a$a;->f(I)Li1/a$a;

    move-result-object v0

    invoke-virtual {v3}, Ll1/j;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Li1/a$a;->e(I)Li1/a$a;

    move-result-object v0

    invoke-virtual {v3}, Ll1/j;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Li1/a$a;->g(I)Li1/a$a;

    move-result-object v0

    invoke-virtual {v0}, Li1/a$a;->b()Li1/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll1/f;->a()Li1/a;

    move-result-object v0

    return-object v0
.end method
