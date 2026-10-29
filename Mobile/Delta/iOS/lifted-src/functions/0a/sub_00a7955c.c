/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7955c..0xa79674 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7955c_0 {
    struct st_a7955c_0 *field_0;
    struct st_a7955c_0 *field_8;
} st_a7955c_0;


int sub_a7955c(st_a7955c_0 **a0, long long a1, long long a2)
{
    st_a7955c_0 *v2;  // x0
    st_a7955c_0 *v3;  // x19
    st_a7955c_0 *v4;  // x0
    st_a7955c_0 *v5;  // x0
    st_a7955c_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/provider_core.c", 808);
    if (!v2)
        return (unsigned int)v2;
    v3 = v2;
    v4 = sub_a6d9b4(a1, "crypto/provider_core.c", 809);
    v3->field_0 = v4;
    if (v4)
    {
        v5 = sub_a6d9b4(a2, "crypto/provider_core.c", 810);
        v3->field_8 = v5;
        if (v5)
        {
            v6 = *a0;
            if (v6 || (v6 = sub_ad61b4(NULL), *a0 = v6, v6))
            {
                if ((int)sub_ad68a0(v6, v3) > 0)
                    return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/provider_core.c", 816, "infopair_add");
            sub_a36abc(15, 0x8000f, 0);
        }
    }
    sub_a6c2e4(v3->field_0, "crypto/provider_core.c", 824);
    sub_a6c2e4(v3->field_8, "crypto/provider_core.c", 825);
    sub_a6c2e4(v3, "crypto/provider_core.c", 826);
    return 0;
}
