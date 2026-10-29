.class public final Lre/f0;
.super Lre/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lre/g0;-><init>([B)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/nio/ByteBuffer;[B[B)[B
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lre/g0;->a(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/nio/ByteBuffer;[B[B[B)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lre/g0;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    return-void
.end method

.method public e([BI)Lre/e0;
    .locals 1

    new-instance v0, Lre/d0;

    invoke-direct {v0, p1, p2}, Lre/d0;-><init>([BI)V

    return-object v0
.end method
