/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae702c..0xae70fc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aef19c;

long long sub_ae702c(long long a0, char *a1)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a1 == 64)
    {
        v2 = sub_ae4a14(a0, a1 + 1);
        if (!v2)
            goto LABEL_ae70a4;
    }
    else
    {
        v2 = sub_aef8d8(a1);
        if (!v2)
        {
LABEL_ae70a4:
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_crld.c", 56, "gnames_from_sectname");
            sub_a36abc(0x22, 150, 0);
            return 0;
        }
    }
    v3 = sub_aec6c0(0, a0, v2);
    if (*a1 != 64)
    {
        sub_ad6958(v2, &g_aef19c);
        return v3;
    }
    sub_ae4a74(a0, v2);
    return v3;
}
