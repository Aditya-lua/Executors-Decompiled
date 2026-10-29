.class public final Ljq/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0011\u0008\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000f\u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u000b\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Ljq/f;",
        "",
        "",
        "srcR",
        "srcG",
        "srcB",
        "destR",
        "destG",
        "destB",
        "<init>",
        "(DDDDDD)V",
        "a",
        "D",
        "f",
        "()D",
        "b",
        "e",
        "c",
        "d",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D

.field public final d:D

.field public final e:D

.field public final f:D


# direct methods
.method public constructor <init>(DDDDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ljq/f;->a:D

    iput-wide p3, p0, Ljq/f;->b:D

    iput-wide p5, p0, Ljq/f;->c:D

    iput-wide p7, p0, Ljq/f;->d:D

    iput-wide p9, p0, Ljq/f;->e:D

    iput-wide p11, p0, Ljq/f;->f:D

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->f:D

    return-wide v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->e:D

    return-wide v0
.end method

.method public final c()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->d:D

    return-wide v0
.end method

.method public final d()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->c:D

    return-wide v0
.end method

.method public final e()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->b:D

    return-wide v0
.end method

.method public final f()D
    .locals 2

    iget-wide v0, p0, Ljq/f;->a:D

    return-wide v0
.end method
