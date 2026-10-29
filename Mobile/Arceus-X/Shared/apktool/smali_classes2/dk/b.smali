.class public Ldk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk/b$b;
    }
.end annotation


# instance fields
.field public a:Lek/a;

.field public b:Ldk/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lek/a;

    invoke-direct {v0}, Lek/a;-><init>()V

    iput-object v0, p0, Ldk/b;->a:Lek/a;

    return-void
.end method

.method public static bridge synthetic a(Ldk/b;Lol/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldk/b;->c(Lol/a;)V

    return-void
.end method


# virtual methods
.method public b(Ldk/b$b;)V
    .locals 3

    iput-object p1, p0, Ldk/b;->b:Ldk/b$b;

    iget-object p1, p0, Ldk/b;->a:Lek/a;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->j()J

    move-result-wide v0

    new-instance v2, Ldk/b$a;

    invoke-direct {v2, p0}, Ldk/b$a;-><init>(Ldk/b;)V

    invoke-virtual {p1, v0, v1, v2}, Lek/a;->d(JLdk/a;)V

    return-void
.end method

.method public final c(Lol/a;)V
    .locals 1

    iget-object v0, p0, Ldk/b;->b:Ldk/b$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ldk/b$b;->a(Lol/a;)V

    :cond_0
    return-void
.end method
