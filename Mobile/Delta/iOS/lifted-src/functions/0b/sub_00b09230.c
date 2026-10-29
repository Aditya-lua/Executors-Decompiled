/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09230..0xb09314 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b09230_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[96];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[227];
    unsigned long long field_1a4;
    unsigned int field_1ac;
    char padding_1b0[320];
    unsigned long long field_2f0;
    unsigned int field_2f8;
    char padding_2fc[52];
    char field_330;
    char padding_331[15];
    unsigned long long field_340;
} st_b09230_0;

extern char g_10002b0;

double sub_b09230(st_b09230_0 *a0)
{
    unsigned long v6;  // d0
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x34]
    unsigned int v2;  // [bp-0x2c]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = 0;
    *(uint128_t *)&a0->padding_2fc[28] = 0;
    a0->padding_2fc[44] = a0->padding_2fc[44] & 252;
    *(unsigned long long *)&a0->padding_331[7] = 0xffffffffffffffff;
    v1 = a0->field_0;
    v2 = a0->field_8;
    if (!(a0->field_6c >> 1 & 1))
        sub_b07c28(&a0->field_c0, 0, 0, &v0, 16, 0);
    else
        sub_b07ac0(&a0->field_c0, 0, 0, &v0, 16, 0);
    v6 = *(unsigned long *)&(a0->padding_c1)[1];
    *(unsigned long *)&a0->padding_1b0[316] = v6;
    *(int *)&a0->field_2f0 = *(int *)((char *)&a0->field_1a4 + 4);
    a0->field_6c = a0->field_6c | 4;
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
