/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2a34..0x9c2af0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c2a34(long long a0, int *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9c5788(0, 0xffffffff, a0);
    if ((int)v2 <= 0)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_mbstr.c", 305, "out_utf8");
        sub_a36abc(13, 134, 0);
        return v2;
    }
    else if ((int)((unsigned int)v2 ^ 0x7fffffff) > *a1)
    {
        *a1 = *a1 + (unsigned int)v2;
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_mbstr.c", 310, "out_utf8");
        sub_a36abc(13, 151, 0);
        return 0xffffffff;
    }
}
