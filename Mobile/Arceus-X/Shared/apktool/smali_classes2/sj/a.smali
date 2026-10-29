.class public abstract Lsj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:J = -0x1L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-wide v0, Lsj/a;->b:J

    return-wide v0
.end method

.method public static b()Z
    .locals 1

    sget-boolean v0, Lsj/a;->a:Z

    return v0
.end method
