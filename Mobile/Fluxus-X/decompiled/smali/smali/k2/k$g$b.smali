.class public Lk2/k$g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/k$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/graphics/drawable/Icon;)Landroid/os/Parcelable;
    .locals 0

    return-object p0
.end method

.method public static b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    return-void
.end method
