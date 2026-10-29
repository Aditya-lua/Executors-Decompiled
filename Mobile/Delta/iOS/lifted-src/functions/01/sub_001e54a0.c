/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e54a0..0x1e551c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e54a0_0 {
    struct st_1e54a0_0 *field_0;
    struct st_1e54a0_0 *field_8;
    char padding_10[8];
    struct st_1e54a0_0 *field_18;
    struct st_1e54a0_0 *field_20;
    struct st_1e54a0_0 *field_28;
    struct st_1e54a0_0 *field_30;
    char padding_38[24];
    struct st_1e54a0_0 *field_50;
    char padding_58[8];
    struct st_1e54a0_0 *field_60;
    char padding_68[1304];
    struct st_1e54a0_0 *field_580;
} st_1e54a0_0;

extern st_1e54a0_0 *g_f0d198;

st_1e54a0_0 * sub_1e54a0(st_1e54a0_0 *a0)
{
    st_1e54a0_0 *v0;  // x9
    st_1e54a0_0 *v1;  // x8

    if (!a0)
        return a0;
    v0 = a0->field_0;
    if (!v0 || !a0->field_20)
        return 0;
    v1 = a0->field_28;
    if (!v1)
    {
        return 0;
    }
    else if (!g_f0d198)
    {
        return 0;
    }
    else if (g_f0d198->field_60 && g_f0d198->field_60->field_580 == v1 && v0->field_50 == a0->field_20 && v0->field_8 && v0->field_8->field_18)
    {
        return v0->field_8->field_18->field_30 == v1;
    }
    return 0;
}
