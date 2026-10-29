/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd98f0..0xbd9b00 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd98f0_2 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bd98f0_2;

typedef struct st_bd98f0_7 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_bd98f0_1 *field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_bd98f0_7;

typedef struct st_bd98f0_1 {
    unsigned int field_0;
} st_bd98f0_1;

typedef struct st_bd98f0_4 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_bd98f0_4;

typedef struct st_bd98f0_3 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[8];
    unsigned int field_2c;
} st_bd98f0_3;

typedef struct st_bd98f0_0 {
    unsigned long long field_0;
    struct st_bd98f0_1 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    struct st_bd98f0_1 *field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[8];
    struct st_bd98f0_1 *field_40;
    char padding_48[8];
    unsigned long long field_50;
} st_bd98f0_0;

extern unsigned long long g_bef1c8;
extern long long g_cb9f36;
extern long long g_efc830;

unsigned int sub_bd98f0(st_bd98f0_0 *a0, unsigned long long *a1)
{
    unsigned long v9;  // x8
    unsigned long long *v10;  // x16
    unsigned int v19;  // w11
    st_bd98f0_2 *v20;  // x8
    unsigned long long v21;  // x26
    unsigned long long v22;  // x21
    st_bd98f0_3 *v23;  // x8
    unsigned int v24;  // w28
    st_bd98f0_4 *v25;  // x8
    unsigned long long v26;  // 4127
    unsigned long v27;  // x8
    unsigned long index;  // x25
    unsigned long long v11;  // x23
    unsigned long long v12;  // x24
    unsigned long v13;  // x17
    unsigned long long v14;  // x22
    unsigned long long v15;  // x20
    unsigned long long idx;  // x8
    unsigned int v17;  // w11
    unsigned int v18;  // w9
    st_bd98f0_7 *v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x88]
    unsigned long long *v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    st_bd98f0_7 *v5;  // [bp-0x70], Other Possible Types: unsigned long long *
    unsigned long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0->field_10;
    if (!v9)
        return 0;
    v0 = &a0->field_30;
    v10 = &a0->field_50;
    v11 = a1[4];
    v12 = a1[5];
    v13 = a1[1];
    v14 = a1[2];
    while (1)
    {
        v15 = *(int *)((char *)&a0->field_8[v9].field_0 - 4);
        v2 = v15;
        if (a0->field_30 > v15)
        {
            idx = v15 >> 5;
            v17 = *(int *)&a0->field_20[idx];
            v18 = 1 << ((char)v15 & 31);
            *(unsigned int *)&a0->field_20[idx] = v17 | v18;
            if (!(v17 & v18))
            {
                if (v14 <= v15 || (v20 = v13 + v15 * 32, v20->field_0 == 0x8000000000000000))
                    v21 = 0xffffffff;
                else
                    v21 = v20->field_18;
                v22 = 0xffffffff;
                while (1)
                {
                    if (v12 > v21)
                    {
                        v23 = v11 + 48 * v21;
                        v21 = v23->field_20;
                        v24 = v23->field_2c;
                    }
                    else
                    {
                        do
                        {
                            if (v12 <= v22)
                                goto LABEL_bd9940;
                        } while ((v25 = v11 + 48 * v22, v22 = v25->field_24, v24 = v25->field_28, v26 = arm64g_calculate_condition(1, v24, 1, 0), v26 & 1));
                    }
                    v27 = v24 >> 5;
                    if (a0->field_28 <= v27 || !((unsigned int)(*(int *)&a0->field_20[v27]) >> ((char)v24 & 31) & 1))
                    {
                        index = a0->field_10;
                        if (index == a0->field_0)
                        {
                            v1 = v13;
                            sub_c6c494(a0);
                            v13 = v1;
                            v10 = &a0->field_50;
                        }
                        *(unsigned int *)&a0->field_8[index] = v24;
                        a0->field_10 = index + 1;
                    }
                }
            }
            if (a0->field_10)
                a0->field_10 = a0->field_10 - 1;
            v2 = v15;
            if (*v10 > v15)
            {
                v19 = *(int *)&a0->field_40[idx];
                *(unsigned int *)&a0->field_40[idx] = v19 | v18;
                if (!(v19 & v18))
                    return 1;
LABEL_bd9940:
                v9 = a0->field_10;
                if (!a0->field_10)
                    return 0;
            }
            else
            {
                v3 = &v2;
                v4 = &g_bef1c8;
                v5 = v10;
                break;
            }
        }
        else
        {
            v3 = &v2;
            v4 = &g_bef1c8;
            v5 = v0;
            break;
        }
    }
    v6 = &g_bef1c8;
    sub_c73b38(&g_cb9f36, &v3, &g_efc830);
}
