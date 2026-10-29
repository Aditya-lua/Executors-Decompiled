/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60194..0x6020c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60194_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_60194_0;

typedef struct st_60194_1 {
    char padding_0[2104];
    struct st_60194_0 *field_838;
} st_60194_1;

extern long long g_c7c2eb;
extern st_60194_0 g_f011d0;

st_60194_0 * sub_60194(st_60194_1 *a0)
{
    st_60194_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_838;
    if (a0->field_838 == &g_f011d0.padding_0[0])
    {
        sub_5bb44();
        v2 = a0->field_838;
        if (a0->field_838 == &g_f011d0.padding_0[0])
        {
            sub_5bb24(a0, &g_c7c2eb);
            v2 = a0->field_838;
        }
    }
    a0->field_838 = v2->field_8;
    sub_59d80();
    return v2;
}
