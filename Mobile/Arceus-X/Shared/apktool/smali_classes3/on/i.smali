.class public Lon/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/i$a;
    }
.end annotation


# static fields
.field public static final a:Lvn/a;

.field public static final b:Lvn/a;

.field public static final c:Lvn/a;

.field public static final d:Lvn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lvn/a;->b()Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-virtual {v0, v1, v2}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    const/16 v3, 0x46

    const/16 v4, 0x41

    invoke-virtual {v0, v4, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    const/16 v3, 0x66

    const/16 v5, 0x61

    invoke-virtual {v0, v5, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/i;->a:Lvn/a;

    invoke-static {}, Lvn/a;->b()Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/i;->b:Lvn/a;

    invoke-static {}, Lvn/a;->b()Lvn/a$a;

    move-result-object v0

    const/16 v3, 0x5a

    invoke-virtual {v0, v4, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    const/16 v3, 0x7a

    invoke-virtual {v0, v5, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/i;->c:Lvn/a;

    invoke-virtual {v0}, Lvn/a;->c()Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/i;->d:Lvn/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsn/c;)Lsn/g;
    .locals 4

    invoke-interface {p1}, Lsn/c;->a()Lsn/i;

    move-result-object p1

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p1}, Lsn/i;->h()V

    invoke-virtual {p1}, Lsn/i;->l()C

    move-result v1

    const/16 v2, 0x23

    const/16 v3, 0x3b

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lsn/i;->h()V

    const/16 v1, 0x78

    invoke-virtual {p1, v1}, Lsn/i;->i(C)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/16 v1, 0x58

    invoke-virtual {p1, v1}, Lsn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lon/i;->b:Lvn/a;

    invoke-virtual {p1, v1}, Lsn/i;->f(Lvn/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x7

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lsn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lon/i;->b(Lsn/i;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object v1, Lon/i;->a:Lvn/a;

    invoke-virtual {p1, v1}, Lsn/i;->f(Lvn/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x6

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lsn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lon/i;->b(Lsn/i;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v2, Lon/i;->c:Lvn/a;

    invoke-virtual {v2, v1}, Lvn/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lon/i;->d:Lvn/a;

    invoke-virtual {p1, v1}, Lsn/i;->f(Lvn/c;)I

    invoke-virtual {p1, v3}, Lsn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lon/i;->b(Lsn/i;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lsn/g;->a()Lsn/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lsn/i;Lsn/h;)Lsn/g;
    .locals 1

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p2

    invoke-virtual {p2}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lqn/b0;

    invoke-static {p2}, Lpn/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1
.end method
