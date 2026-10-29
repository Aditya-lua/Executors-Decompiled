.class public abstract Lf1/p$b;
.super Lf1/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf1/p;-><init>(Lf1/p$a;)V

    return-void
.end method


# virtual methods
.method public abstract c()Lf1/x;
.end method

.method public abstract d()I
.end method
