.class public final Lga/r;
.super Lfb/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lga/c;


# direct methods
.method public constructor <init>(Lga/c;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lga/r;->b:Lga/c;

    invoke-direct {p0}, Lfb/c;-><init>()V

    return-void
.end method
