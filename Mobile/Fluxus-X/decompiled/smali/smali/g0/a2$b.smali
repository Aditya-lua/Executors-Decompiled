.class public final Lg0/a2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:La1/c;

.field public static final b:Ln0/f3;

.field public static final c:Lg0/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La1/c$a;

    invoke-direct {v0}, La1/c$a;-><init>()V

    sget-object v1, La1/a;->c:La1/a;

    invoke-virtual {v0, v1}, La1/c$a;->d(La1/a;)La1/c$a;

    move-result-object v0

    sget-object v1, La1/d;->c:La1/d;

    invoke-virtual {v0, v1}, La1/c$a;->f(La1/d;)La1/c$a;

    move-result-object v0

    invoke-virtual {v0}, La1/c$a;->a()La1/c;

    move-result-object v0

    sput-object v0, Lg0/a2$b;->a:La1/c;

    sget-object v1, Lg0/k0;->c:Lg0/k0;

    sput-object v1, Lg0/a2$b;->c:Lg0/k0;

    new-instance v2, Lg0/a2$a;

    invoke-direct {v2}, Lg0/a2$a;-><init>()V

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lg0/a2$a;->m(I)Lg0/a2$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lg0/a2$a;->n(I)Lg0/a2$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lg0/a2$a;->l(La1/c;)Lg0/a2$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lg0/a2$a;->k(Z)Lg0/a2$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lg0/a2$a;->j(Lg0/k0;)Lg0/a2$a;

    move-result-object v0

    invoke-virtual {v0}, Lg0/a2$a;->h()Ln0/f3;

    move-result-object v0

    sput-object v0, Lg0/a2$b;->b:Ln0/f3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ln0/f3;
    .locals 1

    sget-object v0, Lg0/a2$b;->b:Ln0/f3;

    return-object v0
.end method
