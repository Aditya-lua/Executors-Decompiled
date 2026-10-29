.class public final synthetic Lfl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfl/e;->a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfl/e;->a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    check-cast p1, Lpd/e;

    invoke-static {v0, p1}, Lfl/g;->b(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lpd/e;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
