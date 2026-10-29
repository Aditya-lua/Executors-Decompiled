.class public final Lwp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwp/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lwp/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lwp/d;
    .locals 1

    sget-object v0, Lwp/d$a;->a:Lwp/d;

    return-object v0
.end method

.method public static c()Lwp/c;
    .locals 1

    new-instance v0, Lwp/c;

    invoke-direct {v0}, Lwp/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lwp/c;
    .locals 1

    invoke-static {}, Lwp/d;->c()Lwp/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwp/d;->b()Lwp/c;

    move-result-object v0

    return-object v0
.end method
