.class public Lx7/g$s;
.super Lx7/g$h0;
.source "SourceFile"

# interfaces
.implements Lx7/g$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "s"
.end annotation


# instance fields
.field public o:Ljava/lang/Boolean;

.field public p:Ljava/lang/Boolean;

.field public q:Lx7/g$p;

.field public r:Lx7/g$p;

.field public s:Lx7/g$p;

.field public t:Lx7/g$p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$h0;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "mask"

    return-object v0
.end method
