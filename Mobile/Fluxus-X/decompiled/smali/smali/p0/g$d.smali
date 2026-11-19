.class public final Lp0/g$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/g$d$a;
    }
.end annotation


# direct methods
.method public static a(D)Lp0/g$d$a;
    .locals 3

    new-instance v0, Lp0/g$d$a;

    const-wide v1, 0x3fe3e2456f75d9a1L    # 0.621371

    mul-double/2addr p0, v1

    invoke-direct {v0, p0, p1}, Lp0/g$d$a;-><init>(D)V

    return-object v0
.end method

.method public static b(D)Lp0/g$d$a;
    .locals 3

    new-instance v0, Lp0/g$d$a;

    const-wide v1, 0x3ff269984a0e410bL    # 1.15078

    mul-double/2addr p0, v1

    invoke-direct {v0, p0, p1}, Lp0/g$d$a;-><init>(D)V

    return-object v0
.end method

.method public static c(D)Lp0/g$d$a;
    .locals 1

    new-instance v0, Lp0/g$d$a;

    invoke-direct {v0, p0, p1}, Lp0/g$d$a;-><init>(D)V

    return-object v0
.end method
