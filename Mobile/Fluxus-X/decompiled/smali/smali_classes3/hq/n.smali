.class public final Lhq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lhq/m;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lhq/n;
    .locals 1

    sget-object v0, Lhq/n$a;->a:Lhq/n;

    return-object v0
.end method

.method public static c()Lhq/m;
    .locals 1

    new-instance v0, Lhq/m;

    invoke-direct {v0}, Lhq/m;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lhq/m;
    .locals 1

    invoke-static {}, Lhq/n;->c()Lhq/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/n;->b()Lhq/m;

    move-result-object v0

    return-object v0
.end method
