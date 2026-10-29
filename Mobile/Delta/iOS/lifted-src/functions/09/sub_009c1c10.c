/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1c10..0x9c1cc8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c1c10_0 {
    unsigned int field_0;
    char field_4[4];
    char field_5;
    char padding_6[2];
    long long field_8;
} st_9c1c10_0;


unsigned long long sub_9c1c10(st_9c1c10_0 *a0, long long a1, unsigned int a2)
{
    unsigned long long v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((a0->field_4 & 0xfffffeff) == a2)
    {
        v2 = sub_9e4db0(*(long long *)&a0->field_5, a0->field_0, a1);
        if (v2)
        {
            if (a0->field_4[1] & 1)
            {
                sub_9e5858();
                return v2;
            }
            return v2;
        }
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 521, "asn1_string_to_bn");
        v3 = 105;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 515, "asn1_string_to_bn");
        v3 = 225;
    }
    sub_a36abc(13, v3, 0);
    return 0;
}
