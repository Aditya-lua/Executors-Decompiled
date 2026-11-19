.class public final synthetic Les/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Les/s6$d$a;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/l2;->a:Les/s6$d$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/l2;->a:Les/s6$d$a;

    invoke-static {v0}, Les/h4;->n(Les/s6$d$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
