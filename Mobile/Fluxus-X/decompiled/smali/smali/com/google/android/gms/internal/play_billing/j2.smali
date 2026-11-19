.class public final Lcom/google/android/gms/internal/play_billing/j2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_1

    instance-of v0, p0, Ljava/lang/StackOverflowError;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_1
    return-void
.end method
