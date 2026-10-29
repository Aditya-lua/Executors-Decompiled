/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c03b8..0x9c0540 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c03b8_0 {
    struct st_9c03b8_0 *field_0;
    char field_4;
} st_9c03b8_0;

typedef struct st_9c03b8_1 {
    char field_0;
} st_9c03b8_1;


st_9c03b8_0 * sub_9c03b8(st_9c03b8_0 *a0, st_9c03b8_1 **a1, long long a2)
{
    st_9c03b8_0 *v2;  // x19
    unsigned long long v3;  // x21
    char *v4;  // x22
    char *v5;  // x22
    long long v6;  // x27
    long long v7;  // x23
    st_9c03b8_0 *v8;  // x24
    st_9c03b8_0 *v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 < 1)
    {
        v2 = 0;
        v3 = 152;
    }
    else if ((unsigned long long)a2 > 0x7fffffff)
    {
        v2 = 0;
        v3 = 151;
    }
    else
    {
        if (!a0 || (v2 = a0->field_0, !a0->field_0))
        {
            v2 = sub_9cf14c();
            if (!v2)
                return v2;
        }
        v4 = *a1;
        v3 = *v4;
        v5 = v4 + 1;
        if ((unsigned int)v3 > 7)
        {
            v3 = 220;
        }
        else
        {
            v6 = a2;
            sub_9c76f4(v2, v3);
            v7 = v6 - 1;
            if (v6 == 1)
            {
                v8 = 0;
                goto LABEL_9c0510;
            }
            else
            {
                v9 = sub_a6bf4c(v7, "crypto/asn1/a_bitstr.c", 121);
                if (v9)
                {
                    v8 = v9;
                    _memcpy();
                    *((char *)v8 + v6 - 2) = *((char *)v8 + v6 - 2) & (char)(0xff << ((char)v3 & 31));
                    v5 = &v4[v6];
LABEL_9c0510:
                    sub_9c79a0(v2, v8, v7);
                    *(unsigned int *)((char *)&v2->field_0 + 4) = 3;
                    if (a0)
                        a0->field_0 = v2;
                    *a1 = v5;
                    return v2;
                }
                else if (!((unsigned int)v3))
                {
                    goto LABEL_9c046c;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/a_bitstr.c", 139, "ossl_c2i_ASN1_BIT_STRING");
    sub_a36abc(13, v3, 0);
LABEL_9c046c:
    if (!a0 || a0->field_0 != v2)
        sub_9cf0f4(v2);
    return 0;
}
