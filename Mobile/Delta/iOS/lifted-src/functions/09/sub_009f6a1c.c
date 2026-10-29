/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6a1c..0x9f6bdc (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6a1c_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_9f6a1c_2;

typedef struct st_9f6a1c_3 {
    struct st_9f6a1c_3 *field_0;
    uint128_t field_1;
    uint128_t field_11;
    char field_21;
    char field_22;
    char field_23;
    char field_24;
    char field_25;
    char field_26;
    char field_27;
    char field_28;
    char field_29;
    char field_2a;
} st_9f6a1c_3;

typedef struct st_9f6a1c_0 {
    struct st_9f6a1c_0 *field_0;
    char field_1;
    char padding_2[15];
    uint128_t field_11;
    char field_21;
    char field_22;
    char field_23;
    char field_24;
    char field_25;
    char field_26;
    char field_27;
    char field_28;
    char field_29;
    char field_2a;
} st_9f6a1c_0;

typedef struct st_9f6a1c_1 {
    struct st_9f6a1c_0 *field_0;
    char padding_8[8];
    long long field_10;
    struct st_9f6a1c_2 *field_18;
    char padding_20[8];
    unsigned long long field_28;
    unsigned int field_2c;
    unsigned short field_2e;
    char field_2f;
    long long field_30;
    struct st_9f6a1c_0 *field_38;
    char padding_40[16];
    unsigned long long field_50;
} st_9f6a1c_1;


long long sub_9f6a1c(st_9f6a1c_1 *a0, st_9f6a1c_3 *a1)
{
    st_9f6a1c_0 *v3;  // w8
    long long v4;  // x19
    st_9f6a1c_3 *v5;  // x0
    st_9f6a1c_3 *v6;  // x22
    st_9f6a1c_0 *v7;  // w8
    uint128_t v8;  // q0
    st_9f6a1c_3 *iter;  // [bp-0x38], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    iter = 0;
    if (sub_9f7850())
    {
        v3 = (st_9f6a1c_0 *)(int)a0->field_0;
        if (v3)
        {
            v4 = a0->field_10;
            if (!a1)
                return a0->field_10;
        }
        else
        {
            v4 = a0->field_30 + *(long long *)&a0->padding_40[8] + 47;
            if (!a1)
                return v4;
        }
        v5 = a1->field_0;
        if (v5)
        {
            v6 = 0;
            a1->field_0 = (char *)v5 + v4;
            if (v3)
            {
                _memcpy();
                return v4;
            }
            goto LABEL_9f6b0c;
        }
        else
        {
            v5 = sub_a6bf4c(v4, "crypto/ct/ct_oct.c", 225);
            iter = v5;
            v6 = v5;
            if (v6)
            {
                v7 = (st_9f6a1c_0 *)(int)a0->field_0;
                v6 = v5;
                a1->field_0 = v5;
                if (v7)
                {
                    _memcpy();
                    return v4;
                }
LABEL_9f6b0c:
                *(char *)&v5->field_0 = 0;
                v8 = a0->field_18->field_0;
                *(uint128_t *)((char *)&v5->field_1 + 1) = a0->field_18->field_10;
                *(uint128_t *)((char *)&v5->field_0 + 1) = v8;
                *((char *)&v5->field_11 + 1) = *((char *)&a0->field_28 + 7);
                *((char *)&v5->field_11 + 2) = *(short *)((char *)&a0->field_28 + 6);
                *((char *)&v5->field_11 + 3) = a0->field_28 >> 40;
                *((char *)&v5->field_11 + 4) = *(int *)((char *)&a0->field_28 + 4);
                *((char *)&v5->field_11 + 5) = a0->field_28 >> 24;
                *((char *)&v5->field_11 + 6) = a0->field_28 >> 16;
                *((char *)&v5->field_11 + 7) = a0->field_28 >> 8;
                *((char *)&v5->field_11 + 8) = a0->field_28;
                *((char *)&v5->field_11 + 9) = (unsigned long long)(a0->field_30) >> 8;
                *((char *)&v5->field_11 + 10) = a0->field_30;
                iter = (char *)&v5->field_11 + 11;
                if (a0->field_30)
                {
                    _memcpy(iter, *(long long *)&a0->field_2c);
                    iter += a0->field_30;
                }
                if ((int)sub_9f6918(a0, &iter) >= 1)
                    return v4;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_oct.c", 0xcc, "i2o_SCT");
        sub_a36abc(50, 106, 0);
        v6 = 0;
    }
    sub_a6c2e4(v6, "crypto/ct/ct_oct.c", 249);
    return 0xffffffff;
}
