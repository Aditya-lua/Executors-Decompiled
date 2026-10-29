.class public final synthetic Lvg/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvg/p;


# direct methods
.method public synthetic constructor <init>(Lvg/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg/n;->a:Lvg/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvg/n;->a:Lvg/p;

    check-cast p1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v0, p1}, Lvg/p;->a(Lvg/p;Lcom/roblox/client/datastructures/NameValuePair;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
