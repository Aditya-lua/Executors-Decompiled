/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68ecc..0xc68ef8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68ecc_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c68ecc_0;

typedef struct st_c68ecc_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_c68ecc_0 *field_28;
} st_c68ecc_1;


st_c68ecc_0 * sub_c68ecc(st_c68ecc_1 *a0, st_c68ecc_0 *a1)
{
    st_c68ecc_0 *v0;  // w0

    v0 = (st_c68ecc_0 *)0;
    if (a1 && a0->field_28)
    {
        *(unsigned long long *)&a1->padding_0[0] = a0->field_18 - a0->field_28->field_18;
        v0 = (st_c68ecc_0 *)1;
    }
    return v0;
}
