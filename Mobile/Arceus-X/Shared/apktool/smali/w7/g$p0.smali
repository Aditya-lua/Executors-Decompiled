.class public abstract Lw7/g$p0;
.super Lw7/g$h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "p0"
.end annotation


# instance fields
.field public o:Lw7/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lw7/g$h0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw7/g$p0;->o:Lw7/e;

    return-void
.end method
