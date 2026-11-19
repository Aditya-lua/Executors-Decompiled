.class public Llk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llk/b;->b(Llk/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Llk/b;


# direct methods
.method public constructor <init>(Llk/b;)V
    .locals 0

    iput-object p1, p0, Llk/b$a;->a:Llk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcm/a;->b(Ljava/lang/String;)Lcm/a;

    move-result-object p1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnk/c;->u(Lcm/a;)V

    iget-object v0, p0, Llk/b$a;->a:Llk/b;

    invoke-static {v0, p1}, Llk/b;->a(Llk/b;Lcm/a;)V

    return-void
.end method
