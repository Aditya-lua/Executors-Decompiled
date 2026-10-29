.class public final synthetic Lro/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lur/a;

.field public final synthetic b:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lur/a;Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/b0;->a:Lur/a;

    iput-object p2, p0, Lro/b0;->b:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lro/b0;->a:Lur/a;

    iget-object v1, p0, Lro/b0;->b:Lvr/f;

    invoke-static {v0, v1}, Lro/m0;->q(Lur/a;Lvr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
