.class public Lfk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk/a$b;
    }
.end annotation


# instance fields
.field public final a:Lei/m;

.field public b:Z


# direct methods
.method public constructor <init>(Lei/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfk/a;->b:Z

    iput-object p1, p0, Lfk/a;->a:Lei/m;

    return-void
.end method

.method public static bridge synthetic a(Lfk/a;)Lei/m;
    .locals 0

    iget-object p0, p0, Lfk/a;->a:Lei/m;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lfk/a;->b:Z

    return-void
.end method

.method public c()V
    .locals 4

    invoke-static {}, Lei/g;->a()Lei/f;

    move-result-object v0

    invoke-static {}, Lsg/a1;->a1()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lfk/a$a;

    invoke-direct {v2, p0}, Lfk/a$a;-><init>(Lfk/a;)V

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lei/f;->a(Ljava/lang/String;[Lei/c$a;Lei/l;)Lei/d;

    move-result-object v0

    iget-boolean v1, p0, Lfk/a;->b:Z

    if-eqz v1, :cond_0

    new-instance v1, Lfk/a$b;

    invoke-direct {v1, v3}, Lfk/a$b;-><init>(Lfk/b;)V

    invoke-virtual {v0, v1}, Lei/a;->g(Lhi/d;)V

    :cond_0
    invoke-virtual {v0}, Lei/a;->b()V

    return-void
.end method
