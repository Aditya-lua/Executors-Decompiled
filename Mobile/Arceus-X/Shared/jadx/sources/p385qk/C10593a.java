package p385qk;

import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: renamed from: qk.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10593a extends PlatformParams {
    public boolean isLuaChatEnabled;
    public boolean isLuaGamesPageEnabled;
    public boolean isLuaHomePageEnabled;
    public boolean isTablet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10593a() {
        this(null);
    }

    @Override // com.roblox.engine.jni.model.PlatformParams
    /* JADX INFO: renamed from: a */
    public void mo15828a(PlatformParams platformParams) {
        super.mo15828a(platformParams);
        if (platformParams instanceof C10593a) {
            m40619b((C10593a) platformParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40619b(C10593a c10593a) {
        this.isLuaHomePageEnabled = c10593a.isLuaHomePageEnabled;
        this.isLuaGamesPageEnabled = c10593a.isLuaGamesPageEnabled;
        this.isLuaChatEnabled = c10593a.isLuaChatEnabled;
        this.isTablet = c10593a.isTablet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10593a(PlatformParams platformParams) {
        mo15828a(platformParams);
    }
}
