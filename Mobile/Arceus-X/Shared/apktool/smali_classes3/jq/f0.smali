.class public final Ljq/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lvq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljq/c0;


# direct methods
.method public constructor <init>(Ljq/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/f0;->a:Ljq/c0;

    return-void
.end method

.method public static a(Ljq/c0;)Ljq/f0;
    .locals 1

    new-instance v0, Ljq/f0;

    invoke-direct {v0, p0}, Ljq/f0;-><init>(Ljq/c0;)V

    return-object v0
.end method

.method public static c(Ljq/c0;)Lvq/a;
    .locals 0

    invoke-virtual {p0}, Ljq/c0;->c()Lvq/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvq/a;

    return-object p0
.end method


# virtual methods
.method public b()Lvq/a;
    .locals 1

    iget-object v0, p0, Ljq/f0;->a:Ljq/c0;

    invoke-static {v0}, Ljq/f0;->c(Ljq/c0;)Lvq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/f0;->b()Lvq/a;

    move-result-object v0

    return-object v0
.end method
