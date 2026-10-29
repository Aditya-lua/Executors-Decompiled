.class public final synthetic Lfl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfl/c;->a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lfl/c;->a:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    invoke-static {v0, p1}, Lfl/d;->a(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Ljava/lang/Exception;)V

    return-void
.end method
