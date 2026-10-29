/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d305c..0x3d330c (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d305c_1 {
    struct st_3d305c_0 *field_0;
    char padding_8[16376];
    char field_4000;
    char padding_4001[1695];
    char field_46a0;
    char padding_46a1[95];
    char field_4700;
    char padding_4701[343];
    unsigned int field_4858;
} st_3d305c_1;

typedef struct st_3d305c_5 {
    char padding_0[2136];
    unsigned int field_858;
} st_3d305c_5;

typedef struct st_3d305c_3 {
    char padding_0[16];
    unsigned int field_10;
    unsigned int field_14;
} st_3d305c_3;

typedef struct st_3d305c_6 {
    char padding_0[344];
    unsigned int field_158;
} st_3d305c_6;

typedef struct st_3d305c_2 {
    char field_0;
} st_3d305c_2;

typedef struct st_3d305c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_3d305c_0;

typedef struct st_3d305c_4 {
    unsigned long long field_0;
} st_3d305c_4;

extern st_3d305c_4 *g_f0b120;

unsigned long long sub_3d305c(st_3d305c_1 *a0)
{
    st_3d305c_5 *v6;  // x22
    unsigned int v7;  // w0
    unsigned long v16;  // x9
    unsigned long long v17;  // x10
    st_3d305c_6 *v18;  // x11
    unsigned long long v20;  // x10
    st_3d305c_3 *v21;  // x9
    unsigned int v22;  // w8
    unsigned int v23;  // w0
    unsigned long long v24;  // w8
    unsigned long long v25;  // w9
    unsigned int v8;  // w0
    unsigned int v9;  // w0
    unsigned long long v10;  // 4123
    unsigned int v11;  // w8
    unsigned long long idx;  // x21
    st_3d305c_6 *v13;  // x23
    unsigned int j;  // w0
    unsigned int v15;  // w8
    st_3d305c_2 **v0;  // [bp-0x70], Other Possible Types: char
    st_3d305c_2 *v1;  // [bp-0x68]
    st_3d305c_2 **v2;  // [bp-0x60], Other Possible Types: char
    st_3d305c_2 *v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = &a0->field_4000;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v7 = sub_3d706c(a0->field_0);
    v8 = sub_3d706c(a0->field_0);
    v9 = sub_3d706c(a0->field_0);
    *(unsigned int *)&v6->padding_0[2132] = v9;
    v10 = arm64g_calculate_condition(49, v9 - 5, 4, 0);
    if (!(v10 & 1))
    {
        v11 = v9;
        if ((int)v11 <= (int)a0->field_0->field_8)
        {
            if ((v8 | v7 * 0x100) == v11 * 2 + 6)
            {
                idx = 0;
                v13 = &v6->padding_0[1696];
                do
                {
                    j = sub_3d706c();
                    v15 = sub_3d706c(a0->field_0);
                    v16 = a0->field_0->field_8;
                    if ((int)v16 >= 1)
                    {
                        v17 = 0;
                        v18 = v13;
                        while (*(int *)&v18->padding_0[0] != j)
                        {
                            v18 = &v18->padding_0[96];
                            if (v16 == v17 + 1)
                                return 0;
                        }
                        v20 = v17 & 0xffffffff;
                        if (v20 == v16)
                            return 0;
                    }
                    else
                    {
                        v20 = 0;
                        if (!v16)
                            return 0;
                    }
                    v21 = &v13->padding_0[(unsigned int)v20 * 96];
                    v21->field_10 = v15 >> 4;
                    if (64 <= v15)
                        g_f0b120();
                    v22 = v15 & 15;
                    v21->field_14 = v22;
                    if (4 <= v22)
                        g_f0b120();
                    (&a0->field_4858)[idx] = v20;
                    idx += 1;
                } while ((long long)idx < *(int *)&v6->padding_0[2132]);
                *(unsigned int *)&v6->padding_0[2100] = sub_3d706c();
                *(unsigned int *)&v6->padding_0[2104] = sub_3d706c(a0->field_0);
                v23 = sub_3d706c(a0->field_0);
                *(unsigned int *)&v6->padding_0[2108] = v23 >> 4;
                v24 = v23 & 15;
                *(unsigned int *)&v6->padding_0[2112] = v24;
                v25 = *(int *)&v6->padding_0[2100];
                if (*(int *)&v6->padding_0[2096])
                {
                    if (63 < v25)
                        g_f0b120();
                    if (63 < *(int *)&v6->padding_0[2104])
                        g_f0b120();
                    if (*(int *)&v6->padding_0[2104] < v25)
                        g_f0b120();
                    if (223 < v23)
                        g_f0b120();
                    if (v24 >= 14)
                        goto LABEL_3d32cc;
                }
                else if (v25 || 15 < v23 || v24)
                {
LABEL_3d32cc:
                    g_f0b120();
                }
                else
                {
                    *(unsigned int *)&v6->padding_0[2104] = 63;
                }
                return 1;
            }
            g_f0b120();
        }
    }
    g_f0b120();
}
