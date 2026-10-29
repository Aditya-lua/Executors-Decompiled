.class public final synthetic Lcr/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/h;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lnq/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/l3;->a:Lnq/h;

    iput p2, p0, Lcr/l3;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/l3;->a:Lnq/h;

    iget v1, p0, Lcr/l3;->b:I

    invoke-static {v0, v1}, Lcr/p3;->u(Lnq/h;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
