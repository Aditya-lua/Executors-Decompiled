package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class ModelLoader {
    private static final C8935g zza = new C8935g("ModelLoader", "");
    public final LocalModelLoader localModelLoader;

    @NonNull
    protected ModelLoadingState modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
    public final RemoteModelLoader remoteModelLoader;

    @NonNull
    private final ModelLoadingLogger zzb;

    public interface ModelContentHandler {
        void constructModel(@NonNull MappedByteBuffer mappedByteBuffer);
    }

    public interface ModelLoadingLogger {
        void logErrorCodes(@NonNull List<Integer> list);
    }

    public enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    public ModelLoader(RemoteModelLoader remoteModelLoader, LocalModelLoader localModelLoader, @NonNull ModelLoadingLogger modelLoadingLogger) {
        boolean z10 = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z10 = false;
        }
        C8953m.m36037b(z10, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        C8953m.m36047l(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.zzb = modelLoadingLogger;
    }

    private final String zza() {
        LocalModelLoader localModelLoader = this.localModelLoader;
        String string = null;
        if (localModelLoader != null) {
            if (localModelLoader.getLocalModel().getAssetFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAssetFilePath();
            } else if (this.localModelLoader.getLocalModel().getAbsoluteFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAbsoluteFilePath();
            } else if (this.localModelLoader.getLocalModel().getUri() != null) {
                string = ((Uri) C8953m.m36047l(this.localModelLoader.getLocalModel().getUri())).toString();
            }
        }
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        return String.format("Local model path: %s. Remote model name: %s. ", string, remoteModelLoader == null ? "unspecified" : remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist());
    }

    private final synchronized boolean zzb(ModelContentHandler modelContentHandler, List list) {
        MappedByteBuffer mappedByteBufferLoad;
        LocalModelLoader localModelLoader = this.localModelLoader;
        if (localModelLoader == null || (mappedByteBufferLoad = localModelLoader.load()) == null) {
            return false;
        }
        try {
            modelContentHandler.constructModel(mappedByteBufferLoad);
            zza.m36002b("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e10) {
            list.add(18);
            throw e10;
        }
    }

    private final synchronized boolean zzc(ModelContentHandler modelContentHandler, List list) {
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        if (remoteModelLoader != null) {
            try {
                MappedByteBuffer mappedByteBufferLoad = remoteModelLoader.load();
                if (mappedByteBufferLoad != null) {
                    try {
                        modelContentHandler.constructModel(mappedByteBufferLoad);
                        zza.m36002b("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e10) {
                        list.add(19);
                        throw e10;
                    }
                }
                zza.m36002b("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(21);
            } catch (MlKitException e11) {
                zza.m36002b("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(20);
                throw e11;
            }
        }
        return false;
    }

    public synchronized boolean isRemoteModelLoaded() {
        return this.modelLoadingState == ModelLoadingState.REMOTE_MODEL_LOADED;
    }

    public synchronized void loadWithModelContentHandler(@NonNull ModelContentHandler modelContentHandler) {
        Exception exc;
        boolean zZzc;
        ArrayList arrayList = new ArrayList();
        boolean zZzb = false;
        Exception e10 = null;
        try {
            zZzc = zzc(modelContentHandler, arrayList);
            exc = null;
        } catch (Exception e11) {
            exc = e11;
            zZzc = false;
        }
        if (zZzc) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            zZzb = zzb(modelContentHandler, arrayList);
        } catch (Exception e12) {
            e10 = e12;
        }
        if (zZzb) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.zzb.logErrorCodes(arrayList);
        this.modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
        if (exc != null) {
            throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(zza())), 14, exc);
        }
        if (e10 == null) {
            throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(zza())), 14);
        }
        throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(zza())), 14, e10);
    }
}
