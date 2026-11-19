.class public final synthetic Lul/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lul/x;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lul/x;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/protocols/calling/CallingHandler;->q(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
