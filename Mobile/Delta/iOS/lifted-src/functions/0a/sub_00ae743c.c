/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae743c..0xae7568 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9c3580;

unsigned long long sub_ae743c(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v3;  // x21
    unsigned long long v4;  // x19
    unsigned long long v5;  // x22
    unsigned long long *v6;  // x0
    unsigned long long v7;  // x23
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_ad69e4(a2);
    v4 = sub_ad61e0(0, v3);
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_extku.c", 105, "v2i_EXTENDED_KEY_USAGE");
        sub_a36abc(0x22, 0x8000f, 0);
        sub_ad6020(0);
        return v4;
    }
    else if ((int)v3 >= 1)
    {
        v5 = 0;
        while (1)
        {
            v6 = sub_ad69f8(a2, v5);
            v7 = v6[2];
            if (!v6[2])
                v7 = v6[1];
            v8 = sub_a997a4(v7, 0);
            if (!v8)
            {
                sub_a368c8(sub_ad6958(v4, &g_9c3580), &g_9c3580);
                sub_a369bc("crypto/x509/v3_extku.c", 118, "v2i_EXTENDED_KEY_USAGE");
                v0 = v7;
                sub_a36abc(0x22, 110, "%s");
                return 0;
            }
            sub_ad68a0(v4, v8);
            v5 = (unsigned int)v5 + 1;
            if ((unsigned int)v3 == (unsigned int)v5)
                return v4;
        }
    }
    else
    {
        return v4;
    }
}
