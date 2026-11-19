.class public final synthetic Lnq/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/k0;

.field public final synthetic b:Lmq/q5$d$a;

.field public final synthetic c:Lsn/i;

.field public final synthetic d:Lmq/q5$d$a$a;


# direct methods
.method public synthetic constructor <init>(Lnq/k0;Lmq/q5$d$a;Lsn/i;Lmq/q5$d$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/x;->a:Lnq/k0;

    iput-object p2, p0, Lnq/x;->b:Lmq/q5$d$a;

    iput-object p3, p0, Lnq/x;->c:Lsn/i;

    iput-object p4, p0, Lnq/x;->d:Lmq/q5$d$a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lnq/x;->a:Lnq/k0;

    iget-object v1, p0, Lnq/x;->b:Lmq/q5$d$a;

    iget-object v2, p0, Lnq/x;->c:Lsn/i;

    iget-object v3, p0, Lnq/x;->d:Lmq/q5$d$a$a;

    invoke-static {v0, v1, v2, v3}, Lnq/k0;->o(Lnq/k0;Lmq/q5$d$a;Lsn/i;Lmq/q5$d$a$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
