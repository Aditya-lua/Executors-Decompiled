.class public final synthetic Lqr/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;

.field public final synthetic b:Lur/o;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/l2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;

    iput-object p2, p0, Lqr/l2;->b:Lur/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/l2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;

    iget-object v1, p0, Lqr/l2;->b:Lur/o;

    invoke-static {v0, v1}, Lqr/m2;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
