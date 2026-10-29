/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970794..0x97084c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_970794(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_9ffdd0(a6))
    {
        sub_a368c8();
        sub_a369bc("ssl/tls_depr.c", 183, "ssl_set_tmp_ecdh_groups");
        sub_a36abc(20, 290, 0);
        return 0;
    }
    v0 = sub_a1abcc();
    if (!v0)
        return v0;
    return sub_9687c4(a0, a1, a2, a3, a4, a5, &v0, 1);
}
