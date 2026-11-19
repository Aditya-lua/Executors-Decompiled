.class public final Lbq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbq/e$a;


# instance fields
.field public final a:Lbq/f;


# direct methods
.method public constructor <init>(Lbq/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq/g;->a:Lbq/f;

    return-void
.end method

.method public static a(Lbq/f;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbq/f;",
            ")",
            "Lwt/i<",
            "Lbq/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbq/g;

    invoke-direct {v0, p0}, Lbq/g;-><init>(Lbq/f;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lbq/e;
    .locals 1

    iget-object v0, p0, Lbq/g;->a:Lbq/f;

    invoke-virtual {v0, p1}, Lbq/f;->b(Ljava/lang/String;)Lbq/e;

    move-result-object p1

    return-object p1
.end method
