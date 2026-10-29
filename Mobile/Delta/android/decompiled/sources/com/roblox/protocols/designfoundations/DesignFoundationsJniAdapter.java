package com.roblox.protocols.designfoundations;

import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.protocols.designfoundationsplatforminterface.generated.DesignTokens;
import com.roblox.protocols.designfoundationsplatforminterface.generated.IDesignFoundationsCoreListener;
import com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations;
import il.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;", "Lil/d;", "handler", "<init>", "(Lil/d;)V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;", "colorTokens", "onTokensUpdated", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V", "onTokensCleared", "()V", "Lil/d;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DesignFoundationsJniAdapter extends IPlatformDesignFoundations implements f {

    @NotNull
    private final d handler;

    public DesignFoundationsJniAdapter(@NotNull d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        IDesignFoundationsCoreListener.setPlatformImpl(this);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onDestroy(@NotNull s sVar) {
        super.onDestroy(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
    public void onTokensCleared() {
        this.handler.d();
    }

    @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
    public void onTokensUpdated(@NotNull DesignTokens colorTokens) {
        Intrinsics.checkNotNullParameter(colorTokens, "colorTokens");
        this.handler.e(colorTokens);
    }
}
