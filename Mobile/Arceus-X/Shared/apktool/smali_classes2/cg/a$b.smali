.class public final Lcg/a$b;
.super Lcg/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcg/f;

.field public e:Lcg/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcg/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcg/d;
    .locals 7

    new-instance v0, Lcg/a;

    iget-object v1, p0, Lcg/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcg/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcg/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lcg/a$b;->d:Lcg/f;

    iget-object v5, p0, Lcg/a$b;->e:Lcg/d$b;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcg/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcg/f;Lcg/d$b;Lcg/a$a;)V

    return-object v0
.end method

.method public b(Lcg/f;)Lcg/d$a;
    .locals 0

    iput-object p1, p0, Lcg/a$b;->d:Lcg/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcg/d$a;
    .locals 0

    iput-object p1, p0, Lcg/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcg/d$a;
    .locals 0

    iput-object p1, p0, Lcg/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lcg/d$b;)Lcg/d$a;
    .locals 0

    iput-object p1, p0, Lcg/a$b;->e:Lcg/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcg/d$a;
    .locals 0

    iput-object p1, p0, Lcg/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
