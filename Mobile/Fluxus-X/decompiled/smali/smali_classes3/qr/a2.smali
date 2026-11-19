.class public final synthetic Lqr/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

.field public final synthetic b:Lur/m;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;Lur/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/a2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

    iput-object p2, p0, Lqr/a2;->b:Lur/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/a2;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

    iget-object v1, p0, Lqr/a2;->b:Lur/m;

    invoke-static {v0, v1}, Lqr/b2;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;Lur/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
