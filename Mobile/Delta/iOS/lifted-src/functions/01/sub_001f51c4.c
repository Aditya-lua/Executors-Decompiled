/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f51c4..0x1f5384 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f51c4_2 {
    struct st_1f51c4_1 *field_0;
    long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[95];
    struct st_1f51c4_0 *field_78;
} st_1f51c4_2;

typedef struct st_1f51c4_1 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[4];
    long long field_18;
} st_1f51c4_1;

typedef struct st_1f51c4_0 {
    char field_0;
} st_1f51c4_0;


long long sub_1f51c4(st_1f51c4_2 *a0)
{
    void* v9;  // w0
    unsigned int v10;  // w0
    unsigned long long j;  // x16
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4121
    st_1f51c4_1 *v11;  // x8
    void* v12;  // x9
    void* v13;  // x8
    unsigned long long v14;  // x13
    void* v15;  // x14
    unsigned long long v16;  // x12
    unsigned int v17;  // w15
    unsigned int v18;  // w14
    st_1f51c4_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_1f51c4_0 *v1;  // [bp-0x60]
    void* v2;  // [bp-0x58]
    void* i;  // [bp-0x50]
    void* v4;  // [bp-0x48]
    st_1f51c4_0 *v5;  // [bp-0x40], Other Possible Types: char
    st_1f51c4_0 **v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    i = 0;
    v4 = 0;
    sub_1ecbe0(&v5, a0->field_8);
    sub_1f2330(&v5);
    v9 = (void*)(unsigned int)sub_1f4dd0(a0, &v2, a0->field_0->field_18, &v5, 0, 0);
    sub_1eccac(&v5);
    if (v9)
    {
        sub_1fb5d8(&v2, 1);
        *(unsigned long *)v2 = 0x10ffff00000000;
    }
    v10 = sub_1ef050(&a0->field_18, &v2);
    v11 = a0->field_0;
    v11->field_10 = v10;
    v12 = i;
    if (v12)
    {
        v13 = 0;
        v14 = 0xfffffffe;
        do
        {
            v15 = v2 + v13 * 8;
            v16 = *(int *)v15;
            if (0xff < (unsigned int)v16)
            {
                v16 = v14;
                break;
            }
            v17 = (int)v15[4];
            if (v17 < 0xff)
                v18 = v17;
            else
                v18 = 0xff;
            if (v17 < (unsigned int)v16)
            {
                v16 = v14;
            }
            else
            {
                j = v16;
                do
                {
                    v5 = &v6;
                    v6 = &v5;
                    *(char *)&a0->field_78[j] = *(char *)&a0->field_78[j] | 1;
                    j += 1;
                } while (v18 + 1 != j);
                v20 = arm64g_calculate_condition(1, v14 & 0xffffffff, 1, 0);
                if (v20 & 1 || (unsigned int)v16 != v18 || (v21 = arm64g_calculate_condition(1, v14 & 0xffffffff, 2, 0), !(v21 & 1) && (unsigned int)v14 != (unsigned int)v16))
                    v16 = 0xffffffff;
            }
            v13 += 1;
            v14 = v16;
        } while (i > v13);
        v11 = a0->field_0;
        v22 = arm64g_calculate_condition(33, v16 & 0xffffffff, 2, 0);
        if (v22 & 1)
            v12 = 0;
        else
            v12 = (unsigned int)v16 + 1;
    }
    v11->field_4 = (unsigned int)v12;
    return sub_1eccac(&v2);
}
