.class public final Lpe/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lpe/r;Lpe/a;[B)Lpe/p;
    .locals 0

    invoke-static {p0, p1, p2}, Lpe/p;->w(Lpe/r;Lpe/a;[B)Lpe/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lpe/r;Lpe/d0;)Lpe/p;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p0}, Lpe/d;->a(Lpe/r;)Lpe/p;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lpe/p;Lpe/s;Lpe/a;[B)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lpe/p;->C(Lpe/s;Lpe/a;[B)V

    return-void
.end method

.method public static d(Lpe/p;Lpe/s;Lpe/d0;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p0, p1}, Lpe/d;->b(Lpe/p;Lpe/s;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
