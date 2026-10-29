/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaec6c0..0xaec7b0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ae75b0;

unsigned long long sub_aec6c0(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x20
    unsigned long long v4;  // x24
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a2);
    v3 = sub_ad61e0(0, v2);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 481, "v2i_GENERAL_NAMES");
        sub_a36abc(0x22, 0x8000f, 0);
        return v3;
    }
    else if ((int)v2 >= 1)
    {
        v4 = 0;
        while (1)
        {
            v5 = sub_aec7c8(0, a0, a1, sub_ad69f8(a2, v4), 0);
            if (!v5)
            {
                sub_ad6958(v3, &g_ae75b0);
                return 0;
            }
            sub_ad68a0(v3, v5);
            v4 = (unsigned int)v4 + 1;
            if ((unsigned int)v2 == (unsigned int)v4)
                return v3;
        }
    }
    else
    {
        return v3;
    }
}
