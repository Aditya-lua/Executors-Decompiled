.class public final synthetic Llo/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llo/t0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;


# direct methods
.method public synthetic constructor <init>(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/u;->a:Llo/t0;

    iput-object p2, p0, Llo/u;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Llo/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p4, p0, Llo/u;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Llo/u;->a:Llo/t0;

    iget-object v1, p0, Llo/u;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Llo/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v3, p0, Llo/u;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Llo/t0;->h(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
