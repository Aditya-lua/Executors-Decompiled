.class public final synthetic Lno/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2;


# direct methods
.method public synthetic constructor <init>(Lno/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/k1;->a:Lno/u2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/k1;->a:Lno/u2;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b;

    invoke-static {v0, p1}, Lno/u2;->u0(Lno/u2;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
