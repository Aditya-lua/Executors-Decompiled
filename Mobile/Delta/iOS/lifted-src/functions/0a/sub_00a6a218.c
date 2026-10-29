/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a218..0xa6a3e8 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a218_0 {
    struct st_a6a218_0 *field_0;
    struct st_a6a218_0 *field_8;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a6a218_0;


unsigned long long sub_a6a218(unsigned long a0, unsigned int a1, st_a6a218_0 *a2, st_a6a218_0 *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned int a7)
{
    st_a6a218_0 *v2;  // x0
    st_a6a218_0 *v3;  // x27
    st_a6a218_0 **v4;  // x28
    st_a6a218_0 *v5;  // x0
    st_a6a218_0 *v6;  // x0
    st_a6a218_0 *v7;  // x26
    unsigned long long v8;  // x1
    long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68358();
    if (!v2)
        return 0xffffffff;
    if (a1 >= 18)
    {
        sub_a368c8();
        sub_a369bc("crypto/ex_data.c", 37, "get_and_lock");
        sub_a36abc(15, 0x80106, 0);
    }
    else if (v2->field_0)
    {
        v3 = v2;
        if (sub_a7c198(v2->field_0))
        {
            v4 = &v3->field_8;
            if (v4[a1])
            {
LABEL_a6a2bc:
                v6 = sub_a6bf4c(48, "crypto/ex_data.c", 180);
                if (v6)
                {
                    v7 = v6;
                    v6->field_0 = a2;
                    v6->field_8 = a3;
                    v6->field_20 = a6;
                    v6->field_28 = a5;
                    v6->field_18 = a4;
                    v6->field_10 = a7;
                    if (sub_ad68a0(v4[a1], 0))
                    {
                        v8 = sub_ad69e4(v4[a1]) - 1;
                        sub_ad6a28(v4[a1], v8, v7);
                        sub_a7c1b4(v3->field_0);
                        return v8;
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/ex_data.c", 191, "ossl_crypto_get_ex_new_index_ex");
                    sub_a36abc(15, 0x8000f, 0);
                    sub_a6c2e4(v7, "crypto/ex_data.c", 192);
                }
            }
            else
            {
                v5 = sub_ad61b4();
                v4[a1] = v5;
                if (v5 && sub_ad68a0())
                    goto LABEL_a6a2bc;
                v10 = sub_ad6020();
                v4[a1] = 0;
                sub_a368c8(v10);
                sub_a369bc("crypto/ex_data.c", 175, "ossl_crypto_get_ex_new_index_ex");
                sub_a36abc(15, 0x8000f, 0);
            }
            sub_a7c1b4(v3->field_0);
            return 0xffffffff;
        }
    }
    return 0xffffffff;
}
