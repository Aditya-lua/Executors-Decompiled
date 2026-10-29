.class public Lz1/d$b;
.super Lz1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lz1/c;)V
    .locals 1

    invoke-direct {p0}, Lz1/b;-><init>()V

    new-instance v0, Lz1/j;

    invoke-direct {v0, p0, p1}, Lz1/j;-><init>(Lz1/b;Lz1/c;)V

    iput-object v0, p0, Lz1/b;->e:Lz1/b$a;

    return-void
.end method
