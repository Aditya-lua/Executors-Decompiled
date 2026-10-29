.class public final synthetic Lrr/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/w;->a:Lvr/f;

    iput-object p2, p0, Lrr/w;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p3, p0, Lrr/w;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/w;->a:Lvr/f;

    iget-object v1, p0, Lrr/w;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v2, p0, Lrr/w;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lqr/a$b;

    invoke-static {v0, v1, v2, p1}, Lrr/e0;->v(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lkotlin/jvm/functions/Function1;Lqr/a$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
