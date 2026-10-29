.class public final synthetic Lio/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/u1;->a:Z

    iput-object p2, p0, Lio/u1;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lio/u1;->a:Z

    iget-object v1, p0, Lio/u1;->b:Ljava/lang/Throwable;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->k(ZLjava/lang/Throwable;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
