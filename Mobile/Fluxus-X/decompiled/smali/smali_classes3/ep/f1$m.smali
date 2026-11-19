.class public final synthetic Lep/f1$m;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/f1;->g0(Lvo/d2$a;Lvo/j0;)Lvo/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lkotlin/jvm/functions/Function1<",
        "Lvo/d3;",
        "Lkotlin/Unit;",
        ">;"
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
.field public final synthetic h:Lvo/j0;

.field public final synthetic i:Lep/f1;

.field public final synthetic j:Lvo/d2$a;


# direct methods
.method public constructor <init>(Lvo/j0;Lep/f1;Lvo/d2$a;)V
    .locals 6

    iput-object p1, p0, Lep/f1$m;->h:Lvo/j0;

    iput-object p2, p0, Lep/f1$m;->i:Lep/f1;

    iput-object p3, p0, Lep/f1$m;->j:Lvo/d2$a;

    const-string v4, "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/Intrinsics$a;

    const-string v3, "selectIdClass"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lvo/d3;)V
    .locals 8

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lep/f1$m;->h:Lvo/j0;

    iget-object v2, p0, Lep/f1$m;->i:Lep/f1;

    iget-object v3, p0, Lep/f1$m;->j:Lvo/d2$a;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lep/f1;->U0(Lvo/j0;Lep/f1;Lvo/d2$a;Lvo/d3;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvo/d3;

    invoke-virtual {p0, p1}, Lep/f1$m;->a(Lvo/d3;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
