.class public Lti/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti/a;->a(Lsh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsh/a;

.field public final synthetic b:Lti/a;


# direct methods
.method public constructor <init>(Lti/a;Lsh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lti/a$a;->b:Lti/a;

    iput-object p2, p0, Lti/a$a;->a:Lsh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkk/d;)V
    .locals 0

    iget-object p1, p0, Lti/a$a;->a:Lsh/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lsh/a;->a()V

    :cond_0
    return-void
.end method
