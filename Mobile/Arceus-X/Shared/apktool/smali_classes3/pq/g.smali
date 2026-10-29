.class public final Lpq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lpq/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lpq/f;


# direct methods
.method public constructor <init>(Lpq/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/g;->a:Lpq/f;

    return-void
.end method

.method public static a(Lpq/f;)Lpq/g;
    .locals 1

    new-instance v0, Lpq/g;

    invoke-direct {v0, p0}, Lpq/g;-><init>(Lpq/f;)V

    return-object v0
.end method

.method public static b(Lpq/f;)Lpq/e;
    .locals 0

    invoke-virtual {p0}, Lpq/f;->a()Lpq/e;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpq/e;

    return-object p0
.end method


# virtual methods
.method public c()Lpq/e;
    .locals 1

    iget-object v0, p0, Lpq/g;->a:Lpq/f;

    invoke-static {v0}, Lpq/g;->b(Lpq/f;)Lpq/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpq/g;->c()Lpq/e;

    move-result-object v0

    return-object v0
.end method
