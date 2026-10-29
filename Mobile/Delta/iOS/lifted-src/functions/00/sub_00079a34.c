/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79a34..0x79b58 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79a34_1 {
    unsigned int field_0;
    char padding_4[2];
    char field_6;
} st_79a34_1;

typedef struct st_79a34_0 {
    unsigned short field_0;
    unsigned short field_2;
    char padding_4[656];
    unsigned short field_294;
    unsigned short field_296;
    char padding_298[2];
    char field_29a;
    char padding_29b[89];
    char field_2f4;
    char padding_2f5[3];
    unsigned short field_2f8;
    unsigned short field_2fa;
    unsigned short field_2fc;
} st_79a34_0;


unsigned long long sub_79a34(unsigned long a0, unsigned int *a1, unsigned int a2, st_79a34_0 *a3)
{
    unsigned long long v2;  // x0
    unsigned long long j;  // x23
    unsigned long long v12;  // x10
    unsigned long long v14;  // 4134
    unsigned long long v15;  // x24
    unsigned long v16;  // x22
    st_79a34_0 *v17;  // x8
    unsigned long v18;  // x9
    st_79a34_1 *v19;  // x8
    unsigned short *v20;  // x20
    unsigned long long v21;  // x21
    unsigned long long v4;  // 4113
    unsigned long long v22;  // x21
    unsigned long v23;  // x8
    unsigned int v24;  // w9
    unsigned long long v5;  // x8
    unsigned long long i;  // x22
    unsigned int *v7;  // x24
    unsigned long long v8;  // x22
    unsigned int *v9;  // x24
    unsigned long long v10;  // x8
    unsigned short *iter;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = _bzero(a3, 0x300);
    j = a2 + 1;
    v4 = arm64g_calculate_condition(49, a2, 1, 0);
    if (!(v4 & 1))
    {
        v5 = 0;
    }
    else
    {
        i = j;
        v7 = a1;
        do
        {
            v8 = i;
            v9 = v7 + 1;
            v2 = sub_7a918(*v7);
            v10 = (v2 * 4 | v2 >> 62) & 0x3fffffffc & 0x3ffffffff;
            *(short *)((char *)a3 + v10) = *(short *)((char *)a3 + v10) + 1;
            i = v8 - 1;
            v7 = v9;
        } while (i);
        v5 = a3->field_2fc;
    }
    iter = &a3->field_2f8;
    v12 = 0xffffffffffffff41;
    do
    {
        v5 += *iter;
        *iter = v5;
        iter[1] = v5;
        iter = (char *)iter - 4;
        v14 = arm64g_calculate_condition(50, v12, 1, 0);
        v12 += 1;
    } while (v14 & 1);
    if ((unsigned int)j)
    {
        v15 = 0;
        do
        {
            v16 = a1[v15];
            v2 = sub_7a918(v16);
            v17 = &a3->padding_4[4 * v2];
            v18 = v17->field_2;
            v17->field_2 = (unsigned short)v18 + 1;
            v19 = a0 + v18 * 8;
            v19->field_0 = v16;
            v19->field_6 = v15;
            v15 += 1;
        } while (j != v15);
    }
    v20 = &a3->field_296;
    v21 = 26;
    do
    {
        v22 = v21;
        v23 = *(short *)((char *)v20 - 2);
        v24 = *v20 - v23;
        if ((int)v24 >= 2)
            v2 = sub_7ac18(a0 + v23 * 8, 0, v24 - 1);
    } while ((v20 += 2, v21 = v22 - 1, v22 != 1));
    return v2;
}
