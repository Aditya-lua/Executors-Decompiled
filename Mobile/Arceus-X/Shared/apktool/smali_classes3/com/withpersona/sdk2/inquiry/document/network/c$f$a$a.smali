.class public final Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;->b(Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1"
    f = "DocumentFileUploadWorker.kt"
    l = {
        0xb2
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f$a<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;->v:Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;->u:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;->w:I

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a$a;->v:Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;->b(Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
