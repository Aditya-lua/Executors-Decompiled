.class public final Lnb/o7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lnb/o7;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/o7;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/o7;->c:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/o7;->d:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lnb/o7;->d:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-object v1, p0, Lnb/o7;->a:Ljava/lang/String;

    iget-object v2, p0, Lnb/o7;->b:Ljava/lang/String;

    iget-object v3, p0, Lnb/o7;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lnb/t;->D0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
