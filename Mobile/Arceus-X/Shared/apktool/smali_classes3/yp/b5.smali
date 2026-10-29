.class public final synthetic Lyp/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lyp/b5;->a:J

    iput-object p3, p0, Lyp/b5;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    iput-object p4, p0, Lyp/b5;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lyp/b5;->a:J

    iget-object v2, p0, Lyp/b5;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    iget-object v3, p0, Lyp/b5;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->q(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
