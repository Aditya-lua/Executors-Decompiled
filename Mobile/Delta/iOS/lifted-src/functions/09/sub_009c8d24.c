/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c8d24..0x9c8e44 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c8d24_0 {
    struct st_9c8d24_0 *field_0;
    struct st_9c8d24_0 *field_8;
} st_9c8d24_0;


st_9c8d24_0 * sub_9c8d24(long long a0, long long a1, st_9c8d24_0 *a2)
{
    st_9c8d24_0 *v2;  // x19
    unsigned int v3;  // w0
    long long v4;  // x21
    long long v5;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2 || (v2 = a2->field_0, !a2->field_0))
    {
        v2 = sub_9c7910();
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/asn_pack.c", 22, "ASN1_item_pack");
            sub_a36abc(13, 0x8000d, 0);
            return v2;
        }
    }
    sub_9c79a0(v2, 0, 0);
    v3 = sub_9ccc7c(a0, &v2->field_8, a1);
    *(unsigned int *)&v2->field_0 = v3;
    if ((int)v3 >= 1)
    {
        if (v2->field_8)
        {
            if (!a2 || a2->field_0)
                return v2;
            a2->field_0 = v2;
            return v2;
        }
        v4 = 524301;
        v5 = 36;
    }
    else
    {
        v4 = 112;
        v5 = 32;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/asn_pack.c", v5, "ASN1_item_pack");
    sub_a36abc(13, v4, 0);
    if (!a2 || !a2->field_0)
        sub_9c7940(v2);
    return 0;
}
