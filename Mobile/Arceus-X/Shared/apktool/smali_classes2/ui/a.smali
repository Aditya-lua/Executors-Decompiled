.class public Lui/a;
.super Leh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui/a$d;,
        Lui/a$c;,
        Lui/a$a;,
        Lui/a$b;
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Lui/a$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Leh/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lui/a;->d:Landroid/content/Context;

    iput-wide p3, p0, Lui/a;->e:J

    iput-object p5, p0, Lui/a;->f:Ljava/lang/String;

    new-instance p1, Lui/a$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lui/a$c;-><init>(Lui/a;Lui/b;)V

    invoke-virtual {p0, p1}, Leh/d;->a(Leh/d$a;)V

    new-instance p1, Lui/a$a;

    invoke-direct {p1, p0}, Lui/a$a;-><init>(Lui/a;)V

    invoke-virtual {p0, p1}, Leh/d;->a(Leh/d$a;)V

    new-instance p1, Lui/a$b;

    iget-object p2, p0, Lui/a;->f:Ljava/lang/String;

    iget-wide p3, p0, Lui/a;->e:J

    invoke-direct {p1, p0, p2, p3, p4}, Lui/a$b;-><init>(Lui/a;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Leh/d;->a(Leh/d$a;)V

    return-void
.end method

.method public static bridge synthetic f(Lui/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lui/a;->d:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lui/a;->g:Lui/a$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lui/a$d;->a()V

    :cond_0
    return-void
.end method

.method public g(Lui/a$d;)V
    .locals 0

    iput-object p1, p0, Lui/a;->g:Lui/a$d;

    return-void
.end method
