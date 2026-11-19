.class public Lx7/g$t0;
.super Lx7/g$r0;
.source "SourceFile"

# interfaces
.implements Lx7/g$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "t0"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$r0;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "symbol"

    return-object v0
.end method
