.class public final synthetic Ltg/a$b;
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
        "Ltg/g;",
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
.field public static final h:Ltg/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/a$b;

    invoke-direct {v0}, Ltg/a$b;-><init>()V

    sput-object v0, Ltg/a$b;->h:Ltg/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, Ltg/g;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ltl/i;Ltl/c;)Ltg/g;
    .locals 8

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltg/g;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Ltg/g;-><init>(Ltl/i;Ltl/c;Lku/p0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltl/i;

    check-cast p2, Ltl/c;

    invoke-virtual {p0, p1, p2}, Ltg/a$b;->a(Ltl/i;Ltl/c;)Ltg/g;

    move-result-object p1

    return-object p1
.end method
