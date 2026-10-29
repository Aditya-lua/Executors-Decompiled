.class public Lfb/q0;
.super Lk9/a$a;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lk9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Ll9/e;Ll9/n;)Lk9/a$f;
    .locals 8

    check-cast p4, Lda/o;

    if-nez p4, :cond_0

    invoke-static {}, Lda/o;->a()Lda/n;

    move-result-object p4

    invoke-virtual {p4}, Lda/n;->d()Lda/o;

    move-result-object p4

    :cond_0
    move-object v4, p4

    new-instance v0, Lga/c;

    invoke-static {}, Lga/j;->a()Lga/j;

    move-result-object v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lga/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lda/o;Ll9/e;Ll9/n;Lga/j;)V

    iget-object p1, v4, Lda/o;->o:Lga/q;

    invoke-virtual {p1}, Lga/q;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lga/o;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lga/o;->a(Landroid/app/Application;)Lga/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lga/c;->l(Lga/o;)V

    :cond_1
    return-object v0
.end method
