/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9324..0xad9384 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad9324(void)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(64, "crypto/thread/arch/thread_posix.c", 100);
    if (!v2)
    {
        return v2;
    }
    else if (_pthread_mutex_init())
    {
        sub_a6c2e4(v2, "crypto/thread/arch/thread_posix.c", 103);
        return 0;
    }
    else
    {
        return v2;
    }
}
