.class public final Lf8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/d$a;
    }
.end annotation


# static fields
.field public static final c:Lf8/d;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf8/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/d$a;

    invoke-direct {v0}, Lf8/d$a;-><init>()V

    invoke-virtual {v0}, Lf8/d$a;->a()Lf8/d;

    move-result-object v0

    sput-object v0, Lf8/d;->c:Lf8/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lf8/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/d;->a:Ljava/lang/String;

    iput-object p2, p0, Lf8/d;->b:Ljava/util/List;

    return-void
.end method

.method public static c()Lf8/d$a;
    .locals 1

    new-instance v0, Lf8/d$a;

    invoke-direct {v0}, Lf8/d$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lf8/c;",
            ">;"
        }
    .end annotation

    .annotation build Lwf/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lf8/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lf8/d;->a:Ljava/lang/String;

    return-object v0
.end method
