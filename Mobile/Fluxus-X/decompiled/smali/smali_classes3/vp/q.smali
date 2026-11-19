.class public final synthetic Lvp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/w;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/internal/j;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/w;Lcom/withpersona/sdk2/inquiry/internal/j;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/q;->a:Lvp/e0;

    iput-object p2, p0, Lvp/q;->b:Lcom/withpersona/sdk2/inquiry/internal/w;

    iput-object p3, p0, Lvp/q;->c:Lcom/withpersona/sdk2/inquiry/internal/j;

    iput-object p4, p0, Lvp/q;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvp/q;->a:Lvp/e0;

    iget-object v1, p0, Lvp/q;->b:Lcom/withpersona/sdk2/inquiry/internal/w;

    iget-object v2, p0, Lvp/q;->c:Lcom/withpersona/sdk2/inquiry/internal/j;

    iget-object v3, p0, Lvp/q;->d:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/n$c;

    invoke-static {v0, v1, v2, v3, p1}, Lvp/e0;->v(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/w;Lcom/withpersona/sdk2/inquiry/internal/j;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/n$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
