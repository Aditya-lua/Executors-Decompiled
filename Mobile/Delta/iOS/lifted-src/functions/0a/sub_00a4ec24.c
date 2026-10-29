/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ec24..0xa4edac (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_a4ec24(long long a0, long long a1, long long a2, long long *a3)
{
    long long *v2;  // x21
    long long *v3;  // x0
    long long *v4;  // x24
    long long *v5;  // x0
    long long *v6;  // x0
    long long *v7;  // x22
    long long *v8;  // x20
    long long v10;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    v3 = sub_aa5178(a0, a2);
    if (v3 && v2)
    {
        v4 = v3;
        if (!a3)
        {
            sub_aa51e0(a0);
        }
        else if (sub_aa51bc(a0))
        {
            return 0;
        }
        v5 = sub_aa71e0(a0, a1, 0, 0);
        if (v5 && !(v6 = sub_a6bf4c(), !v6))
        {
            v7 = v6;
            if (sub_aa71e0(a0, a1, v7, v5))
            {
                sub_a7a600(a0, v7);
                sub_a6c2e4(v7, "crypto/evp/evp_fetch.c", 496);
                sub_aa6fd0(*v4);
                *v4 = a1;
                v8 = sub_aa5a74(v2);
                sub_a2e1e4(a0);
                return v8;
            }
            sub_a368c8(sub_a6c2e4(v7, "crypto/evp/evp_fetch.c", 491), "crypto/evp/evp_fetch.c", 491);
            v10 = 492;
        }
        else
        {
            sub_a368c8();
            v10 = 485;
        }
    }
    else
    {
        sub_a368c8();
        v10 = 507;
    }
    sub_a369bc("crypto/evp/evp_fetch.c", v10, "evp_set_parsed_default_properties");
    sub_a36abc(6, 0xc0103, 0);
    return 0;
}
