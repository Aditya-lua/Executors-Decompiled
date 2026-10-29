.class public final Lfg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfg/b$a;
    }
.end annotation


# static fields
.field public static final b:Lfg/b;


# instance fields
.field public final a:Lfg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfg/b$a;

    invoke-direct {v0}, Lfg/b$a;-><init>()V

    invoke-virtual {v0}, Lfg/b$a;->a()Lfg/b;

    move-result-object v0

    sput-object v0, Lfg/b;->b:Lfg/b;

    return-void
.end method

.method public constructor <init>(Lfg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/b;->a:Lfg/a;

    return-void
.end method

.method public static b()Lfg/b$a;
    .locals 1

    new-instance v0, Lfg/b$a;

    invoke-direct {v0}, Lfg/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lfg/a;
    .locals 1
    .annotation build Luf/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lfg/b;->a:Lfg/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/messaging/i0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
