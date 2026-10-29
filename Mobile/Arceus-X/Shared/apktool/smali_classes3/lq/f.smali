.class public final Llq/f;
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

    iput-object p1, p0, Llq/f;->a:Llq/c;

    return-void
.end method

.method public static a(Llq/c;)Llq/f;
    .locals 1

    new-instance v0, Llq/f;

    invoke-direct {v0, p0}, Llq/f;-><init>(Llq/c;)V

    return-object v0
.end method

.method public static c(Llq/c;)Lku/l0;
    .locals 0

    invoke-virtual {p0}, Llq/c;->c()Lku/l0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lku/l0;

    return-object p0
.end method


# virtual methods
.method public b()Lku/l0;
    .locals 1

    iget-object v0, p0, Llq/f;->a:Llq/c;

    invoke-static {v0}, Llq/f;->c(Llq/c;)Lku/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llq/f;->b()Lku/l0;

    move-result-object v0

    return-object v0
.end method
