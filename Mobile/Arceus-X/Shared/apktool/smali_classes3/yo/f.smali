.class public final synthetic Lyo/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/fragment/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/f;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/f;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/b;->k(Lcom/withpersona/sdk2/inquiry/integration/fragment/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
