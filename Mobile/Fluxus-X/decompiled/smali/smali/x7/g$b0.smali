.class public Lx7/g$b0;
.super Lx7/g$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b0"
.end annotation


# instance fields
.field public o:Lx7/g$p;

.field public p:Lx7/g$p;

.field public q:Lx7/g$p;

.field public r:Lx7/g$p;

.field public s:Lx7/g$p;

.field public t:Lx7/g$p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$l;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "rect"

    return-object v0
.end method
