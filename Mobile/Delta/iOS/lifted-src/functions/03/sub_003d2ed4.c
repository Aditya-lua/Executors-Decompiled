/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d2ed4..0x3d3024 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d2ed4_2 {
    char padding_0[12];
    int field_c;
    char padding_10[12];
    unsigned int field_1c;
    unsigned int field_20;
    char padding_24[44];
    unsigned long long field_50;
    unsigned int field_58;
} st_3d2ed4_2;

typedef struct st_3d2ed4_0 {
    char field_0;
} st_3d2ed4_0;

typedef struct st_3d2ed4_1 {
    char padding_0[8];
    int field_8;
} st_3d2ed4_1;


void sub_3d2ed4(st_3d2ed4_1 **a0)
{
    unsigned long v6;  // cc_op
    long long v7;  // cc_dep1
    long long v8;  // cc_dep2
    unsigned long long v9;  // x11
    st_3d2ed4_2 *v10;  // x25
    int v11;  // w9
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    st_3d2ed4_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_3d2ed4_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = &v2;
    v2 = &v3;
    if (!(int)a0[2310])
        return;
    v6 = 3;
    v7 = *a0->field_8;
    v8 = 1;
    if (*a0->field_8 < 1)
        return;
    v9 = 0;
    v0 = a0 + 2260;
    while (1)
    {
        v10 = v0 + 96 * v9;
        v11 = (int)(v10->field_1c + 7) >> 3;
        if (1 <= (int)((int)(v10->field_20 + 7) >> 3))
        {
            v12 = arm64g_calculate_condition(v6 | 160, v7, v8, 0);
            v13 = arm64g_calculate_condition(179, (v12 & 1 ? v11 : 0x80000000), v12 & 1, 0);
            if (!(v13 & 1))
                break;
        }
        else
        {
            v14 = arm64g_calculate_condition(v6 | 160, v7, v8, 0);
            v15 = arm64g_calculate_condition(176, (v14 & 1 ? v11 : 0x80000000), v14 & 1, 0);
            if (!(v15 & 1))
                break;
        }
        v9 += 1;
        v8 = *a0->field_8;
        v6 = 4;
        v7 = v9;
        if (v8 <= v7)
            return;
    }
    v1 = v9;
    sub_3ceb30(v10->field_50 + (0 + v10->field_58 * 0) * 64 * 2, (char *)&a0[210 + 16 * v10->field_c] + 1);
    a0[2318]();
}
