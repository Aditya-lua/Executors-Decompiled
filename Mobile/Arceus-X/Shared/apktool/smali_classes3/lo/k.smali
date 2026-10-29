.class public final synthetic Llo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llo/t0;

.field public final synthetic b:Lur/a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic e:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Llo/t0;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/k;->a:Llo/t0;

    iput-object p2, p0, Llo/k;->b:Lur/a;

    iput-object p3, p0, Llo/k;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p4, p0, Llo/k;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p5, p0, Llo/k;->e:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llo/k;->a:Llo/t0;

    iget-object v1, p0, Llo/k;->b:Lur/a;

    iget-object v2, p0, Llo/k;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v3, p0, Llo/k;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v4, p0, Llo/k;->e:Lym/k$a;

    move-object v5, p1

    check-cast v5, Ltr/b$b;

    invoke-static/range {v0 .. v5}, Llo/t0;->i(Llo/t0;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Ltr/b$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
