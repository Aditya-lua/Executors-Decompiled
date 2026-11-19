.class public abstract Lz3/b$s;
.super Lz3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lz3/c<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lz3/c;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lz3/b$g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz3/b$s;-><init>(Ljava/lang/String;)V

    return-void
.end method
