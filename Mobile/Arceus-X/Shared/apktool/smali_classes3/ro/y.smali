.class public final synthetic Lro/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lro/m0;

.field public final synthetic b:Lvr/f;

.field public final synthetic c:Lur/a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lro/m0;Lvr/f;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/y;->a:Lro/m0;

    iput-object p2, p0, Lro/y;->b:Lvr/f;

    iput-object p3, p0, Lro/y;->c:Lur/a;

    iput-object p4, p0, Lro/y;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p5, p0, Lro/y;->e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lro/y;->a:Lro/m0;

    iget-object v1, p0, Lro/y;->b:Lvr/f;

    iget-object v2, p0, Lro/y;->c:Lur/a;

    iget-object v3, p0, Lro/y;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v4, p0, Lro/y;->e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    move-object v5, p1

    check-cast v5, Ltr/b$b;

    invoke-static/range {v0 .. v5}, Lro/m0;->h(Lro/m0;Lvr/f;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ltr/b$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
