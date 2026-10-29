.class public Ll7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ll7/g;


# instance fields
.field public final a:Lw1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/i<",
            "Ljava/lang/String;",
            "Lf7/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll7/g;

    invoke-direct {v0}, Ll7/g;-><init>()V

    sput-object v0, Ll7/g;->b:Ll7/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw1/i;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lw1/i;-><init>(I)V

    iput-object v0, p0, Ll7/g;->a:Lw1/i;

    return-void
.end method

.method public static b()Ll7/g;
    .locals 1

    sget-object v0, Ll7/g;->b:Ll7/g;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lf7/i;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ll7/g;->a:Lw1/i;

    invoke-virtual {v0, p1}, Lw1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf7/i;

    return-object p1
.end method

.method public c(Ljava/lang/String;Lf7/i;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll7/g;->a:Lw1/i;

    invoke-virtual {v0, p1, p2}, Lw1/i;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
