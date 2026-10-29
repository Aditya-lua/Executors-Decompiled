/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61ba0..0xc61c14 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61ba0_0 {
    uint128_t field_0;
    char field_d;
} st_c61ba0_0;

typedef struct st_c61ba0_2 {
    char field_0[21];
    char field_d;
} st_c61ba0_2;

typedef struct st_c61ba0_1 {
    char padding_0[56];
    long long field_38;
    char padding_40[1164];
    uint128_t field_4cc;
    char field_4d9;
} st_c61ba0_1;


void sub_c61ba0(st_c61ba0_1 *a0, unsigned long a1, st_c61ba0_0 *a2, unsigned long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_c61ba0_2 *v17;  // x8
    uint128_t v18;  // q0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a2)
    {
        sub_97b0c0();
        v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        if (!(v16 & 1))
        {
            v17 = (a0->padding_40)[1];
            v18 = a2->field_0;
            *(long long *)&v17->field_0[13] = *(long long *)((char *)&a2->field_0 + 13);
            *(uint128_t *)&v17->field_0[0] = v18;
        }
    }
}
