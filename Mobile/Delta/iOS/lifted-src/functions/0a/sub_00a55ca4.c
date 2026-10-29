/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55ca4..0xa55d0c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a55ca4(void)
{
    long long v4;  // x0
    unsigned long long v5;  // x0
    char v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_975ff4();
    sub_b0c984(&v0);
    v5 = sub_b0ca28(v4, &v0);
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
