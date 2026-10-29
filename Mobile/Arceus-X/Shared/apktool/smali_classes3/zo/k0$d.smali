.class public final Lzo/k0$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo/k0;->e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator"
    f = "SilentNetworkAuthenticationOrchestrator.kt"
    l = {
        0x46
    }
    m = "sendUpdate"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lzo/k0;

.field public x:I


# direct methods
.method public constructor <init>(Lzo/k0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/k0;",
            "Lnt/b<",
            "-",
            "Lzo/k0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo/k0$d;->w:Lzo/k0;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lzo/k0$d;->v:Ljava/lang/Object;

    iget p1, p0, Lzo/k0$d;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzo/k0$d;->x:I

    iget-object p1, p0, Lzo/k0$d;->w:Lzo/k0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lzo/k0;->b(Lzo/k0;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
