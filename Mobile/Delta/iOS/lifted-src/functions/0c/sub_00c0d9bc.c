/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d9bc..0xc0da40 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d9bc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    unsigned long long field_28;
} st_c0d9bc_0;


double sub_c0d9bc(st_c0d9bc_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v9;  // x10
    uint128_t v10;  // q0
    uint128_t v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x60]
    char v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    uint128_t v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    sub_c0d518(&v2, a3, a1, a2);
    v9 = v2;
    if (v9 == 1)
    {
        v10 = v5;
        v0 = v10;
        *(uint128_t *)&(&a0->field_10)[1] = v10;
    }
    else
    {
        v9 = 0;
        v10 = v5;
        v0 = v10;
        v1 = v6;
        *(uint128_t *)&(&a0->field_10)[1] = v10;
        *(unsigned long long *)((char *)&a0->field_18 + 8) = v6;
    }
    a0->field_8 = v3;
    a0->field_10 = v4;
    a0->field_0 = v9;
    return (unsigned long long)v10;
}
