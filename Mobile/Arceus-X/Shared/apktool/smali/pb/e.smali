.class public final Lpb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/a$g;

.field public static final b:Lk9/a$g;

.field public static final c:Lk9/a$a;

.field public static final d:Lk9/a$a;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lk9/a;

.field public static final h:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lpb/e;->a:Lk9/a$g;

    new-instance v1, Lk9/a$g;

    invoke-direct {v1}, Lk9/a$g;-><init>()V

    sput-object v1, Lpb/e;->b:Lk9/a$g;

    new-instance v2, Lpb/b;

    invoke-direct {v2}, Lpb/b;-><init>()V

    sput-object v2, Lpb/e;->c:Lk9/a$a;

    new-instance v3, Lpb/c;

    invoke-direct {v3}, Lpb/c;-><init>()V

    sput-object v3, Lpb/e;->d:Lk9/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lpb/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lpb/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lk9/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v4, Lpb/e;->g:Lk9/a;

    new-instance v0, Lk9/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v0, Lpb/e;->h:Lk9/a;

    return-void
.end method
