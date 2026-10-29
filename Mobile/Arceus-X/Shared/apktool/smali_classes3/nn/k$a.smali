.class public Lnn/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltn/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ltn/d;


# direct methods
.method public constructor <init>(Ltn/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn/k$a;->a:Ltn/d;

    return-void
.end method


# virtual methods
.method public a()Ltn/d;
    .locals 1

    iget-object v0, p0, Lnn/k$a;->a:Ltn/d;

    return-object v0
.end method

.method public b()Lrn/j;
    .locals 2

    iget-object v0, p0, Lnn/k$a;->a:Ltn/d;

    instance-of v1, v0, Lnn/z;

    if-eqz v1, :cond_0

    check-cast v0, Lnn/z;

    invoke-virtual {v0}, Lnn/z;->k()Lrn/j;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lrn/j;->b()Lrn/j;

    move-result-object v0

    return-object v0
.end method
