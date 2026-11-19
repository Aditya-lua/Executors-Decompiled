.class public final synthetic Ld6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ld6/b;

.field public final synthetic b:Ld6/b$a$a;


# direct methods
.method public synthetic constructor <init>(Ld6/b;Ld6/b$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/a;->a:Ld6/b;

    iput-object p2, p0, Ld6/a;->b:Ld6/b$a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ld6/a;->a:Ld6/b;

    iget-object v1, p0, Ld6/a;->b:Ld6/b$a$a;

    invoke-static {v0, v1}, Ld6/b$a;->m(Ld6/b;Ld6/b$a$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
