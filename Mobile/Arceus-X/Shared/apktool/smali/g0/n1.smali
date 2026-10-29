.class public final Lg0/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IIII)Ln0/j2;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object p0

    new-instance p1, Lg0/c;

    invoke-direct {p1, p0}, Lg0/c;-><init>(Landroid/media/ImageReader;)V

    return-object p1
.end method
