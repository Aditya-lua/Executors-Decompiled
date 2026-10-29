.class public final Ln0/m1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/m1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ln0/l1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/l1$a;

    invoke-direct {v0}, Ln0/l1$a;-><init>()V

    invoke-virtual {v0}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v0

    iput-object v0, p0, Ln0/m1$a;->a:Ln0/l1;

    return-void
.end method


# virtual methods
.method public a()Ln0/l1;
    .locals 1

    iget-object v0, p0, Ln0/m1$a;->a:Ln0/l1;

    return-object v0
.end method

.method public getId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
