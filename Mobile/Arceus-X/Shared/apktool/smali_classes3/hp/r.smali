.class public final synthetic Lhp/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/r;->a:Lhp/e0;

    iput-object p2, p0, Lhp/r;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iput-object p3, p0, Lhp/r;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhp/r;->a:Lhp/e0;

    iget-object v1, p0, Lhp/r;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iget-object v2, p0, Lhp/r;->c:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/h;

    invoke-static {v0, v1, v2, p1}, Lhp/e0;->i(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/h;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
