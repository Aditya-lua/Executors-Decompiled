.class public Lum/a$c;
.super Lum/a$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/a;->e(Ljava/lang/Object;Ljava/lang/reflect/Method;)Lum/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public h:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
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

    iput-object p8, p0, Lum/a$c;->i:[Ljava/lang/reflect/Type;

    iput-object p9, p0, Lum/a$c;->j:Ljava/lang/reflect/Type;

    iput-object p10, p0, Lum/a$c;->k:Ljava/util/Set;

    iput-object p11, p0, Lum/a$c;->l:Ljava/util/Set;

    invoke-direct/range {p0 .. p7}, Lum/a$f;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-void
.end method


# virtual methods
.method public a(Lum/w;Lum/h$e;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lum/a$f;->a(Lum/w;Lum/h$e;)V

    iget-object v0, p0, Lum/a$c;->i:[Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lum/a$c;->j:Ljava/lang/reflect/Type;

    invoke-static {v0, v1}, Lum/a0;->d(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lum/a$c;->k:Ljava/util/Set;

    iget-object v1, p0, Lum/a$c;->l:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lum/a$c;->j:Ljava/lang/reflect/Type;

    iget-object v1, p0, Lum/a$c;->l:Ljava/util/Set;

    invoke-virtual {p1, p2, v0, v1}, Lum/w;->i(Lum/h$e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lum/a$c;->j:Ljava/lang/reflect/Type;

    iget-object v0, p0, Lum/a$c;->l:Ljava/util/Set;

    invoke-virtual {p1, p2, v0}, Lum/w;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/h;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lum/a$c;->h:Lum/h;

    return-void
.end method

.method public e(Lum/w;Lum/t;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p3}, Lum/a$f;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p0, Lum/a$c;->h:Lum/h;

    invoke-virtual {p3, p2, p1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void
.end method
