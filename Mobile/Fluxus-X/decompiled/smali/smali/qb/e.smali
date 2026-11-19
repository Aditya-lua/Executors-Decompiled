.class public final Lqb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll9/a$g;

.field public static final b:Ll9/a$g;

.field public static final c:Ll9/a$a;

.field public static final d:Ll9/a$a;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Ll9/a;

.field public static final h:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lqb/e;->a:Ll9/a$g;

    new-instance v1, Ll9/a$g;

    invoke-direct {v1}, Ll9/a$g;-><init>()V

    sput-object v1, Lqb/e;->b:Ll9/a$g;

    new-instance v2, Lqb/b;

    invoke-direct {v2}, Lqb/b;-><init>()V

    sput-object v2, Lqb/e;->c:Ll9/a$a;

    new-instance v3, Lqb/c;

    invoke-direct {v3}, Lqb/c;-><init>()V

    sput-object v3, Lqb/e;->d:Ll9/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lqb/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lqb/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Ll9/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v4, Lqb/e;->g:Ll9/a;

    new-instance v0, Ll9/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v0, Lqb/e;->h:Ll9/a;

    return-void
.end method
