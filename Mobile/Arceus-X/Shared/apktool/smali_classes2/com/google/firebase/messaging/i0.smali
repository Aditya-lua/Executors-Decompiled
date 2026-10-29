.class public abstract Lcom/google/firebase/messaging/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Luf/h;->a()Luf/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lsf/a;

    invoke-virtual {v0, v1}, Luf/h$a;->c(Lsf/a;)Luf/h$a;

    move-result-object v0

    invoke-virtual {v0}, Luf/h$a;->b()Luf/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/i0;->a:Luf/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/i0;->a:Luf/h;

    invoke-virtual {v0, p0}, Luf/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lfg/b;
.end method
