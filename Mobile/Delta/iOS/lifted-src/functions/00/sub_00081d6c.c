/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81d6c..0x81e80 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81d6c_3 {
    unsigned int field_0;
} st_81d6c_3;

typedef struct st_81d6c_1 {
    unsigned int field_0;
    unsigned short field_4;
} st_81d6c_1;

typedef struct st_81d6c_2 {
    struct st_81d6c_3 *field_0;
    char padding_8[64];
    unsigned int field_48;
    unsigned int field_4c;
} st_81d6c_2;

typedef struct st_81d6c_0 {
    char field_0;
} st_81d6c_0;


long long sub_81d6c(long long a0, long long a1, st_81d6c_2 *a2, unsigned long long a3)
{
    unsigned long v4;  // cc_op
    unsigned long long i;  // cc_dep1
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4139
    unsigned long v18;  // x22
    unsigned long v19;  // x23
    unsigned int v20;  // w0
    unsigned int v21;  // w0
    long long v22;  // x0
    unsigned long long v6;  // cc_dep2
    unsigned long long v7;  // x8
    unsigned long long v8;  // x25
    unsigned long long v9;  // x26
    unsigned long long v10;  // x27
    st_81d6c_1 *v11;  // x8
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_op
    st_81d6c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_81d6c_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = 3;
    i = a2->field_48;
    v6 = 1;
    v7 = a3;
    if (a2->field_48 == 1)
        v7 = a2->field_4c;
    if (!(unsigned int)a3)
        return a0;
    v8 = 0;
    v9 = (v7 * 8 | v7 >> 61) & 0x7fffffff8 & 0x7ffffffff;
    v10 = (a3 * 8 | a3 >> 61) & 0x7fffffff8 & 0x7ffffffff;
    do
    {
        v11 = (char *)a2->field_0 + v8;
        if (!v11->field_4)
        {
            v12 = arm64g_calculate_condition(v4, i, v6, 0);
            v13 = 4;
            v14 = (v12 & 1 ? v9 : 0x40000000);
            v15 = (v12 & 1 ? v8 : 0);
        }
        else
        {
            v16 = arm64g_calculate_condition(v4, i, v6, 0);
            v13 = 0;
            v14 = (v16 & 1 ? v9 : 0x40000000);
            v15 = (v16 & 1 ? v8 : 0);
        }
        v17 = arm64g_calculate_condition(v13, v14, v15, 0);
        v18 = !(v17 & 1);
        v19 = v11->field_0;
        if (2 >= (unsigned int)v19 - 1)
        {
            v20 = sub_7f54c(a0, v19, v18);
            v21 = sub_7f54c(a1, v19, v18);
            if (v20 != v21)
                *(unsigned int *)((char *)a2->field_0 + v8) = v21 + 3;
        }
        v6 = v8 + 8;
        sub_7f880(a0);
        v22 = sub_7f880(a1, v19, v18);
        v4 = 4;
        v8 = v6;
        i = v10;
    } while (i != v8);
    return v22;
}
