/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd97c0..0xbd989c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd97c0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
} st_bd97c0_0;


double sub_bd97c0(st_bd97c0_0 *a0, long long a1, long long a2, unsigned int a3)
{
    uint128_t v0;  // [bp-0xc8]
    uint576_t v1;  // [bp-0xb8], Other Possible Types: unsigned long long
    char v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    sub_bd972c(&v2);
    sub_bd972c(&v4, a1, a2);
    v0 = CONCAT(4, 0);
    *((char *)&v1 + 8) = v2;
    *(uint128_t *)((char *)&v1 + 24) = v3;
    *(uint128_t *)((char *)&v1 + 40) = v4;
    *(uint128_t *)((char *)&v1 + 56) = v5;
    v1 = 0;
    sub_c6c494(&v0);
    v1 = _INSERT(CONCAT(v1, 0), 0, 1);
    a0->field_20 = *(uint128_t *)((void*)&v1 + 16);
    a0->field_30 = *(uint128_t *)((void*)&v1 + 32);
    *(unsigned int *)*(unsigned long long *)((void*)&v0 + 8) = a3;
    a0->field_40 = *(uint128_t *)((void*)&v1 + 48);
    a0->field_50 = *(unsigned long long *)((void*)&v1 + 64);
    a0->field_0 = v0;
    a0->field_10 = *(uint128_t *)&v1;
    return *(unsigned long long *)&v0;
}
