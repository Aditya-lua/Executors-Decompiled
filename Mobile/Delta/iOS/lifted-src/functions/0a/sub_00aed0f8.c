/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed0f8..0xaed22c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aed0f8_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
} st_aed0f8_0;


st_aed0f8_0 * sub_aed0f8(unsigned long a0, char a1, long long a2)
{
    char v3;  // x0
    char v4;  // x8
    st_aed0f8_0 *v5;  // x0
    long long v6;  // x1
    char v0;  // [bp-0x28], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!_strcmp(a2, "none"))
        return sub_9cf0ec();
    if (_strcmp(a2, "hash"))
    {
        v3 = sub_9cf0ec();
        if (v3)
        {
            v4 = sub_a6df78(a2, &v0);
            v5 = (st_aed0f8_0 *)v3;
            *(unsigned long long *)&v5->field_8 = v4;
            if (v4)
            {
                v5->field_0 = v0;
                return v5;
            }
            sub_9cf0f4(v5);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_skid.c", 40, "s2i_ASN1_OCTET_STRING");
            v6 = 524301;
LABEL_aed210:
            sub_a36abc(0x22, v6, 0);
        }
        return 0;
    }
    if (a1)
    {
        if (*(char *)a1 & 1)
            return sub_9cf0ec();
        if (!*(long long *)(a1 + 16) && !*(long long *)(a1 + 24))
            goto LABEL_aed1ec;
    }
    else
    {
LABEL_aed1ec:
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_skid.c", 103, "s2i_skey_id");
        v6 = 125;
        goto LABEL_aed210;
    }
    goto LABEL_aed210;
}
