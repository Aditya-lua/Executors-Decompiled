/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19d38..0xa19e9c (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19d38_0 {
    struct st_a19d38_0 *field_0;
    struct st_a19d38_0 *field_8;
    struct st_a19d38_0 *field_10;
    char padding_18[28];
    unsigned int field_34;
    unsigned int field_38;
    char padding_3c[4];
    char field_40;
    char padding_41[15];
    unsigned long long field_50;
    struct st_a19d38_0 *field_58;
} st_a19d38_0;

extern st_a19d38_0 *g_f086c8;

st_a19d38_0 * sub_a19d38(unsigned long a0, st_a19d38_0 *a1, st_a19d38_0 *a2)
{
    st_a19d38_0 *v2;  // x21
    st_a19d38_0 *v3;  // x19
    st_a19d38_0 *v4;  // x0
    long long v5;  // x20
    long long v6;  // x21
    st_a19d38_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_a6bffc(104, "crypto/ec/ec_kmeth.c", 83);
    if (!v3)
        return v3;
    /* unsupported instruction */;
    v3->field_38 = 1;
    v3->field_50 = a0;
    if (a1 && (v4 = sub_a6d9b4(a1, "crypto/ec/ec_kmeth.c", 95), v3->field_58 = v4, !v4))
    {
LABEL_a19e7c:
        sub_a18c08(v3);
        return 0;
    }
    v5 = 524326;
    v3->field_0 = g_f086c8;
    if (v2)
    {
        if (sub_a32d54(v2))
        {
            v3->field_8 = v2;
LABEL_a19ddc:
            v7 = sub_962b90(v2);
            v3->field_0 = v7;
            if (v7)
            {
LABEL_a19dec:
                *(unsigned int *)&v3->field_10 = 1;
                v3->field_34 = 4;
                if (!sub_a6a660(8, v3, &v3->field_40))
                {
                    v5 = 524303;
                    v6 = 125;
                }
                else if (v3->field_0->field_10)
                {
                    v3->field_0->field_10();
                }
                else
                {
                    return v3;
                }
            }
            else
            {
                v6 = 113;
            }
        }
        else
        {
            v6 = 104;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_kmeth.c", v6, "ossl_ec_key_new_method_int");
        sub_a36abc(16, v5, 0);
        goto LABEL_a19e7c;
    }
    else
    {
        v2 = sub_a35364();
        v3->field_8 = v2;
        if (!v2)
            goto LABEL_a19dec;
        goto LABEL_a19ddc;
    }
}
