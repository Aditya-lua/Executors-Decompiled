/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bdae0..0x1bdbd0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bdae0_1 {
    unsigned long long field_0;
    struct st_1bdae0_1 *field_8;
    unsigned int field_10;
    char padding_14[4];
    uint128_t field_18;
    unsigned int field_28;
} st_1bdae0_1;

typedef struct st_1bdae0_2 {
    char padding_0[8];
    uint128_t field_8;
    unsigned int field_18;
    char padding_1c[28];
    struct st_1bdae0_1 *field_38;
} st_1bdae0_2;

typedef struct st_1bdae0_0 {
    char field_0;
} st_1bdae0_0;

extern unsigned long long g_e6fc38;
extern unsigned long long g_e6fc68;
extern unsigned long long g_e6fca8;

double sub_1bdae0(st_1bdae0_2 *a0, unsigned int a1)
{
    unsigned long v4;  // x8
    st_1bdae0_1 *v5;  // x0
    st_1bdae0_1 *v6;  // x8
    st_1bdae0_1 *v7;  // x10
    unsigned long v8;  // d0
    st_1bdae0_1 *v9;  // x0
    st_1bdae0_1 *v10;  // x8
    unsigned long long v11;  // x9
    st_1bdae0_1 *v12;  // x21
    uint128_t v13;  // q0
    st_1bdae0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bdae0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(int *)((char *)&a0->field_8 + 8);
    if (!(v4 & 1))
    {
        if (!(v4 >> 3 & 1))
        {
            v5 = operatornew(24);
            v6 = *(long long *)&a0->padding_1c[20];
            v7 = v6->field_8;
            v5->field_0 = &g_e6fca8;
            v5->field_8 = v7;
            v5->field_10 = a1;
            v6->field_8 = v5;
            *(st_1bdae0_1 **)&a0->padding_1c[20] = v5;
            return v8;
        }
        v9 = operatornew(48);
        v10 = *(long long *)(*(long long *)&a0->padding_1c[20] + 8);
        v11 = &g_e6fc68;
    }
    else
    {
        v9 = operatornew(48);
        v10 = *(long long *)(*(long long *)&a0->padding_1c[20] + 8);
        v11 = &g_e6fc38;
    }
    v12 = v9;
    v9->field_0 = v11 + 16;
    v9->field_8 = v10;
    std::__1::locale::locale(&v9->field_10, a0);
    v13 = *(int128_t *)(a0->padding_0)[1];
    *(uint128_t *)(v12->padding_14)[1] = v13;
    *(unsigned int *)((char *)&v12->field_18 + 8) = a1;
    *(st_1bdae0_1 **)(*(long long *)&a0->padding_1c[20] + 8) = v12;
    *(st_1bdae0_1 **)&a0->padding_1c[20] = v12;
    return (unsigned long long)v13;
}
