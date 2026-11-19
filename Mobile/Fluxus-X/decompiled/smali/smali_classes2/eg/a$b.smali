.class public final Leg/a$b;
.super Leg/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Leg/f;

.field public e:Leg/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leg/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Leg/d;
    .locals 7

    new-instance v0, Leg/a;

    iget-object v1, p0, Leg/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Leg/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Leg/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Leg/a$b;->d:Leg/f;

    iget-object v5, p0, Leg/a$b;->e:Leg/d$b;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Leg/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leg/f;Leg/d$b;Leg/a$a;)V

    return-object v0
.end method

.method public b(Leg/f;)Leg/d$a;
    .locals 0

    iput-object p1, p0, Leg/a$b;->d:Leg/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Leg/d$a;
    .locals 0

    iput-object p1, p0, Leg/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Leg/d$a;
    .locals 0

    iput-object p1, p0, Leg/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Leg/d$b;)Leg/d$a;
    .locals 0

    iput-object p1, p0, Leg/a$b;->e:Leg/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Leg/d$a;
    .locals 0

    iput-object p1, p0, Leg/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
