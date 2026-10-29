/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78854..0xa788e8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a78854_0 {
    unsigned long long field_0;
    struct st_a78854_0 *field_8;
    struct st_a78854_0 *field_10;
    struct st_a78854_0 *field_18;
    struct st_a78854_0 *field_20;
    char padding_28[32];
    char field_48;
} st_a78854_0;

extern long long g_a788e8;

st_a78854_0 * sub_a78854(unsigned long a0)
{
    st_a78854_0 *v2;  // x19
    st_a78854_0 *v3;  // x0
    st_a78854_0 *v4;  // x0
    st_a78854_0 *v5;  // x0
    st_a78854_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(80, "crypto/provider_core.c", 311);
    if (v2)
    {
        v3 = sub_ad6270(&g_a788e8);
        v2->field_8 = v3;
        if (v3)
        {
            v4 = sub_a7c11c();
            v2->field_18 = v4;
            if (v4)
            {
                v5 = sub_ad61b4();
                v2->field_10 = v5;
                if (v5)
                {
                    v6 = sub_a7c11c();
                    v2->field_20 = v6;
                    if (v6)
                    {
                        v2->field_0 = a0;
                        v2->field_48 = v2->field_48 | 1;
                        return v2;
                    }
                }
            }
        }
    }
    sub_a786e8(v2);
    return 0;
}
