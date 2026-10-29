.class public final La8/e$b;
.super La8/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:La8/k$b;

.field public b:La8/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La8/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La8/k;
    .locals 4

    new-instance v0, La8/e;

    iget-object v1, p0, La8/e$b;->a:La8/k$b;

    iget-object v2, p0, La8/e$b;->b:La8/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, La8/e;-><init>(La8/k$b;La8/a;La8/e$a;)V

    return-object v0
.end method

.method public b(La8/a;)La8/k$a;
    .locals 0

    iput-object p1, p0, La8/e$b;->b:La8/a;

    return-object p0
.end method

.method public c(La8/k$b;)La8/k$a;
    .locals 0

    iput-object p1, p0, La8/e$b;->a:La8/k$b;

    return-object p0
.end method
