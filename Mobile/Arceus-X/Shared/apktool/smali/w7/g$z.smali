.class public Lw7/g$z;
.super Lw7/g$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "z"
.end annotation


# instance fields
.field public o:[F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw7/g$l;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "polyline"

    return-object v0
.end method
