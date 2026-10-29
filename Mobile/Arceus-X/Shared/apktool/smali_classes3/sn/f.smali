.class public interface abstract Lsn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lsn/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Lqn/s;Lsn/h;)Lsn/f;
    .locals 2

    new-instance v0, Lon/k;

    sget-object v1, Lon/k$a;->a:Lon/k$a;

    invoke-direct {v0, v1, p0, p1}, Lon/k;-><init>(Lon/k$a;Lqn/s;Lsn/h;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lsn/f;
.end method
