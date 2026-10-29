package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Pools {

    public interface Pool<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t8);
    }

    private Pools() {
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int maxPoolSize) {
            if (maxPoolSize <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[maxPoolSize];
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i10 = this.mPoolSize;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            Object[] objArr = this.mPool;
            T t8 = (T) objArr[i11];
            objArr[i11] = null;
            this.mPoolSize = i10 - 1;
            return t8;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T instance) {
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i10 < objArr.length) {
                objArr[i10] = instance;
                this.mPoolSize = i10 + 1;
                return true;
            }
            return false;
        }

        private boolean isInPool(@NonNull T instance) {
            for (int i10 = 0; i10 < this.mPoolSize; i10++) {
                if (this.mPool[i10] == instance) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int maxPoolSize) {
            super(maxPoolSize);
            this.mLock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t8;
            synchronized (this.mLock) {
                t8 = (T) super.acquire();
            }
            return t8;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@NonNull T element) {
            boolean zRelease;
            synchronized (this.mLock) {
                zRelease = super.release(element);
            }
            return zRelease;
        }
    }
}
