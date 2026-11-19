.class public final Lg0/f1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Ln0/u3;

.field public static final b:La1/c;

.field public static final c:Ln0/g2;

.field public static final d:Lg0/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Ln0/u3;->e:Ln0/u3;

    sput-object v0, Lg0/f1$c;->a:Ln0/u3;

    new-instance v1, La1/c$a;

    invoke-direct {v1}, La1/c$a;-><init>()V

    sget-object v2, La1/a;->c:La1/a;

    invoke-virtual {v1, v2}, La1/c$a;->d(La1/a;)La1/c$a;

    move-result-object v1

    sget-object v2, La1/d;->c:La1/d;

    invoke-virtual {v1, v2}, La1/c$a;->f(La1/d;)La1/c$a;

    move-result-object v1

    invoke-virtual {v1}, La1/c$a;->a()La1/c;

    move-result-object v1

    sput-object v1, Lg0/f1$c;->b:La1/c;

    sget-object v2, Lg0/k0;->d:Lg0/k0;

    sput-object v2, Lg0/f1$c;->d:Lg0/k0;

    new-instance v3, Lg0/f1$b;

    invoke-direct {v3}, Lg0/f1$b;-><init>()V

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lg0/f1$b;->p(I)Lg0/f1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lg0/f1$b;->o(Ln0/u3;)Lg0/f1$b;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lg0/f1$b;->q(I)Lg0/f1$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lg0/f1$b;->n(La1/c;)Lg0/f1$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lg0/f1$b;->m(I)Lg0/f1$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lg0/f1$b;->k(Lg0/k0;)Lg0/f1$b;

    move-result-object v0

    invoke-virtual {v0}, Lg0/f1$b;->h()Ln0/g2;

    move-result-object v0

    sput-object v0, Lg0/f1$c;->c:Ln0/g2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ln0/g2;
    .locals 1

    sget-object v0, Lg0/f1$c;->c:Ln0/g2;

    return-object v0
.end method
