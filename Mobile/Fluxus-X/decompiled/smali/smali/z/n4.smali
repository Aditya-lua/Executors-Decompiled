.class public final Lz/n4;
.super Lz/b1;
.source "SourceFile"


# static fields
.field public static final c:Lz/n4;


# instance fields
.field public final b:Ld0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/n4;

    new-instance v1, Ld0/j;

    invoke-direct {v1}, Ld0/j;-><init>()V

    invoke-direct {v0, v1}, Lz/n4;-><init>(Ld0/j;)V

    sput-object v0, Lz/n4;->c:Lz/n4;

    return-void
.end method

.method public constructor <init>(Ld0/j;)V
    .locals 0

    invoke-direct {p0}, Lz/b1;-><init>()V

    iput-object p1, p0, Lz/n4;->b:Ld0/j;

    return-void
.end method


# virtual methods
.method public a(Ln0/i4;Ln0/l1$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Ln0/l1$a;",
            ")V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lz/b1;->a(Ln0/i4;Ln0/l1$a;)V

    instance-of v0, p1, Ln0/g2;

    if-eqz v0, :cond_1

    check-cast p1, Ln0/g2;

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    invoke-virtual {p1}, Ln0/g2;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz/n4;->b:Ld0/j;

    invoke-virtual {p1}, Ln0/g2;->i0()I

    move-result p1

    invoke-virtual {v1, p1, v0}, Ld0/j;->a(ILy/a$a;)V

    :cond_0
    invoke-virtual {v0}, Ly/a$a;->b()Ly/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/l1$a;->e(Ln0/n1;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "config is not ImageCaptureConfig"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
