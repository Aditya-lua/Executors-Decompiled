.class public abstract Ls0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/z2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(FFFF)Lg0/z2;
    .locals 1

    new-instance v0, Ls0/a;

    invoke-direct {v0, p0, p1, p2, p3}, Ls0/a;-><init>(FFFF)V

    return-object v0
.end method

.method public static f(Lg0/z2;)Lg0/z2;
    .locals 4

    new-instance v0, Ls0/a;

    invoke-interface {p0}, Lg0/z2;->d()F

    move-result v1

    invoke-interface {p0}, Lg0/z2;->a()F

    move-result v2

    invoke-interface {p0}, Lg0/z2;->c()F

    move-result v3

    invoke-interface {p0}, Lg0/z2;->b()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ls0/a;-><init>(FFFF)V

    return-object v0
.end method


# virtual methods
.method public abstract a()F
.end method

.method public abstract b()F
.end method

.method public abstract c()F
.end method

.method public abstract d()F
.end method
