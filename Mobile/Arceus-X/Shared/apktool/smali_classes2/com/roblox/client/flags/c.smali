.class public Lcom/roblox/client/flags/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth/g;


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/roblox/client/flags/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/flags/c;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public N0(Ljava/lang/String;)Lcom/roblox/client/flags/a;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/flags/c;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/flags/a;

    return-object p1
.end method

.method public R3()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/roblox/client/flags/a;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/flags/c;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f6(Ljava/lang/String;Lcom/roblox/client/flags/a;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/flags/c;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
