.class public final Lsp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsp/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsp/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lsp/e;
    .locals 1

    sget-object v0, Lsp/e$a;->a:Lsp/e;

    return-object v0
.end method

.method public static c()Lsp/d;
    .locals 1

    new-instance v0, Lsp/d;

    invoke-direct {v0}, Lsp/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lsp/d;
    .locals 1

    invoke-static {}, Lsp/e;->c()Lsp/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsp/e;->b()Lsp/d;

    move-result-object v0

    return-object v0
.end method
