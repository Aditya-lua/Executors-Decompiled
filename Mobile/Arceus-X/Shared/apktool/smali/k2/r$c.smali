.class public Lk2/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lk2/r;
    .locals 1

    new-instance v0, Lk2/r;

    invoke-direct {v0, p0}, Lk2/r;-><init>(Lk2/r$c;)V

    return-object v0
.end method

.method public b(Z)Lk2/r$c;
    .locals 0

    iput-boolean p1, p0, Lk2/r$c;->e:Z

    return-object p0
.end method

.method public c(Z)Lk2/r$c;
    .locals 0

    iput-boolean p1, p0, Lk2/r$c;->f:Z

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lk2/r$c;
    .locals 0

    iput-object p1, p0, Lk2/r$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/CharSequence;)Lk2/r$c;
    .locals 0

    iput-object p1, p0, Lk2/r$c;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lk2/r$c;
    .locals 0

    iput-object p1, p0, Lk2/r$c;->c:Ljava/lang/String;

    return-object p0
.end method
