.class public final La1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:La1/a;

.field public b:La1/d;

.field public c:La1/b;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, La1/a;->c:La1/a;

    iput-object v0, p0, La1/c$a;->a:La1/a;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, La1/c$a;->b:La1/d;

    .line 4
    iput-object v0, p0, La1/c$a;->c:La1/b;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, La1/c$a;->d:I

    return-void
.end method

.method public constructor <init>(La1/c;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, La1/a;->c:La1/a;

    iput-object v0, p0, La1/c$a;->a:La1/a;

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, La1/c$a;->b:La1/d;

    .line 9
    iput-object v0, p0, La1/c$a;->c:La1/b;

    const/4 v0, 0x0

    .line 10
    iput v0, p0, La1/c$a;->d:I

    .line 11
    invoke-virtual {p1}, La1/c;->b()La1/a;

    move-result-object v0

    iput-object v0, p0, La1/c$a;->a:La1/a;

    .line 12
    invoke-virtual {p1}, La1/c;->d()La1/d;

    move-result-object v0

    iput-object v0, p0, La1/c$a;->b:La1/d;

    .line 13
    invoke-virtual {p1}, La1/c;->c()La1/b;

    move-result-object v0

    iput-object v0, p0, La1/c$a;->c:La1/b;

    .line 14
    invoke-virtual {p1}, La1/c;->a()I

    move-result p1

    iput p1, p0, La1/c$a;->d:I

    return-void
.end method

.method public static b(La1/c;)La1/c$a;
    .locals 1

    new-instance v0, La1/c$a;

    invoke-direct {v0, p0}, La1/c$a;-><init>(La1/c;)V

    return-object v0
.end method


# virtual methods
.method public a()La1/c;
    .locals 5

    new-instance v0, La1/c;

    iget-object v1, p0, La1/c$a;->a:La1/a;

    iget-object v2, p0, La1/c$a;->b:La1/d;

    iget-object v3, p0, La1/c$a;->c:La1/b;

    iget v4, p0, La1/c$a;->d:I

    invoke-direct {v0, v1, v2, v3, v4}, La1/c;-><init>(La1/a;La1/d;La1/b;I)V

    return-object v0
.end method

.method public c(I)La1/c$a;
    .locals 0

    iput p1, p0, La1/c$a;->d:I

    return-object p0
.end method

.method public d(La1/a;)La1/c$a;
    .locals 0

    iput-object p1, p0, La1/c$a;->a:La1/a;

    return-object p0
.end method

.method public e(La1/b;)La1/c$a;
    .locals 0

    iput-object p1, p0, La1/c$a;->c:La1/b;

    return-object p0
.end method

.method public f(La1/d;)La1/c$a;
    .locals 0

    iput-object p1, p0, La1/c$a;->b:La1/d;

    return-object p0
.end method
