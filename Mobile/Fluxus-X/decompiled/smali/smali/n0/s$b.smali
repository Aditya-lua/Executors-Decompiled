.class public final Ln0/s$b;
.super Ln0/t3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/util/Size;

.field public b:Landroid/util/Size;

.field public c:Lg0/k0;

.field public d:Ljava/lang/Integer;

.field public e:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ln0/n1;

.field public g:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ln0/t3$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln0/t3;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ln0/t3$a;-><init>()V

    .line 4
    invoke-virtual {p1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->a:Landroid/util/Size;

    .line 5
    invoke-virtual {p1}, Ln0/t3;->e()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->b:Landroid/util/Size;

    .line 6
    invoke-virtual {p1}, Ln0/t3;->b()Lg0/k0;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->c:Lg0/k0;

    .line 7
    invoke-virtual {p1}, Ln0/t3;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->d:Ljava/lang/Integer;

    .line 8
    invoke-virtual {p1}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->e:Landroid/util/Range;

    .line 9
    invoke-virtual {p1}, Ln0/t3;->d()Ln0/n1;

    move-result-object v0

    iput-object v0, p0, Ln0/s$b;->f:Ln0/n1;

    .line 10
    invoke-virtual {p1}, Ln0/t3;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ln0/s$b;->g:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ln0/t3;Ln0/s$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ln0/s$b;-><init>(Ln0/t3;)V

    return-void
.end method


# virtual methods
.method public a()Ln0/t3;
    .locals 11

    iget-object v0, p0, Ln0/s$b;->a:Landroid/util/Size;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " resolution"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Ln0/s$b;->b:Landroid/util/Size;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " originalConfiguredResolution"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Ln0/s$b;->c:Lg0/k0;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " dynamicRange"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    iget-object v0, p0, Ln0/s$b;->d:Ljava/lang/Integer;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sessionType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    iget-object v0, p0, Ln0/s$b;->e:Landroid/util/Range;

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " expectedFrameRateRange"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    iget-object v0, p0, Ln0/s$b;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " zslDisabled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v2, Ln0/s;

    iget-object v3, p0, Ln0/s$b;->a:Landroid/util/Size;

    iget-object v4, p0, Ln0/s$b;->b:Landroid/util/Size;

    iget-object v5, p0, Ln0/s$b;->c:Lg0/k0;

    iget-object v0, p0, Ln0/s$b;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v7, p0, Ln0/s$b;->e:Landroid/util/Range;

    iget-object v8, p0, Ln0/s$b;->f:Ln0/n1;

    iget-object v0, p0, Ln0/s$b;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Ln0/s;-><init>(Landroid/util/Size;Landroid/util/Size;Lg0/k0;ILandroid/util/Range;Ln0/n1;ZLn0/s$a;)V

    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lg0/k0;)Ln0/t3$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ln0/s$b;->c:Lg0/k0;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null dynamicRange"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Landroid/util/Range;)Ln0/t3$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ln0/t3$a;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Ln0/s$b;->e:Landroid/util/Range;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null expectedFrameRateRange"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ln0/n1;)Ln0/t3$a;
    .locals 0

    iput-object p1, p0, Ln0/s$b;->f:Ln0/n1;

    return-object p0
.end method

.method public e(Landroid/util/Size;)Ln0/t3$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ln0/s$b;->b:Landroid/util/Size;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null originalConfiguredResolution"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Landroid/util/Size;)Ln0/t3$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ln0/s$b;->a:Landroid/util/Size;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null resolution"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(I)Ln0/t3$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ln0/s$b;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public h(Z)Ln0/t3$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ln0/s$b;->g:Ljava/lang/Boolean;

    return-object p0
.end method
