.class public abstract Lg0/v2$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "g"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(ILandroid/view/Surface;)Lg0/v2$g;
    .locals 1

    new-instance v0, Lg0/j;

    invoke-direct {v0, p0, p1}, Lg0/j;-><init>(ILandroid/view/Surface;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Landroid/view/Surface;
.end method
