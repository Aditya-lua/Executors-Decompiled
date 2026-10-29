.class public final synthetic Lcr/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lgr/c;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;


# direct methods
.method public synthetic constructor <init>(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/o0;->a:Lgr/c;

    iput-object p2, p0, Lcr/o0;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/o0;->a:Lgr/c;

    iget-object v1, p0, Lcr/o0;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;

    invoke-static {v0, v1}, Lcr/r0;->c(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
