/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1befa0..0x1befe4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1befa0_0 {
    char padding_0[32];
    long long field_20;
} st_1befa0_0;


st_1befa0_0 * sub_1befa0(st_1befa0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_1a42cc(&a0->padding_0[16], a0->field_20);
    sub_2219c(&a0->padding_0[16], 0);
    sub_1c1dec(a0, 0);
    return a0;
}
