.class public final Ldp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Landroidx/lifecycle/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldp/c;


# direct methods
.method public constructor <init>(Ldp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/g;->a:Ldp/c;

    return-void
.end method

.method public static a(Ldp/c;)Ldp/g;
    .locals 1

    new-instance v0, Ldp/g;

    invoke-direct {v0, p0}, Ldp/g;-><init>(Ldp/c;)V

    return-object v0
.end method

.method public static c(Ldp/c;)Landroidx/lifecycle/l0;
    .locals 0

    invoke-virtual {p0}, Ldp/c;->d()Landroidx/lifecycle/l0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/l0;

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/lifecycle/l0;
    .locals 1

    iget-object v0, p0, Ldp/g;->a:Ldp/c;

    invoke-static {v0}, Ldp/g;->c(Ldp/c;)Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldp/g;->b()Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method
