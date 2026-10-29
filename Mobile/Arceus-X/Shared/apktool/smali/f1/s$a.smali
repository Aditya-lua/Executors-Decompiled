.class public abstract Lf1/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/s;
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
.method public abstract a()Lf1/s;
.end method

.method public b(Lx2/a;)Lf1/s$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lf1/c2$a;",
            ">;)",
            "Lf1/s$a;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/s$a;->c()Lf1/c2;

    move-result-object v0

    invoke-virtual {v0}, Lf1/c2;->f()Lf1/c2$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf1/c2$a;->a()Lf1/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf1/s$a;->f(Lf1/c2;)Lf1/s$a;

    return-object p0
.end method

.method public abstract c()Lf1/c2;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation
.end method

.method public abstract d(Lf1/a;)Lf1/s$a;
.end method

.method public abstract e(I)Lf1/s$a;
.end method

.method public abstract f(Lf1/c2;)Lf1/s$a;
.end method
