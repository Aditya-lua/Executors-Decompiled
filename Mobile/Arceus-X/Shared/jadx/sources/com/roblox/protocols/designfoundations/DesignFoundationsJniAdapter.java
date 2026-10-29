package com.roblox.protocols.designfoundations;

import androidx.annotation.Keep;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.protocols.designfoundationsplatforminterface.generated.DesignTokens;
import com.roblox.protocols.designfoundationsplatforminterface.generated.IDesignFoundationsCoreListener;
import com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations;
import il.C6819d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;", "Lil/d;", "handler", "<init>", "(Lil/d;)V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;", "colorTokens", "onTokensUpdated", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V", "onTokensCleared", "()V", "Lil/d;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DesignFoundationsJniAdapter extends IPlatformDesignFoundations implements InterfaceC0954f {

    @NotNull
    private final C6819d handler;

    public DesignFoundationsJniAdapter(@NotNull C6819d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        IDesignFoundationsCoreListener.setPlatformImpl(this);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onDestroy(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onDestroy(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }

    @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
    public void onTokensCleared() {
        this.handler.m29193d();
    }

    @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
    public void onTokensUpdated(@NotNull DesignTokens colorTokens) {
        Intrinsics.checkNotNullParameter(colorTokens, "colorTokens");
        this.handler.m29194e(colorTokens);
    }
}
