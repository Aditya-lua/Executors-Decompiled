.class public final Lgo/l;
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

    iput-object p1, p0, Lgo/l;->a:Lgo/g;

    return-void
.end method

.method public static a(Lgo/g;)Lgo/l;
    .locals 1

    new-instance v0, Lgo/l;

    invoke-direct {v0, p0}, Lgo/l;-><init>(Lgo/g;)V

    return-object v0
.end method

.method public static b(Lgo/g;)Lgo/d;
    .locals 0

    invoke-virtual {p0}, Lgo/g;->e()Lgo/d;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgo/d;

    return-object p0
.end method


# virtual methods
.method public c()Lgo/d;
    .locals 1

    iget-object v0, p0, Lgo/l;->a:Lgo/g;

    invoke-static {v0}, Lgo/l;->b(Lgo/g;)Lgo/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgo/l;->c()Lgo/d;

    move-result-object v0

    return-object v0
.end method
