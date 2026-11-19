.class public Lz/z2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/g1;

.field public final b:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Lg0/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/g1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/z2;->a:Ln0/g1;

    new-instance p1, Landroidx/lifecycle/d0;

    invoke-direct {p1}, Landroidx/lifecycle/d0;-><init>()V

    iput-object p1, p0, Lz/z2;->b:Landroidx/lifecycle/d0;

    sget-object v0, Lg0/w$b;->e:Lg0/w$b;

    invoke-static {v0}, Lg0/w;->a(Lg0/w$b;)Lg0/w;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z2;->b:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public final b()Lg0/w;
    .locals 1

    iget-object v0, p0, Lz/z2;->a:Ln0/g1;

    invoke-virtual {v0}, Ln0/g1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lg0/w$b;->b:Lg0/w$b;

    invoke-static {v0}, Lg0/w;->a(Lg0/w$b;)Lg0/w;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lg0/w$b;->a:Lg0/w$b;

    invoke-static {v0}, Lg0/w;->a(Lg0/w$b;)Lg0/w;

    move-result-object v0

    return-object v0
.end method

.method public c(Ln0/p0$a;Lg0/w$a;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lg0/w$a;->d()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    sget-object v0, Lg0/w$b;->e:Lg0/w$b;

    invoke-static {v0, p2}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lz/z2$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown internal camera state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object v0, Lg0/w$b;->e:Lg0/w$b;

    invoke-static {v0, p2}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    sget-object v0, Lg0/w$b;->d:Lg0/w$b;

    invoke-static {v0, p2}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    sget-object v0, Lg0/w$b;->c:Lg0/w$b;

    invoke-static {v0, p2}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lg0/w$b;->b:Lg0/w$b;

    invoke-static {v0, p2}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lz/z2;->b()Lg0/w;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "New public camera state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CameraStateMachine"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/z2;->b:Landroidx/lifecycle/d0;

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/w;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Publishing new public camera state "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/z2;->b:Landroidx/lifecycle/d0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
