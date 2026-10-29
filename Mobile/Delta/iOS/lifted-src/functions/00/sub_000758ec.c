/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x758ec..0x75958 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_758ec(long long a0)
{
    unsigned long long v4;  // x0
    char v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    sub_1e524(&v0);
    sub_721d4(&v0, a0 + 352);
    v4 = sub_181a8(&v0);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
