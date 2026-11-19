.class public final Lwt/g$b;
.super Lwt/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwt/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lwt/a$a<",
        "TK;TV;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lwt/a$a;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILwt/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwt/g$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Lwt/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwt/g<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lwt/g;

    iget-object v1, p0, Lwt/a$a;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwt/g;-><init>(Ljava/util/Map;Lwt/g$a;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;Lwt/i;)Lwt/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lwt/i<",
            "TV;>;)",
            "Lwt/g$b<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lwt/a$a;->a(Ljava/lang/Object;Lwt/i;)Lwt/a$a;

    return-object p0
.end method
