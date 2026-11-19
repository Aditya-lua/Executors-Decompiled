.class public Lnk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnk/a$b;
    }
.end annotation


# instance fields
.field public final a:Lmi/m;

.field public b:Z


# direct methods
.method public constructor <init>(Lmi/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnk/a;->b:Z

    iput-object p1, p0, Lnk/a;->a:Lmi/m;

    return-void
.end method

.method public static bridge synthetic a(Lnk/a;)Lmi/m;
    .locals 0

    iget-object p0, p0, Lnk/a;->a:Lmi/m;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnk/a;->b:Z

    return-void
.end method

.method public c()V
    .locals 4

    invoke-static {}, Lmi/g;->a()Lmi/f;

    move-result-object v0

    invoke-static {}, Lbh/a1;->b1()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lnk/a$a;

    invoke-direct {v2, p0}, Lnk/a$a;-><init>(Lnk/a;)V

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lmi/f;->b(Ljava/lang/String;[Lmi/c$a;Lmi/l;)Lmi/d;

    move-result-object v0

    iget-boolean v1, p0, Lnk/a;->b:Z

    if-eqz v1, :cond_0

    new-instance v1, Lnk/a$b;

    invoke-direct {v1, v3}, Lnk/a$b;-><init>(Lnk/b;)V

    invoke-virtual {v0, v1}, Lmi/a;->g(Lpi/d;)V

    :cond_0
    invoke-virtual {v0}, Lmi/a;->b()V

    return-void
.end method
