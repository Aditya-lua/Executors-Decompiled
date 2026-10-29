.class public Lui/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldk/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui/a$a;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lui/a$a;


# direct methods
.method public constructor <init>(Lui/a$a;)V
    .locals 0

    iput-object p1, p0, Lui/a$a$a;->a:Lui/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lol/a;)V
    .locals 1

    iget-object p1, p0, Lui/a$a$a;->a:Lui/a$a;

    iget-object p1, p1, Lui/a$a;->a:Lui/a;

    const-string v0, "UserSelectedTheme"

    invoke-virtual {p1, v0}, Leh/d;->d(Ljava/lang/String;)V

    return-void
.end method
