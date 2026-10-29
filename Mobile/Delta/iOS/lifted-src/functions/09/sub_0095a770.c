/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a770..0x95a828 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_95c45c;

int sub_95a770(long long *a0, long long *a1)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad61b4();
    if (v2)
    {
        v3 = v2;
        if (!*(char *)a1 || (int)sub_9f5c88(a1, 58, 1, &g_95c45c, v3) >= 1 && sub_ad69e4(v3))
        {
            sub_ad6020(*a0);
            *a0 = v3;
            v2 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_ciph.c", 1303, "set_ciphersuites");
            sub_a36abc(20, 185, 0);
            sub_ad6020(v3);
            v2 = 0;
        }
    }
    return v2;
}
