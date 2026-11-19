.class public Lao/h;
.super Lho/a;
.source "SourceFile"


# instance fields
.field public final a:Leo/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lho/a;-><init>()V

    new-instance v0, Leo/f;

    invoke-direct {v0}, Leo/f;-><init>()V

    iput-object v0, p0, Lao/h;->a:Leo/f;

    return-void
.end method


# virtual methods
.method public a(Lho/h;)Lho/c;
    .locals 0

    invoke-interface {p1}, Lho/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Lho/c;->b(I)Lho/c;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic f()Leo/a;
    .locals 1

    invoke-virtual {p0}, Lao/h;->k()Leo/f;

    move-result-object v0

    return-object v0
.end method

.method public g(Leo/a;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public k()Leo/f;
    .locals 1

    iget-object v0, p0, Lao/h;->a:Leo/f;

    return-object v0
.end method
