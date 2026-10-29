.class public final synthetic Lfq/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/j2;->a:Lfq/k2;

    iput-object p2, p0, Lfq/j2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/j2;->a:Lfq/k2;

    iget-object v1, p0, Lfq/j2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    invoke-static {v0, v1}, Lfq/k2;->G0(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
