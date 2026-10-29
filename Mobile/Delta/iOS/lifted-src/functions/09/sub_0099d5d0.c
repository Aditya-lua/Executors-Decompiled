/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d5d0..0x99d6a8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_99d5d0(long long *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    *(unsigned int *)&a0[155] = 0;
    if (!a0[350])
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0[76] && a0[93])
        return 2;
    if (sub_c68d5c(a1, 16, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, a0[350], a0[351], 2) && sub_a6e970(a1))
    {
        *(unsigned int *)&a0[155] = 1;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 466, "tls_construct_ctos_alpn");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
