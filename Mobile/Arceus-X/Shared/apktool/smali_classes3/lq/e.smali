.class public final Llq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lku/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Llq/c;


# direct methods
.method public constructor <init>(Llq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq/e;->a:Llq/c;

    return-void
.end method

.method public static a(Llq/c;)Llq/e;
    .locals 1

    new-instance v0, Llq/e;

    invoke-direct {v0, p0}, Llq/e;-><init>(Llq/c;)V

    return-object v0
.end method

.method public static c(Llq/c;)Lku/l0;
    .locals 0

    invoke-virtual {p0}, Llq/c;->b()Lku/l0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lku/l0;

    return-object p0
.end method


# virtual methods
.method public b()Lku/l0;
    .locals 1

    iget-object v0, p0, Llq/e;->a:Llq/c;

    invoke-static {v0}, Llq/e;->c(Llq/c;)Lku/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llq/e;->b()Lku/l0;

    move-result-object v0

    return-object v0
.end method
