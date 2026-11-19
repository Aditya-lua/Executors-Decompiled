.class public final Lrp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Landroidx/lifecycle/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lrp/c;


# direct methods
.method public constructor <init>(Lrp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/g;->a:Lrp/c;

    return-void
.end method

.method public static a(Lrp/c;)Lrp/g;
    .locals 1

    new-instance v0, Lrp/g;

    invoke-direct {v0, p0}, Lrp/g;-><init>(Lrp/c;)V

    return-object v0
.end method

.method public static c(Lrp/c;)Landroidx/lifecycle/l0;
    .locals 0

    invoke-virtual {p0}, Lrp/c;->d()Landroidx/lifecycle/l0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/l0;

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/lifecycle/l0;
    .locals 1

    iget-object v0, p0, Lrp/g;->a:Lrp/c;

    invoke-static {v0}, Lrp/g;->c(Lrp/c;)Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrp/g;->b()Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method
