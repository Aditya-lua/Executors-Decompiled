.class public final synthetic Llo/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic c:Ljava/lang/Throwable;

.field public final synthetic d:Lym/k$a;

.field public final synthetic e:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/Throwable;Lym/k$a;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/y;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iput-object p2, p0, Llo/y;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p3, p0, Llo/y;->c:Ljava/lang/Throwable;

    iput-object p4, p0, Llo/y;->d:Lym/k$a;

    iput-object p5, p0, Llo/y;->e:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llo/y;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iget-object v1, p0, Llo/y;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v2, p0, Llo/y;->c:Ljava/lang/Throwable;

    iget-object v3, p0, Llo/y;->d:Lym/k$a;

    iget-object v4, p0, Llo/y;->e:Luo/l;

    move-object v5, p1

    check-cast v5, Lym/r$c;

    invoke-static/range {v0 .. v5}, Llo/t0;->B(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/Throwable;Lym/k$a;Luo/l;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
