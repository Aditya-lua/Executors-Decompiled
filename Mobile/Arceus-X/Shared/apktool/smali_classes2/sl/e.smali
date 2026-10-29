.class public final synthetic Lsl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/roblox/universalapp/achievement/a;

.field public final synthetic c:Ljava/time/Instant;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/achievement/a;Ljava/time/Instant;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lsl/e;->b:Lcom/roblox/universalapp/achievement/a;

    iput-object p3, p0, Lsl/e;->c:Ljava/time/Instant;

    iput-object p4, p0, Lsl/e;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lsl/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lsl/e;->b:Lcom/roblox/universalapp/achievement/a;

    iget-object v2, p0, Lsl/e;->c:Ljava/time/Instant;

    iget-object v3, p0, Lsl/e;->d:Ljava/util/List;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/achievement/a;->k(Ljava/lang/String;Lcom/roblox/universalapp/achievement/a;Ljava/time/Instant;Ljava/util/List;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
