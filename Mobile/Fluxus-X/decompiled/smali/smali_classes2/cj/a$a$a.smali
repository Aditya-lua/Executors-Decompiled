.class public Lcj/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llk/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcj/a$a;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcj/a$a;


# direct methods
.method public constructor <init>(Lcj/a$a;)V
    .locals 0

    iput-object p1, p0, Lcj/a$a$a;->a:Lcj/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcm/a;)V
    .locals 1

    iget-object p1, p0, Lcj/a$a$a;->a:Lcj/a$a;

    iget-object p1, p1, Lcj/a$a;->a:Lcj/a;

    const-string v0, "UserSelectedTheme"

    invoke-virtual {p1, v0}, Lnh/d;->d(Ljava/lang/String;)V

    return-void
.end method
