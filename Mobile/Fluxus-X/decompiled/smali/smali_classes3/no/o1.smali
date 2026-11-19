.class public final synthetic Lno/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/network/g$b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/o1;->a:Lcom/withpersona/sdk2/inquiry/document/network/g$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/o1;->a:Lcom/withpersona/sdk2/inquiry/document/network/g$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lno/u2;->t(Lcom/withpersona/sdk2/inquiry/document/network/g$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
