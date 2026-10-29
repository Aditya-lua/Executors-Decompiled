.class public final synthetic Lor/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/g;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/q2;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p2, p0, Lor/q2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/q2;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v1, p0, Lor/q2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->y(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
