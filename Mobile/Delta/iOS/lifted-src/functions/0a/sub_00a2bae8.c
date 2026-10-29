/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2bae8..0xa2bb6c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2bae8(unsigned long a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    switch (a1)
    {
    case 7:
        return 1;
    case 1:
        if (a3)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            if (sub_a565a0() == a3)
                return 1;
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_meth.c", 907, "pkey_ecd_ctrl");
            sub_a36abc(16, 138, 0);
            return 0;
        }
        else
        {
            return 1;
        }
    default:
        return -0x2;
    }
}
