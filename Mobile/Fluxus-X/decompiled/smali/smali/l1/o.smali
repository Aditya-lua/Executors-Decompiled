.class public Ll1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx2/h<",
        "Lm1/p1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln0/a4;

.field public final c:Lf1/c2;

.field public final d:Landroid/util/Size;

.field public final e:Ln0/a2$c;

.field public final f:Lg0/k0;

.field public final g:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln0/a4;Lf1/c2;Landroid/util/Size;Ln0/a2$c;Lg0/k0;Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/a4;",
            "Lf1/c2;",
            "Landroid/util/Size;",
            "Ln0/a2$c;",
            "Lg0/k0;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/o;->a:Ljava/lang/String;

    iput-object p2, p0, Ll1/o;->b:Ln0/a4;

    iput-object p3, p0, Ll1/o;->c:Lf1/c2;

    iput-object p4, p0, Ll1/o;->d:Landroid/util/Size;

    iput-object p5, p0, Ll1/o;->e:Ln0/a2$c;

    iput-object p6, p0, Ll1/o;->f:Lg0/k0;

    iput-object p7, p0, Ll1/o;->g:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public a()Lm1/p1;
    .locals 13

    iget-object v0, p0, Ll1/o;->c:Lf1/c2;

    iget-object v1, p0, Ll1/o;->g:Landroid/util/Range;

    invoke-static {v0, v1}, Ll1/m;->c(Lf1/c2;Landroid/util/Range;)Ll1/j;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Resolved VIDEO frame rates: Capture frame rate = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll1/j;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "fps. Encode frame rate = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll1/j;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "fps."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "VidEncVdPrflRslvr"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ll1/o;->c:Lf1/c2;

    invoke-virtual {v1}, Lf1/c2;->c()Landroid/util/Range;

    move-result-object v12

    const-string v1, "Using resolved VIDEO bitrate from EncoderProfiles"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v1}, Ln0/a2$c;->c()I

    move-result v3

    iget-object v1, p0, Ll1/o;->f:Lg0/k0;

    invoke-virtual {v1}, Lg0/k0;->a()I

    move-result v4

    iget-object v1, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v1}, Ln0/a2$c;->b()I

    move-result v5

    invoke-virtual {v0}, Ll1/j;->b()I

    move-result v6

    iget-object v1, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v1}, Ln0/a2$c;->f()I

    move-result v7

    iget-object v1, p0, Ll1/o;->d:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v8

    iget-object v1, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v1}, Ln0/a2$c;->l()I

    move-result v9

    iget-object v1, p0, Ll1/o;->d:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v10

    iget-object v1, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v1}, Ln0/a2$c;->h()I

    move-result v11

    invoke-static/range {v3 .. v12}, Ll1/m;->f(IIIIIIIIILandroid/util/Range;)I

    move-result v1

    iget-object v2, p0, Ll1/o;->e:Ln0/a2$c;

    invoke-virtual {v2}, Ln0/a2$c;->j()I

    move-result v2

    iget-object v3, p0, Ll1/o;->a:Ljava/lang/String;

    invoke-static {v3, v2}, Ll1/m;->b(Ljava/lang/String;I)Lm1/q1;

    move-result-object v3

    invoke-static {}, Lm1/p1;->d()Lm1/p1$a;

    move-result-object v4

    iget-object v5, p0, Ll1/o;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lm1/p1$a;->i(Ljava/lang/String;)Lm1/p1$a;

    move-result-object v4

    iget-object v5, p0, Ll1/o;->b:Ln0/a4;

    invoke-virtual {v4, v5}, Lm1/p1$a;->h(Ln0/a4;)Lm1/p1$a;

    move-result-object v4

    iget-object v5, p0, Ll1/o;->d:Landroid/util/Size;

    invoke-virtual {v4, v5}, Lm1/p1$a;->k(Landroid/util/Size;)Lm1/p1$a;

    move-result-object v4

    invoke-virtual {v4, v1}, Lm1/p1$a;->b(I)Lm1/p1$a;

    move-result-object v1

    invoke-virtual {v0}, Ll1/j;->a()I

    move-result v4

    invoke-virtual {v1, v4}, Lm1/p1$a;->c(I)Lm1/p1$a;

    move-result-object v1

    invoke-virtual {v0}, Ll1/j;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Lm1/p1$a;->f(I)Lm1/p1$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm1/p1$a;->j(I)Lm1/p1$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lm1/p1$a;->e(Lm1/q1;)Lm1/p1$a;

    move-result-object v0

    invoke-virtual {v0}, Lm1/p1$a;->a()Lm1/p1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll1/o;->a()Lm1/p1;

    move-result-object v0

    return-object v0
.end method
