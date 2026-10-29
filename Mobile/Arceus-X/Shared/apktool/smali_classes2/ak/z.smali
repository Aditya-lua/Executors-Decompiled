.class public final synthetic Lak/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Lak/a0;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;Lak/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/z;->a:Lcom/roblox/client/c;

    iput-object p2, p0, Lak/z;->b:Lak/a0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lak/z;->a:Lcom/roblox/client/c;

    iget-object v1, p0, Lak/z;->b:Lak/a0;

    check-cast p1, Le/m0;

    invoke-static {v0, v1, p1}, Lak/a0;->b(Lcom/roblox/client/c;Lak/a0;Le/m0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
