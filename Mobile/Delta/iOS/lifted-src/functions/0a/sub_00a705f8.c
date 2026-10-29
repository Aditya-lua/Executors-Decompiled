/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa705f8..0xa707f4 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a705f8_0 {
    struct st_a705f8_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a705f8_0 *field_10;
    struct st_a705f8_0 *field_18;
    struct st_a705f8_0 *field_20;
} st_a705f8_0;


double sub_a705f8(st_a705f8_0 *a0, st_a705f8_0 *a1)
{
    unsigned int v3;  // w8
    st_a705f8_0 *v4;  // x8
    st_a705f8_0 *v13;  // x9
    double v14;  // d0
    double v15;  // d0
    st_a705f8_0 *v5;  // x9
    long long v6;  // x1
    double v7;  // d0
    long long v8;  // x1
    double v9;  // d0
    double v10;  // d0
    st_a705f8_0 *v11;  // x8
    unsigned long long v12;  // 4110
    st_a705f8_0 *v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (a0)
    {
        a0->field_20 = 0;
        v3 = a0->field_8;
        if (v3 == 1)
        {
            v4 = a0->field_10;
            if (!v4)
            {
                a0->field_20 = 8;
                return v14;
            }
            v5 = a0->field_18;
            switch (v5)
            {
            case 8:
                goto LABEL_a7072c;
            case 4:
                if (a1 != (int)a1)
                {
                    sub_a368c8();
                    v6 = 796;
                    break;
                }
                else
                {
                    a0->field_20 = 4;
                    *(unsigned int *)&v4->field_0 = (unsigned int)a1;
                    return v7;
                }
            default:
                sub_a70d08();
                return v9;
            }
            goto LABEL_a707bc;
        }
        else if (a1 >= 0 && v3 == 2)
        {
            v4 = a0->field_10;
            if (!v4)
            {
                a0->field_20 = 8;
                return v14;
            }
            v5 = a0->field_18;
            switch (v5)
            {
            case 8:
LABEL_a7072c:
                a0->field_20 = v5;
                v4->field_0 = a1;
                return v10;
            case 4:
                if (a1 <= 0xffffffff)
                {
                    a0->field_20 = 4;
                    *(unsigned int *)&v4->field_0 = (unsigned int)a1;
                    return v7;
                }
                sub_a368c8();
                v6 = 818;
                break;
            default:
                sub_a70d08();
                return v9;
            }
LABEL_a707bc:
            sub_a369bc("crypto/params.c", v6, "OSSL_PARAM_set_int64");
            v8 = 126;
        }
        else if (v3 == 3)
        {
            v11 = a0->field_10;
            if (!v11)
            {
                a0->field_20 = 8;
                return v14;
            }
            else if (a0->field_18 == 8)
            {
                v12 = arm64g_calculate_condition(84, a1, 0, 0);
                if (v12 & 1)
                    v13 = a1;
                else
                    v13 = -a1;
                if (v13 <= 0x1fffffffffffff)
                {
                    a0->field_20 = 8;
                    *(double *)&v11->field_0 = (double)(long long)a1;
                    return (double)(long long)a1;
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 843, "OSSL_PARAM_set_int64");
                v8 = 123;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 846, "OSSL_PARAM_set_int64");
                v8 = 130;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/params.c", 850, "OSSL_PARAM_set_int64");
            v8 = 129;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 779, "OSSL_PARAM_set_int64");
        v8 = 786690;
    }
    sub_a36abc(15, v8, 0);
    return v15;
}
