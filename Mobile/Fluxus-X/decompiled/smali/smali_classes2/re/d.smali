.class public final Lre/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lre/r;)Lre/p;
    .locals 0

    invoke-interface {p0}, Lre/r;->read()Lcf/j0;

    move-result-object p0

    invoke-static {p0}, Lre/p;->i(Lcf/j0;)Lre/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lre/p;Lre/s;)V
    .locals 0

    invoke-virtual {p0}, Lre/p;->n()Lcf/j0;

    move-result-object p0

    invoke-interface {p1, p0}, Lre/s;->a(Lcf/j0;)V

    return-void
.end method
