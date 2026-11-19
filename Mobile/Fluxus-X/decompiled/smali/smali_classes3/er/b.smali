.class public final Ler/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ler/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ler/a;


# direct methods
.method public constructor <init>(Ler/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ler/b;->a:Ler/a;

    return-void
.end method

.method public static a(Ler/a;)Ler/b;
    .locals 1

    new-instance v0, Ler/b;

    invoke-direct {v0, p0}, Ler/b;-><init>(Ler/a;)V

    return-object v0
.end method

.method public static c(Ler/a;)Ler/c;
    .locals 0

    invoke-virtual {p0}, Ler/a;->a()Ler/c;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ler/c;

    return-object p0
.end method


# virtual methods
.method public b()Ler/c;
    .locals 1

    iget-object v0, p0, Ler/b;->a:Ler/a;

    invoke-static {v0}, Ler/b;->c(Ler/a;)Ler/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ler/b;->b()Ler/c;

    move-result-object v0

    return-object v0
.end method
