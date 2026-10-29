/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67978..0xa67a1c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a67978_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    long long field_10;
} st_a67978_0;

extern long long g_a67a1c;

st_a67978_0 * sub_a67978(void)
{
    long long v2;  // x20
    st_a67978_0 *v3;  // x19
    st_a67978_0 *v4;  // x0
    st_a67978_0 *v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2a38();
    v3 = sub_ad6270(&g_a67a1c);
    if (!sub_9f2ae0(v2))
    {
        return v3;
    }
    else if (v3)
    {
        v4 = sub_a6bf4c(24, "crypto/comp_methods.c", 38);
        if (!v4)
            return v3;
        v5 = v4;
        v4->field_10 = v2;
        v4->field_0 = 1;
        v5->field_8 = sub_9f2aec(v2);
        if (sub_ad68a0(v3, v5))
            return v3;
        sub_a6c2e4(v5, "crypto/comp_methods.c", 44);
        return v3;
    }
    else
    {
        return v3;
    }
}
