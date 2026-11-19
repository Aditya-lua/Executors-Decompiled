.class public Lmb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a<",
            "Ll9/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lmb/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lmb/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lmb/h;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Ll9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a$g<",
            "Lib/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ll9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a$a<",
            "Lib/n;",
            "Ll9/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lmb/f;->e:Ll9/a$g;

    new-instance v1, Lmb/v;

    invoke-direct {v1}, Lmb/v;-><init>()V

    sput-object v1, Lmb/f;->f:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "LocationServices.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lmb/f;->a:Ll9/a;

    new-instance v0, Lib/c0;

    invoke-direct {v0}, Lib/c0;-><init>()V

    sput-object v0, Lmb/f;->b:Lmb/a;

    new-instance v0, Lib/b;

    invoke-direct {v0}, Lib/b;-><init>()V

    sput-object v0, Lmb/f;->c:Lmb/c;

    new-instance v0, Lib/u;

    invoke-direct {v0}, Lib/u;-><init>()V

    sput-object v0, Lmb/f;->d:Lmb/h;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lmb/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lmb/b;

    invoke-direct {v0, p0}, Lmb/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lmb/i;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lmb/i;

    invoke-direct {v0, p0}, Lmb/i;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
