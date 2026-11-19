.class public final Lar/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lar/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lar/b;


# direct methods
.method public constructor <init>(Lar/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/c;->a:Lar/b;

    return-void
.end method

.method public static a(Lar/b;)Lar/c;
    .locals 1

    new-instance v0, Lar/c;

    invoke-direct {v0, p0}, Lar/c;-><init>(Lar/b;)V

    return-object v0
.end method

.method public static b(Lar/b;)Lar/a;
    .locals 0

    invoke-virtual {p0}, Lar/b;->a()Lar/a;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lar/a;

    return-object p0
.end method


# virtual methods
.method public c()Lar/a;
    .locals 1

    iget-object v0, p0, Lar/c;->a:Lar/b;

    invoke-static {v0}, Lar/c;->b(Lar/b;)Lar/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lar/c;->c()Lar/a;

    move-result-object v0

    return-object v0
.end method
