.class public final Lcom/withpersona/sdk2/inquiry/document/step/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/step/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/step/b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    invoke-virtual {p2}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-static {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->a0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b$b$a;->b(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
