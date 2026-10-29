/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4880..0xae4a14 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4880_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_ae4880_2;

typedef struct st_ae4880_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_ae4880_0;

typedef struct st_ae4880_1 {
    char padding_0[96];
    struct st_ae4880_0 *field_60;
} st_ae4880_1;


unsigned long long sub_ae4880(st_ae4880_1 *a0, unsigned long a1, long long a2)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x22
    st_ae4880_2 *v5;  // x23
    unsigned long long v6;  // x25
    unsigned long long *v7;  // x26
    unsigned long long *v8;  // x26
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9cf14c();
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_bitst.c", 65, "v2i_ASN1_BIT_STRING");
        sub_a36abc(0x22, 0x8000d, 0);
        return v3;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v4 = 0;
        while (1)
        {
            v5 = sub_ad69f8(a2, v4);
            v6 = a0->field_60->field_8;
            if (!a0->field_60->field_8)
                break;
            v7 = &a0->field_60->field_10;
            while (1)
            {
                v8 = v7;
                if (!_strcmp(*v8, v5->field_8) || !_strcmp(v6, v5->field_8))
                    break;
                v6 = v8[2];
                v7 = v8 + 3;
                if (!v8[2])
                    goto LABEL_ae4980;
            }
            if (!sub_9c0540(v3, *(int *)((char *)v8 - 16), 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_bitst.c", 74, "v2i_ASN1_BIT_STRING");
                sub_a36abc(0x22, 0x8000d, 0);
                sub_9cf0f4(v3);
                return 0;
            }
            if (!*(long long *)((char *)v8 - 8))
                break;
            v4 = (unsigned int)v4 + 1;
            if ((int)v4 >= (int)sub_ad69e4(a2))
                return v3;
        }
LABEL_ae4980:
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_bitst.c", 82, "v2i_ASN1_BIT_STRING");
        v0 = v5->field_8;
        sub_a36abc(0x22, 111, "%s");
        sub_9cf0f4(v3);
        return 0;
    }
    else
    {
        return v3;
    }
}
