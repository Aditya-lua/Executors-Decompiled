.class public final synthetic Lqr/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

.field public final synthetic b:Lur/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;Lur/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/x1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

    iput-object p2, p0, Lqr/x1;->b:Lur/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/x1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

    iget-object v1, p0, Lqr/x1;->b:Lur/l;

    invoke-static {v0, v1}, Lqr/y1;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;Lur/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
