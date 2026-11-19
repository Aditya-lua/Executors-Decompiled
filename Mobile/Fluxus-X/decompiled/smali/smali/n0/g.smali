.class public abstract Ln0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ln0/w3;ILandroid/util/Size;Lg0/k0;Ljava/util/List;Ln0/n1;ILandroid/util/Range;Z)Ln0/g;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/w3;",
            "I",
            "Landroid/util/Size;",
            "Lg0/k0;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;",
            "Ln0/n1;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;Z)",
            "Ln0/g;"
        }
    .end annotation

    new-instance v0, Ln0/h;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ln0/h;-><init>(Ln0/w3;ILandroid/util/Size;Lg0/k0;Ljava/util/List;Ln0/n1;ILandroid/util/Range;Z)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Lg0/k0;
.end method

.method public abstract d()I
.end method

.method public abstract e()Ln0/n1;
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/util/Size;
.end method

.method public abstract h()Ln0/w3;
.end method

.method public abstract i()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j()Z
.end method

.method public k(Ln0/n1;)Ln0/t3;
    .locals 2

    invoke-virtual {p0}, Ln0/g;->g()Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, Ln0/t3;->a(Landroid/util/Size;)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {p0}, Ln0/g;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ln0/t3$a;->g(I)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {p0}, Ln0/g;->i()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/t3$a;->c(Landroid/util/Range;)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {p0}, Ln0/g;->c()Lg0/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/t3$a;->b(Lg0/k0;)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/t3$a;->d(Ln0/n1;)Ln0/t3$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object p1

    return-object p1
.end method
