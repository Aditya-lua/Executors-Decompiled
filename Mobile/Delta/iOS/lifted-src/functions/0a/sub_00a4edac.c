/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4edac..0xa4eeec (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4edac_0 {
    struct st_a4edac_0 *field_0;
} st_a4edac_0;


st_a4edac_0 ** sub_a4edac(long long a0, st_a4edac_0 **a1, unsigned long a2)
{
    long long v2;  // x20
    st_a4edac_0 **v3;  // x0
    st_a4edac_0 **v4;  // x0
    st_a4edac_0 **v5;  // x20
    long long v6;  // x1
    long long v7;  // x2
    long long v8;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        v2 = "-fips";
    else
        v2 = "fips=yes";
    v3 = sub_aa5178();
    if (v3 && *v3)
    {
        v4 = sub_aa6be0(a0, v2, 1);
        if (v4)
        {
            v5 = sub_aa6fe0();
            sub_aa6fd0(v4);
            if (v5)
                goto LABEL_a4ee64;
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_fetch.c", 549, "evp_default_properties_merge");
            v6 = 524303;
        }
        else
        {
            sub_a368c8();
            v7 = "evp_default_properties_merge";
            v8 = 543;
LABEL_a4eec4:
            sub_a369bc("crypto/evp/evp_fetch.c", v8, v7);
            v6 = 210;
        }
        sub_a36abc(6, v6, 0);
        return 0;
    }
    v5 = sub_aa6be0(a0, v2, 1);
    if (v5)
    {
LABEL_a4ee64:
        if (!sub_a4ec24(a0, v5, 0, 0))
        {
            sub_aa6fd0(v5);
            return 0;
        }
        return 1;
    }
    sub_a368c8();
    v7 = "evp_set_default_properties_int";
    v8 = 517;
    goto LABEL_a4eec4;
    goto LABEL_a4eec4;
}
