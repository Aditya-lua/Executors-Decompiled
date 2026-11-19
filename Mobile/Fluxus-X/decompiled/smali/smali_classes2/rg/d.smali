.class public final Lrg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Log/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Log/c$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Log/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Log/c$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Llg/b0;

.field public static final e:Llg/b0;

.field public static final f:Llg/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lrg/d;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lrg/d$a;

    const-class v1, Ljava/sql/Date;

    invoke-direct {v0, v1}, Lrg/d$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lrg/d;->b:Log/c$b;

    new-instance v0, Lrg/d$b;

    const-class v1, Ljava/sql/Timestamp;

    invoke-direct {v0, v1}, Lrg/d$b;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lrg/d;->c:Log/c$b;

    sget-object v0, Lrg/a;->b:Llg/b0;

    sput-object v0, Lrg/d;->d:Llg/b0;

    sget-object v0, Lrg/b;->b:Llg/b0;

    sput-object v0, Lrg/d;->e:Llg/b0;

    sget-object v0, Lrg/c;->b:Llg/b0;

    sput-object v0, Lrg/d;->f:Llg/b0;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lrg/d;->b:Log/c$b;

    sput-object v0, Lrg/d;->c:Log/c$b;

    sput-object v0, Lrg/d;->d:Llg/b0;

    sput-object v0, Lrg/d;->e:Llg/b0;

    sput-object v0, Lrg/d;->f:Llg/b0;

    :goto_1
    return-void
.end method
