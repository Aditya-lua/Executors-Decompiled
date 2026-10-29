.class public final synthetic Lyp/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/x0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyp/x0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->J(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
