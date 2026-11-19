.class public final synthetic Lqr/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;

.field public final synthetic b:Lur/q;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;Lur/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/l1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;

    iput-object p2, p0, Lqr/l1;->b:Lur/q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/l1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;

    iget-object v1, p0, Lqr/l1;->b:Lur/q;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/c;->g(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;Lur/q;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
