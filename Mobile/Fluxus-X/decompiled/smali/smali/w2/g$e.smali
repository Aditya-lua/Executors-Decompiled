.class public Lw2/g$e;
.super Lw2/g$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Lw2/g$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lw2/g$d;-><init>(Lw2/g$c;)V

    iput-boolean p2, p0, Lw2/g$e;->b:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lw2/g$e;->b:Z

    return v0
.end method
