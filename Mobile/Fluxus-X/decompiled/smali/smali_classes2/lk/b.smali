.class public Llk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llk/b$b;
    }
.end annotation


# instance fields
.field public a:Lmk/a;

.field public b:Llk/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmk/a;

    invoke-direct {v0}, Lmk/a;-><init>()V

    iput-object v0, p0, Llk/b;->a:Lmk/a;

    return-void
.end method

.method public static bridge synthetic a(Llk/b;Lcm/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Llk/b;->c(Lcm/a;)V

    return-void
.end method


# virtual methods
.method public b(Llk/b$b;)V
    .locals 3

    iput-object p1, p0, Llk/b;->b:Llk/b$b;

    iget-object p1, p0, Llk/b;->a:Lmk/a;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->j()J

    move-result-wide v0

    new-instance v2, Llk/b$a;

    invoke-direct {v2, p0}, Llk/b$a;-><init>(Llk/b;)V

    invoke-virtual {p1, v0, v1, v2}, Lmk/a;->d(JLlk/a;)V

    return-void
.end method

.method public final c(Lcm/a;)V
    .locals 1

    iget-object v0, p0, Llk/b;->b:Llk/b$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Llk/b$b;->a(Lcm/a;)V

    :cond_0
    return-void
.end method
