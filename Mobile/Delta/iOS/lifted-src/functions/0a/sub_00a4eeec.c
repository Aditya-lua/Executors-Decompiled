/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4eeec..0xa4f00c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_a4eeec(long long a0)
{
    long long *v2;  // x0
    long long *v3;  // x0
    long long *v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa5178();
    if (v2)
    {
        v3 = sub_aa71e0(a0, *v2, 0, 0);
        if (v3)
        {
            v4 = sub_a6bf4c();
            if (!v4)
            {
                return v4;
            }
            else if (!sub_aa71e0(a0, *v2, v4, v3))
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_fetch.c", 604, "evp_get_global_properties_str");
                sub_a36abc(6, 0xc0103, 0);
                sub_a6c2e4(v4, "crypto/evp/evp_fetch.c", 605);
            }
            else
            {
                return v4;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_fetch.c", 596, "evp_get_global_properties_str");
            sub_a36abc(6, 0xc0103, 0);
        }
        return 0;
    }
}
