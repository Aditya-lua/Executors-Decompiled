.class public final synthetic Lb6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/y;

.field public final synthetic b:Landroid/net/ConnectivityManager;

.field public final synthetic c:Lb6/d;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/y;Landroid/net/ConnectivityManager;Lb6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/c;->a:Lkotlin/jvm/internal/y;

    iput-object p2, p0, Lb6/c;->b:Landroid/net/ConnectivityManager;

    iput-object p3, p0, Lb6/c;->c:Lb6/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lb6/c;->a:Lkotlin/jvm/internal/y;

    iget-object v1, p0, Lb6/c;->b:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Lb6/c;->c:Lb6/d;

    invoke-static {v0, v1, v2}, Lb6/d$a;->a(Lkotlin/jvm/internal/y;Landroid/net/ConnectivityManager;Lb6/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
