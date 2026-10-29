/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e860..0xb3e970 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3e860_0 {
    char padding_0[104];
    unsigned int field_68;
} st_b3e860_0;


st_b3e860_0 * sub_b3e860(long long a0, long long a1, long long a2)
{
    st_b3e860_0 *v2;  // x19
    long long v3;  // x21
    st_b3e860_0 *v4;  // w0
    st_b3e860_0 *v5;  // w0
    unsigned int v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a82b98(sub_9f2aec(a0), a1, a2);
    if (!v2)
        return v2;
    v3 = sub_b5b138(a0, "ml-kem.import_pct_type", "random");
    v4 = (st_b3e860_0 *)(unsigned int)sub_b5b200(a0, "ml-kem.retain_seed", 1);
    v2->field_68 = v2->field_68 & 0xfffffff0 | (v2->field_68 & 0xfffffff7 | ((v4 != 0) * 8 | (char)(v4 != 0) >> 29) & 8) & 15;
    v5 = (st_b3e860_0 *)(unsigned int)sub_b5b200(a0, "ml-kem.prefer_seed", 1);
    v2->field_68 = v2->field_68 & 0xfffffff8 | (v2->field_68 & 0xfffffffb | ((v5 != 0) * 4 | (char)(v5 != 0) >> 30) & 4) & 7;
    if (sub_a6e200(v3, "random"))
    {
        if (sub_a6e200(v3, "fixed"))
            v6 = v2->field_68 & 0xfffffffc;
        else
            v6 = v2->field_68 | 2;
    }
    else
    {
        v6 = v2->field_68 | 1;
    }
    v2->field_68 = v6;
    return v2;
}
