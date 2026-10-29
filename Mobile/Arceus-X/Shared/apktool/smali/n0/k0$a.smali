.class public final Ln0/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final P:Ln0/e2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ln0/e2;->a(Ljava/lang/Object;)Ln0/e2;

    move-result-object v0

    iput-object v0, p0, Ln0/k0$a;->P:Ln0/e2;

    return-void
.end method


# virtual methods
.method public b0()Ln0/e2;
    .locals 1

    iget-object v0, p0, Ln0/k0$a;->P:Ln0/e2;

    return-object v0
.end method

.method public n()Ln0/n1;
    .locals 1

    invoke-static {}, Ln0/c3;->i0()Ln0/c3;

    move-result-object v0

    return-object v0
.end method
