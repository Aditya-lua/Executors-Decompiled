.class public final Lnb/c9;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/c9;->e:Lnb/qa;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lnb/c9;->e:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->x0()V

    return-void
.end method
