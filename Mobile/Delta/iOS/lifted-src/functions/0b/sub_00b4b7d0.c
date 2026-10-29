/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b7d0..0xb4b878 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4b7d0_0 {
    unsigned long long field_0;
    struct st_b4b7d0_0 *field_8;
    char padding_10[12];
    char field_1c;
} st_b4b7d0_0;


st_b4b7d0_0 * sub_b4b7d0(long long a0, st_b4b7d0_0 *a1)
{
    st_b4b7d0_0 *v2;  // x0
    st_b4b7d0_0 *v3;  // x21
    st_b4b7d0_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(392, "providers/implementations/signature/dsa_sig.c", 135);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_0 = sub_9f2aec(a0);
    v3->field_1c = v3->field_1c | 2;
    if (!a1)
        return v3;
    v4 = sub_a6d9b4(a1, "providers/implementations/signature/dsa_sig.c", 142);
    v3->field_8 = v4;
    if (v4)
        return v3;
    sub_a6c2e4(v3, "providers/implementations/signature/dsa_sig.c", 143);
    return 0;
}
