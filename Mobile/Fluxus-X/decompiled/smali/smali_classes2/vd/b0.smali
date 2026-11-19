.class public final Lvd/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/z;


# instance fields
.field public final a:Lge/e0;

.field public final b:Lge/e0;


# direct methods
.method public constructor <init>(Lge/e0;Lge/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/b0;->a:Lge/e0;

    iput-object p2, p0, Lvd/b0;->b:Lge/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvd/b0;->b:Lge/e0;

    iget-object v1, p0, Lvd/b0;->a:Lge/e0;

    invoke-interface {v1}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Lvd/z;

    check-cast v1, Lvd/n0;

    check-cast v0, Lvd/t0;

    invoke-direct {v2, v1, v0}, Lvd/z;-><init>(Lvd/n0;Lvd/t0;)V

    return-object v2
.end method
