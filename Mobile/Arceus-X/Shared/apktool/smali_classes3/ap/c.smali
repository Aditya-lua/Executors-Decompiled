.class public final synthetic Lap/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lap/e;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;

.field public final synthetic c:Lbp/a;


# direct methods
.method public synthetic constructor <init>(Lap/e;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;Lbp/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lap/c;->a:Lap/e;

    iput-object p2, p0, Lap/c;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;

    iput-object p3, p0, Lap/c;->c:Lbp/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lap/c;->a:Lap/e;

    iget-object v1, p0, Lap/c;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;

    iget-object v2, p0, Lap/c;->c:Lbp/a;

    invoke-static {v0, v1, v2}, Lap/e;->y2(Lap/e;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;Lbp/a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
