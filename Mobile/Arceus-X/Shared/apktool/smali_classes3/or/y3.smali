.class public final synthetic Lor/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/y3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/y3;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/y3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/y3;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->F(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
