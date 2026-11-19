.class public Lx7/g$w0;
.super Lx7/g$a1;
.source "SourceFile"

# interfaces
.implements Lx7/g$b1;
.implements Lx7/g$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "w0"
.end annotation


# instance fields
.field public s:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/g$a1;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lx7/g$w0;->s:Landroid/graphics/Matrix;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "text"

    return-object v0
.end method
