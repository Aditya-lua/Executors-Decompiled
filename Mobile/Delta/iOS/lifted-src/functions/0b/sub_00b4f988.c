/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f988..0xb4f9f4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f988_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[304];
    unsigned int field_140;
    char padding_144[4];
    unsigned int field_148;
} st_b4f988_0;


st_b4f988_0 * sub_b4f988(long long a0)
{
    st_b4f988_0 *v2;  // x0
    st_b4f988_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(608, "providers/implementations/signature/ml_dsa_sig.c", 74);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_8 = sub_9f2aec(a0);
    v3->field_140 = 1;
    v3->field_148 = 1457;
    return v3;
}
