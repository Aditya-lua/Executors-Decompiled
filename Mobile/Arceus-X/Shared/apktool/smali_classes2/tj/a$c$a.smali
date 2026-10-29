.class public Ltj/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltj/a$c;->k(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ltj/a$c;


# direct methods
.method public constructor <init>(Ltj/a$c;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltj/a$c$a;->b:Ltj/a$c;

    iput-object p2, p0, Ltj/a$c$a;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Ltj/a$c$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltj/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to post event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v3

    invoke-virtual {v3}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AppRouter"

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v2

    invoke-virtual {v2}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object v2

    sget-object v3, Ltj/a$a;->a:[I

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const/4 v1, 0x0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v3

    invoke-virtual {v3}, Ltj/c;->d()[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v5

    invoke-virtual {v1}, Ltj/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v0, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v0}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v0

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v1

    invoke-virtual {v1}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v2}, Ltj/a$c;->c(Ltj/a$c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ltj/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ltj/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :catch_0
    iget-object v0, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v0}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v0

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v1

    invoke-virtual {v1}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v2}, Ltj/a$c;->c(Ltj/a$c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ltj/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v3

    invoke-virtual {v3}, Ltj/c;->d()[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v5

    invoke-virtual {v1}, Ltj/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v0, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v0}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v0

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v1

    invoke-virtual {v1}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v2}, Ltj/a$c;->c(Ltj/a$c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ltj/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :try_start_1
    invoke-virtual {v1}, Ltj/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {v3, v4}, Lph/g;->c(J)Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v2, v1}, Lph/g;->i(Ljava/lang/String;)V

    iget-object v1, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v1}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v1

    invoke-virtual {v1}, Ltj/b;->i()V

    goto :goto_2

    :cond_4
    iget-object v1, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v1}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v1

    invoke-virtual {v1}, Ltj/b;->j()V

    :goto_2
    iget-object v1, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v1}, Ltj/a$c;->a(Ltj/a$c;)Lfv/c;

    move-result-object v1

    invoke-virtual {v1, v2}, Lfv/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_0

    :catch_1
    iget-object v0, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v0}, Ltj/a$c;->b(Ltj/a$c;)Ltj/b;

    move-result-object v0

    invoke-virtual {v1}, Ltj/d;->a()Ltj/c;

    move-result-object v1

    invoke-virtual {v1}, Ltj/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ltj/a$c$a;->b:Ltj/a$c;

    invoke-static {v2}, Ltj/a$c;->c(Ltj/a$c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ltj/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method
