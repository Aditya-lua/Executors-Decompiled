.class public final Lzo/x$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo/x$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lzo/x;


# direct methods
.method public constructor <init>(Lzo/x;)V
    .locals 0

    iput-object p1, p0, Lzo/x$a$b$a;->a:Lzo/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->getOnEventListener()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;->onEvent(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V

    :cond_0
    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lzo/x$a$b$a;->a:Lzo/x;

    invoke-virtual {p2}, Lzo/x;->r()Landroidx/lifecycle/d0;

    move-result-object p2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    iget-object p2, p0, Lzo/x$a$b$a;->a:Lzo/x;

    invoke-virtual {p2}, Lzo/x;->q()Landroidx/lifecycle/d0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;

    invoke-virtual {p0, p1, p2}, Lzo/x$a$b$a;->b(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
