/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00b4c..0xa00d10 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00b4c_2 {
    struct st_a00b4c_2 *field_0;
    long long field_4;
    char field_8;
    char padding_9[103];
    struct st_a00b4c_2 *field_70;
} st_a00b4c_2;

typedef struct st_a00b4c_0 {
    struct st_a00b4c_0 *field_0;
    unsigned int field_4;
    char field_8;
    char padding_9[103];
    struct st_a00b4c_0 *field_70;
} st_a00b4c_0;

typedef struct st_a00b4c_1 {
    char padding_0[32];
    struct st_a00b4c_0 *field_20;
} st_a00b4c_1;


st_a00b4c_2 * sub_a00b4c(long long a0, st_a00b4c_1 *a1)
{
    st_a00b4c_2 *v3;  // x19
    st_a00b4c_2 *v4;  // w0
    st_a00b4c_2 *v5;  // x0
    unsigned long long v6;  // x21
    long long v7;  // x1
    long long v8;  // x1
    long long v9;  // x1
    st_a00b4c_2 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a1->field_20 && *(long long *)&a1->field_20->padding_9[99])
    {
        v3 = sub_9c7910();
        if (!v3)
        {
            sub_a368c8();
            v9 = 177;
            goto LABEL_a00c78;
        }
        v4 = (st_a00b4c_2 *)(unsigned int)sub_a01414(a1->field_20, &v3->field_4);
        *(unsigned int *)&v3->field_0 = (unsigned int)v4;
        if (v4 <= 0)
        {
            sub_a368c8();
            v9 = 183;
LABEL_a00c78:
            sub_a369bc("crypto/dsa/dsa_ameth.c", v9, "dsa_priv_encode");
            v8 = 524301;
            goto LABEL_a00ccc;
        }
        *(unsigned int *)((char *)&v3->field_0 + 4) = 16;
        v5 = sub_9c1acc(*(long long *)&a1->field_20->padding_9[99], 0);
        if (v5)
        {
            v6 = sub_9cf110();
            sub_9c7a84(v5);
            if ((int)v6 > 0)
            {
                if (sub_9ca82c(a0, sub_a99624(116), 0, 16, v3, v0, v6))
                    return 1;
                sub_a6c4e8(v0, v6 & 0xffffffff, "crypto/dsa/dsa_ameth.c", 207);
            }
            else
            {
                sub_a368c8();
                v7 = 201;
LABEL_a00cc0:
                sub_a369bc("crypto/dsa/dsa_ameth.c", v7, "dsa_priv_encode");
                v8 = 109;
LABEL_a00ccc:
                sub_a36abc(10, v8, 0);
            }
        }
        else
        {
            sub_a368c8();
            v7 = 192;
            goto LABEL_a00cc0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ameth.c", 0xaa, "dsa_priv_encode");
        sub_a36abc(10, 101, 0);
        v3 = 0;
    }
    sub_9c7940(v3);
    return 0;
}
