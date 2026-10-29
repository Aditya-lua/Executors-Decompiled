.class public abstract Lg0/j2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Landroid/util/Size;Landroid/graphics/Rect;Ln0/p0;IZ)Lg0/j2$a;
    .locals 6

    new-instance v0, Lg0/h;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lg0/h;-><init>(Landroid/util/Size;Landroid/graphics/Rect;Ln0/p0;IZ)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ln0/p0;
.end method

.method public abstract b()Landroid/graphics/Rect;
.end method

.method public abstract c()Landroid/util/Size;
.end method

.method public abstract d()Z
.end method

.method public abstract e()I
.end method
