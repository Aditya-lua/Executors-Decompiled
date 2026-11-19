.class public final Lob/d;
.super Lob/c;
.source "SourceFile"


# instance fields
.field public final g:Lcom/google/android/gms/internal/measurement/l4;

.field public final synthetic h:Lob/e;


# direct methods
.method public constructor <init>(Lob/e;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/l4;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/d;->h:Lob/e;

    invoke-direct {p0, p2, p3}, Lob/c;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lob/d;->g:Lcom/google/android/gms/internal/measurement/l4;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lob/d;->g:Lcom/google/android/gms/internal/measurement/l4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l4;->G()I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/v7;Z)Z
    .locals 12

    invoke-static {}, Lcom/google/android/gms/internal/measurement/cf;->a()Z

    iget-object v0, p0, Lob/d;->h:Lob/e;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v1

    iget-object v2, p0, Lob/c;->a:Ljava/lang/String;

    sget-object v3, Lob/e5;->E0:Lob/d5;

    invoke-virtual {v1, v2, v3}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v1

    iget-object v2, p0, Lob/d;->g:Lcom/google/android/gms/internal/measurement/l4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->J()Z

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->K()Z

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->M()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v3, :cond_0

    if-nez v4, :cond_0

    if-eqz v5, :cond_1

    :cond_0
    move v3, v7

    goto :goto_0

    :cond_1
    move v3, v6

    :goto_0
    const/4 v4, 0x0

    if-eqz p4, :cond_3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->w()Lob/z5;

    move-result-object p1

    iget p2, p0, Lob/c;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->F()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->G()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_2
    const-string p3, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, p3, p2, v4}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v7

    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->I()Lcom/google/android/gms/internal/measurement/f4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->K()Z

    move-result v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->K()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v10

    if-nez v10, :cond_4

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->r()Lob/z5;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->D()Lob/u5;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->H()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lob/u5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "No number filter for long property. property"

    invoke-virtual {v8, v10, v9}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->L()J

    move-result-wide v10

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v4

    invoke-static {v10, v11, v4}, Lob/c;->g(JLcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v9}, Lob/c;->e(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->O()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v10

    if-nez v10, :cond_6

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->r()Lob/z5;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->D()Lob/u5;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->H()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lob/u5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "No number filter for double property. property"

    invoke-virtual {v8, v10, v9}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_6
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->P()D

    move-result-wide v10

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v4

    invoke-static {v10, v11, v4}, Lob/c;->h(DLcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v9}, Lob/c;->e(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_1

    :cond_7
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->I()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->F()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v10

    if-nez v10, :cond_8

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->r()Lob/z5;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->D()Lob/u5;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->H()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lob/u5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "No string or number filter defined. property"

    invoke-virtual {v8, v10, v9}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->J()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lob/af;->O(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->J()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v8

    invoke-static {v4, v8}, Lob/c;->i(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v9}, Lob/c;->e(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->r()Lob/z5;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->D()Lob/u5;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->H()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lob/u5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->J()Ljava/lang/String;

    move-result-object v10

    const-string v11, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual {v8, v11, v9, v10}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_a
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->J()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f4;->G()Lcom/google/android/gms/internal/measurement/p4;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v10

    invoke-static {v4, v8, v10}, Lob/c;->f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/p4;Lob/b6;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v9}, Lob/c;->e(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1

    :cond_b
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->r()Lob/z5;

    move-result-object v8

    invoke-virtual {v0}, Lob/l7;->D()Lob/u5;

    move-result-object v9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->H()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lob/u5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "User property has no value, property"

    invoke-virtual {v8, v10, v9}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    if-nez v4, :cond_c

    const-string v8, "null"

    goto :goto_2

    :cond_c
    move-object v8, v4

    :goto_2
    const-string v9, "Property filter result"

    invoke-virtual {v0, v9, v8}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v4, :cond_d

    return v6

    :cond_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lob/c;->c:Ljava/lang/Boolean;

    if-eqz v5, :cond_f

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_3

    :cond_e
    return v7

    :cond_f
    :goto_3
    if-eqz p4, :cond_10

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->J()Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    iput-object v4, p0, Lob/c;->d:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz v3, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->F()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/v7;->G()J

    move-result-wide v3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :cond_12
    if-eqz v1, :cond_13

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->J()Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->K()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :cond_13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/l4;->K()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lob/c;->f:Ljava/lang/Long;

    goto :goto_4

    :cond_14
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lob/c;->e:Ljava/lang/Long;

    :cond_15
    :goto_4
    return v7
.end method
