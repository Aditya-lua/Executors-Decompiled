.class public interface abstract Lf1/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf1/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/h1$a;

    invoke-direct {v0}, Lf1/h1$a;-><init>()V

    sput-object v0, Lf1/h1;->a:Lf1/h1;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;Lg0/k0;)Lf1/x;
    .locals 0

    sget-object p1, Lf1/x;->g:Lf1/x;

    return-object p1
.end method

.method public b(Landroid/util/Size;Lg0/k0;)Lh1/i;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract c()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation
.end method

.method public d(Lf1/x;Lg0/k0;)Lh1/i;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract e(Lg0/k0;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;"
        }
    .end annotation
.end method
