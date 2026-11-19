.class public Lao/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lho/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lho/d;


# direct methods
.method public constructor <init>(Lho/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao/k$a;->a:Lho/d;

    return-void
.end method


# virtual methods
.method public a()Lho/d;
    .locals 1

    iget-object v0, p0, Lao/k$a;->a:Lho/d;

    return-object v0
.end method

.method public b()Lfo/j;
    .locals 2

    iget-object v0, p0, Lao/k$a;->a:Lho/d;

    instance-of v1, v0, Lao/z;

    if-eqz v1, :cond_0

    check-cast v0, Lao/z;

    invoke-virtual {v0}, Lao/z;->k()Lfo/j;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lfo/j;->b()Lfo/j;

    move-result-object v0

    return-object v0
.end method
