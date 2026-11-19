.class public interface abstract Lgo/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lgo/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Leo/s;Lgo/h;)Lgo/f;
    .locals 2

    new-instance v0, Lbo/k;

    sget-object v1, Lbo/k$a;->a:Lbo/k$a;

    invoke-direct {v0, v1, p0, p1}, Lbo/k;-><init>(Lbo/k$a;Leo/s;Lgo/h;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Lgo/f;
.end method
