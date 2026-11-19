.class public final Lb8/e$b;
.super Lb8/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lb8/k$b;

.field public b:Lb8/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb8/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb8/k;
    .locals 4

    new-instance v0, Lb8/e;

    iget-object v1, p0, Lb8/e$b;->a:Lb8/k$b;

    iget-object v2, p0, Lb8/e$b;->b:Lb8/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb8/e;-><init>(Lb8/k$b;Lb8/a;Lb8/e$a;)V

    return-object v0
.end method

.method public b(Lb8/a;)Lb8/k$a;
    .locals 0

    iput-object p1, p0, Lb8/e$b;->b:Lb8/a;

    return-object p0
.end method

.method public c(Lb8/k$b;)Lb8/k$a;
    .locals 0

    iput-object p1, p0, Lb8/e$b;->a:Lb8/k$b;

    return-object p0
.end method
