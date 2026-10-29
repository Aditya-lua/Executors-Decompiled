/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d9b0..0x99daf0 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_99d9b0(long long a0, long long a1)
{
    unsigned long long v4;  // x0
    long long v5;  // x21
    unsigned long v6;  // x22
    unsigned long v7;  // x22
    int v0;  // [bp-0x38]
    unsigned int v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9ae540();
    if ((unsigned int)v4)
    {
        v5 = 578;
    }
    else
    {
        if (772 > v0)
            return 2;
        v4 = 786691;
        if (sub_c68d5c(a1, 43, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 1))
        {
            v6 = v0;
            if ((int)v6 >= (int)v1)
            {
                do
                {
                    v7 = v6;
                    if (!sub_c68d5c(a1, v7, 2))
                    {
                        v5 = 598;
                        goto LABEL_99d9e8;
                    }
                } while ((v6 = v7 - 1, v1 < (long long)v7));
            }
            if (sub_a6e970(a1) && sub_a6e970(a1))
                return 1;
            v5 = 603;
        }
        else
        {
            v5 = 592;
        }
    }
LABEL_99d9e8:
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", v5, "tls_construct_ctos_supported_versions");
    sub_9a58a4(a0, 80, v4, 0);
    return 0;
}
