/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7538..0x1f75f8 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7538_0 {
    char field_0;
} st_1f7538_0;

typedef struct st_1f7538_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_1f7538_1;


void sub_1f7538(st_1f7538_1 *a0, unsigned int a1)
{
    unsigned int v4;  // w22
    unsigned int v5;  // w20
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned int iter;  // w9
    unsigned int v17;  // w11
    unsigned int i;  // w12
    unsigned int v19;  // w12
    uint128_t *v20;  // x13
    unsigned long long v6;  // x8
    unsigned int v7;  // w9
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned int v10;  // w10
    unsigned int v11;  // w9
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    st_1f7538_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f7538_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    if (a1 < v4)
        return;
    v5 = a1 + 1;
    sub_1fb614();
    v6 = a0->field_0;
    v7 = v4 + 1;
    v8 = v5;
    v9 = v7;
    if (v7 >= v5)
        v5 = v4 + 1;
    v10 = v5 - v4;
    v11 = v5 - 1;
    if (20 <= v10)
    {
        v12 = arm64g_calculate_condition(35, v8, v9, 0);
        v13 = arm64g_calculate_condition(35, (v12 & 1 ? v11 : 0), (v12 & 1 ? v4 : 0), 0);
        if (v13 & 1)
            goto LABEL_1f75a8;
LABEL_1f75a0:
        iter = v4;
    }
    else
    {
        v14 = arm64g_calculate_condition(35, v8, v9, 0);
        v15 = arm64g_calculate_condition(32, (v14 & 1 ? v11 : 0), (v14 & 1 ? v4 : 0), 0);
        if (!(v15 & 1))
            goto LABEL_1f75a0;
LABEL_1f75a8:
        v17 = v10 & 0xfffffff8;
        iter = v17 + v4;
        i = v17;
        do
        {
            v19 = i;
            v20 = v6 + v4 * 4;
            *v20 = 0;
            v20[1] = 0;
            v4 += 8;
            i = v19 - 8;
        } while (i);
        if (v10 == v17)
            return;
    }
    do
    {
        *(unsigned int *)(v6 + iter * 4) = 0;
        iter += 1;
    } while (iter <= a1);
    return;
}
