.class public final Lgo/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lgo/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lgo/g;


# direct methods
.method public constructor <init>(Lgo/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/o;->a:Lgo/g;

    return-void
.end method

.method public static a(Lgo/g;)Lgo/o;
    .locals 1

    new-instance v0, Lgo/o;

    invoke-direct {v0, p0}, Lgo/o;-><init>(Lgo/g;)V

    return-object v0
.end method

.method public static c(Lgo/g;)Lgo/d;
    .locals 0

    invoke-virtual {p0}, Lgo/g;->h()Lgo/d;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgo/d;

    return-object p0
.end method


# virtual methods
.method public b()Lgo/d;
    .locals 1

    iget-object v0, p0, Lgo/o;->a:Lgo/g;

    invoke-static {v0}, Lgo/o;->c(Lgo/g;)Lgo/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgo/o;->b()Lgo/d;

    move-result-object v0

    return-object v0
.end method
