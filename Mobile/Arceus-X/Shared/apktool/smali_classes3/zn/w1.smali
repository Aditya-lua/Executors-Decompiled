.class public final synthetic Lzn/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/w1;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iput-object p2, p0, Lzn/w1;->b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzn/w1;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iget-object v1, p0, Lzn/w1;->b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->t0(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
