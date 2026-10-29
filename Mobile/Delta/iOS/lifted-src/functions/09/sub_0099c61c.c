/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c61c..0x99c6f0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_99c61c(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9b20cc();
    if (!v2 || !sub_ad69e4())
        return 2;
    if (sub_c68d5c(a1, 47, 2) && sub_c6876c(a1, 2))
    {
        v3 = sub_9b211c(a0, v2, a1);
        if (!(unsigned int)v3)
            return v3;
        if (sub_a6e970(a1))
            return 1;
        v4 = 1258;
    }
    else
    {
        v4 = 1248;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions.c", v4, "tls_construct_certificate_authorities");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
    return 2;
}
