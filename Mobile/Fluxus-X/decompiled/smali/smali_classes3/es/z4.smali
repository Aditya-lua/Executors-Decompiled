.class public final synthetic Les/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/z4;->a:Les/s6;

    iput-object p2, p0, Les/z4;->b:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/z4;->a:Les/s6;

    iget-object v1, p0, Les/z4;->b:Les/i4$a;

    check-cast p1, Les/x6$b;

    invoke-static {v0, v1, p1}, Les/s6;->t(Les/s6;Les/i4$a;Les/x6$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
