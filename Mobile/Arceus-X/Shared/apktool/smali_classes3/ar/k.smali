.class public final synthetic Lar/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lar/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lar/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/k;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lar/k;->b:Lar/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lar/k;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lar/k;->b:Lar/a;

    invoke-static {v0, v1, p1}, Lar/p;->b(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V

    return-void
.end method
