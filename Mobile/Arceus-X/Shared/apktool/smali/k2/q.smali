.class public final Lk2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ZI)I
    .locals 1

    if-eqz p0, :cond_1

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p0, v0, :cond_0

    const/high16 p0, 0x2000000

    :goto_0
    or-int/2addr p0, p1

    return p0

    :cond_0
    return p1

    :cond_1
    const/high16 p0, 0x4000000

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;
    .locals 0

    invoke-static {p4, p3}, Lk2/q;->a(ZI)I

    move-result p3

    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method
