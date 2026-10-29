/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa1e88..0xaa1f08 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_aa1e88(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, uint128_t *a5, unsigned long a6)
{
    unsigned int v6;  // w0
    char v0;  // [bp-0x88]
    uint128_t v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = sub_a59470();
    if (v6)
    {
        *a5 = v1;
        a5[1] = v2;
        sub_a66ec0(&v0, 96);
        v6 = 1;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
