.class public final synthetic Lqo/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/e1;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/r0;->a:Lqo/e1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/r0;->a:Lqo/e1;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b;

    invoke-static {v0, p1}, Lqo/e1;->x(Lqo/e1;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
