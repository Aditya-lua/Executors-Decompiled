/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7770..0x9c7864 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7770_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9c7770_0;


unsigned long long sub_9c7770(st_9c7770_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long len;  // x21
    unsigned long long v3;  // x22
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a2 >> 31 & 1))
    {
        len = a2 & 0xffffffff;
    }
    else if (a1)
    {
        len = _strlen(a1);
    }
    else
    {
        return 0;
    }
    if (len >= 0x7fffffff)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_lib.c", 305, "ASN1_STRING_set");
        sub_a36abc(13, 223, 0);
        return 0;
    }
    if (a0->field_0 > len)
    {
        if (a0->field_8)
            goto LABEL_9c7824;
        v3 = 0;
    }
    else
    {
        v3 = a0->field_8;
    }
    v4 = sub_a6c1b4(v3, len + 1, "crypto/asn1/asn1_lib.c", 314);
    a0->field_8 = v4;
    if (!v4)
    {
        a0->field_8 = v3;
        return v4;
    }
LABEL_9c7824:
    a0->field_0 = len;
    if (!a1)
        return 1;
    _memcpy();
    *(char *)(a0->field_8 + len) = 0;
    return 1;
}
