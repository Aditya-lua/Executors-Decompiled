.class public final Ly8/b;
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
.end field

.field public static final b:Lb9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final c:Lk9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final d:Lk9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Ly8/b;->c:Lk9/a$g;

    new-instance v1, Ly8/h;

    invoke-direct {v1}, Ly8/h;-><init>()V

    sput-object v1, Ly8/b;->d:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Ly8/b;->a:Lk9/a;

    new-instance v0, Lxa/d;

    invoke-direct {v0}, Lxa/d;-><init>()V

    sput-object v0, Ly8/b;->b:Lb9/a;

    return-void
.end method
