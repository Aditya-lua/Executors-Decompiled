.class public final Lkb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final a:Lkb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkb/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkb/b;-><init>(ZLkb/d;)V

    sput-object v0, Lkb/b;->a:Lkb/b;

    return-void
.end method

.method public constructor <init>(ZLkb/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLkb/c;)Lkb/b;
    .locals 0

    sget-object p0, Lkb/b;->a:Lkb/b;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
