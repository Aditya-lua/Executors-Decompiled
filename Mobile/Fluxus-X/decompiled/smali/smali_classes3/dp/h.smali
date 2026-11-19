.class public final Ldp/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldp/f$a;


# instance fields
.field public final a:Ldp/g;


# direct methods
.method public constructor <init>(Ldp/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/h;->a:Ldp/g;

    return-void
.end method

.method public static b(Ldp/g;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp/g;",
            ")",
            "Lwt/i<",
            "Ldp/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldp/h;

    invoke-direct {v0, p0}, Ldp/h;-><init>(Ldp/g;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;)Ldp/f;
    .locals 8
    .param p5    # Ldp/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Ldp/h;->a:Ldp/g;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v3, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Ldp/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;)Ldp/f;

    move-result-object p1

    return-object p1
.end method
