.class public Lv2/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v6, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lv2/g$b;-><init>(Landroid/net/Uri;IIZLjava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;IIZLjava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lv2/g$b;->a:Landroid/net/Uri;

    .line 4
    iput p2, p0, Lv2/g$b;->b:I

    .line 5
    iput p3, p0, Lv2/g$b;->c:I

    .line 6
    iput-boolean p4, p0, Lv2/g$b;->d:Z

    .line 7
    iput-object p5, p0, Lv2/g$b;->e:Ljava/lang/String;

    .line 8
    iput p6, p0, Lv2/g$b;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "systemfont"

    .line 11
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lv2/g$b;->a:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lv2/g$b;->b:I

    const/16 v0, 0x190

    .line 15
    iput v0, p0, Lv2/g$b;->c:I

    .line 16
    iput-boolean p1, p0, Lv2/g$b;->d:Z

    .line 17
    iput-object p2, p0, Lv2/g$b;->e:Ljava/lang/String;

    .line 18
    iput p1, p0, Lv2/g$b;->f:I

    return-void
.end method

.method public static a(Landroid/net/Uri;IIZI)Lv2/g$b;
    .locals 6

    new-instance v0, Lv2/g$b;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lv2/g$b;-><init>(Landroid/net/Uri;IIZI)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lv2/g$b;->f:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lv2/g$b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv2/g$b;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lv2/g$b;->b:I

    return v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lv2/g$b;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv2/g$b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lv2/g$b;->c:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lv2/g$b;->d:Z

    return v0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lv2/g$b;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "systemfont"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
