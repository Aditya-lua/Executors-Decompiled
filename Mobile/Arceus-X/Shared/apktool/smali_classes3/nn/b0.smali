.class public Lnn/b0;
.super Ltn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/b0$a;
    }
.end annotation


# instance fields
.field public final a:Lqn/c0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/c0;

    invoke-direct {v0}, Lqn/c0;-><init>()V

    iput-object v0, p0, Lnn/b0;->a:Lqn/c0;

    invoke-virtual {v0, p1}, Lqn/c0;->p(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic k(Ljava/lang/CharSequence;I)Z
    .locals 0

    invoke-static {p0, p1}, Lnn/b0;->l(Ljava/lang/CharSequence;I)Z

    move-result p0

    return p0
.end method

.method public static l(Ljava/lang/CharSequence;I)Z
    .locals 7

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    if-ge p1, v0, :cond_4

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x9

    if-eq v5, v6, :cond_3

    const/16 v6, 0x20

    if-eq v5, v6, :cond_3

    const/16 v6, 0x2a

    if-eq v5, v6, :cond_2

    const/16 v6, 0x2d

    if-eq v5, v6, :cond_1

    const/16 v6, 0x5f

    if-eq v5, v6, :cond_0

    return v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x3

    if-lt v2, p0, :cond_5

    if-nez v3, :cond_5

    if-eqz v4, :cond_7

    :cond_5
    if-lt v3, p0, :cond_6

    if-nez v2, :cond_6

    if-eqz v4, :cond_7

    :cond_6
    if-lt v4, p0, :cond_8

    if-nez v2, :cond_8

    if-nez v3, :cond_8

    :cond_7
    const/4 p0, 0x1

    return p0

    :cond_8
    return v1
.end method


# virtual methods
.method public b(Ltn/h;)Ltn/c;
    .locals 0

    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lqn/a;
    .locals 1

    iget-object v0, p0, Lnn/b0;->a:Lqn/c0;

    return-object v0
.end method
