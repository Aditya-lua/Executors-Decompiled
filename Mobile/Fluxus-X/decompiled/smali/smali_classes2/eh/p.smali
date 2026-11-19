.class public final synthetic Leh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Leh/r;


# direct methods
.method public synthetic constructor <init>(Leh/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/p;->a:Leh/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leh/p;->a:Leh/r;

    check-cast p1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {v0, p1}, Leh/r;->c(Leh/r;Lcom/roblox/client/datastructures/NameValuePair;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
