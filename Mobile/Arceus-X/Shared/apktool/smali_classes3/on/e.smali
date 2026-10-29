.class public Lon/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/e$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lon/e;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsn/c;)Lsn/g;
    .locals 3

    invoke-interface {p1}, Lsn/c;->a()Lsn/i;

    move-result-object p1

    invoke-virtual {p1}, Lsn/i;->h()V

    invoke-virtual {p1}, Lsn/i;->l()C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lsn/i;->h()V

    new-instance v0, Lqn/i;

    invoke-direct {v0}, Lqn/i;-><init>()V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v1, Lon/e;->a:Ljava/util/regex/Pattern;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lsn/i;->h()V

    new-instance v1, Lqn/b0;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {v1, p1}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lqn/b0;

    const-string v1, "\\"

    invoke-direct {v0, v1}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1
.end method
