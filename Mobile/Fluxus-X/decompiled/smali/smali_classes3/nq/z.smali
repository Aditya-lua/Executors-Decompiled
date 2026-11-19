.class public final synthetic Lnq/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/k0;

.field public final synthetic b:Lmq/q5$d$a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lnq/k0;Lmq/q5$d$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/z;->a:Lnq/k0;

    iput-object p2, p0, Lnq/z;->b:Lmq/q5$d$a;

    iput p3, p0, Lnq/z;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lnq/z;->a:Lnq/k0;

    iget-object v1, p0, Lnq/z;->b:Lmq/q5$d$a;

    iget v2, p0, Lnq/z;->c:I

    invoke-static {v0, v1, v2}, Lnq/k0;->f(Lnq/k0;Lmq/q5$d$a;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
