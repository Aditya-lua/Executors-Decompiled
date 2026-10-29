.class public final synthetic Lor/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/l3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/l3;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/l3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/l3;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->R(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLandroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
