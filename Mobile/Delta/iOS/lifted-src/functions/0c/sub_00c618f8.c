/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc618f8..0xc61a4c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c618f8_3 {
    struct st_c618f8_0 *field_0;
    struct st_c618f8_0 *field_8;
    unsigned long long field_10;
    long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[216];
    struct st_c618f8_1 *field_108;
    char padding_110[40];
    unsigned long long field_138;
    char padding_140[80];
    unsigned long long field_190;
    unsigned long long field_198;
} st_c618f8_3;

typedef struct st_c618f8_1 {
    char padding_0[64];
    struct st_c618f8_2 *field_40;
} st_c618f8_1;

typedef struct st_c618f8_2 {
    unsigned long long field_0;
} st_c618f8_2;

typedef struct st_c618f8_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[8];
    char field_20;
    char padding_21[39];
    struct st_c618f8_0 *field_48;
    unsigned long long field_50;
} st_c618f8_0;


unsigned long long sub_c618f8(st_c618f8_3 *a0, st_c618f8_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x8
    unsigned long v18;  // x9
    unsigned long long v19;  // x8
    st_c618f8_3 *v20;  // x9
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x9
    unsigned long long v13;  // x8
    unsigned long long *v14;  // x21
    st_c618f8_3 *v15;  // x22
    unsigned long long v16;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1->field_10)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a1->field_20;
    v13 = v12 & 3;
    v14 = &a0->field_138;
    if (a1->field_10 < v14[v13])
        return 0;
    if (!a1->padding_8)
    {
        return 0;
    }
    else if (((unsigned int)v12 >> 2 & 3) != 2)
    {
        v15 = (char *)a0 + (unsigned int)v13 * 48;
        if (a1->field_0 >= v15->field_20 && !sub_a66b6c(v15->field_18, a1) && !a1->field_48 && !a1->field_50)
        {
            sub_a66794(v15->field_18, a1);
            if (!sub_a66e38(v15->field_18))
            {
                v16 = v15->field_8;
                if (v16)
                    *(st_c618f8_0 **)(v16 + 72) = a1;
                a1->field_48 = 0;
                a1->field_50 = v16;
                v15->field_8 = a1;
                if (!v15->field_0)
                    v15->field_0 = a1;
                v15->field_10 = v15->field_10 + 1;
                v17 = a1->field_0;
                v15->field_20 = v17 + 1;
                v15->field_28 = v17;
                v18 = a1->field_20;
                if (!(v18 >> 2 & 1))
                    return 1;
                v19 = (unsigned long long)a1->padding_8;
                if (v18 >> 3 & 1)
                {
                    v14[v18 & 3] = a1->field_10;
                    v20 = &(&a0->field_0)[a1->field_20 & 3];
                    v20->field_198 = v20->field_198 + v19;
                }
                a0->field_190 = a0->field_190 + v19;
                sub_974dcc(a0);
                a0->field_108->field_40();
            }
        }
    }
    else
    {
        return 0;
    }
    return 0;
}
