/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc539d8..0xc53ccc (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c539d8_0 {
    char padding_0[1330];
    unsigned short field_532;
} st_c539d8_0;

typedef struct st_c539d8_4 {
    uint128_t field_0;
} st_c539d8_4;

typedef struct st_c539d8_3 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_c539d8_4 *field_10;
    unsigned long long field_18;
} st_c539d8_3;

typedef struct st_c539d8_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    struct st_c539d8_0 *field_18;
    unsigned long long field_20;
} st_c539d8_2;

typedef struct st_c539d8_8 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_c539d8_3 *field_10;
    struct st_c539d8_1 *field_18;
    unsigned long long field_20;
    unsigned int field_28;
    char padding_2c[4];
    unsigned long long field_30;
} st_c539d8_8;

typedef struct st_c539d8_1 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    char field_48[4];
    char field_49;
} st_c539d8_1;

typedef struct st_c539d8_7 {
    char padding_0[82];
    unsigned short field_52;
} st_c539d8_7;

typedef struct st_c539d8_5 {
    struct st_c539d8_6 *field_0;
    unsigned long long field_8;
    struct st_c539d8_1 *field_10;
    struct st_c539d8_2 *field_18;
    char field_20;
    char padding_21[7];
    unsigned long long field_28;
    struct st_c539d8_3 *field_30;
    struct st_c539d8_1 *field_38;
    unsigned long long field_40;
    unsigned int field_48;
    char padding_4c[4];
    unsigned long long field_50;
} st_c539d8_5;

typedef struct st_c539d8_6 {
    char field_0;
} st_c539d8_6;

extern long long g_efbab8;

void* sub_c539d8(void* a0, st_c539d8_5 *a1)
{
    unsigned long long v11;  // x9
    st_c539d8_8 *v12;  // x10
    unsigned long v21;  // x22
    unsigned long long v22;  // 4120
    unsigned long long v23;  // x8
    unsigned long long v24;  // x8
    unsigned long long v25;  // w15
    st_c539d8_1 *v26;  // x9
    st_c539d8_2 *v27;  // x14
    unsigned long long v28;  // x12
    char *v29;  // x13
    unsigned long long v30;  // x10
    unsigned long long v13;  // x8
    unsigned long long v31;  // x11
    unsigned long v32;  // x12
    unsigned long v34;  // x17
    unsigned long long v35;  // 4118
    unsigned long long v36;  // x13
    st_c539d8_3 *v37;  // x8
    st_c539d8_0 *v38;  // x15
    unsigned long v39;  // x14
    st_c539d8_7 *v40;  // x17
    unsigned long long v14;  // x11
    unsigned long v41;  // x2
    unsigned long long v42;  // x3
    unsigned long long v43;  // x16
    char v45;  // x4
    unsigned int i;  // w4
    void* v16;  // x0
    st_c539d8_3 *v17;  // x13
    uint128_t *v18;  // x12
    unsigned long v19;  // x8
    unsigned long iter;  // x21
    unsigned long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    uint128_t *v2;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x70]
    st_c539d8_8 *v4;  // [bp-0x68]
    uint128_t v5;  // [bp-0x60]
    char v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = *(long long *)&a1->field_20;
    v12 = &a1->field_20;
    if (!v11)
    {
        v14 = a1->field_8;
        v16 = a0;
        if (!v14)
        {
            *(unsigned long long *)&a1->field_20 = 0;
            a1[1].field_0 = 0;
            *(unsigned short *)a0 = 82;
            return a0;
        }
    }
    else if (*(long long *)&a1->field_48 == 1)
    {
        v13 = a1->field_50;
        v14 = a1->field_28 - v13;
        if (v13 > a1->field_28)
        {
            *(unsigned long long *)a0 = 19;
            *(unsigned long long *)&a0[8] = v11;
            return a0;
        }
        a1->field_0 = v11 + v13;
        a1->field_8 = v14;
        v16 = a0;
        if (!v14)
        {
            *(unsigned long long *)&a1->field_20 = 0;
            a1[1].field_0 = 0;
            *(unsigned short *)a0 = 82;
            return a0;
        }
    }
    else
    {
        v17 = a1->field_30;
        if (v17->padding_0 == 1)
        {
            v18 = v17->field_10;
            v19 = v17->field_18;
            v0 = v11;
            v1 = a1->field_28;
            v2 = v17->field_10;
            v3 = v19;
            v4 = v12;
            v16 = a0;
            if (v19)
                goto LABEL_c53b24;
        }
        else
        {
            v19 = v17->field_8;
            if (6 <= v19)
                sub_c73bb0(0, v19, 5, &g_efbab8);
            v18 = &v17->field_10;
            v0 = v11;
            v1 = a1->field_28;
            v2 = v18;
            v3 = v19;
            v4 = v12;
            v16 = a0;
            if (v19)
            {
LABEL_c53b24:
                v16 = a0;
                iter = v18 + 1;
                v21 = v19 - 1;
                do
                {
                    v5 = *(int128_t *)(iter - 16);
                    sub_c4cbcc(&v6, &v0, (unsigned long long)v4->field_18->field_48, &v5);
                    if (v6 == 46)
                    {
                        a0 = v16;
                        *(unsigned long long *)a0 = v7;
                        *(unsigned long long *)&a0[8] = v8;
                        return a0;
                    }
                } while ((v2 = iter, v3 = v21, iter += 16, v21 -= 1, v22 = arm64g_calculate_condition(18, v21, 1, 0), v22 & 1));
                v12 = v4;
                v11 = v0;
            }
        }
        if (!(v12->field_28 & 1))
        {
            v23 = (unsigned long long)v12->padding_0;
            *(unsigned long long *)&v12->field_28 = 1;
            v12->field_30 = v11 - v23;
        }
        v14 = v1;
        a1->field_0 = v11;
        a1->field_8 = v14;
        if (!v14)
        {
            *(unsigned long long *)&a1->field_20 = 0;
            a1[1].field_0 = 0;
            *(unsigned short *)a0 = 82;
            return a0;
        }
    }
    v24 = 0;
    v25 = 0;
    v26 = a1->field_10;
    v27 = a1->field_18;
    v28 = 4;
    if (v26->field_48[1] == 8)
        v28 = 12;
    v29 = a1->field_0;
    v30 = &v29[v26->field_38 + -1 * v26->field_30 + v28 + -1 * v26->field_28];
    v31 = v14 - 1;
    v32 = v29 + 1;
    while (1)
    {
        v34 = *(char *)(v32 - 1);
        if (v25 == 63 && 1 < (unsigned int)v34)
        {
            a1->field_0 = 1;
            a1->field_8 = 0;
            a1[1].field_0 = 0;
            *(unsigned long long *)&a1->field_20 = 0;
            *(unsigned long long *)v16 = 6;
            *(unsigned long long *)&v16[8] = v24;
            return v16;
        }
        v24 |= (v34 & 127) << ((char)v25 & 63);
        if (!(v34 >> 7 & 1))
            break;
        v32 += 1;
        v25 += 7;
        v31 -= 1;
        v35 = arm64g_calculate_condition(18, v31, 1, 0);
        if (!(v35 & 1))
        {
            a1->field_0 = 1;
            a1->field_8 = 0;
            a1[1].field_0 = 0;
            *(unsigned long long *)&a1->field_20 = 0;
            *(unsigned long long *)v16 = 19;
            *(char **)&v16[8] = &v29[v14];
            return v16;
        }
    }
    a1->field_0 = v32;
    a1->field_8 = v31;
    if (v24)
    {
        v36 = v24 - 1;
        if (v27->padding_10 > v36)
        {
            v37 = v27->field_8 + 112 * v36;
        }
        else
        {
            v38 = v27->field_18;
            if (!v27->field_18)
            {
                a1->field_0 = 1;
                a1->field_8 = 0;
                a1[1].field_0 = 0;
                *(unsigned long long *)&a1->field_20 = 0;
                *(unsigned long long *)v16 = 18;
                *(unsigned long long *)&v16[8] = v24;
                return v16;
            }
            v39 = v27->field_20;
            while (1)
            {
                v40 = &v38->padding_0[1240];
                v41 = v38->field_532;
                v42 = v41 * 8;
                v43 = 0xffffffffffffffff;
                do
                {
                    if (!v42)
                    {
                        v43 = v41;
                        goto LABEL_c53c58;
                    }
                    if ((unsigned long long)*(long long *)&v40->padding_0[0] <= v24)
                        v45 = v24 > (unsigned long long)*(long long *)&v40->padding_0[0];
                    else
                        v45 = 0xff;
                    v43 += 1;
                    v42 -= 8;
                    i = v45;
                    v40 = &v40->padding_0[8];
                } while (i == 1);
                if (!i)
                    break;
LABEL_c53c58:
                if (!v39)
                {
                    a1->field_0 = 1;
                    a1->field_8 = 0;
                    a1[1].field_0 = 0;
                    *(unsigned long long *)&a1->field_20 = 0;
                    *(unsigned long long *)v16 = 18;
                    *(unsigned long long *)&v16[8] = v24;
                    return v16;
                }
                v38 = *(long long *)&v38[1].padding_0[4 + 8 * v43];
                v39 -= 1;
            }
            v37 = &v38->padding_0[112 * v43];
        }
        a1[1].field_0 = *((char *)&v37[3].field_8 + 2) == 1;
        *(unsigned long *)&a1->field_20 = v32;
        a1->field_28 = v31;
        a1->field_30 = v37;
        a1->field_38 = v26;
        a1->field_40 = v30;
        *(unsigned long long *)&a1->field_48 = 0;
    }
    else
    {
        a1[1].field_0 = 0xffffffffffffffff;
        *(unsigned long long *)&a1->field_20 = 0;
    }
    *(unsigned short *)a0 = 338;
    return a0;
}
