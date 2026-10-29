/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3cc44..0xb3ccf8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3cc44_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    long long field_18;
    long long field_20;
} st_b3cc44_0;


st_b3cc44_0 * sub_b3cc44(unsigned long a0, unsigned int a1, unsigned long a2, unsigned int a3)
{
    long long v2;  // x0
    st_b3cc44_0 *v3;  // x0
    st_b3cc44_0 *v4;  // x20
    st_b3cc44_0 *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (!sub_a2f9e0(v2))
        return 0;
    v3 = sub_a6bffc(40, "providers/implementations/keymgmt/ecx_kmgmt.c", 0x1ff);
    if (!v3)
        return v3;
    v3->field_0 = v2;
    v3->field_10 = a3;
    v3->field_14 = a1;
    v4 = v3;
    if (sub_b3c32c())
        return v4;
    v5 = v4;
    sub_a6c4e8(v4->field_18, v4->field_20, "providers/implementations/keymgmt/ecx_kmgmt.c", 861);
    sub_a6c2e4(v5->field_8, "providers/implementations/keymgmt/ecx_kmgmt.c", 862);
    sub_a6c2e4(v5, "providers/implementations/keymgmt/ecx_kmgmt.c", 863);
    return 0;
}
