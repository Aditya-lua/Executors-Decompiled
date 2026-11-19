.class public final synthetic Lvp/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/j$f;


# direct methods
.method public synthetic constructor <init>(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/y;->a:Lvp/e0;

    iput-object p2, p0, Lvp/y;->b:Lcom/withpersona/sdk2/inquiry/internal/j$f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvp/y;->a:Lvp/e0;

    iget-object v1, p0, Lvp/y;->b:Lcom/withpersona/sdk2/inquiry/internal/j$f;

    check-cast p1, Lvo/d2$b;

    invoke-static {v0, v1, p1}, Lvp/e0;->p(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$f;Lvo/d2$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
