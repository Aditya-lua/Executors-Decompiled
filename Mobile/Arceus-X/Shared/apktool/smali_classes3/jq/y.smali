.class public final Ljq/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljq/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljq/x;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljq/y;
    .locals 1

    sget-object v0, Ljq/y$a;->a:Ljq/y;

    return-object v0
.end method

.method public static c()Ljq/x;
    .locals 1

    new-instance v0, Ljq/x;

    invoke-direct {v0}, Ljq/x;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Ljq/x;
    .locals 1

    invoke-static {}, Ljq/y;->c()Ljq/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/y;->b()Ljq/x;

    move-result-object v0

    return-object v0
.end method
