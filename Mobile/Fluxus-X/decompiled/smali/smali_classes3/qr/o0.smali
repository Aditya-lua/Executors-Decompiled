.class public final synthetic Lqr/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;

.field public final synthetic b:Lur/d;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lur/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/o0;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;

    iput-object p2, p0, Lqr/o0;->b:Lur/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/o0;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;

    iget-object v1, p0, Lqr/o0;->b:Lur/d;

    invoke-static {v0, v1}, Lqr/q0;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lur/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
