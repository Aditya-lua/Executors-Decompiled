/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7d58..0xaa7e04 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_aa7d58(long long *a0, long long a1, unsigned long a2)
{
    long long *v2;  // x0
    long long *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c(a1, 3);
    if (v2)
    {
        if (sub_a7c17c(*v2))
        {
            v3 = sub_ad69f8();
            sub_a7c1b4(*v2);
            return v3;
        }
        sub_a368c8();
        sub_a369bc("crypto/property/property_string.c", 228, "ossl_property_str");
        sub_a36abc(15, 0xc010f, 0);
    }
    return 0;
}
