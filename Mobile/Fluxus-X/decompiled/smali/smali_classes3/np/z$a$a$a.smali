.class public final Lnp/z$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnp/z$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ldv/i;"
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
.field public final synthetic a:Lnp/z;


# direct methods
.method public constructor <init>(Lnp/z;)V
    .locals 0

    iput-object p1, p0, Lnp/z$a$a$a;->a:Lnp/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lnp/z$a$a$a;->a:Lnp/z;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->getSkipBackendCall()Z

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p2, v0, p1}, Lnp/z;->e(ZZ)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;

    invoke-virtual {p0, p1, p2}, Lnp/z$a$a$a;->b(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
