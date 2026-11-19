.class public final Lre/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lre/r;Lre/a;[B)Lre/p;
    .locals 0

    invoke-static {p0, p1, p2}, Lre/p;->w(Lre/r;Lre/a;[B)Lre/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lre/r;Lre/d0;)Lre/p;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p0}, Lre/d;->a(Lre/r;)Lre/p;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lre/p;Lre/s;Lre/a;[B)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lre/p;->C(Lre/s;Lre/a;[B)V

    return-void
.end method

.method public static d(Lre/p;Lre/s;Lre/d0;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p0, p1}, Lre/d;->b(Lre/p;Lre/s;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
