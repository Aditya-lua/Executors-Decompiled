.class public final synthetic Lqr/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;

.field public final synthetic b:Lur/v;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lur/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/s1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;

    iput-object p2, p0, Lqr/s1;->b:Lur/v;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/s1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;

    iget-object v1, p0, Lqr/s1;->b:Lur/v;

    invoke-static {v0, v1}, Lqr/u1;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lur/v;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
