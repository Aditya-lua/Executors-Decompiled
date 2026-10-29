.class public final Lrq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lrq/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lrq/d;
    .locals 1

    sget-object v0, Lrq/d$a;->a:Lrq/d;

    return-object v0
.end method

.method public static c()Lrq/c;
    .locals 1

    new-instance v0, Lrq/c;

    invoke-direct {v0}, Lrq/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lrq/c;
    .locals 1

    invoke-static {}, Lrq/d;->c()Lrq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrq/d;->b()Lrq/c;

    move-result-object v0

    return-object v0
.end method
