.class public final synthetic Lvo/d2$h;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo/d2;->j0(Lvo/d2$a;Lvo/j0;Lln/k$a;)Ljava/lang/Object;
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

.field public final synthetic i:Lvo/d2;

.field public final synthetic j:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "Lvo/d2$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic k:Lvo/d2$a;


# direct methods
.method public constructor <init>(Lvo/j0;Lvo/d2;Lln/k$a;Lvo/d2$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/j0;",
            "Lvo/d2;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lvo/d2$a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvo/d2$h;->h:Lvo/j0;

    iput-object p2, p0, Lvo/d2$h;->i:Lvo/d2;

    iput-object p3, p0, Lvo/d2$h;->j:Lln/k$a;

    iput-object p4, p0, Lvo/d2$h;->k:Lvo/d2$a;

    const-string v4, "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V"

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
    .locals 9

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lvo/d2$h;->h:Lvo/j0;

    iget-object v2, p0, Lvo/d2$h;->i:Lvo/d2;

    iget-object v3, p0, Lvo/d2$h;->j:Lln/k$a;

    iget-object v4, p0, Lvo/d2$h;->k:Lvo/d2$a;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v8}, Lvo/d2;->a1(Lvo/j0;Lvo/d2;Lln/k$a;Lvo/d2$a;Lvo/d3;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvo/d3;

    invoke-virtual {p0, p1}, Lvo/d2$h;->a(Lvo/d3;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
