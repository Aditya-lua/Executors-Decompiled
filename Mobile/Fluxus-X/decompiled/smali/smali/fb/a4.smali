.class public final Lfb/a4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfb/e4;

.field public final b:Lfb/e4;


# direct methods
.method public constructor <init>(Lfb/e4;Lfb/e4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/a4;->a:Lfb/e4;

    iput-object p2, p0, Lfb/a4;->b:Lfb/e4;

    return-void
.end method


# virtual methods
.method public final a()Lfb/e4;
    .locals 1

    iget-object v0, p0, Lfb/a4;->a:Lfb/e4;

    return-object v0
.end method

.method public final b()Lfb/e4;
    .locals 1

    iget-object v0, p0, Lfb/a4;->b:Lfb/e4;

    return-object v0
.end method
