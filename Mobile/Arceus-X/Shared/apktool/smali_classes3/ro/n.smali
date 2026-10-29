.class public final synthetic Lro/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/n;->a:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro/n;->a:Lvr/f;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;

    invoke-static {v0, p1}, Lro/m0;->i(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
