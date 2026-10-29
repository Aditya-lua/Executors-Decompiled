.class public Lfk/a$a;
.super Lei/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfk/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfk/a;


# direct methods
.method public constructor <init>(Lfk/a;)V
    .locals 0

    iput-object p1, p0, Lfk/a$a;->a:Lfk/a;

    invoke-direct {p0}, Lei/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 1

    iget-object v0, p0, Lfk/a$a;->a:Lfk/a;

    invoke-static {v0}, Lfk/a;->a(Lfk/a;)Lei/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfk/a$a;->a:Lfk/a;

    invoke-static {v0}, Lfk/a;->a(Lfk/a;)Lei/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lei/m;->a(Lei/j;)V

    :cond_0
    return-void
.end method
