.class public final Ly6/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly6/k;->c(Ly6/k;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ly6/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Landroid/view/ViewTreeObserver;

.field public final synthetic c:Ly6/k$b;


# direct methods
.method public constructor <init>(Ly6/k;Landroid/view/ViewTreeObserver;Ly6/k$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/k<",
            "TT;>;",
            "Landroid/view/ViewTreeObserver;",
            "Ly6/k$b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ly6/k$a;->a:Ly6/k;

    iput-object p2, p0, Ly6/k$a;->b:Landroid/view/ViewTreeObserver;

    iput-object p3, p0, Ly6/k$a;->c:Ly6/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Ly6/k$a;->a:Ly6/k;

    iget-object v0, p0, Ly6/k$a;->b:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ly6/k$a;->c:Ly6/k$b;

    invoke-static {p1, v0, v1}, Ly6/k;->g(Ly6/k;Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly6/k$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
