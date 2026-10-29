/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc412ac..0xc412e4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd6d0;

void sub_c412ac(void)
{
    unsigned int v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = _pthread_mutexattr_destroy();
    if (!v0)
        return;
    sub_c76cd8(&v0, 0, &g_efd6d0);
}
