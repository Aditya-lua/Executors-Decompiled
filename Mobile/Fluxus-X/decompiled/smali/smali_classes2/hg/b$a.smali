.class public final Lhg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lhg/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhg/b$a;->a:Lhg/a;

    return-void
.end method


# virtual methods
.method public a()Lhg/b;
    .locals 2

    new-instance v0, Lhg/b;

    iget-object v1, p0, Lhg/b$a;->a:Lhg/a;

    invoke-direct {v0, v1}, Lhg/b;-><init>(Lhg/a;)V

    return-object v0
.end method

.method public b(Lhg/a;)Lhg/b$a;
    .locals 0

    iput-object p1, p0, Lhg/b$a;->a:Lhg/a;

    return-object p0
.end method
