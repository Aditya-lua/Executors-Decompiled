.class public final synthetic Llo/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Llo/t0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/i;->a:Llo/t0;

    iput-object p2, p0, Llo/i;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Llo/i;->c:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Llo/i;->a:Llo/t0;

    iget-object v1, p0, Llo/i;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Llo/i;->c:Lym/k$a;

    invoke-static {v0, v1, v2}, Llo/t0;->P(Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
