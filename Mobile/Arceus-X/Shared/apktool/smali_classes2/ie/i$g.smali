.class public final Lie/i$g;
.super Lie/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lie/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public b:I

.field public final synthetic c:Lie/i;


# direct methods
.method public constructor <init>(Lie/i;I)V
    .locals 0

    iput-object p1, p0, Lie/i$g;->c:Lie/i;

    invoke-direct {p0}, Lie/c;-><init>()V

    invoke-static {p1, p2}, Lie/i;->b(Lie/i;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lie/i$g;->a:Ljava/lang/Object;

    iput p2, p0, Lie/i$g;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lie/i$g;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lie/i$g;->c:Lie/i;

    invoke-virtual {v1}, Lie/i;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lie/i$g;->a:Ljava/lang/Object;

    iget-object v1, p0, Lie/i$g;->c:Lie/i;

    iget v2, p0, Lie/i$g;->b:I

    invoke-static {v1, v2}, Lie/i;->b(Lie/i;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lhe/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lie/i$g;->c:Lie/i;

    iget-object v1, p0, Lie/i$g;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lie/i;->j(Lie/i;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lie/i$g;->b:I

    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lie/i$g;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lie/i$g;->c:Lie/i;

    invoke-virtual {v0}, Lie/i;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lie/i$g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lie/k0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lie/i$g;->a()V

    iget v0, p0, Lie/i$g;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lie/k0;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lie/i$g;->c:Lie/i;

    invoke-static {v1, v0}, Lie/i;->k(Lie/i;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    iget-object v0, p0, Lie/i$g;->c:Lie/i;

    invoke-virtual {v0}, Lie/i;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lie/i$g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lie/k0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lie/i$g;->a()V

    iget v0, p0, Lie/i$g;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lie/i$g;->c:Lie/i;

    iget-object v1, p0, Lie/i$g;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lie/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lie/k0;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, Lie/i$g;->c:Lie/i;

    invoke-static {v1, v0}, Lie/i;->k(Lie/i;I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lie/i$g;->c:Lie/i;

    iget v2, p0, Lie/i$g;->b:I

    invoke-static {v1, v2, p1}, Lie/i;->f(Lie/i;ILjava/lang/Object;)V

    return-object v0
.end method
