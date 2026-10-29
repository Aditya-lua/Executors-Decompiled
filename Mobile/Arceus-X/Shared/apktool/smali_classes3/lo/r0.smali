.class public final synthetic Llo/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llo/t0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;


# direct methods
.method public synthetic constructor <init>(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/r0;->a:Llo/t0;

    iput-object p2, p0, Llo/r0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Llo/r0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Llo/r0;->a:Llo/t0;

    iget-object v1, p0, Llo/r0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Llo/r0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    check-cast p1, Ljt/n;

    invoke-static {v0, v1, v2, p1}, Llo/t0;->p(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Ljt/n;)Lym/r;

    move-result-object p1

    return-object p1
.end method
