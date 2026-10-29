package qk;

import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public class a extends PlatformParams {
    public boolean isLuaChatEnabled;
    public boolean isLuaGamesPageEnabled;
    public boolean isLuaHomePageEnabled;
    public boolean isTablet;

    public a() {
        this(null);
    }

    @Override // com.roblox.engine.jni.model.PlatformParams
    public void a(PlatformParams platformParams) {
        super.a(platformParams);
        if (platformParams instanceof a) {
            b((a) platformParams);
        }
    }

    public final void b(a aVar) {
        this.isLuaHomePageEnabled = aVar.isLuaHomePageEnabled;
        this.isLuaGamesPageEnabled = aVar.isLuaGamesPageEnabled;
        this.isLuaChatEnabled = aVar.isLuaChatEnabled;
        this.isTablet = aVar.isTablet;
    }

    public a(PlatformParams platformParams) {
        a(platformParams);
    }
}
