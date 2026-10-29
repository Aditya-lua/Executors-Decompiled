.class public Llb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a<",
            "Lk9/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Llb/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Llb/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Llb/h;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lk9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a$g<",
            "Lhb/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lk9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a$a<",
            "Lhb/n;",
            "Lk9/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Llb/f;->e:Lk9/a$g;

    new-instance v1, Llb/v;

    invoke-direct {v1}, Llb/v;-><init>()V

    sput-object v1, Llb/f;->f:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "LocationServices.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Llb/f;->a:Lk9/a;

    new-instance v0, Lhb/y;

    invoke-direct {v0}, Lhb/y;-><init>()V

    sput-object v0, Llb/f;->b:Llb/a;

    new-instance v0, Lhb/b;

    invoke-direct {v0}, Lhb/b;-><init>()V

    sput-object v0, Llb/f;->c:Llb/c;

    new-instance v0, Lhb/s;

    invoke-direct {v0}, Lhb/s;-><init>()V

    sput-object v0, Llb/f;->d:Llb/h;

    return-void
.end method

.method public static a(Landroid/content/Context;)Llb/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Llb/b;

    invoke-direct {v0, p0}, Llb/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Llb/i;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Llb/i;

    invoke-direct {v0, p0}, Llb/i;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
