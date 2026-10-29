.class public final synthetic Lfq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lku/p0;

.field public final synthetic b:Lfq/k2;


# direct methods
.method public synthetic constructor <init>(Lku/p0;Lfq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/a;->a:Lku/p0;

    iput-object p2, p0, Lfq/a;->b:Lfq/k2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/a;->a:Lku/p0;

    iget-object v1, p0, Lfq/a;->b:Lfq/k2;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-static {v0, v1, p1}, Lfq/k2;->N(Lku/p0;Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
