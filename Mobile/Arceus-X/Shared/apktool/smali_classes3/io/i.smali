.class public final synthetic Lio/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/i;

.field public final synthetic b:D


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/i;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/i;->a:Lcom/withpersona/sdk2/inquiry/governmentid/i;

    iput-wide p2, p0, Lio/i;->b:D

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/i;->a:Lcom/withpersona/sdk2/inquiry/governmentid/i;

    iget-wide v1, p0, Lio/i;->b:D

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/i;->c(Lcom/withpersona/sdk2/inquiry/governmentid/i;D)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
