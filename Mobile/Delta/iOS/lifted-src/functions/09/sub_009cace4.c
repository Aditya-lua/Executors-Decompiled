/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cace4..0x9cad7c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9cace4(unsigned long long a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0 && a3)
    {
        v1 = 0;
        v2 = 0;
        v0 = 0;
        v5 = sub_9cae38();
        if (0 < (int)v5)
            return v5;
        sub_9cdc2c(a0, a3);
        return v5;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/tasn_dec.c", 140, "asn1_item_ex_d2i_intern");
    sub_a36abc(13, 0xc0102, 0);
    return 0;
}
