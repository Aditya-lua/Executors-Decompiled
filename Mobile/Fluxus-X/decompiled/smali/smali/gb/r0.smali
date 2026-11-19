.class public Lgb/r0;
.super Ll9/a$a;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ll9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Lm9/e;Lm9/n;)Ll9/a$f;
    .locals 8

    check-cast p4, Lea/x;

    if-nez p4, :cond_0

    invoke-static {}, Lea/x;->a()Lea/w;

    move-result-object p4

    invoke-virtual {p4}, Lea/w;->d()Lea/x;

    move-result-object p4

    :cond_0
    move-object v4, p4

    new-instance v0, Lha/c;

    invoke-static {}, Lha/j;->a()Lha/j;

    move-result-object v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lha/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lea/x;Lm9/e;Lm9/n;Lha/j;)V

    iget-object p1, v4, Lea/x;->o:Lha/r;

    invoke-virtual {p1}, Lha/r;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lha/o;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lha/o;->a(Landroid/app/Application;)Lha/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lha/c;->l(Lha/o;)V

    :cond_1
    return-object v0
.end method
