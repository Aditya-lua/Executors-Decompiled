.class public final Ltq/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltq/k2$d;


# instance fields
.field public final a:Ltq/m2;


# direct methods
.method public constructor <init>(Ltq/m2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/n2;->a:Ltq/m2;

    return-void
.end method

.method public static b(Ltq/m2;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltq/m2;",
            ")",
            "Lwt/i<",
            "Ltq/k2$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltq/n2;

    invoke-direct {v0, p0}, Ltq/n2;-><init>(Ltq/m2;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lmq/q5$b;Landroidx/lifecycle/l0;)Ltq/k2;
    .locals 1

    iget-object v0, p0, Ltq/n2;->a:Ltq/m2;

    invoke-virtual {v0, p1, p2}, Ltq/m2;->b(Lmq/q5$b;Landroidx/lifecycle/l0;)Ltq/k2;

    move-result-object p1

    return-object p1
.end method
