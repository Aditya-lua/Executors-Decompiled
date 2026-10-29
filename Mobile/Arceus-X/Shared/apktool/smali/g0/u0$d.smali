.class public final Lg0/u0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Landroid/util/Size;

.field public static final b:Lg0/k0;

.field public static final c:La1/c;

.field public static final d:Ln0/f2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lg0/u0$d;->a:Landroid/util/Size;

    sget-object v1, Lg0/k0;->d:Lg0/k0;

    sput-object v1, Lg0/u0$d;->b:Lg0/k0;

    new-instance v2, La1/c$a;

    invoke-direct {v2}, La1/c$a;-><init>()V

    sget-object v3, La1/a;->c:La1/a;

    invoke-virtual {v2, v3}, La1/c$a;->d(La1/a;)La1/c$a;

    move-result-object v2

    new-instance v3, La1/d;

    sget-object v4, Lw0/d;->c:Landroid/util/Size;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, La1/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {v2, v3}, La1/c$a;->f(La1/d;)La1/c$a;

    move-result-object v2

    invoke-virtual {v2}, La1/c$a;->a()La1/c;

    move-result-object v2

    sput-object v2, Lg0/u0$d;->c:La1/c;

    new-instance v3, Lg0/u0$c;

    invoke-direct {v3}, Lg0/u0$c;-><init>()V

    invoke-virtual {v3, v0}, Lg0/u0$c;->l(Landroid/util/Size;)Lg0/u0$c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lg0/u0$c;->q(I)Lg0/u0$c;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lg0/u0$c;->r(I)Lg0/u0$c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lg0/u0$c;->p(La1/c;)Lg0/u0$c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lg0/u0$c;->m(Lg0/k0;)Lg0/u0$c;

    move-result-object v0

    invoke-virtual {v0}, Lg0/u0$c;->h()Ln0/f2;

    move-result-object v0

    sput-object v0, Lg0/u0$d;->d:Ln0/f2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ln0/f2;
    .locals 1

    sget-object v0, Lg0/u0$d;->d:Ln0/f2;

    return-object v0
.end method
