.class public final synthetic Lyp/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcq/b$d;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lyp/s4;->a:Z

    iput-object p2, p0, Lyp/s4;->b:Lcq/b$d;

    iput-object p3, p0, Lyp/s4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p4, p0, Lyp/s4;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lyp/s4;->a:Z

    iget-object v1, p0, Lyp/s4;->b:Lcq/b$d;

    iget-object v2, p0, Lyp/s4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v3, p0, Lyp/s4;->d:Lym/k$a;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g1(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
