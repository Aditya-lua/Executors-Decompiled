.class public final Lnp/f$b;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnp/f;->c(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator"
    f = "DeviceMetricsOrchestrator.kt"
    l = {
        0x34
    }
    m = "perform"
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lnp/f;

.field public x:I


# direct methods
.method public constructor <init>(Lnp/f;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/f;",
            "Leu/b<",
            "-",
            "Lnp/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnp/f$b;->w:Lnp/f;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Lnp/f$b;->v:Ljava/lang/Object;

    iget p1, p0, Lnp/f$b;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnp/f$b;->x:I

    iget-object p1, p0, Lnp/f$b;->w:Lnp/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnp/f;->c(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
