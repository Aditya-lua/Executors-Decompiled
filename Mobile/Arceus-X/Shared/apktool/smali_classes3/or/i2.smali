.class public final synthetic Lor/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/i2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iput-object p2, p0, Lor/i2;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/i2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iget-object v1, p0, Lor/i2;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->B(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
