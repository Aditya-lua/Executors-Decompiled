.class public final synthetic Lvp/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/j$h;


# direct methods
.method public synthetic constructor <init>(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/z;->a:Lvp/e0;

    iput-object p2, p0, Lvp/z;->b:Lcom/withpersona/sdk2/inquiry/internal/j$h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvp/z;->a:Lvp/e0;

    iget-object v1, p0, Lvp/z;->b:Lcom/withpersona/sdk2/inquiry/internal/j$h;

    check-cast p1, Luo/c$b;

    invoke-static {v0, v1, p1}, Lvp/e0;->g(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$h;Luo/c$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
