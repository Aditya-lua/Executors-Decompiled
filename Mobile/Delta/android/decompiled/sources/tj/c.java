package tj;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    HOME("HOME_TAG"),
    GAMES("GAMES_TAG"),
    AVATAR("AVATAR_EDITOR_TAG"),
    MORE("MORE_TAG"),
    GAME_DETAILS("GAME_DETAILS_TAG", new String[]{"gameId"}),
    PROFILE("PROFILE_TAG", new String[]{"userId"}),
    CATALOG("CATALOG_TAG"),
    FRIENDS("FRIENDS_TAG"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31845a;
    public final String[] b;

    c(String str, String[] strArr) {
        this.f31845a = str;
        this.b = strArr;
    }

    public String b() {
        return this.f31845a;
    }

    public int c() {
        return this.b.length;
    }

    public String[] d() {
        return this.b;
    }

    c(String str) {
        this(str, new String[0]);
    }
}
