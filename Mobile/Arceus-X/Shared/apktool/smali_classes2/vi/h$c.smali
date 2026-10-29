.class public Lvi/h$c;
.super Lei/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/h;->a(Lxi/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxi/c$b;

.field public final synthetic b:Lvi/h;


# direct methods
.method public constructor <init>(Lvi/h;Lxi/c$b;)V
    .locals 0

    iput-object p1, p0, Lvi/h$c;->b:Lvi/h;

    iput-object p2, p0, Lvi/h$c;->a:Lxi/c$b;

    invoke-direct {p0}, Lei/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Logout: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.login"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lei/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lei/j;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lei/j;->b()I

    move-result p1

    const/4 v1, -0x1

    const-string v2, "logout"

    invoke-static {v2, v0, p1, v1}, Lsg/t0;->g(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p1

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lwk/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lvi/h$c;->a:Lxi/c$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lxi/c$b;->a()V

    :cond_1
    return-void
.end method
