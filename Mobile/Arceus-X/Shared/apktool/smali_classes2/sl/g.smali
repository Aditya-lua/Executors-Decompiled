.class public final synthetic Lsl/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/roblox/universalapp/achievement/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/achievement/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lsl/g;->b:Lcom/roblox/universalapp/achievement/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lsl/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lsl/g;->b:Lcom/roblox/universalapp/achievement/a;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lcom/roblox/universalapp/achievement/a;->m(Ljava/lang/String;Lcom/roblox/universalapp/achievement/a;Lf5/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
