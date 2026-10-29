/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1bc24..0xa1bda8 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1bc24_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a1bc24_0 *field_10;
    struct st_a1bc24_0 *field_18;
} st_a1bc24_0;

typedef struct st_a1bc24_1 {
    char padding_0[36];
    unsigned int field_24;
    char padding_28[4];
    unsigned int field_2c;
    struct st_a1bc24_0 *field_30;
    struct st_a1bc24_0 *field_38;
} st_a1bc24_1;


st_a1bc24_0 * sub_a1bc24(st_a1bc24_1 *a0, long long a1)
{
    st_a1bc24_0 *v6;  // x0
    st_a1bc24_0 *v7;  // x21
    st_a1bc24_0 *v8;  // x20
    st_a1bc24_0 **v9;  // x22
    st_a1bc24_0 *v10;  // x0
    unsigned int v0;  // [bp-0x38]
    unsigned int v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0xffffffff;
    v1 = 0xffffffff;
    if (sub_a6fbc4(a1, "point-format"))
    {
        if (sub_a17aa0())
        {
            a0->field_2c = v0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 1513, "ossl_ec_group_set_params");
            sub_a36abc(16, 104, 0);
            return 0;
        }
    }
    if (sub_a6fbc4(a1, "encoding"))
    {
        if (sub_a179d4())
        {
            a0->field_24 = v1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 1522, "ossl_ec_group_set_params");
            sub_a36abc(16, 104, 0);
            return 0;
        }
    }
    v6 = sub_a6fbc4(a1, "seed");
    if (!v6)
        return 1;
    if (v6->field_8 == 5)
    {
        v7 = v6->field_10;
        v8 = v6->field_18;
        v9 = &a0->field_30;
        sub_a6c2e4(a0->field_30, "crypto/ec/ec_lib.c", 534);
        *v9 = 0;
        v9[1] = 0;
        if (!v7)
        {
            return 1;
        }
        else if (v8)
        {
            v10 = sub_a6bf4c(v8, "crypto/ec/ec_lib.c", 541);
            *v9 = v10;
            if (v10)
            {
                _memcpy();
                a0->field_38 = v8;
                return 1;
            }
        }
        else
        {
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_lib.c", 1533, "ossl_ec_group_set_params");
    sub_a36abc(16, 175, 0);
    return 0;
}
