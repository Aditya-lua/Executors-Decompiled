/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa561e0..0xa56208 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a561e0_0 {
    char padding_0[376];
    unsigned long long field_178;
} st_a561e0_0;

typedef struct st_a561e0_1 {
    char padding_0[32];
    struct st_a561e0_0 *field_20;
} st_a561e0_1;


st_a561e0_1 * sub_a561e0(st_a561e0_1 *a0, unsigned int a1, int a2)
{
    st_a561e0_1 *v0;  // w0

    v0 = (st_a561e0_1 *)0;
    if (a0 && a1 == 3)
    {
        a0->field_20->field_178 = a2;
        v0 = (st_a561e0_1 *)1;
    }
    return v0;
}
