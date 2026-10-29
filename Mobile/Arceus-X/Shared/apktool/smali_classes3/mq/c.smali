.class public final Lmq/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lmq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lmq/b;


# direct methods
.method public constructor <init>(Lmq/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/c;->a:Lmq/b;

    return-void
.end method

.method public static a(Lmq/b;)Lmq/c;
    .locals 1

    new-instance v0, Lmq/c;

    invoke-direct {v0, p0}, Lmq/c;-><init>(Lmq/b;)V

    return-object v0
.end method

.method public static b(Lmq/b;)Lmq/a;
    .locals 0

    invoke-virtual {p0}, Lmq/b;->a()Lmq/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmq/a;

    return-object p0
.end method


# virtual methods
.method public c()Lmq/a;
    .locals 1

    iget-object v0, p0, Lmq/c;->a:Lmq/b;

    invoke-static {v0}, Lmq/c;->b(Lmq/b;)Lmq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmq/c;->c()Lmq/a;

    move-result-object v0

    return-object v0
.end method
