.class public final synthetic Ltg/a$a;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/a;-><init>(Lku/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lkotlin/jvm/functions/Function2<",
        "Ltl/i;",
        "Ltl/c;",
        "Ltl/d0;",
        ">;"
    }
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


# static fields
.field public static final h:Ltg/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/a$a;

    invoke-direct {v0}, Ltg/a$a;-><init>()V

    sput-object v0, Ltg/a$a;->h:Ltg/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, Ltl/d0;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ltl/i;Ltl/c;)Ltl/d0;
    .locals 9

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltl/d0;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Ltl/d0;-><init>(Ltl/i;Ltl/c;Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltl/i;

    check-cast p2, Ltl/c;

    invoke-virtual {p0, p1, p2}, Ltg/a$a;->a(Ltl/i;Ltl/c;)Ltl/d0;

    move-result-object p1

    return-object p1
.end method
