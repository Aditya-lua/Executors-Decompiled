.class public final Lv7/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:J = 0xbb8L

.field public static c:J = 0x7530L

.field public static d:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()I
    .locals 1

    sget v0, Lv7/l1;->d:I

    return v0
.end method

.method public static b()J
    .locals 2

    sget-wide v0, Lv7/l1;->c:J

    return-wide v0
.end method

.method public static c()J
    .locals 2

    sget-wide v0, Lv7/l1;->b:J

    return-wide v0
.end method

.method public static d(J)V
    .locals 0

    sput-wide p0, Lv7/l1;->c:J

    return-void
.end method

.method public static e(I)V
    .locals 0

    sput p0, Lv7/l1;->d:I

    return-void
.end method

.method public static f(J)V
    .locals 0

    sput-wide p0, Lv7/l1;->b:J

    return-void
.end method

.method public static g(Z)V
    .locals 0

    sput-boolean p0, Lv7/l1;->a:Z

    return-void
.end method
