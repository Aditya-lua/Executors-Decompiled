.class public final synthetic Lyp/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/y4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyp/y4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    check-cast p1, Lym/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
