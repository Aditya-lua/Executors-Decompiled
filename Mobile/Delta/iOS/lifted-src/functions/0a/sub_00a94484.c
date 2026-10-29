/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94484..0xa94558 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_a94484(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, uint128_t *a4, unsigned long a5, unsigned long a6, unsigned long long *a7)
{
    uint128_t v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a2)
    {
        v0 = *a4;
        a7();
    }
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
