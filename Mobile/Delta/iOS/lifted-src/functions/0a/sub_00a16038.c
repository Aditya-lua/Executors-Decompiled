/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16038..0xa16104 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8e950;

unsigned long long sub_a16038(unsigned long a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a15520();
    if (v2)
    {
        v3 = v2;
        v4 = sub_9ccc7c();
        if ((unsigned int)v4)
        {
            sub_9cd960(v3, &g_e8e950);
            return v4;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 911, "i2d_ECPKParameters");
        sub_a36abc(16, 121, 0);
        sub_9cd960(v3, &g_e8e950);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 907, "i2d_ECPKParameters");
        sub_a36abc(16, 120, 0);
    }
    return 0;
}
