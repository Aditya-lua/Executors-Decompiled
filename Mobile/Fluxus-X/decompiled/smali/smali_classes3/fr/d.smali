.class public final Lfr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfr/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfr/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lfr/d;
    .locals 1

    sget-object v0, Lfr/d$a;->a:Lfr/d;

    return-object v0
.end method

.method public static c()Lfr/c;
    .locals 1

    new-instance v0, Lfr/c;

    invoke-direct {v0}, Lfr/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lfr/c;
    .locals 1

    invoke-static {}, Lfr/d;->c()Lfr/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfr/d;->b()Lfr/c;

    move-result-object v0

    return-object v0
.end method
