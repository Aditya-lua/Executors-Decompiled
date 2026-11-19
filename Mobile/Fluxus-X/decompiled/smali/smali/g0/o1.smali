.class public abstract Lg0/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/i1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Ln0/z3;JILandroid/graphics/Matrix;I)Lg0/i1;
    .locals 7

    new-instance v0, Lg0/g;

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lg0/g;-><init>(Ln0/z3;JILandroid/graphics/Matrix;I)V

    return-object v0
.end method


# virtual methods
.method public a(Lp0/i$b;)V
    .locals 1

    invoke-virtual {p0}, Lg0/o1;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lp0/i$b;->m(I)Lp0/i$b;

    return-void
.end method

.method public abstract b()I
.end method

.method public abstract c()Ln0/z3;
.end method

.method public abstract d()I
.end method

.method public abstract e()Landroid/graphics/Matrix;
.end method

.method public abstract getTimestamp()J
.end method
