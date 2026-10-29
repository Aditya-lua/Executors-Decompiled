.class public final La8/i$b;
.super La8/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:La8/o$c;

.field public b:La8/o$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La8/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La8/o;
    .locals 4

    new-instance v0, La8/i;

    iget-object v1, p0, La8/i$b;->a:La8/o$c;

    iget-object v2, p0, La8/i$b;->b:La8/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, La8/i;-><init>(La8/o$c;La8/o$b;La8/i$a;)V

    return-object v0
.end method

.method public b(La8/o$b;)La8/o$a;
    .locals 0

    iput-object p1, p0, La8/i$b;->b:La8/o$b;

    return-object p0
.end method

.method public c(La8/o$c;)La8/o$a;
    .locals 0

    iput-object p1, p0, La8/i$b;->a:La8/o$c;

    return-object p0
.end method
