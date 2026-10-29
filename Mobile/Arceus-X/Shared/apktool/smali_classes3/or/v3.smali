.class public final synthetic Lor/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lar/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/g;


# direct methods
.method public synthetic constructor <init>(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/v3;->a:Lar/g;

    iput-object p2, p0, Lor/v3;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/v3;->a:Lar/g;

    iget-object v1, p0, Lor/v3;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->M(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
