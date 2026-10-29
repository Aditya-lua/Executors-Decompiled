.class public final synthetic Lzp/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/s;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lzp/s;->b:Landroid/view/View;

    iput-object p3, p0, Lzp/s;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lzp/s;->a:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lzp/s;->b:Landroid/view/View;

    iget-object v2, p0, Lzp/s;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lzp/v;->c(Lkotlin/jvm/functions/Function0;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
