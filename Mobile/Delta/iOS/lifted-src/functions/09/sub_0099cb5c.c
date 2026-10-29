/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99cb5c..0x99cc60 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_99cb5c(long long a0, long long a1)
{
    unsigned long long v6;  // x0
    long long v7;  // x21
    unsigned int v0;  // [bp-0x48]
    unsigned int v1;  // [bp-0x44]
    long long v2;  // [bp-0x40]
    long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9ae540();
    if ((unsigned int)v6)
    {
        v7 = 193;
    }
    else if (sub_99cc60(a0, v1, v0))
    {
        v6 = 786691;
        sub_96908c(a0, &v3, &v2);
        if (sub_c68d5c(a1, 11, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, v3, v2, 1) && sub_a6e970(a1))
            return 1;
        v7 = 207;
    }
    else
    {
        return 2;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", v7, "tls_construct_ctos_ec_pt_formats");
    sub_9a58a4(a0, 80, v6, 0);
    return 0;
}
