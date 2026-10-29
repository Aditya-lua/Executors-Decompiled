.class public final Lz/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/j4;


# instance fields
.field public final b:Lz/q3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lz/q3;->c(Landroid/content/Context;)Lz/q3;

    move-result-object p1

    iput-object p1, p0, Lz/t2;->b:Lz/q3;

    return-void
.end method


# virtual methods
.method public a(Ln0/j4$b;I)Ln0/n1;
    .locals 3

    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    new-instance v1, Ln0/o3$b;

    invoke-direct {v1}, Ln0/o3$b;-><init>()V

    invoke-static {p1, p2}, Lz/t5;->b(Ln0/j4$b;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ln0/o3$b;->B(I)Ln0/o3$b;

    sget-object v2, Ln0/i4;->w:Ln0/n1$a;

    invoke-virtual {v1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v1, Ln0/i4;->y:Ln0/n1$a;

    sget-object v2, Lz/s2;->a:Lz/s2;

    invoke-virtual {v0, v1, v2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    new-instance v1, Ln0/l1$a;

    invoke-direct {v1}, Ln0/l1$a;-><init>()V

    invoke-static {p1, p2}, Lz/t5;->a(Ln0/j4$b;I)I

    move-result p2

    invoke-virtual {v1, p2}, Ln0/l1$a;->v(I)V

    sget-object p2, Ln0/i4;->x:Ln0/n1$a;

    invoke-virtual {v1}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p2, Ln0/i4;->z:Ln0/n1$a;

    sget-object v1, Ln0/j4$b;->a:Ln0/j4$b;

    if-ne p1, v1, :cond_0

    sget-object v1, Lz/n4;->c:Lz/n4;

    goto :goto_0

    :cond_0
    sget-object v1, Lz/b1;->a:Lz/b1;

    :goto_0
    invoke-virtual {v0, p2, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p2, Ln0/j4$b;->b:Ln0/j4$b;

    if-ne p1, p2, :cond_1

    iget-object p2, p0, Lz/t2;->b:Lz/q3;

    invoke-virtual {p2}, Lz/q3;->f()Landroid/util/Size;

    move-result-object p2

    sget-object v1, Ln0/i2;->s:Ln0/n1$a;

    invoke-virtual {v0, v1, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_1
    iget-object p2, p0, Lz/t2;->b:Lz/q3;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lz/q3;->d(Z)Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getRotation()I

    move-result p2

    sget-object v1, Ln0/i2;->n:Ln0/n1$a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p2, Ln0/j4$b;->d:Ln0/j4$b;

    if-eq p1, p2, :cond_2

    sget-object p2, Ln0/j4$b;->e:Ln0/j4$b;

    if-ne p1, p2, :cond_3

    :cond_2
    sget-object p1, Ln0/i4;->E:Ln0/n1$a;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_3
    invoke-static {v0}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object p1

    return-object p1
.end method
