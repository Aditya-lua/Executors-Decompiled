.class public Lmi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lmi/f;


# direct methods
.method public static a()Lmi/f;
    .locals 1

    sget-object v0, Lmi/g;->a:Lmi/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lmi/h;

    invoke-direct {v0}, Lmi/h;-><init>()V

    return-object v0
.end method
