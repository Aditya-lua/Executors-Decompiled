.class public abstract Lm0/u0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lm0/v0;Landroidx/camera/core/d;)Lm0/u0$b;
    .locals 1

    new-instance v0, Lm0/h;

    invoke-direct {v0, p0, p1}, Lm0/h;-><init>(Lm0/v0;Landroidx/camera/core/d;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroidx/camera/core/d;
.end method

.method public abstract b()Lm0/v0;
.end method
