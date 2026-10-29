/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9168..0xad9248 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ad9248;
extern char g_10002b0;

long long sub_ad9168(long long *a0)
{
    long long v4;  // x20
    long long v5;  // w0
    long long v6;  // w0
    char v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a6bffc(8, "crypto/thread/arch/thread_posix.c", 41);
    if (v4)
    {
        _pthread_attr_init(&v0);
        if (!(int)a0[9])
            _pthread_attr_setdetachstate(&v0, 2);
        v5 = (unsigned int)_pthread_create(v4, &v0, &g_ad9248, a0);
        _pthread_attr_destroy(&v0);
        if (v5)
            goto LABEL_ad91f0;
        a0[4] = v4;
        v6 = 1;
    }
    else
    {
LABEL_ad91f0:
        a0[4] = 0;
        sub_a6c2e4(v4, "crypto/thread/arch/thread_posix.c", 59);
        v6 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v6;
    ___stack_chk_fail();
}
