.class public Lx7/g$y;
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
    name = "y"
.end annotation


# instance fields
.field public q:Ljava/lang/Boolean;

.field public r:Ljava/lang/Boolean;

.field public s:Landroid/graphics/Matrix;

.field public t:Lx7/g$p;

.field public u:Lx7/g$p;

.field public v:Lx7/g$p;

.field public w:Lx7/g$p;

.field public x:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$r0;-><init>()V

    return-void
.end method


# virtual methods
.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "pattern"

    return-object v0
.end method
