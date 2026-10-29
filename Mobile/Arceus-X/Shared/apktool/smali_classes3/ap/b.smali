.class public final synthetic Lap/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lap/e;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;


# direct methods
.method public synthetic constructor <init>(Lap/e;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lap/b;->a:Lap/e;

    iput-object p2, p0, Lap/b;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lap/b;->a:Lap/e;

    iget-object v1, p0, Lap/b;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;

    invoke-static {v0, v1, p1}, Lap/e;->z2(Lap/e;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;Landroid/view/View;)V

    return-void
.end method
