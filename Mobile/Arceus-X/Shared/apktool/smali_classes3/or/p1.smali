.class public final synthetic Lor/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

.field public final synthetic b:Lor/q1;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lor/q1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/p1;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    iput-object p2, p0, Lor/p1;->b:Lor/q1;

    iput-object p3, p0, Lor/p1;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/p1;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    iget-object v1, p0, Lor/p1;->b:Lor/q1;

    iget-object v2, p0, Lor/p1;->c:Landroid/view/View;

    invoke-static {v0, v1, v2}, Lor/q1;->c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lor/q1;Landroid/view/View;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
