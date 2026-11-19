.class public final synthetic Les/r6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/r6;->a:Les/s6;

    iput-object p2, p0, Les/r6;->b:Les/i4;

    iput-object p3, p0, Les/r6;->c:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/r6;->a:Les/s6;

    iget-object v1, p0, Les/r6;->b:Les/i4;

    iget-object v2, p0, Les/r6;->c:Lln/k$a;

    invoke-static {v0, v1, v2}, Les/s6;->V(Les/s6;Les/i4;Lln/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
