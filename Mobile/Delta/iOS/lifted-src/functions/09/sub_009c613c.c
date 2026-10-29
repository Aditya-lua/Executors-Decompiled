/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c613c..0x9c61a8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c613c(void)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x19
    long long v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9c61a8();
    v4 = v0;
    if (!(unsigned int)v4)
        return v3;
    sub_a368c8();
    sub_a369bc("crypto/asn1/asn1_gen.c", 95, "ASN1_generate_v3");
    sub_a36abc(13, v4, 0);
    return v3;
}
