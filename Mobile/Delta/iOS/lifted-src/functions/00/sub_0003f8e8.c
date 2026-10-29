/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f8e8..0x3fc90 (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f8e8_6 {
    char padding_0[1348];
    unsigned int field_544;
    char padding_548[40];
    char field_570;
    char field_571;
    char padding_572[6];
    unsigned long long field_578;
    unsigned long long field_580;
    char padding_588[32];
    unsigned long long field_5a8;
    unsigned long long field_5b0;
    char padding_5b8[16];
    unsigned long long field_5c8;
} st_3f8e8_6;

typedef struct st_3f8e8_1 {
    long long field_0;
    char padding_8[176];
    char field_b8;
    char padding_b9[39];
    char field_e0;
    char padding_e1[1307];
    unsigned int field_5fc;
    char padding_600[40];
    char field_628;
    char field_629;
    char padding_62a[6];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    unsigned long long field_660;
    unsigned long long field_668;
    char padding_670[8];
    char field_678;
    char padding_679[7];
    unsigned long long field_680;
} st_3f8e8_1;

typedef struct st_3f8e8_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_3f8e8_2;

typedef struct st_3f8e8_3 {
    char padding_0[32];
    struct st_3f8e8_4 *field_20;
    char padding_28[8];
    struct st_3f8e8_5 *field_30;
    char padding_38[8];
    long long field_40;
} st_3f8e8_3;

typedef struct st_3f8e8_4 {
    long long field_0;
} st_3f8e8_4;

typedef struct st_3f8e8_5 {
    struct st_3f8e8_2 *field_0;
} st_3f8e8_5;

typedef struct st_3f8e8_0 {
    char field_0;
} st_3f8e8_0;

extern unsigned int g_f00b70;

unsigned long long sub_3f8e8(st_3f8e8_1 *a0, st_3f8e8_3 *a1)
{
    unsigned long long v10;  // x27
    unsigned long long v11;  // x26
    long long v20;  // x0
    long long v21;  // x23
    long long v22;  // x0
    long long v23;  // x23
    unsigned long long v24;  // x0
    long long v12;  // x21
    char v13;  // x0
    long long v14;  // x0
    st_3f8e8_6 *v15;  // x1
    unsigned long long v16;  // x25
    unsigned long long v17;  // w0
    st_3f8e8_6 *v18;  // x1
    unsigned long long i;  // x28
    long long v0;  // [bp-0xa0]
    long long v1;  // [bp-0x98]
    unsigned int v2;  // [bp-0x8c]
    st_3f8e8_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_3f8e8_0 *v4;  // [bp-0x80]
    long long v5;  // [bp-0x78], Other Possible Types: unsigned long
    st_3f8e8_6 *v6;  // [bp-0x70], Other Possible Types: long long
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v4 = &v3;
    v3 = &v4;
    v10 = a0->field_668;
    v11 = a0->field_660;
    v5 = (long long)(a0->field_638 - a0->field_630) >> 3;
    v6 = v5;
    v7 = 0;
    v2 = a0->field_5fc;
    sub_15798(&a0->field_678, &v5);
    a0->padding_600[16] = 1;
    v12 = sub_3b87c(a0, a1, 3);
    sub_44fd8(a0, &a1->field_30, v12, 3, 1);
    v13 = sub_3b87c();
    v14 = sub_2b4f8(a0->field_0);
    if (*(int *)&a0->padding_8[0] >= 1 && 2 >= a1->padding_28)
    {
        if (a1->padding_38 != 2)
        {
            if (a1->padding_38 == 1 && *(int *)(*(long long *)a1->field_30 + 8) == g_f00b70)
            {
                v15 = &a0->field_b8;
                v5 = sub_36d28(*(long long *)(*(long long *)a1->field_30 + 32), v15, &a0->field_e0);
                v6 = v15;
                if (sub_36464(&v5, "ipairs") & 1)
                {
                    v16 = 59;
                    goto LABEL_3fa40;
                }
                else
                {
                    v17 = (unsigned int)sub_36464(&v5, "pairs");
LABEL_3fbec:
                    if (v17)
                        v16 = 61;
                    else
                        v16 = 76;
                    goto LABEL_3fa40;
                }
            }
        }
        else
        {
            if (!(a0->field_628 & 1) && !(a0->field_629 & 1))
            {
                v18 = &a0->field_b8;
                v5 = sub_36d28(*(long long *)a1->field_30, v18, &a0->field_e0);
                v6 = v18;
                v17 = (unsigned int)sub_36464(&v5, "next");
                goto LABEL_3fbec;
            }
        }
    }
    v16 = 76;
LABEL_3fa40:
    v1 = sub_2bc4c(a0->field_0);
    sub_2fdb0(a0->field_0, v16, v12, 0);
    v0 = sub_2bc4c(a0->field_0);
    if (a1->padding_28)
    {
        i = 0;
        do
        {
            sub_3f5c4(a0, *(long long *)&a1->field_20[i], v13 + (unsigned int)i & 0xff, v14);
            i += 1;
        } while (i < a1->padding_28);
    }
    sub_38924(a0, a1->field_40);
    sub_3b76c(a0, v5);
    sub_46278(a0, v5);
    sub_395b0(a0, a1);
    v20 = sub_2bc4c(a0->field_0);
    v21 = sub_2bc4c(a0->field_0);
    sub_2fdb0(a0->field_0, 58, v12, 0);
    sub_31514(a0->field_0, *(int *)&a1->padding_28[0] | ((unsigned int)v16 == 59) * 0x80000000);
    v22 = sub_2bc4c(a0->field_0);
    sub_41380(a0, a1, v1, v21);
    sub_41380(a0, a1, v21, v0);
    v23 = (long long)(v10 - v11) >> 4;
    sub_39680(a0, a1, v23, v22, v20);
    sub_39b70(&a0->field_660, v23);
    v24 = sub_c84c(&a0->field_678, a0->field_680 - 24);
    a0->field_5fc = v2;
    return v24;
}
