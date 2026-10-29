/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed46c..0xbed6a0 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bed46c_3 {
    char padding_0[8];
    unsigned long long field_8;
} st_bed46c_3;

typedef struct st_bed46c_2 {
    long long field_0;
    struct st_bed46c_0 *field_8;
    unsigned long long field_10;
    unsigned short field_14;
} st_bed46c_2;

typedef struct st_bed46c_0 {
    char padding_0[24];
    struct st_bed46c_1 *field_18;
    struct st_bed46c_1 *field_20;
} st_bed46c_0;

typedef struct st_bed46c_1 {
    unsigned long long field_0;
} st_bed46c_1;


unsigned long long sub_bed46c(st_bed46c_2 *a0, uint128_t *a1)
{
    unsigned int v4;  // w21
    unsigned long long v5;  // x22
    unsigned int v14;  // w24
    unsigned int v15;  // w8
    unsigned int v16;  // x9
    unsigned int v17;  // x10
    st_bed46c_0 *v18;  // x21
    unsigned long long v19;  // x0
    unsigned int v6;  // x10
    unsigned int v7;  // x9
    st_bed46c_3 *iter;  // x11
    unsigned int v9;  // x10
    unsigned int v10;  // w16
    unsigned int v11;  // x16
    unsigned int v12;  // w16
    unsigned long long v13;  // x8
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(short *)((char *)&a0->field_10 + 4);
    if (!v4)
        return sub_bed6a0();
    v0 = *a1;
    v1 = a1[1];
    v5 = a0->field_10;
    if (v5 >> 24 & 1)
        a0->field_8->field_18();
    v6 = *(unsigned long long *)((void*)&v1 + 8);
    if (v6)
    {
        v7 = 0;
        iter = *(unsigned long long *)&v1 + 8;
        do
        {
            v9 = v6;
            v10 = *(short *)(&iter->padding_0[0] - 8);
            if (!v10)
            {
                v11 = (unsigned int)iter->padding_0;
            }
            else if (v10 == 1)
            {
                v12 = *(short *)(&iter->padding_0[0] - 6);
                v11 = ((v12 + 0x5fff6 & v12 + 0x7ff9c ^ v12 + 916504 & v12 + 514288) >> 0x11) + 1;
                if (!v12)
                    v11 = 1;
            }
            else
            {
                v11 = iter->field_8;
            }
        } while ((v7 += v11, iter = &iter[1].field_8, v6 = v9 - 1, v9 != 1));
    }
    else
    {
        v7 = 0;
    }
    v13 = v7 + *(unsigned long long *)((void*)&v0 + 8);
    if ((v4 & 0xffff) <= v13)
    {
        v19 = sub_bed6a0(a0->field_0, a0->field_8, &v0);
        a0->field_10 = v5;
        return v19;
    }
    v14 = v4 - v13;
    v15 = ((unsigned int)v5 * 8 | (unsigned int)v5 >> 29) & 0xfffffffb & 3;
    if (v15 == 2)
        v16 = ((unsigned short)v14 * 0 | (unsigned short)(v14 >> 1)) & 0x7fff;
    else
        v16 = (unsigned short)v14;
    if (!v15)
        v17 = 0;
    else
        v17 = (unsigned short)v14;
    if (1 >= (int)v15)
        v16 = v17;
    v18 = a0->field_8;
    if (v16 > 0)
        v18->field_20();
    if (sub_bed6a0(a0->field_0, v18, &v0) & 1)
        return 1;
    if ((unsigned short)(v14 - v16) <= 0)
    {
        a0->field_10 = v5;
        return 0;
    }
    v18->field_20();
}
