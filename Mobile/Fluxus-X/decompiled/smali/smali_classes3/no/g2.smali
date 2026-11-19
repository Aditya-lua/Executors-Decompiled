.class public final synthetic Lno/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2$f$f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;


# direct methods
.method public synthetic constructor <init>(Lno/u2$f$f;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/g2;->a:Lno/u2$f$f;

    iput-object p2, p0, Lno/g2;->b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/g2;->a:Lno/u2$f$f;

    iget-object v1, p0, Lno/g2;->b:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lno/u2;->v(Lno/u2$f$f;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
