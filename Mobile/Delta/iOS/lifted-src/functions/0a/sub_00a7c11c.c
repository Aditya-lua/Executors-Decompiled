/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7c11c..0xa7c17c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a7c11c(void)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(200, "crypto/threads_pthread.c", 626);
    if (!v2)
    {
        return v2;
    }
    else if (_pthread_rwlock_init())
    {
        sub_a6c2e4(v2, "crypto/threads_pthread.c", 631);
        return 0;
    }
    else
    {
        return v2;
    }
}
