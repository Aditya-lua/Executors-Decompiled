.class public final synthetic Les/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Les/s6;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Les/s6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/y4;->a:Lln/k$a;

    iput-object p2, p0, Les/y4;->b:Les/s6;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/y4;->a:Lln/k$a;

    iget-object v1, p0, Les/y4;->b:Les/s6;

    invoke-static {v0, v1}, Les/s6;->H(Lln/k$a;Les/s6;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
