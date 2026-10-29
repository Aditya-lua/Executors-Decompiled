.class public final synthetic Lhp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/q;->a:Lhp/e0;

    iput-object p2, p0, Lhp/q;->b:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    iput-object p3, p0, Lhp/q;->c:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iput-object p4, p0, Lhp/q;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhp/q;->a:Lhp/e0;

    iget-object v1, p0, Lhp/q;->b:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    iget-object v2, p0, Lhp/q;->c:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iget-object v3, p0, Lhp/q;->d:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/k$c;

    invoke-static {v0, v1, v2, v3, p1}, Lhp/e0;->v(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/k$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
