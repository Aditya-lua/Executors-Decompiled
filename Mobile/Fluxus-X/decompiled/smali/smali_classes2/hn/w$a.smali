.class public Lhn/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/w;->h(Ljava/lang/reflect/Type;Lhn/h;)Lhn/h$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Lhn/h;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lhn/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lhn/w$a;->a:Ljava/lang/reflect/Type;

    iput-object p2, p0, Lhn/w$a;->b:Lhn/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lhn/w;)Lhn/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lhn/w;",
            ")",
            "Lhn/h<",
            "*>;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lhn/w$a;->a:Ljava/lang/reflect/Type;

    invoke-static {p2, p1}, Ljn/c;->w(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhn/w$a;->b:Lhn/h;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
