.class public final synthetic Lb6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroid/net/ConnectivityManager;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/net/ConnectivityManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/j;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb6/j;->b:Landroid/net/ConnectivityManager;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb6/j;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb6/j;->b:Landroid/net/ConnectivityManager;

    invoke-static {v0, v1}, Lb6/k;->a(Lkotlin/jvm/functions/Function1;Landroid/net/ConnectivityManager;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
