.class public final Le8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/a$a;
    }
.end annotation


# static fields
.field public static final e:Le8/a;


# instance fields
.field public final a:Le8/f;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le8/b;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le8/a$a;

    invoke-direct {v0}, Le8/a$a;-><init>()V

    invoke-virtual {v0}, Le8/a$a;->b()Le8/a;

    move-result-object v0

    sput-object v0, Le8/a;->e:Le8/a;

    return-void
.end method

.method public constructor <init>(Le8/f;Ljava/util/List;Le8/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le8/f;",
            "Ljava/util/List<",
            "Le8/d;",
            ">;",
            "Le8/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/a;->a:Le8/f;

    iput-object p2, p0, Le8/a;->b:Ljava/util/List;

    iput-object p3, p0, Le8/a;->c:Le8/b;

    iput-object p4, p0, Le8/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Le8/a$a;
    .locals 1

    new-instance v0, Le8/a$a;

    invoke-direct {v0}, Le8/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Luf/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Le8/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Le8/b;
    .locals 1
    .annotation build Luf/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Le8/a;->c:Le8/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le8/d;",
            ">;"
        }
    .end annotation

    .annotation build Luf/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Le8/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Le8/f;
    .locals 1
    .annotation build Luf/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Le8/a;->a:Le8/f;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, Lb8/l;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
