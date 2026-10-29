.class public final synthetic Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/h;
.implements Lkotlin/jvm/internal/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
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
.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;->c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;->c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    return-void
.end method

.method public final b()Ljt/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljt/b<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/k;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;->c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    const-string v5, "setOutput(Ljava/lang/Object;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    const-string v4, "setOutput"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;->c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->Y(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lym/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/h;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljt/b;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/h;

    invoke-interface {p1}, Lkotlin/jvm/internal/h;->b()Ljt/b;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljt/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
