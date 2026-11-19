.class public final synthetic Lcv/f$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcv/f;->y()Lxu/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Long;",
        "Lcv/m<",
        "TE;>;",
        "Lcv/m<",
        "TE;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcv/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcv/f$a;

    invoke-direct {v0}, Lcv/f$a;-><init>()V

    sput-object v0, Lcv/f$a;->a:Lcv/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lcv/f;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(JLcv/m;)Lcv/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcv/m<",
            "TE;>;)",
            "Lcv/m<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcv/f;->c(JLcv/m;)Lcv/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lcv/m;

    invoke-virtual {p0, v0, v1, p2}, Lcv/f$a;->d(JLcv/m;)Lcv/m;

    move-result-object p1

    return-object p1
.end method
