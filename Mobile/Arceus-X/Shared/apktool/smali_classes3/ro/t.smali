.class public final synthetic Lro/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lro/m0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/t;->a:Lro/m0;

    iput-object p2, p0, Lro/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Lro/t;->c:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lro/t;->a:Lro/m0;

    iget-object v1, p0, Lro/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Lro/t;->c:Lvr/f;

    invoke-static {v0, v1, v2}, Lro/m0;->j(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
