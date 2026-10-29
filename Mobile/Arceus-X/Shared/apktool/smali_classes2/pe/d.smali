.class public final Lpe/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lpe/r;)Lpe/p;
    .locals 0

    invoke-interface {p0}, Lpe/r;->read()Laf/j0;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->i(Laf/j0;)Lpe/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lpe/p;Lpe/s;)V
    .locals 0

    invoke-virtual {p0}, Lpe/p;->n()Laf/j0;

    move-result-object p0

    invoke-interface {p1, p0}, Lpe/s;->a(Laf/j0;)V

    return-void
.end method
