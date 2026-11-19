.class public abstract Lk8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.datatransport.events"

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c()I
    .locals 1

    sget v0, Lk8/t0;->d:I

    return v0
.end method

.method public static d()Lk8/e;
    .locals 1

    sget-object v0, Lk8/e;->a:Lk8/e;

    return-object v0
.end method
