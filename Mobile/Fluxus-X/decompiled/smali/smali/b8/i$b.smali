.class public final Lb8/i$b;
.super Lb8/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lb8/o$c;

.field public b:Lb8/o$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb8/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb8/o;
    .locals 4

    new-instance v0, Lb8/i;

    iget-object v1, p0, Lb8/i$b;->a:Lb8/o$c;

    iget-object v2, p0, Lb8/i$b;->b:Lb8/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb8/i;-><init>(Lb8/o$c;Lb8/o$b;Lb8/i$a;)V

    return-object v0
.end method

.method public b(Lb8/o$b;)Lb8/o$a;
    .locals 0

    iput-object p1, p0, Lb8/i$b;->b:Lb8/o$b;

    return-object p0
.end method

.method public c(Lb8/o$c;)Lb8/o$a;
    .locals 0

    iput-object p1, p0, Lb8/i$b;->a:Lb8/o$c;

    return-object p0
.end method
