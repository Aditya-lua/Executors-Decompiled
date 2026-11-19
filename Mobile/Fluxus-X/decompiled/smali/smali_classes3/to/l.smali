.class public final Lto/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lto/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lto/g;


# direct methods
.method public constructor <init>(Lto/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/l;->a:Lto/g;

    return-void
.end method

.method public static a(Lto/g;)Lto/l;
    .locals 1

    new-instance v0, Lto/l;

    invoke-direct {v0, p0}, Lto/l;-><init>(Lto/g;)V

    return-object v0
.end method

.method public static b(Lto/g;)Lto/d;
    .locals 0

    invoke-virtual {p0}, Lto/g;->e()Lto/d;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lto/d;

    return-object p0
.end method


# virtual methods
.method public c()Lto/d;
    .locals 1

    iget-object v0, p0, Lto/l;->a:Lto/g;

    invoke-static {v0}, Lto/l;->b(Lto/g;)Lto/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lto/l;->c()Lto/d;

    move-result-object v0

    return-object v0
.end method
