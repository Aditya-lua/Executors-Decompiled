.class public final Ldf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/d$b;,
        Ldf/d$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ldf/d;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 1

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ldf/d;->b(Ljava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;I)[B
    .locals 1

    sget-object v0, Ldf/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0, p1}, Ldf/d;->c([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static c([BI)[B
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Ldf/d;->d([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static d([BIII)[B
    .locals 2

    new-instance v0, Ldf/d$b;

    mul-int/lit8 v1, p2, 0x3

    div-int/lit8 v1, v1, 0x4

    new-array v1, v1, [B

    invoke-direct {v0, p3, v1}, Ldf/d$b;-><init>(I[B)V

    const/4 p3, 0x1

    invoke-virtual {v0, p0, p1, p2, p3}, Ldf/d$b;->a([BIIZ)Z

    move-result p0

    if-eqz p0, :cond_1

    iget p0, v0, Ldf/d$a;->b:I

    iget-object p1, v0, Ldf/d$a;->a:[B

    array-length p2, p1

    if-ne p0, p2, :cond_0

    return-object p1

    :cond_0
    new-array p2, p0, [B

    const/4 p3, 0x0

    invoke-static {p1, p3, p2, p3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bad base-64"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/lang/String;)[B
    .locals 1

    const/16 v0, 0xb

    invoke-static {p0, v0}, Ldf/d;->b(Ljava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method
