.class public Lze/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lze/t$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lye/k0<",
        "Lre/w;",
        "Lre/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lze/t;

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lye/p;",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lze/t;

    invoke-direct {v0}, Lze/t;-><init>()V

    sput-object v0, Lze/t;->a:Lze/t;

    new-instance v0, Lze/s;

    invoke-direct {v0}, Lze/s;-><init>()V

    const-class v1, Lye/p;

    const-class v2, Lre/w;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lze/t;->b:Lye/h0;

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

    sget-object v1, Lze/t;->a:Lze/t;

    invoke-virtual {v0, v1}, Lye/a0;->e(Lye/k0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lze/t;->b:Lye/h0;

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
            "Lre/w;",
            ">;"
        }
    .end annotation

    const-class v0, Lre/w;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lre/w;",
            ">;"
        }
    .end annotation

    const-class v0, Lre/w;

    return-object v0
.end method

.method public bridge synthetic c(Lye/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lze/t;->e(Lye/j0;)Lre/w;

    move-result-object p1

    return-object p1
.end method

.method public e(Lye/j0;)Lre/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lye/j0<",
            "Lre/w;",
            ">;)",
            "Lre/w;"
        }
    .end annotation

    new-instance v0, Lze/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lze/t$b;-><init>(Lye/j0;Lze/t$a;)V

    return-object v0
.end method
