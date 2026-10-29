.class public Lei/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lei/f;


# direct methods
.method public static a()Lei/f;
    .locals 1

    sget-object v0, Lei/g;->a:Lei/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lei/h;

    invoke-direct {v0}, Lei/h;-><init>()V

    return-object v0
.end method
