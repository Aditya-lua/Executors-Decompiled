.class public final Lhq/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhq/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lhq/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/j;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lhq/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lhq/m;",
            ">;)",
            "Lhq/j;"
        }
    .end annotation

    new-instance v0, Lhq/j;

    invoke-direct {v0, p0}, Lhq/j;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lhq/m;Lfq/n1$c;)Lhq/i;
    .locals 1

    new-instance v0, Lhq/i;

    invoke-direct {v0, p0, p1}, Lhq/i;-><init>(Lhq/m;Lfq/n1$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Lfq/n1$c;)Lhq/i;
    .locals 1

    iget-object v0, p0, Lhq/j;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq/m;

    invoke-static {v0, p1}, Lhq/j;->c(Lhq/m;Lfq/n1$c;)Lhq/i;

    move-result-object p1

    return-object p1
.end method
