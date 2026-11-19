.class public final synthetic Lrr/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lrr/n;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lrr/n;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/g;->a:Lrr/n;

    iput-object p2, p0, Lrr/g;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lrr/g;->a:Lrr/n;

    iget-object v1, p0, Lrr/g;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, p1}, Lrr/n;->a(Lrr/n;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method
