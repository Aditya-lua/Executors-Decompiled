/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00934..0xa00acc (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00934_2 {
    char padding_0[32];
    struct st_a00934_1 *field_20;
    char padding_28[32];
    struct st_a00934_0 *field_48;
} st_a00934_2;

typedef struct st_a00934_0 {
    struct st_a00934_0 *field_0;
} st_a00934_0;

typedef struct st_a00934_1 {
    char padding_0[8];
    struct st_a00934_0 *field_8;
    struct st_a00934_0 *field_10;
    struct st_a00934_0 *field_18;
    char padding_20[72];
    long long field_68;
} st_a00934_1;


st_a00934_0 ** sub_a00934(long long a0, st_a00934_2 *a1)
{
    st_a00934_1 *v3;  // x21
    st_a00934_0 **v4;  // x19
    st_a00934_0 **v5;  // w0
    long long v6;  // x22
    long long v7;  // x1
    st_a00934_0 **v8;  // x0
    unsigned long long v9;  // x21
    st_a00934_0 **v10;  // x0
    st_a00934_0 **v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a1->field_20;
    if ((int)a1->field_48 && v3->field_8 && v3->field_10 && v3->field_18)
    {
        v4 = sub_9c7910();
        if (v4)
        {
            v5 = (st_a00934_0 **)(unsigned int)sub_a01414(v3, v4 + 1);
            *(unsigned int *)v4 = (unsigned int)v5;
            if (v5 > 0)
            {
                v6 = 16;
LABEL_a009ac:
                v8 = sub_9c1acc(v3->field_68, 0);
                if (v8)
                {
                    v9 = sub_9cf110();
                    sub_9cf124(v8);
                    if ((int)v9 > 0)
                    {
                        v10 = sub_a99624(116);
                        if (!v10)
                        {
                            sub_a6c2e4(v0, "crypto/dsa/dsa_ameth.c", 138);
                            sub_9c7940(v4);
                            return 0;
                        }
                        else if (sub_afbeac(a0, v10, v6, v4, v0, v9))
                        {
                            return 1;
                        }
                        else
                        {
                            sub_a6c2e4(v0, "crypto/dsa/dsa_ameth.c", 138);
                            sub_9c7940(v4);
                            return 0;
                        }
                    }
                    sub_a368c8();
                    v7 = 126;
                }
                else
                {
                    sub_a368c8();
                    v7 = 118;
                }
            }
            else
            {
                sub_a368c8();
                v7 = 108;
            }
        }
        else
        {
            sub_a368c8();
            v7 = 103;
        }
        sub_a369bc("crypto/dsa/dsa_ameth.c", v7, "dsa_pub_encode");
        sub_a36abc(10, 0x8000d, 0);
        sub_a6c2e4(v0, "crypto/dsa/dsa_ameth.c", 138);
        sub_9c7940(v4);
        return 0;
    }
    v4 = 0;
    v6 = 0xffffffff;
    goto LABEL_a009ac;
}
