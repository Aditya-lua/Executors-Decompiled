.class public Lse/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lye/k0<",
        "Lre/a;",
        "Lre/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lse/e;

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lye/p;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lse/e;

    invoke-direct {v0}, Lse/e;-><init>()V

    sput-object v0, Lse/e;->a:Lse/e;

    new-instance v0, Lse/d;

    invoke-direct {v0}, Lse/d;-><init>()V

    const-class v1, Lye/p;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/e;->b:Lye/h0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()V
    .locals 2

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/e;->a:Lse/e;

    invoke-virtual {v0, v1}, Lye/a0;->e(Lye/k0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/e;->b:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lre/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lre/a;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lre/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lre/a;

    return-object v0
.end method

.method public bridge synthetic c(Lye/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lse/e;->e(Lye/j0;)Lre/a;

    move-result-object p1

    return-object p1
.end method

.method public e(Lye/j0;)Lre/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lye/j0<",
            "Lre/a;",
            ">;)",
            "Lre/a;"
        }
    .end annotation

    new-instance v0, Lse/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lse/e$b;-><init>(Lye/j0;Lse/e$a;)V

    return-object v0
.end method
