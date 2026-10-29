.class public final Lfb/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lfb/c1;

    const-string v1, "expected a non-null reference"

    invoke-static {v1, v0}, Lfb/a1;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lfb/c1;-><init>(Ljava/lang/String;)V

    throw p0
.end method
