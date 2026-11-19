.class public Lcj/a;
.super Lnh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcj/a$d;,
        Lcj/a$c;,
        Lcj/a$a;,
        Lcj/a$b;
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Lcj/a$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Lnh/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcj/a;->d:Landroid/content/Context;

    iput-wide p3, p0, Lcj/a;->e:J

    iput-object p5, p0, Lcj/a;->f:Ljava/lang/String;

    new-instance p1, Lcj/a$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcj/a$c;-><init>(Lcj/a;Lcj/b;)V

    invoke-virtual {p0, p1}, Lnh/d;->a(Lnh/d$a;)V

    new-instance p1, Lcj/a$a;

    invoke-direct {p1, p0}, Lcj/a$a;-><init>(Lcj/a;)V

    invoke-virtual {p0, p1}, Lnh/d;->a(Lnh/d$a;)V

    new-instance p1, Lcj/a$b;

    iget-object p2, p0, Lcj/a;->f:Ljava/lang/String;

    iget-wide p3, p0, Lcj/a;->e:J

    invoke-direct {p1, p0, p2, p3, p4}, Lcj/a$b;-><init>(Lcj/a;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Lnh/d;->a(Lnh/d$a;)V

    return-void
.end method

.method public static bridge synthetic f(Lcj/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcj/a;->d:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lcj/a;->g:Lcj/a$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcj/a$d;->a()V

    :cond_0
    return-void
.end method

.method public g(Lcj/a$d;)V
    .locals 0

    iput-object p1, p0, Lcj/a;->g:Lcj/a$d;

    return-void
.end method
