/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38f3c..0xb39160 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b38f3c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b38f3c_0 *field_10;
    struct st_b38f3c_0 *field_18;
} st_b38f3c_0;


st_b38f3c_0 * sub_b38f3c(st_b38f3c_0 **a0, long long a1)
{
    st_b38f3c_0 *v2;  // x0
    st_b38f3c_0 *v3;  // x0
    st_b38f3c_0 *v12;  // x0
    st_b38f3c_0 *v13;  // x0
    st_b38f3c_0 *v14;  // x0
    st_b38f3c_0 *v15;  // x0
    st_b38f3c_0 *v4;  // x0
    st_b38f3c_0 *v5;  // x0
    st_b38f3c_0 *v6;  // x0
    st_b38f3c_0 *v7;  // x22
    st_b38f3c_0 *v8;  // x21
    st_b38f3c_0 **v9;  // x23
    st_b38f3c_0 *v10;  // x0
    st_b38f3c_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b39248();
    if (!(unsigned int)v2)
        return v2;
    if (sub_a6fbc4(a1, "gindex"))
    {
        v3 = sub_a6fc2c();
        if (!(unsigned int)v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "pcounter"))
    {
        v4 = sub_a6fc2c();
        if (!(unsigned int)v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "hindex"))
    {
        v5 = sub_a6fc2c();
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6fbc4(a1, "seed");
    if (!v6)
    {
LABEL_b3902c:
        if (sub_a6fbc4(a1, "qbits"))
        {
            v11 = sub_a70ef8();
            if (!(unsigned int)v11)
                return v11;
        }
        v12 = sub_a6fbc4(a1, "digest");
        if (v12)
        {
            if (v12->field_8 == 4)
            {
                sub_a6c2e4(a0[10], "providers/implementations/keymgmt/dh_kmgmt.c", 631);
                v13 = sub_a6d9b4(v12->field_10, "providers/implementations/keymgmt/dh_kmgmt.c", 632);
                a0[10] = v13;
                if (!v13)
                    return v13;
                goto LABEL_b390a4;
            }
        }
        else
        {
LABEL_b390a4:
            v14 = sub_a6fbc4(a1, "properties");
            if (v14)
            {
                if (v14->field_8 == 4)
                {
                    sub_a6c2e4(a0[11], "providers/implementations/keymgmt/dh_kmgmt.c", 640);
                    v15 = sub_a6d9b4(v14->field_10, "providers/implementations/keymgmt/dh_kmgmt.c", 641);
                    a0[11] = v15;
                    if (!v15)
                        return v15;
                    goto LABEL_b390fc;
                }
            }
            else
            {
LABEL_b390fc:
                if (!sub_a6fbc4(a1, "safeprime-generator"))
                    return 1;
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/dh_kmgmt.c", 649, "dhx_gen_set_params");
                sub_a36abc(57, 0x8010c, 0);
            }
        }
    }
    else if (v6->field_8 == 5)
    {
        v7 = v6->field_10;
        v8 = v6->field_18;
        v9 = a0 + 5;
        sub_a6c4e8(a0[5], a0[6], "providers/implementations/keymgmt/dh_kmgmt.c", 513);
        *v9 = 0;
        v9[1] = 0;
        if (v7 && v8)
        {
            v10 = sub_a6dac4(v7, v8, "providers/implementations/keymgmt/dh_kmgmt.c", 517);
            *v9 = v10;
            if (!v10)
                return v10;
            a0[6] = v8;
            goto LABEL_b3902c;
        }
    }
    return 0;
}
