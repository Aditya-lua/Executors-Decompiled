.class public interface abstract Lsn/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lsn/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Lqn/s;Lsn/h;)Lsn/g;
    .locals 1

    const-string v0, "node must not be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "position must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lon/l;

    invoke-direct {v0, p0, p1}, Lon/l;-><init>(Lqn/s;Lsn/h;)V

    return-object v0
.end method
