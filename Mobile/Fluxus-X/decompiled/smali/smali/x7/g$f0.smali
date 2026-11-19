.class public Lx7/g$f0;
.super Lx7/g$r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f0"
.end annotation


# instance fields
.field public q:Lx7/g$p;

.field public r:Lx7/g$p;

.field public s:Lx7/g$p;

.field public t:Lx7/g$p;

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$r0;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "svg"

    return-object v0
.end method
