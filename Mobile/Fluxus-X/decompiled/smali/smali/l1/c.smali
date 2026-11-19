.class public final Ll1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx2/h<",
        "Lm1/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln0/a4;

.field public final c:I

.field public final d:Lf1/a;

.field public final e:Li1/a;

.field public final f:Ln0/a2$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILn0/a4;Lf1/a;Li1/a;Ln0/a2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/c;->a:Ljava/lang/String;

    iput p2, p0, Ll1/c;->c:I

    iput-object p3, p0, Ll1/c;->b:Ln0/a4;

    iput-object p4, p0, Ll1/c;->d:Lf1/a;

    iput-object p5, p0, Ll1/c;->e:Li1/a;

    iput-object p6, p0, Ll1/c;->f:Ln0/a2$a;

    return-void
.end method


# virtual methods
.method public a()Lm1/a;
    .locals 7

    const-string v0, "AudioEncAdPrflRslvr"

    const-string v1, "Using resolved AUDIO bitrate from AudioProfile"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll1/c;->d:Lf1/a;

    invoke-virtual {v0}, Lf1/a;->b()Landroid/util/Range;

    move-result-object v6

    iget-object v0, p0, Ll1/c;->f:Ln0/a2$a;

    invoke-virtual {v0}, Ln0/a2$a;->b()I

    move-result v1

    iget-object v0, p0, Ll1/c;->e:Li1/a;

    invoke-virtual {v0}, Li1/a;->f()I

    move-result v2

    iget-object v0, p0, Ll1/c;->f:Ln0/a2$a;

    invoke-virtual {v0}, Ln0/a2$a;->c()I

    move-result v3

    iget-object v0, p0, Ll1/c;->e:Li1/a;

    invoke-virtual {v0}, Li1/a;->g()I

    move-result v4

    iget-object v0, p0, Ll1/c;->f:Ln0/a2$a;

    invoke-virtual {v0}, Ln0/a2$a;->g()I

    move-result v5

    invoke-static/range {v1 .. v6}, Ll1/b;->h(IIIIILandroid/util/Range;)I

    move-result v0

    invoke-static {}, Lm1/a;->d()Lm1/a$a;

    move-result-object v1

    iget-object v2, p0, Ll1/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lm1/a$a;->h(Ljava/lang/String;)Lm1/a$a;

    move-result-object v1

    iget v2, p0, Ll1/c;->c:I

    invoke-virtual {v1, v2}, Lm1/a$a;->i(I)Lm1/a$a;

    move-result-object v1

    iget-object v2, p0, Ll1/c;->b:Ln0/a4;

    invoke-virtual {v1, v2}, Lm1/a$a;->g(Ln0/a4;)Lm1/a$a;

    move-result-object v1

    iget-object v2, p0, Ll1/c;->e:Li1/a;

    invoke-virtual {v2}, Li1/a;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lm1/a$a;->e(I)Lm1/a$a;

    move-result-object v1

    iget-object v2, p0, Ll1/c;->e:Li1/a;

    invoke-virtual {v2}, Li1/a;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Lm1/a$a;->d(I)Lm1/a$a;

    move-result-object v1

    iget-object v2, p0, Ll1/c;->e:Li1/a;

    invoke-virtual {v2}, Li1/a;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Lm1/a$a;->f(I)Lm1/a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lm1/a$a;->c(I)Lm1/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lm1/a$a;->b()Lm1/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll1/c;->a()Lm1/a;

    move-result-object v0

    return-object v0
.end method
