.class public final Lqq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lqq/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lqq/a;


# direct methods
.method public constructor <init>(Lqq/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqq/b;->a:Lqq/a;

    return-void
.end method

.method public static a(Lqq/a;)Lqq/b;
    .locals 1

    new-instance v0, Lqq/b;

    invoke-direct {v0, p0}, Lqq/b;-><init>(Lqq/a;)V

    return-object v0
.end method

.method public static c(Lqq/a;)Lqq/c;
    .locals 0

    invoke-virtual {p0}, Lqq/a;->a()Lqq/c;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqq/c;

    return-object p0
.end method


# virtual methods
.method public b()Lqq/c;
    .locals 1

    iget-object v0, p0, Lqq/b;->a:Lqq/a;

    invoke-static {v0}, Lqq/b;->c(Lqq/a;)Lqq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqq/b;->b()Lqq/c;

    move-result-object v0

    return-object v0
.end method
