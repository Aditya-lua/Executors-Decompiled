.class public final synthetic Les/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Les/s6;

.field public final synthetic c:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Les/s6;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/u5;->a:Lln/k$a;

    iput-object p2, p0, Les/u5;->b:Les/s6;

    iput-object p3, p0, Les/u5;->c:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/u5;->a:Lln/k$a;

    iget-object v1, p0, Les/u5;->b:Les/s6;

    iget-object v2, p0, Les/u5;->c:Les/i4;

    invoke-static {v0, v1, v2}, Les/s6;->S(Lln/k$a;Les/s6;Les/i4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
