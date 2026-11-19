.class public final Lkq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkq/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lkq/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lkq/d;
    .locals 1

    sget-object v0, Lkq/d$a;->a:Lkq/d;

    return-object v0
.end method

.method public static c()Lkq/c;
    .locals 1

    new-instance v0, Lkq/c;

    invoke-direct {v0}, Lkq/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lkq/c;
    .locals 1

    invoke-static {}, Lkq/d;->c()Lkq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkq/d;->b()Lkq/c;

    move-result-object v0

    return-object v0
.end method
