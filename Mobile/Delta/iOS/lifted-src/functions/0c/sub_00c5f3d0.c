/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f3d0..0xc5f46c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd110;

double sub_c5f3d0(void* a0)
{
    uint128_t v6;  // q0
    uint128_t v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x40]
    uint128_t v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (*(long long *)a0 == 0x8000000000000000)
    {
        v2 = CONCAT(1, 0);
        v3 = 0;
        sub_be769c(&v2, &g_efd110, *(long long *)*(long long *)(long long)a0[24], *(long long *)(*(long long *)(long long)a0[24] + 8));
        v6 = v2;
        v0 = v6;
        v1 = v3;
        *(uint128_t *)a0 = v6;
        *(unsigned long long *)&a0[16] = v3;
    }
    return *(unsigned long long *)&v6;
}
