.class public Lw7/g$r;
.super Lw7/g$r0;
.source "SourceFile"

# interfaces
.implements Lw7/g$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "r"
.end annotation


# instance fields
.field public q:Z

.field public r:Lw7/g$p;

.field public s:Lw7/g$p;

.field public t:Lw7/g$p;

.field public u:Lw7/g$p;

.field public v:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw7/g$r0;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "marker"

    return-object v0
.end method
