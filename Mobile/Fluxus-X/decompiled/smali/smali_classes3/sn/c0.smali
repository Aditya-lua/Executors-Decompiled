.class public final Lsn/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a0$a;


# instance fields
.field public final a:Lsn/b0;


# direct methods
.method public constructor <init>(Lsn/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/c0;->a:Lsn/b0;

    return-void
.end method

.method public static b(Lsn/b0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/b0;",
            ")",
            "Lwt/i<",
            "Lsn/a0$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsn/c0;

    invoke-direct {v0, p0}, Lsn/c0;-><init>(Lsn/b0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;
    .locals 1

    iget-object v0, p0, Lsn/c0;->a:Lsn/b0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsn/b0;->b(Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;

    move-result-object p1

    return-object p1
.end method
