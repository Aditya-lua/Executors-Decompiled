.class public final Lob/w6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/kg;


# instance fields
.field public final synthetic a:Lob/c7;


# direct methods
.method public constructor <init>(Lob/c7;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/w6;->a:Lob/c7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/List;ZZ)V
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eqz p1, :cond_7

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->u()Lob/z5;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    if-eqz p4, :cond_1

    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->s()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-nez p5, :cond_2

    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->t()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->r()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->w()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_4
    if-eqz p4, :cond_5

    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->p()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_5
    if-nez p5, :cond_6

    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->q()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_6
    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->o()Lob/z5;

    move-result-object p1

    goto :goto_0

    :cond_7
    iget-object p1, p0, Lob/w6;->a:Lob/c7;

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->v()Lob/z5;

    move-result-object p1

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    const/4 p5, 0x0

    if-eq p4, v1, :cond_a

    const/4 v2, 0x2

    if-eq p4, v2, :cond_9

    if-eq p4, v0, :cond_8

    invoke-virtual {p1, p2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p5, p3}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
