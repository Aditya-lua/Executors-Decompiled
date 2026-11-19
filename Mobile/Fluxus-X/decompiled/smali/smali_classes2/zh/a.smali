.class public Lzh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lzh/e;

.field public c:I


# direct methods
.method public constructor <init>(Lzh/e;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.appshell"

    iput-object v0, p0, Lzh/a;->a:Ljava/lang/String;

    iput-object p1, p0, Lzh/a;->b:Lzh/e;

    iput p2, p0, Lzh/a;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lwk/c;
    .locals 1

    new-instance v0, Lwk/d;

    invoke-direct {v0, p1}, Lwk/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(J)Lwk/b;
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lwk/b;

    const-string v0, "Chat"

    const-string v1, "AppShellNotifications"

    const-string v2, "StartConversationWithId"

    invoke-direct {p2, v1, p1, v2, v0}, Lwk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public c(J)Lwk/b;
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lwk/b;

    const-string v0, "Chat"

    const-string v1, "AppShellNotifications"

    const-string v2, "StartConversationWithUserId"

    invoke-direct {p2, v1, p1, v2, v0}, Lwk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public d()Lei/a;
    .locals 2

    iget-object v0, p0, Lzh/a;->b:Lzh/e;

    invoke-virtual {p0}, Lzh/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lzh/e;->r(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    instance-of v1, v0, Lei/a;

    if-eqz v1, :cond_0

    check-cast v0, Lei/a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const-class v0, Lzh/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v0

    invoke-virtual {v0}, Lei/f;->r()V

    const/4 v0, 0x1

    return v0
.end method

.method public g(Lzh/c;)V
    .locals 4

    invoke-virtual {p0}, Lzh/a;->d()Lei/a;

    move-result-object v0

    const-string v1, "rbx.appshell"

    if-nez v0, :cond_0

    const-string v0, "onShow: Create a GL fragment for LuaApp..."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lei/a;

    invoke-direct {v0}, Lei/a;-><init>()V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onShow: ... state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", IsLoggedIn = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v3

    invoke-virtual {v3}, Ldj/h;->f()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v1

    invoke-virtual {v1}, Ldj/h;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lzh/a;->i(Lzh/c;)V

    :cond_1
    iget-object p1, p0, Lzh/a;->b:Lzh/e;

    iget v1, p0, Lzh/a;->c:I

    invoke-virtual {p0}, Lzh/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v0, v2}, Lzh/e;->v(ILf4/q;Ljava/lang/String;)V

    return-void
.end method

.method public h(Lwk/c;)V
    .locals 1

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lei/f;->A(Lwk/c;)V

    return-void
.end method

.method public i(Lzh/c;)V
    .locals 8

    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHAT_TAG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "rbx.appshell"

    if-eqz v0, :cond_1

    const-string v0, "sendAppEvents() start chat"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Chat"

    invoke-virtual {p0, v0}, Lzh/a;->a(Ljava/lang/String;)Lwk/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzh/a;->h(Lwk/c;)V

    const-string v0, "USER_ID_EXTRA"

    const-wide/16 v2, -0x1

    invoke-virtual {p1, v0, v2, v3}, Lzh/c;->f(Ljava/lang/String;J)J

    move-result-wide v4

    const-string v0, "CHAT_CONVERSATION_ID"

    invoke-virtual {p1, v0, v2, v3}, Lzh/c;->f(Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long p1, v4, v2

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendAppEvents() userId:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v4, v5}, Lzh/a;->c(J)Lwk/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzh/a;->j(Lwk/b;)V

    return-void

    :cond_0
    cmp-long p1, v6, v2

    if-eqz p1, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendAppEvents() conversationId:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v6, v7}, Lzh/a;->b(J)Lwk/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzh/a;->j(Lwk/b;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AVATAR_EDITOR_TAG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "sendAppEvents() start avatar"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "AvatarEditor"

    invoke-virtual {p0, p1}, Lzh/a;->a(Ljava/lang/String;)Lwk/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzh/a;->h(Lwk/c;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "HOME_TAG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "sendAppEvents() start home"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Home"

    invoke-virtual {p0, p1}, Lzh/a;->a(Ljava/lang/String;)Lwk/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzh/a;->h(Lwk/c;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GAMES_TAG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "sendAppEvents() start games"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Games"

    invoke-virtual {p0, p1}, Lzh/a;->a(Ljava/lang/String;)Lwk/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzh/a;->h(Lwk/c;)V

    :cond_4
    return-void
.end method

.method public j(Lwk/b;)V
    .locals 1

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lei/f;->C(Lwk/b;)V

    return-void
.end method
