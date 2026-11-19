.class public final synthetic Lnq/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/k0;

.field public final synthetic b:Lsn/i;


# direct methods
.method public synthetic constructor <init>(Lnq/k0;Lsn/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/e0;->a:Lnq/k0;

    iput-object p2, p0, Lnq/e0;->b:Lsn/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnq/e0;->a:Lnq/k0;

    iget-object v1, p0, Lnq/e0;->b:Lsn/i;

    invoke-static {v0, v1}, Lnq/k0;->l(Lnq/k0;Lsn/i;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
