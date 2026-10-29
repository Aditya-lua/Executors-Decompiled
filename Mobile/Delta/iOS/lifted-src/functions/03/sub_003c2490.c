/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c2490..0x3c25bc (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c2490_2 {
    char field_0;
    char padding_1[163];
    char field_a4;
    char padding_a5[91];
    char field_100;
} st_3c2490_2;

typedef struct st_3c2490_3 {
    char padding_0[216];
    struct st_3c2490_2 *field_d8;
    struct st_3c2490_0 *field_e0;
    char field_e8;
    char padding_e9[255];
    char field_1e8;
} st_3c2490_3;

typedef struct st_3c2490_0 {
    char field_0;
} st_3c2490_0;

typedef struct st_3c2490_1 {
    char padding_0[272];
    struct st_3c2490_2 *field_110;
} st_3c2490_1;

extern st_3c2490_1 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_3c2490(st_3c2490_3 *a0)
{
    unsigned long long v21;  // x8
    char *v22;  // x10
    unsigned int v31;  // w8
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4102
    char *v23;  // x9
    unsigned long v24;  // x14
    unsigned long v25;  // x8
    unsigned int v26;  // w9
    unsigned int v27;  // w8
    unsigned long v28;  // cc_dep1
    unsigned long long v29;  // w0
    unsigned int v30;  // w8
    st_3c2490_0 **v0;  // [bp-0x140], Other Possible Types: char
    st_3c2490_0 *v1;  // [bp-0x138]
    unsigned long long v2;  // [bp-0x130]
    unsigned long long v3;  // [bp-0x120]
    unsigned long long v4;  // [bp-0x110]
    unsigned long long v5;  // [bp-0x100]
    unsigned long long v6;  // [bp-0xf0]
    unsigned long long v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd0]
    unsigned long long v9;  // [bp-0xc0]
    unsigned long long v10;  // [bp-0xb0]
    unsigned long long v11;  // [bp-0xa0]
    unsigned long long v12;  // [bp-0x90]
    unsigned long long v13;  // [bp-0x80]
    unsigned long long v14;  // [bp-0x70]
    unsigned long long v15;  // [bp-0x60]
    unsigned long long v16;  // [bp-0x50]
    unsigned long long v17;  // [bp-0x40]
    unsigned long v18;  // [bp-0x28]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v21 = 0;
    v18 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v22 = &g_f0d3d8->field_110->field_0;
    v23 = v22 + 0x100;
    a0->field_d8 = v22;
    a0->field_e0 = v23;
    v16 = 0;
    v17 = 0;
    v14 = 0;
    v15 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    do
    {
        v24 = v22[v21];
        if (*((char *)&v2 + v24) & 1)
            goto LABEL_3c258c;
    } while ((*((char *)&v2 + v24) = 1, (&a0->field_e8)[v24] = v21, v21 += 1, v21 != 0x100));
    v25 = v22[164];
    a0->field_1e8 = v25;
    v26 = v23[v25];
    v27 = v26 - 7;
    v28 = v27;
    if (59 >= v27)
    {
        v29 = 1;
        if (!(1 << ((char)v27 & 63) & 588071595158807331))
            goto LABEL_3c258c;
    }
    else
    {
        v30 = v26 - 74;
        v29 = 1;
        v31 = 1 << ((char)v30 & 31) & 228987;
        if (v30 <= 0x11)
        {
            v32 = arm64g_calculate_condition(147, v28, 59, 0);
            v33 = arm64g_calculate_condition(19, (v32 & 1 ? v31 : 0x40000000), 0, 0);
            if (!(v33 & 1))
                goto LABEL_3c258c;
        }
        else
        {
            v34 = arm64g_calculate_condition(147, v28, 59, 0);
            v35 = arm64g_calculate_condition(16, (v34 & 1 ? v31 : 0x40000000), 0, 0);
            if (!(v35 & 1))
            {
LABEL_3c258c:
                v29 = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v18)
        return v29;
    ___stack_chk_fail();
}
