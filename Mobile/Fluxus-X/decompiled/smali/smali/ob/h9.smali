.class public final Lob/h9;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/h9;->e:Lob/va;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lob/h9;->e:Lob/va;

    invoke-virtual {v0}, Lob/va;->x0()V

    return-void
.end method
