/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8a94..0xaf8b00 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_af8a94(long long a0)
{
    unsigned long long v4;  // x0
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_af0158(&v0);
    if ((unsigned int)v4)
        v4 = sub_af8764(a0, &v0, (int)v4);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
