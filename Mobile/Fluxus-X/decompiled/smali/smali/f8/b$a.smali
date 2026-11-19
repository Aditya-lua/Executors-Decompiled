.class public final Lf8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lf8/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf8/b$a;->a:Lf8/e;

    return-void
.end method


# virtual methods
.method public a()Lf8/b;
    .locals 2

    new-instance v0, Lf8/b;

    iget-object v1, p0, Lf8/b$a;->a:Lf8/e;

    invoke-direct {v0, v1}, Lf8/b;-><init>(Lf8/e;)V

    return-object v0
.end method

.method public b(Lf8/e;)Lf8/b$a;
    .locals 0

    iput-object p1, p0, Lf8/b$a;->a:Lf8/e;

    return-object p0
.end method
