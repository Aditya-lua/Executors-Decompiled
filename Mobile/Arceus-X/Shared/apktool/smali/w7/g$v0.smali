.class public Lw7/g$v0;
.super Lw7/g$a1;
.source "SourceFile"

# interfaces
.implements Lw7/g$x0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "v0"
.end annotation


# instance fields
.field public s:Lw7/g$b1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw7/g$a1;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Lw7/g$b1;
    .locals 1

    iget-object v0, p0, Lw7/g$v0;->s:Lw7/g$b1;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "tspan"

    return-object v0
.end method

.method public o(Lw7/g$b1;)V
    .locals 0

    iput-object p1, p0, Lw7/g$v0;->s:Lw7/g$b1;

    return-void
.end method
