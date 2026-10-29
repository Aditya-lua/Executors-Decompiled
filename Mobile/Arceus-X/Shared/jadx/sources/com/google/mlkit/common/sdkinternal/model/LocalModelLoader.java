package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class LocalModelLoader {
    private MappedByteBuffer zza;
    private final Context zzb;
    private final LocalModel zzc;

    public LocalModelLoader(@NonNull Context context, @NonNull LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }

    @NonNull
    public LocalModel getLocalModel() {
        return this.zzc;
    }

    @NonNull
    public MappedByteBuffer load() throws MlKitException {
        C8953m.m36048m(this.zzb, "Context can not be null");
        C8953m.m36048m(this.zzc, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        LocalModel localModel = this.zzc;
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        this.zza = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        channel.close();
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        if (channel == null) {
                            throw th2;
                        }
                        try {
                            channel.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                        throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e);
                    }
                } catch (Throwable th4) {
                    try {
                        randomAccessFile.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (IOException e10) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e10);
            }
        } else if (assetFilePath != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.zzb.getAssets().openFd(assetFilePath);
                try {
                    FileChannel channel2 = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                    try {
                        this.zza = channel2.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                        channel2.close();
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th6) {
                        if (channel2 == null) {
                            throw th6;
                        }
                        try {
                            channel2.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                        throw new MlKitException("Can not load the file from asset: " + assetFilePath + ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression", 14, e);
                    }
                } catch (Throwable th8) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th8;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            } catch (IOException e11) {
                throw new MlKitException("Can not load the file from asset: " + assetFilePath + ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression", 14, e11);
            }
        } else {
            if (uri == null) {
                throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(this.zzb, uri, "r");
                try {
                    FileChannel channel3 = assetFileDescriptorZza.createInputStream().getChannel();
                    try {
                        this.zza = channel3.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorZza.getStartOffset(), assetFileDescriptorZza.getLength());
                        channel3.close();
                        assetFileDescriptorZza.close();
                    } catch (Throwable th10) {
                        if (channel3 == null) {
                            throw th10;
                        }
                        try {
                            channel3.close();
                            throw th10;
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                            throw th10;
                        }
                        throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e);
                    }
                } catch (Throwable th12) {
                    if (assetFileDescriptorZza == null) {
                        throw th12;
                    }
                    try {
                        assetFileDescriptorZza.close();
                        throw th12;
                    } catch (Throwable th13) {
                        th12.addSuppressed(th13);
                        throw th12;
                    }
                }
            } catch (IOException e12) {
                throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e12);
            }
        }
        return this.zza;
    }
}
