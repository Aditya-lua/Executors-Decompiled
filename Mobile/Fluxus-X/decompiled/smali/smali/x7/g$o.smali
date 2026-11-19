.class public Lx7/g$o;
.super Lx7/g$p0;
.source "SourceFile"

# interfaces
.implements Lx7/g$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "o"
.end annotation


# instance fields
.field public p:Ljava/lang/String;

.field public q:Lx7/g$p;

.field public r:Lx7/g$p;

.field public s:Lx7/g$p;

.field public t:Lx7/g$p;

.field public u:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$p0;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lx7/g$o;->u:Landroid/graphics/Matrix;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "image"

    return-object v0
.end method
