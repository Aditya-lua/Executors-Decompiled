.class public final Lfb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Lfb/j;

.field public static final c:Lfb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfb/f;->a:Ljava/lang/Object;

    new-instance v0, Lfb/j;

    invoke-direct {v0}, Lfb/j;-><init>()V

    sput-object v0, Lfb/f;->b:Lfb/j;

    sget-object v0, Lfb/e;->a:Lfb/e;

    invoke-static {v0}, Lfb/u0;->a(Lfb/q0;)Lfb/q0;

    move-result-object v0

    sput-object v0, Lfb/f;->c:Lfb/q0;

    return-void
.end method

.method public static a()Lfb/f;
    .locals 2

    invoke-static {}, Lfb/i;->a()V

    invoke-static {}, Lfb/i;->b()V

    invoke-static {}, Lfb/i;->d()Z

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call PhenotypeContext.setContext() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b()Z
    .locals 1

    invoke-static {}, Lfb/i;->d()Z

    invoke-static {}, Lfb/i;->c()V

    const/4 v0, 0x0

    return v0
.end method
