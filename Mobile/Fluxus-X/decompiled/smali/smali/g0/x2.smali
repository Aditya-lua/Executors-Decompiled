.class public final Lg0/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/x2$a;
    }
.end annotation


# instance fields
.field public final a:Lg0/y2;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg0/y2;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/y2;",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/x2;->a:Lg0/y2;

    iput-object p2, p0, Lg0/x2;->b:Ljava/util/List;

    iput-object p3, p0, Lg0/x2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/x2;->c:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/x2;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Lg0/y2;
    .locals 1

    iget-object v0, p0, Lg0/x2;->a:Lg0/y2;

    return-object v0
.end method
