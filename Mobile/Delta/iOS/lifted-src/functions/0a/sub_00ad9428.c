/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9428..0xad9488 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad9428(void)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/thread/arch/thread_posix.c", 159);
    if (!v2)
    {
        return v2;
    }
    else if (_pthread_cond_init())
    {
        sub_a6c2e4(v2, "crypto/thread/arch/thread_posix.c", 162);
        return 0;
    }
    else
    {
        return v2;
    }
}
