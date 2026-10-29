.class public Ltn/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ltn/c;
    .locals 3

    new-instance v0, Lnn/b;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lnn/b;-><init>(IIZ)V

    return-object v0
.end method

.method public static b(I)Ltn/c;
    .locals 3

    new-instance v0, Lnn/b;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lnn/b;-><init>(IIZ)V

    return-object v0
.end method

.method public static c()Ltn/c;
    .locals 3

    new-instance v0, Lnn/b;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2}, Lnn/b;-><init>(IIZ)V

    return-object v0
.end method

.method public static d()Ltn/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
