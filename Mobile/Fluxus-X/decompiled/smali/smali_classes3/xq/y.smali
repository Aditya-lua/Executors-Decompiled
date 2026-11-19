.class public final Lxq/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxq/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lxq/x;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lxq/y;
    .locals 1

    sget-object v0, Lxq/y$a;->a:Lxq/y;

    return-object v0
.end method

.method public static c()Lxq/x;
    .locals 1

    new-instance v0, Lxq/x;

    invoke-direct {v0}, Lxq/x;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lxq/x;
    .locals 1

    invoke-static {}, Lxq/y;->c()Lxq/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxq/y;->b()Lxq/x;

    move-result-object v0

    return-object v0
.end method
