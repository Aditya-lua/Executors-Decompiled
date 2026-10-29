.class public final synthetic Ljr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;

.field public final synthetic b:Landroid/widget/Button;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;Landroid/widget/Button;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/d;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;

    iput-object p2, p0, Ljr/d;->b:Landroid/widget/Button;

    iput-boolean p3, p0, Ljr/d;->c:Z

    iput-boolean p4, p0, Ljr/d;->d:Z

    iput-boolean p5, p0, Ljr/d;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ljr/d;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;

    iget-object v1, p0, Ljr/d;->b:Landroid/widget/Button;

    iget-boolean v2, p0, Ljr/d;->c:Z

    iget-boolean v3, p0, Ljr/d;->d:Z

    iget-boolean v4, p0, Ljr/d;->e:Z

    invoke-static {v0, v1, v2, v3, v4}, Ljr/e;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;Landroid/widget/Button;ZZZ)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
