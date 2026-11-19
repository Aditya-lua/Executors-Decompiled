.class public final Lvd/u;
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

    iput-object p1, p0, Lvd/u;->a:Lge/e0;

    iput-object p2, p0, Lvd/u;->b:Lge/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvd/u;->b()Lvd/t;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lvd/t;
    .locals 3

    new-instance v0, Lvd/t;

    iget-object v1, p0, Lvd/u;->a:Lge/e0;

    iget-object v2, p0, Lvd/u;->b:Lge/e0;

    invoke-direct {v0, v1, v2}, Lvd/t;-><init>(Lge/e0;Lge/e0;)V

    return-object v0
.end method
