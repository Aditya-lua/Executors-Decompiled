.class public Lbo/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/i$a;
    }
.end annotation


# static fields
.field public static final a:Ljo/a;

.field public static final b:Ljo/a;

.field public static final c:Ljo/a;

.field public static final d:Ljo/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Ljo/a;->b()Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-virtual {v0, v1, v2}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    const/16 v3, 0x46

    const/16 v4, 0x41

    invoke-virtual {v0, v4, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    const/16 v3, 0x66

    const/16 v5, 0x61

    invoke-virtual {v0, v5, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/i;->a:Ljo/a;

    invoke-static {}, Ljo/a;->b()Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/i;->b:Ljo/a;

    invoke-static {}, Ljo/a;->b()Ljo/a$a;

    move-result-object v0

    const/16 v3, 0x5a

    invoke-virtual {v0, v4, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    const/16 v3, 0x7a

    invoke-virtual {v0, v5, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/i;->c:Ljo/a;

    invoke-virtual {v0}, Ljo/a;->c()Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/i;->d:Ljo/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgo/c;)Lgo/g;
    .locals 4

    invoke-interface {p1}, Lgo/c;->a()Lgo/i;

    move-result-object p1

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p1}, Lgo/i;->h()V

    invoke-virtual {p1}, Lgo/i;->l()C

    move-result v1

    const/16 v2, 0x23

    const/16 v3, 0x3b

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lgo/i;->h()V

    const/16 v1, 0x78

    invoke-virtual {p1, v1}, Lgo/i;->i(C)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/16 v1, 0x58

    invoke-virtual {p1, v1}, Lgo/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lbo/i;->b:Ljo/a;

    invoke-virtual {p1, v1}, Lgo/i;->f(Ljo/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x7

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lgo/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lbo/i;->b(Lgo/i;Lgo/h;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object v1, Lbo/i;->a:Ljo/a;

    invoke-virtual {p1, v1}, Lgo/i;->f(Ljo/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x6

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lgo/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lbo/i;->b(Lgo/i;Lgo/h;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v2, Lbo/i;->c:Ljo/a;

    invoke-virtual {v2, v1}, Ljo/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lbo/i;->d:Ljo/a;

    invoke-virtual {p1, v1}, Lgo/i;->f(Ljo/c;)I

    invoke-virtual {p1, v3}, Lgo/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lbo/i;->b(Lgo/i;Lgo/h;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lgo/g;->a()Lgo/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgo/i;Lgo/h;)Lgo/g;
    .locals 1

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p2

    invoke-virtual {p2}, Lfo/j;->c()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Leo/b0;

    invoke-static {p2}, Lco/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Leo/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object p1

    invoke-static {v0, p1}, Lgo/g;->b(Leo/s;Lgo/h;)Lgo/g;

    move-result-object p1

    return-object p1
.end method
