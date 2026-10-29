.class public final Lhn/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhn/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lhn/i0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lhn/j0;
    .locals 1

    sget-object v0, Lhn/j0$a;->a:Lhn/j0;

    return-object v0
.end method

.method public static c()Lhn/i0;
    .locals 1

    new-instance v0, Lhn/i0;

    invoke-direct {v0}, Lhn/i0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lhn/i0;
    .locals 1

    invoke-static {}, Lhn/j0;->c()Lhn/i0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhn/j0;->b()Lhn/i0;

    move-result-object v0

    return-object v0
.end method
