.class public Lnk/a$a;
.super Lmi/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnk/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnk/a;


# direct methods
.method public constructor <init>(Lnk/a;)V
    .locals 0

    iput-object p1, p0, Lnk/a$a;->a:Lnk/a;

    invoke-direct {p0}, Lmi/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lmi/j;)V
    .locals 1

    iget-object v0, p0, Lnk/a$a;->a:Lnk/a;

    invoke-static {v0}, Lnk/a;->a(Lnk/a;)Lmi/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnk/a$a;->a:Lnk/a;

    invoke-static {v0}, Lnk/a;->a(Lnk/a;)Lmi/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lmi/m;->a(Lmi/j;)V

    :cond_0
    return-void
.end method
