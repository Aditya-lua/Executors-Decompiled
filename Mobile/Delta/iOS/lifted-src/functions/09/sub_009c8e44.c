/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c8e44..0x9c8eb8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c8e44_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9c8e44_0;


long long sub_9c8e44(st_9c8e44_0 *a0, long long a1)
{
    long long v3;  // x0
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0->field_8;
    v3 = sub_9cae2c(0, &v0, a0->field_0, a1);
    if (v3)
        return v3;
    sub_a368c8();
    sub_a369bc("crypto/asn1/asn_pack.c", 59, "ASN1_item_unpack");
    sub_a36abc(13, 110, 0);
    return 0;
}
