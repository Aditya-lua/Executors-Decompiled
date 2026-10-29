/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8028..0xab8134 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab8028(unsigned long a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v9;  // x8
    long long v11;  // x19
    long long v12;  // x20
    unsigned int v13;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    switch (a1)
    {
    case 3:
        v11 = 141;
        v12 = 405;
        break;
    case 5:
        v9 = sub_9c7b68();
        v11 = 157;
        v12 = 437;
        if ((int)v9 <= 671)
        {
            v13 = (unsigned int)v9 - 64;
            if (53 >= v13 && 1 << ((char)v13 & 63) & 0x24000080000001)
                return 1;
            if ((unsigned int)v9 - 3 < 2)
                return 1;
            if ((unsigned int)v9 == 0x101)
                return 1;
        }
        else if ((unsigned int)v9 - 1094 < 6)
        {
            return 1;
        }
        else if ((unsigned int)v9 - 672 < 4)
        {
            return 1;
        }
    default:
        v9 = sub_9c7b68();
        v11 = 157;
        v12 = 437;
        if ((int)v9 <= 671)
        {
            v13 = (unsigned int)v9 - 64;
            if (53 >= v13 && 1 << ((char)v13 & 63) & 0x24000080000001)
                return 1;
            if ((unsigned int)v9 - 3 < 2)
                return 1;
            if ((unsigned int)v9 == 0x101)
                return 1;
        }
        else if ((unsigned int)v9 - 1094 < 6)
        {
            return 1;
        }
        else if ((unsigned int)v9 - 672 < 4)
        {
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/rsa/rsa_pmeth.c", v12, "check_padding_md");
    sub_a36abc(4, v11, 0);
    return 0;
}
