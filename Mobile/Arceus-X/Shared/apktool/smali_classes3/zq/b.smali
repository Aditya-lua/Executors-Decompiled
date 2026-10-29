.class public final Lzq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzq/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lzq/a$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lzq/b;
    .locals 1

    sget-object v0, Lzq/b$a;->a:Lzq/b;

    return-object v0
.end method

.method public static c()Lzq/a$a;
    .locals 1

    new-instance v0, Lzq/a$a;

    invoke-direct {v0}, Lzq/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lzq/a$a;
    .locals 1

    invoke-static {}, Lzq/b;->c()Lzq/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzq/b;->b()Lzq/a$a;

    move-result-object v0

    return-object v0
.end method
