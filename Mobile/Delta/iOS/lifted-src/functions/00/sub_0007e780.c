/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e780..0x7ea04 (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7e780_1 {
    unsigned short field_0;
    char field_2;
} st_7e780_1;

typedef struct st_7e780_2 {
    unsigned int field_0;
    char padding_4[236];
    char field_f0;
    char padding_f1[3];
    unsigned int field_f4;
    char padding_f8[20];
    unsigned int field_10c;
    char padding_110[4];
    struct st_7e780_1 *field_114;
    char padding_11c[12];
    struct st_7e780_1 *field_128;
    char padding_130[76];
    struct st_7e780_1 *field_17c;
    unsigned int field_180;
    char padding_184[316];
    char field_2c0;
    char padding_2c1[71];
    unsigned long long field_308;
    char padding_310[8];
    unsigned long long field_318;
    unsigned long long field_320;
    char field_328;
    char padding_329[159];
    struct st_7e780_1 *field_3c8;
    char padding_3d0[2264];
    char field_ca8;
    char padding_ca9[27];
    unsigned int field_cc4;
    char padding_cc8[8];
    char field_cd0;
    char padding_cd1[3];
    unsigned int field_cd4;
} st_7e780_2;

typedef struct st_7e780_0 {
    char field_0;
} st_7e780_0;


st_7e780_1 * sub_7e780(st_7e780_2 *a0, st_7e780_1 *a1, long long a2, long long a3, st_7e780_1 *a4, st_7e780_1 *a5)
{
    st_7e780_1 *i;  // x22
    long long v8;  // x28
    st_7e780_1 *v17;  // x19
    long long v18;  // x21
    st_7e780_1 *v19;  // x0
    unsigned long long v20;  // 4106
    unsigned long long v21;  // 4106
    st_7e780_1 *v22;  // x0
    unsigned long long v23;  // 4106
    unsigned long long v24;  // 4106
    unsigned int v25;  // w8
    long long v9;  // x23
    st_7e780_1 *v10;  // x26
    st_7e780_1 *iter;  // x25
    long long v12;  // x26
    long long v13;  // x27
    st_7e780_1 *v14;  // x0
    st_7e780_1 *v16;  // x24
    st_7e780_1 *v0;  // [bp-0x88]
    unsigned int v1;  // [bp-0x7c]
    unsigned long v2;  // [bp-0x78]
    st_7e780_0 **v3;  // [bp-0x70], Other Possible Types: char
    st_7e780_0 *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    i = a4;
    v8 = a3;
    v9 = a2;
    v10 = a1;
    v4 = &v3;
    v3 = &v4;
    v2 = *(long long *)&a0->padding_2c1[55];
    if (a4 && (a0->padding_110)[1])
    {
        sub_778e4(&a0->field_318, v8, i);
    }
    else if (!i)
    {
        return v10 - v10;
    }
    iter = v10;
    v12 = 1 << ((char)a0->field_f4 & 31);
    v13 = (long long)(a0->field_308 - a0->padding_310);
    v1 = a5 & 1;
    v0 = iter;
    do
    {
        v14 = sub_826bc(a0, v8, i, v2, *(int *)&a0->padding_130[72], a0->field_10c, v13);
        if (i == v14)
            v16 = v1;
        else
            v16 = 0;
        if ((unsigned long long)v9 < 6)
            return 0xffffffffffffffba;
        v17 = v14;
        v18 = v8 + (char *)v14;
        sub_81e80(&a0->padding_3d0[2248], &a0->padding_184[300], &a0->field_f0, v8, v18);
        sub_7e48c(&a0->padding_3d0[2248], v18, v12, &a0->padding_ca9[23], &a0[1].padding_4[180]);
        sub_8047c(&a0->padding_3d0[2248], v8, v12, &a0->padding_ca9[23], &a0[1].padding_4[180]);
        if ((unsigned int)*(int *)&a0->padding_ca9[11] > a0->field_cc4)
            a0->field_cc4 = *(int *)&a0->padding_ca9[11];
        if (*(long long *)&a0->padding_11c[8])
        {
            v19 = sub_7cc28(a0, iter, v9, v8, v17, v16);
            v20 = arm64g_calculate_condition(50, v19, 0x77, 0);
            if (!(v20 & 1))
                return v19;
        }
        else if (*(int *)&a0->padding_130[0x44] == 1)
        {
            v19 = sub_7f08c(a0, iter, v9, v8, v17, v16);
            v21 = arm64g_calculate_condition(50, v19, 0x77, 0);
            if (!(v21 & 1))
                return v19;
        }
        else
        {
            v22 = sub_7f214(a0, iter + 1, v9 - 3, v8, v17, 1);
            v23 = arm64g_calculate_condition(130, v22, 120, 0);
            if (v23 & 1)
                return v22;
            if (v22 == 1)
            {
                v25 = (unsigned int)v16 | (unsigned int)v17 * 8 | 2;
            }
            else if (!v22)
            {
                v19 = sub_7cda0(iter, v9, v8, v17, v16);
                v24 = arm64g_calculate_condition(50, v19, 0x77, 0);
                if (!(v24 & 1))
                    return v19;
            }
            else
            {
                v25 = (unsigned int)v16 | (unsigned int)v22 * 8 | 4;
            }
            iter->field_0 = v25;
            iter->field_2 = v25 >> 16;
            v19 = v22 + 1;
        }
        *(unsigned int *)&a0->padding_329[143] = 0;
        v13 = (char *)v17 + v13 - v19;
        iter += v19;
        v9 -= (char *)v19;
        v8 = v18;
        i -= v14;
    } while (i);
    if (a5)
    {
        v10 = v0;
        if (iter > v10)
            a0->field_0 = 3;
    }
    else
    {
        v10 = v0;
    }
    return iter - v10;
}
