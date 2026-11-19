.class public final Lz8/b;
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
.end field

.field public static final b:Lc9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final c:Ll9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final d:Ll9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lz8/b;->c:Ll9/a$g;

    new-instance v1, Lz8/h;

    invoke-direct {v1}, Lz8/h;-><init>()V

    sput-object v1, Lz8/b;->d:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lz8/b;->a:Ll9/a;

    new-instance v0, Lya/d;

    invoke-direct {v0}, Lya/d;-><init>()V

    sput-object v0, Lz8/b;->b:Lc9/a;

    return-void
.end method
