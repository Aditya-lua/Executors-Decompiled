.class public Ldl/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldw/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldl/c;->a()Lmv/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldl/c;


# direct methods
.method public constructor <init>(Ldl/c;)V
    .locals 0

    iput-object p1, p0, Ldl/c$a;->a:Ldl/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rbx.http"

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
