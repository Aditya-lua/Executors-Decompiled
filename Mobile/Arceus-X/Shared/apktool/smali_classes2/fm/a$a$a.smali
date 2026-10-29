.class public final Lfm/a$a$a;
.super Lw/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/a$a;->onCustomTabsServiceConnected(Landroid/content/ComponentName;Lw/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "fm/a$a$a",
        "Lw/b;",
        "",
        "navigationEvent",
        "Landroid/os/Bundle;",
        "extras",
        "",
        "onNavigationEvent",
        "(ILandroid/os/Bundle;)V",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic o:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:Lfm/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lfm/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lfm/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfm/a$a$a;->o:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lfm/a$a$a;->p:Lfm/a;

    invoke-direct {p0}, Lw/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onNavigationEvent(ILandroid/os/Bundle;)V
    .locals 0

    const/4 p2, 0x6

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lfm/a$a$a;->o:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lfm/a$a$a;->p:Lfm/a;

    invoke-virtual {p1}, Lfm/a;->c()V

    :cond_0
    return-void
.end method
