.class public final Lvd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/z;


# instance fields
.field public final a:Lge/e0;


# direct methods
.method public constructor <init>(Lge/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/f;->a:Lge/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvd/f;->a:Lge/e0;

    invoke-interface {v0}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lvd/e;

    check-cast v0, Lvd/m;

    invoke-direct {v1, v0}, Lvd/e;-><init>(Lvd/m;)V

    return-object v1
.end method
