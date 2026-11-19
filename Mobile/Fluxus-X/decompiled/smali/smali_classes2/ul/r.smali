.class public final synthetic Lul/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    check-cast p3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1, p3}, Lcom/roblox/protocols/calling/CallingHandler;->e(Landroid/content/Context;JLkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
