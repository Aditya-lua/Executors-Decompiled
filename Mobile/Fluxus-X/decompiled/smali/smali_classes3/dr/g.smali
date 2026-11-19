.class public final Ldr/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ldr/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldr/f;


# direct methods
.method public constructor <init>(Ldr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/g;->a:Ldr/f;

    return-void
.end method

.method public static a(Ldr/f;)Ldr/g;
    .locals 1

    new-instance v0, Ldr/g;

    invoke-direct {v0, p0}, Ldr/g;-><init>(Ldr/f;)V

    return-object v0
.end method

.method public static b(Ldr/f;)Ldr/e;
    .locals 0

    invoke-virtual {p0}, Ldr/f;->a()Ldr/e;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldr/e;

    return-object p0
.end method


# virtual methods
.method public c()Ldr/e;
    .locals 1

    iget-object v0, p0, Ldr/g;->a:Ldr/f;

    invoke-static {v0}, Ldr/g;->b(Ldr/f;)Ldr/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldr/g;->c()Ldr/e;

    move-result-object v0

    return-object v0
.end method
