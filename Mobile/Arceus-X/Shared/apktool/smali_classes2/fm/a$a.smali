.class public final Lfm/a$a;
.super Lw/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "fm/a$a",
        "Lw/e;",
        "Landroid/content/ComponentName;",
        "componentName",
        "Lw/c;",
        "client",
        "",
        "onCustomTabsServiceConnected",
        "(Landroid/content/ComponentName;Lw/c;)V",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
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
.field public final synthetic g:Lfm/a;

.field public final synthetic h:Landroid/net/Uri;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic o:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfm/a;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm/a;",
            "Landroid/net/Uri;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfm/a$a;->g:Lfm/a;

    iput-object p2, p0, Lfm/a$a;->h:Landroid/net/Uri;

    iput-object p3, p0, Lfm/a$a;->i:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lfm/a$a;->o:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lfm/a$a;->p:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Lw/e;-><init>()V

    return-void
.end method


# virtual methods
.method public onCustomTabsServiceConnected(Landroid/content/ComponentName;Lw/c;)V
    .locals 7

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "client"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfm/a$a$a;

    iget-object v0, p0, Lfm/a$a;->p:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lfm/a$a;->g:Lfm/a;

    invoke-direct {p1, v0, v1}, Lfm/a$a$a;-><init>(Lkotlin/jvm/functions/Function0;Lfm/a;)V

    invoke-virtual {p2, p1}, Lw/c;->f(Lw/b;)Lw/f;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lfm/a$a;->g:Lfm/a;

    invoke-virtual {p1}, Lfm/a;->c()V

    iget-object v0, p0, Lfm/a$a;->g:Lfm/a;

    iget-object v1, p0, Lfm/a$a;->h:Landroid/net/Uri;

    iget-object v2, p0, Lfm/a$a;->i:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lfm/a$a;->o:Lkotlin/jvm/functions/Function0;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lfm/a;->e(Lfm/a;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lw/f;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object p2, p0, Lfm/a$a;->g:Lfm/a;

    iget-object v0, p0, Lfm/a$a;->h:Landroid/net/Uri;

    iget-object v1, p0, Lfm/a$a;->i:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lfm/a$a;->o:Lkotlin/jvm/functions/Function0;

    invoke-static {p2, v0, v1, v2, p1}, Lfm/a;->a(Lfm/a;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lw/f;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
