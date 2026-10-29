.class public final synthetic Lhr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcr/w1;

.field public final synthetic b:Lkotlin/jvm/internal/c0;

.field public final synthetic c:Lhr/j;


# direct methods
.method public synthetic constructor <init>(Lcr/w1;Lkotlin/jvm/internal/c0;Lhr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhr/c;->a:Lcr/w1;

    iput-object p2, p0, Lhr/c;->b:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lhr/c;->c:Lhr/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhr/c;->a:Lcr/w1;

    iget-object v1, p0, Lhr/c;->b:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lhr/c;->c:Lhr/j;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-static {v0, v1, v2, p1}, Lhr/j;->d(Lcr/w1;Lkotlin/jvm/internal/c0;Lhr/j;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
