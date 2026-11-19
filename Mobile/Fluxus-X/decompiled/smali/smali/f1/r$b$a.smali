.class public abstract Lf1/r$b$a;
.super Lf1/u$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/u$b$a<",
        "Lf1/r$b$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf1/u$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c()Lf1/r$b;
.end method

.method public abstract d(Ljava/io/File;)Lf1/r$b$a;
.end method
