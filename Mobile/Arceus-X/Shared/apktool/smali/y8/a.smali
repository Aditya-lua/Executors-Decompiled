.class public final Ly8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a<",
            "Ly8/c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lk9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lb9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lc9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final e:Lk9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final f:Lk9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final g:Lk9/a$a;

.field public static final h:Lk9/a$a;

.field public static final i:Lk9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final j:Lya/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Ly8/a;->e:Lk9/a$g;

    new-instance v1, Lk9/a$g;

    invoke-direct {v1}, Lk9/a$g;-><init>()V

    sput-object v1, Ly8/a;->f:Lk9/a$g;

    new-instance v2, Ly8/d;

    invoke-direct {v2}, Ly8/d;-><init>()V

    sput-object v2, Ly8/a;->g:Lk9/a$a;

    new-instance v3, Ly8/e;

    invoke-direct {v3}, Ly8/e;-><init>()V

    sput-object v3, Ly8/a;->h:Lk9/a$a;

    sget-object v4, Ly8/b;->a:Lk9/a;

    sput-object v4, Ly8/a;->a:Lk9/a;

    new-instance v4, Lk9/a;

    const-string v5, "Auth.CREDENTIALS_API"

    invoke-direct {v4, v5, v2, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v4, Ly8/a;->i:Lk9/a;

    new-instance v0, Lk9/a;

    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v0, v2, v3, v1}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v0, Ly8/a;->b:Lk9/a;

    sget-object v0, Ly8/b;->b:Lb9/a;

    sput-object v0, Ly8/a;->c:Lb9/a;

    new-instance v0, Lya/u;

    invoke-direct {v0}, Lya/u;-><init>()V

    sput-object v0, Ly8/a;->j:Lya/u;

    new-instance v0, Ld9/g;

    invoke-direct {v0}, Ld9/g;-><init>()V

    sput-object v0, Ly8/a;->d:Lc9/a;

    return-void
.end method
