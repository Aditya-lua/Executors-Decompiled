.class public Lqn/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqn/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lqn/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lqn/s;

.field public final b:Lqn/s;


# direct methods
.method public constructor <init>(Lqn/s;Lqn/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lqn/t$a;->a:Lqn/s;

    .line 4
    iput-object p2, p0, Lqn/t$a;->b:Lqn/s;

    return-void
.end method

.method public synthetic constructor <init>(Lqn/s;Lqn/s;Lqn/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lqn/t$a;-><init>(Lqn/s;Lqn/s;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lqn/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqn/t$b;

    iget-object v1, p0, Lqn/t$a;->a:Lqn/s;

    iget-object v2, p0, Lqn/t$a;->b:Lqn/s;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lqn/t$b;-><init>(Lqn/s;Lqn/s;Lqn/u;)V

    return-object v0
.end method
