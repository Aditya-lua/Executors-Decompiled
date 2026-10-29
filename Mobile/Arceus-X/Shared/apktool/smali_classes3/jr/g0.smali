.class public final synthetic Ljr/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/g0;->a:Landroid/widget/TextView;

    iput-object p2, p0, Ljr/g0;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    iput-object p3, p0, Ljr/g0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ljr/g0;->a:Landroid/widget/TextView;

    iget-object v1, p0, Ljr/g0;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    iget-object v2, p0, Ljr/g0;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/graphics/Typeface;

    invoke-static {v0, v1, v2, p1}, Ljr/h0;->a(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;Landroid/graphics/Typeface;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
