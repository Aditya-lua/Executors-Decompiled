.class public final Ll9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/a$a;,
        Ll9/a$g;,
        Ll9/a$f;,
        Ll9/a$b;,
        Ll9/a$c;,
        Ll9/a$d;,
        Ll9/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Ll9/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ll9/a$a;

.field public final b:Ll9/a$g;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll9/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/a$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ll9/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Ll9/a$a<",
            "TC;TO;>;",
            "Ll9/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll9/a;->c:Ljava/lang/String;

    iput-object p2, p0, Ll9/a;->a:Ll9/a$a;

    iput-object p3, p0, Ll9/a;->b:Ll9/a$g;

    return-void
.end method


# virtual methods
.method public final a()Ll9/a$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/a;->a:Ll9/a$a;

    return-object v0
.end method

.method public final b()Ll9/a$c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/a;->b:Ll9/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/a;->c:Ljava/lang/String;

    return-object v0
.end method
