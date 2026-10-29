/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c95f8..0x9c96ac (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c95f8_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_9c95f8_0;


unsigned long long sub_9c95f8(st_9c95f8_0 *a0, long long a1, int a2)
{
    int v2;  // w22
    long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 4 && a0->field_8)
    {
        v2 = a2;
        v3 = sub_c4c40(a0->field_8);
        v4 = sub_9c7b68(a0->field_8);
        if ((int)v4 < v2)
            v2 = v4;
        if (!a1)
        {
            return v4;
        }
        else if (v2 >= 1)
        {
            _memcpy(a1, v3);
            return v4;
        }
        else
        {
            return v4;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/evp_asn1.c", 40, "ASN1_TYPE_get_octetstring");
    sub_a36abc(13, 109, 0);
    return 0xffffffff;
}
