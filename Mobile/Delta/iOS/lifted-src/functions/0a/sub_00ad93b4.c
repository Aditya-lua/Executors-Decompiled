/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad93b4..0xad93e4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_ad93b4(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!_pthread_mutex_unlock())
        return;
    sub_a69928("assertion failed: rc == 0", "crypto/thread/arch/thread_posix.c", 138);
}
