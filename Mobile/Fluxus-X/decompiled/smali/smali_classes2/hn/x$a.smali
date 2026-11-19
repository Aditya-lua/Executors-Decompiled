.class public Lhn/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

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

    const/4 p1, 0x0

    return-object p1
.end method
