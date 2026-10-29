.class public final Lk9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/a$a;,
        Lk9/a$g;,
        Lk9/a$f;,
        Lk9/a$b;,
        Lk9/a$c;,
        Lk9/a$d;,
        Lk9/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lk9/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lk9/a$a;

.field public final b:Lk9/a$g;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lk9/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lk9/a$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lk9/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lk9/a$a<",
            "TC;TO;>;",
            "Lk9/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lk9/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lk9/a;->a:Lk9/a$a;

    iput-object p3, p0, Lk9/a;->b:Lk9/a$g;

    return-void
.end method


# virtual methods
.method public final a()Lk9/a$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/a;->a:Lk9/a$a;

    return-object v0
.end method

.method public final b()Lk9/a$c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/a;->b:Lk9/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/a;->c:Ljava/lang/String;

    return-object v0
.end method
