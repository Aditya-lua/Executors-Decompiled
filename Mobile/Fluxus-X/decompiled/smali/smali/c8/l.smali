.class public abstract Lc8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lwf/h;->a()Lwf/h$a;

    move-result-object v0

    sget-object v1, Lc8/a;->a:Luf/a;

    invoke-virtual {v0, v1}, Lwf/h$a;->c(Luf/a;)Lwf/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lwf/h$a;->b()Lwf/h;

    move-result-object v0

    sput-object v0, Lc8/l;->a:Lwf/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lc8/l;->a:Lwf/h;

    invoke-virtual {v0, p0}, Lwf/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lf8/a;
.end method
