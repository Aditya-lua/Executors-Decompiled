.class public Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Ljava/lang/StackTraceElement;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;->read(Ltg/a;)Ljava/lang/StackTraceElement;

    move-result-object p1

    return-object p1
.end method

.method public read(Ltg/a;)Ljava/lang/StackTraceElement;
    .locals 8

    .line 2
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Ltg/a;->K()V

    return-object v2

    .line 4
    :cond_0
    invoke-virtual {p1}, Ltg/a;->c()V

    const/4 v0, -0x1

    move v5, v0

    move-object v1, v2

    move-object v3, v1

    move-object v4, v3

    .line 5
    :goto_0
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 6
    invoke-virtual {p1}, Ltg/a;->E()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_1
    move v6, v0

    goto :goto_2

    :sswitch_0
    const-string v7, "declaring-class"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x3

    goto :goto_2

    :sswitch_1
    const-string v7, "method-name"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_2
    const-string v7, "line-number"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x1

    goto :goto_2

    :sswitch_3
    const-string v7, "file-name"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 8
    invoke-virtual {p1}, Ltg/a;->n0()V

    goto :goto_0

    .line 9
    :pswitch_0
    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 11
    :pswitch_2
    invoke-virtual {p1}, Ltg/a;->z()I

    move-result v5

    goto :goto_0

    .line 12
    :pswitch_3
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v4

    sget-object v6, Ltg/b;->i:Ltg/b;

    if-ne v4, v6, :cond_5

    .line 13
    invoke-virtual {p1}, Ltg/a;->K()V

    move-object v4, v2

    goto :goto_0

    .line 14
    :cond_5
    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 15
    :cond_6
    invoke-virtual {p1}, Ltg/a;->h()V

    .line 16
    new-instance p1, Ljava/lang/StackTraceElement;

    invoke-direct {p1, v1, v3, v4, v5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51384bc4 -> :sswitch_3
        -0x3d5584be -> :sswitch_2
        -0x3a03d009 -> :sswitch_1
        -0xcec2c2e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/StackTraceElement;

    invoke-virtual {p0, p1, p2}, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;->write(Ltg/c;Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public write(Ltg/c;Ljava/lang/StackTraceElement;)V
    .locals 3

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    .line 4
    const-string v0, "declaring-class"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    .line 5
    const-string v0, "method-name"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    .line 6
    const-string v0, "file-name"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    .line 7
    const-string v0, "line-number"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Ltg/c;->O(J)Ltg/c;

    .line 8
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void
.end method
