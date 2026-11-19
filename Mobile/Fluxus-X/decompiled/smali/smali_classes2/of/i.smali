.class public interface abstract Lof/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lof/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lof/h;

    invoke-direct {v0}, Lof/h;-><init>()V

    sput-object v0, Lof/i;->a:Lof/i;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ")",
            "Ljava/util/List<",
            "Lof/c<",
            "*>;>;"
        }
    .end annotation
.end method
