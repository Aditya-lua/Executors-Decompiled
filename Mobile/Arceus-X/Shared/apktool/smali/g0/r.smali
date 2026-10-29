.class public interface abstract Lg0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ln0/e2;->a(Ljava/lang/Object;)Ln0/e2;

    move-result-object v0

    sput-object v0, Lg0/r;->a:Ln0/e2;

    return-void
.end method


# virtual methods
.method public a()Ln0/e2;
    .locals 1

    sget-object v0, Lg0/r;->a:Ln0/e2;

    return-object v0
.end method

.method public abstract b(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/t;",
            ">;)",
            "Ljava/util/List<",
            "Lg0/t;",
            ">;"
        }
    .end annotation
.end method
