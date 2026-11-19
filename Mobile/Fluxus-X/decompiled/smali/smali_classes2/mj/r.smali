.class public Lmj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmj/r$c;,
        Lmj/r$b;
    }
.end annotation


# instance fields
.field public a:Lmi/f;

.field public b:Ldj/g;


# direct methods
.method public constructor <init>(Lmi/f;)V
    .locals 0
    .param p1    # Lmi/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/r;->a:Lmi/f;

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p1

    iput-object p1, p0, Lmj/r;->b:Ldj/g;

    return-void
.end method

.method public static bridge synthetic a(Lmj/r;)Ldj/g;
    .locals 0

    iget-object p0, p0, Lmj/r;->b:Ldj/g;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Loi/a;Lmj/r$c;)V
    .locals 2

    new-instance v0, Lmj/r$a;

    invoke-direct {v0, p0, p3}, Lmj/r$a;-><init>(Lmj/r;Lmj/r$c;)V

    iget-object p3, p0, Lmj/r;->a:Lmi/f;

    const/4 v1, 0x0

    invoke-interface {p3, p1, p2, v1, v0}, Lmi/f;->a(Ljava/lang/String;Loi/a;[Lmi/c$a;Lmi/l;)Lmi/e;

    move-result-object p1

    invoke-virtual {p1}, Lmi/a;->b()V

    iget-object p1, p0, Lmj/r;->b:Ldj/g;

    invoke-virtual {p1}, Ldj/g;->K()V

    return-void
.end method
