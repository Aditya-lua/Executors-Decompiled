/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8710..0xae8894 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae8710_0 {
    char padding_0[280];
    long long field_118;
} st_ae8710_0;

typedef struct st_ae8710_1 {
    char padding_0[4];
    unsigned int field_4;
} st_ae8710_1;


long long sub_ae8710(st_ae8710_0 *a0, long long *a1)
{
    long long v4;  // x21
    unsigned int v5;  // w0
    unsigned int v14;  // w9
    unsigned long long v15;  // 4138
    unsigned long v16;  // x0
    long long v17;  // x22
    long long v18;  // x0
    unsigned long long v19;  // 4112
    unsigned long v20;  // x0
    unsigned long v21;  // x21
    unsigned long v22;  // x0
    unsigned int v6;  // w0
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w23
    unsigned long long v10;  // 4138
    unsigned int v11;  // w0
    unsigned int v12;  // w0
    unsigned int v13;  // w8
    unsigned int v0;  // [bp-0x50]
    st_ae8710_1 *v1;  // [bp-0x48], Other Possible Types: long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_ab1c50();
    v5 = sub_af8d44(v4);
    v6 = sub_ad69e4(a0->field_118);
    v7 = v5 & ~((int)(v5) >> 31);
    v8 = v6 & ~((int)(v6) >> 31);
    v9 = v7 + v8;
    v10 = arm64g_calculate_condition(97, v7, v8, 0);
    if (v10 & 1)
        return 1;
    v11 = sub_ad69e4(*a1);
    v12 = sub_ad69e4(a1[1]);
    v13 = v11 & ~((int)(v11) >> 31);
    v14 = v12 & ~((int)(v12) >> 31);
    v15 = arm64g_calculate_condition(97, v13, v14, 0);
    if (!(v15 & 1) && ((int)v9 < 1 || (int)(v13 + v14) <= (int)(0x100000 / v9)))
    {
        if ((int)sub_af8d44(v4) >= 1)
        {
            v0 = 4;
            v1 = v4;
            v16 = sub_ae8894(&v0, a1);
            if ((unsigned int)v16)
                return v16;
            v0 = 1;
            v17 = 0xffffffff;
            while (1)
            {
                v18 = sub_af8d64(v4, 48, v17);
                v19 = arm64g_calculate_condition(1, v18 & 0xffffffff, 1, 0);
                if (v19 & 1)
                    break;
                v17 = v18;
                v1 = sub_9f2aec(sub_af8cf4(v4, v17), v17);
                if (v1->field_4 != 22)
                    return 53;
                v20 = sub_ae8894(&v0, a1);
                if ((unsigned int)v20)
                    return v20;
            }
        }
        if ((int)sub_ad69e4(a0->field_118) < 1)
            return 0;
        v21 = 0;
        while (1)
        {
            v22 = sub_ae8894(sub_ad69f8(a0->field_118, v21), a1);
            if ((unsigned int)v22)
                return v22;
            v21 = (unsigned int)v21 + 1;
            if ((int)v21 >= (int)sub_ad69e4(a0->field_118))
                return 0;
        }
    }
    return 1;
}
