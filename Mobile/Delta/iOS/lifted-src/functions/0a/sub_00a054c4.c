/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa054c4..0xa05544 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a054c4(long long a0, long long a1)
{
    unsigned long long v5;  // x0
    char v0;  // [bp-0xb0]
    char v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    sub_a04850(&v1, a0 + 64, a1);
    sub_a04850(&v0, a1 + 64, a0);
    v5 = sub_a08e88(&v1, &v0);
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
