.class public final Ln2/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[Ln2/e$d;


# direct methods
.method public constructor <init>([Ln2/e$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln2/e$c;->a:[Ln2/e$d;

    return-void
.end method


# virtual methods
.method public a()[Ln2/e$d;
    .locals 1

    iget-object v0, p0, Ln2/e$c;->a:[Ln2/e$d;

    return-object v0
.end method
