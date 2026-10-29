.class public Ldk/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk/e$b;
    }
.end annotation


# instance fields
.field public a:Ldk/e$b;


# direct methods
.method public constructor <init>(Ldk/e$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk/e;->a:Ldk/e$b;

    return-void
.end method

.method public static bridge synthetic a(Ldk/e;)Ldk/e$b;
    .locals 0

    iget-object p0, p0, Ldk/e;->a:Ldk/e$b;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/s;)V
    .locals 2

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->h()Landroidx/lifecycle/a0;

    move-result-object v0

    new-instance v1, Ldk/e$a;

    invoke-direct {v1, p0}, Ldk/e$a;-><init>(Ldk/e;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    return-void
.end method
