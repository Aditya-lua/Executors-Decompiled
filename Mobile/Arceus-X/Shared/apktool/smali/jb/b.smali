.class public final Ljb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final a:Ljb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljb/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljb/b;-><init>(ZLjb/d;)V

    sput-object v0, Ljb/b;->a:Ljb/b;

    return-void
.end method

.method public constructor <init>(ZLjb/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLjb/c;)Ljb/b;
    .locals 0

    sget-object p0, Ljb/b;->a:Ljb/b;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
