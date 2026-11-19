.class public Lmi/q;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lmi/j;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lmi/j;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:[Lmi/c$a;

.field public e:Ljava/lang/String;

.field public f:Lmi/m;

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Lmi/m;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lmi/q;-><init>(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Lmi/m;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Lmi/m;Ljava/lang/String;)V
    .locals 8

    const/4 v6, -0x1

    const/4 v7, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v7}, Lmi/q;-><init>(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Lmi/m;Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Lmi/m;Ljava/lang/String;II)V
    .locals 1

    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lmi/q;->g:I

    .line 5
    iput v0, p0, Lmi/q;->h:I

    .line 6
    iput-object p4, p0, Lmi/q;->f:Lmi/m;

    .line 7
    iput-object p1, p0, Lmi/q;->b:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lmi/q;->c:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lmi/q;->d:[Lmi/c$a;

    .line 10
    iput-object p5, p0, Lmi/q;->e:Ljava/lang/String;

    if-nez p2, :cond_0

    .line 11
    const-string p1, ""

    iput-object p1, p0, Lmi/q;->c:Ljava/lang/String;

    .line 12
    :cond_0
    iput p6, p0, Lmi/q;->g:I

    .line 13
    iput p7, p0, Lmi/q;->h:I

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lmi/j;
    .locals 6

    iget-object v0, p0, Lmi/q;->b:Ljava/lang/String;

    iget-object v1, p0, Lmi/q;->c:Ljava/lang/String;

    iget-object v2, p0, Lmi/q;->d:[Lmi/c$a;

    iget-object v3, p0, Lmi/q;->e:Ljava/lang/String;

    iget v4, p0, Lmi/q;->g:I

    iget v5, p0, Lmi/q;->h:I

    invoke-static/range {v0 .. v5}, Lmi/c;->l(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Ljava/lang/String;II)Lmi/j;

    move-result-object p1

    iput-object p1, p0, Lmi/q;->a:Lmi/j;

    return-object p1
.end method

.method public b(Lmi/j;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    iget-object p1, p0, Lmi/q;->f:Lmi/m;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lmi/q;->a:Lmi/j;

    invoke-interface {p1, v0}, Lmi/m;->a(Lmi/j;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lmi/q;->a([Ljava/lang/Void;)Lmi/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lmi/j;

    invoke-virtual {p0, p1}, Lmi/q;->b(Lmi/j;)V

    return-void
.end method
