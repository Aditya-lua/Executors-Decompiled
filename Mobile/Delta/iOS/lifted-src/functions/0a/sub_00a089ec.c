/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa089ec..0xa08a54 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a089ec(uint128_t *a0)
{
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x30]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v0 = *a0;
    v1 = a0[1];
    v2 = a0[2];
    v3 = a0[3];
    sub_a085fc(&v0);
    if (*(long long *)&g_10002b0 == v4)
        return -(*(unsigned long long *)&v0 & 1);
    ___stack_chk_fail();
}
