.class public final Lz8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a<",
            "Lz8/c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Ll9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lc9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Ld9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final e:Ll9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final f:Ll9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final g:Ll9/a$a;

.field public static final h:Ll9/a$a;

.field public static final i:Ll9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final j:Lza/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lz8/a;->e:Ll9/a$g;

    new-instance v1, Ll9/a$g;

    invoke-direct {v1}, Ll9/a$g;-><init>()V

    sput-object v1, Lz8/a;->f:Ll9/a$g;

    new-instance v2, Lz8/d;

    invoke-direct {v2}, Lz8/d;-><init>()V

    sput-object v2, Lz8/a;->g:Ll9/a$a;

    new-instance v3, Lz8/e;

    invoke-direct {v3}, Lz8/e;-><init>()V

    sput-object v3, Lz8/a;->h:Ll9/a$a;

    sget-object v4, Lz8/b;->a:Ll9/a;

    sput-object v4, Lz8/a;->a:Ll9/a;

    new-instance v4, Ll9/a;

    const-string v5, "Auth.CREDENTIALS_API"

    invoke-direct {v4, v5, v2, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v4, Lz8/a;->i:Ll9/a;

    new-instance v0, Ll9/a;

    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v0, v2, v3, v1}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v0, Lz8/a;->b:Ll9/a;

    sget-object v0, Lz8/b;->b:Lc9/a;

    sput-object v0, Lz8/a;->c:Lc9/a;

    new-instance v0, Lza/u;

    invoke-direct {v0}, Lza/u;-><init>()V

    sput-object v0, Lz8/a;->j:Lza/u;

    new-instance v0, Le9/h;

    invoke-direct {v0}, Le9/h;-><init>()V

    sput-object v0, Lz8/a;->d:Ld9/a;

    return-void
.end method
