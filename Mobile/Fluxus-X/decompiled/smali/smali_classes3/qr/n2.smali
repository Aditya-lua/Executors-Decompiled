.class public final synthetic Lqr/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;

.field public final synthetic b:Lur/p;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lur/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/n2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;

    iput-object p2, p0, Lqr/n2;->b:Lur/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/n2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;

    iget-object v1, p0, Lqr/n2;->b:Lur/p;

    invoke-static {v0, v1}, Lqr/o2;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lur/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
