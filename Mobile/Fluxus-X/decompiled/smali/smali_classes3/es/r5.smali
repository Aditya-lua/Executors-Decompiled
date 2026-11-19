.class public final synthetic Les/r5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;


# direct methods
.method public synthetic constructor <init>(Les/s6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/r5;->a:Les/s6;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/r5;->a:Les/s6;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Les/s6;->c0(Les/s6;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
