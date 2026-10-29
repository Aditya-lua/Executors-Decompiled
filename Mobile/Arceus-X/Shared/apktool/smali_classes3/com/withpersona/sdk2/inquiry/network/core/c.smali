.class public final synthetic Lcom/withpersona/sdk2/inquiry/network/core/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/c;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/c;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->a(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
