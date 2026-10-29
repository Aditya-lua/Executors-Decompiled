/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66530..0xa66604 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66530_0 {
    struct st_a66530_0 *field_0;
    struct st_a66530_0 *field_8;
    struct st_a66530_0 *field_10;
    char padding_18[44];
    unsigned int field_44;
    uint128_t field_48;
} st_a66530_0;

extern st_a66530_0 g_a66604;
extern char g_1000358;

st_a66530_0 * sub_a66530(st_a66530_0 *a0, st_a66530_0 *a1)
{
    st_a66530_0 *v2;  // x19
    st_a66530_0 *v3;  // x0
    st_a66530_0 *v4;  // x8
    st_a66530_0 *v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(104, "crypto/lhash/lhash.c", 67);
    if (!v2)
        return v2;
    v3 = sub_a6bffc(128, "crypto/lhash/lhash.c", 69);
    v2->field_0 = v3;
    if (!v3)
    {
        sub_a6c2e4();
        sub_a6c2e4(v2, "crypto/lhash/lhash.c", 82);
        return 0;
    }
    v4 = &g_1000358;
    if (a1)
        v4 = a1;
    v5 = &g_a66604.field_0;
    if (a0)
        v5 = a0;
    v2->field_8 = v4;
    v2->field_10 = v5;
    *(double *)&v2->padding_18[32] = 3.39519326594e-313;
    v2->field_44 = 8;
    *(uint128_t *)&(&v2->field_44)[1] = 0x1000000000000000200;
    return v2;
}
