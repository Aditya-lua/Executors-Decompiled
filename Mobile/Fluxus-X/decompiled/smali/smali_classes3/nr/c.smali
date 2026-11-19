.class public final Lnr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnr/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnr/b$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lnr/c;
    .locals 1

    sget-object v0, Lnr/c$a;->a:Lnr/c;

    return-object v0
.end method

.method public static c()Lnr/b$a;
    .locals 1

    new-instance v0, Lnr/b$a;

    invoke-direct {v0}, Lnr/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lnr/b$a;
    .locals 1

    invoke-static {}, Lnr/c;->c()Lnr/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnr/c;->b()Lnr/b$a;

    move-result-object v0

    return-object v0
.end method
