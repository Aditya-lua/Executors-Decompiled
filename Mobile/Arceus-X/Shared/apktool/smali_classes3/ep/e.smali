.class public final Lep/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lep/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lep/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lep/e;
    .locals 1

    sget-object v0, Lep/e$a;->a:Lep/e;

    return-object v0
.end method

.method public static c()Lep/d;
    .locals 1

    new-instance v0, Lep/d;

    invoke-direct {v0}, Lep/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lep/d;
    .locals 1

    invoke-static {}, Lep/e;->c()Lep/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lep/e;->b()Lep/d;

    move-result-object v0

    return-object v0
.end method
