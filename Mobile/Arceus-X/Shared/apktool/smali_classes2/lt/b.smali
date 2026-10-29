.class public Llt/b;
.super Llt/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0005H\u0087\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0008H\u0087\u0004\u00a2\u0006\u0004\u0008\t\u0010\n\u001a \u0010\u000c\u001a\u00020\u0002*\u0004\u0018\u00010\u000b2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u000bH\u0087\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ljt/x;",
        "other",
        "",
        "b",
        "([I[I)Z",
        "Ljt/z;",
        "d",
        "([J[J)Z",
        "Ljt/v;",
        "c",
        "([B[B)Z",
        "Ljt/c0;",
        "a",
        "([S[S)Z",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x31
    xs = "kotlin/collections/unsigned/UArraysKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llt/a;-><init>()V

    return-void
.end method

.method public static a([S[S)Z
    .locals 1
    .param p0    # [S
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # [S
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([S[S)Z

    move-result p0

    return p0
.end method

.method public static b([I[I)Z
    .locals 1
    .param p0    # [I
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # [I
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p0

    return p0
.end method

.method public static c([B[B)Z
    .locals 1
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method public static d([J[J)Z
    .locals 1
    .param p0    # [J
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # [J
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p0

    return p0
.end method
