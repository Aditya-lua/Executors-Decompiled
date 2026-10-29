.class public interface abstract Lmf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmf/h;

    invoke-direct {v0}, Lmf/h;-><init>()V

    sput-object v0, Lmf/i;->a:Lmf/i;

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
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation
.end method
