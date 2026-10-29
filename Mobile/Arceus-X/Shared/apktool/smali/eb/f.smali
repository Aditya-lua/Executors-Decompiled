.class public final Leb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Leb/j;

.field public static final c:Leb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Leb/f;->a:Ljava/lang/Object;

    new-instance v0, Leb/j;

    invoke-direct {v0}, Leb/j;-><init>()V

    sput-object v0, Leb/f;->b:Leb/j;

    sget-object v0, Leb/e;->a:Leb/e;

    invoke-static {v0}, Leb/u0;->a(Leb/q0;)Leb/q0;

    move-result-object v0

    sput-object v0, Leb/f;->c:Leb/q0;

    return-void
.end method

.method public static a()Leb/f;
    .locals 2

    invoke-static {}, Leb/i;->a()V

    invoke-static {}, Leb/i;->b()V

    invoke-static {}, Leb/i;->d()Z

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call PhenotypeContext.setContext() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b()Z
    .locals 1

    invoke-static {}, Leb/i;->d()Z

    invoke-static {}, Leb/i;->c()V

    const/4 v0, 0x0

    return v0
.end method
