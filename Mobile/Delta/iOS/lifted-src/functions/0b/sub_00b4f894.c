/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f894..0xb4f988 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f894_0 {
    unsigned long long field_0;
    struct st_b4f894_0 *field_8;
    char padding_10[8];
    struct st_b4f894_0 *field_18;
} st_b4f894_0;


st_b4f894_0 * sub_b4f894(long long a0, st_b4f894_0 *a1, unsigned long a2)
{
    st_b4f894_0 *v2;  // x19
    st_b4f894_0 *v3;  // x8
    st_b4f894_0 *v4;  // x20
    st_b4f894_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(32, "providers/implementations/signature/mac_legacy_sig.c", 58);
    if (!v2)
        return v2;
    v2->field_0 = sub_9f2aec(a0);
    if (!a1 || (v3 = sub_a6d9b4(a1, "providers/implementations/signature/mac_legacy_sig.c", 63), v2->field_8 = v3, v3))
    {
        v4 = sub_a58724();
        if (v4)
        {
            v5 = sub_a57e48(v4);
            v2->field_18 = v5;
            if (v5)
            {
                sub_a58aa4(v4);
                return v2;
            }
        }
    }
    else
    {
        v4 = 0;
    }
    sub_a6c2e4(v2->field_8, "providers/implementations/signature/mac_legacy_sig.c", 79);
    sub_a6c2e4(v2, "providers/implementations/signature/mac_legacy_sig.c", 80);
    sub_a58aa4(v4);
    return 0;
}
