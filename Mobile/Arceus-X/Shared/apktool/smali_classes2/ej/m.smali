.class public Lej/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej/m$c;,
        Lej/m$b;
    }
.end annotation


# instance fields
.field public a:Lei/f;

.field public b:Lvi/g;


# direct methods
.method public constructor <init>(Lei/f;)V
    .locals 0
    .param p1    # Lei/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej/m;->a:Lei/f;

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    iput-object p1, p0, Lej/m;->b:Lvi/g;

    return-void
.end method

.method public static bridge synthetic a(Lej/m;)Lvi/g;
    .locals 0

    iget-object p0, p0, Lej/m;->b:Lvi/g;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Lgi/a;Lej/m$c;)V
    .locals 2

    new-instance v0, Lej/m$a;

    invoke-direct {v0, p0, p3}, Lej/m$a;-><init>(Lej/m;Lej/m$c;)V

    iget-object p3, p0, Lej/m;->a:Lei/f;

    const/4 v1, 0x0

    invoke-interface {p3, p1, p2, v1, v0}, Lei/f;->b(Ljava/lang/String;Lgi/a;[Lei/c$a;Lei/l;)Lei/e;

    move-result-object p1

    invoke-virtual {p1}, Lei/a;->b()V

    iget-object p1, p0, Lej/m;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->K()V

    return-void
.end method
