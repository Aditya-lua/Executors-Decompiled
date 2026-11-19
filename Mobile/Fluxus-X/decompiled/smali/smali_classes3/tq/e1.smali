.class public final synthetic Ltq/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lls/g;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/e1;->a:Ltq/k2;

    iput-object p2, p0, Ltq/e1;->b:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltq/e1;->a:Ltq/k2;

    iget-object v1, p0, Ltq/e1;->b:Lls/g;

    invoke-static {v0, v1}, Ltq/k2;->I0(Ltq/k2;Lls/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
