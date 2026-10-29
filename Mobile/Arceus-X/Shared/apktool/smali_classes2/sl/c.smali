.class public final synthetic Lsl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/achievement/a;

.field public final synthetic b:Lsl/l;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/achievement/a;Lsl/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/c;->a:Lcom/roblox/universalapp/achievement/a;

    iput-object p2, p0, Lsl/c;->b:Lsl/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lsl/c;->a:Lcom/roblox/universalapp/achievement/a;

    iget-object v1, p0, Lsl/c;->b:Lsl/l;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lcom/roblox/universalapp/achievement/a;->l(Lcom/roblox/universalapp/achievement/a;Lsl/l;Lf5/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
