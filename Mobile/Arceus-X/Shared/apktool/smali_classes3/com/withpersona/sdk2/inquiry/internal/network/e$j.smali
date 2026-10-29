.class public final Lcom/withpersona/sdk2/inquiry/internal/network/e$j;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/e;->s(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper"
    f = "InquiryApiHelper.kt"
    l = {
        0x10d
    }
    m = "updateInquiryDeviceMetrics"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/internal/network/e;

.field public x:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->w:Lcom/withpersona/sdk2/inquiry/internal/network/e;

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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->v:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->w:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->s(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
