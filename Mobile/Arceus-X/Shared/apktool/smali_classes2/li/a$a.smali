.class public Lli/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lck/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lli/a;->a(Ljh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljh/a;

.field public final synthetic b:Lli/a;


# direct methods
.method public constructor <init>(Lli/a;Ljh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lli/a$a;->b:Lli/a;

    iput-object p2, p0, Lli/a$a;->a:Ljh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lck/d;)V
    .locals 0

    iget-object p1, p0, Lli/a$a;->a:Ljh/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljh/a;->a()V

    :cond_0
    return-void
.end method
