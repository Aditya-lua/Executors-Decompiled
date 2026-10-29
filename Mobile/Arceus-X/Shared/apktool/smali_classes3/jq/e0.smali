.class public final Ljq/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lrq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljq/c0;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lrq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljq/c0;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c0;",
            "Lft/i<",
            "Lrq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/e0;->a:Ljq/c0;

    iput-object p2, p0, Ljq/e0;->b:Lft/i;

    return-void
.end method

.method public static a(Ljq/c0;Lft/i;)Ljq/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c0;",
            "Lft/i<",
            "Lrq/c;",
            ">;)",
            "Ljq/e0;"
        }
    .end annotation

    new-instance v0, Ljq/e0;

    invoke-direct {v0, p0, p1}, Ljq/e0;-><init>(Ljq/c0;Lft/i;)V

    return-object v0
.end method

.method public static c(Ljq/c0;Lrq/c;)Lrq/a;
    .locals 0

    invoke-virtual {p0, p1}, Ljq/c0;->b(Lrq/c;)Lrq/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrq/a;

    return-object p0
.end method


# virtual methods
.method public b()Lrq/a;
    .locals 2

    iget-object v0, p0, Ljq/e0;->a:Ljq/c0;

    iget-object v1, p0, Ljq/e0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrq/c;

    invoke-static {v0, v1}, Ljq/e0;->c(Ljq/c0;Lrq/c;)Lrq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/e0;->b()Lrq/a;

    move-result-object v0

    return-object v0
.end method
