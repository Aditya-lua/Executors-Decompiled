/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c45c..0x95c544 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_95c45c(long long a0, long long a1, long long a2)
{
    long long v4;  // w0
    unsigned long n;  // x20
    long long v6;  // x0
    long long v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = 1;
    if (79 >= a1 && a0 && a1)
    {
        n = a1;
        ___memcpy_chk(&v0, a0, n, 80);
        *((char *)&v0 + n) = 0;
        v6 = sub_955bc8(&v0);
        if (!v6 || sub_ad68a0(a2, v6))
        {
            v4 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_ciph.c", 0x505, "ciphersuite_cb");
            sub_a36abc(20, 0xc0103, 0);
            v4 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
