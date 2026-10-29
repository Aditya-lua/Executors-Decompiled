.class public final synthetic Lro/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvr/f;

.field public final synthetic b:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lvr/f;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/x;->a:Lvr/f;

    iput-object p2, p0, Lro/x;->b:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lro/x;->a:Lvr/f;

    iget-object v1, p0, Lro/x;->b:Luo/l;

    invoke-static {v0, v1}, Lro/m0;->o(Lvr/f;Luo/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
