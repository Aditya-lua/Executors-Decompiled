/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99dfcc..0x99e0a4 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_99dfcc(void* a0, long long a1)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[2856])
        return 2;
    if (sub_c68d5c(a1, 44, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, (long long)a0[2848], (long long)a0[2856], 2) && sub_a6e970(a1))
    {
        v2 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 804, "tls_construct_ctos_cookie");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        v2 = 0;
    }
    sub_a6c2e4((long long)a0[2848], "ssl/statem/extensions_clnt.c", 810);
    *(uint128_t *)&a0[2848] = 0;
    return v2;
}
