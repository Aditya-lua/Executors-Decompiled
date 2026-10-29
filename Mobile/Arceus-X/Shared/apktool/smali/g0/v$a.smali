.class public final Lg0/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lg0/r;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lg0/v$a;->a:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public a()Lg0/v;
    .locals 3

    new-instance v0, Lg0/v;

    iget-object v1, p0, Lg0/v$a;->a:Ljava/util/LinkedHashSet;

    iget-object v2, p0, Lg0/v$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lg0/v;-><init>(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(I)Lg0/v$a;
    .locals 2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The specified lens facing is invalid."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lg0/v$a;->a:Ljava/util/LinkedHashSet;

    new-instance v1, Ln0/m2;

    invoke-direct {v1, p1}, Ln0/m2;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
