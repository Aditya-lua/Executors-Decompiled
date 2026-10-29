package tj;

import androidx.core.os.EnvironmentCompat;

/* JADX INFO: renamed from: tj.c */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC11664c {
    HOME("HOME_TAG"),
    GAMES("GAMES_TAG"),
    AVATAR("AVATAR_EDITOR_TAG"),
    MORE("MORE_TAG"),
    GAME_DETAILS("GAME_DETAILS_TAG", new String[]{"gameId"}),
    PROFILE("PROFILE_TAG", new String[]{"userId"}),
    CATALOG("CATALOG_TAG"),
    FRIENDS("FRIENDS_TAG"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);


    /* JADX INFO: renamed from: a */
    public final String f41246a;

    /* JADX INFO: renamed from: b */
    public final String[] f41247b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC11664c(String str, String[] strArr) {
        this.f41246a = str;
        this.f41247b = strArr;
    }

    /* JADX INFO: renamed from: b */
    public String m43806b() {
        return this.f41246a;
    }

    /* JADX INFO: renamed from: c */
    public int m43807c() {
        return this.f41247b.length;
    }

    /* JADX INFO: renamed from: d */
    public String[] m43808d() {
        return this.f41247b;
    }

    EnumC11664c(String str) {
        this(str, new String[0]);
    }
}
