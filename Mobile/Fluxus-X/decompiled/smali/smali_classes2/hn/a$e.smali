.class public Lhn/a$e;
.super Lhn/a$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/a;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lhn/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public h:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:[Ljava/lang/reflect/Type;

.field public final synthetic j:Ljava/lang/reflect/Type;

.field public final synthetic k:Ljava/util/Set;

.field public final synthetic l:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    iput-object p8, p0, Lhn/a$e;->i:[Ljava/lang/reflect/Type;

    iput-object p9, p0, Lhn/a$e;->j:Ljava/lang/reflect/Type;

    iput-object p10, p0, Lhn/a$e;->k:Ljava/util/Set;

    iput-object p11, p0, Lhn/a$e;->l:Ljava/util/Set;

    invoke-direct/range {p0 .. p7}, Lhn/a$f;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-void
.end method


# virtual methods
.method public a(Lhn/w;Lhn/h$e;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lhn/a$f;->a(Lhn/w;Lhn/h$e;)V

    iget-object v0, p0, Lhn/a$e;->i:[Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v2, p0, Lhn/a$e;->j:Ljava/lang/reflect/Type;

    invoke-static {v0, v2}, Lhn/a0;->d(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhn/a$e;->k:Ljava/util/Set;

    iget-object v2, p0, Lhn/a$e;->l:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhn/a$e;->i:[Ljava/lang/reflect/Type;

    aget-object v0, v0, v1

    iget-object v1, p0, Lhn/a$e;->k:Ljava/util/Set;

    invoke-virtual {p1, p2, v0, v1}, Lhn/w;->i(Lhn/h$e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lhn/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lhn/a$e;->i:[Ljava/lang/reflect/Type;

    aget-object p2, p2, v1

    iget-object v0, p0, Lhn/a$e;->k:Ljava/util/Set;

    invoke-virtual {p1, p2, v0}, Lhn/w;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)Lhn/h;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lhn/a$e;->h:Lhn/h;

    return-void
.end method

.method public b(Lhn/w;Lhn/m;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lhn/a$e;->h:Lhn/h;

    invoke-virtual {p1, p2}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhn/a$f;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
