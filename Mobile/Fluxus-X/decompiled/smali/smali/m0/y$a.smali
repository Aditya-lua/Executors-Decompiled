.class public abstract Lm0/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/y;
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

.method public static d(Landroidx/camera/core/d;ILg0/f1$h;)Lm0/y$a;
    .locals 1

    new-instance v0, Lm0/c;

    invoke-direct {v0, p0, p1, p2}, Lm0/c;-><init>(Landroidx/camera/core/d;ILg0/f1$h;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroidx/camera/core/d;
.end method

.method public abstract b()Lg0/f1$h;
.end method

.method public abstract c()I
.end method
