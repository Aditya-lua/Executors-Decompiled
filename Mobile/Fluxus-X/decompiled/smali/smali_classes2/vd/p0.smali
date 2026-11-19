.class public final Lvd/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/z;


# instance fields
.field public final a:Lge/e0;

.field public final b:Lge/e0;

.field public final c:Lge/e0;


# direct methods
.method public constructor <init>(Lge/e0;Lge/e0;Lge/e0;Lge/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/p0;->a:Lge/e0;

    iput-object p2, p0, Lvd/p0;->b:Lge/e0;

    iput-object p3, p0, Lvd/p0;->c:Lge/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lvd/p0;->a:Lge/e0;

    invoke-interface {v0}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lvd/p0;->b:Lge/e0;

    invoke-interface {v1}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lge/t0;

    iget-object v2, p0, Lvd/p0;->c:Lge/e0;

    check-cast v2, Lvd/u;

    invoke-virtual {v2}, Lvd/u;->b()Lvd/t;

    move-result-object v2

    new-instance v3, Lvd/c1;

    invoke-direct {v3}, Lvd/c1;-><init>()V

    new-instance v4, Lvd/n0;

    invoke-direct {v4, v0, v1, v2, v3}, Lvd/n0;-><init>(Landroid/content/Context;Lge/t0;Lvd/t;Lvd/d1;)V

    return-object v4
.end method
