.class public Lu9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu9/e;


# static fields
.field public static final a:Lu9/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu9/h;

    invoke-direct {v0}, Lu9/h;-><init>()V

    sput-object v0, Lu9/h;->a:Lu9/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lu9/e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lu9/h;->a:Lu9/h;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final nanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
