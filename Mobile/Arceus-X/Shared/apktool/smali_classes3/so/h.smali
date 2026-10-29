.class public final synthetic Lso/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;


# direct methods
.method public synthetic constructor <init>(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/h;->a:Lno/a;

    iput-object p2, p0, Lso/h;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lso/h;->a:Lno/a;

    iget-object v1, p0, Lso/h;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;

    invoke-static {v0, v1}, Lso/j;->e(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
