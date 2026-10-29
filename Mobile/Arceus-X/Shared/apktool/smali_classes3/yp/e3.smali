.class public final synthetic Lyp/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/e3;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lyp/e3;->b:Lym/k$a;

    iput-boolean p3, p0, Lyp/e3;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyp/e3;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lyp/e3;->b:Lym/k$a;

    iget-boolean v2, p0, Lyp/e3;->c:Z

    check-cast p1, Lcq/b$d;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;ZLcq/b$d;)Lym/r;

    move-result-object p1

    return-object p1
.end method
