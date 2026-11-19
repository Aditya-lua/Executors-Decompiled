.class public final synthetic Les/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Les/s6$d$a;

.field public final synthetic b:Les/h4;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;Les/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/m2;->a:Les/s6$d$a;

    iput-object p2, p0, Les/m2;->b:Les/h4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/m2;->a:Les/s6$d$a;

    iget-object v1, p0, Les/m2;->b:Les/h4;

    invoke-static {v0, v1}, Les/h4;->u(Les/s6$d$a;Les/h4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
