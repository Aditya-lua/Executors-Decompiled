/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c321c..0x9c32d0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c321c(long long a0, unsigned long long *a1, long long a2)
{
    unsigned long long v6;  // x0
    long long v7;  // x19
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x34], Other Possible Types: unsigned int
    long long v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *a1;
    if (!(sub_9c7328(&v3, &v2, &v1, &v0, a2) >> 7 & 1))
    {
        if (v1 == 6)
        {
            v6 = sub_9c32d0(a0, &v3, v2);
            if (!v6)
                return v6;
            *a1 = v3;
            return v6;
        }
        v7 = 116;
    }
    else
    {
        v7 = 0x66;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/a_object.c", 234, "d2i_ASN1_OBJECT");
    sub_a36abc(13, v7, 0);
    return 0;
}
